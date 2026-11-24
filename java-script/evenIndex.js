const prompt = require('prompt-sync')();
let word = prompt('Type in a word: ');

for(let count = 0; count < word.length; count += 2){
    console.log(`'${word.at(count + 1)}'`);
}
