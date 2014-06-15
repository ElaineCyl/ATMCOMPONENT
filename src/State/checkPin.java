package State;
import MDA.*;
public class checkPin extends State {
	public static int id=1;// id value of checkPin state;
	
	// in checkpin state, it can only perform operations incorrectPin, correctAbvoeMin, correctBelowMin().

	public void card(){}
	public void incorrectPin(int max){
		if(MDA.attempt<max){
			op.incorrect_msg_pin();
		}
		else{
			
			
			op.incorrect_msg_pin();
			op.too_many_attempts_msg();
			op.eject_card();
			op.prompt_for_pin();
			
		}
	}
	public void correctAboveMin(){
		op.display_menu();
	}
	public void correctBelowMin(){
		op.display_menu();
	}
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

