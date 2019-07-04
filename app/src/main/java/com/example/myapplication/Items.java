package com.example.myapplication;

public class Items {
    private String Name,Date,CardNumber;

    public Items(String name, String date, String cardNumber) {
        Name = name;
        Date = date;
        CardNumber = cardNumber;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public String getCardNumber() {
        return CardNumber;
    }
}
