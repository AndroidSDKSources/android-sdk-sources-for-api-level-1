// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebSettings.java

package android.webkit;


public class WebSettings
{
	public static final class RenderPriority extends Enum
	{

		public static final RenderPriority HIGH;
		public static final RenderPriority LOW;
		public static final RenderPriority NORMAL;
		private static final RenderPriority $VALUES[];

		public static final RenderPriority[] values()
		{
			return (RenderPriority[])$VALUES.clone();
		}

		public static RenderPriority valueOf(String name)
		{
			return (RenderPriority)Enum.valueOf(android/webkit/WebSettings$RenderPriority, name);
		}

		static 
		{
			HIGH = new RenderPriority("HIGH", 0);
			LOW = new RenderPriority("LOW", 1);
			NORMAL = new RenderPriority("NORMAL", 2);
			$VALUES = (new RenderPriority[] {
				HIGH, LOW, NORMAL
			});
		}

		private RenderPriority(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class TextSize extends Enum
	{

		public static final TextSize LARGER;
		public static final TextSize LARGEST;
		public static final TextSize NORMAL;
		public static final TextSize SMALLER;
		public static final TextSize SMALLEST;
		private static final TextSize $VALUES[];

		public static final TextSize[] values()
		{
			return (TextSize[])$VALUES.clone();
		}

		public static TextSize valueOf(String name)
		{
			return (TextSize)Enum.valueOf(android/webkit/WebSettings$TextSize, name);
		}

		static 
		{
			LARGER = new TextSize("LARGER", 0);
			LARGEST = new TextSize("LARGEST", 1);
			NORMAL = new TextSize("NORMAL", 2);
			SMALLER = new TextSize("SMALLER", 3);
			SMALLEST = new TextSize("SMALLEST", 4);
			$VALUES = (new TextSize[] {
				LARGER, LARGEST, NORMAL, SMALLER, SMALLEST
			});
		}

		private TextSize(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class LayoutAlgorithm extends Enum
	{

		public static final LayoutAlgorithm NARROW_COLUMNS;
		public static final LayoutAlgorithm NORMAL;
		public static final LayoutAlgorithm SINGLE_COLUMN;
		private static final LayoutAlgorithm $VALUES[];

		public static final LayoutAlgorithm[] values()
		{
			return (LayoutAlgorithm[])$VALUES.clone();
		}

		public static LayoutAlgorithm valueOf(String name)
		{
			return (LayoutAlgorithm)Enum.valueOf(android/webkit/WebSettings$LayoutAlgorithm, name);
		}

		static 
		{
			NARROW_COLUMNS = new LayoutAlgorithm("NARROW_COLUMNS", 0);
			NORMAL = new LayoutAlgorithm("NORMAL", 1);
			SINGLE_COLUMN = new LayoutAlgorithm("SINGLE_COLUMN", 2);
			$VALUES = (new LayoutAlgorithm[] {
				NARROW_COLUMNS, NORMAL, SINGLE_COLUMN
			});
		}

		private LayoutAlgorithm(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int LOAD_DEFAULT = -1;
	public static final int LOAD_NORMAL = 0;
	public static final int LOAD_CACHE_ELSE_NETWORK = 1;
	public static final int LOAD_NO_CACHE = 2;
	public static final int LOAD_CACHE_ONLY = 3;

	WebSettings()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNavDump(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getNavDump()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSupportZoom(boolean support)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean supportZoom()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSaveFormData(boolean save)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getSaveFormData()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSavePassword(boolean save)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getSavePassword()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setTextSize(TextSize t)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized TextSize getTextSize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLightTouchEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getLightTouchEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setUseDoubleTree(boolean use)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getUseDoubleTree()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setUserAgent(int ua)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getUserAgent()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setUseWideViewPort(boolean use)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getUseWideViewPort()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSupportMultipleWindows(boolean support)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean supportMultipleWindows()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLayoutAlgorithm(LayoutAlgorithm l)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized LayoutAlgorithm getLayoutAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setStandardFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getStandardFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setFixedFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getFixedFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSansSerifFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getSansSerifFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSerifFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getSerifFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCursiveFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getCursiveFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setFantasyFontFamily(String font)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getFantasyFontFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setMinimumFontSize(int size)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getMinimumFontSize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setMinimumLogicalFontSize(int size)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getMinimumLogicalFontSize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setDefaultFontSize(int size)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getDefaultFontSize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setDefaultFixedFontSize(int size)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getDefaultFixedFontSize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLoadsImagesAutomatically(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getLoadsImagesAutomatically()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setBlockNetworkImage(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getBlockNetworkImage()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setJavaScriptEnabled(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setPluginsEnabled(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setPluginsPath(String pluginsPath)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getJavaScriptEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getPluginsEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getPluginsPath()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getJavaScriptCanOpenWindowsAutomatically()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setDefaultTextEncodingName(String encoding)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String getDefaultTextEncodingName()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNeedInitialFocus(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setRenderPriority(RenderPriority priority)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCacheMode(int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCacheMode()
	{
		throw new RuntimeException("Stub!");
	}
}
