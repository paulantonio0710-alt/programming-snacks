const prompt = require('prompt-sync')();
let target = prompt('Enter target value: ');
let status = false;
    
for(let d1 = 1; d1 <= 9; d1++){
    for(let d2 = 1; d2 <= 9; d2++){
        for(let d3 = 1; d3 <= 9; d3++){
            if(d1 + d2 + d3 == target){
                console.log(`${d1} + ${d2} +  ${d3} =  ${target}`);
                status = true;
            }
            else{
                continue;
            }
        }
    }
}
if(!status){
     console.log(`No three distinct integers from 1 - 9 could sum up to ${target}`);
}
