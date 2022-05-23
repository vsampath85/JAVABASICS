**Project Name: JAVABASICS - Greeting App**

**INTRODUCTION:**
The project is to display the greeting message based on the time of the day. This project was created as part of the sparta global Week 1 Java Class.

**Technologies:**
 -JDK
 -Maven
 -Junit-jupiter(test framework)

**Java class:**

-Create  App class in java scr main folder
-Created main method App class
-creating int variable and initialisation the variable
-creating string variable name as welcomeMessage and assigning by calling greeting method.

The App takes the 'timeoftheday' as input and returns appropriate greeting message to the user.

- Between 0 hrs to 12 hrs it greets the user 'GOOD MORNING'
- Between 12 hrs to 18 hrs it greets the user 'GOOD AFTERNOON'
- Between 18 hrs to 20 hrs it greets the user 'GOOD EVENING'
- Between 20 hrs to 24 hrs it greets the user 'GOOD NIGHT'

Finally, it reports the user with error message for any other time values as 'INVALID TIME'

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
-Initalise the new git project from the source code folder, using 'git init'
-Check the status and add the following items to the project, using 'git add xxx'
(.idea, src, test)
- Commit the changes to the git project, using 'git commit -m "Comments"'