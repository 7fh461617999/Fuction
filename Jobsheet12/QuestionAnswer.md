## question answer in jobsheet 12
### Experiment 1 (Gratitude_11.java)
1. This keyword means the function does not return a value. It does its job and finishes.  
2. It is posible. We can sout this santance without call the other funtion.  
3. *Reusability* (Write Once, Use Anywhere): Imagine you need to say "Thank you" in 20 different places in your app.  
Ease to maintance :  
Without a function: You have to find and fix that typo in all 20 places you pasted the code.

With a function: You fix it inside the sayThankyou() function once, and it automatically updates everywhere that function is used.  

### Experiment 2 (Gratitude_11.java)  
1. It allows you to pass dynamic values (information) into the function so that the function can process different data each time it is called A function is flexible. sayAdditionalGreetings(String greeting) can print "Good Morning", "Hello", or "Selamat Pagi" depending on what you give it.  
2. Yes, exactly! A parameter is a variable, but it is a special kind.  
a. Declaration: It is declared inside the parentheses () of the function definition.  
b. Scope: It acts exactly like a local variable inside that function. You can use it, print it, or do math with it just like any other variable.  
c. The Difference: A normal variable (like int x = 5;) usually gets its value from you typing it in directly. A parameter gets its value from the caller when the function is run.  
3. This is a very important distinction :  
a. Parameters are for INPUT: In Java, parameters are primarily used to pass data into the function.  
b. Return Values are for OUTPUT: If you want to get data out of a function (like the result of a calculation), you typically do not use the parameter. Instead, you use the return keyword.  
### Experiment 3 (Gratitude_11.java)  
1. We need a return value when the main program needs the result of the function to do further work.
The Concept: If a function performs a task (like a calculation or getting user input) and produces a specific piece of data that you want to use outside of that function (for example, to store in a variable or use in a math equation), you must use a return value.
Example : the function getGreetingRecipient() asks the user for a name. It returns that name so that the main function can store it in the variable name and use it to build a specific sentence later.
Rule of Thumb: If you need to "remember" the answer, use a return value. If you just need to "show" the answer immediately and forget it, you might not need one.
2. Yes, absolutely. You can include a print statement inside a function that also returns a value.
The Impact: The function will do two things:
Side Effect: It will print the text to the console screen immediately when the line is executed.  
Return: It will still send the value back to the main program when it hits the return keyword.    
3. Yes, and actually, that is the only way to call it!   
Explanation: A function with void (no return value) does not produce any data to "hold." Therefore, you cannot save it into a variable. You simply call it as a command.  

### Experiment 4 ()