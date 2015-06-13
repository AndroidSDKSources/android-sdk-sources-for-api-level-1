// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Animation.java

package android.view.animation;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.view.animation:
//			Interpolator, Transformation

public abstract class Animation
{
	public static interface AnimationListener
	{

		public abstract void onAnimationStart(Animation animation);

		public abstract void onAnimationEnd(Animation animation);

		public abstract void onAnimationRepeat(Animation animation);
	}


	public static final int INFINITE = -1;
	public static final int RESTART = 1;
	public static final int REVERSE = 2;
	public static final int START_ON_FIRST_FRAME = -1;
	public static final int ABSOLUTE = 0;
	public static final int RELATIVE_TO_SELF = 1;
	public static final int RELATIVE_TO_PARENT = 2;
	public static final int ZORDER_NORMAL = 0;
	public static final int ZORDER_TOP = 1;
	public static final int ZORDER_BOTTOM = -1;

	public Animation()
	{
		throw new RuntimeException("Stub!");
	}

	public Animation(Context context, AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInitialized()
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(int width, int height, int parentWidth, int parentHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public void setInterpolator(Context context, int resID)
	{
		throw new RuntimeException("Stub!");
	}

	public void setInterpolator(Interpolator i)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartOffset(long startOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDuration(long durationMillis)
	{
		throw new RuntimeException("Stub!");
	}

	public void restrictDuration(long durationMillis)
	{
		throw new RuntimeException("Stub!");
	}

	public void scaleCurrentDuration(float scale)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartTime(long startTimeMillis)
	{
		throw new RuntimeException("Stub!");
	}

	public void start()
	{
		throw new RuntimeException("Stub!");
	}

	public void startNow()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRepeatMode(int repeatMode)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRepeatCount(int repeatCount)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFillBefore(boolean fillBefore)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFillAfter(boolean fillAfter)
	{
		throw new RuntimeException("Stub!");
	}

	public void setZAdjustment(int zAdjustment)
	{
		throw new RuntimeException("Stub!");
	}

	public Interpolator getInterpolator()
	{
		throw new RuntimeException("Stub!");
	}

	public long getStartTime()
	{
		throw new RuntimeException("Stub!");
	}

	public long getDuration()
	{
		throw new RuntimeException("Stub!");
	}

	public long getStartOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public int getRepeatMode()
	{
		throw new RuntimeException("Stub!");
	}

	public int getRepeatCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFillBefore()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFillAfter()
	{
		throw new RuntimeException("Stub!");
	}

	public int getZAdjustment()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean willChangeTransformationMatrix()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean willChangeBounds()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAnimationListener(AnimationListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	protected void ensureInterpolator()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getTransformation(long currentTime, Transformation outTransformation)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasStarted()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasEnded()
	{
		throw new RuntimeException("Stub!");
	}

	protected void applyTransformation(float interpolatedTime, Transformation t)
	{
		throw new RuntimeException("Stub!");
	}

	protected float resolveSize(int type, float value, int size, int parentSize)
	{
		throw new RuntimeException("Stub!");
	}
}
