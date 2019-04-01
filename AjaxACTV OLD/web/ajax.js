"use strict";
var frm, cboGiorno, btnInvia, risposta;

$("document").ready(init);

function init() {
	risposta = $("#risposta");
	frm = $("#frm");

	btnInvia = $("#btnInvia");
	btnInvia.click(getRisposta);
	//oppure:
	//btnInvia.on("click", getRisposta);
	//o ancora, con la function anonima posso passare dei parametri:
//	$("#btnInvia").click(function(){
//		getRisposta();
//	});
}

function getRisposta() {
	var datiForm = frm.serializeArray();
	var giorno = datiForm[0].value;

	$.ajax({
		url: "http://localhost:8080/cal",
		type: "GET",
		data: {},
		dataType: "jsonp",
		contentType: "application/json",
		success: function (result) {
			risposta.html(result);
			alert("Ris: " + result);
		},
		error: function (richiesta, stato, errori) {
			risposta.html("<strong>Chiamata fallita:</strong>" + stato + " " + errori);
			alert("Stato: " + stato + "\nErrore: " + errori);
		},
		complete: function (XMLHTTPRequest, settings) {
			alert("Complete");
		}
	});

	alert(datiForm[0].value);
}