var Car = /** @class */ (function () {
    // Constructor should have a parameter
    function Car(engine) {
        this.engine = engine;
    }
    // Method should be inside the class
    Car.prototype.disp = function () {
        console.log("Engine is: " + this.engine);
    };
    return Car;
}());
// Creating an object and calling the method
var obj = new Car("Ford");
obj.disp();
