package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.PersonEntity;
import com.example.demo.Repository.PersonRepoInterface;
@Service
public class PersonService 
{
    @Autowired 
    private PersonRepoInterface prr;
    
	public List<PersonEntity> getpersondata() 
	{
		return prr.findAll();
	}

	public void savepersondata(PersonEntity pe) 
	{
	    prr.save(pe);	
	}
	

}
