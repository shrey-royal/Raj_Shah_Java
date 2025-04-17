/*
Encapsulation: It refers to wrapping data and the code acting on the data together into a single unit.

*/

class BankAccount {
    // Data members are private (encapsulated)
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolder = name;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    //getter setter methods to access private data members
    //getter method for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    //setter method for accountHolder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    //getter method for balance
    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
};

public class Encapsulation_1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 500.0);
        acc.showBalance();

        acc.deposit(200.0);
        acc.withdraw(100.0);
        acc.showBalance();

        // acc.balance = 1000;  // Not allowed
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}

/*
Tasks:

🧒 1. Person Info

Problem:  
Create a `Person` class with private fields: `name` and `age`.  
Provide public methods to set and get these values.

---

🐶 2. Dog Details

Problem:  
Create a `Dog` class with private fields: `breed` and `color`.  
Add methods to set and get these values.  
Also add a method to display the dog's details.

---

📱 3. Mobile Phone

Problem:  
Create a `Mobile` class with private fields: `brand` and `price`.  
Use public methods to set and get the brand and price.

---

🏫 4. Simple Student Class

Problem:  
Create a `Student` class with private fields: `name` and `standard` (like 6th, 7th, etc.).  
Allow setting and getting these values through methods.

---

🎵 5. Song Info

Problem:  
Create a `Song` class with private fields: `title` and `duration`.  
Add public methods to set and get these fields, and a method to print song details.

---

*/