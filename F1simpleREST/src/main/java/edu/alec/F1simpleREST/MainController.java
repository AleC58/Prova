package edu.alec.F1simpleREST;

import edu.alec.F1simpleREST.model.F1DAO;
import edu.alec.F1simpleREST.model.Costruttore;
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
	@RequestMapping("/")
	public String index() {
		return "Hello from F1simpleREST!";
	}

	@RequestMapping(value = "/costruttori", produces = {"application/JSON"})
	@ResponseBody
	public List<Costruttore> getCal() {
		return F1DAO. .getAllCalendar();
	}

	@RequestMapping(value = "/cal/{id}", method = GET, produces = {"application/JSON"})
	@ResponseBody
	public List<Calendar> getAllCalendarForADay(@PathVariable int id) {
		return actvdao.getAllCalendarForADay(id);
	}

}
