package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class PersonEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String personname;
	String address;
	long phoneno;
	public PersonEntity() 
	{
		super();
	}
	
	public PersonEntity(int id, String personname, String address, long phoneno) {
		super();
		this.id = id;
		this.personname = personname;
		this.address = address;
		this.phoneno = phoneno;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	
     
}
