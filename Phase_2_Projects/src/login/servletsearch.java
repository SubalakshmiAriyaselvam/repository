package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletsearch
 */
@WebServlet("/servletsearch")
public class servletsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public servletsearch() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int P_id=Integer.parseInt(request.getParameter("product_id"));
		PrintWriter out=response.getWriter();
		try { 
			response.setContentType("text/html");
			out.println("<html><body>"); 
			
			Connection con=connect.get_connection();
			String query="select * from product where product_id="+P_id+"";
			Statement stmt=con.createStatement();

			out.println("<table border=1 width=50% height=10%>"); 
			out.println("<tr><th>product_id</th><th>product_name</th><th>price</th><th>quantity</th></tr>"); 
			
			
			ResultSet result=stmt.executeQuery(query);
		
			int count=0;

			//Read records from resultset
			while(result.next()) {
				out.println("<tr><td>"+result.getInt("product_id")+"<td>"+result.getString("product_name")+"<td>"+result.getInt("price")+"<td>"+result.getInt("quantity"));		
				count++;
				}
			 	out.println("</table>");  
			 	out.println("</html></body>");  
			 	con.close(); 
			
			if(count==0) 
				out.println("<h1>There is no product in the given Product id</h1>");
				
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
