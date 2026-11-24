const prompt = require('prompt-sync')();
let word = (prompt('Enter your 13 digit ISBN: '));
let sum = 0;
for(let count = 0; count < word.length - 1; count++){
    let number = Number(word.at(count))
    if (count % 2 == 0){
        sum += number;
    }
    else{
        sum += number * 3;
    }
}
let lastDigit = 10 - (sum % 10);
if(lastDigit == Number(word) % 10){
    console.log(`${word} is a valid ISBN`);
    console.log(sum);
}
else{
    console.log(`${word} is not a valid ISBN`);
}
