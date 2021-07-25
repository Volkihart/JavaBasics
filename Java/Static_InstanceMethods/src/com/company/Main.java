package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* Static Methods
	* Static methods are declared using a static modifier
	* Static methods can't access instance methods and instance variables directly
	* They are usually used for operations that don't require any data from an instance of the class(from 'this')
	* If you remember, the this keyword is the current instance of a class.
	*
	*In static methods we can't use the this keyword
	* Whenever you see a method that does not use instance variables that method should be declared as a static method
	*For example main is a static method and its called by the JVM when it starts an application
	* */

		//Static Methods Example
		//static methods are called as ClassName.methodName(); or
		//methodName(); only if in the same class
		//in this example


//		class Calculator {
//			public static void printSum(int a, int b){
//				System.out.println("sum = " + (a+b));
//			}
//		}
//
//		public class Main {
//			public static void main(String[] args) {
//				Calculator.printSum(5,10);
//				printHello(); //Shorter form of Main.printHello();
//			}
//
//			public static void printHello(){
//				System.out.println("Hello");
//			}
//		}

		/*
		* Instance Methods
		* Instance methods belong to an instance class
		* To use an instance method we have to instantiate the class first usually by using the new keyword
		*
		* Instance methods can access instance methods and instance variables directly
		* Instance methods can also access static methods and static variables directly
		*
		* */


		//Instance Method Example
//		class Dog {
//			public void bark(){
//				System.out.println("woof");
//			}
//		}
//		public class Main{
//			public static void main(String[] args){
//				dog rex = new Dog();//create instance
//				rex.bark();//call instance method
//			}
//		}


		// Static or Instance??

		//Should a method be static?
		//			v
		//Does it use any fields (instance variables) or instance methods?
		//		yes?                                  No?
		//       |                                     |
		//       v                                     |
		//It should probably be an instance method     |
		//                                             v
		//                             It should probably be a static method

    }
}
