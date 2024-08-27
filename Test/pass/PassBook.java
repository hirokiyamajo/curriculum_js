package Test.pass;

public class PassBook implements Pass {

	// 名前
	private String name;

	// 支店番号
	private int branchNumber;

	// 口座番号
	private int accountNumber;

	// 残高
	private int money;

	public PassBook(String name, int branchNumber, int accountNumber, int money) {
		this.name = name;
		this.branchNumber = branchNumber;
		this.accountNumber = accountNumber;
		this.money = money;
	}
	//問題2は以下に記述する事
		@Override
	public void checkBalance() {
		    String number = getAccountNumber();
		    
	}

	
    //問題3は以下に記述する事
		@Override
	public void deposit(int en) {
		    this.money += en;
	}

	//問題4は以下にメソッドを作成して記述する事
		@Override
	public void withdrawal(int en){
		    if () {
		        
		    }
		    this.money -= en;
	    
	}

	//問題5は以下にメソッドを作成して記述する事
		@Override
	public void transfer(PassBook ma,PassBook mb,int en){
	    
	}

	
	public String getName() {
		return this.name;
	}
}
