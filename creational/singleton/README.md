# Singleton design pattern

## Rules of Singleton Design Pattern

### 1). Singleton design pattern make sure that only once instance of a class exist for entire JVM.
### 2). Singleton class must provide public global access point get singleton Object.
### 3). Singleton pattern used in Logging, Caching,Drivers,Thread pool.
### 4). Singleton used in core java like Runtime class

## Implementation Steps
### 1). Class Should have private constructor which restricts from other class instantiate.
### 2). Should have private static variable of same class type, which is only instance of that class.
### 3). Should have public static method using which we can access instance of singleton class.

## Types of Implementations
## 1). Eager Initialization 
### a). In Eager singleton type instance of class is created at the time of class loading.
### b). Drawback of this type is approach is even user does not use ,object is created