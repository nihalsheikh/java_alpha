# Advance Pattern Questions

### NUMBER PYRAMID
```
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
```

- figure out the Outer Loop
    - trick is to count the number of rows
    - outer loop i = 1 to 5
    - n = 5
    - for (int i = 1 to n)

- what to print
    - analyze the rows
    - print some spaces
    - then print some numbers
    - space infront of numbers is different from the space between the numbers

- figure out inner loops
    - first print some spaces using the first inner loop
    - then print some numbers using the second inner loop

- figure out how the Spaces and Numbers relate to the Rows in pyramid
    - easy to calculate the Number inner loop first
        - when i = 1, we have to print 1, only one time.
        - similarly, when i = 2, we have to print 2, two times
        - similarly, when i = 3, we have to print 3, three times
        - similarly, when i = 4, we have to print 4, four times
        - similarly, when i = 5, we have to print 5, five times

        - Thus we figured out that, whatever is the value of i, we have to print that same number,the same number of times
        - logic will be
            - j = (1 to i)
        - loop will be
            - for(int j = 1 to i)
                print(i + "space")

    - figure out the Space inner loop
        -  we see that row number and space number when added equal to the number of rows fro pyramid.
        - So i + space = n
            therefore space = n - i
        we have to print these spaces
        - logic is j = 1 to (n-i)
        - Loop is
            - for (int j = 1 to n-i)
                print("space")



### PALINDROMIC PYRAMID

```
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
```

- in this pyramid, first the numbers are decreasing and then increasing.
- take a note that there are no spaces between the numbers, every number is below itself, in same column.

- outer loop will run for the number of rows
    - rows = 5
    - n = 5
    - outer loop = 1 to n

- what to print
    - analyze rows
    - lets analyze the first inner loop of spaces.
    - then analyze the seconf inner loop of numbers.

- Space loop
    - for every row number i, we have space. 
    - when n=5, say for i = 1, we have sp = 4.
    - similarly, for i = 2, we have sp = 3
    - similarly, for i = 3, we have sp = 2
    - similarly, for i = 4, we have sp = 1
    - similarly, for i = 5, we have sp = 0

    - thus, we can say that, when i is increased the space value is decreased. and the sum of i + sp = n
    so, space = n - i

    - So for space, loop will be
        - for(int j = 1 to n-i)

- Number Loop
    - Numbers in the pyramid can be divided nto two parts
    descending and ascending.
    - to print the pyramid with these two kind of numbers.
    - so we have to write 2 Loops for numbers
    - Descending Loop and Ascending loop


| Descending | Ascending |
|---|---|
| 1 to 1 | Doesn't Start |
| 2 to 1 | Loop starts from 2 |
| 3 to 1 | 2 to 3 |
| 4 to 1 | 2 to 4 |
| 5 to 1 | 2 to 5 |
| n to 1 | 2 to n |

- we figured out that, when we have i = 1, only print 1,
when i = 2, desc loop goes from 2 to 1, thus the Descending loop goes from i to 1
- Descending loop
    - for(int j=i; j>=1; j--)

- Similarly, the Ascending loop starts from 2, thus value of j will also start form 2, so the value will go from 2 to i
- Ascending loop
    - for(int j=2; j<=i; j++)