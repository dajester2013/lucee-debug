package lucee.debug.loader.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public final class RESTServlet extends LuceeDebugServlet  {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7750893061430337828L;

	@Override
    protected void service( HttpServletRequest req, HttpServletResponse rsp ) throws ServletException, IOException {

        engine.serviceRest( this, req, rsp );
    }
}