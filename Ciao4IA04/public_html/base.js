//Accesso corretto al DOM
//dopo il "caricamento della pagina" (onload)

"use strict";
var saluto, btnSaluto, salutoGlobale;

//la gestione dell'evento con la function anonima
//mi permette l'eventuala passaggio di parametri
//window.onload = function () {
//	prova();
//};

//gestione dell'evento come proprietà dell'oggetto window
window.onload = init;

function init() {
	var nome;
	nome = prompt("Nome:", "Pippo");
	saluto = document.getElementById("saluto");
	btnSaluto = document.getElementById("btnSaluto");
	salutoGlobale = document.getElementById("salutoGlobale");
	
	btnSaluto.onclick = function() {
		gestSaluto(nome);
	};

	//NB: lavorando MALE!!!!
	saluto.innerHTML = "Ciao " + nome;
};

function gestSaluto(nome) {
	salutoGlobale.innerHTML = "saluti a tutti da " + nome;
};