package com.hongdroid.viewpagerexample.ExtraTabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hongdroid.viewpagerexample.R;

public class ShowWritingActivity extends AppCompatActivity {

    TextView tv_title, tv_content, tv_writer, tv_date;
    ImageView iv_heart, iv_back;
    Boolean is_like;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_writing);

        tv_title = findViewById(R.id.tv_title);
        tv_content = findViewById(R.id.tv_content);
        tv_writer = findViewById(R.id.tv_writer);
        tv_date = findViewById(R.id.tv_date);

        Bundle extras = getIntent().getExtras();
        String writings = extras.getString("writing");
//        String title = extras.getString("title");
//        String writer = extras.getString("writer");
//        String date = extras.getString("date");

        tv_content.setText(writings);
//        tv_title.setText(title);
//        tv_writer.setText(writer);
//        tv_date.setText(date);

        // 누르면 좋아요 올라가기
        iv_heart = findViewById(R.id.iv_heart);
        is_like = false; // 서버에서 받아와야 함.
        setHeartImage(is_like);

        iv_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_like = (is_like? false: true);
                setHeartImage(is_like);
            }
        });

        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setHeartImage(Boolean is_like) {
        if (is_like)
            iv_heart.setImageResource(R.drawable.heart_red);
        else
            iv_heart.setImageResource(R.drawable.heart);
    }
}