// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ParameterMetaData.java

package java.sql;


// Referenced classes of package java.sql:
//			SQLException

public interface ParameterMetaData
{

	public static final int parameterModeIn = 1;
	public static final int parameterModeInOut = 2;
	public static final int parameterModeOut = 4;
	public static final int parameterModeUnknown = 0;
	public static final int parameterNoNulls = 0;
	public static final int parameterNullable = 1;
	public static final int parameterNullableUnknown = 2;

	public abstract String getParameterClassName(int i)
		throws SQLException;

	public abstract int getParameterCount()
		throws SQLException;

	public abstract int getParameterMode(int i)
		throws SQLException;

	public abstract int getParameterType(int i)
		throws SQLException;

	public abstract String getParameterTypeName(int i)
		throws SQLException;

	public abstract int getPrecision(int i)
		throws SQLException;

	public abstract int getScale(int i)
		throws SQLException;

	public abstract int isNullable(int i)
		throws SQLException;

	public abstract boolean isSigned(int i)
		throws SQLException;
}
