package ABSTRACTFACTORY;
import MDA.OP;

public class AF {// Abstract Factory CLASS
	
	OP op;
	
	
	public A1CL getA1CL(){ // return the pointer of A1CL
		return op.a1;
	}
	public A2CL getA2CL(){
		return op.a2;
	}
	public A3CL getA3CL(){
		return op.a3;
	}
	public A4CL getA4CL(){
		return op.a4;
	}
	public A5CL getA5CL(){
		return op.a5;
	}
	public A6CL getA6CL(){
		return op.a6;
	}
	public A7CL getA7CL(){
		return op.a7;
	}
	public A8CL getA8CL(){
		return op.a8;
	}
	public A9CL getA9CL(){
		return op.a9;
	}
	public A10CL getA10CL(){
		return op.a10;
	}
	public A11CL getA11CL(){
		return op.a11;
	}

	
}
