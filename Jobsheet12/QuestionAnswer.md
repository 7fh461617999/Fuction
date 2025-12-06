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

### Experiment 4 (ExpressingGratitude_11.java)
1. main is the entry point of any program. However, if we look at the flow of calls inside your program, the order of events is:
 1. main() starts: It is the first code to run.
 2. sayThankyou() is called: The main function commands this function to start.
 3. getGreetingRecipient() is called: Immediately inside sayThankyou(), this function is called to get the name.
2. Explanation: In the Java programming language, the compiler reads the entire class file at once. It does not matter if you write your helper functions (like sayThankyou) on line 5 and your main function on line 50, or vice versa.
3. done

### Experiment 5 (Experimrnt5_11.java)
1.Here are the answers regarding Experiment 5: Variable Arguments (Varargs) from your jobsheet.

1. Writing int... a indicates that the parameter a is a Variable Argument (Varargs). The three dots (...) tell the Java compiler: "I don't know exactly how many integers are coming. It could be one, ten, or even zero. Just take all of them and bundle them up.".Inside the function, Java automatically treats a as an array (int[] a). That is why the code in your jobsheet can uses a loop for (int i : a) to read the data. It provides flexibility. Without ..., you would need to define exactly how many inputs you expect (e.g., show(int a, int b, int c)), or force the user to create an array manually before calling the function.  
2.Since the jobsheet asks you to come up with these, here are three practical scenarios where professional developers use Varargs:

A. An "Addition" Calculator You want a function that can sum up numbers, but you don't know if the user wants to add 2 numbers or 50 numbers.

public int sumAll(int... numbers) {
    int total = 0;
    for(int num : numbers) {
        total += num;
    }
    return total;
}
// Usage: sumAll(1, 2); OR sumAll(10, 20, 30, 40, 50);

B. Text Joiner (Social Media) Imagine you want to combine hashtags for a post. The user might have 1 hashtag or 10.

public String combineHashtags(String... tags) {
    String result = "";
    for(String tag : tags) {
        result += "#" + tag + " ";
    }
    return result;
}
// Usage: combineHashtags("Java", "Coding", "Student");
C. Ordering a Pizza (Toppings) A customer might want just "Cheese," or they might want
 "Cheese, Pepperoni, Mushrooms, and Onions."

public void orderPizza(String size, String... toppings) {
    System.out.println("Ordering a " + size + " pizza with " + toppings.length + " toppings.");
}
// Usage: orderPizza("Large", "Cheese", "Pepperoni");
3. Strictly speaking: NO. You cannot have more than one varargs parameter in a single function definition.
Invalid Example: void tryThis(int... numbers, String... words) { ... } // ERROR!
Reason: The computer doesn't know where the list of numbers stops and the list of words begins.
However, you CAN mix normal parameters with ONE varargs. This is exactly what happens in your jobsheet Experiment 5.
Valid Example: void show(String str, int... a)
The Golden Rule: The varargs parameter (...) must always be the very last parameter in the list.

### Experiment 6 (Experimen6_11.java)  
1. the first step start in main and input the value of p, l, t . after input main call the area function for calculate the area,and calculate the Volume ,in caculate Volume funtion it call Calcuation of area for got the value of p*l .  
2. the program start by the main funtion call the jumlah funtion to get value of temp variable with input (1,1);and sum the input .afther that call tampil jumlah with inpt (temp,5) and call funtion jumlah again , after got the value of tampiljumlah,we call TampilHinggaKei Function with value of tampiljumlah.
3. A. Function with vs. Without Parameters
Without Parameters: Use this when the task is static (always the same).
Example: showMenu() – The menu options don't change, so you don't need to feed it data.

With Parameters: Use this when the task depends on dynamic input.
Example: calculateAge(int birthYear) – The calculation changes depending on the person, so you need to pass the birth year as a parameter.

B. Function with vs. Without Return Value
Without Return Value (void): Use this when the function is an action that doesn't produce a distinct "answer" for the computer to remember.
Example: saveFile() or printWelcomeMessage(). It just does the job and finishes.

With Return Value: Use this when the function is a question that the main program needs the answer to.
Example: getTemperature(). The main program needs the number back so it can decide whether to turn on the AC or the heater.

