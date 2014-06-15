package ATM;
import DATASTORE.*;
import MDA.MDA;
public class ATM3 {
		MDA m= new MDA();
	
	
	
	public void create(){
		DataStore.setak(3);
		m.create();
		
	}
	public void card(int b,int p){
		DataStore.tempI=b;
		DataStore.tempII=p;
		m.card();
	}
	public void pin(int p){
		if(p==this.getpinI()){
			if(DataStore.getBalI()<100){
				m.correctBelowMin();
			}
			else
				m.correctAboveMin();
		}
		else
			m.incorrectPin(0);
	}
	public void deposit(int d){
		DataStore.tempI=d;
		m.deposit();
		if(this.getbalI()<100){
			m.belowMin();
		}
		else
			m.aboveMin();
	}
	public void withdraw(int w){
		DataStore.tempI=w;
		if(this.getbalI()-DataStore.tempI>=100){
			m.withdraw();
			m.aboveMin();
		}
		else if((this.getbalI()-DataStore.tempI<100)&&(this.getbalI()-DataStore.tempI>0)){
			m.withdraw();
			m.belowMin();
		}
		
		
	}
	public void balance(){
		 m.balance();
	}
	public void lock(){
		
			m.lock();
		}
	
	public void unlock(){
		
			m.unlock();
			if(this.getbalI()<100){
				m.belowMin();
			}
			else
				m.aboveMin();
		}
	
	public void exit(){
		m.exit();
	}
	public int getbalI(){
		return DS3.bal;
	}
	
	public int getpinI(){
		return DS3.pin;
	}
	
}
