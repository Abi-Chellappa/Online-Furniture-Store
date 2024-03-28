import React, { Component } from 'react'
import { Link} from 'react-router-dom'; 
import './Home.css'

export default class Home extends Component {
  render() {
    return (
     
    
     <div class="full66">
     <div className='im13'>
     <img src="https://img.freepik.com/premium-photo/modern-living-room-interior-with-sofa-green-plants-lamp-table-dark-wall-background_41470-1537.jpg?w=1060" height="850px" width="1520px"/>
     </div>   
     <div class="navbar">
           
            <div class="icon">
               <h2 class="head">Furniture   &nbsp;Yard</h2> 
            </div> 
             
            <div class="menu">
                <ul>
                <li><Link to="/"><div className="homeee">HOME</div></Link></li>
                <li><Link to="/signup">SIGNUP</Link></li>
                <li><Link to="/login" >LOGIN</Link></li>
                <li><Link to="/details">FURNITURE</Link></li>
                <li><Link to="/get">DETAILS</Link></li>
               
                </ul>
            </div>
          </div>
      <div class="content">
          <p class="para">Awesome design Best Furniture
          <br/> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;For Your Interior</p>
          </div> 
          
          <div className='tranbut'> 
          <Link to="/login"><button class="shopbut">Shop now</button></Link>
          </div>
        
      </div>
     
  

  
 
  
    )
  }
}
