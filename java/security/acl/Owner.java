// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Owner.java

package java.security.acl;

import java.security.Principal;

// Referenced classes of package java.security.acl:
//			NotOwnerException, LastOwnerException

public interface Owner
{

	public abstract boolean addOwner(Principal principal, Principal principal1)
		throws NotOwnerException;

	public abstract boolean deleteOwner(Principal principal, Principal principal1)
		throws NotOwnerException, LastOwnerException;

	public abstract boolean isOwner(Principal principal);
}
