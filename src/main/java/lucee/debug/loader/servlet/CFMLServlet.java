package lucee.debug.loader.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public final class CFMLServlet extends LuceeDebugServlet  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 926425768319452110L;

	@Override
    protected void service( HttpServletRequest req, HttpServletResponse rsp ) throws ServletException, IOException {
    	engine.serviceCFML( this, req, rsp );
    }
}