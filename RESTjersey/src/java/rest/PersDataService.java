package rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex.cazziolato
 */
@Path("/persona")
public class PersDataService {

	//  Restituzione lista degli persone in formato testo.  
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Persona> getPeopleBrowser() {
		List<Persona> people = new ArrayList<Persona>();
		PersonaDAO PersDao = new PersonaDAO();
		people.addAll(PersDao.PersonaDAO());
		return people;
	}
	
	// restituzione lista in formato XML/JSON per chiamate applicative. 
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Persona> getPeople() {
		List<Persona> people = new ArrayList<>();
		PersonaDAO PersDao = new PersonaDAO();
		people.addAll(PersDao.PersonaDAO());
		return people;
	}

	// Questo metodo calcola ed espone l’età media delle persone   
	@GET
	@Path("etamedia")
	@Produces(MediaType.TEXT_PLAIN)
	public String getEta() {
		List<Persona> people = new ArrayList<>();
		PersonaDAO perdao = new PersonaDAO();
		people.addAll(perdao.PersonaDAO());
		int toteta = 0;
		for (Persona pers : people) {
			toteta += pers.getEta();
		}
		int etamedia = toteta / people.size();
		return Integer.toString(etamedia);
	}

	// Metodo di salvataggio di nuovi record a fronte di una chiamata POST
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void nuovaPersona(
			@FormParam("id") String id,
			@FormParam("nome") String nome,
			@FormParam("cognome") String cognome,
			@FormParam("eta") String eta,
			@FormParam("telefono") String telefono,
			@FormParam("email") String email,
			@Context HttpServletResponse servletResponse
	) throws IOException {
		Persona persona = new Persona(new Integer(id), nome, cognome, Integer.parseInt(eta), telefono, email);
		PersonaDAO perdao = new PersonaDAO();
		perdao.addPersona(persona);

	}
}
