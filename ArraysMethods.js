//araay method for filtering out thr array under any given conditions.
let arr = [ 1,2,3,4,56,7,89];
let evenarr = arr.filter((val) =>  {
    return val % 2 === 0;

});
console.log(evenarr);

//using the reduce method for an aray it takes the values of the array and returns a single value.
let arri = [ 1,2,3,4];
 const output=arri.reduce ((res,curr) =>  {
    return res + curr;//here we are adding the sum of the elements of the array.
});
console.log(output);

//to print the largest from an array using array method
let arry = [56,36,24,78,990,78];
const direct = arry.reduce((first,next)  => {
    return first > next ? first : next;
})
console.log(direct);
