/*
Heber Cooke 		10/5/2018
Exercise 10-3

- int value
MyInteger()
MyInteger(int)
MyInteger(MyInteger)
+ getValue():int
+ isEven():bool
+ isOdd():bool
+ isPrime():bool
+ static isEven(int):bool
+ static isOdd(int):bool
+ static isPrime(int):bool
+ static isEven(MyInteger):bool
+ static isOdd(MyInteger):bool
+ static isPrime(MyInteger):bool
+ equals(int):bool
+ equals(MyInteger):bool
+ static parceInt(char[]):int
+ static parceInt(String):int

*/
class Exercise10_3{
	public static void main(String[] args) {
		// test  isEven(),isOdd(),isPrime()
		MyInteger num1 = new MyInteger();
		System.out.println("num1 is even : "+num1.isEven()+"\nnum1 is odd : "+ num1.isOdd()+"\nnum1 is prime : "+ num1.isPrime());
		System.out.println();
		// test  isEven(int),isOdd(int),isPrime(int)
		System.out.println("Integer is even: "+MyInteger.isEven(7)+"\nInteger is odd : "+ MyInteger.isOdd(7)+"\nInteger is prime : "+ MyInteger.isPrime(7));
		System.out.println();
		// test  isEven(MyInteger),isOdd(MyInteger),isPrime(MyInteger)
		MyInteger num2 = new MyInteger(num1);
		System.out.println("My integer class  is even: "+num2.isEven()+"\nMy integer class is odd : "
		+ num2.isOdd()+"\nMy integer class is prime : "+ num2.isPrime());
		System.out.println();
	
		// test equals(int)
		System.out.println(num2.equals(10));
		System.out.println(num2.equals(11));
		//test equals(MyInteger)
		MyInteger n3= new MyInteger();
		System.out.println(n3.equals(num2));
		System.out.println();
		// test parseInt(char[])
		char[] number= {'1','1','1','1'};
		System.out.println(MyInteger.parseInt(number));
		System.out.println();
		// test parseInt(string)
		String numbers2 = "123456";
		System.out.println(MyInteger.parseInt(numbers2));
	}
}	//end main class----------------------------------------------------------