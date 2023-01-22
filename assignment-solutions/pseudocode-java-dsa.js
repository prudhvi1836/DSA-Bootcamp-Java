// -----------------------------------------pseudocode for leap year---------------------------------------------------

// 1. Take input of year
// 2. if year%400 == 0 or (year%4 == 0 and year%100 != 0) print leap year
// 3. Else print not a leap year



// -----------------------------------------pseudocode for  LCM ---------------------------------------------------

// 1. take input of  two numbers n1 and n2 
// 2. if condition to find smallest between two input numbers let it be min 
// 3. run infinite loop and inside the loop check if (min % n1 == 0 and min % n2 == 0)
// 4. if satisfied above condition print the min value break from loop
// 5. else min++

// -----------------------------------------pseudocode for  HCF/GCD  ---------------------------------------------------

// 1. Take input of  two numbers n1 and n2 
// 2. Run loop from i = 1 to i <=n1 and i <=n2
// 3. Check if n1 % i == 0 and n2 % i == 0 
// 4. If true then update hcf variable to i 
// 5. hcf variable will be updated based on i and step 3 condition


//                                                       (or)


// 1. we know n1*n2 = (hcf of n1 ,n2 ) * (lcm of n1 ,n2)
// 2. so for HCF we need (n1*n2) / (lcm of n1 ,n2)


let a=[1,2,3]
let b=a
b.push(18);
console.log(a,b);