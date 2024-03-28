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

import com.example.demo.Entity.LoginEntity;
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin
public class LoginController 
{
	@Autowired
	private LoginService ls;
   @GetMapping("/getlogin")
   public List<LoginEntity>getloginData()
   {
	   return ls.getloginDetails();
   }
   
   @GetMapping("/getlogin1")
   public List<LoginEntity> getAllDetails(@RequestParam int id)
   {
	   return ls.getAll(id);
   }
 
	@PostMapping("/postlogin")
	public void saveloginData(@RequestBody LoginEntity le)
	{
		ls.saveloginDetails(le);
	}
	@PutMapping("/putlogin")
	public void updateloginData(@RequestBody LoginEntity le,@RequestParam int id)
	{
		le.setId(id);
		ls.updateloginDetails(le);
	}
	@DeleteMapping("/deletelogin")
	public void deleteloginData(@RequestParam int id)
	{
		ls.deleteloginDetails(id);
	}
}
