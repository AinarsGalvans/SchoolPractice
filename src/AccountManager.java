import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(Person person) {
        Account acc = new Account(person);
        accounts.add(acc);
        return acc;
    }

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

    public void newYear() {
        for (Account a:accounts
             ) {a.addInterestRate();
        }
    }
}
