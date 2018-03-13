package jettyproject_issue2315;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String xyz = request.getParameter("xyz");
			String header = request.getHeader("Content-Type");
			
			Collection<Part> parts = request.getParts();
			System.out.println(parts);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
