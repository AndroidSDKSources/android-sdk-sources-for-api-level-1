// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Camera.java

package android.graphics;


// Referenced classes of package android.graphics:
//			Matrix, Canvas

public class Camera
{

	public Camera()
	{
		throw new RuntimeException("Stub!");
	}

	public native void save();

	public native void restore();

	public native void translate(float f, float f1, float f2);

	public native void rotateX(float f);

	public native void rotateY(float f);

	public native void rotateZ(float f);

	public void getMatrix(Matrix matrix)
	{
		throw new RuntimeException("Stub!");
	}

	public void applyToCanvas(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public native float dotWithNormal(float f, float f1, float f2);

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
