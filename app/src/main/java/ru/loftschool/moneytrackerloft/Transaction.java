package ru.loftschool.moneytrackerloft;

import android.provider.ContactsContract;

import java.util.Date;

/**
 * Created by Кот on 28.04.2015.
 */
public class Transaction {
    public String title;
    public String sum;
    public Date data_d;

    public Transaction(String title, String sum, Date data_d) {
        this.title = title;
        this.sum = sum;
        this.data_d = data_d;

    }
}
