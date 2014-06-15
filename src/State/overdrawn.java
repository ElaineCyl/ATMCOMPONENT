package State;

public class overdrawn extends State {
	public static int id=4; // id value of state overdrawn
	
	//in this state, it can only perform method balance, exit, deposit, lock
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
	public void withdraw(){}
	public void lock(){}
	public void unlock(){}
}
