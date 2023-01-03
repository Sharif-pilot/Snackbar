package com.example.sharif.snackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    Snackbar snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(v,"Message sent", Snackbar.LENGTH_LONG);
                snackbar.setDuration(8000);
                snackbar.setAction("Dismiss", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });

                View view = snackbar.getView();
                view.setBackgroundColor(getResources().getColor(R.color.colorSnackarBackground));

                TextView txt = view.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(getResources().getColor(R.color.colorSnackarText));
                TextView txtAction = view .findViewById(android.support.design.R.id.snackbar_action);
                txtAction.setTextColor(getResources().getColor(R.color.colorSnackarAction));
                snackbar.show();
            }
        });
//        View view = findViewById(R.id.activity_main);
//        Snackbar.make(view,"Hello Snackbar!",Snackbar.LENGTH_SHORT).show();
//        snackbar = Snackbar.make(view,"Hello Snackbar!",Snackbar.LENGTH_INDEFINITE);
//        snackbar.setDuration(10000);
//        snackbar.show();
    }
}
