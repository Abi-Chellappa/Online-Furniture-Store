import React, { useEffect, useState } from 'react' 
import { Link, json,useParams } from 'react-router-dom'; 
import './Updatedetails.css'
import { useNavigate } from "react-router-dom";

function Updatedetails(){

const {id} = useParams(); 
const[furniturename,setFurniturename]=useState('');  
const[furniturematerial,setMaterial]=useState(''); 
const[price,setPrice]=useState(''); 
const[numoffurniturepurchased,setPurchased]=useState(''); 
const[response,setResponse]=useState('');
const navigate=useNavigate();

useEffect(() =>{
   const fetchFrameDetails = async () => {
      try{
         const response =await fetch(`http://localhost:8080/getbyid?id=${id}`);
         
         const data= await response.json();
         setFurniturename(data.furniturename);
         setMaterial(data.furniturematerial);
         setPrice(data.price);
         setPurchased(data.numoffurniturepurchased);
      }
      catch(error)
      {
         console.error('Error',error);
      }
   };
   fetchFrameDetails();
},[id]);

const handleFurniturenameChange = (e) =>{
   setFurniturename(e.target.value);
};
const handleFurnitureMaterialChange = (e) =>{
   setMaterial(e.target.value);
};
const handlePriceChange = (e) =>{
   setPrice(e.target.value);
};
const handlePurchasedChange = (e) =>{
   setPurchased(e.target.value);
};


const saveOrUpdateFurniture = async(e) => 
{ 
    
    e.preventDefault() 
   
    try
    { 
       const response=await 
       fetch(`http://localhost:8080/putfurniture?id=${id}`,
        {
         method:"PUT",
         headers:{"Content-Type" :"application/json"},
         body:JSON.stringify({furniturename,furniturematerial,price, numoffurniturepurchased})
        });
         if(!response.ok)
         {
            throw new Error('Error:'+response.status);
            
         }
         const data=await response.json();
         setResponse(data);
      }
         catch(error) 
         { 
            console.error(error) 
         }
        navigate("/get")
   
}; 

return ( 
     <div id="body"> 
      <div className="signup-form"> 
       <div className="container"> 

        <div className="header92"> 
            <p id='update'>Update Details</p> 
        </div> 
        
        <div className='rectangle92'>
        <div className='form92'>
        <form onSubmit={saveOrUpdateFurniture}> 

           <div className="inputtt"> 
              <input type="text" placeholder="Furniture Name" value={furniturename}  onChange={handleFurniturenameChange} /> 
            </div>

            <div className="inputtt"> 
               <input type="text" placeholder="Furniture Material" value={furniturematerial}  onChange={handleFurnitureMaterialChange} /> 
            </div> 

           <div className="inputtt"> 
                <input type="text" placeholder="Price " value={price}  onChange={handlePriceChange}/> 
           </div>     

           <div className="inputtt"> 
                <input type="number" placeholder="Number of Furniture Purchased " value={numoffurniturepurchased}  onChange={handlePurchasedChange}/> 
           </div>
           <br/>
           <br/>
           <br/>
           

           <button className='but92' type="submit">Update</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <Link to="/get"><button className="ecancelbtn">Cancel</button></Link> 
     </form> 
     </div>
     </div>
    </div>
   </div> 
</div> 
) 
} 
export default Updatedetails
