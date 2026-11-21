# Grade Calculator (Java)

A Java console app that asks for three subject scores, averages them and gives a letter grade.
Built as a CS 310 mini project by Murad Wasfi and Daysam.

## What it does

1. Asks for Math, Science and English scores (0–100).
2. Rejects bad input and asks again: text that isn't a number, or a number outside 0–100.
3. Prints the average (one decimal place) and the letter grade, with a "Great job!" for an A or B.

| Average | Grade |
|---|---|
| 90–100 | A |
| 80–89.9 | B |
| 70–79.9 | C |
| 60–69.9 | D |
| below 60 | F |

## Run it

Needs Java 11 or newer.

```bash
java grade.java
```

## Example

```
=== Grade Calculator ===
Enter your scores below:
Math (0-100): 95
Science (0-100): abc
That's not a valid number! Try again: 150
Please enter a number between 0-100: 88
English (0-100): 79

=== Results ===
Average: 87.3%
Letter Grade: B
Great job!

Thanks for using Grade Calculator!
```

## How it's built

All in `grade.java`, class `GradeCalculator`:

| Method | Job |
|---|---|
| `getValidGrade(Scanner)` | reads one score, looping until it's a whole number from 0 to 100 |
| `calculateAverage(int, int, int)` | averages the three scores |
| `getLetterGrade(double)` | turns the average into A–F |
| `main` | asks for the scores and prints the results |
