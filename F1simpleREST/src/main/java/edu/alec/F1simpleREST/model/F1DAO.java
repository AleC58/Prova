package edu.alec.F1simpleREST.model;

import edu.alec.F1simpleREST.model.Pilota;
import java.util.List;

/**
 *
 * @author alex.cazziolato
 */
public class F1DAO {
	private CostruttoriDAO costruttoriDAO;
	private PilotiDAO pilotiDAO;
	private static F1DAO istanza = null;
	
	public static F1DAO getInstance() {
		if (istanza == null) {
			istanza = new F1DAO();
		}
		return istanza;
	}
	
	private F1DAO() {
		costruttoriDAO = CostruttoriDAO.getInstance();
		pilotiDAO = pilotiDAO.getInstance();
		//ecc per gare ...
	}

	public Pilota getPilotaByNominativo(String cognomeNome) {
		return null;
	}
	
	public Costruttore getCostruttoreByNome(String nome) {
		costruttoriDAO.get(nome); //ad es.
		return null;
	}
	
	public List<Pilota> getAllPilotiOrdAlfab() {
		return null;
	}
	
	public List<Costruttore> getAllCostruttoriOrdAlfab() {
		return null;
	}
	
	public List<Pilota> getClassificaPiloti() {
		return null;
	}
	
	public List<Costruttore> getClassificaCostruttori() {
		return null;
	}
	
	public List<Pilota> getPilotiDelTeam(Costruttore costruttore) {
		return null;
	}
	
}
