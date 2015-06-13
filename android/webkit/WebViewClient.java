// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebViewClient.java

package android.webkit;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;

// Referenced classes of package android.webkit:
//			WebView, HttpAuthHandler

public class WebViewClient
{

	public WebViewClient()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean shouldOverrideUrlLoading(WebView view, String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onPageStarted(WebView view, String url, Bitmap favicon)
	{
		throw new RuntimeException("Stub!");
	}

	public void onPageFinished(WebView view, String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onLoadResource(WebView view, String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFormResubmission(WebView view, Message dontResend, Message resend)
	{
		throw new RuntimeException("Stub!");
	}

	public void doUpdateVisitedHistory(WebView view, String url, boolean isReload)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void onUnhandledKeyEvent(WebView view, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void onScaleChanged(WebView view, float oldScale, float newScale)
	{
		throw new RuntimeException("Stub!");
	}
}
