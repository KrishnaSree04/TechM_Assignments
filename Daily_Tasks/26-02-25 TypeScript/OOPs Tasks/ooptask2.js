var Bus1 = /** @class */ (function () {
    function Bus1(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Bus1.prototype.start = function () {
        console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is starting..."));
    };
    return Bus1;
}());
// Example usage
var bus2 = new Bus1("Volvo", "9400", 2023);
bus2.start();
