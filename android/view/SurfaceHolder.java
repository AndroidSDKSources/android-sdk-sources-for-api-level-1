// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SurfaceHolder.java

package android.view;

import android.graphics.Canvas;
import android.graphics.Rect;

// Referenced classes of package android.view:
//			Surface

public interface SurfaceHolder
{
	public static interface Callback
	{

		public abstract void surfaceCreated(SurfaceHolder surfaceholder);

		public abstract void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k);

		public abstract void surfaceDestroyed(SurfaceHolder surfaceholder);
	}

	public static class BadSurfaceTypeException extends RuntimeException
	{

		public BadSurfaceTypeException()
		{
			throw new RuntimeException("Stub!");
		}

		public BadSurfaceTypeException(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int SURFACE_TYPE_NORMAL = 0;
	public static final int SURFACE_TYPE_HARDWARE = 1;
	public static final int SURFACE_TYPE_GPU = 2;
	public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;

	public abstract void addCallback(Callback callback);

	public abstract void removeCallback(Callback callback);

	public abstract boolean isCreating();

	public abstract void setType(int i);

	public abstract void setFixedSize(int i, int j);

	public abstract void setSizeFromLayout();

	public abstract void setFormat(int i);

	public abstract void setKeepScreenOn(boolean flag);

	public abstract Canvas lockCanvas();

	public abstract Canvas lockCanvas(Rect rect);

	public abstract void unlockCanvasAndPost(Canvas canvas);

	public abstract Rect getSurfaceFrame();

	public abstract Surface getSurface();
}
