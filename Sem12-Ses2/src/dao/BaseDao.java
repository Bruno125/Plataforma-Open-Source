package dao;

import java.util.List;

public interface BaseDao<E,ID> {
	boolean insert(E entity);
	boolean delete(ID id);
	E obtener(ID id);
	boolean update(E entity);
	List<E> list();
}
