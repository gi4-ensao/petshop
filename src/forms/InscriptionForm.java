package forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.User;

public class InscriptionForm {
	//gestion des erreurs
		private String result;
		private boolean inscriptionReussite = false;
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
		
		public boolean isInscriptionReussite() {
			return inscriptionReussite;
		}
		
		public void setInscriptionReussite(boolean inscriptionReussite) {
			this.inscriptionReussite = inscriptionReussite;
		}
		
		public User registerUser(HttpServletRequest request){
			
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			String passwordConfirmation = request.getParameter("passwordConfirmation");
			String phone = request.getParameter("phone");
			String company = request.getParameter("company");
			String adress = request.getParameter("adress");
			String email = request.getParameter("email");
			String terms = request.getParameter("terms");
			System.out.println(terms);
			User user = new User();
			

			try {
		        validationEmail( email );
		    } catch ( Exception e ) {
		    	erreurs.put("email", e.getMessage());
		    }
		    user.setEmail( email );
		    
		    try {
		        validationNom( userName );
		    } catch ( Exception e ) {
		    	erreurs.put("userName", e.getMessage());
		    }
			user.setUserName(userName);
		    
		    try {
		    	validationMotsDePasse( password ,passwordConfirmation );
		    } catch ( Exception e ) {
		    	erreurs.put("password", e.getMessage());
		    }
		    user.setPassword(password);
	

		    try {
		    	validationNumeroDeTelephone( phone);
		    } catch ( Exception e ) {
		    	erreurs.put("phone", e.getMessage());
		    }
		    user.setPhone(phone);
		    
			user.setAdress(adress);
			user.setCompany(company);
		    
			if ( erreurs.isEmpty() && terms!=null) {
		        result = "Succès de l'inscription.";
		        inscriptionReussite = true;
		    } else {
		    	result = "Échec de l'inscription.";
		    	inscriptionReussite = false;
		    }    

			return user;
			}


		private void validationEmail( String email ) throws Exception {
		    if ( email != null ) {
		        if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
		            throw new Exception( "Merci de saisir une adresse mail valide." );
		        }
		    } else {
		        throw new Exception( "Merci de saisir une adresse mail." );
		    }
		}

		private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception {
		    if ( motDePasse != null && confirmation != null ) {
		        if ( !motDePasse.equals( confirmation ) ) {
		            throw new Exception( "Les mots de passe entr�s sont diff�rents, merci de les saisir � nouveau." );
		        } else if ( motDePasse.length() < 3 ) {
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
		
		private void validationNumeroDeTelephone(String phoneNumber) throws Exception{
			 if ( phoneNumber != null ) {
			        if ( !phoneNumber.matches( "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$" ) ) {
			            throw new Exception( "Merci de saisir un numero de telephone valide." );
			        }
			    } else {
			        throw new Exception( "Merci de saisir un numero de telephone" );
			    }
		}
}
