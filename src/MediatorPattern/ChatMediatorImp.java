package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator{
    private List<User> users = new ArrayList<>();
    
    public ChatMediatorImp(String groupName){
        System.out.println(groupName + " group already created");
    }
    
    @Override
    public void addUser(User user){
        System.out.println(user.name + " joined this group");
        this.users.add(user);
    }
    
    @Override
    public void sendMessage(String msg, User user){
        for(User u : this.users){
            if(!u.equals(user)){
                u.receive(msg);
            }
        }
    }
}
