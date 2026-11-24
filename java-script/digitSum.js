for(let d1 = 1; d1 <= 9; d1++){
    for(let d2 = 0; d2 <= 9; d2++){
        for(let d3 = 0; d3 <= 9; d3++){
             let dOneSquare = d1 * d1;
             let dTwoSquared = d2 * d2;
             let dThreeSquared = d3 * d3;
             
             let sum = dOneSquare + dTwoSquared + dThreeSquared;
             let whole = (d1 * 100) + (d2 * 10) + (d3);
             if(sum == whole){
              console.log(whole);
        }
    }
  }
}
