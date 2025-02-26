class Car {
    engine: string;

    // Constructor should have a parameter
    constructor(engine: string) {
        this.engine = engine;
    }

    // Method should be inside the class
    disp(): void {
        console.log("Engine is: " + this.engine);
    }
}

// Creating an object and calling the method
let obj = new Car("Ford");
obj.disp();
