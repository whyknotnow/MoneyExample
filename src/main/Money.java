package main;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
//factory methods
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}//end of factory methods
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return amount == money.amount && 
				getClass().equals(money.getClass());
	}
	
	public abstract Money times(int multiplier);

	public String currency(){
		return currency;
	}
}
