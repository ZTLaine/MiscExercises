public class Main {
    public static void main(String[] args) {
        String[] exampleData = UserService.parseText("ZL,pw,Zack");
        for(String data : exampleData){
            System.out.println(data);
        }
    }
}
