package ABSTRACTFACTORY;
import DATASTORE.DataStore;
import DATASTORE.DS1;
import DATASTORE.DS3;
public class a2_1 extends A2CL{//strateg2.1 extends 2
		public void  store_balance(){
			if(DataStore.getak()==1){
				DS1.setBalI(DataStore.tempI);
				
			}
			else
				DS3.setBalI(DataStore.tempI);
				
		}
	}


