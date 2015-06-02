package dao;

import java.util.List;

public interface BaseDao<B,I>{
	boolean insertar(B bean);
	boolean eliminar(I id);
	boolean actualizar(B bean);
	B obtener(I id);
	List<B> listar();
}
