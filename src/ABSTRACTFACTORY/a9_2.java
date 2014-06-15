package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS2;
public class a9_2 extends A9CL{//strategy9.2 extends 9
	public void make_withdraw(){
		float n=DS2.getBalF();
		n-=DataStore.tempF;
		DataStore.tempF=0;
		DS2.setBalF(n);
		
	}
}
