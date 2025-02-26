class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }
}

class Circle extends Shape {
    radius: number;

    constructor(color: string, radius: number) {
        super(color);
        this.radius = radius;
    }
}

// Example usage
let circle1 = new Circle("Red", 5);
console.log(circle1);
