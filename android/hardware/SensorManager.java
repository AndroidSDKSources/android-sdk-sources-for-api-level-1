// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SensorManager.java

package android.hardware;


// Referenced classes of package android.hardware:
//			SensorListener

public class SensorManager
{

	public static final int SENSOR_ORIENTATION = 1;
	public static final int SENSOR_ACCELEROMETER = 2;
	public static final int SENSOR_TEMPERATURE = 4;
	public static final int SENSOR_MAGNETIC_FIELD = 8;
	public static final int SENSOR_LIGHT = 16;
	public static final int SENSOR_PROXIMITY = 32;
	public static final int SENSOR_TRICORDER = 64;
	public static final int SENSOR_ORIENTATION_RAW = 128;
	public static final int SENSOR_ALL = 127;
	public static final int SENSOR_MIN = 1;
	public static final int SENSOR_MAX = 64;
	public static final int DATA_X = 0;
	public static final int DATA_Y = 1;
	public static final int DATA_Z = 2;
	public static final int RAW_DATA_INDEX = 3;
	public static final int RAW_DATA_X = 3;
	public static final int RAW_DATA_Y = 4;
	public static final int RAW_DATA_Z = 5;
	public static final float STANDARD_GRAVITY = 9.80665F;
	public static final float GRAVITY_SUN = 275F;
	public static final float GRAVITY_MERCURY = 3.7F;
	public static final float GRAVITY_VENUS = 8.87F;
	public static final float GRAVITY_EARTH = 9.80665F;
	public static final float GRAVITY_MOON = 1.6F;
	public static final float GRAVITY_MARS = 3.71F;
	public static final float GRAVITY_JUPITER = 23.12F;
	public static final float GRAVITY_SATURN = 8.96F;
	public static final float GRAVITY_URANUS = 8.69F;
	public static final float GRAVITY_NEPTUN = 11F;
	public static final float GRAVITY_PLUTO = 0.6F;
	public static final float GRAVITY_DEATH_STAR_I = 3.530361E-007F;
	public static final float GRAVITY_THE_ISLAND = 4.815162F;
	public static final float MAGNETIC_FIELD_EARTH_MAX = 60F;
	public static final float MAGNETIC_FIELD_EARTH_MIN = 30F;
	public static final float LIGHT_SUNLIGHT_MAX = 120000F;
	public static final float LIGHT_SUNLIGHT = 110000F;
	public static final float LIGHT_SHADE = 20000F;
	public static final float LIGHT_OVERCAST = 10000F;
	public static final float LIGHT_SUNRISE = 400F;
	public static final float LIGHT_CLOUDY = 100F;
	public static final float LIGHT_FULLMOON = 0.25F;
	public static final float LIGHT_NO_MOON = 0.001F;
	public static final int SENSOR_DELAY_FASTEST = 0;
	public static final int SENSOR_DELAY_GAME = 1;
	public static final int SENSOR_DELAY_UI = 2;
	public static final int SENSOR_DELAY_NORMAL = 3;
	public static final int SENSOR_STATUS_UNRELIABLE = 0;
	public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
	public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
	public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;

	SensorManager()
	{
		throw new RuntimeException("Stub!");
	}

	public int getSensors()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean registerListener(SensorListener listener, int sensors)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean registerListener(SensorListener listener, int sensors, int rate)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterListener(SensorListener listener, int sensors)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterListener(SensorListener listener)
	{
		throw new RuntimeException("Stub!");
	}
}
