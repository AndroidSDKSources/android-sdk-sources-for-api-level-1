// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Camera.java

package android.hardware;

import android.view.SurfaceHolder;

public class Camera
{
	public class Parameters
	{

		final Camera this$0;

		public String flatten()
		{
			throw new RuntimeException("Stub!");
		}

		public void unflatten(String flattened)
		{
			throw new RuntimeException("Stub!");
		}

		public void remove(String key)
		{
			throw new RuntimeException("Stub!");
		}

		public void set(String key, String value)
		{
			throw new RuntimeException("Stub!");
		}

		public void set(String key, int value)
		{
			throw new RuntimeException("Stub!");
		}

		public String get(String key)
		{
			throw new RuntimeException("Stub!");
		}

		public int getInt(String key)
		{
			throw new RuntimeException("Stub!");
		}

		public void setPreviewSize(int width, int height)
		{
			throw new RuntimeException("Stub!");
		}

		public Size getPreviewSize()
		{
			throw new RuntimeException("Stub!");
		}

		public void setPreviewFrameRate(int fps)
		{
			throw new RuntimeException("Stub!");
		}

		public int getPreviewFrameRate()
		{
			throw new RuntimeException("Stub!");
		}

		public void setPreviewFormat(int pixel_format)
		{
			throw new RuntimeException("Stub!");
		}

		public int getPreviewFormat()
		{
			throw new RuntimeException("Stub!");
		}

		public void setPictureSize(int width, int height)
		{
			throw new RuntimeException("Stub!");
		}

		public Size getPictureSize()
		{
			throw new RuntimeException("Stub!");
		}

		public void setPictureFormat(int pixel_format)
		{
			throw new RuntimeException("Stub!");
		}

		public int getPictureFormat()
		{
			throw new RuntimeException("Stub!");
		}

		Parameters()
		{
			this$0 = Camera.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public class Size
	{

		public int width;
		public int height;
		final Camera this$0;

		public Size(int w, int h)
		{
			this$0 = Camera.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public static interface ErrorCallback
	{

		public abstract void onError(int i, Camera camera);
	}

	public static interface PictureCallback
	{

		public abstract void onPictureTaken(byte abyte0[], Camera camera);
	}

	public static interface ShutterCallback
	{

		public abstract void onShutter();
	}

	public static interface AutoFocusCallback
	{

		public abstract void onAutoFocus(boolean flag, Camera camera);
	}

	public static interface PreviewCallback
	{

		public abstract void onPreviewFrame(byte abyte0[], Camera camera);
	}


	public static final int CAMERA_ERROR_UNKNOWN = 1;
	public static final int CAMERA_ERROR_SERVER_DIED = 100;

	Camera()
	{
		throw new RuntimeException("Stub!");
	}

	public static Camera open()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public final void release()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setPreviewDisplay(SurfaceHolder holder)
	{
		throw new RuntimeException("Stub!");
	}

	public final native void startPreview();

	public final native void stopPreview();

	public final void setPreviewCallback(PreviewCallback cb)
	{
		throw new RuntimeException("Stub!");
	}

	public final void autoFocus(AutoFocusCallback cb)
	{
		throw new RuntimeException("Stub!");
	}

	public final void takePicture(ShutterCallback shutter, PictureCallback raw, PictureCallback jpeg)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setErrorCallback(ErrorCallback cb)
	{
		throw new RuntimeException("Stub!");
	}

	public void setParameters(Parameters params)
	{
		throw new RuntimeException("Stub!");
	}

	public Parameters getParameters()
	{
		throw new RuntimeException("Stub!");
	}
}
