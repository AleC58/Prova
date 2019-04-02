package edu.zucc.ACTV5IASQL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ControllerProva {
	@Autowired
	private ACTVDAO actvdao;
	
	@RequestMapping("/")
	public String index() {
		return "Hello!";
	}

	@RequestMapping(value = "/cal", produces = {"application/JSON"})
	@ResponseBody
	public List<Calendar> getCal() {
		return actvdao.getAllCalendar();
	}

	@RequestMapping(value = "/cal/{id}",  method = GET, produces = {"application/JSON"})
	@ResponseBody
	public List<Calendar> getAllCalendarForADay(@PathVariable int id) {
		return actvdao.getAllCalendarForADay(id);
	}
}
