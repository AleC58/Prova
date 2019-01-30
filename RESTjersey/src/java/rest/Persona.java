package rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author alex.cazziolato
 */
@XmlRootElement
@XmlType(propOrder = {"id", "nome", "cognome", "eta", "telefono", "email"})
public class Persona {

	private int id;
	private String nome;
	private String cognome;
	private int eta;
	private String telefono;
	private String email;

	public Persona() {
	}

	public Persona(Integer Id, String Nome, String Cognome, Integer Eta, String Telefono, String Email) {
		this.id = Id;
		this.nome = Nome;
		this.cognome = Cognome;
		this.eta = Eta;
		this.telefono = Telefono;
		this.email = Email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona{" + "id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", telefono=" + telefono + ", email=" + email + '}';
	}

}
