package TemplatePattern;
public class ContactPage extends PageTemplate {
 
    @Override
    protected void showNavigation() {

    }
 
    @Override
    protected void showBody() {
        System.out.println("Content of contact page");
    }
}