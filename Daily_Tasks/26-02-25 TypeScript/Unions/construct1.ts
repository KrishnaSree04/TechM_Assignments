class Student {
    name: string;
    class: string;

    constructor(name: string, studentClass: string) {
        this.name = name;
        this.class = studentClass;
    }
}

// Example usage
let student1 = new Student("Alice", "10th Grade");
console.log(student1);
