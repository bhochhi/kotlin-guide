
Basic
---

1. Defining package and importing similar to java but don't have to match directory and packages.
2. Defining functions, 
```kotlin
  //very much similar to scala.
  fun sum(a: Int, b: Int): Int{
    return a+b
  }
  
  // inferred return type, inline body
  fun sum(a: Int, b: Int) = a + b
    
  //no meaningful return value. Unit can't omitted   
  fun printSum(a: Int, b: Int): Unit {
    println("printing sum of $a and $b is ${a + b}")
  }
```
3. Variables
```kotlin

```

|java|kotlin|
|----|------|


Resources:
- https://kotlinlang.org/
- https://developer.android.com/kotlin/index.html
- https://github.com/JetBrains/kotlin
