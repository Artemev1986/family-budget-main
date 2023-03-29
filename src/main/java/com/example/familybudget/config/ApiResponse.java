package com.example.familybudget.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {

    private int status;
    private String message;

    @Override
    public String toString() {
        return "ApiResponse [statusCode=" + status + ", message=" + message +"]";
    }

}