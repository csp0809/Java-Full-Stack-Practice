console.log("Hello I am conditional tutorial")

let age = 3;
let grace =2;

age +=grace

console.log(age)
console.log(age + grace)
console.log(age - grace)
console.log(age / grace)
console.log(age * grace)
console.log(age ** grace)
// ** is power function  
console.log(age % grace)

if(age >18){
    console.log("You can drive")
}
else{
    console.log("You cannot drive")
}

// === operator compares type of data as well and then gives out result(true/false)

// if(age+grace >18){
//     console.log("You can drive")
// }
// else{
//     console.log("You cannot drive")
// }

a=6;
b=8;

let c = a > b ? (a-b) : (b-a);

/* Tanslates to :
if (a>b){
let c = a-b;
}
else{
let c = b-a;
} */