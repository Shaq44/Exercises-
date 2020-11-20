 public class CatsMeow {
//   This is just experimental 

public static boolean shouldWakeUp(boolean Meow, int hourOfDay){

        if (Meow && hourOfDay < 0){
            System.out.println("False");

        } else if (Meow && hourOfDay > 23) {
            System.out.println("False");
        } else if ( Meow && hourOfDay >= 0){
            System.out.println("true");
        } else if (Meow && hourOfDay >= 23){
            System.out.println("True");

        }
        return false;


    }
 }
