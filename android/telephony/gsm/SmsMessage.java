// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SmsMessage.java

package android.telephony.gsm;


public class SmsMessage
{
	public static class SubmitPdu
	{

		public byte encodedScAddress[];
		public byte encodedMessage[];

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public SubmitPdu()
		{
			encodedScAddress = null;
			encodedMessage = null;
			throw new RuntimeException("Stub!");
		}
	}

	public static final class MessageClass extends Enum
	{

		public static final MessageClass CLASS_0;
		public static final MessageClass CLASS_1;
		public static final MessageClass CLASS_2;
		public static final MessageClass CLASS_3;
		public static final MessageClass UNKNOWN;
		private static final MessageClass $VALUES[];

		public static final MessageClass[] values()
		{
			return (MessageClass[])$VALUES.clone();
		}

		public static MessageClass valueOf(String name)
		{
			return (MessageClass)Enum.valueOf(android/telephony/gsm/SmsMessage$MessageClass, name);
		}

		static 
		{
			CLASS_0 = new MessageClass("CLASS_0", 0);
			CLASS_1 = new MessageClass("CLASS_1", 1);
			CLASS_2 = new MessageClass("CLASS_2", 2);
			CLASS_3 = new MessageClass("CLASS_3", 3);
			UNKNOWN = new MessageClass("UNKNOWN", 4);
			$VALUES = (new MessageClass[] {
				CLASS_0, CLASS_1, CLASS_2, CLASS_3, UNKNOWN
			});
		}

		private MessageClass(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int ENCODING_UNKNOWN = 0;
	public static final int ENCODING_7BIT = 1;
	public static final int ENCODING_8BIT = 2;
	public static final int ENCODING_16BIT = 3;
	public static final int MAX_USER_DATA_BYTES = 140;
	public static final int MAX_USER_DATA_SEPTETS = 160;
	public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;

	public SmsMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public static SmsMessage createFromPdu(byte pdu[])
	{
		throw new RuntimeException("Stub!");
	}

	public static int getTPLayerLengthForPDU(String pdu)
	{
		throw new RuntimeException("Stub!");
	}

	public static int[] calculateLength(String messageBody, boolean use7bitOnly)
	{
		throw new RuntimeException("Stub!");
	}

	public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, String message, boolean statusReportRequested)
	{
		throw new RuntimeException("Stub!");
	}

	public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, short destinationPort, byte data[], boolean statusReportRequested)
	{
		throw new RuntimeException("Stub!");
	}

	public String getServiceCenterAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public String getOriginatingAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDisplayOriginatingAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessageBody()
	{
		throw new RuntimeException("Stub!");
	}

	public MessageClass getMessageClass()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDisplayMessageBody()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPseudoSubject()
	{
		throw new RuntimeException("Stub!");
	}

	public long getTimestampMillis()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEmail()
	{
		throw new RuntimeException("Stub!");
	}

	public String getEmailBody()
	{
		throw new RuntimeException("Stub!");
	}

	public String getEmailFrom()
	{
		throw new RuntimeException("Stub!");
	}

	public int getProtocolIdentifier()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReplace()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isCphsMwiMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMWIClearMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMWISetMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMwiDontStore()
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getUserData()
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getPdu()
	{
		throw new RuntimeException("Stub!");
	}

	public int getStatusOnSim()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIndexOnSim()
	{
		throw new RuntimeException("Stub!");
	}

	public int getStatus()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStatusReportMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReplyPathPresent()
	{
		throw new RuntimeException("Stub!");
	}
}
