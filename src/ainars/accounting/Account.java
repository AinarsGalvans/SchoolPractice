package ainars.accounting;

import java.util.UUID;

public class Account {

    Person getPerson() {
        return person;
    }
    private Person person;
    private UUID accountId = UUID.randomUUID();

    // Return current balance of the account
    public Double getBalance() {
        return balance;
    }

    private Double balance = 0.0;

    //Create account owned by the person
    public Account(Person person) {
        this.person = person;
    }

    //Increase account balance by given amount. Throw exception if input is negative
    public void deposit(Double amount) {

        if (amount<0) throw new IllegalArgumentException("Can not deposit negative value");
        balance +=amount;
    }

    //Decrease account balance by given amount. Throw exception if result amount would be negative
    public void withdraw(Double amount) {
        if (amount>balance) throw new IllegalArgumentException("Can not withdraw the value");
        balance -=amount;
    }

    void addInterestRate() {
        if (balance>1000) {balance+=balance*0.05; return;}
        if (balance>500) {balance+=balance*0.03; return;}
        balance+=balance*0.01;
    }



}
