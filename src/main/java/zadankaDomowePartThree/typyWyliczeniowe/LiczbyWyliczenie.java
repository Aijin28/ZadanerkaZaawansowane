package zadankaDomowePartThree.typyWyliczeniowe;

public enum LiczbyWyliczenie {
    RAZ, DWA, TRZY, CZTERY;

     void liczbyWypisanie(){
        switch (this){
            case RAZ:
                System.out.println(1);
                break;
            case DWA:
                System.out.println(2);
                break;
            case TRZY:
                System.out.println(3);
                break;
            case CZTERY:
                System.out.println(4);
                break;
            default:
                System.out.println("Błąd");
                break;
        }
    }


}
