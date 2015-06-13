// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextWatcher.java

package android.text;


// Referenced classes of package android.text:
//			Editable

public interface TextWatcher
{

	public abstract void beforeTextChanged(CharSequence charsequence, int i, int j, int k);

	public abstract void onTextChanged(CharSequence charsequence, int i, int j, int k);

	public abstract void afterTextChanged(Editable editable);
}
