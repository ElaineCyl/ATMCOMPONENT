package ATM;
import DATASTORE.DataStore;
import MDA.MDA;
import DATASTORE.DS1;

public class ATM1 {
	
	MDA m= new MDA();
	
	
	
	public void create(){
		DataStore.setak(1);
		m.create();
		
	}
	public void card(int b,String p){
		DataStore.tempI=b;
		DataStore.tempS=p;
		//ds_atm1.setBalI(b);
		//ds_atm1.setPinS(p);
		m.card();
	}
	public void pin(String p){
		DataStore.tempS=p;
		if(DataStore.tempS.equals(this.getpinS())){
			if(DataStore.getBalI()<1000){
				m.correctBelowMin();
			}
			else
				m.correctAboveMin();
		}
		else
			
			m.incorrectPin(3);
		
	}
	public void deposit(int d){
		DataStore.tempI=d;
		m.deposit();
		if(this.getbalI()<1000){
			m.penaltyBelowMin();
		}
		else
			m.aboveMin();
	}
	public void withdraw(int w){
		DataStore.tempI=w;
		if(this.getbalI()-DataStore.tempI>=1000){
			m.withdraw();
			m.aboveMin();
		}
		else if((this.getbalI()-DataStore.tempI<1000)&&(this.getbalI()-DataStore.tempI>0)){
			m.withdraw();
			m.penaltyBelowMin();
		}
		
		
	}
	public void balance(){
		 m.balance();
		//System.out.println(ds_atm1.getBalI());
	}
	public void lock(String p){
		DataStore.tempS=p;
		if(this.getpinS().equals(DataStore.tempS)){
			m.lock();
		}
	}
	public void unlock(String p){
		DataStore.tempS=p;
		if(this.getpinS().equals(DataStore.tempS)){
			m.unlock();
			if(DataStore.getBalI()<1000){
				m.belowMin();
			}
			else
				m.aboveMin();
		}
	}
	public void exit(){
		m.exit();
	}
	public int getbalI(){
		return DS1.bal;
	}
	public String getpinS(){
		return DS1.getPinS();
	}

}
