package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Autor;
import dao.AutorDao;

public class AutorJpa extends BaseJpa implements AutorDao{

	@Override
	public boolean insert(Autor entity) {
		try{
			em = obtenerEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			return true;
		}catch(Exception e){
			System.out.println("Dao: " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		try{
			em = obtenerEntityManager();
			EntityTransaction et = em.getTransaction();
			Autor autor = em.find(Autor.class, id);
			if(autor!=null){
				et.begin();
				em.remove(autor);
				et.commit();
				return true;
			}
		}catch(Exception e){
			System.out.println("AutorJpa delete: " + e.getMessage());
			
		}
		return false;
	}

	@Override
	public Autor obtener(Integer id) {
		try{
			em = obtenerEntityManager();
			Autor autor = em.find(Autor.class, id);
			return autor;
		}catch(Exception e){
			System.out.println("AutorJpa read: " + e.getMessage());
		}
		return null;
	}

	@Override
	public boolean update(Autor entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Autor> list() {
		List<Autor> lista = new ArrayList<Autor>();
		try{
			em = obtenerEntityManager();
			TypedQuery<Autor> res = em.createQuery("SELECT a FROM Autor a",Autor.class); 
			lista = res.getResultList();
		}catch(Exception e){
			System.out.println("AutorJpa list: " + e.getMessage());
		}
		return lista;
	}

}
