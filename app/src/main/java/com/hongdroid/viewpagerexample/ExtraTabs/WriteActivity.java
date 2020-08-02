package com.hongdroid.viewpagerexample.ExtraTabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hongdroid.viewpagerexample.R;

public class WriteActivity extends AppCompatActivity {

    TextView tv_complete, tv_topic;
    EditText et_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        tv_complete = findViewById(R.id.tv_complete);
        tv_topic = findViewById(R.id.tv_topic);
        et_write = findViewById(R.id.et_write);

//        tv_topic.setText();
         // intent에서 받은걸로 설정하셈

        tv_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String writing = et_write.getText().toString();
                Intent intent = new Intent(getApplicationContext(), ShowWritingActivity.class);
                intent.putExtra("writing", writing);
                startActivity(intent);



            }
        });

    }
}