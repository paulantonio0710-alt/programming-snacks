const prompt = require('prompt-sync')();
let text = prompt('Enter a word: ')
let reversed = "";
for(let count = 0; count < text.length; count++) {
    reversed = text.at(count) + reversed;
}
if(reversed == text){
    console.log(`${reversed} is a palindrome.`);
}
else{
    console.log(`${text} is not a palindrome.`);
}
