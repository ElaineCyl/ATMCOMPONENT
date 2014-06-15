package ABSTRACTFACTORY;
import DATASTORE.DS2;
public class a10_2 extends A10CL{//strategy10.2 extends 10
	public void display_balance(){
		System.out.println("balance is:"+DS2.getBalF());
	}
}
