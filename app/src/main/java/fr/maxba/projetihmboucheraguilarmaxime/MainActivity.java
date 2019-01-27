package fr.maxba.projetihmboucheraguilarmaxime;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button inf = findViewById(R.id.btnLeft);
        final Button sup = findViewById(R.id.btnRight);
        final Button start = findViewById(R.id.btnStart);
        final Button stop = findViewById(R.id.btnStop);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);

        select = img1;
        inf.setEnabled(false);
        sup.setEnabled(false);
        stop.setEnabled(false);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDetail = new Intent(MainActivity.this, details.class);
                int tailletxt = select.toString().length();
                goToDetail.putExtra("numImage",select.toString().substring(tailletxt-5,tailletxt-1));
                Log.d("ID", "onClick: " + select.toString().substring(tailletxt-5,tailletxt-1));
                startActivity(goToDetail);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setBackgroundColor(getResources().getColor(R.color.noir));
                img1.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img1;
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setBackgroundColor(getResources().getColor(R.color.noir));
                img2.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img2;
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setBackgroundColor(getResources().getColor(R.color.noir));
                img3.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img3;
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setBackgroundColor(getResources().getColor(R.color.noir));
                img4.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img4;
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setBackgroundColor(getResources().getColor(R.color.noir));
                img5.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img5;
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setBackgroundColor(getResources().getColor(R.color.noir));
                img6.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img6;
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setBackgroundColor(getResources().getColor(R.color.noir));
                img7.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img7;
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setBackgroundColor(getResources().getColor(R.color.noir));
                img8.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img8;
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setBackgroundColor(getResources().getColor(R.color.noir));
                img9.setPadding(1,1,1,1);
                select.setBackgroundColor(getResources().getColor(R.color.blanc));
                select = img9;
            }
        });
    }
}
