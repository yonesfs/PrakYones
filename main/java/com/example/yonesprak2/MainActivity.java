package com.example.yonesprak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etnama,etnim,etnilai;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //isi form
        etnama = findViewById(R.id.et_nama);
        etnim = findViewById(R.id.et_nim);
        etnilai = findViewById(R.id.et_nilai);
        btnsubmit =findViewById(R.id.btn_submit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String snama = etnama.getText().toString();
                    String snim = etnim.getText().toString();
                    String snilai = etnilai.getText().toString();
                    Intent i = new Intent(MainActivity.this, HasilActivity.class);

                    i.putExtra("nama", snama);
                    i.putExtra("nim", snim);
                    double hnilai = Double.parseDouble(snilai);
                    if (hnilai <= 4.00) {
                        if (hnilai > 3.66 && hnilai <= 4.00) {
                            i.putExtra("nilai", "A");
                        } else if (hnilai > 3.33 && hnilai <= 3.66) {
                            i.putExtra("nilai", "A-");
                        } else if (hnilai > 3.00 && hnilai <= 3.33) {
                            i.putExtra("nilai", "B+");
                        } else if (hnilai > 2.66 && hnilai <= 3.00) {
                            i.putExtra("nilai", "B");
                        } else if (hnilai > 2.33 && hnilai <= 2.66) {
                            i.putExtra("nilai", "B-");
                        } else if (hnilai > 2.00 && hnilai <= 2.33) {
                            i.putExtra("nilai", "C+");
                        } else if (hnilai > 1.66 && hnilai <= 2.00) {
                            i.putExtra("nilai", "C");
                        } else if (hnilai > 1.33 && hnilai <= 1.66) {
                            i.putExtra("nilai", "C-");
                        } else if (hnilai > 1.00 && hnilai <= 1.33) {
                            i.putExtra("nilai", "D+");
                        } else {
                            i.putExtra("nilai", "D");
                        }
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplication(), "Nilai Melebihi 4.00", Toast.LENGTH_SHORT).show();
                    }

                }catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}