# Print Shortest Common Supersequence

In this,we have to print the shortest common supersequence

Here we'll do the same thing as printing LCS,changes would be...suppose if char doesnt match, we would store the max out of the two chars

Also, suppose either of the looping variables become 0...so the loop will stop...but if any of the looping variables become 0...we have to store the remaining part of the other one...hence we'll apply two for loops in the end so that none of the strings remain empty
