let a = prompt("Enter first number")

let b = prompt("Enter second number")
if(isNaN(a) || isNaN(b)){
    throw SyntaxError("This is not allowed")
}

let sum = parseInt(a) + parseInt(b)
// console.log("The sum is ", sum)

function main() {
    let x=1;
    try {
        console.log("The sum is ", sum*x)  
        return true

    } catch (error) {
        console.log("Error is present")
        return false
    }
    
    finally{
        console.log("Files are being closed and db connection is being closed")
    }
    
}