// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 
// Source File Name:   CenterCrop.java

package com.npi.blureffect;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

public class CenterCrop
{

    public CenterCrop()
    {
    }

    public static Bitmap matchAspectRatio(Bitmap bitmap, int i, int j)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        float f = k;
        float f1 = i;
        float f2 = f / f1;
        float f3 = l;
        float f4 = j;
        float f5 = f3 / f4;
        float f6 = Math.min(f2, f5);
        float f7 = i;
        float f8 = f6 * f7;
        float f9 = j;
        float f10 = f6 * f9;
        float f11 = ((float)k - f8) / 2F;
        float f12 = ((float)l - f10) / 2F;
        int i1 = (int)f11;
        int j1 = (int)f12;
        int k1 = (int)(f11 + f8);
        int l1 = (int)(f12 + f10);
        int i2 = i1;
        int j2 = j1;
        int k2 = k1;
        int l2 = l1;
        Rect rect = new Rect(i2, j2, k2, l2);
        int i3 = (int)f8;
        int j3 = (int)f10;
        int k3 = 0;
        int l3 = 0;
        int i4 = i3;
        int j4 = j3;
        Rect rect1 = new Rect(k3, l3, i4, j4);
        int k4 = (int)f8;
        int l4 = (int)f10;
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        Bitmap bitmap1 = Bitmap.createBitmap(k4, l4, config);
        Canvas canvas = new Canvas(bitmap1);
        Bitmap bitmap2 = bitmap;
        android.graphics.Paint paint = null;
        canvas.drawBitmap(bitmap2, rect, rect1, paint);
        return bitmap1;
    }

    public static Bitmap scaleCenterCrop(Bitmap bitmap, int i, int j)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        float f = i;
        float f1 = k;
        float f2 = f / f1;
        float f3 = j;
        float f4 = l;
        float f5 = f3 / f4;
        float f6 = Math.max(f2, f5);
        float f7 = k;
        float f8 = f6 * f7;
        float f9 = l;
        float f10 = f6 * f9;
        float f11 = ((float)i - f8) / 2F;
        float f12 = ((float)j - f10) / 2F;
        float f13 = f11 + f8;
        float f14 = f12 + f10;
        RectF rectf = new RectF(f11, f12, f13, f14);
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        int i1 = i;
        int j1 = j;
        Bitmap bitmap1 = Bitmap.createBitmap(i1, j1, config);
        Canvas canvas = new Canvas(bitmap1);
        Bitmap bitmap2 = bitmap;
        canvas.drawBitmap(bitmap2, null, rectf, null);
        return bitmap1;
    }
}
