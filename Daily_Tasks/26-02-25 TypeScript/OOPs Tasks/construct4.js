var Students = /** @class */ (function () {
    function Students(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0; // Ensure age is positive, else set to 0
    }
    return Students;
}());
// Example usage
var student4 = new Students("David", 20);
var student5 = new Students("Eve", -5);
console.log(student4);
console.log(student5);
