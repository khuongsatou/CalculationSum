package com.example.tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtSoThuNhat,edtSoThuHai;
    private Button btnTinhTong;
    int SoThuNhat,SoThuHai;
    public static  final String KEY_SOTHUNHAT = "123";
    public static  final String KEY_SOTHUHAI = "456";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radiation();
        Event();
    }

   

    private void GetData() {


        try {
            SoThuNhat =Integer.parseInt(edtSoThuNhat.getText().toString());
            SoThuHai =Integer.parseInt( edtSoThuHai.getText().toString());
        }catch (Exception err){
            Toast.makeText(MainActivity.this,"Vui Lòng nhập số",Toast.LENGTH_LONG).show();
        }

    }

    private void Event() {
        btnTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetData();
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra(KEY_SOTHUNHAT,SoThuNhat);
                intent.putExtra(KEY_SOTHUHAI,SoThuHai);
                startActivity(intent);
            }
        });

    }

    private void Radiation() {
        edtSoThuNhat = (EditText) findViewById(R.id.edtSoThuNhat);
        edtSoThuHai = (EditText) findViewById(R.id.edtSoThuHai);
        btnTinhTong = (Button) findViewById(R.id.btnTinhTong);

    }
}
