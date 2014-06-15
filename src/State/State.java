package State;
import MDA.*;
public class State {
	//state pattern
	public static int id=-1;//initiate id = -1
	OP op = new OP();
	MDA m;
	// each method:
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
	public int getid(){
		return this.id;
	}

}
