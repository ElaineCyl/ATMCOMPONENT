package State;

public class ready extends State {
	public static int id=2;//id value of ready
	
	// in this state, it can only perform methods balance, exit, deposit, withdraw,lock.
	
	public void create(){}
	public void card(){}
	public void incorrectPin(int max){}
	public void correctAboveMin(){}
	public void correctBelowMin(){}
	public void balance(){
		op.display_balance();
		
	}
	public void exit(){
		op.eject_card();
	}
	public void deposit(){
		op.make_deposit();	
	}
	public void aboveMin(){}
	public void belowMin(){}
	public void penaltyBelowMin(){}
	public void withdraw(){
		op.make_withdraw();
	
	}
	public void lock(){}
	public void unlock(){}

}
