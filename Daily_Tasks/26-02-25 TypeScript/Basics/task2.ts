function variableScope() {
    var varVariable = "I'm var"; // Function-scoped
    let letVariable = "I'm let"; // Block-scoped
    const constVariable = "I'm const"; // Block-scoped, immutable
    console.log(varVariable, letVariable, constVariable);
}
variableScope();