# Division by Zero Error in Java

This repository demonstrates a common error in Java programming: division by zero. The `bug.java` file contains code that attempts to divide an integer by zero, which results in an `ArithmeticException`. The `bugSolution.java` file provides a corrected version of the code that handles potential division by zero errors.

## Bug Description

The bug is a simple division by zero. When the program executes `int z = x / y;`, where `y` is 0, it throws an `ArithmeticException`.