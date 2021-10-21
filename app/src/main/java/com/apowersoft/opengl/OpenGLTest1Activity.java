package com.apowersoft.opengl;

import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OpenGLTest1Activity extends AppCompatActivity {

    private static final String TAG = "OpenGLTest1Activity";
    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //新建GLSurfaceView并set到Activity的ContentView
        mGLSurfaceView = new GLSurfaceView(this);
        setContentView(mGLSurfaceView);
        //设置OpenGL版本为3.0
        mGLSurfaceView.setEGLContextClientVersion(3);
        //新建一个渲染器ColorRenderer ColorRenderer如下代码段
        GLSurfaceView.Renderer renderer = new ColorRenderer(Color.RED);
        mGLSurfaceView.setRenderer(renderer);
    }
}
