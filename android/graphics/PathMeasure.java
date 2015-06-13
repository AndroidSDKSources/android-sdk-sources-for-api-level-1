// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PathMeasure.java

package android.graphics;


// Referenced classes of package android.graphics:
//			Path, Matrix

public class PathMeasure
{

	public static final int POSITION_MATRIX_FLAG = 1;
	public static final int TANGENT_MATRIX_FLAG = 2;

	public PathMeasure()
	{
		throw new RuntimeException("Stub!");
	}

	public PathMeasure(Path path, boolean forceClosed)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPath(Path path, boolean forceClosed)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLength()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getPosTan(float distance, float pos[], float tan[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getMatrix(float distance, Matrix matrix, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getSegment(float startD, float stopD, Path dst, boolean startWithMoveTo)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean nextContour()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
