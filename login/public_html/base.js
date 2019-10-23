"use strict"

var username;
var password;
var btnLeggiDati;
var ris;

window.onload = function() {
	username = document.getElementById("username");
	password = document.getElementById("password");
	btnLeggiDati = document.getElementById("btnLeggiDati");
	ris = document.getElementById("ris");
	
	btnLeggiDati.onclick = leggiDati;
}

function leggiDati() {
	var valUsername = username.value;
	var valPassword = password.value;
	var strRis = "Il nome utente è " + valUsername + " e la password è " + valPassword;
	ris.innerHTML = strRis;
}