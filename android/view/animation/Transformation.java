// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Transformation.java

package android.view.animation;

import android.graphics.Matrix;

public class Transformation
{

	public static int TYPE_IDENTITY;
	public static int TYPE_ALPHA;
	public static int TYPE_MATRIX;
	public static int TYPE_BOTH;
	protected Matrix mMatrix;
	protected float mAlpha;
	protected int mTransformationType;

	public Transformation()
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTransformationType()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTransformationType(int transformationType)
	{
		throw new RuntimeException("Stub!");
	}

	public void set(Transformation t)
	{
		throw new RuntimeException("Stub!");
	}

	public void compose(Transformation t)
	{
		throw new RuntimeException("Stub!");
	}

	public Matrix getMatrix()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAlpha(float alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public float getAlpha()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
