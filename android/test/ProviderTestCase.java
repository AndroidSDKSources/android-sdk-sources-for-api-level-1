// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProviderTestCase.java

package android.test;

import android.content.*;
import android.test.mock.MockContentResolver;

// Referenced classes of package android.test:
//			InstrumentationTestCase, IsolatedContext

public abstract class ProviderTestCase extends InstrumentationTestCase
{

	public ProviderTestCase(Class providerClass, String providerAuthority)
	{
		throw new RuntimeException("Stub!");
	}

	public ContentProvider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setUp()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}

	public MockContentResolver getMockContentResolver()
	{
		throw new RuntimeException("Stub!");
	}

	public IsolatedContext getMockContext()
	{
		throw new RuntimeException("Stub!");
	}

	public static ContentResolver newResolverWithContentProviderFromSql(Context targetContext, Class providerClass, String authority, String databaseName, int databaseVersion, String sql)
		throws IllegalAccessException, InstantiationException
	{
		throw new RuntimeException("Stub!");
	}
}
