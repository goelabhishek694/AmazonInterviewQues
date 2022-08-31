
//  Give The Output Of Below Questions
//  Q1)
function Pet(name) {
    this.name = name;
    this.getName = () => this.name;
}
const cat = new Pet('Fluffy');
console.log(cat.getName());// What is logged? 
const { getName } = cat;
console.log(getName()); // What is logged? 


// Q2) 
const object = {
    message: 'Hello, World!',
    logMessage() {
        console.log(this.message);
        // What is logged? 
    }
};
setTimeout(object.logMessage, 1000);

// Q9) How can you call logMessagefunction so that it logs "Hello, World!" ? 
const object = {
    message: 'Hello, World!'
};
function logMessage() {
    console.log(this.message);
    // "Hello, World!" 
} 

// Q10)
const object = {
    who: 'World',
    greet() {
        return `Hello, ${this.who}!`;
    },
    farewell: () => {
        return `Goodbye, ${this.who}!`;
    }
};
console.log(object.greet()); // What is logged? 
console.log(object.farewell()); // What is logged? 
            
// Q11) Write a JS program to deep copy an object dynamically.You should not use JSON.Stringify or JSON.parse.Hint:: You can use recursion in this.

// <-----------------Live coding round questions --------------------->

// Q12) Display simple JSX
https://codepen.io/angelo_jin/pen/wvrygZa

// Q13) Display array of users to browser
https://codepen.io/angelo_jin/pen/QWqQdXE

// Q14) Show/Hide Element on Screen
https://codepen.io/angelo_jin/pen/zYERZZL

// Q15) 2 way data binding in ReactJS
https://codepen.io/angelo_jin/pen/MWEQmqN

// Q16) Disable a button
https://codepen.io/angelo_jin/pen/YzrazGY

// Q17) Update the parent state
https://codepen.io/angelo_jin/pen/JjrLjOy

// Q18) Dynamically add child components (React Children)
https://codepen.io/angelo_jin/pen/BawrpeX

// Q19) Sum of Two Numbers
https://codepen.io/angelo_jin/pen/zYEWZNR

// Q20) Create Counter App
https://codepen.io/angelo_jin/pen/mdBxWwN

// Q21) Fetch data from an API
https://codepen.io/angelo_jin/pen/oNGqZpm
