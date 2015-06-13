// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Interpolator.java

package android.graphics;


public class Interpolator
{
	public static final class Result extends Enum
	{

		public static final Result FREEZE_END;
		public static final Result FREEZE_START;
		public static final Result NORMAL;
		private static final Result $VALUES[];

		public static final Result[] values()
		{
			return (Result[])$VALUES.clone();
		}

		public static Result valueOf(String name)
		{
			return (Result)Enum.valueOf(android/graphics/Interpolator$Result, name);
		}

		static 
		{
			FREEZE_END = new Result("FREEZE_END", 0);
			FREEZE_START = new Result("FREEZE_START", 1);
			NORMAL = new Result("NORMAL", 2);
			$VALUES = (new Result[] {
				FREEZE_END, FREEZE_START, NORMAL
			});
		}

		private Result(String s, int i)
		{
			super(s, i);
		}
	}


	public Interpolator(int valueCount)
	{
		throw new RuntimeException("Stub!");
	}

	public Interpolator(int valueCount, int frameCount)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset(int valueCount)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset(int valueCount, int frameCount)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getKeyFrameCount()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getValueCount()
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeyFrame(int index, int msec, float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeyFrame(int index, int msec, float values[], float blend[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setRepeatMirror(float repeatCount, boolean mirror)
	{
		throw new RuntimeException("Stub!");
	}

	public Result timeToValues(float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public Result timeToValues(int msec, float values[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
