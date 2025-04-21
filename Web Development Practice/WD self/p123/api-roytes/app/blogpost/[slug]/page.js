export default async function Page({ params }) {
    // throw new Error("error ahe!")
    //fetch your blogpost by its slug
    
    let languages = ["python", "javascript", "java", "c"]
    if(languages.includes(params.slug)){
        const { slug } = await params
    return <div>My Post: {slug}</div>
    }
    else{
        return <div>Post not found </div>
    }
    const { slug } = await params
    return <div>My Post: {slug}</div>
  }