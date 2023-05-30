package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import modelo.Productos;
import modelo.ProductosDAO;


@WebServlet(name = "ProductosController", urlPatterns = {"/ProductosController"})
public class ProductosController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        ProductosDAO productosDAO=new ProductosDAO();
        String accion;
        RequestDispatcher dispatcher=null;
        
        accion= request.getParameter("accion");
        
        if(accion==null || accion.isEmpty()){
            dispatcher=request.getRequestDispatcher("Productos/pokedex.jsp");
            List<Productos> listaProductos=productosDAO.listarProductos();
            request.setAttribute("lista", listaProductos);
        }
        else if("nuevo".equals(accion)){ 
            dispatcher=request.getRequestDispatcher("Productos/nuevo.jsp");   
        }
        else if("insert".equals(accion)){
            int codigo=Integer.parseInt(request.getParameter("id"));
            String pokemon=request.getParameter("pokemon");
            String tipo1=request.getParameter("tipo1");
            String tipo2=request.getParameter("tipo2");
            String mov1=request.getParameter("mov1");
            String mov2=request.getParameter("mov2");
            String mov3=request.getParameter("mov3");
            String mov4=request.getParameter("mov4");
            Double vgc= Double.parseDouble(request.getParameter("vgc"));
            Double smogon= Double.parseDouble(request.getParameter("smogon"));
            Productos producto=new Productos(codigo, pokemon, tipo1, tipo2, mov1, mov2, mov3, mov4, vgc, smogon);
            productosDAO.insertar(producto);
            dispatcher=request.getRequestDispatcher("Productos/pokedex.jsp");
            List<Productos> listaProductos=productosDAO.listarProductos();
            request.setAttribute("lista", listaProductos);
            
        }
        else{
            dispatcher=request.getRequestDispatcher("Productos/pokedex.jsp");
            List<Productos> listaProductos=productosDAO.listarProductos();
            request.setAttribute("lista", listaProductos);
        }
        
      
        dispatcher.forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
        doGet(request, response);
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
