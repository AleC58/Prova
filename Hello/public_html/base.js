"use strict";
var classe;
do {
	classe = prompt("Classe:", "3");
	datoOK = !isNaN(classe);
	if (!datoOK) {
		alert("E' richiesto un valore numerico");
	}
} while (!datooK);
//classe = classe + 1 + "IA"; //31IA
//classe = 1 + classe + "IA"; //13IA
//classe = classe + 1; //31
//classe = 1 + classe; //13
classe++; // 4!
alert("Ciao a tutti dalla " + classe);