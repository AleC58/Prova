package edu.alec.F1;

import java.util.List;

/**
 *
 * @author alex.cazziolato
 * @param <T>
 */
public interface DAOInterface<T> {
	T get(long id);

	List<T> getAll();

	void save(T t);

	void update(T t, String[] valori);

	void delete(T t);

}
