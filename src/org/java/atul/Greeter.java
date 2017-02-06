package org.java.atul;

import org.omg.Messaging.SyncScopeHelper;

public class Greeter {
	
	//public void greet(){System.out.println("Hello");}
	public void greet(Greeting greeting){greeting.perform();}

	public static void main(String[] args) {
		Greeter greeter= new Greeter();
		Greeting hg = new HelloGreeting();
		//greeter.greet();
		greeter.greet(hg);
		greeter.greet(()->System.out.println("Hello World"));
		Greeting mylambda = ()->System.out.println("Hello");
		greeter.greet(mylambda);
		
		mylambda.perform();
		StrLen strLen = s->s.length();
		System.out.println(strLen.getStrLen("Atul Mishra"));
	}

	interface StrLen{
		int getStrLen(String s);
	}
}
