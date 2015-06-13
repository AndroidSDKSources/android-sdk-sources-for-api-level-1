// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ToneGenerator.java

package android.media;


public class ToneGenerator
{

	public static final int TONE_DTMF_0 = 0;
	public static final int TONE_DTMF_1 = 1;
	public static final int TONE_DTMF_2 = 2;
	public static final int TONE_DTMF_3 = 3;
	public static final int TONE_DTMF_4 = 4;
	public static final int TONE_DTMF_5 = 5;
	public static final int TONE_DTMF_6 = 6;
	public static final int TONE_DTMF_7 = 7;
	public static final int TONE_DTMF_8 = 8;
	public static final int TONE_DTMF_9 = 9;
	public static final int TONE_DTMF_S = 10;
	public static final int TONE_DTMF_P = 11;
	public static final int TONE_DTMF_A = 12;
	public static final int TONE_DTMF_B = 13;
	public static final int TONE_DTMF_C = 14;
	public static final int TONE_DTMF_D = 15;
	public static final int TONE_SUP_DIAL = 16;
	public static final int TONE_SUP_BUSY = 17;
	public static final int TONE_SUP_CONGESTION = 18;
	public static final int TONE_SUP_RADIO_ACK = 19;
	public static final int TONE_SUP_RADIO_NOTAVAIL = 20;
	public static final int TONE_SUP_ERROR = 21;
	public static final int TONE_SUP_CALL_WAITING = 22;
	public static final int TONE_SUP_RINGTONE = 23;
	public static final int TONE_PROP_BEEP = 24;
	public static final int TONE_PROP_ACK = 25;
	public static final int TONE_PROP_NACK = 26;
	public static final int TONE_PROP_PROMPT = 27;
	public static final int TONE_PROP_BEEP2 = 28;
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;

	public ToneGenerator(int streamType, int volume)
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean startTone(int i);

	public native void stopTone();

	public native void release();

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
