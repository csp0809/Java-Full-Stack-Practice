// async function getData() {
//     //simulate getting data from server
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve(455)
//         }, 3500);
//     })
// }

async function getData() {
    //simulate getting data from server
    let x= await fetch('https://jsonplaceholder.typicode.com/todos/1')
    let data = await x.json()
    // console.log(data)
    return data    
}

async function main(params) {

    console.log("Loading Modules")

    console.log("DO something else")

    console.log("Load data")

    let data = await getData()

    console.log(data)

    console.log("Process data")

    console.log("Task 2")

}

main()
// data.then((v) => {


//     console.log(data)

//     console.log("Process data")
//     console.log("Task 2")

// })