import React, { useEffect, useState } from 'react' 
import {Link, useParams} from 'react-router-dom';
import { useNavigate } from "react-router-dom";
import './Getdetails.css'

const Getdetails=()=> { 
const [furniturelists, setfurniturelists] = useState([]) 
const {id} =useParams();
const navigate=useNavigate();
useEffect(() => 
{ 
getAllFurniturelist(); 
}, []) 

const deleteFurniturelist=async(id)=>
{
   fetch(`http://localhost:8080/deletebyid?id=${id}`,
   {
    method:'DELETE'
   })
   .then((response)=>
   {
        getAllFurniturelist();
   })
   .catch(error=>
   {
        console.log(error);
   })
}
const updateid=(id)=>
{
   
   navigate(`/update/${id}`);
}
const deleteAll = () => 
{
   
   fetch(`http://localhost:8080/deletefurniture`,
   {
    method:'DELETE'
   })
   .then((response)=>
   {
        getAllFurniturelist();
   })
   .catch(error=>
   {
        console.log(error);
   })
 
}

const getAllFurniturelist = () => 
{ 
   fetch("http://localhost:8080/getallfurniture")
   .then(e=>e.json())
   .then((eve)=>{
   setfurniturelists(eve);
})
}
 


return ( 
   <div className="fulltable">
   <div className='rectangle78'>
   <p id='order'>Furniture Details</p>
   <Link to="/details"><button className='addbut'>Add New</button></Link>
  <button className='delallbut' onClick={deleteAll}>Delete All</button>
  <Link to="/thankyou"><p className='paraout'>Logout</p></Link>
   </div>
      <br/>
      <br/>
     <table id='gettable'> 
     <thead>
     <tr> 
        <th>Furnitur Id</th> 
        <th>Furniture Name</th> 
        <th>Furnitur Material</th> 
        <th>Price</th> 
        <th>No of Furnitur Purchesed</th> 
        <th>Actions</th> 
    </tr> 
    </thead>
   <tbody>
       {furniturelists.map((furniturelist)=>(
          <tr key={furniturelist.id}> 
       <td> {furniturelist.id}</td> 
       <td> {furniturelist.furniturename}</td> 
       <td> {furniturelist.furniturematerial}</td> 
       <td> {furniturelist.price}</td> 
       <td> {furniturelist.numoffurniturepurchased}</td> 
       
       <td>
          <button className="edit" onClick={()=>updateid(furniturelist.id)}>Update</button> &nbsp;&nbsp;
          <button class="delete" onClick = {() => deleteFurniturelist(furniturelist.id)}> Delete!</button> &nbsp;&nbsp;
          
      </td> 
    </tr> 
       ))}
       </tbody>
   </table> 
</div> 
)
} 
export default Getdetails; 
