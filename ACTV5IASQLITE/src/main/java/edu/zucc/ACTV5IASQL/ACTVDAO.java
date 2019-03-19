package edu.zucc.ACTV5IASQL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alex.cazziolato
 */
@Repository
public class ACTVDAO {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public ACTVDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// se i nomi dei campi della tabella coincidono con i nomi 
	// dei campi dell'oggetto si può usare BeanPropertyRowMapper
	public List<Calendar> getAllCalendar() {
		String sql = "SELECT * FROM calendar";
		RowMapper<Calendar> rowMapper = new BeanPropertyRowMapper<Calendar>(Calendar.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	public List<Integer> getAllRouteId(int stopId) {
		String sql = "SELECT route_id FROM routes WHERE trip_id in "
				+ "SELECT trip_id FROM stop_times WHERE stop_id = " + stopId;
		return this.jdbcTemplate.query(sql, new ResultSetExtractor<List<Integer>>());// .query(sql, rowMapper);
	}
}
