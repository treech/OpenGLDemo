package com.apowersoft.opengl;

import android.graphics.Color;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class ColorRenderer implements GLSurfaceView.Renderer {

    private int color;

    public ColorRenderer(int color) {
        this.color = color;
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        float redF = (float) Color.red(color) / 255;
        float greenF = (float) Color.green(color) / 255;
        float blueF = (float) Color.blue(color) / 255;
        float alphaF = (float) Color.alpha(color) / 255;
        GLES30.glClearColor(redF, greenF, blueF, alphaF);
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        GLES30.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        GLES30.glClear(GL10.GL_COLOR_BUFFER_BIT);
    }
}
