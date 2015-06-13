// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Parcel.java

package android.os;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package android.os:
//			Parcelable, IBinder, IInterface, Bundle, 
//			ParcelFileDescriptor

public final class Parcel
{

	public static final Parcelable.Creator STRING_CREATOR = null;

	Parcel()
	{
		throw new RuntimeException("Stub!");
	}

	public static Parcel obtain()
	{
		throw new RuntimeException("Stub!");
	}

	public final void recycle()
	{
		throw new RuntimeException("Stub!");
	}

	public final native int dataSize();

	public final native int dataAvail();

	public final native int dataPosition();

	public final native int dataCapacity();

	public final native void setDataSize(int i);

	public final native void setDataPosition(int i);

	public final native void setDataCapacity(int i);

	public final native byte[] marshall();

	public final native void unmarshall(byte abyte0[], int i, int j);

	public final native void appendFrom(Parcel parcel, int i, int j);

	public final native boolean hasFileDescriptors();

	public final native void writeInterfaceToken(String s);

	public final native void enforceInterface(String s);

	public final void writeByteArray(byte b[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeByteArray(byte b[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final native void writeInt(int i);

	public final native void writeLong(long l);

	public final native void writeFloat(float f);

	public final native void writeDouble(double d);

	public final native void writeString(String s);

	public final native void writeStrongBinder(IBinder ibinder);

	public final void writeStrongInterface(IInterface val)
	{
		throw new RuntimeException("Stub!");
	}

	public final native void writeFileDescriptor(FileDescriptor filedescriptor);

	public final void writeByte(byte val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeMap(Map val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeBundle(Bundle val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeList(List val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeArray(Object val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeSparseArray(SparseArray val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeSparseBooleanArray(SparseBooleanArray val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeBooleanArray(boolean val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean[] createBooleanArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readBooleanArray(boolean val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeCharArray(char val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final char[] createCharArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readCharArray(char val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeIntArray(int val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final int[] createIntArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readIntArray(int val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeLongArray(long val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final long[] createLongArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readLongArray(long val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeFloatArray(float val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final float[] createFloatArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readFloatArray(float val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeDoubleArray(double val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final double[] createDoubleArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readDoubleArray(double val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeStringArray(String val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final String[] createStringArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readStringArray(String val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeBinderArray(IBinder val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final IBinder[] createBinderArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readBinderArray(IBinder val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeTypedList(List val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeStringList(List val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeBinderList(List val)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeTypedArray(Parcelable val[], int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeValue(Object v)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeParcelable(Parcelable p, int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeSerializable(Serializable s)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeException(Exception e)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeNoException()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readException()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readException(int code, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public final native int readInt();

	public final native long readLong();

	public final native float readFloat();

	public final native double readDouble();

	public final native String readString();

	public final native IBinder readStrongBinder();

	public final ParcelFileDescriptor readFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public final byte readByte()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readMap(Map outVal, ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final void readList(List outVal, ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final HashMap readHashMap(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final Bundle readBundle()
	{
		throw new RuntimeException("Stub!");
	}

	public final Bundle readBundle(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final native byte[] createByteArray();

	public final void readByteArray(byte val[])
	{
		throw new RuntimeException("Stub!");
	}

	public final ArrayList readArrayList(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final Object[] readArray(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final SparseArray readSparseArray(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final SparseBooleanArray readSparseBooleanArray()
	{
		throw new RuntimeException("Stub!");
	}

	public final ArrayList createTypedArrayList(Parcelable.Creator c)
	{
		throw new RuntimeException("Stub!");
	}

	public final void readTypedList(List list, Parcelable.Creator c)
	{
		throw new RuntimeException("Stub!");
	}

	public final ArrayList createStringArrayList()
	{
		throw new RuntimeException("Stub!");
	}

	public final ArrayList createBinderArrayList()
	{
		throw new RuntimeException("Stub!");
	}

	public final void readStringList(List list)
	{
		throw new RuntimeException("Stub!");
	}

	public final void readBinderList(List list)
	{
		throw new RuntimeException("Stub!");
	}

	public final Object[] createTypedArray(Parcelable.Creator c)
	{
		throw new RuntimeException("Stub!");
	}

	public final void readTypedArray(Object val[], Parcelable.Creator c)
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeParcelableArray(Parcelable value[], int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public final Object readValue(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final Parcelable readParcelable(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final Parcelable[] readParcelableArray(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public final Serializable readSerializable()
	{
		throw new RuntimeException("Stub!");
	}

	protected static final Parcel obtain(int obj)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

}
