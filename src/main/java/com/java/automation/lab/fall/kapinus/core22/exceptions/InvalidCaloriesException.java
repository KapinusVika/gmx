package com.java.automation.lab.fall.kapinus.core22.exceptions;

public class InvalidCaloriesException extends Exception{
    public InvalidCaloriesException(){
        super("Daily calorie content should be more than 1200");
    }
}
