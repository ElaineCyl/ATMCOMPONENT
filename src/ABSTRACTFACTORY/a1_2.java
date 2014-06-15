package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS2;
import DATASTORE.DS3;

public class a1_2 extends A1CL{//strategy1.2 extends 1
	
	public void  store_pin(){
		if(DataStore.getak()==2){
			DS2.setPinI(DataStore.tempII);
		}
		else
			DS3.setPinI(DataStore.tempII);
	}
}

