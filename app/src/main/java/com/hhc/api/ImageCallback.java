package com.hhc.api;

import android.graphics.drawable.Drawable;

public interface ImageCallback {
    //注意 此方法是用来设置目标对象的图像资源
    public void imageLoaded(Drawable imageDrawable);
}