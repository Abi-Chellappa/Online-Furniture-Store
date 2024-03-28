package com.example.demo.Service;


import java.util.List;


import com.example.demo.Entity.SignupEntity;

public interface SignupServiceInterface 
{
    public List<SignupEntity>getsignupDetails();
    public List<SignupEntity> getAll(int id,String firstname);
    public void savesignupDetails(SignupEntity  se);
 	public void updatesignupDetails(SignupEntity se);
 	public void deletesignupDetails(int id);
}
