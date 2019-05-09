package edu.alec.F1simpleREST;

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
	public List<Pilota> getAllPilotiOrdAlfab() {
		return db.getAllPilotiOrdAlfab();
	}

	@RequestMapping(value = "/costruttori", produces = {"application/JSON"})
	@ResponseBody
	public List<Costruttore> getAllCostruttoriOrdAlfab() {
		return db.getAllCostruttoriOrdAlfab();
	}

	@RequestMapping(value = "/costruttori/{id}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public Costruttore getCostruttoreById(@PathVariable int id) {
		//return actvdao.getAllCalendarForADay(id);
		return db.getCostruttoreById(id);
	}

}
