function myItems<T>(items: T[]):T[]{
    return new Array<T>().concat(items)
}

let arrNum=myItems<number>([10,20,30]);
let arrStr=myItems<string>(["Type","Java"])
arrNum.push(50);
console.log(arrNum);
arrStr.push("Hello","TypeScript");
console.log(arrStr);