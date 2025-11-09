import './App.css'
import { useState } from 'react'

function App() {

  const[number,setNumber]=useState("");
  const[output,setOutput]=useState("");

  const submitFunction= async(e)=>{
      e.preventDefault();

      const num=await fetch(`/api/${number}`);
      const data=await num.text();
      setOutput(data);


  }

  const inputFormFunction=(e)=>{


       setNumber(e.target.value);


  }
  
  return (
    <>
    <form onSubmit={submitFunction}>
    <input
    type="number"
    value={number}
    onChange={inputFormFunction}
    />
 <button >Submit</button>
</form>

<h2>{output}</h2>
</>
  )
}

export default App
