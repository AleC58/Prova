"use strict";

var host = "192.168.4.1";
var porta = "8088";
var urlBase = "http://" + host + ":" + porta;
var btnTestServizio, risTestServizio; // 1
var btnElencoGrezzoCostruttori, risElencoGrezzoCostruttori; // 2
var btnElencoCostruttori, risElencoCostruttori; // 3
var btnTabellaPiloti, risTabellaPiloti; // 4
var txtPilotiDelTeam, btnPilotiDelTeam, risPilotiDelTeam;
var cboPilotiDelTeam, risPilotiDelTeam;

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
	risPilotiDelTeam = $("#risPilotiDelTeam");

	//gestori eventi
	btnTestServizio.click(testServizio);
	btnElencoGrezzoCostruttori.click(creaElencoGrezzoCostruttori);
	btnElencoCostruttori.click(creaElencoCostruttori);
	btnTabellaPiloti.click(creaTabellaPiloti);
	btnPilotiDelTeam.click(creaTabellaPilotiDelTeamConTextbox);
	//cboPilotiDelTeam.click(creaPilotiDelTeam);
});

// ******** GESTORI EVENTI
function testServizio() { // 1
	$.ajax({
		url: urlBase + "/",
		type: "GET",
		//contentType: "application/json", //formato dei dati inviati al server
		dataType: "text", //formato dei dati ricevuti dal server
		success: function (result) {
			risTestServizio.text(result);
		},
		error: function (richiesta, stato, errori) {
			risTestServizio.text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

function creaElencoGrezzoCostruttori() { // 2
	$.ajax({
		url: urlBase + "/costruttori",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			risElencoGrezzoCostruttori.empty();
			risElencoGrezzoCostruttori.append(JSON.stringify(result));
		},
		error: function (richiesta, stato, errori) {
			risElencoCostruttori.text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

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
};

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
};

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
};

// ******** UTILITY
function creaTABLEdaJson(jsonArray) {
	var tabella = $("<table>");
	tabella.css("border", "2px solid black");
	tabella.css("border-collapse", "collapse");
	var riga, cella;
	$.each(jsonArray, function() { // per ogni oggetto json dell'array creo una riga
		riga = $("<tr>");
		$.each(this, function(prop, val) { // per ogni proprietà dell'oggetto corrente creo una cella
			cella = $("<td>").text(val); // o $("<td>" + val + "</td>")
			cella.css("border", "1px solid black");
			cella.css("padding", "2px 4px");
			riga.append(cella);
		});
		tabella.append(riga);
	});
	return tabella;
};
