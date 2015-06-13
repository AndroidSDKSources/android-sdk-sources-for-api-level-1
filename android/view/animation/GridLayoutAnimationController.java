// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GridLayoutAnimationController.java

package android.view.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.view.animation:
//			LayoutAnimationController, Animation

public class GridLayoutAnimationController extends LayoutAnimationController
{
	public static class AnimationParameters extends LayoutAnimationController.AnimationParameters
	{

		public int column;
		public int row;
		public int columnsCount;
		public int rowsCount;

		public AnimationParameters()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int DIRECTION_LEFT_TO_RIGHT = 0;
	public static final int DIRECTION_RIGHT_TO_LEFT = 1;
	public static final int DIRECTION_TOP_TO_BOTTOM = 0;
	public static final int DIRECTION_BOTTOM_TO_TOP = 2;
	public static final int DIRECTION_HORIZONTAL_MASK = 1;
	public static final int DIRECTION_VERTICAL_MASK = 2;
	public static final int PRIORITY_NONE = 0;
	public static final int PRIORITY_COLUMN = 1;
	public static final int PRIORITY_ROW = 2;

	public GridLayoutAnimationController(Context context, AttributeSet attrs)
	{
		super((Animation)null, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public GridLayoutAnimationController(Animation animation)
	{
		super((Animation)null, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public GridLayoutAnimationController(Animation animation, float columnDelay, float rowDelay)
	{
		super((Animation)null, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public float getColumnDelay()
	{
		throw new RuntimeException("Stub!");
	}

	public void setColumnDelay(float columnDelay)
	{
		throw new RuntimeException("Stub!");
	}

	public float getRowDelay()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRowDelay(float rowDelay)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDirection()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDirection(int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDirectionPriority()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDirectionPriority(int directionPriority)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean willOverlap()
	{
		throw new RuntimeException("Stub!");
	}

	protected long getDelayForView(View view)
	{
		throw new RuntimeException("Stub!");
	}
}
