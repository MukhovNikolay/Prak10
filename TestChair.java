package Prak10;

public class TestChair {
    public static void main(String[] args){
        AbstractChairFactory F1 = new ChairFactory();
        MagicChair MCh1 = F1.createMagicChair();
        VictorianChair VCh1 = F1.createVictorianChair();
        FunctionalChair FCh1 = F1.createFunctionalChair();
    Client C1 = new Client();
    C1.setChair(FCh1);
    MCh1.doMagic();
    System.out.println(FCh1.sum(3,5));
    System.out.println(VCh1.getAge());
    }
}
