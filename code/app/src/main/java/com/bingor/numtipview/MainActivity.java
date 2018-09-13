package com.bingor.numtipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bingor.numbertipview.NumTipView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumTipView numTipView = findViewById(R.id.ntv_m_frg_mine_p_msg_num);
        numTipView.setNum(10);
    }
}
