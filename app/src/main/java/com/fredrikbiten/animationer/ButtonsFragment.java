package com.fredrikbiten.animationer;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class ButtonsFragment extends Fragment {
    private Button button1, button2, button3, button4, button5, button6, button7, button8,
    button9;
    private int currentNumber;
    private int score;
    private BackgroundFragment backgroundFragment;
   // private TextView scoreNumber;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttons_fragment,container,false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);
        button8 = (Button) view.findViewById(R.id.button8);
        button9 = (Button) view.findViewById(R.id.button9);
        backgroundFragment = (BackgroundFragment)getFragmentManager().findFragmentById(R.id.fragment8);
        setCurrentNumber(0);
        setScore(0);
        backgroundFragment.updateScore(getScore());
        buttonClicks();
        setButtonColor(getRandomNr(),getCurrentNumber());

        return view;
    }

    public void setButtonColor(int newnumber, int current) {
       // thread.interrupt();
        switch (newnumber) {
            case 1:
                button1.setBackgroundColor(Color.GREEN);
                break;
            case 2:
                button2.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                button3.setBackgroundColor(Color.GREEN);
                break;
            case 4:
                button4.setBackgroundColor(Color.GREEN);
                break;
            case 5:
                button5.setBackgroundColor(Color.GREEN);
                break;
            case 6:
                button6.setBackgroundColor(Color.GREEN);
                break;
            case 7:
                button7.setBackgroundColor(Color.GREEN);
                break;
            case 8:
                button8.setBackgroundColor(Color.GREEN);
                break;
            case 9:
                button9.setBackgroundColor(Color.GREEN);
                break;
            default:
        }
        switch (current) {
            case 1:
                button1.setBackgroundColor(Color.BLACK);
                break;
            case 2:
                button2.setBackgroundColor(Color.BLACK);
                break;
            case 3:
                button3.setBackgroundColor(Color.BLACK);
                break;
            case 4:
                button4.setBackgroundColor(Color.BLACK);
                break;
            case 5:
                button5.setBackgroundColor(Color.BLACK);
                break;
            case 6:
                button6.setBackgroundColor(Color.BLACK);
                break;
            case 7:
                button7.setBackgroundColor(Color.BLACK);
                break;
            case 8:
                button8.setBackgroundColor(Color.BLACK);
                break;
            case 9:
                button9.setBackgroundColor(Color.BLACK);
                break;
            default:
        }
        setCurrentNumber(newnumber);
     //  startThread();

    }


    private void buttonClicks() {
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 1) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 2) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 3) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 4) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 5) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 6) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 7) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 8) {
                    setScore(getScore() + 1);




                } else {
                    setScore(getScore() - 1);


                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentNumber() == 9) {
                    setScore(getScore() + 1);



                } else {
                    setScore(getScore() - 1);

                }
                backgroundFragment.updateScore(getScore());
                setButtonColor(getRandomNr(), getCurrentNumber());
            }
        });


    }


    private int getRandomNr() {
        Random random = new Random();
        int n = random.nextInt(9) + 1;
        if(n==getCurrentNumber()){
            return getRandomNr();
        }
        return n;
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
