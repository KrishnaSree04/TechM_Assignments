var People = /** @class */ (function () {
    function People(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    return People;
}());
// Example usage
var student2 = new People("Bob");
var student3 = new People("Charlie", 101);
console.log(student2);
console.log(student3);
