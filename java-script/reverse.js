const prompt = require('prompt-sync')();
let word = prompt('Enter a word: ');
let reversed = '';
for(let count = 0; count < word.length; count++){
    reversed = word.at(count) + reversed;
}
console.log(reversed);
