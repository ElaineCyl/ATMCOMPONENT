package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS2;
public class a11_2 extends A11CL{//strategy11.2 extends 11
	public void make_penalty(){
		float n=DS2.getBalF();
		n-=20;
		DataStore.tempF=0;
		DS2.setBalF(n);
		
	}
}
