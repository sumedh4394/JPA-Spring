package com.sb.database.databasedemo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sb.database.databasedemo.entity.SumedhPerson;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public SumedhPerson findById(Integer id) {
		return entityManager.find(SumedhPerson.class, id);
		
	} 
	
	public SumedhPerson update(SumedhPerson sumedhPerson) {
		return entityManager.merge(sumedhPerson);
	}
	
	public SumedhPerson insert(SumedhPerson sumedhPerson) {
		return entityManager.merge(sumedhPerson);
	}
	
	public void deleteById(int id) {
		SumedhPerson sumedhPerson = findById(id);
		entityManager.remove(sumedhPerson);
	}
	
	public List<SumedhPerson> findAll(){
		TypedQuery<SumedhPerson> namedQuery = entityManager.createNamedQuery("find all persons", SumedhPerson.class);
		return namedQuery.getResultList();
	}
	

	
	
	/*
	 * public Person update(Person person) { return entityManager.merge(person); }
	 */
	
}
