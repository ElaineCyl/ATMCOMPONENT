package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS1;
import DATASTORE.DS3;
public class a8_1 extends A8CL{//strategy8.1 extends 8
	public void make_deposit(){
		int n=0;
		if(DataStore.getak()==1){
			n=DS1.bal;
			n+=DataStore.tempI;
			DataStore.tempI=0;
			DS1.setBalI(n);
			
		}
		else
			n=DS3.bal;
			n+=DataStore.tempI;
			DataStore.tempI=0;
			DS3.setBalI(n);
			
	}
	

}
