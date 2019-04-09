//Come versione precedente, ma in jQuery

"use strict";
var saluto, btnSaluto, btnSalutoReplace, salutoGlobale;

$(document).ready(function(){
	var nome;
	nome = prompt("Nome:", "Pippo");
	saluto = $("#saluto");
	btnSaluto = $("#btnSaluto");
	btnSalutoReplace = $("#btnSalutoReplace");
	salutoGlobale = $("#salutoGlobale");

	btnSaluto.click(function() {
		gestSaluto(nome); //2° par. mancante -> false -> append
	});
	btnSalutoReplace.click(function() {
		gestSaluto(nome, true); // true -> replace
	});

	saluto.text("Ciao " + nome);
});

function gestSaluto(nome, replace) {
	if (replace) {
		salutoGlobale.html("<p>saluti a tutti da " + nome + "</p>");
	} else {
		salutoGlobale.append("<p>saluti a tutti da " + nome + "</p>");
	}
};