<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="left_content">
	<c:if test="${sessionScope.currentUser == null }">
		<div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My account</div>
        <div class="feat_prod_box_details">
            <p class="details">
             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>
	<div class="contact_form">
	<div class="form_subtitle">login into your account</div>
		<form name="register" action="myaccount.do" method="post">          
			<div class="form_row">
				<label class="contact"><strong>Username:</strong></label>
				<input type="text" class="contact_input" name="login" value="${user.userName }"/>
			</div>  
			<div class="form_row">
				<label class="contact"><strong>Password:</strong></label>
				<input type="text" class="contact_input" name="password" />
			</div>                     
			<div class="form_row">
				<div class="terms">
				<input type="checkbox" name="terms" />
					Remember me
				</div>
			</div> 
			<div class="form_row">
				<input type="submit" class="register" value="login" />
			</div>   
		</form>     
	</div>  
 </div>	
   <div class="clear"></div>
	</c:if>
	<c:if test="${sessionScope.currentUser != null}">
		<div>
			<h1>${sessionScope.currentUser.userName }</h1>
			<a href="/PetShopProject/LogoutServlet">logout</a>
		</div>
	</c:if>
	
</div>