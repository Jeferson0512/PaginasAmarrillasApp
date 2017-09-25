package com.jeferson.paginasamarrillasapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewSecondFragment extends Fragment {

    private static final String TAG = ViewSecondFragment.class.getSimpleName();

    private String param1;

    public ViewSecondFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        // Get argument param1 if exists
        if (getArguments() != null) {
            this.param1 = getArguments().getString("param1");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.activity_view_second_fragment, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText(textView.getText() + "\nParam1: " + param1);

        return view;
    }

}
