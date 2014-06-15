import java.util.Scanner;
import ATM.ATM1;
import ATM.ATM2;
import ATM.ATM3;
public class test {
	
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the ATM number:1,2,3");
		int num = sc.nextInt();
		switch(num){
		case(1):
			ATM1 a1 = new ATM1();
			System.out.println("please input the balance and pin number");
			int bal = sc.nextInt();
			String pinS = sc.next();
			System.out.println("*******************MENU********************");
			System.out.println("create-1");
			System.out.println("card-2");
			System.out.println("pin-3");
			System.out.println("balance-4");
			System.out.println("deposit-5");
			System.out.println("withdraw-6");
			System.out.println("lock-7");
			System.out.println("unlock-8");
			System.out.println("exit-9");
			System.out.println("exit the program-10");
			System.out.println("*******************************************");
			System.out.println("input the number you want:");
			int choice = sc.nextInt();
			
			int c=choice;
			
			
			while(c!=10){
			switch(c){
			case(1):
				a1.create();
				break;
			case(2):
				a1.card(bal, pinS);
				break;
			case(3):
				System.out.println("input the pin number:");
				String pin= sc.next();
				a1.pin(pin);
				break;
			case(4):
				//System.out.println("balance is:");
				a1.balance();
				break;
			case(5):
				System.out.println("input the amount you want to deposit:");
				int d = sc.nextInt();
				a1.deposit(d);
				break;
			case(6):
				System.out.println("input the amount you want to withdraw:");
				int w= sc.nextInt();
				a1.withdraw(w);
				break;
			case(7):
				System.out.println("input the pin number:");
				String p= sc.next();	
				a1.lock(p);
				break;
			case(8):
				System.out.println("input the pin number:");
				String up =sc.next();
				a1.unlock(up);
				break;
			case(9):
				a1.exit();
				break;
			default:
				System.out.println("wrong number:");
			}
			
			System.out.println("create-1,card-2,pin-3,balance-4,deposit-5,withdraw-6,lock-7,unlock-8,exit-9,exit the program-10.");
			System.out.println("input the menu number:");
			c=sc.nextInt();
			}
			break;
		case(2):
			ATM2 a2 = new ATM2();
			System.out.println("please input the balance and pin number");
			float balF = sc.nextFloat();
			int pinI = sc.nextInt();
			System.out.println("*******************MENU********************");
			System.out.println("create-1");
			System.out.println("card-2");
			System.out.println("pin-3");
			System.out.println("balance-4");
			System.out.println("deposit-5");
			System.out.println("withdraw-6");
			System.out.println("exit-7");
			System.out.println("exit-10");
			System.out.println("*******************************************");
			System.out.println("input the number you want:");
			int c1 = sc.nextInt();
		
			int cc=c1;
		
		
			while(cc!=10){
				switch(cc){
				case(1):
					a2.create();
				break;
				case(2):
					a2.card(balF, pinI);
				break;
			case(3):
				System.out.println("input the pin number:");
				int pin= sc.nextInt();
				a2.pin(pin);
				break;
			case(4):
				a2.balance();
				break;
			case(5):
				System.out.println("input the amount you want to deposit:");
				float d = sc.nextFloat();
				a2.deposit(d);
				break;
			case(6):
				System.out.println("input the amount you want to withdraw:");
				float w= sc.nextFloat();
				a2.withdraw(w);
				break;
			case(7):
				a2.exit();
				break;
			default:
				System.out.println("wrong number:");
		}
		System.out.println("create-1,card-2,pin-3,balance-4,deposit-5,withdraw-6,exit-7,exit the program-10.");
		System.out.println("input the menu number:");
		cc=sc.nextInt();
		}
			break;
		case(3):
			ATM3 a3 = new ATM3();
		System.out.println("please input the balance and pin number");
		int balI = sc.nextInt();
		int pinII = sc.nextInt();
		System.out.println("*******************MENU********************");
		System.out.println("create-1");
		System.out.println("card-2");
		System.out.println("pin-3");
		System.out.println("balance-4");
		System.out.println("deposit-5");
		System.out.println("withdraw-6");
		System.out.println("lock-7");
		System.out.println("unlock-8");
		System.out.println("exit-9");
		System.out.println("exit-10");
		System.out.println("*******************************************");
		System.out.println("input the number you want:");
		int c2 = sc.nextInt();
		while(c2!=10){
		switch(c2){
		case(1):
			a3.create();
			break;
		case(2):
			a3.card(balI, pinII);
			break;
		case(3):
			System.out.println("input the pin number:");
			int pin= sc.nextInt();
			a3.pin(pin);
			break;
		case(4):
			//System.out.println("balance is:");
			a3.balance();
			break;
		case(5):
			System.out.println("input the amount you want to deposit:");
			int d = sc.nextInt();
			a3.deposit(d);
			break;
		case(6):
			System.out.println("input the amount you want to withdraw:");
			int w= sc.nextInt();
			a3.withdraw(w);
			break;
		case(7):
			a3.lock();
			break;
		case(8):
			a3.unlock();
			break;
		case(9):
			a3.exit();
			break;
		default:
			System.out.println("wrong number:");
			
		}
		
		System.out.println("create-1,card-2,pin-3,balance-4,deposit-5,withdraw-6,lock-7,unlock-8,exit-9,exit the program-10.");
		System.out.println("input the menu number:");
		c2=sc.nextInt();
		}
			break;
		}
		
	
		System.out.println("END");
	}
}
