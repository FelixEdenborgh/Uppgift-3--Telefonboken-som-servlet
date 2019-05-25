
package MyPackage;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HolaAmigos extends HttpServlet{
    DAO dao = new DAO();
    String title;
    String name;
    
    
    public void init() throws ServletException{
        title = "Välkommen till telefonboken";
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        name = request.getParameter("name");
        
        String person = dao.getKompis(name);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>"+ title + "</TITLE></HEAD>");
        if(person != null){
            out.println("<BODY><h1 algin = \"center\">" + person.toString()+ "</H1>" );
        }
        if(this.name.equalsIgnoreCase("")){
            out.println("<OL>");
            for(Kompis k : dao.list()){
                out.println("<li>" + k.getListdata()+ "</li>");
            }
            out.println("</OL>");
            
            
//            for(int i = 0; i<dao.list().size(); i++){
//                out.println("<OL><li>" + i + dao.list() + "</li></OL>");
//            }
//                
        }
        else{
            out.println("<Body><H1 algin = \"center\">" + " The person could not be found" + "</H1>");
            out.println(name);
            out.println(person);
            out.println(dao.myList);
        }
        out.println(this.getServletContext().getServerInfo() + "</BODY></HTML>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }

    
    
}
