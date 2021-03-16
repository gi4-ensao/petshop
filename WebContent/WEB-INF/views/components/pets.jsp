<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="left_content">
	<div class="crumb_nav">
	<a href="home.do">home</a> &gt;&gt; category name
	</div>
		<div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Category books</div>
           <div class="new_products">
           <c:forEach var="product" items="${produits}" varStatus="loopCounter" >
   			 
   			 <div class="new_prod_box">
                    <a href="details.do?id=${product.getId() }">${product.getName()}</a>
                        <div class="new_prod_bg">
                        <a href="details.do?id=${product.getId()}"><img src="${product.getImage() }" alt="" title="" class="thumb" height="100px"  border="0" /></a>
                        </div>           
                    </div>
			
			</c:forEach>
            </div> 
          
            
        <div class="clear"></div>
        </div>