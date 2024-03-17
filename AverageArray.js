//code for prining the average of an array
let marks = [23,45,67,89];

let sum = 0;



for(let idx=0;idx<marks.length;idx++) {
   sum += (marks[idx]);
}
console.log(sum);

let avg = sum/marks.length;
console.log(`average marks of the class is ${avg}`);
