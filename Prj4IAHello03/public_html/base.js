"use strict";
/*
 Interazione con il DOM
 Evento window.onload
 Gestione eventi su oggetti (click su button)
 Scrittura sulla pagina
 Lettura dati da input text
 */

var txtA;
var txtB;

//window.onload = saluta;
window.onload = function() {
	txtA = document.getElementById("txtA");
	txtB = document.getElementById("txtB");
	risultato = document.getElementById("risultato");
	
	btnRisolviEq.onclick = risolviEq;
};

function risolviEq() {
	a = parseInt(txtA.value);
	b = parseInt(txtB.value);
	risultato.innerHTML = risolviEqPrimoGrado(a, b);
};

function risolviEqPrimoGrado(a, b) {
	return - b / a;
};
