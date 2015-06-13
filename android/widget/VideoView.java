// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VideoView.java

package android.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.widget:
//			MediaController

public class VideoView extends SurfaceView
	implements MediaController.MediaPlayerControl
{

	public VideoView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public VideoView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public VideoView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public int resolveAdjustedSize(int desiredSize, int measureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVideoPath(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVideoURI(Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public void stopPlayback()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMediaController(MediaController controller)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void start()
	{
		throw new RuntimeException("Stub!");
	}

	public void pause()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDuration()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCurrentPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public void seekTo(int msec)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isPlaying()
	{
		throw new RuntimeException("Stub!");
	}

	public int getBufferPercentage()
	{
		throw new RuntimeException("Stub!");
	}
}
