// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Externalizable.java

package java.io;


// Referenced classes of package java.io:
//			Serializable, IOException, ObjectInput, ObjectOutput

public interface Externalizable
	extends Serializable
{

	public abstract void readExternal(ObjectInput objectinput)
		throws IOException, ClassNotFoundException;

	public abstract void writeExternal(ObjectOutput objectoutput)
		throws IOException;
}
