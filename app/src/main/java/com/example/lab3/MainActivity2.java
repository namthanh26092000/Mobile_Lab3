package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {
    Button btnBac, btnDo, btnDen, btnXanh, btnXong;
    TextView txtMau;
    ImageView imgPhone;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnBac = findViewById(R.id.btnBac);
        btnDo = findViewById(R.id.btnDo);
        btnDen = findViewById(R.id.btnDen);
        btnXanh = findViewById(R.id.btnXanhDam);
        btnXong = findViewById(R.id.btnXong);
        txtMau = findViewById(R.id.txtMau);
        imgPhone = findViewById(R.id.imgPhone);

        btnBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.setImageResource(R.drawable.vs_bac_1);
                imgPhone.setTag(R.drawable.vs_bac_1);
                txtMau.setText("Bạc");
            }
        });
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.setImageResource(R.drawable.vs_red_a_2);
                imgPhone.setTag(R.drawable.vs_red_a_2);
                txtMau.setText("Đỏ");
            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.setImageResource(R.drawable.vsmart_black_star_1);
                imgPhone.setTag(R.drawable.vsmart_black_star_1);
                txtMau.setText("Đen");
            }
        });
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.setImageResource(R.drawable.vsmart_live_xanh_1);
                imgPhone.setTag(R.drawable.vsmart_live_xanh_1);
                txtMau.setText("Xanh");
            }
        });
        /*tra ve anh mau xanh tu activity main
        intent = getIntent();
        int resimage = intent.getIntExtra("imgXanh",1);
        imgPhone.setImageResource(resimage);*/
        intent = getIntent();


        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("traanh", (Serializable) imgPhone.getTag());
                setResult(33, intent);
                finish();
            }
        });

    }
}