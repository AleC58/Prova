package edu.alec.F1simpleREST.model;

import java.util.List;

/**
 *
 * @author alex.cazziolato
 */
public class F1DAO {
	private final CostruttoriDAO costruttoriDAO;
	private final PilotiDAO pilotiDAO;
	private static F1DAO istanza = null;
	
	public static F1DAO getInstance() {
		if (istanza == null) {
			istanza = new F1DAO();
		}
		return istanza;
	}
	
	private F1DAO() {
		costruttoriDAO = CostruttoriDAO.getInstance();
		pilotiDAO = PilotiDAO.getInstance();
		//ecc per gare ...
	}

	public List<Pilota> getAllPilotiOrdAlfab() {
		return pilotiDAO.getAll();
	}
	
	public List<Pilota> getClassificaPiloti() {
		return null;
	}
	
	public Pilota getPilotaByNominativo(String cognomeNome) {
		return null;
	}
	
	public List<Costruttore> getAllCostruttoriOrdAlfab() {
		return costruttoriDAO.getAll();
	}
	
	public List<Costruttore> getClassificaCostruttori() {
		return null;
	}
	
	public Costruttore getCostruttoreById(long idCostruttore) {
		return costruttoriDAO.get(idCostruttore);
	}
	
	public Costruttore getCostruttoreByNome(String nome) {
		return costruttoriDAO.get(nome);
	}
	
	public List<Pilota> getPilotiDelTeam(Costruttore costruttore) {
		return null;
	}
	
}
