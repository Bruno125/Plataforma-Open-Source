package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import model.Editorial;
import model.Genero;
import dao.GeneroDao;

public class GeneroJpa extends BaseJpa implements GeneroDao{

	@Override
	public boolean insert(Genero entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Genero obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Genero entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Genero> list() {
		List<Genero> listar = new ArrayList<Genero>();
		try{
			em = obtenerEntityManager();
			TypedQuery<Genero> result = em.createQuery("SELECT g FROM Genero g",Genero.class);
			listar = result.getResultList();
		}catch(Exception e){
			System.out.println("EditorialJpa - list:" + e.getMessage());
		}
		return listar;
	}

}
