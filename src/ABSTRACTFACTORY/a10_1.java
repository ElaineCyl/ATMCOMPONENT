package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS1;
import DATASTORE.DS3;
public class a10_1 extends A10CL{//strategy10.1 extends 10
	public void display_balance(){
		if(DataStore.ak==1){
			
			System.out.println("balance is:"+DS1.bal);
		}
		else
			
			System.out.println("balance is:"+DS3.bal);
	}

}
