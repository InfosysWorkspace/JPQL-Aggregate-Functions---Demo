package com.infy.Demo_SpringBoot_JPQSelect.repoository;

public interface CustomerRepository {
    public Double getAverageBalance();
    public Long getTotalBalance();
    public Long getNumberOfAccounts();
    public Integer getMinimumBalance();
    public Integer getMaximumBalance();
}
