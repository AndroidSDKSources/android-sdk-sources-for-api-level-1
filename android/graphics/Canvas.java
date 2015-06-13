// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Canvas.java

package android.graphics;

import javax.microedition.khronos.opengles.GL;

// Referenced classes of package android.graphics:
//			Region, PorterDuff, Bitmap, RectF, 
//			Paint, Matrix, Rect, Path, 
//			DrawFilter, Picture

public class Canvas
{
	public static final class VertexMode extends Enum
	{

		public static final VertexMode TRIANGLES;
		public static final VertexMode TRIANGLE_FAN;
		public static final VertexMode TRIANGLE_STRIP;
		private static final VertexMode $VALUES[];

		public static final VertexMode[] values()
		{
			return (VertexMode[])$VALUES.clone();
		}

		public static VertexMode valueOf(String name)
		{
			return (VertexMode)Enum.valueOf(android/graphics/Canvas$VertexMode, name);
		}

		static 
		{
			TRIANGLES = new VertexMode("TRIANGLES", 0);
			TRIANGLE_FAN = new VertexMode("TRIANGLE_FAN", 1);
			TRIANGLE_STRIP = new VertexMode("TRIANGLE_STRIP", 2);
			$VALUES = (new VertexMode[] {
				TRIANGLES, TRIANGLE_FAN, TRIANGLE_STRIP
			});
		}

		private VertexMode(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class EdgeType extends Enum
	{

		public static final EdgeType AA;
		public static final EdgeType BW;
		private static final EdgeType $VALUES[];

		public static final EdgeType[] values()
		{
			return (EdgeType[])$VALUES.clone();
		}

		public static EdgeType valueOf(String name)
		{
			return (EdgeType)Enum.valueOf(android/graphics/Canvas$EdgeType, name);
		}

		static 
		{
			AA = new EdgeType("AA", 0);
			BW = new EdgeType("BW", 1);
			$VALUES = (new EdgeType[] {
				AA, BW
			});
		}

		private EdgeType(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int MATRIX_SAVE_FLAG = 1;
	public static final int CLIP_SAVE_FLAG = 2;
	public static final int HAS_ALPHA_LAYER_SAVE_FLAG = 4;
	public static final int FULL_COLOR_LAYER_SAVE_FLAG = 8;
	public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
	public static final int ALL_SAVE_FLAG = 31;

	public Canvas()
	{
		throw new RuntimeException("Stub!");
	}

	public Canvas(Bitmap bitmap)
	{
		throw new RuntimeException("Stub!");
	}

	public Canvas(GL gl)
	{
		throw new RuntimeException("Stub!");
	}

	public GL getGL()
	{
		throw new RuntimeException("Stub!");
	}

	public static native void freeGlCaches();

	public void setBitmap(Bitmap bitmap)
	{
		throw new RuntimeException("Stub!");
	}

	public void setViewport(int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isOpaque();

	public native int getWidth();

	public native int getHeight();

	public native int save();

	public native int save(int i);

	public int saveLayer(RectF bounds, Paint paint, int saveFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public native void restore();

	public native int getSaveCount();

	public native void restoreToCount(int i);

	public native void translate(float f, float f1);

	public native void scale(float f, float f1);

	public final void scale(float sx, float sy, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public native void rotate(float f);

	public final void rotate(float degrees, float px, float py)
	{
		throw new RuntimeException("Stub!");
	}

	public native void skew(float f, float f1);

	public void concat(Matrix matrix)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMatrix(Matrix matrix)
	{
		throw new RuntimeException("Stub!");
	}

	public void getMatrix(Matrix ctm)
	{
		throw new RuntimeException("Stub!");
	}

	public final Matrix getMatrix()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean clipRect(RectF rect, Region.Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean clipRect(Rect rect, Region.Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean clipRect(RectF rectf);

	public native boolean clipRect(Rect rect);

	public boolean clipRect(float left, float top, float right, float bottom, Region.Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean clipRect(float f, float f1, float f2, float f3);

	public native boolean clipRect(int i, int j, int k, int l);

	public boolean clipPath(Path path, Region.Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean clipPath(Path path)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean clipRegion(Region region, Region.Op op)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean clipRegion(Region region)
	{
		throw new RuntimeException("Stub!");
	}

	public DrawFilter getDrawFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawFilter(DrawFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean quickReject(RectF rect, EdgeType type)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean quickReject(Path path, EdgeType type)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean quickReject(float left, float top, float right, float bottom, EdgeType type)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getClipBounds(Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public final Rect getClipBounds()
	{
		throw new RuntimeException("Stub!");
	}

	public void drawRGB(int r, int g, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawARGB(int a, int r, int g, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawColor(int color, PorterDuff.Mode mode)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPaint(Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public native void drawPoints(float af[], int i, int j, Paint paint);

	public void drawPoints(float pts[], Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public native void drawPoint(float f, float f1, Paint paint);

	public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public native void drawLines(float af[], int i, int j, Paint paint);

	public void drawLines(float pts[], Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawRect(RectF rect, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawRect(Rect r, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawRect(float left, float top, float right, float bottom, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawOval(RectF oval, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawCircle(float cx, float cy, float radius, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawRoundRect(RectF rect, float rx, float ry, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPath(Path path, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmap(int colors[], int offset, int stride, int x, int y, int width, int height, 
			boolean hasAlpha, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float verts[], int vertOffset, int colors[], int colorOffset, 
			Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawVertices(VertexMode mode, int vertexCount, float verts[], int vertOffset, float texs[], int texOffset, int colors[], 
			int colorOffset, short indices[], int indexOffset, int indexCount, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawText(char text[], int index, int count, float x, float y, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public native void drawText(String s, float f, float f1, Paint paint);

	public void drawText(String text, int start, int end, float x, float y, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPosText(char text[], int index, int count, float pos[], Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPosText(String text, float pos[], Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawTextOnPath(char text[], int index, int count, Path path, float hOffset, float vOffset, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPicture(Picture picture)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPicture(Picture picture, RectF dst)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawPicture(Picture picture, Rect dst)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
