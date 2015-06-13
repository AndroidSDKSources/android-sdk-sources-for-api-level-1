// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MediaRecorder.java

package android.media;

import android.view.Surface;

public class MediaRecorder
{
	public final class AudioEncoder
	{

		public static final int DEFAULT = 0;
		public static final int AMR_NB = 1;
		final MediaRecorder this$0;

		AudioEncoder()
		{
			this$0 = MediaRecorder.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public final class OutputFormat
	{

		public static final int DEFAULT = 0;
		public static final int THREE_GPP = 1;
		public static final int MPEG_4 = 2;
		final MediaRecorder this$0;

		OutputFormat()
		{
			this$0 = MediaRecorder.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public final class AudioSource
	{

		public static final int DEFAULT = 0;
		public static final int MIC = 1;
		final MediaRecorder this$0;

		AudioSource()
		{
			this$0 = MediaRecorder.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public MediaRecorder()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPreviewDisplay(Surface sv)
	{
		throw new RuntimeException("Stub!");
	}

	public native void setAudioSource(int i)
		throws IllegalStateException;

	public native void setOutputFormat(int i)
		throws IllegalStateException;

	public native void setAudioEncoder(int i)
		throws IllegalStateException;

	public native void setOutputFile(String s)
		throws IllegalStateException;

	public native void prepare()
		throws IllegalStateException;

	public native void start()
		throws IllegalStateException;

	public native void stop()
		throws IllegalStateException;

	public native void reset();

	public native int getMaxAmplitude()
		throws IllegalStateException;

	public native void release();

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
