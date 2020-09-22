package com.example.mp2020_wookie_abn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar action = getSupportActionBar();
        action.setHomeButtonEnabled(true);
        action.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //터치한 메뉴 항목의 id값을 얻어온다.
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                // 현재 액티비티를 종료한다.
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}