// "use client"
// import { useState, useEffect } from "react";

import fs from "fs/promises"
import Navbar1 from "@/components/Navbar1"
import Image from "next/image";
export default function Home() {
 // const [count, setCount] = useState(0)
//  console.log("Hey I am Chaitanya")
//  let a = fs.readFile(".gitignore")
//  a.then(e=>{console.log(e.toString())})
  return (
    // <div>
    //   <Navbar1/>
    //   I am a component 
    //   {/* {count} */}
    //   {/* <button onClick={()=> setCount(count +1)}> Click Me </button> */}
    // </div>
    <div className="container my-5 sizw-80 bg-red-300">
      <Image className="mx-auto"  src="https://www.sectorlink.com/img/blog/wordpress-slider.png" alt="Slider"
  width={800}
  height={400} />
    </div>
  );
}
