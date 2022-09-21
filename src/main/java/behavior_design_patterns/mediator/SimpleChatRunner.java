package behavior_design_patterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"User1");
        User user2 = new SimpleUser(chat,"User2");

        chat.setAdmin(admin);
        chat.adduserToChat(user1);
        chat.adduserToChat(user2);

        user2.sendMessage("Hello I'm User2 !!!");
    }
}
