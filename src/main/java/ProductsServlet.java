import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ProductsServlet", urlPatterns = "/productsServlet")
public class ProductsServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductsServlet.class);

    public ProductsServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String [] product = { "Meta", "Oil", "Bread", "Cottage cheese", "Pasta",
                "Rice", "Eggs", "Flour", "Sugar", "Salt"};

        for (String s : product) {
            resp.getWriter().println(s);
        }


//        Product p1 = new Product("Meta", 200);
//        Product p2 = new Product("Oil", 150);
//        Product p3 = new Product("Bread", 35);
//        Product p4 = new Product("Cottage cheese", 120);
//        Product p5 = new Product("Pasta", 50);
//        Product p6 = new Product("Rice", 90);
//        Product p7 = new Product("Eggs", 60);
//        Product p8 = new Product("Flour", 70);
//        Product p9 = new Product("Sugar", 45);
//        Product p10 = new Product("Salt", 15);


        logger.info(req.getPathInfo());
        logger.info(req.getContextPath());
        logger.info(req.getMethod());
        logger.info(req.getRequestURI());

        resp.getWriter().println();


        resp.getWriter().println(req.getPathInfo() + req.getContextPath() + req.getMethod() + req.getRequestURI());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
