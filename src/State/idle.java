package State;

public class idle extends State {
	public static int id=0;// id value of id;
	
	// in idle state, it can only perform operations create, card.
	
	public void create(){
		System.out.println("created");
	}
	public void card(){ 
		
			op.store_pin();
			op.store_balance();
			op.prompt_for_pin();
		
	}
	public void incorrectPin(int max){}
	public void correctAboveMin(){}
	public void correctBelowMin(){}
	public void balance(){}
	public void exit(){}
	public void deposit(){}
	public void aboveMin(){}
	public void belowMin(){}
	public void penaltyBelowMin(){}
	public void withdraw(){}
	public void lock(){}
	public void unlock(){}
	
}
