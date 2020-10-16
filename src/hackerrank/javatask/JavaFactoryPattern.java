package hackerrank.javatask;

import java.security.Permission;
import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {

    @Override
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class FoodFactory {

    public Food getFood(String nameOfFood) {
        if (nameOfFood.equals("cake")) {
            return new Cake();
        } else if (nameOfFood.equals("pizza")) {
            return new Pizza();
        }
        throw new Do_Not_Terminate.ExitTrappedException();
    }
}

class Cake implements Food {

    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

public class JavaFactoryPattern {

    public static void main(String args[]) {
        Do_Not_Terminate.forbidExit();

        try {

            Scanner sc = new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
