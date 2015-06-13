// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Acl.java

package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

// Referenced classes of package java.security.acl:
//			Owner, NotOwnerException, AclEntry, Permission

public interface Acl
	extends Owner
{

	public abstract void setName(Principal principal, String s)
		throws NotOwnerException;

	public abstract String getName();

	public abstract boolean addEntry(Principal principal, AclEntry aclentry)
		throws NotOwnerException;

	public abstract boolean removeEntry(Principal principal, AclEntry aclentry)
		throws NotOwnerException;

	public abstract Enumeration getPermissions(Principal principal);

	public abstract Enumeration entries();

	public abstract boolean checkPermission(Principal principal, Permission permission);

	public abstract String toString();
}
