public class CreditCardDemo {
    public static void main(String[] args) {
        // Create a person
        Person person = new Person("John", "Doe", new Address("123 Main St", "City", "State", "12345"));

        // Create a credit card for the person with a credit limit
        CreditCard creditCard = new CreditCard(person, new Money(1000.0));

        // Display credit card information
        System.out.println("Credit Card Information:");
        System.out.println("Owner: " + creditCard.getPersonals());
        System.out.println("Balance: " + creditCard.getBalance());
        System.out.println("Credit Limit: " + creditCard.getCreditLimit());

        // Charge $500 to the credit card
        Money chargeAmount = new Money(500.0);
        creditCard.charge(chargeAmount);

        // Display updated balance
        System.out.println("\nAfter Charging " + chargeAmount + ":");
        System.out.println("Balance: " + creditCard.getBalance());
        System.out.println("Credit Limit: " + creditCard.getCreditLimit());

        // Make a payment of $200 on the credit card
        Money paymentAmount = new Money(200.0);
        creditCard.payment(paymentAmount);

        // Display updated balance
        System.out.println("\nAfter Making Payment " + paymentAmount + ":");
        System.out.println("Balance: " + creditCard.getBalance());
        System.out.println("Credit Limit: " + creditCard.getCreditLimit());
    }
}
