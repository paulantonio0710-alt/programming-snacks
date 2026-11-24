const prompt = require('prompt-sync')();
let count = 0;
let sum = 0;
let number = Number(prompt('Enter number(press -1 to end): '));
while(number != -1){
    ++count;
    sum += number;
    let average = Math.floor(sum / count * 100) / 100;
    console.log(average);
    number = Number(prompt('Enter number(press -1 to end): '));
}
