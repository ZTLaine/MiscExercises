public class UserService {
    public static User createUser(String[] userData) {
        return new User(userData[0], userData[1], userData[2]);
    }

    public static String[] parseText(String input){
        return input.split(",");
    }
}
