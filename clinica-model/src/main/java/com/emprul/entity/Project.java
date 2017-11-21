package com.emprul.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the projects database table.
 * 
 */
@Entity
@Table(name="projects")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private int hours;

	private String name;

	//bi-directional many-to-many association to Scientist
	@OneToMany
	@JoinTable(
		name="assignedto"
		, joinColumns={
			@JoinColumn(name="Project")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Scientist")
			}
		)
	private List<Scientist> scientists;

	public Project() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Scientist> getScientists() {
		return this.scientists;
	}

	public void setScientists(List<Scientist> scientists) {
		this.scientists = scientists;
	}

}