import axios from 'axios';
import React, { useState } from 'react'
import './Signup.css';
import { useNavigate } from "react-router-dom";
import { Link} from 'react-router-dom'; 

export default function Signup() 
{
  const[firstname,setFirstname]=useState('');
  const[lastname,setLastname]=useState('');
  const[email,setEmail]=useState('');
  
  const[password,setPassword]=useState('');
  const[confirmpassword,setConfirmpassword]=useState('');
  const navigate=useNavigate();
  const list={firstname,lastname,email,password,confirmpassword}
  
  

  const formHolder=(event)=>
  {
    if(firstname.length===0 || lastname.length===0 || email.length===0 || password.length===0 || confirmpassword.length===0)
    {
      alert("Enter All fields");
    }
    else 
    {
    axios.post("http://localhost:8080/postsu",list)
    navigate("/details")
    }
   
  }
  return (
    <div class="fullsu99">
      <div className='img99'>
       <img src="https://img.freepik.com/free-photo/yellow-armchair-living-room-with-copy-space_43614-940.jpg?w=996&t=st=1685738282~exp=1685738882~hmac=ba0b4c5819dcc81c290726b6f6b6d1e6504dab6e5c6f4ff8fe586c97029b57bb" height="860px" width="1526.6px"/>
      </div>
      
      <div className='form99'>
      <form onSubmit={formHolder}>
       <br/>
       <br/>
       <br/>
       <br/>
       <br/>
       
       <br/>
      <input type="text99" placeholder="   First Name" value={firstname}  onChange={(e)=>setFirstname(e.target.value)} />&nbsp;&nbsp;

      <input type="text99" placeholder="   Last Name" value={lastname}  onChange={(e)=>setLastname(e.target.value)}/><br/><br/>

      <input type="text199" placeholder="   Email " value={email}  onChange={(e)=>setEmail(e.target.value)} /><br/><br/>
       
      
       
      <input type="Password99" placeholder="   Password" value={password}  onChange={(e)=>setPassword(e.target.value)}/><br/><br/>

      <input type="Password99" placeholder="   Confirm Password" value={confirmpassword}  onChange={(e)=>setConfirmpassword(e.target.value)}/><br/><br/><br/>
      
      <button type="submit" class="but99"><b>Create Account</b></button>
      </form>
      </div>
      <div className='head99'>
      <h3>SIGN UP</h3>
       <br/>
      <h4>CREATE YOUR ACCOUNT</h4>
      
      <div class="loginhave">
      <p class="link33login">Already have an account<br/>
      <Link to="/login"><span>Login </span></Link>here</p>
      </div>
      </div>
    </div>
  )
}
