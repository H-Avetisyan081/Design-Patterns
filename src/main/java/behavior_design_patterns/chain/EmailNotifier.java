package behavior_design_patterns.chain;

public class EmailNotifier extends Notifier{
    @Override
    public void write(String message) {
        System.out.println("Sending email: " +message);
    }

    public EmailNotifier(int priority) {
        super(priority);
    }
}
