package Prak10;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(){
        System.out.println("Создан VictorianChair");
        return new VictorianChair(100);
    }
    public MagicChair createMagicChair(){
        System.out.println("Создан MagicChair");
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair(){
        System.out.println("Создан FunctionalChair");
        return new FunctionalChair();
    }
}
