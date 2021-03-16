	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Featured pets</div>
        	<c:forEach var="product" items="${products}"  begin="0" end="2" step="1">
        	<div class="feat_prod_box">
            	<div class="prod_img"><a href="details.do?id=${product.getId()}"><img src="${product.getImage()}" height="100px" alt="" title="" border="0" /></a></div>
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">${product.getName()}</div>
                    <p class="details">${product.getDescription()}</p>
                    <a href="details.do?id=${product.getId()}" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>
                    <div class="box_bottom"></div>
                </div>
                  
            <div class="clear"></div>
            </div>	
            </c:forEach>
            
        	
            
            
            
            
            
<!--            <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>New pets</div> 
 -->           
           <!-- <div class="new_products">
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>                    
                    
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>          
            
            </div>  -->
        <div class="clear"></div>
        </div>