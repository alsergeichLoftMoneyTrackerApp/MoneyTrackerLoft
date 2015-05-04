package ru.loftschool.moneytrackerloft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Created by Кот on 28.04.2015.
 */
public class TransactionAdapter extends ArrayAdapter<Transaction> {

    List<Transaction> transaction;

    public TransactionAdapter(Context context, List<Transaction> transaction) {
        super(context, 0, transaction);

        this.transaction = transaction;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transaction transaction = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvSum = (TextView) convertView.findViewById(R.id.sum);
        TextView tvData_d = (TextView) convertView.findViewById(R.id.data_d);

        tvName.setText(transaction.title);
        tvSum.setText(transaction.sum);
        tvData_d.setText(transaction.data_d);

        return convertView;
    }
}
