import React, { useState } from 'react'
import './Loginnn.css'
import { Link} from 'react-router-dom'; 
import axios from 'axios';
import { useNavigate } from "react-router-dom";

export default function Loginnn() {
  const[password,setPassword]= useState('');
  const[email,setEmail]= useState('');
 
  const navigate=useNavigate();
  const detailss={email,password}
  
  
  const formHolder=(event)=>
  {
    
    if(email.length==0 && password.length==0)
    {
      alert("Enter emailid and password")
    }
    else if(email.length===0)
    {
      alert("Enter Emailid")
    }
    else if(password.length===0)
    {
      alert("Enter Password");
    }
    
    else
    {
      axios.post("http://localhost:8080/postlogin",detailss)
      navigate("/details")
    }
    
  }
  return (
    <div class="full13">
    <div className='img77'>
      <img src="https://assets.architecturaldigest.in/photos/60084b6a3a9d9570bc8426f3/16:9/w_2560%2Cc_limit/asbe-getty-images-COVID-19-1366x768.jpg" height="860px" width="1545px"/>
     </div>
       <div class="content77">
           <div class="form77">
           <form onSubmit={formHolder}>
                   <h2>Login Here</h2>
                   <input type="email77" name="email"  value={email} placeholder="Enter Email Here"  onChange={(e)=>setEmail(e.target.value)}/><br/><br/>
                   <input type="password77" name="pw" value={password} placeholder="Enter Password Here"  onChange={(e)=>setPassword(e.target.value)}/><br/>
                     
                   <button type="submit" class="bnlog77">Login</button>
                    
                   <p class="link77">Don't have an account<br/>
                   <Link to="/signup"><span>Sign up </span></Link>here</p>
                   </form>
           </div>
      </div> 
    </div>        
  )
}
