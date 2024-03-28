import React, { useState } from 'react'
import axios from 'axios';
import Link from '@mui/material/Link';
import { useNavigate } from 'react-router-dom';
import './Furnituredetails.css'

export default function Furnituredetails() {
    const[furniturename,setFurniturename]=useState('');
  const[furniturematerial,setMaterial]=useState('');
  const[price,setPrice]=useState('');
  
  const[numoffurniturepurchased,setPurchased]=useState('');
  const navigate=useNavigate();
  const list={furniturename,furniturematerial,price,numoffurniturepurchased}
  
  

  const formHolder=(event)=>
  {
    axios.post("http://localhost:8080/postfurniture",list)
    navigate("/get")
   
  }
  return (
    <div className='full44'>
    <div className='img44'>
    <img src="https://www.flexformcomo.com/images/showroom/showroom-flexform-como4.jpg" height="850px" width="1600px"/>
    </div>
    
    
    <div className='form44'>
    <form onSubmit={formHolder}>
    
    <br/>
    <br/>
    <br/>
    <br/>
   
       <br/>
      <input type="text44" placeholder="   Furniture Name" value={furniturename}  onChange={(e)=>setFurniturename(e.target.value)} /><br/><br/>

      <input type="text44" placeholder="   Furniture Material" value={furniturematerial}  onChange={(e)=>setMaterial(e.target.value)}/><br/><br/>

      <input type="text44" placeholder="   Price " value={price}  onChange={(e)=>setPrice(e.target.value)} /><br/><br/>
      
      
      
      <input type="Password44" placeholder="   Number of Furniture Purchased " value={numoffurniturepurchased}  onChange={(e)=>setPurchased(e.target.value)}/><br/><br/>
      
      
      <button type="submit" class="but44"><b>Submit</b></button>
      </form>
      </div>
      <div className='head444'>
      <p>Furniture Details</p>
      </div>
      </div>
  )
}
