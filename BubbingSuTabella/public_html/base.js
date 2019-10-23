"use strict";

var tblTris;
var ris;

window.onload = function() {
	tblTris = document.getElementById("tblTris");
	ris = document.getElementById("ris");
	
	tblTris.onclick = mostraInfo;
};

function mostraInfo(e) {
var cella;
var riga;
var col;
var contCella;
var msg;
	e = (window.event) ? window.event : e;
	cella = (e.srcElement) ? e.srcElement : e.target;
	(e.stopPropagation) ? e.stopPropagation() : e.cancelBubble = true;
	if (cella.tagName != "TD") {return;}
	riga = cella.parentNode.rowIndex;
	col = cella.cellIndex;
	contCella = cella.innerHTML;
	//alert("QQ");
	msg = "E' stata cliccata la cella:<br> riga: " + riga +" col: " + col + "<br> contenuto: " + contCella;
	ris.innerHTML = msg;
};