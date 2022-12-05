package com.infy.Demo_SpringBoot_JPQSelect.service;

import com.infy.Demo_SpringBoot_JPQSelect.exception.InfyBankException;
import com.infy.Demo_SpringBoot_JPQSelect.repoository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Double getAverageBalance() throws InfyBankException{
        return customerRepository.getAverageBalance();
    }

    @Override
    public Long getTotalBalance() throws InfyBankException{
        return customerRepository.getTotalBalance();
    }

    @Override
    public Long getNumberOfAccounts() throws InfyBankException{
        return customerRepository.getNumberOfAccounts();
    }

    @Override
    public Integer getMinimumBalance() throws InfyBankException{
        return customerRepository.getMinimumBalance();
    }

    @Override
    public Integer getMaximumBalance() throws InfyBankException{
        return customerRepository.getMaximumBalance();
    }
}
