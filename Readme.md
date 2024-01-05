### JLox Scanner Implementation Following [https://craftinginterpreters.com/scanning.html]
#### How to Run the Scanner
- Lox.java is the entry point
### Running Java from Command Line troubleshooting
- Before you shoot yourself in the foot. Since we are past java 11 you do not have to run javac then java. You can run java yourprogram.java and it will take care of compiling and executing the code for you. And you will stop getting the **ClassNotFound** exception
- *Failed to access childClassName from parentClassName. childClass is in unnamed module of loader 'app'; parentClass is in unnamed module as well.*
  - I cannot figure out how I ran the java files at the beginning of this project from the command line. I am sure I only used the java command though and not javac. I think...
  - So I did
    1. `java -cp . .com.craftinginterpreters.lox.AstPrinter` then
    2. `javac \com\craftinginterpreters\lox\*.java` then
    3. `java com.craftinginterpreters.lox.AstPrinter`
    - Not sure if step 1 is necessary at all.