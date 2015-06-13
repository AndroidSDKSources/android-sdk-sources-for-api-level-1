// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebView.java

package android.webkit;

import android.content.Context;
import android.graphics.*;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.*;
import android.widget.AbsoluteLayout;

// Referenced classes of package android.webkit:
//			WebBackForwardList, WebViewClient, DownloadListener, WebChromeClient, 
//			WebSettings, PluginList

public class WebView extends AbsoluteLayout
	implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.ViewGroup.OnHierarchyChangeListener
{
	public class HitTestResult
	{

		public static final int UNKNOWN_TYPE = 0;
		public static final int ANCHOR_TYPE = 1;
		public static final int PHONE_TYPE = 2;
		public static final int GEO_TYPE = 3;
		public static final int EMAIL_TYPE = 4;
		public static final int IMAGE_TYPE = 5;
		public static final int IMAGE_ANCHOR_TYPE = 6;
		public static final int SRC_ANCHOR_TYPE = 7;
		public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
		public static final int EDIT_TEXT_TYPE = 9;
		final WebView this$0;

		public int getType()
		{
			throw new RuntimeException("Stub!");
		}

		public String getExtra()
		{
			throw new RuntimeException("Stub!");
		}

		HitTestResult()
		{
			this$0 = WebView.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public static interface PictureListener
	{

		public abstract void onNewPicture(WebView webview, Picture picture);
	}

	public class WebViewTransport
	{

		final WebView this$0;

		public synchronized void setWebView(WebView webview)
		{
			throw new RuntimeException("Stub!");
		}

		public synchronized WebView getWebView()
		{
			throw new RuntimeException("Stub!");
		}

		public WebViewTransport()
		{
			this$0 = WebView.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public static final String SCHEME_TEL = "tel:";
	public static final String SCHEME_MAILTO = "mailto:";
	public static final String SCHEME_GEO = "geo:0,0?q=";

	public WebView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public WebView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public WebView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setScrollBarStyle(int style)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontalScrollbarOverlay(boolean overlay)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVerticalScrollbarOverlay(boolean overlay)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean overlayHorizontalScrollbar()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean overlayVerticalScrollbar()
	{
		throw new RuntimeException("Stub!");
	}

	public SslCertificate getCertificate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertificate(SslCertificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public void savePassword(String host, String username, String password)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHttpAuthUsernamePassword(String host, String realm, String username, String password)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getHttpAuthUsernamePassword(String host, String realm)
	{
		throw new RuntimeException("Stub!");
	}

	public void destroy()
	{
		throw new RuntimeException("Stub!");
	}

	public static void enablePlatformNotifications()
	{
		throw new RuntimeException("Stub!");
	}

	public static void disablePlatformNotifications()
	{
		throw new RuntimeException("Stub!");
	}

	public WebBackForwardList saveState(Bundle outState)
	{
		throw new RuntimeException("Stub!");
	}

	public WebBackForwardList restoreState(Bundle inState)
	{
		throw new RuntimeException("Stub!");
	}

	public void loadUrl(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void loadData(String data, String mimeType, String encoding)
	{
		throw new RuntimeException("Stub!");
	}

	public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String failUrl)
	{
		throw new RuntimeException("Stub!");
	}

	public void stopLoading()
	{
		throw new RuntimeException("Stub!");
	}

	public void reload()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canGoBack()
	{
		throw new RuntimeException("Stub!");
	}

	public void goBack()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canGoForward()
	{
		throw new RuntimeException("Stub!");
	}

	public void goForward()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canGoBackOrForward(int steps)
	{
		throw new RuntimeException("Stub!");
	}

	public void goBackOrForward(int steps)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean pageUp(boolean top)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean pageDown(boolean bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearView()
	{
		throw new RuntimeException("Stub!");
	}

	public Picture capturePicture()
	{
		throw new RuntimeException("Stub!");
	}

	public float getScale()
	{
		throw new RuntimeException("Stub!");
	}

	public void setInitialScale(int scaleInPercent)
	{
		throw new RuntimeException("Stub!");
	}

	public void invokeZoomPicker()
	{
		throw new RuntimeException("Stub!");
	}

	public HitTestResult getHitTestResult()
	{
		throw new RuntimeException("Stub!");
	}

	public void requestFocusNodeHref(Message hrefMsg)
	{
		throw new RuntimeException("Stub!");
	}

	public void requestImageRef(Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeHorizontalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUrl()
	{
		throw new RuntimeException("Stub!");
	}

	public String getTitle()
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap getFavicon()
	{
		throw new RuntimeException("Stub!");
	}

	public int getProgress()
	{
		throw new RuntimeException("Stub!");
	}

	public int getContentHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public void pauseTimers()
	{
		throw new RuntimeException("Stub!");
	}

	public void resumeTimers()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearCache(boolean includeDiskFiles)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearFormData()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearHistory()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearSslPreferences()
	{
		throw new RuntimeException("Stub!");
	}

	public WebBackForwardList copyBackForwardList()
	{
		throw new RuntimeException("Stub!");
	}

	public static String findAddress(String addr)
	{
		throw new RuntimeException("Stub!");
	}

	public void documentHasImages(Message response)
	{
		throw new RuntimeException("Stub!");
	}

	public void computeScroll()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWebViewClient(WebViewClient client)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDownloadListener(DownloadListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setWebChromeClient(WebChromeClient client)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPictureListener(PictureListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void addJavascriptInterface(Object obj, String interfaceName)
	{
		throw new RuntimeException("Stub!");
	}

	public WebSettings getSettings()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized PluginList getPluginList()
	{
		throw new RuntimeException("Stub!");
	}

	public void refreshPlugins(boolean reloadOpenPages)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLayoutParams(android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performLongClick()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAttachedToWindow()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDetachedFromWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public void onChildViewAdded(View parent, View child)
	{
		throw new RuntimeException("Stub!");
	}

	public void onChildViewRemoved(View p, View child)
	{
		throw new RuntimeException("Stub!");
	}

	public void onGlobalFocusChanged(View oldFocus, View newFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasWindowFocus)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSizeChanged(int w, int h, int ow, int oh)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onScrollChanged(int l, int t, int oldl, int oldt)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMapTrackballToArrowKeys(boolean setMap)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public void flingScroll(int vx, int vy)
	{
		throw new RuntimeException("Stub!");
	}

	public View getZoomControls()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean zoomIn()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean zoomOut()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestFocus(int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate)
	{
		throw new RuntimeException("Stub!");
	}

	public void setBackgroundColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void debugDump()
	{
		throw new RuntimeException("Stub!");
	}
}
