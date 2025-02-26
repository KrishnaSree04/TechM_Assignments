class People {
    name: string;
    rollNumber: number | undefined;

    constructor(name: string);
    constructor(name: string, rollNumber: number);
    constructor(name: string, rollNumber?: number) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

// Example usage
let student2 = new People("Bob");
let student3 = new People("Charlie", 101);

console.log(student2);
console.log(student3);
