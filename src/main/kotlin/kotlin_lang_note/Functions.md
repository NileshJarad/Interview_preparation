# Functions

- Functions parameter are declared using pascal notation  **_name: type_**.
- Parameters are separated by comma(,).
- Each parameter must be explicitly typed.

**Example:**

1) ```fun powerOf(number: Int, exponent: Int): Int { /*...*/ }```
2) ```
   fun powerOf(
   number: Int,
   exponent: Int, // trailing comma
   ) { /*...*/ }
   ```
3) ```
   fun read(
   b: ByteArray,
   off: Int = 0,
   len: Int = b.size,
   ) { /*...*/ }
    
   ```

### Infix function

Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). 

_Infix functions must meet the following requirements:_

1. They must be member functions or extension functions. 
2. They must have a single parameter. 
3. The parameter must not accept variable number of arguments and must have no default value.


### Inline function