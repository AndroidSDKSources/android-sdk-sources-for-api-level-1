// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CallbackProxy.java

package android.webkit;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;

// Referenced classes of package android.webkit:
//			WebView, WebViewClient, WebChromeClient, DownloadListener, 
//			WebBackForwardList, HttpAuthHandler

class CallbackProxy extends Handler
{

	public CallbackProxy(Context context, WebView w)
	{
		throw new RuntimeException("Stub!");
	}

	public void setWebViewClient(WebViewClient client)
	{
		throw new RuntimeException("Stub!");
	}

	public void setWebChromeClient(WebChromeClient client)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDownloadListener(DownloadListener client)
	{
		throw new RuntimeException("Stub!");
	}

	public WebBackForwardList getBackForwardList()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean uiOverrideUrlLoading(String overrideUrl)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean uiOverrideKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void handleMessage(Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	public int getProgress()
	{
		throw new RuntimeException("Stub!");
	}

	public void onPageStarted(String url, Bitmap favicon)
	{
		throw new RuntimeException("Stub!");
	}

	public void onPageFinished(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTooManyRedirects(Message cancelMsg, Message continueMsg)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedError(int errorCode, String description, String failingUrl)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFormResubmission(Message dontResend, Message resend)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean shouldOverrideUrlLoading(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedHttpAuthRequest(HttpAuthHandler handler, String hostName, String realmName)
	{
		throw new RuntimeException("Stub!");
	}

	public void doUpdateVisitedHistory(String url, boolean isReload)
	{
		throw new RuntimeException("Stub!");
	}

	public void onLoadResource(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void onUnhandledKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void onScaleChanged(float oldScale, float newScale)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onSavePassword(String host, String username, String password, Message resumeMsg)
	{
		throw new RuntimeException("Stub!");
	}

	public void onProgressChanged(int newProgress)
	{
		throw new RuntimeException("Stub!");
	}

	public WebView createWindow(boolean dialog, boolean userGesture)
	{
		throw new RuntimeException("Stub!");
	}

	public void onRequestFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCloseWindow(WebView window)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedIcon(Bitmap icon)
	{
		throw new RuntimeException("Stub!");
	}

	public void onReceivedTitle(String title)
	{
		throw new RuntimeException("Stub!");
	}

	public void onJsAlert(String url, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsConfirm(String url, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public String onJsPrompt(String url, String message, String defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onJsBeforeUnload(String url, String message)
	{
		throw new RuntimeException("Stub!");
	}
}
