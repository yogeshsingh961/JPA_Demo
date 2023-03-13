package com.AkhandBharat.jpademo;

import jakarta.persistence.*;

@Entity
public class Card {

    @Id  // makes cardNo as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// this will  generate id automatically in table
    private int cardNo;

   // to make dob not null & unique--> @Column(nullable = false,unique=true)
    private String dob;
    @Enumerated(EnumType.STRING) // store this enum in sql table in form of varchar because enum is not a valid datatype for sql
    private Status status;
     @OneToOne
     @JoinColumn
     User uesr;

    public Card(){}
    public Card(int cardNo, String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
