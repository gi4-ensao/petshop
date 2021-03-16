<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My cart</div>
        	<div class="feat_prod_box_details">
            
            <table class="cart_table">
            	<tr class="cart_title">
                	<td>Item pic</td>
                	<td>Book name</td>
                    <td>Unit price</td>
                    <td>Qty</td>
                    <td>Total</td>               
                </tr>
                
			
			 <c:forEach var="product" items="${sessionScope.card.getAddedToCardProducts()}" varStatus="loopCounter">
                <tr>
                	<td><a href="details.do?id=${product.getId()}"><img src="${product.getImage()}" height="30px" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${product.getName()}</td>
                    <td>${product.getPrice()}</td>
                    <td>1</td>
                    <td>${product.getPrice()}</td>
                </tr>
			</c:forEach>
                

                <tr>
                <td colspan="4" class="cart_total"><span class="red">TOTAL SHIPPING:</span></td>
                <td> ${card.getShippingPrice() } $</td>                
                </tr>  
                
                <tr>
                <td colspan="4" class="cart_total"><span class="red">TOTAL:</span></td>
                <td> ${card.getTotalPrice()} $</td>                
                </tr>                  
            
            </table>
            <a href="pets.do" class="continue">&lt; continue</a>
            <a href="#" class="checkout">checkout &gt;</a>
            </div>	
        <div class="clear"></div>
        </div><!--end of left content-->