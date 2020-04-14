# Arrays-Java-Inbuilt-Lists-Autoboxing-and-Unboxing

1. Arrays: The concepts of Array in Java.
         
2. ArrayTest:

         (1) Create a program using arrays that sorts a list of integers in descending order. Descending order is highest value to                lowest. In other words if the array had the values in it 106, 26, 81, 5, 15 your program should ultimately have an array with            106, 81, 26, 15, 5 in it. Set up the program so that the numbers to sort are read in from the keyboard.
         
         (2) Implement the following methods - getIntegers, printArray, and sortIntegers
         
                (i) getIntegers returns an array of entered integers from keyboard
                (ii) printArray prints out the contents of the array
                (iii) sortIntegers should sort the array and return a new array containing the sorted numbers
         
         you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the          new sorted array.

3. ReferenceVsValueType: The concepts between reference type & value type in Java.

4. MinElement:

         (1) Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to              enter. The method needs to read from the console until all the numbers are entered, and then return an array containing the              numbers entered. 
         
         (2) Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array. 
         
         (3) In the main() method read the count from the console and call the method readIntegers() with the count parameter. 

         (4) Then call the findMin() method passing the array returned from the call to the readIntegers() method. Finally, print the            minimum element in the array.

         (5) Tips: 
	         
                  Assume that the user will only enter numbers, never letters
	         For simplicity, create a Scanner as a static field to help with data input

5. ReverseArray:

	(1) Write a method called reverse() with an int array as a parameter. The method should not return any value. In other words, 		the method is allowed to modify the array parameter.

	(2) In main() test the reverse() method and print the array both reversed and non-reversed. To reverse the array, you have to 		swap the elements, so that the first element is swapped with the last element and so on. For example, if the array is {1, 2, 3, 	4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

6. ArrayList: The concepts of ArrayList in Java.

7. ArrayListTest: 

      (1) Create a program that implements a simple mobile phone with the following capabilities. Able to store, modify, remove and 		 query contact names. You will want to create a separate class for Contacts (name and phone number). Create a master class 		 (MobilePhone) that holds the ArrayList of Contacts.
	 
	 (2) The MobilePhone class has the functionality listed above. Add a menu of options that are available.
         
	 (3) Options: Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact. 		 When adding or updating be sure to check if the contact already exists (use name). Be sure not to expose the inner workings of  	  the Arraylist to MobilePhone e.g. no ints, no .get(i) etc. MobilePhone should do everything with Contact objects only.
	 
8. BankingApplication:

         (1) You job is to create a simple banking application. There should be a Bank class. It should have an arraylist of Branches.
         Each Branch should have an arraylist of Customers. The Customer class should have an arraylist of Doubles (transactions).

	   	(i) Customer: 
			Name, and the ArrayList of doubles.

		        (ii) Branch: 
         		Need to be able to add a new customer and initial transaction amount.
        		Also needs to add additional transactions for that customer/branch.

        	(iii) Bank:
         		Add a new branch
         		Add a customer to that branch with initial transaction
        		Add a transaction for an existing customer for that branch
         		Show a list of customers for a particular branch and optionally a list of their transactions
         		Demonstration autoboxing and unboxing in your code

	(2) Hint: 

		(i) Transactions

        (ii) Add data validation.
         		e.g. check if exists, or does not exist, etc.

		(iii) Think about where you are adding the code to perform certain actions.
		
		
