# Count of Subsets With A Given Sum

In this problem an array and a sum would be given as i/p
Here we don't just check if there exists a subset or not,instead we count the number of subsets whose sum would be equal to the given sum

In case of initialization all the cells which had false as their value would have 0 now(since no subsets present) and all the values which were true would have 1(only subset that is possible to have 0 sum is null subset)

The code is same as subset sum,just change the OR sign to '+' sign and return the last cell which would have the count