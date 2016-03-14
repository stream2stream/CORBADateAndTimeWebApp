package timeServices;

/**
 * Generated from IDL interface "TimeServer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 31-Jan-2013 23:03:31
 */

public final class TimeServerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TimeServer value;
	public TimeServerHolder()
	{
	}
	public TimeServerHolder (final TimeServer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TimeServerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeServerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TimeServerHelper.write (_out,value);
	}
}
