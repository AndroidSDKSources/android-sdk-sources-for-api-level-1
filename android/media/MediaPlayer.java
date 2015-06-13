// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MediaPlayer.java

package android.media;

import android.content.Context;
import android.net.Uri;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;

public class MediaPlayer
{
	public static interface OnErrorListener
	{

		public abstract boolean onError(MediaPlayer mediaplayer, int i, int j);
	}

	public static interface OnSeekCompleteListener
	{

		public abstract void onSeekComplete(MediaPlayer mediaplayer);
	}

	public static interface OnBufferingUpdateListener
	{

		public abstract void onBufferingUpdate(MediaPlayer mediaplayer, int i);
	}

	public static interface OnCompletionListener
	{

		public abstract void onCompletion(MediaPlayer mediaplayer);
	}

	public static interface OnPreparedListener
	{

		public abstract void onPrepared(MediaPlayer mediaplayer);
	}


	public static final int MEDIA_ERROR_UNKNOWN = 1;
	public static final int MEDIA_ERROR_SERVER_DIED = 100;

	public MediaPlayer()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDisplay(SurfaceHolder sh)
	{
		throw new RuntimeException("Stub!");
	}

	public static MediaPlayer create(Context context, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public static MediaPlayer create(Context context, Uri uri, SurfaceHolder holder)
	{
		throw new RuntimeException("Stub!");
	}

	public static MediaPlayer create(Context context, int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDataSource(Context context, Uri uri)
		throws IOException, IllegalArgumentException, SecurityException, IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public native void setDataSource(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public void setDataSource(FileDescriptor fd)
		throws IOException, IllegalArgumentException, IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public native void setDataSource(FileDescriptor filedescriptor, long l, long l1)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public native void prepare()
		throws IOException, IllegalStateException;

	public native void prepareAsync()
		throws IllegalStateException;

	public void start()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public void stop()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public void pause()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public void setWakeMode(Context context, int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScreenOnWhilePlaying(boolean screenOn)
	{
		throw new RuntimeException("Stub!");
	}

	public native int getVideoWidth();

	public native int getVideoHeight();

	public native boolean isPlaying();

	public native void seekTo(int i)
		throws IllegalStateException;

	public native int getCurrentPosition();

	public native int getDuration();

	public void release()
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setAudioStreamType(int i);

	public native void setLooping(boolean flag);

	public native void setVolume(float f, float f1);

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnPreparedListener(OnPreparedListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCompletionListener(OnCompletionListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnBufferingUpdateListener(OnBufferingUpdateListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnSeekCompleteListener(OnSeekCompleteListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnErrorListener(OnErrorListener l)
	{
		throw new RuntimeException("Stub!");
	}
}
