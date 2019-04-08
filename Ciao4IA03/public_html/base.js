//Accesso corretto al DOM
//dopo il "caricamento della pagina" (onload)

"use strict";
var saluto;

window.onload = function () {
	var nome;
	nome = prompt("Nome:", "Pippo");
	saluto = document.getElementById("saluto");

	//NB: lavorando MALE!!!!
	saluto.innerHTML = "Ciao " + nome;
};

alert("QQ");