# Java Singleton Pattern - Thread-Safe Logger

## Overview

This project demonstrates the use of the **Singleton Design Pattern** in Java through a thread-safe logging utility. It ensures that only one instance of the `Logger` class is created, even in a multi-threaded environment, using the **double-checked locking** technique.

## Purpose

The goal is to provide a consistent logging mechanism throughout the application by restricting the `Logger` class to a single instance. This avoids issues such as duplicated logs or unexpected behavior when accessed concurrently by multiple threads.

## Logger Class Explanation

- The `Logger` class is designed as a singleton.
- It uses a `private static volatile` field to hold the singleton instance.
- The constructor is made `private` to prevent direct instantiation from outside the class.
- The `getInstance()` method checks if the instance is `null`. If it is, it enters a `synchronized` block to ensure only one thread initializes it.
- This method implements **double-checked locking**:
  - The first `if (instance == null)` avoids locking once the instance is created.
  - The second `if` inside the synchronized block ensures no other thread has initialized the instance while waiting.

### Why `volatile`?

- The `volatile` keyword ensures that the instance is read from the main memory, not from a thread-local cache.
- This guarantees visibility of changes across threads, which is essential for thread-safe singleton implementation.

## Main Class Explanation

- The `Main` class tests the singleton behavior.
- It retrieves the logger instance twice and logs a message using both references.
- It verifies that both references point to the same object using the `==` operator.
- The console output confirms that:
  - The `Logger` is initialized only once.
  - Both variables refer to the same instance.
  - The same logger is used throughout the application.

## Output Summary

Expected output:
- Logger initialized. (only once)
- Log message printed
- Confirmation that both instances are the same

## Benefits of This Implementation

- **Thread-Safe**: Safe to use in multithreaded applications.
- **Efficient**: Locks are only used during the first initialization.
- **Lazy Initialization**: Instance is created only when needed.
- **Reusable**: Pattern can be applied to any class where single instantiation is needed.

## Conclusion

This implementation of the Singleton Pattern using double-checked locking and `volatile` is a robust and performance-friendly solution for creating a thread-safe singleton in Java.
