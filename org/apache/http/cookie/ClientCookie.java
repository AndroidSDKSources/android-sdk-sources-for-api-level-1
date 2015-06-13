// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientCookie.java

package org.apache.http.cookie;


// Referenced classes of package org.apache.http.cookie:
//			Cookie

public interface ClientCookie
	extends Cookie
{

	public static final String VERSION_ATTR = "version";
	public static final String PATH_ATTR = "path";
	public static final String DOMAIN_ATTR = "domain";
	public static final String MAX_AGE_ATTR = "max-age";
	public static final String SECURE_ATTR = "secure";
	public static final String COMMENT_ATTR = "comment";
	public static final String EXPIRES_ATTR = "expires";
	public static final String PORT_ATTR = "port";
	public static final String COMMENTURL_ATTR = "commenturl";
	public static final String DISCARD_ATTR = "discard";

	public abstract String getAttribute(String s);

	public abstract boolean containsAttribute(String s);
}
