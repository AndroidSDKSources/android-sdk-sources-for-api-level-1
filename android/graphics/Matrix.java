// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Matrix.java

package android.graphics;


// Referenced classes of package android.graphics:
//			RectF

public class Matrix
{
	public static final class ScaleToFit extends Enum
	{

		public static final ScaleToFit CENTER;
		public static final ScaleToFit END;
		public static final ScaleToFit FILL;
		public static final ScaleToFit START;
		private static final ScaleToFit $VALUES[];

		public static final ScaleToFit[] values()
		{
			return (ScaleToFit[])$VALUES.clone();
		}

		public static ScaleToFit valueOf(String name)
		{
			return (ScaleToFit)Enum.valueOf(android/graphics/Matrix$ScaleToFit, name);
		}

		static 
		{
			CENTER = new ScaleToFit("CENTER", 0);
			END = new ScaleToFit("END", 1);
			FILL = new ScaleToFit("FILL", 2);
			START = new ScaleToFit("START", 3);
			$VALUES = (new ScaleToFit[] {
				CENTER, END, FILL, START
			});
		}

		private ScaleToFit(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int MSCALE_X = 0;
	public static final int MSKEW_X = 1;
	public static final int MTRANS_X = 2;
	public static final int MSKEW_Y = 3;
	public static final int MSCALE_Y = 4;
	public static final int MTRANS_Y = 5;
	public static final int MPERSP_0 = 6;
	public static final int MPERSP_1 = 7;
	public static final int MPERSP_2 = 8;

	public Matrix()
	{
		throw new RuntimeException("Stub!");
	}

	public Matrix(Matrix src)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isIdentity()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean rectStaysRect()
	{
		throw new RuntimeException("Stub!");
	}

	public void set(Matrix src)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTranslate(float dx, float dy)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScale(float sx, float sy, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScale(float sx, float sy)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRotate(float degrees, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRotate(float degrees)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSinCos(float sinValue, float cosValue, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSinCos(float sinValue, float cosValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSkew(float kx, float ky, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSkew(float kx, float ky)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setConcat(Matrix a, Matrix b)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preTranslate(float dx, float dy)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preScale(float sx, float sy, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preScale(float sx, float sy)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preRotate(float degrees, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preRotate(float degrees)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preSkew(float kx, float ky, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preSkew(float kx, float ky)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean preConcat(Matrix other)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postTranslate(float dx, float dy)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postScale(float sx, float sy, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postScale(float sx, float sy)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postRotate(float degrees, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postRotate(float degrees)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postSkew(float kx, float ky, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postSkew(float kx, float ky)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postConcat(Matrix other)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setRectToRect(RectF src, RectF dst, ScaleToFit stf)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setPolyToPoly(float src[], int srcIndex, float dst[], int dstIndex, int pointCount)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean invert(Matrix inverse)
	{
		throw new RuntimeException("Stub!");
	}

	public void mapPoints(float dst[], int dstIndex, float src[], int srcIndex, int pointCount)
	{
		throw new RuntimeException("Stub!");
	}

	public void mapVectors(float dst[], int dstIndex, float src[], int srcIndex, int vectorCount)
	{
		throw new RuntimeException("Stub!");
	}

	public void mapPoints(float dst[], float src[])
	{
		throw new RuntimeException("Stub!");
	}

	public void mapVectors(float dst[], float src[])
	{
		throw new RuntimeException("Stub!");
	}

	public void mapPoints(float pts[])
	{
		throw new RuntimeException("Stub!");
	}

	public void mapVectors(float vecs[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean mapRect(RectF dst, RectF src)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean mapRect(RectF rect)
	{
		throw new RuntimeException("Stub!");
	}

	public float mapRadius(float radius)
	{
		throw new RuntimeException("Stub!");
	}

	public void getValues(float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setValues(float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toShortString()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
