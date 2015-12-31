package lucee.debug.loader.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lucee.loader.engine.CFMLEngine;


public abstract class LuceeDebugServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3132635371670250233L;
	
	protected CFMLEngine engine;

    /** @see javax.servlet.Servlet#init(javax.servlet.ServletConfig) */
    @Override
    public void init( ServletConfig config ) throws ServletException {

        super.init( config );
        engine = CFMLEngineFactoryDummy.getInstance( config );
    }

    /** @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) */
    @Override
    abstract protected void service( HttpServletRequest req, HttpServletResponse rsp ) throws ServletException, IOException;
}
