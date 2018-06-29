package com.fredrikbiten.animationer;

import android.app.Fragment;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class ButtonsFragment extends Fragment {
    private Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9;
    private int currentNumber;
    private int score;
    private BackgroundFragment backgroundFragment;
    private static int color;
    //Handling sounds
    private SoundPool soundPool;
    private int soundHit,soundMiss;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttons_fragment, container, false);
        color = Color.rgb(152, 199, 94);
        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);
        button8 = (Button) view.findViewById(R.id.button8);
        button9 = (Button) view.findViewById(R.id.button9);
        backgroundFragment = (BackgroundFragment) getFragmentManager().findFragmentById(R.id.fragment8);
        setupSounds();
        setCurrentNumber(0);
        setScore(0);
        backgroundFragment.updateScore(getScore());


        return view;
    }

    public void setButtonColor(int newnumber, int current) {

        switch (newnumber) {
            case 1:
                button1.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 2:
                button2.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));


                break;
            case 3:
                button3.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 4:
                button4.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 5:
                button5.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 6:
                button6.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 7:
                button7.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 8:
                button8.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            case 9:
                button9.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.whackamole2));

                break;
            default:
        }
        switch (current) {
            case 1:
                button1.setBackgroundColor(color);
                break;
            case 2:
                button2.setBackgroundColor(color);
                break;
            case 3:
                button3.setBackgroundColor(color);
                break;
            case 4:
                button4.setBackgroundColor(color);
                break;
            case 5:
                button5.setBackgroundColor(color);
                break;
            case 6:
                button6.setBackgroundColor(color);
                break;
            case 7:
                button7.setBackgroundColor(color);
                break;
            case 8:
                button8.setBackgroundColor(color);
                break;
            case 9:
                button9.setBackgroundColor(color);
                break;
            default:
        }
        setCurrentNumber(newnumber);


    }


    public void buttonClicks() {

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 1) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 2) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 3) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 4) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 5) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 6) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 7) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);
                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 8) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);

                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getCurrentNumber() == 9) {
                    setScore(getScore() + 1);
                    soundPool.play(soundHit,1,1,0,0,1);


                } else {
                    setScore(getScore() - 1);
                    soundPool.play(soundMiss,1,1,0,0,1);
                }
                checkZeroScore();
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());

            }
        });


    }

    private void setupSounds() {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(2)
                .setAudioAttributes(audioAttributes)
                .build();
        soundHit = soundPool.load(getContext(), R.raw.hit, 1);
        soundMiss = soundPool.load(getContext(), R.raw.miss, 1);
    }


    public int getRandomNr() {
        Random random = new Random();
        int n = random.nextInt(9) + 1;
        if (n == getCurrentNumber()) {
            return getRandomNr();
        }
        return n;
    }


    /*Score cant be lower than 0, call this method before every update to check*/
    private void checkZeroScore() {
        if (getScore() < 0) setScore(0);
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
