package ru.loftschool.moneytrackerloft;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/**
 * Created by work on 01.06.2015.
 */
public class TransactionsFragment extends Fragment {
    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List<Transaction> data = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_transactions, container);
        List<Transaction> adapterData = getTransactions();
        transactionAdapter = new TransactionAdapter(getActivity(), adapterData);

        listView = (ListView) inflate.findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);

        return inflate;
    }

    private String dateFormat = "dd-MM-yyyy";

    private List<Transaction> getTransactions() {

        DateFormat df = new SimpleDateFormat(dateFormat, new Locale("ru"));
        Date now_calendar = Calendar.getInstance().getTime();
        String now = df.format(now_calendar);
        data.add(new Transaction("Huawei", "9800", now));
        data.add(new Transaction("SamsungS3", "13000", now));
        data.add(new Transaction("T-shirt", "300", now));
        data.add(new Transaction("Jeans", "1500", now));
        data.add(new Transaction("Printer", "4500", now));
        return data;
    }
}