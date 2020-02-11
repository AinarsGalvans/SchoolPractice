package ainars.accounting;

import ainars.accounting.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();

    //Create account for the person
    public Account createAccount(Person person) {
        Account acc = new Account(person);
        accounts.add(acc);
        return acc;
    }

    //Count sum of all acounts owned by the person, throws exception if person wons no account
    public Double getSumOfBalances(Person person) {
        Double sum = 0.0;
        Boolean found = false;
        for (Account a:accounts
             ) { if (a.getPerson().getUserId().equals(person.getUserId())) {
                 sum +=a.getBalance();
                 found = true;
            }
        }
        if (found) return  sum;
        throw new IllegalArgumentException("Person has no accounts");
    }

    //return list of persons matching firstname and lastname
    public List<Person> findPersonas(String firstName, String LasName) {
        List<Person> result = new ArrayList<>();

        for (Account a:accounts
        ) { if (
                (a.getPerson().getFirstName().equals(firstName) &&
                        (a.getPerson().getLastName().equals(LasName)))
        )
            {result.add(a.getPerson());
        }
        }
        return result;
    }

    //Add interest rate to each of managed accounts: 1% if balance 0-500, 3% if 500.01-10000 nand 5% if more
    public void newYear() {
        for (Account a:accounts
             ) {a.addInterestRate();
        }
    }
}
