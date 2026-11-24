const prompt = require('prompt-sync')();
let word = prompt('Type in a word: ');

let vowelCount = 0;
let consonantCount = 0;

for(let count = 0; count < word.length; count++){
    if(word.at(count) == 'a' || word.at(count) == 'e' || word.at(count) == 'i' || word.at(count) == 'o' || word.at(count) == 'u'){
        vowelCount += 1;
    }
    else{
        consonantCount += 1;
    }
}
console.log(vowelCount);
console.log(consonantCount);
