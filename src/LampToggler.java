import java.util.Scanner;

public class LampToggler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // make 5 lamp objects and an empty lamp variable
        Lamp lampe1 = new Lamp("lampe1");
        Lamp lampe2 = new Lamp("lampe2");
        Lamp lampe3 = new Lamp("lampe3");
        Lamp lampe4 = new Lamp("lampe4");
        Lamp lampe5 = new Lamp("lampe5");
        Lamp selectedLamp = null;

        while(true){
            // print all the lamps
            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);
            System.out.println();

            // prompt for which lamp to change state, and set the selectedLamp to that lamp
            System.out.print("Hvilken lampe skal have ændret tilstand?: ");
            switch (input.nextInt()){
                case 1:
                    selectedLamp = lampe1;
                    break;
                case 2:
                    selectedLamp = lampe2;
                    break;
                case 3:
                    selectedLamp = lampe3;
                    break;
                case 4:
                    selectedLamp = lampe4;
                    break;
                case 5:
                    selectedLamp = lampe5;
                    break;
            }
            toggleLamp(selectedLamp);
        }
    }

    // toggles the inputted lamp
    public static void toggleLamp(Lamp obj){
        obj.pushButton();
    }
}
