// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FaceDetector.java

package android.media;

import android.graphics.Bitmap;
import android.graphics.PointF;

public class FaceDetector
{
	public class Face
	{

		public static final float CONFIDENCE_THRESHOLD = 0.4F;
		public static final int EULER_X = 0;
		public static final int EULER_Y = 1;
		public static final int EULER_Z = 2;
		final FaceDetector this$0;

		public float confidence()
		{
			throw new RuntimeException("Stub!");
		}

		public void getMidPoint(PointF point)
		{
			throw new RuntimeException("Stub!");
		}

		public float eyesDistance()
		{
			throw new RuntimeException("Stub!");
		}

		public float pose(int euler)
		{
			throw new RuntimeException("Stub!");
		}

		Face()
		{
			this$0 = FaceDetector.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public FaceDetector(int width, int height, int maxFaces)
	{
		throw new RuntimeException("Stub!");
	}

	public int findFaces(Bitmap bitmap, Face faces[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
