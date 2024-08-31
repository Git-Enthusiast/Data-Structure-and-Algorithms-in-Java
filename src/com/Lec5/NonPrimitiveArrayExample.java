package com.Lec5;

/*
## Illustration of String Array on Stack and Heap

The provided code creates a two-dimensional array of strings. Here's how these elements are stored in memory:

**Stack:**

* The `main` method arguments (`String[] args`) are stored on the stack.
* Local variables within the `main` method, including:
    * `names`: This is a reference variable to the actual array object on the heap.
                It holds the memory address of the array, not the array itself.
    * Loop counters (`i` and `j`) are also stored on the stack.

**Heap:**

* **String objects:** Each string literal ("Alice", "Bob", etc.) is allocated space on the heap in a read-only section.
* **String array:** The two-dimensional array itself is allocated on the heap. It stores references to the individual string literals, not the strings themselves.

Here's a simplified diagram illustrating the memory layout:

```
+--------------------+   (Stack)
|        args        |
+--------------------+
|      ...           |
+--------------------+
|      i             |
+--------------------+
|      j             |
+--------------------+
|      ...           |
+--------------------+
+--------------------+   (Heap)
| String array      | (reference to array on heap)
+--------------------+
| String literal     | ("Alice") (read-only)
+--------------------+
| ...                |
+--------------------+
| String literal     | ("Frank") (read-only)
+--------------------+
```

**Key Points:**

* Even though the code manipulates strings, these **string literals** themselves are stored in the read-only section of the heap.
* The array variable (`names`) is a reference on the stack, pointing to the actual array object on the heap.
* Each element in the array (`names[i][j]`) holds a reference to the corresponding string literal on the heap.

This memory allocation approach helps conserve memory, as string literals are often shared across different parts of the program.

 */
public class NonPrimitiveArrayExample {
    public static void main(String[] args) {
        // Creating a two-dimensional array of strings
        String[][] names = new String[2][3];

        // Initializing strings and assigning them to the array
        names[0][0] = "Alice";
        names[0][1] = "Bob";
        names[0][2] = "Charlie";
        names[1][0] = "David";
        names[1][1] = "Eve";
        names[1][2] = "Frank";

        // Accessing and printing the strings in the array
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Name at position [" + i + "][" + j + "]: " + names[i][j]);
            }
        }
    }
}
