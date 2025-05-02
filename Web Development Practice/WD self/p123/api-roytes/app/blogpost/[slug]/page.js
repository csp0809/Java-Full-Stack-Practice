// export default async function Page({ params }) {
//     // throw new Error("error ahe!")
//     //fetch your blogpost by its slug
    
//     let languages = ["python", "javascript", "java", "c"]
//     if(languages.includes(params.slug)){
//         const { slug } = await params
//     return <div>My Post: {slug}</div>
//     }
//     else{
//         return <div>Post not found </div>
//     }
//     const { slug } = await params
//     return <div>My Post: {slug}</div>
//   }
"use client"
import React, { useEffect } from 'react'
import { useParams } from 'next/navigation'
import { useRouter  } from 'next/navigation'
const page = () => {
    const params= useParams()
    const router = useRouter()

    useEffect(()=>{
        setTimeout(()=>{

            router.push('/dashborad')
        },2222);
    },[])
  return (
    <div>
      {params.slug}

      <button type="button" onClick={() => router.push('/dashboard')}>
      Dashboard
    </button>
    </div>
  )
}

export default page
