// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Appendable.java

package java.lang;

import java.io.IOException;

// Referenced classes of package java.lang:
//			Object, CharSequence

public interface Appendable
{

	public abstract Appendable append(char c)
		throws IOException;

	public abstract Appendable append(CharSequence charsequence)
		throws IOException;

	public abstract Appendable append(CharSequence charsequence, int i, int j)
		throws IOException;
}
