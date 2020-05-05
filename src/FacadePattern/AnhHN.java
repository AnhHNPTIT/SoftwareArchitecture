package FacadePattern;
public class AnhHN{
     public static void main (String[] args) {
         ShopFacade.getInstance().buyProductByCashWithFreeShipping("anhhn97.ptit@gmail.com");
         System.out.println("");
         System.out.println("");
         ShopFacade.getInstance().buyProductByPaypalWithExpressShipping("anhhn97.ptit@gmail.com", "0978.478.178");
     }
 }
