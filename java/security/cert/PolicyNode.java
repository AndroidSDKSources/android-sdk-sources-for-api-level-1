// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PolicyNode.java

package java.security.cert;

import java.util.Iterator;
import java.util.Set;

public interface PolicyNode
{

	public abstract Iterator getChildren();

	public abstract int getDepth();

	public abstract Set getExpectedPolicies();

	public abstract PolicyNode getParent();

	public abstract Set getPolicyQualifiers();

	public abstract String getValidPolicy();

	public abstract boolean isCritical();
}
