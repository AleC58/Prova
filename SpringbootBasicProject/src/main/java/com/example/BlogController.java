package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alex.cazziolato
 */
@RestController
public class BlogController {

	@RequestMapping("/")
	public String index() {
		return "Congratulations from BlogController.java!!!!";
	}

	@RequestMapping("/ciao")
	public String ciao() {
		return "ciao";
	}

	//@RequestMapping("/ciaojson", produces = {"application/JSON"})
	@RequestMapping(value = "/ciaojson", produces = {"application/JSON"})
	@ResponseBody
	public String getProduces() {
		return "ciao!!!";
	}

	@RequestMapping(value = "/ciao/{id}")
	public String ciao(@PathVariable("id") String id) {
		return "ciao with id=" + id;
	}
}
