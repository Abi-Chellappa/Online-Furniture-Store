package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LoginEntity;

import com.example.demo.Repository.LoginRepoInterface;

@Service
public class LoginService implements LoginServiceInterface 
{
	@Autowired
	private LoginRepoInterface lr;
	@Override
    public List<LoginEntity> getloginDetails()
    {
    	return lr.findAll();
    }
	
	@Override
	public List<LoginEntity> getAll(int id) 
	{
		return lr.getAll(id);
	}

	@Override
	public void saveloginDetails(LoginEntity le) 
	{
		lr.save(le);
	}

	@Override
	public void updateloginDetails(LoginEntity le) 
	{
		lr.save(le);
	}

	@Override
	public void deleteloginDetails(int id) 
	{
		lr.deleteById(id);
		
	}
}
