// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Region.java

package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.graphics:
//			Rect, Path

public class Region
	implements Parcelable
{
	public static final class Op extends Enum
	{

		public static final Op DIFFERENCE;
		public static final Op INTERSECT;
		public static final Op REPLACE;
		public static final Op REVERSE_DIFFERENCE;
		public static final Op UNION;
		public static final Op XOR;
		private static final Op $VALUES[];

		public static final Op[] values()
		{
			return (Op[])$VALUES.clone();
		}

		public static Op valueOf(String name)
		{
			return (Op)Enum.valueOf(android/graphics/Region$Op, name);
		}

		static 
		{
			DIFFERENCE = new Op("DIFFERENCE", 0);
			INTERSECT = new Op("INTERSECT", 1);
			REPLACE = new Op("REPLACE", 2);
			REVERSE_DIFFERENCE = new Op("REVERSE_DIFFERENCE", 3);
			UNION = new Op("UNION", 4);
			XOR = new Op("XOR", 5);
			$VALUES = (new Op[] {
				DIFFERENCE, INTERSECT, REPLACE, REVERSE_DIFFERENCE, UNION, XOR
			});
		}

		private Op(String s, int i)
		{
			super(s, i);
		}
	}


	public static final android.os.Parcelable.Creator CREATOR = null;

	public Region()
	{
		throw new RuntimeException("Stub!");
	}

	public Region(Region region)
	{
		throw new RuntimeException("Stub!");
	}

	public Region(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public Region(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEmpty()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean set(Region region)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean set(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean set(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setPath(Path path, Region clip)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isEmpty();

	public native boolean isRect();

	public native boolean isComplex();

	public Rect getBounds()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBounds(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public Path getBoundaryPath()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBoundaryPath(Path path)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean contains(int i, int j);

	public boolean quickContains(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean quickContains(int i, int j, int k, int l);

	public boolean quickReject(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean quickReject(int i, int j, int k, int l);

	public native boolean quickReject(Region region);

	public void translate(int dx, int dy)
	{
		throw new RuntimeException("Stub!");
	}

	public native void translate(int i, int j, Region region);

	public final boolean union(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean op(Rect r, Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean op(int left, int top, int right, int bottom, Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean op(Region region, Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean op(Rect rect, Region region, Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean op(Region region1, Region region2, Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel p, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

}
