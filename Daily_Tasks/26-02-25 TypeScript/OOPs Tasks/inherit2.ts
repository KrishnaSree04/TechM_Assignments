class Person {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    employeeId: number;

    constructor(name: string, age: number, employeeId: number) {
        super(name, age); // Call the parent class constructor
        this.employeeId = employeeId;
    }
}

// Example usage
let employee1 = new Employee("Alice", 30, 101);
console.log(employee1);
