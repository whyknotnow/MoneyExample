package main;

public class Money {
	protected int amount;
	protected String currency;
	
	public Money times(int multiplier){
		return new Money(amount * multiplier, currency);
	}
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
//factory methods
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
//end of factory methods
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return (amount == money.amount) && currency().equals(money.currency());
	}

	public String currency(){
		return currency;
	}
	
	public String toString(){
		return amount + " " + currency;
	}
}
