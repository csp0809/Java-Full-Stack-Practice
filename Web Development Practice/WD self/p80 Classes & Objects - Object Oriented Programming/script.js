// let obj={
//     a:1,
//     b: "Chaitanya"
// }

// console.log(obj)

// let animal= {

//     eats: true
// };
// let rabbit={
//     jumps: true
// };
// rabbit.__proto__=animal;
// // sets rabbit.[[prototype]]= animal

class Animal{
    constructor(name){
        this.name= name
        console.log("Object is created.. ")
    }
    eats(){
        console.log("He is eating")
    }
    jumps(){
        console.log("He is jumping")
    }
}

class Lion extends Animal{
    constructor(name){
        super(name)
        console.log("Object is created and he is a lion ")
    }
    eats(){
        super.eats()
        console.log("He is eating while Roaring")
    }
}

let a= new Animal("Bunny");
console.log(a)

let l= new Lion("Sher")
console.log(l);