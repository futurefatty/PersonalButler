package com.liutao.help.personalbutler.ui;

import android.os.Bundle;
import android.view.View;

import com.liutao.help.personalbutler.R;
import com.liutao.help.personalbutler.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setTitleBarVisible(false);

//        //注册广播
//        HeadsetReceiver noisyAudioStreamReceiver = new HeadsetReceiver();
//        IntentFilter filter = new IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY);
//        filter.addAction(Intent.ACTION_HEADSET_PLUG);
//        registerReceiver(noisyAudioStreamReceiver, filter);
    }

    @Override
    public void onClick(View view) {

    }
}