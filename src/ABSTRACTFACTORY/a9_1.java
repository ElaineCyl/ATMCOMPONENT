package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS1;
import DATASTORE.DS3;
public class a9_1 extends A9CL{//strategy9.1 extends 9
	public void make_withdraw(){
		int n;
		if(DataStore.ak==1){
			n=DS1.bal;
			n-=DataStore.tempI;
			DataStore.tempI=0;
			DS1.setBalI(n);
		}
		else
			n=DS3.bal;
			n-=DataStore.tempI;
			DataStore.tempI=0;
			DS3.setBalI(n);
	}

}
