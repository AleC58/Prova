package edu.alec.F1simpleREST.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex.cazziolato
 */
public class F1DAO {
	private final CostruttoriDAO costruttoriDAO;
	private final PilotiDAO pilotiDAO;
	private final CampionatiDAO campionatiDAO;
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
		campionatiDAO = CampionatiDAO.getInstance();
		//ecc per gare ...
	}

	public List<Pilota> getAllPiloti() {
		return pilotiDAO.getAll();
	}

	public List<Pilota> getClassificaPiloti() {
		return null;
	}

	public Pilota getPilotaById(long idPilota) {
		return pilotiDAO.get(idPilota);
	}

	public Pilota getPilotaByNominativo(String cognomeNome) {
		return null;
	}

	public List<Costruttore> getAllCostruttori() {
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

	public List<Campionato> getAllCampionati() {
		return campionatiDAO.getAll();
	}

	public List<Campionato> getCampionatoByAnno(int annoCampionato) {
		return campionatiDAO.get(annoCampionato);
	}

	public List<Pilota> getPilotiDelTeam(int annoCampionato, Costruttore costruttore) {
		return null;
	}

	public List<Pilota> getPilotiDelTeam(int annoCampionato, long idCostruttore) {
		List<Campionato> campionato = campionatiDAO.get(annoCampionato);
		List<Pilota> pilotiDelTeam = new ArrayList<>();
		for (Campionato c : campionato) {
			if (c.getIdCostruttore() == idCostruttore) {
				pilotiDelTeam.add(pilotiDAO.get(c.getIdPilota()));
			}
		}
		return pilotiDelTeam;
	}

}
