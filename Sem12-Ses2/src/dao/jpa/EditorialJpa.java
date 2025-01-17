package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import model.Editorial;
import dao.EditorialDao;

public class EditorialJpa extends BaseJpa implements EditorialDao{

	@Override
	public boolean insert(Editorial entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Editorial obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Editorial entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Editorial> list() {
		List<Editorial> listar = new ArrayList<Editorial>();
		try{
			em = obtenerEntityManager();
			TypedQuery<Editorial> result = em.createQuery("SELECT e FROM Editorial e",Editorial.class);
			listar = result.getResultList();
		}catch(Exception e){
			System.out.println("EditorialJpa - list:" + e.getMessage());
		}
		return listar;
	}
	
}
