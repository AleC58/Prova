"use strict";

var btnSubmitQueryString, btnSubmiArray, risQueryString, risArray;


$(document).ready(function () {
	btnSubmitQueryString = $("#btnSubmitQueryString");
	btnSubmiArray = $("#btnSubmiArray");
	risQueryString = $("#risQueryString");
	risArray = $("#risArray");

	//eventi
	btnSubmitQueryString.click(sumitComeQueryString);
	btnSubmiArray.click(sumitbtnSubmiComeArray);
});

function sumitComeQueryString() {
	$("#risQueryString").text($("#frm").serialize());
};

function sumitbtnSubmiComeArray() {
	$("#risArray").text($("#frm").serializeArray());
};

