package ABSTRACTFACTORY;

public class CATM2 extends AF{ // abstract factory class of ATM2
	
	
	a1_2 a12 = new a1_2();;
	a2_2 a22 = new a2_2();
	A3CL a3= new A3CL();
	A4CL a4 = new A4CL();
	A5CL a5 = new A5CL();
	A6CL a6 = new A6CL();
	A7CL a7 = new A7CL();
	a8_2 a82 = new a8_2();
	a9_2 a92 = new a9_2();
	a10_2 a102 = new a10_2();
	a11_2 a112 = new a11_2();
	public A1CL getA1CL(){	// return the pointer of a1_2;
		return a12;
	}
	public A2CL getA2CL(){
		return a22;
	}
	public A3CL getA3CL(){
		return a3;
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
		return a82;
	}
	public A9CL getA9CL(){
		return a92;
	}
	public A10CL getA10CL(){
		return a102;
	}
	public A11CL getA11CL(){
		return a112;
	}
}
