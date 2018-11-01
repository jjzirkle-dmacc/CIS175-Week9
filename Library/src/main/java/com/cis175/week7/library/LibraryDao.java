package com.cis175.week7.library;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class LibraryDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Library");

	public void insertBook(Book bookToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(bookToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Book> getAllBooks() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select b from Book b";
		TypedQuery<Book> typedQuery = em.createQuery(q, Book.class);
		List<Book> all = typedQuery.getResultList();
		return all;
	}
	
	public void insertMag(Magazine magazine) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(magazine);
		em.getTransaction().commit();
		em.close();
	}

	public List<Magazine> getAllMags() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select m from Magazine m";
		TypedQuery<Magazine> typedQuery = em.createQuery(q, Magazine.class);
		List<Magazine> all = typedQuery.getResultList();
		return all;

	}
	
	public List<TitleAndGenre> getAllByGenre() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select m.title, m.genre from Magazine m JOIN Book b where b.genre = m.genre";
		TypedQuery<TitleAndGenre> typedQuery = em.createQuery(q, TitleAndGenre.class);
		List<TitleAndGenre> all = typedQuery.getResultList();
		return all;

	}
}
