## Exercise: AtmPin (12 Points)

The project name of this exercise is **AtmPin** Problem Description

The purpose of this assignment is to learn how to do intermediate comparisons as well as learning when to create instance variables. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

The detailed description of this problem comes from the Programming Exercise P3.32 that is in the book (pages 131, of the _Late Objects_ version).

You are writing a small section of an ATM machine where you accept a string that is a password and accept it or reject it. If the user tries more than three times with a bad password the card is blocked. The password must be fixed at "1234". Security is a priority!

Your **AtmPin.java** should contain code to test your AtmPin solution. You need to implement a method, `validatePin` that takes a string, representing the pin code, and an integer, which indicates which how many attempts the user has already made. Be sure to test the cases where you 1, 2 and 3 attempts have been made.

### Getting Started

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **AtmPin.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://209.129.49.15:7990/projects/CS105/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **AtmPin.java**. This is where your code will go. It should have a main function and a function `public static PinValidationResult validatePin(String pin, int incorrectCount)`. It takes two parameters, a String containing the PIN the user entered and the number of times the PIN has been entered incorrectly. The function returns an enumeration that indicates the result of the validation process. It looks like the following:

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

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked from to create your project).

<img src="https://www.dropbox.com/s/p40wg00a72khhpv/create-pull-request.png?dl=1" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:

<img src="https://www.dropbox.com/s/rrgmvpc9wtfjqrr/pull-request-screen-first.png?dl=1" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://www.dropbox.com/s/r9cmia1ixppglko/pull-request-master.png?dl=1" width="600" height="250" />

2\. Select **Select Branch**

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://www.dropbox.com/s/mglhiaeqd2qn72p/pull-request-description.png?dl=1" width="514" height="325" />

5\. Under **Title**.

6\. Under **Description**.

7\. Finally, click on **Create**
