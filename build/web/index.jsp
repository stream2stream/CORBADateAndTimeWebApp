<%-- 
    Document   : index
    Created on : 01-Feb-2013, 19:08:26
    Author     : Selvyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="simplecorbatimeclient.*"%>
<%@page import="timeServices.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%
        Object obj = pageContext.getServletContext().getInitParameter("corba_ns_loc");

        if( obj != null)
        {
            String argv = obj.toString();
            String[] args = {argv};

            SimpleCORBATimeClient client = new SimpleCORBATimeClient( args );

            TimeServer ts = TimeServerHelper.narrow( client.getService("TimeService") );

            if( ts == null )
                out.println("Can't bind to the Time Service");
            else
                out.println( ts.getJavaDateAndTime() );
        }else
            out.println("CONTEXT PARAM NOT FOUND");
        %>
    </body>
</html>
