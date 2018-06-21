package com.fredrikbiten.animationer;

import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BackgroundFragment extends Fragment {

    private TextView scoreNumber;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.background_fragment,container,false);
        scoreNumber = (TextView) view.findViewById(R.id.score_number);

        //Timer to display timeleft on gamescreen
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {


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
