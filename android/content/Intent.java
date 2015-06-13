// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Intent.java

package android.content;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.*;
import android.util.AttributeSet;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.content:
//			Context, ContentResolver, ComponentName

public class Intent
	implements Parcelable
{
	public static final class FilterComparison
	{

		public Intent getIntent()
		{
			throw new RuntimeException("Stub!");
		}

		public boolean equals(Object obj)
		{
			throw new RuntimeException("Stub!");
		}

		public int hashCode()
		{
			throw new RuntimeException("Stub!");
		}

		public FilterComparison(Intent intent)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class ShortcutIconResource
		implements Parcelable
	{

		public String packageName;
		public String resourceName;
		public static final android.os.Parcelable.Creator CREATOR = null;

		public static ShortcutIconResource fromContext(Context context, int resourceId)
		{
			throw new RuntimeException("Stub!");
		}

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}


		public ShortcutIconResource()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final String ACTION_MAIN = "android.intent.action.MAIN";
	public static final String ACTION_VIEW = "android.intent.action.VIEW";
	public static final String ACTION_DEFAULT = "android.intent.action.VIEW";
	public static final String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
	public static final String ACTION_EDIT = "android.intent.action.EDIT";
	public static final String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
	public static final String ACTION_PICK = "android.intent.action.PICK";
	public static final String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
	public static final String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
	public static final String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
	public static final String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
	public static final String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
	public static final String ACTION_CHOOSER = "android.intent.action.CHOOSER";
	public static final String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
	public static final String ACTION_DIAL = "android.intent.action.DIAL";
	public static final String ACTION_CALL = "android.intent.action.CALL";
	public static final String ACTION_SENDTO = "android.intent.action.SENDTO";
	public static final String ACTION_SEND = "android.intent.action.SEND";
	public static final String ACTION_ANSWER = "android.intent.action.ANSWER";
	public static final String ACTION_INSERT = "android.intent.action.INSERT";
	public static final String ACTION_DELETE = "android.intent.action.DELETE";
	public static final String ACTION_RUN = "android.intent.action.RUN";
	public static final String ACTION_SYNC = "android.intent.action.SYNC";
	public static final String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
	public static final String ACTION_SEARCH = "android.intent.action.SEARCH";
	public static final String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
	public static final String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
	public static final String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
	public static final String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
	public static final String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
	public static final String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
	public static final String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
	public static final String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
	public static final String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
	public static final String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
	public static final String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
	public static final String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
	public static final String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
	public static final String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
	public static final String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
	public static final String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
	public static final String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
	public static final String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
	public static final String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
	public static final String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
	public static final String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
	public static final String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
	public static final String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
	public static final String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
	public static final String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
	public static final String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
	public static final String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
	public static final String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
	public static final String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
	public static final String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
	public static final String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
	public static final String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
	public static final String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
	public static final String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
	public static final String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
	public static final String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
	public static final String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
	public static final String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
	public static final String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
	public static final String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
	public static final String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
	public static final String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
	public static final String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
	public static final String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
	public static final String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
	public static final String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
	public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
	public static final String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
	public static final String ACTION_REBOOT = "android.intent.action.REBOOT";
	public static final String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
	public static final String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
	public static final String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
	public static final String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
	public static final String CATEGORY_TAB = "android.intent.category.TAB";
	public static final String CATEGORY_GADGET = "android.intent.category.GADGET";
	public static final String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
	public static final String CATEGORY_HOME = "android.intent.category.HOME";
	public static final String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
	public static final String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
	public static final String CATEGORY_EMBED = "android.intent.category.EMBED";
	public static final String CATEGORY_MONKEY = "android.intent.category.MONKEY";
	public static final String CATEGORY_TEST = "android.intent.category.TEST";
	public static final String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
	public static final String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
	public static final String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
	public static final String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
	public static final String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
	public static final String EXTRA_TEXT = "android.intent.extra.TEXT";
	public static final String EXTRA_STREAM = "android.intent.extra.STREAM";
	public static final String EXTRA_EMAIL = "android.intent.extra.EMAIL";
	public static final String EXTRA_CC = "android.intent.extra.CC";
	public static final String EXTRA_BCC = "android.intent.extra.BCC";
	public static final String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
	public static final String EXTRA_INTENT = "android.intent.extra.INTENT";
	public static final String EXTRA_TITLE = "android.intent.extra.TITLE";
	public static final String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
	public static final String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
	public static final String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
	public static final String EXTRA_UID = "android.intent.extra.UID";
	public static final String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
	public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
	public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
	public static final int FLAG_FROM_BACKGROUND = 4;
	public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
	public static final int FLAG_ACTIVITY_NO_HISTORY = 0x40000000;
	public static final int FLAG_ACTIVITY_SINGLE_TOP = 0x20000000;
	public static final int FLAG_ACTIVITY_NEW_TASK = 0x10000000;
	public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 0x8000000;
	public static final int FLAG_ACTIVITY_CLEAR_TOP = 0x4000000;
	public static final int FLAG_ACTIVITY_FORWARD_RESULT = 0x2000000;
	public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 0x1000000;
	public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 0x800000;
	public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 0x400000;
	public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 0x200000;
	public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 0x100000;
	public static final int FLAG_RECEIVER_REGISTERED_ONLY = 0x40000000;
	public static final int FILL_IN_ACTION = 1;
	public static final int FILL_IN_DATA = 2;
	public static final int FILL_IN_CATEGORIES = 4;
	public static final int FILL_IN_COMPONENT = 8;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public Intent()
	{
		throw new RuntimeException("Stub!");
	}

	public Intent(Intent o)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent(String action)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent(String action, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent(Context packageContext, Class cls)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent(String action, Uri uri, Context packageContext, Class cls)
	{
		throw new RuntimeException("Stub!");
	}

	public static Intent createChooser(Intent target, CharSequence title)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public Intent cloneFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public static Intent getIntent(String uri)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public static Intent getIntentOld(String uri)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public String getAction()
	{
		throw new RuntimeException("Stub!");
	}

	public Uri getData()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDataString()
	{
		throw new RuntimeException("Stub!");
	}

	public String getScheme()
	{
		throw new RuntimeException("Stub!");
	}

	public String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public String resolveType(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public String resolveType(ContentResolver resolver)
	{
		throw new RuntimeException("Stub!");
	}

	public String resolveTypeIfNeeded(ContentResolver resolver)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasCategory(String category)
	{
		throw new RuntimeException("Stub!");
	}

	public Set getCategories()
	{
		throw new RuntimeException("Stub!");
	}

	public void setExtrasClassLoader(ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasFileDescriptors()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBooleanExtra(String name, boolean defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public byte getByteExtra(String name, byte defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public short getShortExtra(String name, short defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public char getCharExtra(String name, char defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public int getIntExtra(String name, int defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLongExtra(String name, long defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloatExtra(String name, float defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public double getDoubleExtra(String name, double defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public String getStringExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getCharSequenceExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Parcelable getParcelableExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Parcelable[] getParcelableArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList getParcelableArrayListExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Serializable getSerializableExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList getIntegerArrayListExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList getStringArrayListExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean[] getBooleanArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getByteArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public short[] getShortArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public char[] getCharArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getIntArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public long[] getLongArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public float[] getFloatArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public double[] getDoubleArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getStringArrayExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getBundleExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getExtras()
	{
		throw new RuntimeException("Stub!");
	}

	public int getFlags()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName getComponent()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName resolveActivity(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityInfo resolveActivityInfo(PackageManager pm, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setAction(String action)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setData(Uri data)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setType(String type)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setDataAndType(Uri data, String type)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent addCategory(String category)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeCategory(String category)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, byte value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, char value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, short value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, int value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, long value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, float value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, double value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, CharSequence value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, Parcelable value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, Parcelable value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putParcelableArrayListExtra(String name, ArrayList value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putIntegerArrayListExtra(String name, ArrayList value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putStringArrayListExtra(String name, ArrayList value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, Serializable value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, boolean value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, byte value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, short value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, char value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, int value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, long value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, float value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, double value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, String value[])
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtra(String name, Bundle value)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtras(Intent src)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent putExtras(Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeExtra(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent addFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setComponent(ComponentName component)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setClassName(Context packageContext, String className)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setClassName(String packageName, String className)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent setClass(Context packageContext, Class cls)
	{
		throw new RuntimeException("Stub!");
	}

	public int fillIn(Intent other, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean filterEquals(Intent other)
	{
		throw new RuntimeException("Stub!");
	}

	public int filterHashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toURI()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void readFromParcel(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

	public static Intent parseIntent(Resources resources, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

}
