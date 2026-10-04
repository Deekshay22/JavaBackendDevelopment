package in.com;

public class Main {
public static void main(String[] args) {
	
	int x=10;// local variable -- No Default Values
	
	/* local variable has no default values */
	
	Bank bank = new Bank();
	
	//default value 
	System.out.println(bank.id);
	System.out.println(bank.name);
	System.out.println(bank.address);
	
	
	bank.id=101;
	bank.name= "SBI";
	bank.address= "Samta";
	bank.chequeSubmit();
	bank.print();
}
}

/*
 Integer-- 0 
 String --> null(Nothing) 
 floating -->0.0 
 Boolean -->false
 */


class Bank{
	String name;// information/data/prorpertis --> instance variable
	String address;
	long id;
	
	void chequeSubmit() {
		System.out.println("submit check");
	}
	void print() {
		System.out.println("id " +id+ " name " + name   + " address " +address );
	}
}