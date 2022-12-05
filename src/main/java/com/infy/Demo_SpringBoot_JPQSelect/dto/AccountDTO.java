package com.infy.Demo_SpringBoot_JPQSelect.dto;

import java.time.LocalDate;

public class AccountDTO {
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
    public String toString(){
        return "AccountDTO [accountNumber=" +accountNumber+
                ", accountType=" +accountType+
                ", openingDate=" +openingDate+
                ", balance=" +balance+
                ", accountStatus" +accountStatus+ "]";
    }
}
