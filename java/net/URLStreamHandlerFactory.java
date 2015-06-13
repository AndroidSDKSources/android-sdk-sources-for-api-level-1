// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URLStreamHandlerFactory.java

package java.net;


// Referenced classes of package java.net:
//			URLStreamHandler

public interface URLStreamHandlerFactory
{

	public abstract URLStreamHandler createURLStreamHandler(String s);
}
