import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name ="ProductServlet", urlPatterns ="/product_servlet")
public class ProductServlet implements Servlet {

    private transient ServletConfig config;
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
//    private  static Logger logger = (Logger) LoggerFactory.getLogger(ProductServlet.class);


    // Метод вызывается контейнером после того как был создан класс сервдлета
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    // Метод вызывается для каждого нового HTTP  запроса к данному сервлету
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");
        // получаем объект типа BufferedWriter и пишем в него ответ на прошедший запрос
        res.getWriter().println("<h1>My product servlet</h1");
        logger.info("Request close");

    }

    @Override
    public String getServletInfo() {
        return "ProductServlet";
    }

    // При завершении работы веб приложения, контейнер вызывает этот метод для всех сервлетов из этого приложения
    @Override
    public void destroy() {
        logger.info("Destroyed");

    }
}
