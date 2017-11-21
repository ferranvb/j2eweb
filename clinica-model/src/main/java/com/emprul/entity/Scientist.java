package com.emprul.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the scientists database table.
 * 
 */
@Entity
@Table(name="scientists")
@NamedQuery(name="Scientist.findAll", query="SELECT s FROM Scientist s")
public class Scientist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ssn;

	private String name;

	//bi-directional many-to-many association to Project
//	@ManyToMany(mappedBy="scientists")
//	private List<Project> projects;

	public Scientist() {
	}

	public int getSsn() {
		return this.ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Project> getProjects() {
//		return this.projects;
//	}
//
//	public void setProjects(List<Project> projects) {
//		this.projects = projects;
//	}

}