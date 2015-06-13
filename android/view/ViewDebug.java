// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewDebug.java

package android.view;

import java.lang.annotation.Annotation;

// Referenced classes of package android.view:
//			View

public class ViewDebug
{
	public static final class RecyclerTraceType extends Enum
	{

		public static final RecyclerTraceType BIND_VIEW;
		public static final RecyclerTraceType MOVE_FROM_ACTIVE_TO_SCRAP_HEAP;
		public static final RecyclerTraceType MOVE_TO_ACTIVE_HEAP;
		public static final RecyclerTraceType MOVE_TO_SCRAP_HEAP;
		public static final RecyclerTraceType NEW_VIEW;
		public static final RecyclerTraceType RECYCLE_FROM_ACTIVE_HEAP;
		public static final RecyclerTraceType RECYCLE_FROM_SCRAP_HEAP;
		private static final RecyclerTraceType $VALUES[];

		public static final RecyclerTraceType[] values()
		{
			return (RecyclerTraceType[])$VALUES.clone();
		}

		public static RecyclerTraceType valueOf(String name)
		{
			return (RecyclerTraceType)Enum.valueOf(android/view/ViewDebug$RecyclerTraceType, name);
		}

		static 
		{
			BIND_VIEW = new RecyclerTraceType("BIND_VIEW", 0);
			MOVE_FROM_ACTIVE_TO_SCRAP_HEAP = new RecyclerTraceType("MOVE_FROM_ACTIVE_TO_SCRAP_HEAP", 1);
			MOVE_TO_ACTIVE_HEAP = new RecyclerTraceType("MOVE_TO_ACTIVE_HEAP", 2);
			MOVE_TO_SCRAP_HEAP = new RecyclerTraceType("MOVE_TO_SCRAP_HEAP", 3);
			NEW_VIEW = new RecyclerTraceType("NEW_VIEW", 4);
			RECYCLE_FROM_ACTIVE_HEAP = new RecyclerTraceType("RECYCLE_FROM_ACTIVE_HEAP", 5);
			RECYCLE_FROM_SCRAP_HEAP = new RecyclerTraceType("RECYCLE_FROM_SCRAP_HEAP", 6);
			$VALUES = (new RecyclerTraceType[] {
				BIND_VIEW, MOVE_FROM_ACTIVE_TO_SCRAP_HEAP, MOVE_TO_ACTIVE_HEAP, MOVE_TO_SCRAP_HEAP, NEW_VIEW, RECYCLE_FROM_ACTIVE_HEAP, RECYCLE_FROM_SCRAP_HEAP
			});
		}

		private RecyclerTraceType(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class HierarchyTraceType extends Enum
	{

		public static final HierarchyTraceType BUILD_CACHE;
		public static final HierarchyTraceType DRAW;
		public static final HierarchyTraceType INVALIDATE;
		public static final HierarchyTraceType INVALIDATE_CHILD;
		public static final HierarchyTraceType INVALIDATE_CHILD_IN_PARENT;
		public static final HierarchyTraceType ON_LAYOUT;
		public static final HierarchyTraceType ON_MEASURE;
		public static final HierarchyTraceType REQUEST_LAYOUT;
		private static final HierarchyTraceType $VALUES[];

		public static final HierarchyTraceType[] values()
		{
			return (HierarchyTraceType[])$VALUES.clone();
		}

		public static HierarchyTraceType valueOf(String name)
		{
			return (HierarchyTraceType)Enum.valueOf(android/view/ViewDebug$HierarchyTraceType, name);
		}

		static 
		{
			BUILD_CACHE = new HierarchyTraceType("BUILD_CACHE", 0);
			DRAW = new HierarchyTraceType("DRAW", 1);
			INVALIDATE = new HierarchyTraceType("INVALIDATE", 2);
			INVALIDATE_CHILD = new HierarchyTraceType("INVALIDATE_CHILD", 3);
			INVALIDATE_CHILD_IN_PARENT = new HierarchyTraceType("INVALIDATE_CHILD_IN_PARENT", 4);
			ON_LAYOUT = new HierarchyTraceType("ON_LAYOUT", 5);
			ON_MEASURE = new HierarchyTraceType("ON_MEASURE", 6);
			REQUEST_LAYOUT = new HierarchyTraceType("REQUEST_LAYOUT", 7);
			$VALUES = (new HierarchyTraceType[] {
				BUILD_CACHE, DRAW, INVALIDATE, INVALIDATE_CHILD, INVALIDATE_CHILD_IN_PARENT, ON_LAYOUT, ON_MEASURE, REQUEST_LAYOUT
			});
		}

		private HierarchyTraceType(String s, int i)
		{
			super(s, i);
		}
	}

	public static interface IntToString
		extends Annotation
	{

		public abstract int from();

		public abstract String to();
	}

	public static interface ExportedProperty
		extends Annotation
	{

		public abstract boolean resolveId();

		public abstract IntToString[] mapping();

		public abstract boolean deepExport();

		public abstract String prefix();
	}


	public static final boolean TRACE_HIERARCHY = false;
	public static final boolean TRACE_RECYCLER = false;

	public ViewDebug()
	{
		throw new RuntimeException("Stub!");
	}

	public static transient void trace(View view, RecyclerTraceType type, int parameters[])
	{
		throw new RuntimeException("Stub!");
	}

	public static void startRecyclerTracing(String prefix, View view)
	{
		throw new RuntimeException("Stub!");
	}

	public static void stopRecyclerTracing()
	{
		throw new RuntimeException("Stub!");
	}

	public static void trace(View view, HierarchyTraceType type)
	{
		throw new RuntimeException("Stub!");
	}

	public static void startHierarchyTracing(String prefix, View view)
	{
		throw new RuntimeException("Stub!");
	}

	public static void stopHierarchyTracing()
	{
		throw new RuntimeException("Stub!");
	}
}
