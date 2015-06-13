// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLEngineResult.java

package javax.net.ssl;


public class SSLEngineResult
{
	public static final class Status extends Enum
	{

		public static final Status BUFFER_OVERFLOW;
		public static final Status BUFFER_UNDERFLOW;
		public static final Status CLOSED;
		public static final Status OK;
		private static final Status $VALUES[];

		public static final Status[] values()
		{
			return (Status[])$VALUES.clone();
		}

		public static Status valueOf(String name)
		{
			return (Status)Enum.valueOf(javax/net/ssl/SSLEngineResult$Status, name);
		}

		static 
		{
			BUFFER_OVERFLOW = new Status("BUFFER_OVERFLOW", 0);
			BUFFER_UNDERFLOW = new Status("BUFFER_UNDERFLOW", 1);
			CLOSED = new Status("CLOSED", 2);
			OK = new Status("OK", 3);
			$VALUES = (new Status[] {
				BUFFER_OVERFLOW, BUFFER_UNDERFLOW, CLOSED, OK
			});
		}

		private Status(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class HandshakeStatus extends Enum
	{

		public static final HandshakeStatus FINISHED;
		public static final HandshakeStatus NEED_TASK;
		public static final HandshakeStatus NEED_UNWRAP;
		public static final HandshakeStatus NEED_WRAP;
		public static final HandshakeStatus NOT_HANDSHAKING;
		private static final HandshakeStatus $VALUES[];

		public static final HandshakeStatus[] values()
		{
			return (HandshakeStatus[])$VALUES.clone();
		}

		public static HandshakeStatus valueOf(String name)
		{
			return (HandshakeStatus)Enum.valueOf(javax/net/ssl/SSLEngineResult$HandshakeStatus, name);
		}

		static 
		{
			FINISHED = new HandshakeStatus("FINISHED", 0);
			NEED_TASK = new HandshakeStatus("NEED_TASK", 1);
			NEED_UNWRAP = new HandshakeStatus("NEED_UNWRAP", 2);
			NEED_WRAP = new HandshakeStatus("NEED_WRAP", 3);
			NOT_HANDSHAKING = new HandshakeStatus("NOT_HANDSHAKING", 4);
			$VALUES = (new HandshakeStatus[] {
				FINISHED, NEED_TASK, NEED_UNWRAP, NEED_WRAP, NOT_HANDSHAKING
			});
		}

		private HandshakeStatus(String s, int i)
		{
			super(s, i);
		}
	}


	public SSLEngineResult(Status status, HandshakeStatus handshakeStatus, int bytesConsumed, int bytesProduced)
	{
		throw new RuntimeException("Stub!");
	}

	public final Status getStatus()
	{
		throw new RuntimeException("Stub!");
	}

	public final HandshakeStatus getHandshakeStatus()
	{
		throw new RuntimeException("Stub!");
	}

	public final int bytesConsumed()
	{
		throw new RuntimeException("Stub!");
	}

	public final int bytesProduced()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
