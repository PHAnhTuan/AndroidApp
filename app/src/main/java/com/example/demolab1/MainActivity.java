package com.example.demolab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvHello;
    private static String TAG ="MainActivity";

    EditText edtTen, edtMSSV, edtTuoi;

    Button btnLuu;

    RadioButton rdioNam, rdioNu;

    CheckBox cbChoigame, cbDabong;

    TextView txtNoidung;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:");
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate:");
        //Ánh xạ tới các control thẳng qua id
        edtTen = findViewById(R.id.edtTen);
        edtMSSV = findViewById(R.id.edtMSSV);
        edtTuoi = findViewById(R.id.edtTuoi);
        rdioNam = findViewById(R.id.rdioNam);
        rdioNu = findViewById(R.id.rdioNu);
        cbChoigame = findViewById(R.id.cbChoigame);
        cbDabong = findViewById(R.id.cbDabong);
        btnLuu = findViewById(R.id.btnLuu);
        txtNoidung = findViewById(R.id.txtNoidung);
        //Xử lý sự kiện onclick trên nút tính tổng
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ten = edtTen.getText().toString();
                String MSSV = edtMSSV.getText().toString();
                String Tuoi = edtTuoi.getText().toString();

                String Gioitinh = "";
                if (rdioNam.isChecked()) {
                    Gioitinh = "Nam";
                } else if (rdioNu.isChecked()) {
                    Gioitinh = "Nữ";
                }

                String Sothich = "";
                if (cbDabong.isChecked()) {
                    Sothich += "Đá bóng, ";
                }
                if (cbChoigame.isChecked()) {
                    Sothich += "Chơi game";
                }

                String Noidung = "Tên: " + Ten + "\nMSSV: " + MSSV + "\nTuổi: " + Tuoi + "\nGiới tính: " + Gioitinh + "\nSở thích: " + Sothich;
                txtNoidung.setText(Noidung);
            }
        });
    }
}