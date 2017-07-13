package com.vengeance.emu.hackingforgood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TakeActivity extends AppCompatActivity {

    private Button mRequestButton;
    private EditText mTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTitleText = (EditText) findViewById(R.id.titleEditText);

        mRequestButton = (Button) findViewById(R.id.btn_request);
        mRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mTitleText.getText().length() > 0) {
                    Log.i("Request button", mTitleText.getText().toString());
                    Intent intent = new Intent();
                    intent.putExtra("TITLE", mTitleText.getText().toString());
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }

}
