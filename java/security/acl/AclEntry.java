// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AclEntry.java

package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

// Referenced classes of package java.security.acl:
//			Permission

public interface AclEntry
	extends Cloneable
{

	public abstract boolean setPrincipal(Principal principal);

	public abstract Principal getPrincipal();

	public abstract void setNegativePermissions();

	public abstract boolean isNegative();

	public abstract boolean addPermission(Permission permission);

	public abstract boolean removePermission(Permission permission);

	public abstract boolean checkPermission(Permission permission);

	public abstract Enumeration permissions();

	public abstract String toString();

	public abstract Object clone();
}
