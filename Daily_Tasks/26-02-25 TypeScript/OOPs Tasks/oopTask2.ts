class Bus1 {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    start(): void {
        console.log(`The ${this.year} ${this.make} ${this.model} is starting...`);
    }
}

// Example usage
let bus2 = new Bus1("Volvo", "9400", 2023);
bus2.start();
