// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Class.java

package java.lang;

import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.net.URL;
import java.security.ProtectionDomain;

// Referenced classes of package java.lang:
//			Object, RuntimeException, ClassNotFoundException, NoSuchMethodException, 
//			SecurityException, NoSuchFieldException, IllegalAccessException, InstantiationException, 
//			String, ClassLoader, Package

public final class Class
	implements Serializable, AnnotatedElement, GenericDeclaration, Type
{

	Class()
	{
		throw new RuntimeException("Stub!");
	}

	public static Class forName(String className)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public static Class forName(String className, boolean initializeBoolean, ClassLoader classLoader)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Class[] getClasses()
	{
		throw new RuntimeException("Stub!");
	}

	public Annotation getAnnotation(Class annotationClass)
	{
		throw new RuntimeException("Stub!");
	}

	public Annotation[] getAnnotations()
	{
		throw new RuntimeException("Stub!");
	}

	public String getCanonicalName()
	{
		throw new RuntimeException("Stub!");
	}

	public ClassLoader getClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public native Class getComponentType();

	public transient Constructor getConstructor(Class parameterTypes[])
		throws NoSuchMethodException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Constructor[] getConstructors()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public native Annotation[] getDeclaredAnnotations();

	public Class[] getDeclaredClasses()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public transient Constructor getDeclaredConstructor(Class parameterTypes[])
		throws NoSuchMethodException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Constructor[] getDeclaredConstructors()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Field getDeclaredField(String name)
		throws NoSuchFieldException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Field[] getDeclaredFields()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public transient Method getDeclaredMethod(String name, Class parameterTypes[])
		throws NoSuchMethodException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Method[] getDeclaredMethods()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public native Class getDeclaringClass();

	public native Class getEnclosingClass();

	public native Constructor getEnclosingConstructor();

	public native Method getEnclosingMethod();

	public Object[] getEnumConstants()
	{
		throw new RuntimeException("Stub!");
	}

	public Field getField(String name)
		throws NoSuchFieldException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Field[] getFields()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Type[] getGenericInterfaces()
	{
		throw new RuntimeException("Stub!");
	}

	public Type getGenericSuperclass()
	{
		throw new RuntimeException("Stub!");
	}

	public native Class[] getInterfaces();

	public transient Method getMethod(String name, Class parameterTypes[])
		throws NoSuchMethodException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public Method[] getMethods()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public int getModifiers()
	{
		throw new RuntimeException("Stub!");
	}

	public native String getName();

	public String getSimpleName()
	{
		throw new RuntimeException("Stub!");
	}

	public ProtectionDomain getProtectionDomain()
	{
		throw new RuntimeException("Stub!");
	}

	public URL getResource(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getResourceAsStream(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] getSigners()
	{
		throw new RuntimeException("Stub!");
	}

	public native Class getSuperclass();

	public synchronized TypeVariable[] getTypeParameters()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAnnotation()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAnnotationPresent(Class annotationClass)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isAnonymousClass();

	public boolean isArray()
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isAssignableFrom(Class class1);

	public boolean isEnum()
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isInstance(Object obj);

	public native boolean isInterface();

	public boolean isLocalClass()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMemberClass()
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isPrimitive();

	public boolean isSynthetic()
	{
		throw new RuntimeException("Stub!");
	}

	public native Object newInstance()
		throws IllegalAccessException, InstantiationException;

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public Package getPackage()
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean desiredAssertionStatus();

	public Class asSubclass(Class clazz)
	{
		throw new RuntimeException("Stub!");
	}

	public Object cast(Object obj)
	{
		throw new RuntimeException("Stub!");
	}
}
