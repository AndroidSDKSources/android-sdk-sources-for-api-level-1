// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebChromeClient.java

package android.webkit;

import android.graphics.Bitmap;
import android.os.Message;

// Referenced classes of package android.webkit:
//			WebView, JsResult, JsPromptResult

public class WebChromeClient
{

	public WebChromeClient()
	{
		throw new RuntimeException("Stub!");
	}

	public void onProgressChanged(WebView view, int newProgress)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedTitle(WebView view, String title)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedIcon(WebView view, Bitmap icon)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onCreateWindow(WebView view, boolean dialog, boolean userGesture, Message resultMsg)
	{
		throw new RuntimeException("Stub!");
	}

	public void onRequestFocus(WebView view)
	{
		throw new RuntimeException("Stub!");
	}

	public void onCloseWindow(WebView window)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsAlert(WebView view, String url, String message, JsResult result)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsConfirm(WebView view, String url, String message, JsResult result)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result)
	{
		throw new RuntimeException("Stub!");
	}
}
