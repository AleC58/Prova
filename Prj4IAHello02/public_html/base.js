"use strict";
/*
 Interazione con il DOM
 Evento window.onload
 Gestione eventi su oggetti (click su button)
 Scrittura sulla pagina
 */

//alert ("Ciao");
var saluto;
var btnBuonanotte;
var divBuonanotte;

//window.onload = saluta;
window.onload = function() {
	saluto = document.getElementById("saluto");
	btnBuonanotte = document.getElementById("btnBuonanotte");
	divBuonanotte = document.getElementById("divBuonanotte");
	
	btnBuonanotte.onclick = dimmiBuonanotte;
	saluta();
};

function saluta() {
	saluto.innerHTML = "Ciao a tutti";
};
function dimmiBuonanotte() {
	divBuonanotte.innerHTML = "Buonanotte a tutti";
};