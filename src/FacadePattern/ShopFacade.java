package FacadePattern;
public class ShopFacade{
     private static final ShopFacade INSTANCE = new ShopFacade();

     private AccountService accountService;
     private PaymentService paymentService;
     private ShippingService shippingService;
     private EmailService emailService;
     private SmsService smsService;

     private ShopFacade(){
         accountService = new AccountService();
         paymentService = new PaymentService();
         shippingService = new ShippingService();
         emailService = new EmailService();
         smsService = new SmsService();
     }

     public static ShopFacade getInstance(){
         return INSTANCE;
     }

     public void buyProductByCashWithFreeShipping(String email){
         accountService.getAccount(email);
         paymentService.paymentByCash();
         shippingService.freeShipping();
         emailService.sendEmail(email);
         System.out.println("Done");
     }

     public void buyProductByPaypalWithExpressShipping(String email, String mobile){
         accountService.getAccount(email);
         paymentService.paymentByPaypal();
         shippingService.expressShipping();
         emailService.sendEmail(email);
         smsService.sendSMS(mobile);
         System.out.println("Done");
     }
 }

