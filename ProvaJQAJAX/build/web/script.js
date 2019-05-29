$(document).ready(function() {
    $("#userName").on("keyup", aggiornaUser); 
});

function aggiornaUser() {
    //$("#ris").text("QQ");
    var userName = $("#userName").val();
    //alert(userName);
    $.ajax({
        url: "checkLogin.jsp",
        data: {
            userName: userName,
            pwd: "QQ"
        },
        type: "GET",
        dataType: "text"
    })

    .done(function (risposta) { // successo
        $("#ris").html(risposta);
    })

    .fail(function (xhr, status, errorThrown) {
        alert("Sorry, there was a problem!");
    });
}