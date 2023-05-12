package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tx1, tx2;
    TextView tvhas;
    Button tambah, kurang, kali, bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tvHASIL);
        EditText et1 = findViewById(R.id.editText5);
        EditText et2 = findViewById(R.id.editText6);
        Button bt1 = findViewById(R.id.btTAMBAH);
        Button bt2 = findViewById(R.id.btKURANG);
        Button bt3 = findViewById(R.id.btKALI);
        Button bt4 = findViewById(R.id.btBAGI);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah;
                if (view.getId() == bt1.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 + x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kurang;
                if (view.getId() == bt2.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 - x2;
                    kurang = String.valueOf(hasil);
                    tv1.setText(kurang);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kali;
                if (view.getId() == bt3.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 * x2;
                    kali = String.valueOf(hasil);
                    tv1.setText(kali);
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bagi;
                if (view.getId() == bt4.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 / x2;
                    bagi = String.valueOf(hasil);
                    tv1.setText(bagi);
                }
            }
        });
    }
}