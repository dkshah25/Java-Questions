class BankAccount {
    void rate () {
        System.out.println("The ROI is 4%");
    }
}

class SavingsAccount extends BankAccount {
    void rate () {
        System.out.println("The ROI is 6%");
    }
}

class CurrentAccount extends BankAccount {
    void rate () {
        System.out.println("The ROI is 8%");
    }
}

public class Main2 {
    public static void main (String[] args) {
        CurrentAccount ca = new CurrentAccount();
        ca.rate();
    }
}
