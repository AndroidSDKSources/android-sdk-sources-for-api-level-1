// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Pack200.java

package java.util.jar;

import java.io.*;
import java.util.SortedMap;

// Referenced classes of package java.util.jar:
//			JarOutputStream, JarFile, JarInputStream

public abstract class Pack200
{
	public static interface Unpacker
	{

		public static final String DEFLATE_HINT = "unpack.deflate.hint";
		public static final String FALSE = "false";
		public static final String KEEP = "keep";
		public static final String PROGRESS = "unpack.progress";
		public static final String TRUE = "true";

		public abstract SortedMap properties();

		public abstract void unpack(InputStream inputstream, JarOutputStream jaroutputstream)
			throws IOException;

		public abstract void unpack(File file, JarOutputStream jaroutputstream)
			throws IOException;
	}

	public static interface Packer
	{

		public static final String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
		public static final String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
		public static final String DEFLATE_HINT = "pack.deflate.hint";
		public static final String EFFORT = "pack.effort";
		public static final String ERROR = "error";
		public static final String FALSE = "false";
		public static final String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
		public static final String KEEP = "keep";
		public static final String KEEP_FILE_ORDER = "pack.keep.file.order";
		public static final String LATEST = "latest";
		public static final String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
		public static final String MODIFICATION_TIME = "pack.modification.time";
		public static final String PASS = "pass";
		public static final String PASS_FILE_PFX = "pack.pass.file.";
		public static final String PROGRESS = "pack.progress";
		public static final String SEGMENT_LIMIT = "pack.segment.limit";
		public static final String STRIP = "strip";
		public static final String TRUE = "true";
		public static final String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";

		public abstract SortedMap properties();

		public abstract void pack(JarFile jarfile, OutputStream outputstream)
			throws IOException;

		public abstract void pack(JarInputStream jarinputstream, OutputStream outputstream)
			throws IOException;
	}


	Pack200()
	{
		throw new RuntimeException("Stub!");
	}

	public static Packer newPacker()
	{
		throw new RuntimeException("Stub!");
	}

	public static Unpacker newUnpacker()
	{
		throw new RuntimeException("Stub!");
	}
}
