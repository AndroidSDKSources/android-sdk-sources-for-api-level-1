// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecurityManager.java

package java.lang;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

// Referenced classes of package java.lang:
//			Object, RuntimeException, String, Thread, 
//			ThreadGroup, Class, ClassLoader

public class SecurityManager
{

	protected boolean inCheck;

	public SecurityManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkAccept(String host, int port)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkAccess(Thread thread)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkAccess(ThreadGroup group)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkConnect(String host, int port)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkConnect(String host, int port, Object context)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkCreateClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkDelete(String file)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkExec(String cmd)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkExit(int status)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkLink(String libName)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkListen(int port)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkMemberAccess(Class cls, int type)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkMulticast(InetAddress maddr)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkMulticast(InetAddress maddr, byte ttl)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPackageAccess(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPackageDefinition(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPropertiesAccess()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPropertyAccess(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkRead(FileDescriptor fd)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkRead(String file)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkRead(String file, Object context)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkSecurityAccess(String target)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkSetFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean checkTopLevelWindow(Object window)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkSystemClipboardAccess()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkAwtEventQueueAccess()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPrintJobAccess()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkWrite(FileDescriptor fd)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkWrite(String file)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getInCheck()
	{
		throw new RuntimeException("Stub!");
	}

	protected Class[] getClassContext()
	{
		throw new RuntimeException("Stub!");
	}

	protected ClassLoader currentClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	protected int classLoaderDepth()
	{
		throw new RuntimeException("Stub!");
	}

	protected Class currentLoadedClass()
	{
		throw new RuntimeException("Stub!");
	}

	protected int classDepth(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean inClass(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean inClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public ThreadGroup getThreadGroup()
	{
		throw new RuntimeException("Stub!");
	}

	public Object getSecurityContext()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(Permission permission)
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(Permission permission, Object context)
	{
		throw new RuntimeException("Stub!");
	}
}
