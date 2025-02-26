let someValue: any = "123";
let numericValue: number = parseInt(someValue);
console.log(numericValue);

let anotherValue: any = "456";
let assertedNumber: number = <number>(<unknown>anotherValue);
console.log(assertedNumber);