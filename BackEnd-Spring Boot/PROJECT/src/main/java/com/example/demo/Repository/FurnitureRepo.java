package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.FurnitureEntity;

import jakarta.transaction.Transactional;


@Repository
public interface FurnitureRepo extends JpaRepository<FurnitureEntity, Integer> 
{
	//get by id and furniturename
	@Query(value="SELECT * FROM furniture WHERE id=:id and furniturename=:furniturename",nativeQuery=true)
    public List<FurnitureEntity> getAllidname(int id,String furniturename);
	
    //update by price
	@Transactional
	@Modifying
	@Query("UPDATE FurnitureEntity m set m.furniturename=:furniturename WHERE m.price=:price")
	public void updateByPrice(String furniturename,int price);
	
	//delete by furniturematerial
	@Transactional
	@Modifying
	@Query("DELETE from FurnitureEntity m WHERE m.furniturematerial=:furniturematerial")
	public void deleteByFurniturename(String furniturematerial);
	
	//get by price 
	List<FurnitureEntity> findByPrice(int price);
	
	//get by furniturename and material
	List<FurnitureEntity> findByFurniturenameAndFurniturematerial(String furniturename,String furniturematerial);
}
