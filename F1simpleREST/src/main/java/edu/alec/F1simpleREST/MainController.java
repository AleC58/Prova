package edu.alec.F1simpleREST;

import edu.alec.F1simpleREST.model.Campionato;
import edu.alec.F1simpleREST.model.F1DAO;
import edu.alec.F1simpleREST.model.Costruttore;
import edu.alec.F1simpleREST.model.Pilota;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 */
@RestController
@CrossOrigin
public class MainController {
	F1DAO db = F1DAO.getInstance();
	@RequestMapping("/")
	public String index() {
		return "Hello from F1simpleREST!";
	}

	@RequestMapping(value = "/piloti", produces = {"application/JSON"})
	@ResponseBody
	public List<Pilota> getAllPiloti() {
		return db.getAllPiloti();
	}

	@RequestMapping(value = "/piloti/{id}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public Pilota getPilotaById(@PathVariable int id) {
		return db.getPilotaById(id);
	}

	@RequestMapping(value = "/costruttori", produces = {"application/JSON"})
	@ResponseBody
	public List<Costruttore> getAllCostruttori() {
		return db.getAllCostruttori();
	}

	@RequestMapping(value = "/costruttori/{id}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public Costruttore getCostruttoreById(@PathVariable int id) {
		return db.getCostruttoreById(id);
	}

	@RequestMapping(value = "/campionati", produces = {"application/JSON"})
	@ResponseBody
	public List<Campionato> getAllCampionati() {
		return null; //db.
	}

	@RequestMapping(value = "/campionati/{anno}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public List<Campionato> getCampionatoByAnno(@PathVariable int anno) {
		return db.getCampionatoByAnno(anno);
	}

	@RequestMapping(value = "/campionati/{anno}/pilotiDeiTeams/{idCostruttore}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public List<Pilota> getPilotiDelTeam(@PathVariable int anno, @PathVariable int idCostruttore) {
		return db.getPilotiDelTeam(anno, idCostruttore);
	}

}
