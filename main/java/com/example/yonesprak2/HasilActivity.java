package com.example.yonesprak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView tv_nama,tv_nim,tv_nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tv_nama = findViewById(R.id.tv_nama);
        tv_nim = findViewById(R.id.tv_nim);
        tv_nilai = findViewById(R.id.tv_nilai);

        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String nilai = getIntent().getExtras().getString("nilai");

        tv_nama.setText(": "+nama);
        tv_nim.setText(": "+nim);
        tv_nilai.setText(": "+nilai);
    }

    public void btn_back(View view) {
        Intent i =new Intent(HasilActivity.this,MainActivity.class);
        startActivity(i);
    }
}