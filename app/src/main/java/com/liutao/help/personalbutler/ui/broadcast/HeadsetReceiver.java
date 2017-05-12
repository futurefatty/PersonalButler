package com.liutao.help.personalbutler.ui.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.widget.Toast;


/**
 * 耳机插入与拔出广播接收
 * Created by Administrator on 2017/5/8.
 */

public class HeadsetReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if (intentAction.equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            if (state == 1) {
                Toast.makeText(context, "耳机插入", Toast.LENGTH_SHORT).show();
                KeyEvent event = intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);

            }
        } else if (AudioManager.ACTION_AUDIO_BECOMING_NOISY.equals(intentAction)) {
            Toast.makeText(context, "耳机拔出", Toast.LENGTH_SHORT).show();
        }

    }
}