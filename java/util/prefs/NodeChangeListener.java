// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NodeChangeListener.java

package java.util.prefs;

import java.util.EventListener;

// Referenced classes of package java.util.prefs:
//			NodeChangeEvent

public interface NodeChangeListener
	extends EventListener
{

	public abstract void childAdded(NodeChangeEvent nodechangeevent);

	public abstract void childRemoved(NodeChangeEvent nodechangeevent);
}
