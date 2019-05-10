"use strict";

var btnTestServizio, risTestServizio, btnElencoCostruttori, risElencoCostruttori;
var btnTabellaPiloti, risTabellaPiloti, cboPilotiDelTeam, risPilotiDelTeam;

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
}
;

function creaElencoCostruttori() {
	$.ajax({
		url: "http://192.168.4.1:8088/costruttori",
		type: "GET",
		dataType: "json", //formato dei dati ricevuti dal server
		success: function (result) {
			//var ris = JSON.stringify(result);
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
}
;

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
			$("#risElencoCostruttori").text("ERRORE! - Stato: " + stato + "  - Errore: " + errori);
		}
	});
}
;

function creaPilotiDelTeam() {
	$.ajax({
		url: "http://192.168.4.1:8081/cal/1",
		type: "GET",
		contentType: "application/json",
		success: function (result) {
			var ris = JSON.stringify(result);
			$("#risposta").text(ris);
			$("#serviceId").text("Service ID: " + result[0].service_id)
		},
		error: function (richiesta, stato, errori) {
			alert("ERRORE!\nStato: " + stato + "\nErrore: " + errori);
		}
	});
};

