const prompt = require('prompt-sync')();
let text = prompt('Enter a word: ');
    
for(let count = 0; count < text.length; count++){
     console.log(text.at(count));
}
