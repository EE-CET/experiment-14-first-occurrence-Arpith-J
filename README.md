# Experiment 14: First Occurrence

## Problem Statement

Given an array `Arr` of $N$ elements and an integer $K$. Your task is to print the **position** of the first occurrence of $K$ in the given array.

* If the number is not found, print `-1`.
* **Note:** The position of the first element is considered as **1** (1-based indexing).

## Input Format

* The first line contains two integers $N$ and $K$.
* The second line contains $N$ space-separated integers, elements of `Arr`.

## Output Format

Print the position of the first occurrence of $K$.
If $K$ is not present in the array, print `-1`.

### Example 1

**Input:**

```text
5 16
9 7 2 16 4
```

**Output:**

```text
4
```

**Explanation:**
The number 16 is at index 3 (0-based) which corresponds to position 4 (1-based).

### Example 2

**Input:**

```text
6 6
5 7 7 8 8 10
```

**Output:**

```text
-1
```

**Explanation:**
The number 6 is not present in the array.
