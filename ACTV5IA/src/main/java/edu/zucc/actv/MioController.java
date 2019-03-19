package edu.zucc.actv;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 */
@RestController
public class MioController {
	@RequestMapping("/")
	public String index() {
		return "Ciao a tutti :-))))";
	}
	
	/**
	 * Dal browser navigare all'URL http://localhost:8080/unaParolaQualsiasi
	 *
	 * @param id unaParolaQualsiasi
	 * @return la stringa "Hello [unaParolaQualsiasi]"
	 */
	@RequestMapping("/{id}")
	public String index(@PathVariable String id) {
		return "Hello " + id;
	}

	/**
	 * Dal browser navigare all'URL http://localhost:8080/login/nome/pwd
	 *
	 * @param username relativo a nome
	 * @param password relativo a pwd
	 * @return il json {"password":"pwd","username":"nome"}
	 */
	@RequestMapping(value = "/login/{username}/{password}", produces = {"application/JSON"})
	@ResponseBody
	public Map<String, String> provaJson(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		HashMap<String, String> ris = new HashMap<>();
		ris.put("username", username);
		ris.put("password", password);
		return ris;
	}

	/**
	 * Dal browser navigare all'URL
	 * http://localhost:8080/login2?username=nome&password=pwd
	 *
	 * @param username relativo a nome
	 * @param password relativo a pwd
	 * @return il json {"password":"pwd","username":"nome"}
	 */
	@RequestMapping(value = "/login2", produces = {"application/JSON"})
	@ResponseBody
	public Map<String, String> provaJson2(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		HashMap<String, String> ris = new HashMap<>();
		ris.put("username", username);
		ris.put("password", password);
		return ris;
	}
	
}
