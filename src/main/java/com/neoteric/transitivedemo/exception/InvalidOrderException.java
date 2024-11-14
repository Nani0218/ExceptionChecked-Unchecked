package com.neoteric.transitivedemo.exception;

public class InvalidOrderException extends Exception{

    public InvalidOrderException(String msg){
        super(msg);
    }

}