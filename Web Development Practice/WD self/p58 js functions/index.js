// console.log("Hey Git you are nice!")
// console.log("Hey Git you are good!")
// console.log("Hey Git your hair is nice!")
// console.log("Hey Git your tshirt is good too!")

/* instead of changing name manually we can use a function 
and make the name a variable which we can 
change by assiigning it a different value. */


// function nice(name) {
//     console.log("Hey " + name + " you are nice!")
//     console.log("Hey " + name + " you are good!")
//     console.log("Hey " + name + " your hair is nice!")
//     console.log("Hey " + name + " your tshirt is good too!")
// }

// nice("Chaitanya")

// nice("Git")


// Creating a function to add 2 nos 
function sum(a,b, c=3) {
    // console.log(a+b)
    return a+b+c
    // will return the value in the variable
}

result = sum(3,4)
result1 = sum(5,4)
result2 = sum(6,4)

console.log("The sum of these numbers is : ", result)
console.log("The sum of these numbers is : ", result1)
console.log("The sum of these numbers is : ", result2)

const funct1 =(x)=>{
    console.log("I am an Arrow function", x)
}

funct1(34)
funct1(54)
funct1(348)
