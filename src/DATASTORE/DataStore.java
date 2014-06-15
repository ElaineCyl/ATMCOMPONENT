package DATASTORE;

public class DataStore {
	
	public static int ak;   // for telling which atm it is now
	public static int tempI;  // temporate space 
	public static int tempII;
	public static float tempF;
	public static String tempS;
	public static int getak(){  // return ak;
		return ak;
	}
	public static void setak(int n){  // set ak
		ak=n;
	}
	public static void setPinS(String tempS){  // set pin to ds1
		DS1.pin=tempS;
	}
	public static String getPinS(){  // return pin of ds1
		return DS1.pin; 
	}
	public static void setBalI(int N){  // set balance
		if(ak==1){
			DS1.bal=N;
		}
		else
			DS3.bal=N;
	}
	public static int getBalI(){  //return balance
		if(ak==1)
			return DS1.bal;
		else
			return DS3.bal;
	}
	public static void setPinI(int tempII){  // set pin to ds2 and ds3
		if(ak==2)
			DS2.pin=tempII;
		else
			DS3.pin=tempII;
	}
	public static int getPinI(){  //return pin
		if(ak==2)
			return DS2.pin;
		else
			return DS3.pin;
	}
	public static void setBalF(float tempF){  // set balance to ds2
		DS2.bal=tempF;
	}
	public static float getBalF(){   //return ds2.
		return DS2.bal;
	}
	
}
