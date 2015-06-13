// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GL10Ext.java

package javax.microedition.khronos.opengles;

import java.nio.IntBuffer;

// Referenced classes of package javax.microedition.khronos.opengles:
//			GL

public interface GL10Ext
	extends GL
{

	public abstract int glQueryMatrixxOES(int ai[], int i, int ai1[], int j);

	public abstract int glQueryMatrixxOES(IntBuffer intbuffer, IntBuffer intbuffer1);
}
