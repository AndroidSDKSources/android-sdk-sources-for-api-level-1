// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SensorListener.java

package android.hardware;


public interface SensorListener
{

	public abstract void onSensorChanged(int i, float af[]);

	public abstract void onAccuracyChanged(int i, int j);
}
