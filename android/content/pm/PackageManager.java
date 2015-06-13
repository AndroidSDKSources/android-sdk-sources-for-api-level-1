// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PackageManager.java

package android.content.pm;

import android.content.*;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AndroidException;
import java.util.List;

// Referenced classes of package android.content.pm:
//			PackageInfo, PermissionInfo, PermissionGroupInfo, ApplicationInfo, 
//			ActivityInfo, ServiceInfo, ResolveInfo, ProviderInfo, 
//			InstrumentationInfo, IPackageInstallObserver

public abstract class PackageManager
{
	public static class NameNotFoundException extends AndroidException
	{

		public NameNotFoundException()
		{
			throw new RuntimeException("Stub!");
		}

		public NameNotFoundException(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int GET_ACTIVITIES = 1;
	public static final int GET_RECEIVERS = 2;
	public static final int GET_SERVICES = 4;
	public static final int GET_PROVIDERS = 8;
	public static final int GET_INSTRUMENTATION = 16;
	public static final int GET_INTENT_FILTERS = 32;
	public static final int GET_SIGNATURES = 64;
	public static final int GET_RESOLVED_FILTER = 64;
	public static final int GET_META_DATA = 128;
	public static final int GET_GIDS = 256;
	public static final int GET_DISABLED_COMPONENTS = 512;
	public static final int GET_SHARED_LIBRARY_FILES = 1024;
	public static final int GET_URI_PERMISSION_PATTERNS = 2048;
	public static final int GET_PERMISSIONS = 4096;
	public static final int PERMISSION_GRANTED = 0;
	public static final int PERMISSION_DENIED = -1;
	public static final int SIGNATURE_MATCH = 0;
	public static final int SIGNATURE_NEITHER_SIGNED = 1;
	public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
	public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
	public static final int SIGNATURE_NO_MATCH = -3;
	public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
	public static final int MATCH_DEFAULT_ONLY = 0x10000;
	public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
	public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
	public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
	public static final int FORWARD_LOCK_PACKAGE = 1;
	public static final int REPLACE_EXISTING_PACKAGE = 2;
	public static final int DONT_KILL_APP = 1;
	public static final int INSTALL_SUCCEEDED = 1;
	public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
	public static final int INSTALL_FAILED_INVALID_APK = -2;
	public static final int INSTALL_FAILED_INVALID_URI = -3;
	public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
	public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;
	public static final int INSTALL_FAILED_NO_SHARED_USER = -6;
	public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
	public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;
	public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;
	public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;
	public static final int INSTALL_FAILED_DEXOPT = -11;
	public static final int INSTALL_FAILED_OLDER_SDK = -12;
	public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
	public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;
	public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;
	public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;
	public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
	public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;
	public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;
	public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;
	public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;
	public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;
	public static final int PKG_INSTALL_INCOMPLETE = 0;
	public static final int PKG_INSTALL_COMPLETE = 1;

	public PackageManager()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract PackageInfo getPackageInfo(String s, int i)
		throws NameNotFoundException;

	public abstract int[] getPackageGids(String s)
		throws NameNotFoundException;

	public abstract PermissionInfo getPermissionInfo(String s, int i)
		throws NameNotFoundException;

	public abstract List queryPermissionsByGroup(String s, int i)
		throws NameNotFoundException;

	public abstract PermissionGroupInfo getPermissionGroupInfo(String s, int i)
		throws NameNotFoundException;

	public abstract List getAllPermissionGroups(int i);

	public abstract ApplicationInfo getApplicationInfo(String s, int i)
		throws NameNotFoundException;

	public abstract ActivityInfo getActivityInfo(ComponentName componentname, int i)
		throws NameNotFoundException;

	public abstract ActivityInfo getReceiverInfo(ComponentName componentname, int i)
		throws NameNotFoundException;

	public abstract ServiceInfo getServiceInfo(ComponentName componentname, int i)
		throws NameNotFoundException;

	public abstract List getInstalledPackages(int i);

	public abstract int checkPermission(String s, String s1);

	public abstract boolean addPermission(PermissionInfo permissioninfo);

	public abstract void removePermission(String s);

	public abstract int checkSignatures(String s, String s1);

	public abstract String[] getPackagesForUid(int i);

	public abstract String getNameForUid(int i);

	public abstract List getInstalledApplications(int i);

	public abstract ResolveInfo resolveActivity(Intent intent, int i);

	public abstract List queryIntentActivities(Intent intent, int i);

	public abstract List queryIntentActivityOptions(ComponentName componentname, Intent aintent[], Intent intent, int i);

	public abstract List queryBroadcastReceivers(Intent intent, int i);

	public abstract ResolveInfo resolveService(Intent intent, int i);

	public abstract List queryIntentServices(Intent intent, int i);

	public abstract ProviderInfo resolveContentProvider(String s, int i);

	public abstract List queryContentProviders(String s, int i, int j);

	public abstract InstrumentationInfo getInstrumentationInfo(ComponentName componentname, int i)
		throws NameNotFoundException;

	public abstract List queryInstrumentation(String s, int i);

	public abstract Drawable getDrawable(String s, int i, ApplicationInfo applicationinfo);

	public abstract Drawable getActivityIcon(ComponentName componentname)
		throws NameNotFoundException;

	public abstract Drawable getActivityIcon(Intent intent)
		throws NameNotFoundException;

	public abstract Drawable getDefaultActivityIcon();

	public abstract Drawable getApplicationIcon(ApplicationInfo applicationinfo);

	public abstract Drawable getApplicationIcon(String s)
		throws NameNotFoundException;

	public abstract CharSequence getText(String s, int i, ApplicationInfo applicationinfo);

	public abstract XmlResourceParser getXml(String s, int i, ApplicationInfo applicationinfo);

	public abstract CharSequence getApplicationLabel(ApplicationInfo applicationinfo);

	public abstract Resources getResourcesForActivity(ComponentName componentname)
		throws NameNotFoundException;

	public abstract Resources getResourcesForApplication(ApplicationInfo applicationinfo)
		throws NameNotFoundException;

	public abstract Resources getResourcesForApplication(String s)
		throws NameNotFoundException;

	public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void installPackage(Uri uri, IPackageInstallObserver ipackageinstallobserver, int i);

	public void installPackage(Uri packageURI)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void addPackageToPreferred(String s);

	public abstract void removePackageFromPreferred(String s);

	public abstract List getPreferredPackages(int i);

	public abstract void addPreferredActivity(IntentFilter intentfilter, int i, ComponentName acomponentname[], ComponentName componentname);

	public abstract void clearPackagePreferredActivities(String s);

	public abstract int getPreferredActivities(List list, List list1, String s);

	public abstract void setComponentEnabledSetting(ComponentName componentname, int i, int j);

	public abstract int getComponentEnabledSetting(ComponentName componentname);

	public abstract void setApplicationEnabledSetting(String s, int i, int j);

	public abstract int getApplicationEnabledSetting(String s);
}
