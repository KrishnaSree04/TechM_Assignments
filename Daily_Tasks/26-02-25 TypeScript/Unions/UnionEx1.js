function myItems(items) {
    return new Array().concat(items);
}
var arrNum = myItems([10, 20, 30]);
var arrStr = myItems(["Type", "Java"]);
arrNum.push(50);
console.log(arrNum);
arrStr.push("Hello", "TypeScript");
console.log(arrStr);
