// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ElementType.java

package java.lang.annotation;


public final class ElementType extends Enum
{

	public static final ElementType ANNOTATION_TYPE;
	public static final ElementType CONSTRUCTOR;
	public static final ElementType FIELD;
	public static final ElementType LOCAL_VARIABLE;
	public static final ElementType METHOD;
	public static final ElementType PACKAGE;
	public static final ElementType PARAMETER;
	public static final ElementType TYPE;
	private static final ElementType $VALUES[];

	public static final ElementType[] values()
	{
		return (ElementType[])$VALUES.clone();
	}

	public static ElementType valueOf(String name)
	{
		return (ElementType)Enum.valueOf(java/lang/annotation/ElementType, name);
	}

	private ElementType(String s, int i)
	{
		super(s, i);
	}

	static 
	{
		ANNOTATION_TYPE = new ElementType("ANNOTATION_TYPE", 0);
		CONSTRUCTOR = new ElementType("CONSTRUCTOR", 1);
		FIELD = new ElementType("FIELD", 2);
		LOCAL_VARIABLE = new ElementType("LOCAL_VARIABLE", 3);
		METHOD = new ElementType("METHOD", 4);
		PACKAGE = new ElementType("PACKAGE", 5);
		PARAMETER = new ElementType("PARAMETER", 6);
		TYPE = new ElementType("TYPE", 7);
		$VALUES = (new ElementType[] {
			ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE
		});
	}
}
