package State;

public class S1 extends State{
	public static int id=3;// id value of state S1
	
	//in this state, it can only perform operations penaltyBelowMin;, aboveMin, belowMin, 
	public void create(){}
	public void card(){}
	public void incorrectPin(int max){}
	public void correctAboveMin(){}
	public void correctBelowMin(){}
	public void balance(){}
	public void exit(){}
	public void deposit(){}
	public void aboveMin(){}
	public void belowMin(){}
	public void penaltyBelowMin(){
		op.make_penalty();
	
	}
	public void withdraw(){}
	public void lock(){}
	public void unlock(){}
}
