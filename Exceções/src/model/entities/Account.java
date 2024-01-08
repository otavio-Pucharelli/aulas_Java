package model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws Exception {
        if (balance < 0) {
            throw new Exception("Balance must be greater than zero");
        }
        if (withdrawLimit < 0) {
            throw new Exception("Withdraw limit must be greater than zero");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount must be greater than zero");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) throws Exception {
        if (amount > this.withdrawLimit) {
            throw new Exception("The amount exceeds withdraw limit");
        }
        if (amount > this.balance) {
            throw new Exception("Not enough balance");
        }
        this.balance -= amount;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "{" + " number='" + getNumber() + "'" + ", holder='" + getHolder() + "'" + ", balance='" + getBalance()
                + "'" + ", withdrawLimit='" + getWithdrawLimit() + "'" + "}";
    }
}
