//array methods
let stuffs = ["pen","pencil","specs"];
stuffs.push("scissors","perfume");//this is used to add elements in the end of an array
console.log(stuffs);
console.log(stuffs.toString());//this is how we convert an array to a string

let things = [1,2,3,4,5,6];
let deletedthings = things.pop();//pop method deleats the last element from the array and returns the deletedd element
console.log(things);
console.log(deletedthings);

let sub = ["eng","maths","science"];
let machine = ["computer","mobile","tab"];
let collection = sub.concat(machine);//by this method we can merge two arrays
console.log(collection);
sub.unshift("bio");//for adding an element in the beginning of array\
sub.shift();//this mnethod delets the first element 
