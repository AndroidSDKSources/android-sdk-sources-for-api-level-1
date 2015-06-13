// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CrossProcessCursor.java

package android.database;


// Referenced classes of package android.database:
//			Cursor, CursorWindow

public interface CrossProcessCursor
	extends Cursor
{

	public abstract CursorWindow getWindow();

	public abstract void fillWindow(int i, CursorWindow cursorwindow);

	public abstract boolean onMove(int i, int j);
}
