"use strict";
var nome = "";
var btnSaluto, txSaluto, divRis, btnConv, pDollari, txtEuro, bb;
//nome = prompt("Dammi il nome:", "Alex");
//alert("Ciao " + nome);

window.onload = function () {
	//alert(document.getElementById("saluto").innerHTML);
	//document.getElementById("saluto").innerHTML = "Buongiorno " + nome;
	bb = document.getElementById("bb");
	bb.onclick = function() {
		alert("Click!");
	}
	txSaluto = document.getElementById("saluto");
	btnSaluto = document.getElementById("btnSaluto");
	btnConv = document.getElementById("btnConv");
	divRis = document.getElementById("ris");
	btnSaluto.value = "Fai click per salutare";
	txtEuro = document.getElementById("txtEuro");
	pDollari = document.getElementById("pDollari");
	btnSaluto.onclick = function() {
		saluta();
	};
	//btnSaluto.onclick = saluta;
	btnConv.onclick = convertiInDollari;
};

function saluta() {
	//alert("Hai fatto click: ciao");
	//txSaluto.innerHTML = "Buongiorno";
	var html = txSaluto.innerHTML;
	divRis.innerHTML = html;
};

function convertiInDollari() {
	//var html = txSaluto.innerHTML;
	//divRis.innerHTML = html;
	var euro = txtEuro.value;
	pDollari.innerHTML = "Dollari: " + euro * 1.5;
};

