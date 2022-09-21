package behavior_design_patterns.mediator;

public class SimpleUser implements User {

    Chat chat;
    String name;

    @Override
    public void sendMessage(String message) {

        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {

        System.out.println(this.name + " receiving message: " + message + ".");
    }

    public SimpleUser(Chat chat, String name) {

        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
