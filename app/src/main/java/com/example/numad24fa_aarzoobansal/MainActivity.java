package com.example.numad24fa_aarzoobansal;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            ImageView toastImg = findViewById(R.id.imageView3);
            toastImg.setVisibility(View.INVISIBLE);
            TextView txtEmail = findViewById(R.id.email);
            txtEmail.setVisibility(View.INVISIBLE);
            return insets;
        });
    }

    public void onClickBtn(View view){
        TextView txtHello = findViewById(R.id.textMsg);
        txtHello.setText("Aarzoo Bansal");
        ImageView toastImg = findViewById(R.id.imageView3);
        toastImg.setVisibility(View.VISIBLE);
        TextView txtEmail = findViewById(R.id.email);
        txtEmail.setVisibility(View.VISIBLE);
    }
}