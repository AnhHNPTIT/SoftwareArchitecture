package ObserverPattern;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;

enum LoginStatus{
    Success, Failure, Invalid, Expired
}

@Data
class User{
    private String email;
    private String ip;
    private LoginStatus status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }
}

public class AccountService implements Subject{
    private User user;
    private List<Observer> observers = new ArrayList<>();
    
    public AccountService(String email, String ip){
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }
    
    @Override
    public void attach(Observer o){
        if(!observers.contains(o)){
            observers.add(o);
        }
    }
    
    @Override
    public void detach(Observer o){
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
    
    @Override
    public void notify(){
        for(Observer o : observers){
            o.update(user);
        }
    }

    
    public void changeStatus(LoginStatus status){
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notify();
    }
    
    public void login(){
        if(!this.isValidIp()){
            user.setStatus(LoginStatus.Invalid);
        }
        else if(this.isValidEmail()){
            user.setStatus(LoginStatus.Success);
        }
        else {
            user.setStatus(LoginStatus.Failure);
        }
        
        System.out.println("Login is handled");
        this.notify();
    }
    
    private boolean isValidIp(){
        return "127.0.0.1".equals(user.getIp());
    }
    
    private boolean isValidEmail(){
        return "anhhn97.ptit@gmail.com".equalsIgnoreCase(user.getEmail());
    }
}

