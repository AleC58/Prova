//Accesso corretto al DOM
//dopo il "caricamento della pagina" (onload)

"use strict";
var saluto, btnSaluto, btnSalutoReplace, salutoGlobale;

//la gestione dell'evento con la function anonima
//mi permette l'eventuala passaggio di parametri
//window.onload = function () {
//	prova();
//};

//gestione dell'evento come propriet� dell'oggetto window
window.onload = init;

function init() {
	var nome;
	nome = prompt("Nome:", "Pippo");
	saluto = document.getElementById("saluto");
	btnSaluto = document.getElementById("btnSaluto");
	btnSalutoReplace = document.getElementById("btnSalutoReplace");
	salutoGlobale = document.getElementById("salutoGlobale");

	btnSaluto.onclick = function() {
		gestSaluto(nome); //2° par. mancante -> false
	};
	btnSalutoReplace.onclick = function() {
		gestSaluto(nome, true);
	};

	//NB: lavorando MALE!!!!
	saluto.innerHTML = "Ciao " + nome;
};

function gestSaluto(nome, replace) {
	//NB: lavorando MALE!!!!
	//salutoGlobale.innerHTML = "saluti a tutti da " + nome;

	//l'equivalente lavorando bene (con i metodi di manipolazione del DOM)
	//NB: NON elimina il sottoalbero, ma solo i nodi di primo livello!
	var p = document.createElement("p");
	var txtNode = document.createTextNode("saluti a tutti da " + nome);
	p.appendChild(txtNode);
	if (replace) {
		while(salutoGlobale.firstChild) {
			 salutoGlobale.removeChild(salutoGlobale.firstChild);
		}
	}
	salutoGlobale.appendChild(p);
};