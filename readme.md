**Project Name: JAVABASICS - Greeting App**

**INTRODUCTION:**
The project is to display the greeting message based on the time of the day. This project was created as part of the sparta global Week 1 Java Class.

**Technologies:**
 - JDK
 - Maven
 - Junit-jupiter(test framework)

**Test:**

Eg Test Code:

@Test
@DisplayName("check that we can return Good Evening")
void checkWeCanReturnGoodEvening(){
Assertions.assertEquals("Good Evening",App.greeting(19));
}

Execute the test as Junit-Jupiter.

**Version Management**
Git
- Initalise the new git project from the source code folder, using 'git init'
- Check the status and add the following items to the project, using 'git add xxx'
(.idea, src, test)
- Commit the changes to the git project, using 'git commit -m "Comments"'

**Greeting App**

- Create  App class in java scr main folder
- Created main method App class
- Creating int variable and initialisation the variable
- Creating string variable name as welcomeMessage and assigning by calling greeting method.

The App takes the 'timeoftheday' as input and returns appropriate greeting message to the user.

- Between 0 hrs to 12 hrs it greets the user 'GOOD MORNING'
- Between 12 hrs to 18 hrs it greets the user 'GOOD AFTERNOON'
- Between 18 hrs to 20 hrs it greets the user 'GOOD EVENING'
- Between 20 hrs to 24 hrs it greets the user 'GOOD NIGHT'

Finally, it reports the user with error message for any other time values as 'INVALID TIME'

**Fibonacci**

This program will be generating the nth value in the fibonacci series and the test(s) were created to validate the functionality.

The suggested template code was used to create the class which uses 'recursive' call the method to generate the nth fibonacci value.

Below are the list of test created to validate the functionality,

    1. Check the 3rd value is 2
    2. Check the 3rd value is 2
    3. Check the 10th value is 55
    4. Check the 0 value is 0
    5. Check the -1 value is 0

**Palindrome**

This program will be checking the given String, Sentence & String array is a palindrome ignoring case.

Below are the list of test created to validate the functionality,

    1. check that the given word is palindrome or not
    2. check that the given string of word is palindrome or not
    3. check that the casesensitive word is palindrome or not
    4. check that the given String arryay is palindrome or not
    5. check that the given null is palindrome or not
    6. check that the given sentence is palindrome or not

