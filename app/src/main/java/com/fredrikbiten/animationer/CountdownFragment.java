package com.fredrikbiten.animationer;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CountdownFragment extends Fragment {
    private static long timerLength = 3000;
    private static long timerInterval = 1000;
    private TextView countdownTimer;
    ButtonsFragment buttonsFragment;
    BackgroundFragment backgroundFragment;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.countdown_fragment, container, false);
        buttonsFragment = (ButtonsFragment) getFragmentManager().findFragmentById(R.id.fragment7);
        backgroundFragment = (BackgroundFragment) getFragmentManager().findFragmentById(R.id.fragment8);
        countdownTimer = (TextView) view.findViewById(R.id.countdown_timer);
        countdownTimer();
        return view;
    }

    private void countdownTimer() {
        new CountDownTimer(timerLength, timerInterval) {

            public void onTick(long millisUntilFinished) {
                //Check how long we got left and change color on text
                if ((millisUntilFinished / 1000) < 2 && (millisUntilFinished / 1000) > 0)
                    countdownTimer.setTextColor(Color.YELLOW);
                if ((millisUntilFinished / 1000) <= 0)
                    countdownTimer.setTextColor(Color.GREEN);
                countdownTimer.setText(Long.toString(millisUntilFinished / 1000));
            }

            public void onFinish() {
                countdownTimer.setVisibility(View.GONE);
                buttonsFragment.setButtonColor(buttonsFragment.getRandomNr(), buttonsFragment.getCurrentNumber());
                buttonsFragment.buttonClicks();
                backgroundFragment.startGameTimer();
            }

        }.start();
    }
}
