 <div class="left_content">
<div class="title">
	<span class="title_icon">
		<img src="images/bullet1.gif" alt="" title="" />
	</span>Register ${user.password }
</div>
<div class="feat_prod_box_details">
   <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
	</p>
   <div class="contact_form">
     <div class="form_subtitle">create new account</div>
       <form name="register" action="register.do" method="post">          
          <div class="form_row">
              <label class="contact"><strong>Username:</strong></label>
              <input type="text" class="contact_input" name="userName" value="${user.userName }"/>
               <div class="erreur">
                <span>${form.erreurs["userName"]}</span>
            </div>
           </div>  
           
           <div class="form_row">
           <label class="contact"><strong>Password:</strong></label>
          	<input type="password" class="contact_input" name="password"/>
            <div class="erreur">
                <span>${form.erreurs["password"]}</span>
            </div>
           	</div>          

           <div class="form_row">
           <label class="contact"><strong>Password Confirmation:</strong></label>
          	<input type="password" class="contact_input" name="passwordConfirmation"/>
           	</div>          


           <div class="form_row">
           	<label class="contact"><strong>Email:</strong></label>
           	<input type="text" class="contact_input" name="email" value="${user.email }"/>
           	 <div class="erreur">
                <span>${form.erreurs["email"]}</span>
            </div>
           </div>

           <div class="form_row">
             <label class="contact"><strong>Phone:</strong></label>
             <input type="text" class="contact_input" name="phone" value="${user.phone }"/>
              <div class="erreur">
                <span>${form.erreurs["phone"]}</span>
            </div>
           </div>
                    
			<div class="form_row">
				<label class="contact"><strong>Company:</strong></label>
				<input type="text" class="contact_input" name="company" value="${user.company }"/>
            </div>
                    
			<div class="form_row">
		       <label class="contact"><strong>Adrres:</strong></label>
               <input type="text" class="contact_input" name="adress" value="${user.adress }"/>
			</div>                    

			<div class="form_row">
				<div class="terms">
					<input type="checkbox" name="terms" />
                        I agree to the <a href="#">terms &amp; conditions</a>                        </div>
                    </div> 
			<div class="form_row">
			<input type="submit" class="register" value="register" />
		</div>   
       </form>     
     </div>  
</div>	
 <div class="clear"></div>
</div><!--end of left content-->