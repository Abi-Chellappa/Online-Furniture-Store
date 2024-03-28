package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.demo.Entity.FurnitureEntity;

public interface FurnitureServiceInterface 
{
	public List<FurnitureEntity> getfurnituredata();
	public List<FurnitureEntity> getdata(int id, String furniturename);
	public List<FurnitureEntity> getpricedata(int price);
	public void savedata(FurnitureEntity e);
	public void updateData(FurnitureEntity e);
	public void deletedata(int id);
	public void deletealldata();
	public Page<FurnitureEntity> getpagingdata(int pageno, int pagesize);
	public Iterable<FurnitureEntity> getSortingdata(String field,String order);
	public Page<FurnitureEntity> getpagingsortingdata(int pageno, int pagesize, String field, String order) ;
	public Optional<FurnitureEntity>getiddata(int id);
	List<FurnitureEntity> getnameandmaterialdata(String furniturename, String furniturematerial);
	void updatebypricedata(String furniturename, int price);
	void deletebymaterialdata(String furniturematerial);
}
