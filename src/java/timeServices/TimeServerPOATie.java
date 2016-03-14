package timeServices;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TimeServer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 31-Jan-2013 23:03:31
 */

public class TimeServerPOATie
	extends TimeServerPOA
{
	private TimeServerOperations _delegate;

	private POA _poa;
	public TimeServerPOATie(TimeServerOperations delegate)
	{
		_delegate = delegate;
	}
	public TimeServerPOATie(TimeServerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public timeServices.TimeServer _this()
	{
		return timeServices.TimeServerHelper.narrow(_this_object());
	}
	public timeServices.TimeServer _this(org.omg.CORBA.ORB orb)
	{
		return timeServices.TimeServerHelper.narrow(_this_object(orb));
	}
	public TimeServerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TimeServerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public java.lang.String getJavaDateAndTime()
	{
		return _delegate.getJavaDateAndTime();
	}

}
