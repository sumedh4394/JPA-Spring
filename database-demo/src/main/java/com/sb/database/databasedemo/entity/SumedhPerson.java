package com.sb.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.*;

@Entity
@NamedQuery(name="find all persons", query="select s from SumedhPerson s")
public class SumedhPerson {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birthDate;
	
	
	public SumedhPerson(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}


	public SumedhPerson() {
		super();
	}


	public SumedhPerson(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return String.format("\nPerson [id=%d, name=%s, location=%s, birthDate=%s]", id, name, location, birthDate);
	}
	
	
	
	

}
	
