## Exercise: AtmPin (12 Points)

The project name of this exercise is **AtmPin** Problem Description

The purpose of this assignment is to learn how to do intermediate comparisons as well as learning when to create instance variables. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

The detailed description of this problem comes from the Programming Exercise P5.9 that is in the book (pages 233 & 234).

You are writing a small section of an ATM machine where you accept a string that is a password and accept it or reject it. If the user tries more than three times with a bad password the card is blocked. The password must be fixed at "1234". Security is a priority!

Your AtmPin.java should contain code to test your AtmPin solution. Be sure to test the cases where you 1, 2 and 3 attempts are made.

### Getting Started

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **AtmPin.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](https://github.com/sbcc-cs105-spring2016/HowToStartEveryProject) create a source file called **AtmPin.java**. This is where your code will go. It should have a main function and a function `public static PinValidationResult validatePin(String pin, int incorrectCount)`. It takes two parameters, a String containing the PIN the user entered and the number of times the PIN has been entered incorrectly. The function returns an enumeration that indicates the result of the validation process. It looks like the following:

```java
public enum PinValidationResult {
    UNLOCKED_PIN_CORRECT,
    UNLOCKED_PIN_INCORRECT,
    LOCKED
}
```

Starting this week we don't have any code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation

Now go through AtmPin.java, add the proper headers as in past assignments and then change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed.

Once you've written your code run the code by single clicking on **AtmPin.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)
