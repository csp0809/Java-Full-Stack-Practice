let arr = [1, 2, 4, 5, 6]
// index   0, 1, 2, 3, 4

arr[0]=3107
// console.log(arr, typeof arr)
//will give type of the data stored in variable
// console.log(arr)
// console.log(arr.length)

// console.log(arr[0])
// console.log(arr[2])
// console.log(arr[4])

console.log(arr.toString())
// converts data of variable arr to string 
console.log(arr.join( " and "))

a=[1,2,3,4,5]
console.log(a)
console.log(a.pop())
// will displa last element of array a
a.push(100)
console.log(a)
// will add 100 at the end but to display 
// it in console we will have to use console.log 
a.push("git")
console.log(a)

console.log(a.shift())
// will remove and display first element in array a
console.log(a)

console.log(a.unshift("Chait"))
// will add and display first element in array a
console.log(a)

delete a[2]
//will empty the a[2] but memory is still allocated for that index
console.log(a)
console.log(typeof(a[2]))
//will display type of empty index

let numbers =[1, 2, 3, 4, 5]
// numbers.splice(1,3)
// console.log(numbers)
// will delete index 1,2,3 and will display remaining
numbers.splice(1,3,222,333)
console.log(numbers)
// will insert 222,333 in indexes of deleted places