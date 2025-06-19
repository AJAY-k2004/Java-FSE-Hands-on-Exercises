#  Financial Forecasting

## Scenario
You are building a **financial forecasting tool** that predicts future values (such as investment returns or profit growth) based on past data. The goal is to use a **recursive algorithm** to project future values and analyze its efficiency.

---

## Step 1: Understand Recursive Algorithms

### What is Recursion?
Recursion is a programming concept where a function calls itself to solve smaller instances of a larger problem. Each recursive call moves closer to a base case, which is the condition where no further recursion occurs.

### Why Use Recursion?
- Recursion can simplify code by breaking down complex problems into simpler sub-problems.
- It is useful for tasks that involve repetition or self-similarity.
- Recursion closely matches the mathematical definitions of many problems.

In the context of financial forecasting, recursion can be used to model compound growth by applying the growth formula recursively over a series of time periods.

---

## Step 2: Setup

To forecast future values, the tool requires:
- **Initial Value**: The starting point of the data, such as an initial investment.
- **Growth Rate**: The percentage increase expected over each time period (e.g., annually).
- **Time Period (Years)**: The number of periods (e.g., years) for which to forecast.

The goal is to calculate the future value by applying the growth rate repeatedly over the given time period using a recursive approach.

---

## Step 3: Implementation

The recursive approach calculates the future value for a given number of years by:
- Using the base case when the number of years is 0 (returns the initial value).
- Otherwise, calling itself with one year less and multiplying the result by the growth factor (1 + growth rate).

This method simplifies the logic and reflects how compound growth works over time.

---

## Step 4: Analysis

### Time Complexity
- The recursive approach has a **time complexity of O(n)**, where `n` is the number of years.
- This is because the function is called once for each year until the base case is reached.

### Space Complexity
- The **space complexity is also O(n)** due to the function call stack.
- Each recursive call adds a new layer to the stack, which can lead to stack overflow if `n` is large.

### Optimization
To optimize the solution and avoid excessive computation:
- **Use an iterative method** instead of recursion. Iteration handles repeated operations in a loop without adding to the call stack.
- The iterative version uses constant space (**O(1)**) and is faster and safer for large input values.

---

## Conclusion

Recursion offers a clean and intuitive way to model repeated growth in financial forecasting. However, for real-world applications involving large data or long time periods, an optimized iterative solution is preferred for better performance and efficiency.
