// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SoundPool.java

package android.media;

import android.content.Context;

public class SoundPool
{

	public SoundPool(int maxStreams, int streamType, int srcQuality)
	{
		throw new RuntimeException("Stub!");
	}

	public int load(String path, int priority)
	{
		throw new RuntimeException("Stub!");
	}

	public int load(Context context, int resId, int priority)
	{
		throw new RuntimeException("Stub!");
	}

	public final native boolean unload(int i);

	public final native int play(int i, float f, float f1, int j, int k, float f2);

	public final native void pause(int i);

	public final native void resume(int i);

	public final native void stop(int i);

	public final native void setVolume(int i, float f, float f1);

	public final native void setPriority(int i, int j);

	public final native void setLoop(int i, int j);

	public final native void setRate(int i, float f);

	public final native void release();

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
