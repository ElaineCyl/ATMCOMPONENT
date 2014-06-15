package State;

public class locked extends State {
	public static int id=5; // id value of locked
	
// in this state, it can only perform action unlock;
	
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
	public void penaltyBelowMin(){}
	public void withdraw(){}
	public void lock(){}
	public void unlock(){}
}
