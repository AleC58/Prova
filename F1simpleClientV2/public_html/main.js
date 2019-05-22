"use strict";

var host = "192.168.4.1";
var porta = "8088";
var urlBase = "http://" + host + ":" + porta;
var btnTestServizio, risTestServizio; // 1
var btnElencoGrezzoCostruttori, risElencoGrezzoCostruttori; // 2
var btnElencoCostruttori, risElencoCostruttori; // 3
var btnTabellaPiloti, risTabellaPiloti; // 4
var txtPilotiDelTeam, btnPilotiDelTeam, risPilotiDelTeam;
var cboPilotiDelTeam, risPilotiDelTeamConSelect;

// ******** MAIN
$(document).ready(function () {
	btnTestServizio = $("#btnTestServizio");
	risTestServizio = $("#risTestServizio");
	btnElencoGrezzoCostruttori = $("#btnElencoGrezzoCostruttori");
	risElencoGrezzoCostruttori = $("#risElencoGrezzoCostruttori");
	btnElencoCostruttori = $("#btnElencoCostruttori");
	risElencoCostruttori = $("#risElencoCostruttori");
	btnTabellaPiloti = $("#btnTabellaPiloti");
	risTabellaPiloti = $("#risTabellaPiloti");
	txtPilotiDelTeam = $("#txtPilotiDelTeam");
	btnPilotiDelTeam = $("#btnPilotiDelTeam");
	risPilotiDelTeam = $("#risPilotiDelTeam");
	cboPilotiDelTeam = $("#cboPilotiDelTeam");
	risPilotiDelTeamConSelect = $("#risPilotiDelTeamConSelect");

	creaOPTIONSdaAjaxSemplificata();

	//gestori eventi
	btnTestServizio.click(testServizio);
	btnElencoGrezzoCostruttori.click(creaElencoGrezzoCostruttori);
	btnElencoCostruttori.click(creaElencoCostruttori);
	btnTabellaPiloti.click(creaTabellaPiloti);
	btnPilotiDelTeam.click(creaTabellaPilotiDelTeamConTextbox);
	cboPilotiDelTeam.change(creaTabellaPilotiDelTeamConSelect);
});

// ******** GESTORI EVENTI
// gestita con function "globale" (faiRichiestaAjax)
// e function di supporto (gestTestServizioOK e gestTestServizioError)
function testServizio() { // 1
	var url = "/";
	faiRichiestaAjax(url, "text", gestTestServizioOK, gestTestServizioError);
}

function gestTestServizioOK(result) { // 1
	risTestServizio.text(result);
}

function gestTestServizioError(result) { // 1
	risTestServizio.text(result);
}

// gestita con function "globale" (faiRichiestaAjax)
// e function anonime di callback
function creaElencoGrezzoCostruttori() { // 2
	var url = "/costruttori";
	faiRichiestaAjax(url, "json",
		function (result) { //richiesta OK
			risElencoGrezzoCostruttori.empty();
			risElencoGrezzoCostruttori.append(JSON.stringify(result));
		},
		function (result) { //richiesta errata
			risElencoGrezzoCostruttori.text("QQ " + result);
		}
	);
}

// gestita in modo base
function creaElencoCostruttori() { // 3
	$.ajax({
		url: urlBase + "/costruttori",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			var dati, nomeCostruttore, nazioneCostruttore;
			var lista = $("<ul>");
			for (var j = 0; j < result.length; j++) {
				nomeCostruttore = result[j].nomeCostruttore;
				nazioneCostruttore = result[j].nazioneCostruttore;
				dati = nomeCostruttore + " - " + nazioneCostruttore;
				lista.append("<li>" + dati + "</li>");
			}
			risElencoCostruttori.empty();
			risElencoCostruttori.append(lista);
		},
		error: function (richiesta, stato, errori) {
			risElencoCostruttori.text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
}

function creaTabellaPiloti() { // 4
	$.ajax({
		url: urlBase + "/piloti",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			risTabellaPiloti.empty();
			risTabellaPiloti.append(creaTABLEdaJson(result));
		},
		error: function (richiesta, stato, errori) {
			risTabellaPiloti.text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
}

function creaTabellaPilotiDelTeamConTextbox() { // 5
	var anno = "2018";
	var idCostr = txtPilotiDelTeam.val();
	$.ajax({
		//url: "/campionati/{anno}/pilotiDeiTeams/{idCostruttore}",
		url: urlBase + "/campionati/" + anno + "/pilotiDeiTeams/" + idCostr,
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			risPilotiDelTeam.empty();
			risPilotiDelTeam.append(creaTABLEdaJson(result));
		},
		error: function (richiesta, stato, errori) {
			risPilotiDelTeam.text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
}

// $.ajax con nuovo standard jQuery 3.0
// -> success ed error sono deprecate
function creaTabellaPilotiDelTeamConSelect() { // 6
	var anno = "2018";
	var optionSelected = cboPilotiDelTeam.find("option:selected");
	var idCostr = optionSelected.val();
	$.ajax({
		//url: "/campionati/{anno}/pilotiDeiTeams/{idCostruttore}",
		url: urlBase + "/campionatix/" + anno + "/pilotiDeiTeams/" + idCostr,
		type: "GET",
		dataType: "json"}) //formato dei dati ricevuti dal server
	.done(function (result) {
		risPilotiDelTeamConSelect.empty();
		risPilotiDelTeamConSelect.append(creaTABLEdaJson(result));
	})
	.fail(function (jqXHR, textStatus , errorThrown) {
		console.log(JSON.stringify(jqXHR));
		risPilotiDelTeamConSelect.text("ERRORE! - " + jqXHR.status + "  - Stato: " + textStatus  + "  - Errore: " + errorThrown);
	});
}

// ******** UTILITY
function faiRichiestaAjax(urlAPI, tipoRisposta, funzioneOK, funzioneERROR) {
	$.ajax({
		url: urlBase + urlAPI,
		type: "GET",
		//contentType: "application/json", //formato dei dati inviati al server
		dataType: tipoRisposta, //formato dei dati ricevuti dal server
		success: function (result) {
			funzioneOK(result);
		},
		error: function (xhr, stato, errori) {
			console.log(JSON.stringify(xhr));
			funzioneERROR("ERRORE! - " + xhr.status + "  - Stato: " + stato + "  - Errore: " + xhr.responseText);
		}
	});
}

function creaTABLEdaJson(jsonArray) {
	var tabella = $("<table>");
	tabella.css("border", "2px solid black");
	tabella.css("border-collapse", "collapse");
	var riga, cella;
	$.each(jsonArray, function () { // per ogni oggetto json dell'array creo una riga
		riga = $("<tr>");
		$.each(this, function (prop, val) { // per ogni proprietà dell'oggetto corrente creo una cella
			cella = $("<td>").text(val); // o $("<td>" + val + "</td>")
			cella.css("border", "1px solid black");
			cella.css("padding", "2px 4px");
			riga.append(cella);
		});
		tabella.append(riga);
	});
	return tabella;
}

function creaOPTIONSdaAjaxSemplificata() {
	$.ajax({
		url: urlBase + "/costruttori",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			let idCostruttore, nomeCostruttore;
			cboPilotiDelTeam.empty(); // cancella le eventuali <option> presenti
			cboPilotiDelTeam.append('<option selected="true" disabled>-- Selezionare un elemento --</option>');
			cboPilotiDelTeam.prop('selectedIndex', 0);
			$.each(result, function () { // per ogni oggetto json dell'array
				idCostruttore = this.idCostruttore;
				nomeCostruttore = this.nomeCostruttore;
				//opt = '<option value="' + idCostruttore + '">' + nomeCostruttore + '</option>';
				//objSelect.append(opt);
				cboPilotiDelTeam.append($('<option>').attr('value', idCostruttore).text(nomeCostruttore));
			});
		},
		error: function (richiesta, stato, errori) {
			let msgErr = "ERRORE! - Stato: " + stato + "  - Errore: " + errori;
			cboPilotiDelTeam.empty(); // cancella le eventuali <option> presenti
			cboPilotiDelTeam.append('<option selected="true" disabled>' + msgErr + '</option>');
			cboPilotiDelTeam.prop('selectedIndex', 0);
			//risZZZ.text(msgErr);
		}
	});
}

function creaOPTIONSdaJson(objSelect, nomeCampoValue, nomeCampoText, jsonArray) {
	var value, text;
	objSelect.empty(); // cancella le eventuali <option> presenti
	objSelect.append('<option selected="true" disabled>-- Selezionare un elemento --</option>');
	objSelect.prop('selectedIndex', 0);
	$.each(jsonArray, function () { // per ogni oggetto json dell'array
		$.each(this, function (prop, val) { // per ogni propriet� dell'oggetto
			if (nomeCampoValue.indexOf(prop) > -1) { // se la propriet� � presente nell'elenco dei campi da selezionare
				value = val;
			}
			if (nomeCampoText.indexOf(prop) > -1) { // se la propriet� � presente nell'elenco dei campi da selezionare
				text = val;
			}
		});
		//opt = '<option value="' + value + '">' + text + '</option>';
		//objSelect.append(opt);
		objSelect.append($('<option>').attr('value', value).text(text));
	});
}

