package behavior_design_patterns.state.template_method;

public class WelcomePage extends WebsiteTemplate{
    public void  showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
