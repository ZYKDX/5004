'please include a summary of your group work' - briefly introduce the ideas for each .java file. 
1. in Pizza.java we added a copy constructor to prevent privacy leak in subsequent getPizza() methods
2. in PizzaOrder.java we followed the instructions, and used the copy constructor in Pizza to create independent copy of pizza
3. in PizzaOrder2.java we used an array to store references to pizza objects; in setNumPizzas, when numPizzas is changed, we move all the pizzas from previous order to the new order
4. in PinAuthencation.java, we used int array to store user set pins (0-9), int array to store randomized int between 1-3 assigned to each digit (0-9), used int array to store user pin 1-3 integer login. Tested in main().




/*
  changes I made:
  1. I changed pizza size values from 's, m, l, S, M, L' to 'small, medium and large' (indifferent to HW3 requirements)
  2. in Pizza class, there is a constructor 
     public Pizza(int pepperoniTopping) 
     not sure how it is used
  3. in PizzaOrder2 class, user will index pizzas from 1   instead of 0
  4. in Pin class, userLogin method:
     removed the (getNumericValue(c) >= 1 && getNumericValue(c) <=3) --- this is allowed (valid) (of course not correct password)

*/