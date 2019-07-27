package com.example.tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.tinhtong.MainActivity.KEY_SOTHUHAI;
import static com.example.tinhtong.MainActivity.KEY_SOTHUNHAT;

public class SubActivity extends AppCompatActivity {

    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Radition();
        GetData();
    }

    private void GetData() {
        Intent intent = getIntent();
        int SoThuNhat = intent.getExtras().getInt(KEY_SOTHUNHAT,-1);
        int SoThuHai = intent.getExtras().getInt(KEY_SOTHUHAI,-1);
        long result = TinhTong(SoThuNhat,SoThuHai);
        tvResult.setText(result+"");
    }

    private long TinhTong(int so1, int so2) {
        return so1+so2;
    }


    private void Radition() {
        tvResult = (TextView) findViewById(R.id.tvResult);
    }
}
