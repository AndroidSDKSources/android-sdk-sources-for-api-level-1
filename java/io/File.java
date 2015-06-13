// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   File.java

package java.io;

import java.net.*;

// Referenced classes of package java.io:
//			Serializable, IOException, FilenameFilter, FileFilter

public class File
	implements Serializable, Comparable
{

	public static final char separatorChar = '\0';
	public static final String separator = null;
	public static final char pathSeparatorChar = '\0';
	public static final String pathSeparator = null;

	public File(File dir, String name)
	{
		throw new RuntimeException("Stub!");
	}

	public File(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public File(String dirPath, String name)
	{
		throw new RuntimeException("Stub!");
	}

	public File(URI uri)
	{
		throw new RuntimeException("Stub!");
	}

	public static File[] listRoots()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canRead()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canWrite()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(File another)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean delete()
	{
		throw new RuntimeException("Stub!");
	}

	public void deleteOnExit()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean exists()
	{
		throw new RuntimeException("Stub!");
	}

	public String getAbsolutePath()
	{
		throw new RuntimeException("Stub!");
	}

	public File getAbsoluteFile()
	{
		throw new RuntimeException("Stub!");
	}

	public String getCanonicalPath()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public File getCanonicalFile()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public File getParentFile()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAbsolute()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDirectory()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFile()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isHidden()
	{
		throw new RuntimeException("Stub!");
	}

	public long lastModified()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setLastModified(long time)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public long length()
	{
		throw new RuntimeException("Stub!");
	}

	public String[] list()
	{
		throw new RuntimeException("Stub!");
	}

	public File[] listFiles()
	{
		throw new RuntimeException("Stub!");
	}

	public File[] listFiles(FilenameFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public File[] listFiles(FileFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] list(FilenameFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean mkdir()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean mkdirs()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean createNewFile()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static File createTempFile(String prefix, String suffix)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static File createTempFile(String prefix, String suffix, File directory)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean renameTo(File dest)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public URI toURI()
	{
		throw new RuntimeException("Stub!");
	}

	public URL toURL()
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((File)x0);
	}

}
