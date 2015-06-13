// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ImageView.java

package android.widget;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.widget:
//			RemoteViews

public class ImageView extends View
{
	public static final class ScaleType extends Enum
	{

		public static final ScaleType CENTER;
		public static final ScaleType CENTER_CROP;
		public static final ScaleType CENTER_INSIDE;
		public static final ScaleType FIT_CENTER;
		public static final ScaleType FIT_END;
		public static final ScaleType FIT_START;
		public static final ScaleType FIT_XY;
		public static final ScaleType MATRIX;
		private static final ScaleType $VALUES[];

		public static final ScaleType[] values()
		{
			return (ScaleType[])$VALUES.clone();
		}

		public static ScaleType valueOf(String name)
		{
			return (ScaleType)Enum.valueOf(android/widget/ImageView$ScaleType, name);
		}

		static 
		{
			CENTER = new ScaleType("CENTER", 0);
			CENTER_CROP = new ScaleType("CENTER_CROP", 1);
			CENTER_INSIDE = new ScaleType("CENTER_INSIDE", 2);
			FIT_CENTER = new ScaleType("FIT_CENTER", 3);
			FIT_END = new ScaleType("FIT_END", 4);
			FIT_START = new ScaleType("FIT_START", 5);
			FIT_XY = new ScaleType("FIT_XY", 6);
			MATRIX = new ScaleType("MATRIX", 7);
			$VALUES = (new ScaleType[] {
				CENTER, CENTER_CROP, CENTER_INSIDE, FIT_CENTER, FIT_END, FIT_START, FIT_XY, MATRIX
			});
		}

		private ScaleType(String s, int i)
		{
			super(s, i);
		}
	}


	public ImageView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ImageView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ImageView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected boolean verifyDrawable(Drawable dr)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidateDrawable(Drawable dr)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onSetAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAdjustViewBounds(boolean adjustViewBounds)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxWidth(int maxWidth)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxHeight(int maxHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable()
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageResource(int resId)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageURI(Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageDrawable(Drawable drawable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageBitmap(Bitmap bm)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageState(int state[], boolean merge)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelected(boolean selected)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageLevel(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScaleType(ScaleType scaleType)
	{
		throw new RuntimeException("Stub!");
	}

	public ScaleType getScaleType()
	{
		throw new RuntimeException("Stub!");
	}

	public Matrix getImageMatrix()
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageMatrix(Matrix matrix)
	{
		throw new RuntimeException("Stub!");
	}

	public int[] onCreateDrawableState(int extraSpace)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean setFrame(int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setColorFilter(int color, android.graphics.PorterDuff.Mode mode)
	{
		throw new RuntimeException("Stub!");
	}

	public final void clearColorFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setColorFilter(ColorFilter cf)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}
}
