package ATM;
import MDA.MDA;
import DATASTORE.*;
public class ATM2 {
MDA m= new MDA();
	
	
	
	public void create(){
		DataStore.setak(2);
		m.create();
		
	}
	public void card(float b,int p){
		DataStore.tempF=b;
		DataStore.tempII=p;
		m.card();
	}
	public void pin(int p){
		if(this.getpinI()==p){
			if(this.getbalF()<500){
				m.correctBelowMin();
			}
			else
				m.correctAboveMin();
		}
		else
			m.incorrectPin(2);
	}
	public void deposit(float d){
		DataStore.tempF=d;
		m.deposit();
		if(this.getbalF()<500){
			m.penaltyBelowMin();
		}
		else
			m.aboveMin();
	}
	public void withdraw(float w){
		DataStore.tempF=w;
		if(this.getbalF()-DataStore.tempF>=500){
			m.withdraw();
			m.aboveMin();
		}
		else if((this.getbalF()-DataStore.tempF<500)&&(this.getbalF()-DataStore.tempF>0)){
			m.withdraw();
			m.penaltyBelowMin();
		}
		
		
	}
	public void balance(){
		 m.balance();
	}
	
	public void exit(){
		m.exit();
	}
	
	public float getbalF(){
		return DS2.bal;
	}
	public int getpinI(){
		return DS2.pin;
	}
	
}
