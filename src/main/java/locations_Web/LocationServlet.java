package locations_Web;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/locations")
public class LocationServlet extends HttpServlet
{
    @Inject
    private LocationBean locBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        List<Location> locationList = locBean.listLocations();
        req.setAttribute("locations",locationList);
        req.getRequestDispatcher("/WEB-INF/jsp/locations.jsp").forward(req,resp);
    }


}
