package ObserverPattern;
public class Protector implements Observer{
    public void update(User user){
        if(user.getStatus() == LoginStatus.Invalid){
            System.out.println("Protector: User " + user.getEmail() + " is invalid. " + "IP " + user.getIp() + " is blocked.");
        }
    }
}

