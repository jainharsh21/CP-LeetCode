# Minimum Number Of Insertion and Deletion 

Two Strings are given...we have to find the minumum number of insertion and deletion required to convert String 1 into String 2

So first we'll convert the String 1 to the LCS and then we'll convert it to String 2...and we'll note down the insertion and deletion in the conversion

Number of deletion would be -> a.length() - LCS
Number of insertion would be -> b.length() - LCS
