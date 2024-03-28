package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.SignupEntity;
import com.example.demo.Service.SignupSerice;


@RestController
@CrossOrigin
public class SignupController 
{
	@Autowired
	private SignupSerice ss;
	@GetMapping("/getsu")
   public List<SignupEntity>getDisplaysignup()
   {
	   return ss.getsignupDetails();
   }
	
	 @GetMapping("/getsu1")
	   public List<SignupEntity> getAllDetails(@RequestParam int id,@RequestParam String firstname)
	   {
		   return ss.getAll(id, firstname);
	   }
	 
	@PostMapping("/postsu")
	public void saveloginData(@RequestBody SignupEntity se)
	{
		ss.savesignupDetails(se);
	}
	@PutMapping("/putsu")
	public void updateloginData(@RequestBody SignupEntity se,@RequestParam int id)
	{
		se.setId(id);
		ss.updatesignupDetails(se);
	}
	@DeleteMapping("/deletesu")
	public void deleteloginData(@RequestParam int id)
	{
		ss.deletesignupDetails(id);
	}
	
    
}