var Bus = /** @class */ (function () {
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Bus;
}());
// Example usage
var bus1 = new Bus("Mercedes", "Sprinter", 2022);
console.log(bus1);
