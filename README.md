# WordProcessing
This is a machine learning project, to have input text be read and the machine can produce coherent output.

The goal is for the machine to take in a sentence, and give each word in the sentence two associations, the word on the left of it, and the word on the right. Then organize the words and their associations in a 2D array
So Words X IndexAssociations is the array layout.
Then each word keeps track of which word came before it and followed it the most times, and it forms a sentence based off of a topic word and the words that followed and were before it the most.
