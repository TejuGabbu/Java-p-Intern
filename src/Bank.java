public class Bank
{
    int DebitCardId;

    int pin;

    String name;

    int balance;

    String city;

    public Bank(int debitCardId, int pin, String name, int balance, String city) {
        DebitCardId = debitCardId;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
        this.city = city;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getDebitCardId() {
        return DebitCardId;
    }

    public void setDebitCardId(int debitCardId) {
        DebitCardId = debitCardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
