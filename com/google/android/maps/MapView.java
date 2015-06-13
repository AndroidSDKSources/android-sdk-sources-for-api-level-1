// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MapView.java

package com.google.android.maps;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.*;
import java.util.List;

// Referenced classes of package com.google.android.maps:
//			GeoPoint, MapController, Projection

public class MapView extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.LayoutParams
	{

		public static final int MODE_MAP = 0;
		public static final int MODE_VIEW = 1;
		public int mode;
		public GeoPoint point;
		public int x;
		public int y;
		public int alignment;
		public static final int LEFT = 3;
		public static final int RIGHT = 5;
		public static final int TOP = 48;
		public static final int BOTTOM = 80;
		public static final int CENTER_HORIZONTAL = 1;
		public static final int CENTER_VERTICAL = 16;
		public static final int CENTER = 17;
		public static final int TOP_LEFT = 51;
		public static final int BOTTOM_CENTER = 81;

		public String debug(String output)
		{
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int width, int height, GeoPoint point, int alignment)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int width, int height, GeoPoint point, int x, int y, int alignment)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int width, int height, int x, int y, int alignment)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(Context c, AttributeSet attrs)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams source)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static final class ReticleDrawMode extends Enum
	{

		public static final ReticleDrawMode DRAW_RETICLE_NEVER;
		public static final ReticleDrawMode DRAW_RETICLE_OVER;
		public static final ReticleDrawMode DRAW_RETICLE_UNDER;
		private static final ReticleDrawMode $VALUES[];

		public static final ReticleDrawMode[] values()
		{
			return (ReticleDrawMode[])$VALUES.clone();
		}

		public static ReticleDrawMode valueOf(String name)
		{
			return (ReticleDrawMode)Enum.valueOf(com/google/android/maps/MapView$ReticleDrawMode, name);
		}

		static 
		{
			DRAW_RETICLE_NEVER = new ReticleDrawMode("DRAW_RETICLE_NEVER", 0);
			DRAW_RETICLE_OVER = new ReticleDrawMode("DRAW_RETICLE_OVER", 1);
			DRAW_RETICLE_UNDER = new ReticleDrawMode("DRAW_RETICLE_UNDER", 2);
			$VALUES = (new ReticleDrawMode[] {
				DRAW_RETICLE_NEVER, DRAW_RETICLE_OVER, DRAW_RETICLE_UNDER
			});
		}

		private ReticleDrawMode(String s, int i)
		{
			super(s, i);
		}
	}


	public MapView(Context context, String apiKey)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MapView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MapView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		throw new RuntimeException("Stub!");
	}

	public void computeScroll()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFocusChanged(boolean hasFocus, int direction, Rect unused)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	public void displayZoomControls(boolean takeFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canCoverCenter()
	{
		throw new RuntimeException("Stub!");
	}

	public void preLoad()
	{
		throw new RuntimeException("Stub!");
	}

	public int getZoomLevel()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSatellite(boolean on)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSatellite()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTraffic(boolean on)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isTraffic()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStreetView(boolean on)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStreetView()
	{
		throw new RuntimeException("Stub!");
	}

	public GeoPoint getMapCenter()
	{
		throw new RuntimeException("Stub!");
	}

	public MapController getController()
	{
		throw new RuntimeException("Stub!");
	}

	public final List getOverlays()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLatitudeSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLongitudeSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public void setReticleDrawMode(ReticleDrawMode mode)
	{
		throw new RuntimeException("Stub!");
	}

	public int getMaxZoomLevel()
	{
		throw new RuntimeException("Stub!");
	}

	public void onSaveInstanceState(Bundle state)
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Bundle state)
	{
		throw new RuntimeException("Stub!");
	}

	public View getZoomControls()
	{
		throw new RuntimeException("Stub!");
	}

	public Projection getProjection()
	{
		throw new RuntimeException("Stub!");
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return generateDefaultLayoutParams();
	}
}
