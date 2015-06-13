// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DriverPropertyInfo.java

package java.sql;


public class DriverPropertyInfo
{

	public String choices[];
	public String description;
	public String name;
	public boolean required;
	public String value;

	public DriverPropertyInfo(String name, String value)
	{
		choices = null;
		throw new RuntimeException("Stub!");
	}
}
