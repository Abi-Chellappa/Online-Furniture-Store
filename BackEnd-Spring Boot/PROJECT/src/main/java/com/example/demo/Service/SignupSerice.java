package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.SignupEntity;
import com.example.demo.Repository.SignUpRepoInterface;

@Service
public class SignupSerice implements SignupServiceInterface 
{
	@Autowired
	private SignUpRepoInterface sr;
	@Override
	public List<SignupEntity>getsignupDetails()
	{
		return sr.findAll();
	}
	
	@Override
	public List<SignupEntity> getAll(int id, String firstname) 
	{
		return sr.getAll(id, firstname);
	}

	@Override
	public void savesignupDetails(SignupEntity se) 
	{
		sr.save(se);
		
	}
    @Override
	public void updatesignupDetails(SignupEntity se) 
	{
		
		sr.save(se);
	}

	@Override
	public void deletesignupDetails(int id) 
	{
		sr.deleteById(id);
	}
}
