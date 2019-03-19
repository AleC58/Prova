package edu.alex.SpringApplicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
@ConfigurationProperties(prefix = "db") // find "db" values
public class PropDB {
	private String path;
	private String nome;
	private String fullName;

	public PropDB() {
	}

	public PropDB(String path, String nome, String fullName) {
		this.path = path;
		this.nome = nome;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
