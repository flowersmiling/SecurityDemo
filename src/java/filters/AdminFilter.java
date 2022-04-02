package filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Role;
import services.AccountService;

/**
 *
 * @author Administrator
 */
public class AdminFilter implements Filter {
    
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        // code that is executed before the servlet
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        HttpSession session = httpRequest.getSession();
        
        String email = (String)session.getAttribute("email");
        AccountService as = new AccountService();
        Role role = as.getRole(email);
        
        //check if the user is an admin or not;
        if( email != null && role.getRoleId() != 1 ){
           httpResponse.sendRedirect("notes");
           return;
        }
        
        // execute the servlet which mapping to (AdminServlet)
        chain.doFilter(request, response);
        
        // code that is executed after the servlet
    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {        
    }

    /**
     * Init method for this filter
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {        
        
    }
}
