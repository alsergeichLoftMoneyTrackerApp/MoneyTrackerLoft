package ru.loftschool.moneytrackerloft;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List<Transaction> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Transaction> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(this, adapterData);

        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);
    }

    private List<Transaction> getDataList() {
        data.add(new Transaction("Telephone", "2000", now));
        data.add(new Transaction("Visky", "1000", 04.05 .2015));
        data.add(new Transaction("Coffy", "800", 04.05 .2015));
        data.add(new Transaction("Tea", "300", 04.05 .2015));
        data.add(new Transaction("Bred", "20", 04.05 .2015));


        return data;
    }


}
