# Explaination
Use for loop to loop each index of the word and find the longest palindrome length by using 2 steps.

First, the start index must be higher than 0 and the end index must be lesser than the word length then compare the char at the start and the end index, if both conditions are met, do expand the index. this will get the palindrome word.

Second, check if the new palindrome word has a longer length or not, if it has then save its first index and the word's length to the variable.

After the loop finish, the function will return the longest palindrome string.
