public class Main {



    public static void main(String[] args) {
        Burger burger = new Burger(2,true,false,true,true,9.99,"Hamburger Bun","American");
        burger.addburgerCustomization("Pepper Jack",1.00);
        burger.addburgerCustomization_2("Fried Egg",.85);
        burger.addburgerCustomization_3("Beyond Meat",1.86);
        System.out.println("Total Price of burger after add ons: " + burger.Calculate_Burger());
        System.out.println("**********************************************************");
        BreakfastBurger breakfastburger = new BreakfastBurger(1,false,true,false,false,13.99,"Brioche Bun", "Cheddar Cheese", "Scrambled egg","Grape Jelly");
        breakfastburger.addburgerCustomization("Strawberry Jam",.50);
        breakfastburger.addburgerCustomization_2("Fried Egg",.85);
        breakfastburger.addburgerCustomization_3("Beyond Meat",1.86);
        System.out.println("Total Price of burger after add ons: " + breakfastburger.Calculate_Burger());

    }


}
