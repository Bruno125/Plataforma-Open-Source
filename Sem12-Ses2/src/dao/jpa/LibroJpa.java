package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Libro;
import dao.LibroDao;

public class LibroJpa extends BaseJpa implements LibroDao{

	@Override
	public boolean insert(Libro entity) {
		try{
			em = obtenerEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			return true;
		}catch(Exception e){
			System.out.println("LibroJpa - insert: " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Libro obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Libro entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Libro> list() {
		List<Libro> libros = new ArrayList<Libro>();
		try{
			em = obtenerEntityManager();
//			TypedQuery<Libro> result = em.createQuery("SELECT lib.titulo,lib.isbn,lib.editorial,lib.genero FROM Libro lib",Libro.class);
			TypedQuery<Libro> result = em.createQuery("SELECT lib FROM Libro lib",Libro.class);
			libros = result.getResultList();
		}catch(Exception e){
			System.out.println("LibroJpa - list: " + e.getMessage());
		}
		return libros;
	}

}
