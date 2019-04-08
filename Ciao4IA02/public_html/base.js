// Esempio ERRATO!
// accesso al DOM quando non è ancora stato creato

"use strict";
var nome;
nome = prompt("Nome:", "Pippo");
//alert("Ciao " + nome);
var saluto = document.getElementById("saluto");

//NB: lavorando MALE!!!!
saluto.innerHTML = "Ciao " + nome;