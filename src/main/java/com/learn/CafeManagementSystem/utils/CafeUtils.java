package com.learn.CafeManagementSystem.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils() {

    }
    public static ResponseEntity<String> getResponseEntity(String responseMassage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMassage+"\"}", httpStatus);
    }



}
