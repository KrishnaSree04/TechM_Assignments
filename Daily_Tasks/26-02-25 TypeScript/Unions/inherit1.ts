class Animal {
    name: string;
    species: string;

    constructor(name: string, species: string) {
        this.name = name;
        this.species = species;
    }
}

class Tiger extends Animal {
    roar(): void {
        console.log('${this.name} the ${this.species} is roaring!');
    }
}

// Example usage
let tiger1 = new Tiger("Sheru", "Bengal Tiger");
tiger1.roar();
