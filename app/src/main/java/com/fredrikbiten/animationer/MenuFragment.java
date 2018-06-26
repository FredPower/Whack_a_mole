package com.fredrikbiten.animationer;

import android.app.Fragment;
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

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        clickToStart = (TextView) view.findViewById(R.id.click_to_start_text);
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
}
