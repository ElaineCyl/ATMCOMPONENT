package ABSTRACTFACTORY;

public class CATM1 extends AF { // abstract factory class of ATM1
	
	a1_1 a11= new a1_1();
	a2_1 a21 = new a2_1();
	A3CL a3 = new A3CL();
	A4CL a4 = new A4CL();
	A5CL a5= new A5CL();
	A6CL a6 = new A6CL();
	A7CL a7 = new A7CL();
	a8_1 a81 = new a8_1();
	a9_1 a91 = new a9_1();
	a10_1 a101 = new a10_1();
	a11_1 a111 = new a11_1();
	
	public a1_1 getA1CL(){// return the pointer of a1_1
		
		return a11;
	}
	public A2CL getA2CL(){
		return a21;
		
	}
	public A3CL getA3CL(){
		return a3;
		//return op.a3;
	}
	public A4CL getA4CL(){
		return a4;
		
	}
	public A5CL getA5CL(){
		return a5;
		
	}
	
	public A6CL getA6CL(){
		return a6;
		
	}
	public A7CL getA7CL(){
		return a7;
		
	}
	public A8CL getA8CL(){
		return a81;
		
	}
	public A9CL getA9CL(){
		return a91;
		
	}
	public A10CL getA10CL(){
		return a101;
		
	}
	public A11CL getA11CL(){
		return a111;
		
	}
}
