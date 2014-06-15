package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS2;
public class a8_2 extends A8CL{//strategy8.2 extends 8
	public void make_deposit(){
		float n = DS2.getBalF();
		n+=DataStore.tempF;
		DataStore.tempF=0;
		DS2.setBalF(n);
	}
}
