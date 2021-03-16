package forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.User;

public class LoginForm {
	//gestion des erreurs
		private String result;
		private boolean loginSucess = false;
		private Map<String,String> erreurs = new HashMap<String,String>();
			
		//getters and setters
		public String getResult() {
			return result;
		}
		
		public void setResult(String result) {
			this.result = result;
		}
		
		public Map<String, String> getErreurs() {
			return erreurs;
		}
		
		public void setErreurs(Map<String, String> erreurs) {
			this.erreurs = erreurs;
		}
			
		public boolean isLoginSucess() {
			return loginSucess;
		}

		public void setLoginSucess(boolean loginSucess) {
			this.loginSucess = loginSucess;
		}

		public User loginUser(HttpServletRequest request){
				
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			User user = new User();

			try {
				validationNom( login );
			} catch ( Exception e ) {
			    erreurs.put("userName", e.getMessage());
			}
			user.setUserName(login);
			    
			try {
			    	validationMotsDePasse( password );
			    } catch ( Exception e ) {
			    	erreurs.put("password", e.getMessage());
			    }
			    user.setPassword(password);
		

			    
				if ( erreurs.isEmpty()) {
			        result = "Succès de l'inscription.";
			        loginSucess = true;
			    } else {
			    	result = "Échec de l'inscription.";
			    	loginSucess = false;
			    }    

				return user;
				}

		private void validationMotsDePasse( String motDePasse) throws Exception {
			    if ( motDePasse != null) {
			        if ( motDePasse.length() < 3 ) {
			            throw new Exception( "Les mots de passe doivent contenir au moins 3 caract�res." );
			        }
			    } else {
			        throw new Exception( "Merci de saisir et confirmer votre mot de passe." );
			    }
			}

		private void validationNom( String nom ) throws Exception {
			    if ( nom != null && nom.length() < 3 ) {
			        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caract�res." );
			    }
			}
			
			
}

