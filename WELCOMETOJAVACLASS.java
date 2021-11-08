
public class WELCOMETOJAVACLASS {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD!!!!!!!!!!!!");
		
		String name = "RAHUL SINGH";//String - stores text, such as "Hello", "Name". String values are surrounded by double quotes
	    System.out.println(name);
	   
	    int x = 45, y = 60, z = 90; // int - stores integers (whole numbers), without decimals, 
	    
	    System.out.println(x);
	    
	    System.out.println(z);
	    
	    float a = 48.002f, b = 62.05f;// float - stores floating point numbers, with decimals,
	    
	    System.out.println(b);
	    
	    System.out.println(a);
	    
	    boolean isGirl = true;    // boolean - stores values with two states: true or false
	    System.out.println(isGirl);
	    
	    //Primitive Data Types
	    
	    byte c = 100; // The byte data type can store whole numbers from -128 to 127.
	    System.out.println(c);  
	    
	    short myNum = 32767; //The short data type can store whole numbers from -32768 to 32767
	    System.out.println(myNum);
	    
	    int Num = 300000000; // The int data type can store whole numbers from -2147483648 to 2147483647.
	    System.out.println(Num);
	    
	    long Number = 15000000000L;//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
	    System.out.println(Number);
	    
	    double e = 19.99d;//The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
	    System.out.println(e);
	    
	    char Grade = 'A';
	    System.out.println(Grade);// The char data type is used to store a single character. The character must be surrounded by single quotes
	    
	   // Operator in Java
	    
	  // Arithmetic Operators
	    
	 // Arithmetic operators are used to perform common mathematical operations
	   
	    int num1 = 60, num2 = 30;
	    System.out.print("the value of num1 + num2 "); // Addition	Adds together two values
	    System.out.println(num1 + num2);
	    
	    System.out.print("the value of num1 - num2 "); // Subtraction	Subtracts one value from another
	    System.out.println(num1 - num2);
	    
	    System.out.print("the value of num1 % num2 "); // Modulus	Returns the division remainder
	    System.out.println(num1 % num2);
	    
	    System.out.print("the value of num1 * num2 "); // Multiplication	Multiplies two values
	    System.out.println(num1 * num2);
	    
	    System.out.print("the value of num1 / num2 "); // 	Division	Divides one value by another
	    System.out.println(num1 / num2);
	    
	    System.out.println(num1++); // 	Increment	Increases the value of a variable by 1
	    
	    System.out.println(++num1);
	    
	    System.out.println(num1--); // 	Decrement	Decreases the value of a variable by 1
	    System.out.println(--num1);
	    
	    // Assignment Operators
	    // Assignment operators are used to assign values to variables
	    
	    int num3 = 10;
	    num3 += 5;
	    System.out.println(num3);
	    num3 -= 6;
	    System.out.println(num3);
	    num3 *= 4;
	    System.out.println(num3);
	    num3 /= 6;
	    System.out.println(num3);
	    num3 %= 5;
	    System.out.println(num3);
	    num3 &= 3;
	    System.out.println(num3);
	    num3 |= 2;
	    System.out.println(num3);
	    
	    // Comparison Operators
	    //Comparison operators are used to compare two values
	    
	    int num4 = 8, num5 = 6;
	    System.out.println(num4 == num5);// returns false because 8 is not equal to 6
	    System.out.println(num4 != num5);// returns true because 8 is not equal to 6
	    System.out.println(num4 > num5); //returns true because 8 is greater than 6
	    System.out.println(num4 < num5);
	    System.out.println(num4 >= num5);
	    System.out.println(num4 <= num5);
	    
	    // Logical Operators
	    
	    // Logical operators are used to determine the logic between variables or values
	    
	    int X = 8;
	    System.out.println(X > 5 && X < 10);
	    System.out.println(X > 5 || X >10);
	    System.out.println(!(X < 5 && X > 10));
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
