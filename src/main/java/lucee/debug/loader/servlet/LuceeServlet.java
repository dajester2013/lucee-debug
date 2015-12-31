package lucee.debug.loader.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public final class LuceeServlet extends LuceeDebugServlet  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1425840559194021972L;

	@Override
    protected void service( HttpServletRequest req, HttpServletResponse rsp ) throws ServletException, IOException {
    	engine.service( this, req, rsp );
    }
}