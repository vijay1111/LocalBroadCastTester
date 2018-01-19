package com.example.vijay.localbroadcasttester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void view_click(View view) {
        switch (view.getId()) {
            //this means custombroadcastreciever app can be use by another app because in manifest exporter = true. means public
            case R.id.button1:
                Intent intent = new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
                sendBroadcast(intent);
                break;

        }

    }
}
