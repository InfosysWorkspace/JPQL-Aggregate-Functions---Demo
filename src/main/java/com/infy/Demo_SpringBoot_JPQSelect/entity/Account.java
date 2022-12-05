package com.infy.Demo_SpringBoot_JPQSelect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Account {

    @Id
    private Integer accountNumber;
    private String accountStatus;
    private String accountType;
    private Integer balance;
    private LocalDate openingDate;

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(final Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(final String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final String accountType) {
        this.accountType = accountType;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(final Integer balance) {
        this.balance = balance;
    }

    public LocalDate getOpeningDate() {
        return this.openingDate;
    }

    public void setOpeningDate(final LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getAccountNumber() == null) ? 0 :
                this.getAccountNumber().hashCode());
                return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Account other = (Account) obj;

        if (this.getAccountNumber() == null){
            if (other.getAccountNumber() != null)
                return false;
        }
        else if (!this.getAccountNumber().equals(other.getAccountNumber()))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "Account [accountNumber=" +accountNumber+
                ", accountType=" +accountType+
                ", openingDate=" +openingDate+
                ", balance=" +balance+
                ", accountStatus" +accountStatus+ "]";
    }
}
