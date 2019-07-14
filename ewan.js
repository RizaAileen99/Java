

//-----------------------------------------------------------

// word = "wow"

// function isPalindrome(input){
//     var bin = ""
//     for (var i = input.length - 1; i >= 0; i--){
//         bin = bin + input[i];
//     }
//     if (bin == input){
//         return true;
//     }
//         return false;
// }

// console.log(isPalindrome(word));

//-----------------------------------------------------------

// function noSpace(sentence){
//     var sentence = sentence.split(" ");
//     var str = "";
//     for(x = 0; x<sentence.length;x++){
//         if(sentence[x] != ""){
//             str += (sentence[x]+" ");
//         } 
//     }
//     str=str.trim();
//     console.log(str);
// }
    
// noSpace("shinning       shimmering splendid     tell");

//-----------------------------------------------------------

// var months = ["Maaerch", "Maarch", "Feb"];

// function sortString(str){
//     //var arr = str.split(",");
//     var tmp = "";
//     for(var x = 0; x < str.length; x++){
//       for(var y = x + 1; y < str.length; y++){
  
//         if(str[x] > str[y]){
//           tmp = str[x];
//           str[x] = str[y];
//           str[y] = tmp;
//         }
//       }
//     }
    
//     console.log(str);
//   }

//   sortString(months)

  //-----------------------------------------------------------

  //console.log(String.fromCharCode(58));

//   var char;
//   for(char=65; char<=90;char++){
//     console.log(String.fromCharCode(char) + " ");
//   }

// function isStrongPassword(input){
//     var pass = input.split('');
//     //console.log(pass);
//     var numbers=0,upperLet=0,lowerLet=0,specialChar=0;
//     var char,upper,lower;
//     var special =["!","@","#","$","%","^","&","*","(",")","-","_","+","=",",",".",".","/","?"];

//     for(x=0;x<pass.length;x++){

//         for(spec=0; spec<special.length;spec++){
//             if(pass[x] == special[spec]){
//                 specialChar++;
//             }
//         }

//         for(num=48; num<=57;num++){
//             if(pass[x] == String.fromCharCode(num)){
//                 numbers++;
//             }
//         }

//         for(upper=65; upper<=90;upper++){
//             if(pass[x] == String.fromCharCode(upper)){
//                 upperLet++;
//             }
//         }

//         for(lower=97; lower<=122;lower++){
//             if(pass[x] == String.fromCharCode(lower)){
//                 lowerLet++;
//             }
//         }
//     }

//     if(specialChar>0 && numbers>0 && upperLet>0 && lowerLet>0 && pass.length>=8){
//         return true;
//     }else{
//         return false;
//     }
    // console.log(specialChar);
    // console.log(numbers);
    // console.log(upperLet);
    // console.log(lowerLet);
//}
//console.log(isStrongPassword("?Ra9"));
//console.log(isStrongPassword("?Ra9ooooo"));

//--------------------------------------------------------------------

// function isAmicable(input){
//     var a = getSum(input);
//     var b = getSum(a);

//     if(b==input && a!=b){
//         return true;
//     }else{
//         return false;
//     }
// }

// function getSum(number){
//     var sum = 0;
//     for(x=1;x<number;x++){
//         if(number%x == 0){
//             sum += x;
//         }
//     }
//     return sum;
// }

// console.log(isAmicable(16));
// console.log(isAmicable(220));

//--------------------------------------------------------------------

