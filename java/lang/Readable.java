// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Readable.java

package java.lang;

import java.io.IOException;
import java.nio.CharBuffer;

// Referenced classes of package java.lang:
//			Object

public interface Readable
{

	public abstract int read(CharBuffer charbuffer)
		throws IOException;
}
