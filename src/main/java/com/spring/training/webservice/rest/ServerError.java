package com.spring.training.webservice.rest;



public class ServerError {
    public final static int IOEXCEPTION = 1;
    public final static int ARITHMATIC_EXCEPTION = 2;

    int code;
    String description;

    public ServerError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
