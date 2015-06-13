// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextAttribute.java

package java.awt.font;

import java.io.InvalidObjectException;
import java.text.AttributedCharacterIterator;

public final class TextAttribute extends java.text.AttributedCharacterIterator.Attribute
{

	public static final TextAttribute BACKGROUND = null;
	public static final TextAttribute BIDI_EMBEDDING = null;
	public static final TextAttribute CHAR_REPLACEMENT = null;
	public static final TextAttribute FAMILY = null;
	public static final TextAttribute FONT = null;
	public static final TextAttribute FOREGROUND = null;
	public static final TextAttribute INPUT_METHOD_HIGHLIGHT = null;
	public static final TextAttribute INPUT_METHOD_UNDERLINE = null;
	public static final TextAttribute JUSTIFICATION = null;
	public static final Float JUSTIFICATION_FULL = null;
	public static final Float JUSTIFICATION_NONE = null;
	public static final TextAttribute NUMERIC_SHAPING = null;
	public static final TextAttribute POSTURE = null;
	public static final Float POSTURE_REGULAR = null;
	public static final Float POSTURE_OBLIQUE = null;
	public static final TextAttribute RUN_DIRECTION = null;
	public static final Boolean RUN_DIRECTION_LTR = null;
	public static final Boolean RUN_DIRECTION_RTL = null;
	public static final TextAttribute SIZE = null;
	public static final TextAttribute STRIKETHROUGH = null;
	public static final Boolean STRIKETHROUGH_ON = null;
	public static final TextAttribute SUPERSCRIPT = null;
	public static final Integer SUPERSCRIPT_SUB = null;
	public static final Integer SUPERSCRIPT_SUPER = null;
	public static final TextAttribute SWAP_COLORS = null;
	public static final Boolean SWAP_COLORS_ON = null;
	public static final TextAttribute TRANSFORM = null;
	public static final TextAttribute UNDERLINE = null;
	public static final Integer UNDERLINE_ON = null;
	public static final Integer UNDERLINE_LOW_ONE_PIXEL = null;
	public static final Integer UNDERLINE_LOW_TWO_PIXEL = null;
	public static final Integer UNDERLINE_LOW_DOTTED = null;
	public static final Integer UNDERLINE_LOW_GRAY = null;
	public static final Integer UNDERLINE_LOW_DASHED = null;
	public static final TextAttribute WEIGHT = null;
	public static final Float WEIGHT_EXTRA_LIGHT = null;
	public static final Float WEIGHT_LIGHT = null;
	public static final Float WEIGHT_DEMILIGHT = null;
	public static final Float WEIGHT_REGULAR = null;
	public static final Float WEIGHT_SEMIBOLD = null;
	public static final Float WEIGHT_MEDIUM = null;
	public static final Float WEIGHT_DEMIBOLD = null;
	public static final Float WEIGHT_BOLD = null;
	public static final Float WEIGHT_HEAVY = null;
	public static final Float WEIGHT_EXTRABOLD = null;
	public static final Float WEIGHT_ULTRABOLD = null;
	public static final TextAttribute WIDTH = null;
	public static final Float WIDTH_CONDENSED = null;
	public static final Float WIDTH_SEMI_CONDENSED = null;
	public static final Float WIDTH_REGULAR = null;
	public static final Float WIDTH_SEMI_EXTENDED = null;
	public static final Float WIDTH_EXTENDED = null;

	protected TextAttribute(String name)
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	protected Object readResolve()
		throws InvalidObjectException
	{
		throw new RuntimeException("Stub!");
	}

}
