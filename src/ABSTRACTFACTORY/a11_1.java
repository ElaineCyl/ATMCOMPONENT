package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS1;
public class a11_1 extends A11CL{//strategy11.1 extends 11
	public void make_penalty(){
		int n=DS1.getBalI();
		n=n-10;
		DataStore.tempI=0;
		DS1.setBalI(n);
	}
}
