"use strict";

var btnInvia;

$(document).ready(function () {
	btnInvia = $("#btnInvia");
	btnInvia.click(gestRisposta);
});

function gestRisposta() {
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
}
;