package com.fredrikbiten.animationer;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuFragment extends Fragment implements Runnable {
    private TextView clickToStart;
    private Thread thread;
    private TextView howToPlay;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        clickToStart = (TextView) view.findViewById(R.id.click_to_start_text);
        howToPlay = (TextView)view.findViewById(R.id.how_to_play);
        howToPlayMenu();
        thread = new Thread(this);
        thread.start();
        return view;
    }

    @Override
    public void run() {
        while (true)
            try {
                clickToStart.setTextColor(Color.argb(90, 29, 29, 210));
                thread.sleep(500);
                clickToStart.setTextColor(Color.argb(90, 255, 0, 0));
                thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    private void howToPlayMenu(){
        howToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
                ab.setTitle("How to play");
                ab.setMessage("You got 30 seconds to whack as many moles as you can."+"\n"+"You gain 1 point for everyone you hit and lose 1 for everyone you miss. " +
                        "\n"+"For a quick game restart," +
                        " swipe top part of screen");
                ab.show();
            }
        });
    }
}
