// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Matrix.java

package android.opengl;


public class Matrix
{

	public Matrix()
	{
		throw new RuntimeException("Stub!");
	}

	public static native void multiplyMM(float af[], int i, float af1[], int j, float af2[], int k);

	public static native void multiplyMV(float af[], int i, float af1[], int j, float af2[], int k);

	public static void transposeM(float mTrans[], int mTransOffset, float m[], int mOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean invertM(float mInv[], int mInvOffset, float m[], int mOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public static void orthoM(float m[], int mOffset, float left, float right, float bottom, float top, float near, float far)
	{
		throw new RuntimeException("Stub!");
	}

	public static void frustumM(float m[], int offset, float left, float right, float bottom, float top, float near, float far)
	{
		throw new RuntimeException("Stub!");
	}

	public static float length(float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setIdentityM(float sm[], int smOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public static void scaleM(float sm[], int smOffset, float m[], int mOffset, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void scaleM(float m[], int mOffset, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void translateM(float tm[], int tmOffset, float m[], int mOffset, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void translateM(float m[], int mOffset, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void rotateM(float rm[], int rmOffset, float m[], int mOffset, float a, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void rotateM(float m[], int mOffset, float a, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setRotateM(float rm[], int rmOffset, float a, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setRotateEulerM(float rm[], int rmOffset, float x, float y, float z)
	{
		throw new RuntimeException("Stub!");
	}
}
