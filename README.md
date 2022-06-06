Instructions:
1.	This is a group assignment. Please form a group of 2 to 3 students and work on this assignment together.
2.	Please include a summary of your group work. (10 points)
3.	Please document your classes and methods in javadoc style while writing code. 
4.	Please submit your Java code and JUnit tests to canvas individually.
5.	Each problem is worth 30 points, including 5 points for java doc and 5 points for tests.
6.	The instructor will conduct a code walk after the homework deadline.


Problem 1 [Source Savitch PP 5 - 8] (30 points)
Programming Project 4.12 asked you to create a PizzaOrder class that stores an order consisting of up to three pizzas. Extend this class with the following methods and constructor:
●	public int getNumPizzas()— returns the number of pizzas in the order.
●	public Pizza getPizza1()— returns the first pizza in the order or null if pizza1 is not set.
●	public Pizza getPizza2()— returns the second pizza in the order or null if pizza2 is not set.
●	public Pizza getPizza3()— returns the third pizza in the order or null if pizza3 is not set.
●	A copy constructor that takes another PizzaOrder object and makes an independent copy of its pizzas. This might be useful if using an old order as a starting point for a new order.
Write a main method to test the new methods. Changing the pizzas in the new order should not change the pizzas in the original order. For example,
Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
PizzaOrder order1 = // Code to create an order
order1.setNumPizzas(2); // 2 pizzas in the order order1.setPizza1(pizza1); // Set first pizza order1.setPizza2(pizza2); // Set second pizza
double total = order1.calcTotal(); // Should be 18+20 = 38 
PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor 
order2.getPizza1().setNumCheeseToppings(3); // Change toppings
double total = order2.calcTotal(); // Should be 22 + 20 = 42 
double origTotal = order1.calcTotal(); // Should still be 38
Note that the first three lines of code are incomplete. You must complete them as part of the Programming Project.


Problem 2 [Source Savitch PP 6 - 15] (30 points)
Programming Project 4.12 asked you to create a PizzaOrder class that stores an order consisting of up to three pizzas. Modify the class to store the pizzas using an array. This will allow the class to include an arbitrary number of pizzas in the order instead of a maximum of three. The setNumPizzas method can be used to create an array of the appropriate size. The array structure allows you to eliminate the methods setPizza1, setPizza2, and setPizza3 and replace them with a single method,  setPizza(int index, Pizza newPizza). Include appropriate tests to determine if the new PizzaOrder class is working correctly.

Problem 3 [Source Savitch PP 6 - 14] (30 points)
Traditional password entry schemes are susceptible to “shoulder surfing” in which an attacker watches an unsuspecting user enter his or her password or PIN number and uses it later to gain access to the account. One way to combat this problem is with a randomized challenge-response system. In these systems, the user enters different information every time based on a secret in response to a randomly generated challenge. Consider the following scheme in which the password consists of a five-digit PIN number (00000 to 99999). Each digit is assigned a random number that is 1, 2, or 3. The user enters the random numbers that correspond to their PIN instead of their actual PIN numbers.
For example, consider an actual PIN number of 12345. To authenticate it, the user would be presented with a screen such as the following:
PIN: 				0 1 2 3 4 5 6 7 8 9
Random NUM: 		3 2 3 1 1 3 2 2 1 3
The user would enter 23113 instead of 12345. This does not divulge the password even if an attacker intercepts the entry because 23113 could correspond to other PIN numbers, such as 69440 or 70439. The next time the user logs in, a different sequence of random numbers would be generated, such as the following:
PIN: 		0 1 2 3 4 5 6 7 8 9
NUM: 		1 1 2 3 1 2 2 3 3 3
Your program should simulate the authentication process. Store an actual PIN number in your program. The program should use an array to assign random numbers to the digits from 0 to 9. Output the random digits to the screen, input the response from the user, and output whether or not the user’s response correctly matches the PIN number.
![image](https://user-images.githubusercontent.com/101040143/172130368-7a05ab44-d51e-4eff-9839-6fbb435b18f9.png)
