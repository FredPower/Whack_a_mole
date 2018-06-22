package com.fredrikbiten.animationer;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BackgroundFragment extends Fragment {

    private TextView scoreNumber;
    private TextView displayTimer;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.background_fragment,container,false);
        scoreNumber = (TextView) view.findViewById(R.id.score_number);
        displayTimer = (TextView) view.findViewById(R.id.displayTimer);
        //Timer to display timeleft on gamescreen
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                //Check how long we got left and change color on text
                if ((millisUntilFinished / 1000) < 15 && (millisUntilFinished / 1000) > 5)
                    displayTimer.setTextColor(Color.YELLOW);
                if ((millisUntilFinished / 1000) <= 5) displayTimer.setTextColor(Color.RED);
                displayTimer.setText(Long.toString(millisUntilFinished / 1000));

            }

            public void onFinish() {

            }

        }.start();


        return view;
    }
    public void updateScore(int score){
        scoreNumber.setText(Integer.toString(score));
    }
}
