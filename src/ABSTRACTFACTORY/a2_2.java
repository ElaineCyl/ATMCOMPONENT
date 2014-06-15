package ABSTRACTFACTORY;
import DATASTORE.DS2;
import DATASTORE.DataStore;
public class a2_2 extends A2CL{//strategy2.2 extends 2
	public void store_balance(){
		DS2.setBalF(DataStore.tempF);
		
	}
}
