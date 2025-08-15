import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ChatService chatService = new ChatService();

        chatService.register("alice", "1234");
        chatService.register("bob", "abcd");

        System.out.println("Enter username:");
        String username = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();
        if (chatService.login(username, password)){
            System.out.println("Type a message to send to 'bob':");
            String msg = sc.nextLine();

            chatService.sendMessage(username, "bob", msg);
        }
        System.out.println("Chat History:");
        chatService.showMessage();
    }
}