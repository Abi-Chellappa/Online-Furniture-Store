package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.FurnitureEntity;
import com.example.demo.Repository.FurnitureRepo;

@Service
public class FurnitureService implements FurnitureServiceInterface 
{
    @Autowired
    private FurnitureRepo r;
    
    @Override
	public List<FurnitureEntity> getfurnituredata() 
	{
        return r.findAll();
	}
	@Override
    public List<FurnitureEntity> getdata(int id, String furniturename) 
	{
		return r.getAllidname(id,furniturename);
	}
	@Override
	public List<FurnitureEntity> getpricedata(int price)
	{
		return r.findByPrice(price);
	}
	@Override
	public List<FurnitureEntity> getnameandmaterialdata(String furniturename, String furniturematerial) 
	{
		return r.findByFurniturenameAndFurniturematerial(furniturename, furniturematerial);
	}
    @Override
    public void savedata(FurnitureEntity e) 
	{
		 r.save(e);
		
	}
    @Override
    public void updateData(FurnitureEntity e) 
	{
         r.save(e);
	}
    @Override
    public void deletedata(int id) 
	{
         r.deleteById(id);
    }
    @Override
    public void deletealldata() 
	{
         r.deleteAll();
    }
    @Override
	public Page<FurnitureEntity> getpagingdata(int pageno, int pagesize) 
	{
		Pageable page=PageRequest.of(pageno, pagesize);
		return r.findAll(page);
	}
	@Override
	public Iterable<FurnitureEntity> getSortingdata(String field,String order) 
	{
		if(order.equals("asc"))
		{
		  return r.findAll(Sort.by(field));
		}
		else
		{
		   return r.findAll(Sort.by(Direction.DESC,field));
		}   
	}
    @Override
	public Page<FurnitureEntity> getpagingsortingdata(int pageno, int pagesize, String field, String order) 
	{

		Pageable page;
		if(order.equals("asc"))
		{
		page=PageRequest.of(pageno, pagesize,Direction.ASC,field); 
		}
		else
		{
			page=PageRequest.of(pageno, pagesize,Direction.DESC,field); 
		}
		return r.findAll(page);
	
	}
	public Optional<FurnitureEntity>getiddata(int id) 
	{
		
		return r.findById(id);
	}
	@Override
	public void updatebypricedata(String furniturename,int price)
	{
		r.updateByPrice(furniturename, price);
	}
	@Override
	public void deletebymaterialdata(String furniturematerial) 
	{
		r.deleteByFurniturename(furniturematerial);
	}

    
}
