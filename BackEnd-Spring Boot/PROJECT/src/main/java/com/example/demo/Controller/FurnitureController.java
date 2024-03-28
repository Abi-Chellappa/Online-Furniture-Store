package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.FurnitureEntity;

import com.example.demo.Service.FurnitureService;

@RestController
@CrossOrigin
public class FurnitureController 
{
	@Autowired
	private  FurnitureService s;
	
	//get All the Furniture Details
	@GetMapping("/getallfurniture")
    public List<FurnitureEntity> getfurnituredetails()
    {
	   return s.getfurnituredata();
    }
	
	// get by id
	@GetMapping("/getbyid")
	public Optional<FurnitureEntity> getiddetails(@RequestParam int id)
	{
		return s.getiddata(id);
	}
	
	
	// post Furniture details
	@PostMapping("/postfurniture")
	public void savedetails(@RequestBody FurnitureEntity e)
	{
		s.savedata(e);
	}
	
	// update furniture details by id
	@PutMapping("/putfurniture")
	public void updateDetails(@RequestBody FurnitureEntity e,@RequestParam int id)
	{
		e.setId(id);
		s.updateData(e);
	}
	
	// Delete furniture details by id 
	@DeleteMapping("/deletebyid")
	public void deleteDetails(@RequestParam int id)
	{
		s.deletedata(id);
	}
	
	// Delete All furniture details
	@DeleteMapping("/deletefurniture")
	public void deleteAllDetails()
	{
		s.deletealldata();
	}
	
	// Paging
	@GetMapping("/getpagging")
    Page<FurnitureEntity> getpagingdetails(@RequestParam int pageno,@RequestParam int pagesize)
    {
    	return s.getpagingdata(pageno, pagesize);
    }
	
	// sorting
	@GetMapping("/getsorting")
	Iterable<FurnitureEntity> getsortingDetails(@RequestParam String field,@RequestParam String order)
	{
		return s.getSortingdata(field,order);
	}
	
	// Paging and sorting
	@GetMapping("/getpaggingandsorting")
    public Page<FurnitureEntity> getpagingsortingdetails(@RequestParam int pageno,@RequestParam int pagesize,@RequestParam String field,String order)
    {
    	return s.getpagingsortingdata(pageno, pagesize,field,order);
    
    }
	
    //get Furniture Details by id and furniture name
	@GetMapping("/getbyidname")
	public List<FurnitureEntity> getdetails(@RequestParam int id,@RequestParam String furniturename)
	{
		return s.getdata(id, furniturename);
	}
	
	//get Furniture Details by price
	@GetMapping("/getbyprice")
	public List<FurnitureEntity> getpricedetails(@RequestParam int price)
	{
		return s.getpricedata(price);
	}
	
	//get Furniture Details by furniture name and material
	@GetMapping("/getbynameandmaterial")
	public List<FurnitureEntity> getnameandmeterialdetails(@RequestParam String furniturename,@RequestParam String furniturematerial)
	{
		return s.getnameandmaterialdata(furniturename,furniturematerial);
	}
	//update by price
	@PutMapping("/putbyprice")
	public String updatebypricedetails(String furniturename,int price) 
	{
		s.updatebypricedata(furniturename, price);
		return "Successfully Updated";
	}
	
	//delete by material
	@DeleteMapping("/deletebymaterial")
	public String deletebymaterialdetails(String furniturematerial)
	{
		s.deletebymaterialdata(furniturematerial);
		return "Successfully Deleted";
	}
}
