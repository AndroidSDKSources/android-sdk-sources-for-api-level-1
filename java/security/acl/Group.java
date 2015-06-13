// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Group.java

package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

public interface Group
	extends Principal
{

	public abstract boolean addMember(Principal principal);

	public abstract boolean removeMember(Principal principal);

	public abstract boolean isMember(Principal principal);

	public abstract Enumeration members();
}
