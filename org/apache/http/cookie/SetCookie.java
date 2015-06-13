// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SetCookie.java

package org.apache.http.cookie;

import java.util.Date;

// Referenced classes of package org.apache.http.cookie:
//			Cookie

public interface SetCookie
	extends Cookie
{

	public abstract void setValue(String s);

	public abstract void setComment(String s);

	public abstract void setExpiryDate(Date date);

	public abstract void setDomain(String s);

	public abstract void setPath(String s);

	public abstract void setSecure(boolean flag);

	public abstract void setVersion(int i);
}
