"use strict";
var frm, cboGiorno, btnInvia, risposta, ris;

$(document).ready(init);

function init() {
	risposta = $("#risposta");
	frm = $("#frm");
	risposta.html("Inizio");

	btnInvia = $("#btnInvia");
	btnInvia.click(getRisposta);
	//oppure:
	//btnInvia.on("click", getRisposta);
	//o ancora, con la function anonima posso passare dei parametri:
//	$("#btnInvia").click(function () {
//		getRisposta();
//	});
}

function getRisposta() {
	var datiForm = frm.serializeArray();
	var giorno = datiForm[0].value;
	risposta.html("Inizio di getRisposta");

	$.ajax({
		url: "http://localhost:8081/cal/" + giorno,
		type: "GET",
		//data: {},
		//dataType: "json",
		contentType: "application/json",
		success: function (result) {
			ris = JSON.stringify(result);
			//alert("Ris: " + ris);
			$("#risposta").text(ris);
			$("#serviceId").text("Service id: " + result[0].service_id);
			$("#startDate").text("Start date: " + result[0].start_date);
			//alert("Ris1: " + result);
			//alert("Ris2: " + JSON.stringify(result));
		},
		error: function (richiesta, stato, errori) {
			risposta.html("<strong>Chiamata fallita:</strong>" + stato + " " + errori);
			alert("Ajax call error:\nStato: " + stato + "\nErrore: " + errori);
		},
		complete: function (XMLHTTPRequest, settings) {
			//$("#risposta").text("qq");
			//alert("Complete" + ris);
		}
	});
	//alert(ris);
	//alert("Dopo chiamata Ajax - datiForm[0].value: " + datiForm[0].value);
}