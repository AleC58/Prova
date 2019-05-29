<!-- direttive -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% // scripting (frammenti di codice Java)
    //recupera i parametri passati dal client
    String userName = request.getParameter("userName");

    //out.print manda al client i risultati dell'elaborazione
    if (utenteConvalidato(userName)) {
        out.print("Convalidato: " + userName);
    } else {
        out.print("Utente sconosciuto: " + userName);
    };

%>

<%! // dichiarazioni (di attributi o metodi)

    public boolean utenteConvalidato(String userName) {
        String utenteRegistrato = "qq";
        return (userName.equals(utenteRegistrato));
    };
%>