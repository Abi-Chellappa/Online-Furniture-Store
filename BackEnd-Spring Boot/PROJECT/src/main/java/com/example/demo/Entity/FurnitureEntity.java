package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="furniture")
public class FurnitureEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String furniturename;
	String furniturematerial;
	int price;
	int numoffurniturepurchased;
    public FurnitureEntity() 
    {
		super();
	}
    public FurnitureEntity(int id, String furniturename, String furniturematerial, int price,int numoffurniturepurchased) 
    {
		super();
		this.id = id;
		this.furniturename = furniturename;
		this.furniturematerial = furniturematerial;
		this.price = price;
		this.numoffurniturepurchased = numoffurniturepurchased;
	}
    public int getId() 
    {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getFurniturename() {
		return furniturename;
	}
	public void setFurniturename(String furniturename) 
	{
		this.furniturename = furniturename;
	}
	public String getFurniturematerial() 
	{
		return furniturematerial;
	}
	public void setFurniturematerial(String furniturematerial) 
	{
		this.furniturematerial = furniturematerial;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public int getNumoffurniturepurchased() 
	{
		return numoffurniturepurchased;
	}
	public void setNumoffurniturepurchased(int numoffurniturepurchased) 
	{
		this.numoffurniturepurchased = numoffurniturepurchased;
	}
	@Override
	public String toString() 
	{
		return "FurnitureEntity [id=" + id + ", furniturename=" + furniturename + ", furniturematerial="
				+ furniturematerial + ", price=" + price + ", numoffurniturepurchased=" + numoffurniturepurchased + "]";
	}
      
}
