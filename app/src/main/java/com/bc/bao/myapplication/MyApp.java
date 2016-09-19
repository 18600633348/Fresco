package com.bc.bao.myapplication;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;

/**
 * Created by lenovo on 2016/9/7.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //基本使用方法
        //Fresco.initialize(this);
        //渐进式JPEG图的初始化方法
        ImagePipelineConfig config =ImagePipelineConfig.newBuilder(this)
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .build();
        Fresco.initialize(this,config);
    }
}
