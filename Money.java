
        
    



public class Money {
    
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) + (otherAmount.dollars * 100 + otherAmount.cents);
        long newDollars = totalCents / 100;
        long newCents = totalCents % 100;
        return new Money(newDollars + (newCents / 100.0));
    }

    public Money subtract(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);
        long newDollars = totalCents / 100;
        long newCents = totalCents % 100;
        return new Money(newDollars + (newCents / 100.0));
    }

    public int compareTo(Money otherObject) {
        if (this.dollars < otherObject.dollars)
            return -1;
        else if (this.dollars > otherObject.dollars)
            return 1;
        else if (this.cents < otherObject.cents)
            return -1;
        else if (this.cents > otherObject.cents)
            return 1;
        else
            return 0;
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
