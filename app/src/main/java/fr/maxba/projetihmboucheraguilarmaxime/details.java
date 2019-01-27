package fr.maxba.projetihmboucheraguilarmaxime;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class details extends AppCompatActivity {

    CountDownTimer T1;
    ImageView imgCentre;
    int etat, resID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        final Button inf = findViewById(R.id.btnLeftDetails);
        final Button sup = findViewById(R.id.btnRightDetails);
        final Button pause = findViewById(R.id.btnPauseDetails);
        final Button stop = findViewById(R.id.btnStopDetails);

        imgCentre = findViewById(R.id.imgCentre);

        Intent intent = getIntent();
        Log.d("ID", "after Intent: " + intent.getStringExtra("numImage"));
        resID = getResources().getIdentifier(intent.getStringExtra("numImage"), "drawable", getPackageName());
        imgCentre.setImageResource(resID);

        T1 = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                resID = getResources().getIdentifier("img2", "drawable", getPackageName());
                imgCentre.setImageResource(resID);
            }
        };

        T1.start();

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pause.getText().equals("Pause")) {
                    pause.setText("Start");
                    T1.cancel();
                }
                else {
                    pause.setText("Pause");
                    T1.start();
                }
            }
        });
    }
}
