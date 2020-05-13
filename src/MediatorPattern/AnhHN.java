package MediatorPattern;
public class AnhHN{
    public static void main (String[] args) {
        ChatMediator mediator = new ChatMediatorImp("HNA");
        
        User admin = new UserImp(mediator, "Anh");
        User user1 = new UserImp(mediator, "Hoang");
        User user2 = new UserImp(mediator, "Ngoc");
        
        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        
        admin.send("Hello All");
        user1.send("Hello Admin");
    }
}
