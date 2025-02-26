class Car1 {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class SUV extends Car1 {
    offRoadCapable: boolean;

    constructor(make: string, model: string, year: number, offRoadCapable: boolean) {
        super(make, model, year);
        this.offRoadCapable = offRoadCapable;
    }

    toggleOffRoad(): void {
        this.offRoadCapable = !this.offRoadCapable;
        console.log(`Off-road mode is now ${this.offRoadCapable ? "enabled" : "disabled"}.`);
    }
}

// Example usage
let suv = new SUV("Jeep", "Wrangler", 2024, true);
suv.toggleOffRoad();
suv.toggleOffRoad();
