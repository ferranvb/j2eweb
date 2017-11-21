package com.emprul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.emprul.entity.Project;


public class ProjectDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProject");

	EntityManager  em = emf.createEntityManager();
	
	public List<Project> llistaProjectes() {  
		TypedQuery<Project> consultaProjectes= em.createNamedQuery("Project.findAll", Project.class);
	
		List<Project> llista= consultaProjectes.getResultList();
	
		return llista;
	}
	
}
