Tasks to answer in your own README.md that you submit on Canvas:

1.  See logger.log, why is it different from the log to console?

        -Within logger.log, all tests are logged rather than one specific test 
        within the console. Further reports that aren't displayed in console are also
        seen within the logger (such as warning messages).

2.  Where does this line come from? FINER org.junit.jupiter.engine.execution.ConditionEvaluator logResult Evaluation of condition [org.junit.jupiter.engine.extension.DisabledCondition] resulted in: ConditionEvaluationResult [enabled = true, reason = '@Disabled is not present']

        -It comes from an exception which is resulted from a disabled evaluation/condition that is
        instead true (not getting the disabled evaluation).

3.  What does Assertions.assertThrows do?

        - Assertions.assertThrows allows you to test expected exceptions. It can fail however if a different exception or no exception occurs.

4.  See TimerException and there are 3 questions
    1.  What is serialVersionUID and why do we need it? (please read on Internet)
    
            -serialVersionUID is a unique identifier for each class. We need it to ensure that the same class that was used during serialization is also properly loaded during the deserialization.
    2.  Why do we need to override constructors?
    
            -By overriding constructors, it allows us to customly incorporate attributes for the parameters. Typically, however it is not possible to override a supers constructor
    
    3.  Why we did not override other Exception methods?	
    
            -Because it is unnecessary for this current assignment, but also sometimes its not possible for specific scenarios
    
5.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)

        -The static block is executed when the class is first loaded into a JVM. (It is just executed once when the class is loaded into memory

6.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)

         -The readme file format uses markdown syntax and contains text, which is what bitbucket data center and server uses for formatting text

7.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)

        -The issue is that because the timeToWait is -1, it goes into the conditional statement and throws the exception, however the “timeNow” value is null when subtracting from the system's current time. To fix, instead throw a null pointer exception while calling the “info” function of the logger, which will fix the issue. Alternatively, throwing a null pointer exception rather than a timer exception if the timeToWait < 0 would fix the issue.
        
8.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)

         - The issue here is that theres two different exceptions occurring and that first a timer exception is thrown, however at the end then a null pointer exception is thrown, which is unhandled within the tester for this specific exception, thus causing it to fail

9.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel) 
                   
        -(are contained in the file when uploaded)
10.  Make a printScreen of your eclipse Maven test run, with console
11.  What category of Exceptions is TimerException and what is NullPointerException

    -The category of TimerException is a runtime exception. A NullPointerException is a runtime exception where an object has a null value and thus when that object is used in any way (such as calling a function with it) it will throw the NullPointerException

12.  Push the updated/fixed source code to your own repository.

    -pushed to my repository under "Lab 10 CSI3471"
