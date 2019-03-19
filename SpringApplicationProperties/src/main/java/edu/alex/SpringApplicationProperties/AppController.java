package edu.alex.SpringApplicationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 * 
 * il file di default contenente le proprietà dell'applicazione
 * si deve chiamare application.properties
 * e deve essere salvato in src/main/resources
 */
@RestController
public class AppController {
	@Autowired
    private PropGlobali propGlobali;
	
	@Autowired
	private PropApp propApp;
	
	@Autowired
	private PropDB propDB;
	
	@RequestMapping("/")
	public String index() {
		return "Hello from SpringApplicationProperties application!";
	}

	@RequestMapping(value="/prop/globali", produces = {"application/JSON"})
	@ResponseBody
	public PropGlobali getPropGlobali() {
		return propGlobali;
	}

	@RequestMapping("/prop/app")
	public PropApp getPropApp() {
		return propApp;
	}

	@RequestMapping("/prop/app/{appProp}")
	public String getApplicationPropertiesAppProp(@PathVariable("appProp") String appProp) {
		return propApp.getNome();
	}

	@RequestMapping("/prop/db")
	public PropDB getPropDB() {
		return propDB;
	}

	@RequestMapping("/prop/db/path")
	public String getPropDBpath() {
		return propDB.getPath();
	}

	@RequestMapping("/prop/spring/datasource")
	public String getApplicationPropertiesSpringDatasource() {
		return "Hello from SpringApplicationProperties application!";
	}

}
