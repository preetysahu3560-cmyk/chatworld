import java.util.ArrayList;
public class ChatService{
private ArrayList<User> users = new ArrayList<>();
private ArrayList<Message> messages = new ArrayList<>();

public void register(String username, String password) {
    users.add(new User(username, password));
    System.out.println("User registered: " + username);
}

public boolean login(String username, String password){
    for (User u : users){
        if (u.getUsername().equals(username) && u.checkPassword(password)){
            System.out.println("Login successful!");
            return true;
        }
    }
    System.out.println("Login failed!");
    return false;
}
public void sendMessage(String from, String to, String content){
    messages.add(new Message(from, to, content));
}
public void showMessage() {
    for (Message m : messages){
        m.display();
    }
}
}
