// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SearchManager.java

package android.app;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.os.Bundle;

public class SearchManager
	implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener
{
	public static interface OnCancelListener
	{

		public abstract void onCancel();
	}

	public static interface OnDismissListener
	{

		public abstract void onDismiss();
	}


	public static final char MENU_KEY = 115;
	public static final int MENU_KEYCODE = 47;
	public static final String QUERY = "query";
	public static final String APP_DATA = "app_data";
	public static final String ACTION_KEY = "action_key";
	public static final String ACTION_MSG = "action_msg";
	public static final String SUGGEST_URI_PATH_QUERY = "search_suggest_query";
	public static final String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";
	public static final String SUGGEST_COLUMN_FORMAT = "suggest_format";
	public static final String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";
	public static final String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";
	public static final String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";
	public static final String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";
	public static final String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";
	public static final String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";
	public static final String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";
	public static final String SUGGEST_COLUMN_QUERY = "suggest_intent_query";

	SearchManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void startSearch(String initialQuery, boolean selectInitialQuery, ComponentName launchActivity, Bundle appSearchData, boolean globalSearch)
	{
		throw new RuntimeException("Stub!");
	}

	public void stopSearch()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnDismissListener(OnDismissListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCancelListener(OnCancelListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void onDismiss(DialogInterface dialog)
	{
		throw new RuntimeException("Stub!");
	}

	public void onCancel(DialogInterface dialog)
	{
		throw new RuntimeException("Stub!");
	}
}
