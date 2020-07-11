

Kata Questions and Answers

1. To what extent did the design decisions you made when writing the original programs make it easier or harder to factor out common code?

	Ans: refactor the code was easier, everything was pretty much done. I needed to do similar tasks on both scenarios, as follows:

	a. Open and read the source of information ( *.dat file )
	b. Some validation is required to handle empty lines and the format of the info depending on which file we are currently working.
	c. Do some comparison with some known fields to determine the output based on some requirements, which require comparing and compute these fields.
	d. Printing the result accordingly.


2. Was the way you wrote the second program influenced by writing the first?

	Ans: Yes, I was almost copy and pasting everything as I found I was duplicating efforts, the goal of the second part had pretty much the same logic, there were small differences, just the name of the fields, the file name, things lile that.


3. Is factoring out as much common code as possible always a good thing? 

	Ans: I do agree to create a way to have as much common code as possible, this has pros and cons, it depends on what you need or what are your business requirements. I'm in favor of creating your own Frameworks, libraries, etc, when possible, so you can reuse your code. 
	
	This is not always good, it depends on the situation, requirements, architecture, etc.

   Did the readability of the programs suffer because of this requirement? 
   
   Ans: No, indeed the code looks cleanner.
   
   How about the maintainability?
   
   Ans: If we have a new requirement, you should be touching less code and you'll be working less time on something if you have a code-base with common functionality, if should be easier to implement a new feature if you don't need to write it from scratch, I'm in favor to leverage as much code as possible, if it's not required,.. we don't need to reinvent the wheel  :o)
   