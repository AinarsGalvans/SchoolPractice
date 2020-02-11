package ainars.accounting;

import java.util.UUID;

public class Account {

    Person getPerson() {
        return person;
    }
    private Person person;
    private UUID accountId = UUID.randomUUID();
    public Double getBalance() {
        return balance;
    }
    private Double balance = 0.0;
    public Account(Person person) {
        this.person = person;
    }

    public void deposit(Double amount) {

        if (amount<0) throw new IllegalArgumentException("Can not deposit negative value");
        balance +=amount;
    }

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
