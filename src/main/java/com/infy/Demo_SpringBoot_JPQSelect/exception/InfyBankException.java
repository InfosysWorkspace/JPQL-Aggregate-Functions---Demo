package com.infy.Demo_SpringBoot_JPQSelect.exception;

public class InfyBankException extends Exception{
    private static final long serialVersionUID = 1L;
    public InfyBankException(String message){
        super(message);
    }
}
