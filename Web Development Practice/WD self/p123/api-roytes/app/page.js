
// import Image from "next/image";
// import fs from "fs/promises"

// export default function Home() {

//   const submitAction = async (e) => {
//     "use server"
//     console.log(e.get("name"), e.get("add"))
//   let a = await fs.writeFile("chait.txt",`Name is ${e.get("name")} and address is ${e.get("add")}`)
//   console.log(a)
//   }
// //   const handleClick = async()=>{
// //     let data= {
// //       name:"Chaitanya",
// //       role:"Coder"
// //     }
// //     let a= await fetch("/api", {method: "POST",  headers: {
// //       "Content-Type": "application/json"
// //     },
// //     body: JSON.stringify(data),
// //   })
// //   let res = await a.json()
// //   console.log(res)
// // }
//   return (
//     // <div>
//     //   <h1 className="text-xl font-bold">Next.js APi routes demo</h1>
//     // <button onClick={handleClick}>Click</button>
//     // </div>
//     <div className="w-2/3 mx-auto my-10">
//       <form action="{submitAction}">
//         <div>
//           <label htmlFor="name">Name</label>
//           <input type="text" name="name" id="name" className="border rounded border-black px-2"/>
//         </div>
//         <div>
//           <label htmlFor="add">Address</label>
//           <input type="text" name="add" id="add" className="border rounded border-black px-2"/>
//         </div>
//         <div>
//           <button className="border rounded border-black px-2">Submit</button>
//         </div>
//       </form>
//     </div>
//   );
// }


// // server actions
// "use client"
// import { submitAction } from "@/actions/form";
// import { useRef } from "react";

// export default function Home() {
//   let ref = useRef()
//   return (
//     <div className="w-2/3 mx-auto my-12">
//       <form ref={ref} action={(e)=> {submitAction(e); ref.current.reset()}}>
//         <div>
//           <label htmlFor="name">Name</label>
//           <input name="name" id="name" className="text-black mx-4" type="text" />
//         </div>
//         <div>
//           <label htmlFor="add">Address</label>
//           <input name="add" id="add" className="text-black mx-4" type="text" />
//         </div>
//         <div>

//         <button className="border border-white px-3">Submit</button>
//         </div>
//       </form>
//     </div>
//   );
// }



//video 127 Auth.js 
// "use client"
// import { useSession, signIn, signOut } from "next-auth/react"

// export default function Component() {
//   const { data: session } = useSession()
//   console.log(session)
//   if(session) {
//     return <>
//       Signed in as {session.user.email} <br/>
//       <button onClick={() => signOut()}>Sign out</button>
//     </>
//   }
//   return <>
//     Not signed in <br/>
//     <button onClick={() => signIn()}>Sign in</button>
//   </>
// }

// export default page



//video 129 layouts in next.js
// import Image from 'next/image'

// export default function Home() {
//   return (
//     <div className='homepage'>
//       I am homepage
//     </div>
//   )
// }

"use client"
import Image from 'next/image'
import { usePathname } from 'next/navigation';
import { useSearchParams } from 'next/navigation';

export default function Home() {
  const pathname = usePathname
  const searchparams =useSearchParams()
  return (
    <div>
      Hey This is Home page and blog is{searchparams.get('blog')} and utm source is {searchparams.get('utm_source')}
    </div>
  );
}
