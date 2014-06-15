package MDA;
import ABSTRACTFACTORY.*;
import DATASTORE.DataStore;
public class OP {
	
	AF af; // pointer of AF
	CATM1 catm1 = new CATM1();   // abstract factory of atm1
	CATM2 catm2 = new CATM2();	// abstract factory of atm2
	CATM3 catm3 = new CATM3();	// abstract factory of atm3
	
	DataStore ds = new DataStore();  
	public A1CL a1;
	public A2CL a2;
	public A3CL a3;
	public A4CL a4;
	public A5CL a5;
	public A6CL a6;
	public A7CL a7;
	public A8CL a8;
	public A9CL a9;
	public A10CL a10;
	public A11CL a11;
	public void store_pin(){
		if(DataStore.getak()==1){   //if atm1
			catm1.getA1CL().store_pin();  // do store_pin
		}
		else if(DataStore.getak()==2){
			catm2.getA1CL().store_pin();  // if atm2
		}
		else
			catm2.getA1CL().store_pin();  // if atm3
	
	}
	public void store_balance(){
		if(DataStore.getak()==1){  // if atm1
			catm1.getA2CL().store_balance();  // do store balance
		}
		else if(DataStore.getak()==2){
			catm2.getA2CL().store_balance();  //if atm2
		}
		else
			catm3.getA2CL().store_balance();  // if atm3
	}
	public void prompt_for_pin(){
		catm1.getA3CL().prompt_for_pin();  // do prompt for pin
	}
	public void incorrect_msg_pin(){
		catm1.getA4CL().incorrect_msg_pin(); //do show msg
	}
	public void too_many_attempts_msg(){
		catm1.getA5CL().too_many_attempts_msg(); // do show msg
	}
	public void eject_card(){
		catm1.getA6CL().eject_card();  // do eject card
	}
	public void display_menu(){
		catm1.getA7CL().display_menu(); // do show menu
	}
	public void make_deposit(){
		if(DataStore.getak()==1){  // if atm1
			catm1.getA8CL().make_deposit(); // do make depoist
		}
		else if(DataStore.getak()==2){  // if atm2
			catm2.getA8CL().make_deposit();
		}
		else
			catm3.getA8CL().make_deposit();  // if atm3
	}
	public void make_withdraw(){
		if(DataStore.getak()==1)  // if atm1
			catm1.getA9CL().make_withdraw();  // do make withdraw
		else if(DataStore.getak()==2)   // if atm2
			catm2.getA9CL().make_withdraw();
		else
			catm3.getA9CL().make_withdraw();
	}
	public void display_balance(){
		if(DataStore.getak()==1)  // if atm1
			catm1.getA10CL().display_balance();  // do show balance
		else if(DataStore.getak()==2)  // if atm2
			catm2.getA10CL().display_balance();
		else
			catm3.getA10CL().display_balance();
	}
	public void make_penalty(){
		if(DataStore.getak()==1)  // if atm1
			catm1.getA11CL().make_penalty();
		else
			catm2.getA11CL().make_penalty();   // if atm2
		
	}
	
	
}
