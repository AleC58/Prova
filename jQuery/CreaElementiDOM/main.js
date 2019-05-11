"use strict";

var txtTestoDaTextBox, risTestoDaTextBoxWithKeyup, risTestoDaTextBoxWithBlur;
var txtArrayJsonPerLista, btnListaDaJson, risListaDaJson;
var cbo, risCboValue, risCboText;
var alpinisti = [
	{"id": "1", "nome":"Paul", "cognome":"Preuss", dataNascita:"19 agosto 1886", statoNascita:"Austria"},
	{"id": "2", "nome":"Hans", "cognome":"Dulfer", dataNascita:" 23 maggio 1892", statoNascita:"Germania"},
	{"id": "3", "nome":"George Leigh", "cognome":"Mallory", dataNascita:"18 giugno 1886", statoNascita:"Inghilterra"},
	{"id": "4", "nome":"Emilio", "cognome":"Comici", dataNascita:"21 febbraio 1901", statoNascita:"Italia"},
	{"id": "5", "nome":"Giusto", "cognome":"Gervasutti", dataNascita:"17 aprile 1909", statoNascita:"Italia"},
	{"id": "6", "nome":"Hermann", "cognome":"Buhl", dataNascita:"21 settembre 1924;", statoNascita:"Austria"},
	{"id": "7", "nome":"Walter", "cognome":"Bonatti", dataNascita:"22 giugno 1930", statoNascita:"Italia"},
	{"id": "8", "nome":"Reinhold", "cognome":"Messner", dataNascita:"17 settembre 1944", statoNascita:"Italia"},
	{"id": "9", "nome":"Hans", "cognome":"Kammerlander", dataNascita:"06 dicembre 1956", statoNascita:"Italia"}
];

$(document).ready(function () {
	txtTestoDaTextBox = $("#txtTestoDaTextBox");
	risTestoDaTextBoxWithKeyup = $("#risTestoDaTextBoxWithKeyup");
	risTestoDaTextBoxWithBlur = $("#risTestoDaTextBoxWithBlur");

	txtArrayJsonPerLista = $("#txtArrayJsonPerLista");
	btnListaDaJson = $("#btnListaDaJson");
	risListaDaJson = $("#risListaDaJson");
	txtArrayJsonPerLista.val(JSON.stringify(alpinisti)); // stringify -> da json a stringa

	cbo = $("#cbo");
	risCboValue = $("#risCboValue");
	risCboText = $("#risCboText");
	creaOPTIONSdaJson(cbo, "id", "cognome", alpinisti);

	//eventi
	txtTestoDaTextBox.on("keyup", function() { // questa forma permette eventi multipli, separandoli con uno spazio
		ecoTasti();
	});
	txtTestoDaTextBox.focus(); // come autofocus di HTML5 (sende attivo il controllo, che DEVE essere visibile)
	txtTestoDaTextBox.click(selectTesto); // quando il controllo diventa attivo (ottiene il focus) ...
	txtTestoDaTextBox.blur(copiaTesto); // quando il controllo perde il focus ...

	btnListaDaJson.click(creaListaDaJson);

	cbo.change(mostraDatiVoceSelezionata);
});

function ecoTasti() {
	$("#risTestoDaTextBoxWithKeyup").text(txtTestoDaTextBox.val());
};

function selectTesto() {
	$(this).select();
};

function copiaTesto() {
	$("#risTestoDaTextBoxWithBlur").text(txtTestoDaTextBox.val());
};

function creaListaDaJson() {
	$("#risListaDaJson").empty();
	var jsonArray = JSON.parse(txtArrayJsonPerLista.val()); // da stringa a json
	//var ul = creaULdaJson(jsonArray);
	var campi = ["nome", "cognome"];
	var ul = creaULdaJsonConFiltro(campi, jsonArray);
	$("#risListaDaJson").append(ul);
};

function creaULdaJson(jsonArray) {
	var ul = $("<ul>");
	var valori;
	for (var j = 0, len = jsonArray.length; j < len; j++) {
		valori = JSON.stringify(jsonArray[j]);
		ul.append("<li>" + valori + "</li>");
	}
	return ul;
};

function creaULdaJsonConFiltro(campi, jsonArray) {
	var ul = $("<ul>");
	var valori;
	$.each(jsonArray, function() { // per ogni oggetto json dell'array
		valori = "";
		$.each(this, function(prop, val) { // per ogni proprietà dell'oggetto
			if (campi.indexOf(prop) > -1) { // se la proprietà è presente nell'elenco dei campi da selezionare
				valori += val + ", "
			};
		});
		valori = valori.substring(0, valori.length - 2); // toglie ", " finale
		ul.append("<li>" + valori + "</li>");
	});
	return ul;
};

function creaOPTIONSdaJson(objSelect, nomeCampoValue, nomeCampoText, jsonArray) {
	var value, text, opt;
	$.each(jsonArray, function() { // per ogni oggetto json dell'array
		$.each(this, function(prop, val) { // per ogni proprietà dell'oggetto
			if (nomeCampoValue.indexOf(prop) > -1) { // se la proprietà è presente nell'elenco dei campi da selezionare
				value =  val;
			};
			if (nomeCampoText.indexOf(prop) > -1) { // se la proprietà è presente nell'elenco dei campi da selezionare
				text = val;
			};
		});
		opt = '<option value="' + value + '">' + text + '</option>';
		objSelect.append(opt);
	});
};

function mostraDatiVoceSelezionata(objSelect) {
	var optionSelected = $(this).find("option:selected");
	risCboValue.text(optionSelected.val());
	risCboText.text(optionSelected.text());
};



/*
	$(document).ready(function () {
	btnTestServizio = $("#btnTestServizio");
	risTestServizio = $("#risTestServizio");
	btnElencoCostruttori = $("#btnElencoCostruttori");
	risElencoCostruttori = $("#risElencoCostruttori");
	btnTabellaPiloti = $("#btnTabellaPiloti");
	risTabellaPiloti = $("#risTabellaPiloti");
	cboPilotiDelTeam = $("#cboPilotiDelTeam");
	risPilotiDelTeam = $("#risPilotiDelTeam");
	btnTestServizio.click(testServizio);
	btnElencoCostruttori.click(creaElencoCostruttori);
	btnTabellaPiloti.click(creaTabellaPiloti);
	cboPilotiDelTeam.click(creaPilotiDelTeam);
});

function testServizio() {
	$.ajax({
		url: "http://192.168.4.1:8088/",
		type: "GET",
		//contentType: "application/json", //formato dei dati inviati al server
		dataType: "text", //formato dei dati ricevuti dal server
		success: function (result) {
			$("#risTestServizio").text(result);
		},
		error: function (richiesta, stato, errori) {
			$("#risTestServizio").text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

function creaElencoCostruttori() {
	$.ajax({
		url: "http://192.168.4.1:8088/costruttori",
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
			$("#risElencoCostruttori").append(lista);
		},
		error: function (richiesta, stato, errori) {
			$("#risElencoCostruttori").text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

function creaTabellaPiloti() {
	$.ajax({
		url: "http://192.168.4.1:8088/piloti",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			var ris = JSON.stringify(result);
			$("#risTabellaPiloti").text(ris);
		},
		error: function (richiesta, stato, errori) {
			$("#risTabellaPiloti").text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

function creaPilotiDelTeam() {
	$.ajax({
		url: "http://192.168.4.1:8088/piloti",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			var ris = JSON.stringify(result);
			$("#risPilotiDelTeam").text(ris);
		},
		error: function (richiesta, stato, errori) {
			$("#risPilotiDelTeam").text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
};

*/