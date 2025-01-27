console.log("I am a script")
console.log("I was a script")

setTimeout(() => {
    console.log("I am inside setTimeout")
}, 0);

setTimeout(() => {
    console.log("I am inside setTimeout 2")
}, 0);
// preference for setTimeout is last i.e JS will execute all the console.log statements and later it will execute the setTimeout block

console.log("The End")


const fn = () => {
  console.log("Nothing")
}

const callback = (arg, fn) =>{
    console.log(arg)
    fn()
}
const loadScript = (src, callback) =>{
    let sc = document.createElement("script");
    sc.src = src;
    sc.onload = callback("Chaitanya", fn)
    document.head.append(sc)
}

loadScript("https://cdnjs.cloudflare.com/ajax/libs/prism/9000.0.1/prism.min.js", callback)