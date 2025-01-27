console.log("This is Promises")

let prom1 = new Promise((resolve, reject) => {
    let a = Math.random();
    if (a > 0.5) {
        reject("No random number was not supporting")
    }
    else {
        setTimeout(() => {
            console.log("Yes I am done 2")
            resolve("Git 2")
        }, 1000);
    }
})

let prom2 = new Promise((resolve, reject) => {
    let a = Math.random();
    if (a > 0.5) {
        reject("No random number was not supporting")
    }
    else {
        setTimeout(() => {
            console.log("Yes I am done")
            resolve("Git")
        }, 3000);
    }
})

// prom1.then((a)=>{
//     console.log(a)
// }).catch((err)=>{
//     console.log(err)
// })

let p3 = Promise.all([prom1, prom2])
p3.then((a) => {
    console.log(a)
}).catch((err) => {
    console.log(err)
})