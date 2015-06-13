// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MockPackageManager.java

package android.test.mock;

import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

public class MockPackageManager extends PackageManager
{

	public MockPackageManager()
	{
		throw new RuntimeException("Stub!");
	}

	public PackageInfo getPackageInfo(String packageName, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getPackageGids(String packageName)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionInfo getPermissionInfo(String name, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public List queryPermissionsByGroup(String group, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionGroupInfo getPermissionGroupInfo(String name, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public List getAllPermissionGroups(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public ApplicationInfo getApplicationInfo(String packageName, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityInfo getActivityInfo(ComponentName className, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityInfo getReceiverInfo(ComponentName className, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public ServiceInfo getServiceInfo(ComponentName className, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public List getInstalledPackages(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkPermission(String permName, String pkgName)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean addPermission(PermissionInfo info)
	{
		throw new RuntimeException("Stub!");
	}

	public void removePermission(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkSignatures(String pkg1, String pkg2)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getPackagesForUid(int uid)
	{
		throw new RuntimeException("Stub!");
	}

	public String getNameForUid(int uid)
	{
		throw new RuntimeException("Stub!");
	}

	public List getInstalledApplications(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public ResolveInfo resolveActivity(Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public List queryIntentActivities(Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public List queryIntentActivityOptions(ComponentName caller, Intent specifics[], Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public List queryBroadcastReceivers(Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public ResolveInfo resolveService(Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public List queryIntentServices(Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public ProviderInfo resolveContentProvider(String name, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public List queryContentProviders(String processName, int uid, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public List queryInstrumentation(String targetPackage, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getActivityIcon(ComponentName activityName)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getActivityIcon(Intent intent)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDefaultActivityIcon()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getApplicationIcon(ApplicationInfo info)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getApplicationIcon(String packageName)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getApplicationLabel(ApplicationInfo info)
	{
		throw new RuntimeException("Stub!");
	}

	public Resources getResourcesForActivity(ComponentName activityName)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Resources getResourcesForApplication(ApplicationInfo app)
	{
		throw new RuntimeException("Stub!");
	}

	public Resources getResourcesForApplication(String appPackageName)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void installPackage(Uri packageURI, IPackageInstallObserver observer, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void addPackageToPreferred(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public void removePackageFromPreferred(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public List getPreferredPackages(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public int getComponentEnabledSetting(ComponentName componentName)
	{
		throw new RuntimeException("Stub!");
	}

	public void setApplicationEnabledSetting(String packageName, int newState, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public int getApplicationEnabledSetting(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public void addPreferredActivity(IntentFilter filter, int match, ComponentName set[], ComponentName activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearPackagePreferredActivities(String packageName)
	{
		throw new RuntimeException("Stub!");
	}

	public void installPackage(Uri packageURI)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPreferredActivities(List outFilters, List outActivities, String packageName)
	{
		throw new RuntimeException("Stub!");
	}
}
