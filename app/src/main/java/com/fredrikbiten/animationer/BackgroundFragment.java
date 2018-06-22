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

public class BackgroundFragment extends Fragment {

    private TextView scoreNumber;
    private TextView displayTimer;
    private int displayScore;
    private ButtonsFragment buttonsFragment;
    //Length of a round in milliseconds
    private static final long gameLength = 30000;
    private static final long countDownInterval = 1000;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.background_fragment,container,false);
        scoreNumber = (TextView) view.findViewById(R.id.score_number);
        displayTimer = (TextView) view.findViewById(R.id.displayTimer);
        buttonsFragment = (ButtonsFragment) getFragmentManager().findFragmentById(R.id.fragment7);

        //Timer to display timeleft on gamescreen
        new CountDownTimer(gameLength, countDownInterval) {

            public void onTick(long millisUntilFinished) {
                //Check how long we got left and change color on text
                if ((millisUntilFinished / 1000) < 15 && (millisUntilFinished / 1000) > 5)
                    displayTimer.setTextColor(Color.YELLOW);
                if ((millisUntilFinished / 1000) <= 5) displayTimer.setTextColor(Color.RED);
                displayTimer.setText(Long.toString(millisUntilFinished / 1000));

            }

            public void onFinish() {
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
                ab.setCancelable(false);
                ab.setTitle("Game Over");
                ab.setMessage("Your score: " + getDisplayScore() + " Points");
                ab.setNegativeButton("Menu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Go back to menu
                    }
                });
                ab.setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Start a new round

                    }
                });
                ab.show();
            }

        }.start();

        return view;
    }
    public void updateScore(int score){
        scoreNumber.setText(Integer.toString(score));
        setDisplayScore(score);

    }


    private void setDisplayScore(int displayScore) {
        this.displayScore = displayScore;
    }

    private int getDisplayScore() {
        return displayScore;
    }
}
