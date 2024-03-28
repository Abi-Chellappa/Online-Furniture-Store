package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PersonEntity;
import com.example.demo.Service.PersonService;

@RestController
public class PersonController 
{
	@Autowired 
	private PersonService pss;
	
	@GetMapping("/getallperson")
	public List<PersonEntity> getpersondetails()
	{
		return pss.getpersondata();
	}
	@PostMapping("/postperson")
	public String postpersondetails(@RequestParam PersonEntity pe)
	{
		pss.savepersondata(pe);
		return "Successfully Saved";
	}

}
