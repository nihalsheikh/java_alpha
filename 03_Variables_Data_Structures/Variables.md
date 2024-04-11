# VARIABLES AND DATA STRUCTURES

### Basics to remember

```
public class javaBasics {
    public static void main(String args[]) {
        System.out.print("Hello, World!");
    }
}
```

`public` - it basically means visible to everyone
`class` - place where all the work of code is done
`javaBascis` - it is the class name.

- In Java file, the `className` and `fileName` should be same.
as in the example: the `class name is javaBasics` and `file name is also javaBasics`.

- Function is defined inside the class.

- The part from `public static void main(string args[]) {}` is called the function. The name of this function is `main`.

- `main` function is the first thing that the java compiler searches for, whenever it wants to execute the code.

- the code which we have to write everytime is called Boilerplate code.

- Output in java: 
    `System.out.print("Hello, World!");`
    - the above code, when return inside the function, gives an output `Hello, World!`.
    - `print` here is the function, which prints the output.
    - `;` is called the **Statement Terminator**.
    - `println` or `\n` should be used to print the ouput in next line. or whenever you want to break line.

- Executing File
    - first compile the program file using 
    **`javac <filename.java>`**.

    - then run another command to call it using: 
    **`java <filename.java>`**.



### VARIABLES

- The values which remains the same throughout are known as **`LITERALS`**.
    - example: 
        Number literals: 1,2,3,4,5,...
        Character literals: 'a','b','c','@','*',...

- **`VARIABLES`**:
    - Identifiers: the `<var_names>` are generally called as called as `Identifiers`. These are variable names in java.
    - Types:
        | Variable Type | How to define |
        | -------- | -------- |
        | Integer | `int <var_name> = <value>;` |
        | String | `String <var_name> = <value>;` |

### DATA STRUCTURES
- Data Types in Java
    - Java is a `Typed Languages`, meaning you have to define the variable before you declare it.
        - example: `int a = 10;`
            - in this example, we declare that `a` is a varaible of type `int` that is integer.

    - Primitive
        - Thses are the data types which already exist in Java.
        - No need to declare on your own.
        - 8 different data types.

    - Non-Primitive
        - These are the data types which don't pre-exist in java.
        - you have to create them to use them.
    <br>
    - Table showing categorized data types in java

    | Primitive Data Type | Non-Primitive Data Type |
    | --------------- | --------------------- |
    | byte | String |
    | short | Array |
    | char | Class |
    | boolean | Object |
    | int | Interface |
    | long | - |
    | float | - |
    | double | - |

    - **Primitive Datatype**
        - **`byte`**
            - only 256 numbers can be stored in byte datatype.
            - Stores whole numbers from -128 to 127
            - size is 1 byte

        - **`char`**
            - stores all the characters
            - Stores a single character/letter or ASCII values
            - size is 2 bytes

        - **`booleans`**
            - sores either `true` or `false` values.
            - used to check for conditions.
            - size is 1 byte

        - **`int`**
            - used to store whole numbers
            - Stores whole numbers from -2,147,483,648 to 2,147,483,647
            - size is 4 bytes

        - **`short`**
            - you can save small numbers in it.
            - Stores whole numbers from -32,768 to 32,767
            - size is 2 bytes

        - **`long`**
            - when you want store really large numbers, use long instead of int.
            - you need to add `L` at the end of the number to make it of Long Datatype.
            - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            - size is 8 bytes

        - **`float`**
            - used to declare the decimal values.
            - you need to add `f` at the end of the number to really make it of the type float.
            - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            - size is 4 bytes

        - **`double`**
            - when you want store large numbers with decimals use this instead of float.
            - Stores fractional numbers. Sufficient for storing 15 decimal digits
            - size is 8 bytes


- **Addition**
    - declare vars and use `+` operator to add.

- **User Input in Java**
    - to take input, we make an Object of Scanner class.
    - this is how we use Scanner class:
        `Scanner <object_name> = new Scanner(System.in);`
    - While using Scanner class, you also need to import the package in the code, so add this line in the code: 
        `import java.util.*;` or `import java.util.Scanner;`.

    - This is how you take input in code:
        `<datatype> input = sc.next();`
        - example:
            `String input = sc.next();`
        - object `sc` captures the input from user using the `next()` function.
        - the `next()` function captures the value till the first space only.
        - when you have to store spaces to use this code instead: `sc.nextLine()`
        - `next()` and `nextLine()` are for String only.

        - To take input of Integer we use `nextInt()`
        - To take input of Float we use `nextFloat()`

### PRACTISE PROBLEMS

1. Sum of two numbers by taking input from user.
2. Product of two numbers by takin ginput from user.
3. Calculate area of circle

### TYPE CONVERSION

**Type Conversion** means when we convert a datatype into another datatype.
    - Also called as:
        - Widening Conversion
        - Implicit conversion
    - First condition: conversion happens only when they are compatible
        - example: int <---> float
    - Second condition: Type conversion happens when the Destination type should be bigger than Source type.
        - example: int ---> long but long --x-> int
        - Destination type >>> Source Type
        - This is the correct order:
            `byte -> short -> int -> float -> long -> double`

### TYPE CASTING

**Type Casting** is the situation where, we are trying to reduce the values but Java suggests it will cause Data loss, but we want to assign the values to the new variables.
This conversion is known as Type Casting.

- This is also called as:
    - Narrowing Conversion
    - Explicit Conversion

- For example: 

    ```
     float a = 25.0f;
     int b = a;
    ```

    - There will be loss of Data when we convert the `float` to `int`. The decimal value won't be availabel in the `int`.
    - That's why java will try to stop it and throw an error.

    - To still do the converion, we need to write the following line: `int b = (int)a;`
    - The above line will not throw error.
    - This is called Type Casting in Integer.

### TYPE PROMOTION IN EXPRESSIONS

- It is knid of a phenomena in Java.
- it follows 2 rules:
    - Java automatically promotes each `byte`, `short`, or `char` operand to **`int`** when evaluating an expression.
    
    - If any one of the operand is `long`, `float`, or `double` the whole expression is **promoted** to **`long`, `float`, or `double`** respectively.

    - for example:

        ```
        char a = 'a';
        short b = 50;

        a + b
        ```

        - the Type promotion will first convert both `char` and `short` to **`int`**