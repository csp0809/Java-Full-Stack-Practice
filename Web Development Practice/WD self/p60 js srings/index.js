console.log("This is String tutorial")
let a="Chaitanya";
console.log(a[0]);
console.log(a[1]);
console.log(a[2]);
console.log(a[3]);
console.log(a[4]);
console.log(a[5]);
console.log(a[6]);
console.log(a[7]);
console.log(a[8]);

console.log(a.length);

let name1 ="chait"
let friend = "git"
console.log("His name is "+ name1 + " and his friend's name is "+ friend)
console.log(`His name is ${name1} and his friend's name is ${friend}`)

let b= "Sonu"
console.log(b.toUpperCase())
console.log(b.toLowerCase())
// to run functions we need ()
console.log(b.length)
// we dont need to add () to run a property
console.log(b.slice(1,3))
// slice(1,3) will give char at index 1,2 i.e char at 1=>char> 3 in output
console.log(b.slice(1))
//will give all chars from char at index 1 till end of string

console.log(b.replace("So","Mo"))
//will replace one with another
console.log(b.concat(a))
// will concatinate values of a and b varibles
console.log(b.concat( a, " Patil"))
// will concatinate a,b and all the Strings provided as well
// Please check notes from codewithharry and explore remaining functions and properties