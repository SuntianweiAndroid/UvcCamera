package com.vinda.ucvcamera;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;


import com.yuan.camera.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo-pc on 2017/8/10.
 */

public class PlaySound {

    private static Map<Integer, Integer> mapSRC;
    private static SoundPool sp; //声音池

    public static final int initerro = 0;
    public static final int dang = 1;
    public static final int xiaofeiSuccse = 2;
    public static final int qingchongshua = 3;
    public static int NO_CYCLE = 0;//不循环


    //初始化声音池
    public static void initSoundPool(Context context) {
        if (sp == null) {
            sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        mapSRC = new HashMap<>();
        mapSRC.put(initerro, sp.load(context, R.raw.error, 0));
        mapSRC.put(dang, sp.load(context, R.raw.dang, 0));
        mapSRC.put(xiaofeiSuccse, sp.load(context, R.raw.xiaofeichenggong, 0));
        mapSRC.put(qingchongshua, sp.load(context, R.raw.qingchongshua, 0));
    }


    /**
     * 播放声音池的声音
     */
    public static void play(int sound, int number) {
        sp.play(mapSRC.get(sound),//播放的声音资源
                1.0f,//左声道，范围为0--1.0
                1.0f,//右声道，范围为0--1.0
                0, //优先级，0为最低优先级
                number,//循环次数,0为不循环
                1);//播放速率，1为正常速率
    }
}
