class Students {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0; // Ensure age is positive, else set to 0
    }
}

// Example usage
let student4 = new Students("David", 20);
let student5 = new Students("Eve", -5);

console.log(student4);
console.log(student5);
