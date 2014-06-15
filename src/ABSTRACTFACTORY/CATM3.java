package ABSTRACTFACTORY;

public class CATM3 extends AF{// abstract class of ATM3
	a1_2 a12 = new a1_2();
	a2_1 a21 = new a2_1();
	
	A6CL a6 = new A6CL();
	A7CL a7 = new A7CL();
	a8_1 a81 = new a8_1();
	a9_1 a91 = new a9_1();
	a10_1 a101 = new a10_1();
	a11_1 a111 = new a11_1();
	public A1CL getA1CL(){  // return the pointer of a1_2
		return a12;
	}
	public A2CL getA2CL(){
		return a21;
	}
	
	public A6CL getA6CL(){
		return op.a6;
	}
	public A7CL getA7CL(){
		return op.a7;
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
