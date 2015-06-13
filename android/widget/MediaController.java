// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MediaController.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.widget:
//			FrameLayout

public class MediaController extends FrameLayout
{
	public static interface MediaPlayerControl
	{

		public abstract void start();

		public abstract void pause();

		public abstract int getDuration();

		public abstract int getCurrentPosition();

		public abstract void seekTo(int i);

		public abstract boolean isPlaying();

		public abstract int getBufferPercentage();
	}


	public MediaController(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MediaController(Context context, boolean useFastForward)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MediaController(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void onFinishInflate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMediaPlayer(MediaPlayerControl player)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAnchorView(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public void show()
	{
		throw new RuntimeException("Stub!");
	}

	public void show(int timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isShowing()
	{
		throw new RuntimeException("Stub!");
	}

	public void hide()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPrevNextListeners(android.view.View.OnClickListener next, android.view.View.OnClickListener prev)
	{
		throw new RuntimeException("Stub!");
	}
}
