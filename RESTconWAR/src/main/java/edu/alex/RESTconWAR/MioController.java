package edu.alex.RESTconWAR;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 */

@RestController
public class MioController {

	@RequestMapping("/")
	public String index() {
		return "Hello WAR!";
	}
	
}
