class Vehicle {
    make: string;
    model: string;

    constructor(make: string, model: string) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    constructor(make: string, model: string) {
        super(make, model);
    }
}

class SportsCar extends Car {
    speed: number;

    constructor(make: string, model: string, speed: number) {
        super(make, model);
        this.speed = speed;
    }

    displayDetails(): void {
        console.log('Sports Car: ${this.make} ${this.model} with top speed of ${this.speed} km/h');
    }
}

// Example usage
let sportsCar1 = new SportsCar("Ferrari", "488 GTB", 330);
sportsCar1.displayDetails();
