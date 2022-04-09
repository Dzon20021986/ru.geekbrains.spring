import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name ="ProductServlet", urlPatterns ="/product_servlet")
public class ProductServlet implements Servlet {

    private transient ServletConfig config;
    private  static Logger logger = (Logger) LoggerFactory.getLogger(ProductServlet.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");
        res.getWriter().println("<h1>My product servlet</h1>");
        logger.info("Request close");
    }

    @Override
    public String getServletInfo() {
        return "ProductServlet";
    }

    @Override
    public void destroy() {
        logger.info("Destroyed");

    }
}
