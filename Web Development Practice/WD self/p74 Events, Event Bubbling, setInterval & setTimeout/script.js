let btn= document.getElementById("btn")
// lis of all mouse events
// https://developer.mozilla.org/en-US/docs/Web/API/Element#mouse_events
btn.addEventListener("dblclick", ()=>{
    // alert("I was Clicked. ")
    document.querySelector(".box").innerHTML= "<b>Yayy you were clicked </b> Enjoy your click!"
})

btn.addEventListener("contextmenu", ()=>{
    alert("Dont right click please")
})

document.addEventListener("keydown", (e)=>{
    console.log(e, e.key, e.keyCode)
})