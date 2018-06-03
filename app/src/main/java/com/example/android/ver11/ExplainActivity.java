package com.example.android.ver11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExplainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getString(R.string.Help));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
