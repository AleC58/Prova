package edu.zucc.ACTV5IASQL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 */
@RestController
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
	
}
