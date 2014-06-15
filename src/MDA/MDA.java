package MDA;

import State.*;

public class MDA {// context class of State Pattern, contains the methods.
	int k=-1;
	public static int attempt;
	idle ie = new idle();
	checkPin cn = new checkPin();
	ready ry = new ready();
	S1 S1S = new S1();
	overdrawn on = new overdrawn();
	locked ld = new locked();
	State S = new State();
	State[] LS = new State[6];// a list of State.
	
	
	public MDA(){
	LS[0]=ie;
	LS[1]=cn;
	LS[2]=ry;
	LS[3]=S1S;
	LS[4]=on;
	LS[5]=ld;
	}
	public void create(){
		
		if(k!=0&&k!=1&&k!=2&&k!=3&&k!=4&&k!=5){   // only can be invoked in initiate state;
		if(S.getid()==-1){
			k=0;
			S=LS[0];// move state to idle
			S.create();
		}
		}
	}
	public void card(){ 
		if(k==0){	// only can be invoked in idle state;
			S=LS[0];
			S.card();
			k=1;	// move state checkPin;
		}
	}
	public void incorrectPin(int max){
		if(k==1){	//only can be invoked in checkPin state;
			S=LS[1];
			if(MDA.attempt<max){
				S.incorrectPin(max);
				++MDA.attempt;
				k=1; 
			}
			else
				S.incorrectPin(max);
				k=0; //move state to idle;
			k=1;
				
		}
	}
	public void correctAboveMin(){
		if(k==1){ // only can be invoked in checkPin State
			S=LS[1];
			S.correctAboveMin();
			k=2;           // move state to ready
			 
		}
	}
	public void correctBelowMin(){
		if(k==1){  // only can be invoked in checkPin State
			S=LS[1];    // move state to overdrawn
			S.correctBelowMin();
			k=4;
			
		}
	}
	public void balance(){
		if(k==2){  // only can be invoked in ready State
			S=LS[2];
			S.balance();
			k=2;
		}
		else if(k==4){  // only can be invoked in overdrawn State
			S=LS[4];  
			S.balance();
			k=4;
		}
	}
	public void exit(){
		if(k==2){   // only can be invoked in ready State
			S=LS[2];
			S.exit();
			k=0;   // move state to idle
		}
		else if(k==4){   // only can be invoked in overdrawn State
			S=LS[4];
			S.exit();
			k=0;   // move state to idle
		}
	}
	public void deposit(){
		if(k==2){  // only can be invoked in ready State
			S=LS[2];
			S.deposit();
			k=2;
		}
		else if(k==4){  // only can be invoked in overdrawn State
			S=LS[4];
			S.deposit();
			k=3;  // move state to S1
			
		}
	}
	public void aboveMin(){
		if(k==3){    // only can be invoked in S1 State
			S=LS[3];
			S.aboveMin();
			k=2;    //move state to ready
			
		}
	}
	public void belowMin(){
		if(k==3){   // only can be invoked in S1 State
			S=LS[3];
			S.belowMin();
			k=4;       //move state to overdrawn
			
		}
	}
	public void penaltyBelowMin(){
		if(k==3){   // only can be invoked in S1 State
			S=LS[3];
			S.penaltyBelowMin();
			k=4;     //move state to overdrawn
		}
	}
	public void withdraw(){
		if(k==2){   // only can be invoked in ready State
			S=LS[2];
			S.withdraw();
			k=3;       // move state to S1
		}
	}
	public void lock(){
		if(k==2){   // only can be invoked in ready State
			S=LS[2];
			S.lock();
			k=5;   //move state to locked
			
		}
		else if(k==4){   // only can be invoked in overdrawn State
			S=LS[4];
			S.lock();
			k=5;  //move state to locked
		}
	}
	public void unlock(){
		if(k==5){   ////move state to S1.
			S=LS[5];
			S.unlock();
			k=3;
		}
	}
	
	

}
