package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.IProductDao;
import dao.IProductDaoImpl;
import dao.IUserDaoImpl;
import forms.InscriptionForm;
import forms.JavaMail;
import forms.LoginForm;
import beans.Card;
import beans.Product;
import beans.User;

public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IUserDaoImpl userDaoImpl;
    public IProductDaoImpl productDaoImpl;
    
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(){
    	userDaoImpl = new IUserDaoImpl();
    	productDaoImpl = new IProductDaoImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		
		if(path.equals("/home.do")){
			List<Product> listeDeProduits = productDaoImpl.listeDeproduits();
			request.setAttribute("products", listeDeProduits);			
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/home.jsp").forward(request, response);;
			
		
		}else if(path.equals("/about.do")){
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/aboutUs.jsp").forward(request, response);;

		
		}else if(path.equals("/category.do")){
			List<Product> listeDeProduits = productDaoImpl.listeDeproduits();
			request.setAttribute("produits", listeDeProduits);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/pets.jsp").forward(request, response);;

		
		}else if(path.equals("/myaccount.do")){
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/myAccount.jsp").forward(request, response);;


		}else if(path.equals("/register.do")){
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/register.jsp").forward(request, response);
			
		}else if(path.equals("/details.do")){
			int id = Integer.parseInt(request.getParameter("id"));
			Product produit = productDaoImpl.getProductByID(id);
			request.setAttribute("produit", produit);
			request.setAttribute("id", id);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/prices.jsp").forward(request, response);;

		}else if(path.equals("/addProduct.do")){
			if(request.getParameter("id") != null){
				int id = Integer.parseInt(request.getParameter("id"));
				Product produit = productDaoImpl.getProductByID(id);
				Card card;
				List<Product> produits;
				HttpSession session = request.getSession();
				if(session.getAttribute("card") == null){
					card = new Card();
					produits = new ArrayList<Product>();
					
					}
				else{
					card = (Card) session.getAttribute("card");
					produits = card.getAddedToCardProducts();
				}
				
					produits.add(produit);
					card.setAddedToCardProducts(produits);
					int totalPrice = 0;
					for(Product p : produits){
						totalPrice += p.getPrice();
					}
					card.setTotalPrice(totalPrice);
					
					if(produits.isEmpty()){
						card.setShippingPrice(0);
					}else{
						card.setShippingPrice(10);
					}
					
					session.setAttribute("card", card);
			}
			response.sendRedirect("/PetShopProject/card.do");

		}else if(path.equals("/contact.do")){
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/contact.jsp").forward(request, response);;


		}else if(path.equals("/card.do")){
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/card.jsp").forward(request, response);
		
		}else if(path.equals("/specialPets.do")){
			List<Product> listeDeProduits = productDaoImpl.listeDeproduits();
			request.setAttribute("products", listeDeProduits);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/specialPets.jsp").forward(request,response);

		}else{
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/home.jsp").forward(request,response);
	}}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();

		if(path.equals("/register.do")){
			InscriptionForm form = new InscriptionForm();
			User user = form.registerUser(request);
			
			request.setAttribute("form", form);
			request.setAttribute("user", user);
			if(form.isInscriptionReussite()){
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/home.jsp").forward(request, response);
				userDaoImpl.save(user);
				userDaoImpl.login(user);
			}else{
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/register.jsp").forward(request, response);
				
			}
		}else if(path.equals("/myaccount.do")){
			
			LoginForm form = new LoginForm();
			User user = form.loginUser(request);
			request.setAttribute("user", user);
			request.setAttribute("form", form);
			HttpSession lastSession = request.getSession();
			lastSession.invalidate();
			HttpSession session = request.getSession();
			if(userDaoImpl.login(user)){
				User currentUser = userDaoImpl.getUserWithUserName(user.getUserName());
				session.setAttribute("currentUser", currentUser);
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/home.jsp").forward(request, response);;
		}else if(path.equals("/contact.do")){
			if (request.getParameter("submit") != null) {

				String emailSubject = "Contact Form sent from PetShop";
				String emailBody = "";
				if (request.getParameter("name") != null) {
					emailBody = "Sender Name: " + request.getParameter("name") + "<br>";

				}
				if (request.getParameter("email") != null) {
					emailBody = emailBody + "Sender Email: " + request.getParameter("email") + "<br>";
				}
				if (request.getParameter("phone") != null) {
					emailBody = emailBody + "Sender Phone: " + request.getParameter("phone") + "<br>";
				}
				if (request.getParameter("company") != null) {
					emailBody = emailBody + "Sender Company: " + request.getParameter("company") + "<br>";
				}
				if (request.getParameter("message") != null) {
					emailBody = emailBody + "Message: " + request.getParameter("message") + "<br>";
				}
				JavaMail.send(emailSubject, emailBody);
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/home.jsp").forward(request,
						response);

		}else{
		}
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/pages/myAccount.jsp").forward(request, response);;
			}
		}
	}
	
}
