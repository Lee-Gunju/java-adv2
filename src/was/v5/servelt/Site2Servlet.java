package was.v5.servelt;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

public class Site2Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response){
        response.writeBody("<h1>site2</h1>");
    }
}
