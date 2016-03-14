package timeServices;


/**
 * Generated from IDL interface "TimeServer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 31-Jan-2013 23:03:31
 */

public abstract class TimeServerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, timeServices.TimeServerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getJavaDateAndTime", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:timeServices/TimeServer:1.0"};
	public timeServices.TimeServer _this()
	{
		return timeServices.TimeServerHelper.narrow(_this_object());
	}
	public timeServices.TimeServer _this(org.omg.CORBA.ORB orb)
	{
		return timeServices.TimeServerHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getJavaDateAndTime
			{
				_out = handler.createReply();
				_out.write_string(getJavaDateAndTime());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
