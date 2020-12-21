package Prak10;

public class Client {
    Chair chair;
    public void sit(Chair chair){
        String Str = chair.toString();
            System.out.println("Человек сел на стул "+Str);
    }
    public void setChair(Chair chair){
        this.chair=chair;
    }
}
