// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Manifest.java

package android;


public final class Manifest
{
	public static final class permission_group
	{

		public static final String ACCOUNTS = "android.permission-group.ACCOUNTS";
		public static final String COST_MONEY = "android.permission-group.COST_MONEY";
		public static final String DEVELOPMENT_TOOLS = "android.permission-group.DEVELOPMENT_TOOLS";
		public static final String HARDWARE_CONTROLS = "android.permission-group.HARDWARE_CONTROLS";
		public static final String LOCATION = "android.permission-group.LOCATION";
		public static final String MESSAGES = "android.permission-group.MESSAGES";
		public static final String NETWORK = "android.permission-group.NETWORK";
		public static final String PERSONAL_INFO = "android.permission-group.PERSONAL_INFO";
		public static final String PHONE_CALLS = "android.permission-group.PHONE_CALLS";
		public static final String SYSTEM_TOOLS = "android.permission-group.SYSTEM_TOOLS";

		public permission_group()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class permission
	{

		public static final String ACCESS_CHECKIN_PROPERTIES = "android.permission.ACCESS_CHECKIN_PROPERTIES";
		public static final String ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
		public static final String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
		public static final String ACCESS_LOCATION_EXTRA_COMMANDS = "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS";
		public static final String ACCESS_MOCK_LOCATION = "android.permission.ACCESS_MOCK_LOCATION";
		public static final String ACCESS_NETWORK_STATE = "android.permission.ACCESS_NETWORK_STATE";
		public static final String ACCESS_SURFACE_FLINGER = "android.permission.ACCESS_SURFACE_FLINGER";
		public static final String ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE";
		public static final String ADD_SYSTEM_SERVICE = "android.permission.ADD_SYSTEM_SERVICE";
		public static final String BATTERY_STATS = "android.permission.BATTERY_STATS";
		public static final String BLUETOOTH = "android.permission.BLUETOOTH";
		public static final String BLUETOOTH_ADMIN = "android.permission.BLUETOOTH_ADMIN";
		public static final String BRICK = "android.permission.BRICK";
		public static final String BROADCAST_PACKAGE_REMOVED = "android.permission.BROADCAST_PACKAGE_REMOVED";
		public static final String BROADCAST_STICKY = "android.permission.BROADCAST_STICKY";
		public static final String CALL_PHONE = "android.permission.CALL_PHONE";
		public static final String CALL_PRIVILEGED = "android.permission.CALL_PRIVILEGED";
		public static final String CAMERA = "android.permission.CAMERA";
		public static final String CHANGE_COMPONENT_ENABLED_STATE = "android.permission.CHANGE_COMPONENT_ENABLED_STATE";
		public static final String CHANGE_CONFIGURATION = "android.permission.CHANGE_CONFIGURATION";
		public static final String CHANGE_NETWORK_STATE = "android.permission.CHANGE_NETWORK_STATE";
		public static final String CHANGE_WIFI_STATE = "android.permission.CHANGE_WIFI_STATE";
		public static final String CLEAR_APP_CACHE = "android.permission.CLEAR_APP_CACHE";
		public static final String CLEAR_APP_USER_DATA = "android.permission.CLEAR_APP_USER_DATA";
		public static final String CONTROL_LOCATION_UPDATES = "android.permission.CONTROL_LOCATION_UPDATES";
		public static final String DELETE_CACHE_FILES = "android.permission.DELETE_CACHE_FILES";
		public static final String DELETE_PACKAGES = "android.permission.DELETE_PACKAGES";
		public static final String DEVICE_POWER = "android.permission.DEVICE_POWER";
		public static final String DIAGNOSTIC = "android.permission.DIAGNOSTIC";
		public static final String DISABLE_KEYGUARD = "android.permission.DISABLE_KEYGUARD";
		public static final String DUMP = "android.permission.DUMP";
		public static final String EXPAND_STATUS_BAR = "android.permission.EXPAND_STATUS_BAR";
		public static final String FACTORY_TEST = "android.permission.FACTORY_TEST";
		public static final String FLASHLIGHT = "android.permission.FLASHLIGHT";
		public static final String FORCE_BACK = "android.permission.FORCE_BACK";
		public static final String FOTA_UPDATE = "android.permission.FOTA_UPDATE";
		public static final String GET_ACCOUNTS = "android.permission.GET_ACCOUNTS";
		public static final String GET_PACKAGE_SIZE = "android.permission.GET_PACKAGE_SIZE";
		public static final String GET_TASKS = "android.permission.GET_TASKS";
		public static final String HARDWARE_TEST = "android.permission.HARDWARE_TEST";
		public static final String INJECT_EVENTS = "android.permission.INJECT_EVENTS";
		public static final String INSTALL_PACKAGES = "android.permission.INSTALL_PACKAGES";
		public static final String INTERNAL_SYSTEM_WINDOW = "android.permission.INTERNAL_SYSTEM_WINDOW";
		public static final String INTERNET = "android.permission.INTERNET";
		public static final String MANAGE_APP_TOKENS = "android.permission.MANAGE_APP_TOKENS";
		public static final String MASTER_CLEAR = "android.permission.MASTER_CLEAR";
		public static final String MODIFY_AUDIO_SETTINGS = "android.permission.MODIFY_AUDIO_SETTINGS";
		public static final String MODIFY_PHONE_STATE = "android.permission.MODIFY_PHONE_STATE";
		public static final String MOUNT_UNMOUNT_FILESYSTEMS = "android.permission.MOUNT_UNMOUNT_FILESYSTEMS";
		public static final String PERSISTENT_ACTIVITY = "android.permission.PERSISTENT_ACTIVITY";
		public static final String PROCESS_OUTGOING_CALLS = "android.permission.PROCESS_OUTGOING_CALLS";
		public static final String READ_CALENDAR = "android.permission.READ_CALENDAR";
		public static final String READ_CONTACTS = "android.permission.READ_CONTACTS";
		public static final String READ_FRAME_BUFFER = "android.permission.READ_FRAME_BUFFER";
		public static final String READ_INPUT_STATE = "android.permission.READ_INPUT_STATE";
		public static final String READ_LOGS = "android.permission.READ_LOGS";
		public static final String READ_OWNER_DATA = "android.permission.READ_OWNER_DATA";
		public static final String READ_PHONE_STATE = "android.permission.READ_PHONE_STATE";
		public static final String READ_SMS = "android.permission.READ_SMS";
		public static final String READ_SYNC_SETTINGS = "android.permission.READ_SYNC_SETTINGS";
		public static final String READ_SYNC_STATS = "android.permission.READ_SYNC_STATS";
		public static final String REBOOT = "android.permission.REBOOT";
		public static final String RECEIVE_BOOT_COMPLETED = "android.permission.RECEIVE_BOOT_COMPLETED";
		public static final String RECEIVE_MMS = "android.permission.RECEIVE_MMS";
		public static final String RECEIVE_SMS = "android.permission.RECEIVE_SMS";
		public static final String RECEIVE_WAP_PUSH = "android.permission.RECEIVE_WAP_PUSH";
		public static final String RECORD_AUDIO = "android.permission.RECORD_AUDIO";
		public static final String REORDER_TASKS = "android.permission.REORDER_TASKS";
		public static final String RESTART_PACKAGES = "android.permission.RESTART_PACKAGES";
		public static final String SEND_SMS = "android.permission.SEND_SMS";
		public static final String SET_ACTIVITY_WATCHER = "android.permission.SET_ACTIVITY_WATCHER";
		public static final String SET_ALWAYS_FINISH = "android.permission.SET_ALWAYS_FINISH";
		public static final String SET_ANIMATION_SCALE = "android.permission.SET_ANIMATION_SCALE";
		public static final String SET_DEBUG_APP = "android.permission.SET_DEBUG_APP";
		public static final String SET_ORIENTATION = "android.permission.SET_ORIENTATION";
		public static final String SET_PREFERRED_APPLICATIONS = "android.permission.SET_PREFERRED_APPLICATIONS";
		public static final String SET_PROCESS_FOREGROUND = "android.permission.SET_PROCESS_FOREGROUND";
		public static final String SET_PROCESS_LIMIT = "android.permission.SET_PROCESS_LIMIT";
		public static final String SET_TIME_ZONE = "android.permission.SET_TIME_ZONE";
		public static final String SET_WALLPAPER = "android.permission.SET_WALLPAPER";
		public static final String SET_WALLPAPER_HINTS = "android.permission.SET_WALLPAPER_HINTS";
		public static final String SIGNAL_PERSISTENT_PROCESSES = "android.permission.SIGNAL_PERSISTENT_PROCESSES";
		public static final String STATUS_BAR = "android.permission.STATUS_BAR";
		public static final String SUBSCRIBED_FEEDS_READ = "android.permission.SUBSCRIBED_FEEDS_READ";
		public static final String SUBSCRIBED_FEEDS_WRITE = "android.permission.SUBSCRIBED_FEEDS_WRITE";
		public static final String SYSTEM_ALERT_WINDOW = "android.permission.SYSTEM_ALERT_WINDOW";
		public static final String VIBRATE = "android.permission.VIBRATE";
		public static final String WAKE_LOCK = "android.permission.WAKE_LOCK";
		public static final String WRITE_APN_SETTINGS = "android.permission.WRITE_APN_SETTINGS";
		public static final String WRITE_CALENDAR = "android.permission.WRITE_CALENDAR";
		public static final String WRITE_CONTACTS = "android.permission.WRITE_CONTACTS";
		public static final String WRITE_GSERVICES = "android.permission.WRITE_GSERVICES";
		public static final String WRITE_OWNER_DATA = "android.permission.WRITE_OWNER_DATA";
		public static final String WRITE_SETTINGS = "android.permission.WRITE_SETTINGS";
		public static final String WRITE_SMS = "android.permission.WRITE_SMS";
		public static final String WRITE_SYNC_SETTINGS = "android.permission.WRITE_SYNC_SETTINGS";

		public permission()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public Manifest()
	{
		throw new RuntimeException("Stub!");
	}
}
