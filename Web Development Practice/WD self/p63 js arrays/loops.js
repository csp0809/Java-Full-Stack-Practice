let a=[1,83,5,6,99]

// for (let index = 0; index < a.length; index++) {
//     const element = a[index];
//     console.log(element)
    
// }

// a.forEach((value, index, arr)=>{
//     console.log(value, index, arr)
// })

// let obj ={
//     a:1,
//     b:2,
//     c:3
// }
// for (const key in obj) {
//     if (Object.prototype.hasOwnProperty.call(obj, key)) {
//         const element = obj[key];
//         console.log(key, element)
//     }
// }

for (const element of a) {
    console.log(element)
}