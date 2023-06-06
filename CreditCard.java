public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Using the copy constructor to create a new object
        this.balance = new Money(0); // Initialize balance to zero
    }

    public Money getBalance() {
        return new Money(balance); // Returning a new object with the same values using the copy constructor
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // Returning a new object with the same values using the copy constructor
    }

    public String getPersonals() {
        return owner.toString(); // Calling the toString method for the owner Person object
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Credit limit exceeded. Charge declined.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
