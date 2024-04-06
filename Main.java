import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("**---Welcome to Car Renting Company---**");
        System.out.println("Press 1 for register");
        System.out.println("Press 2 for logIn");
        System.out.println("Press 3 for exist");

        RegisterCustomer registerCustomer = new RegisterCustomer();
        CarRentingSystem carRentingSystem = new CarRentingSystem();

        carRentingSystem.addCar("1", "BMW", "MH 30 T 0435", "petrol", 1000);
        carRentingSystem.addCar("2", "BMW", "TH 34 T 1445", "diesel", 3563);
        carRentingSystem.addCar("3","honda", "MH 70 T 0435", "electrice", 4863);
        carRentingSystem.addCar("4","maruti", "MH 20 T 0435", "petrol",76347);
        carRentingSystem.addCar("5","tata", "MH 20 T 0435", "petrol",7634);
        carRentingSystem.addCar("6","MG", "MH 30 T 0435", "petrol",7266);

        boolean flag = true;
        while(flag) {            
            switch (sc.nextInt()) {
                case 1:
                
                System.out.println("enter email:-");
                String email = sc.next();
                System.out.println("enter password:-");
                String password = sc.next();

                boolean res = registerCustomer.signUp(email, password);
                if(res) {

                     res = carRentingSystem.book(sc, email);

                    if(res)
                    flag = false;
                }


                    break;
                
                case 2:
                System.out.println("enter email:-");
                 email = sc.next();
                System.out.println("enter password:-");
                password = sc.next();

                res = registerCustomer.logIn(email, password);
                if(res) {
                     res = carRentingSystem.book(sc, email);
                    if(res)
                    flag = false;
                }  else {
                    System.out.println("Press 1 for register");
                    System.out.println("Press 2 for retry");
                    System.out.println("Press 3 for exist");
                }
                    break;

               case 3:
               System.out.println("Thank you for visting");
               flag = false;
                   break;
            
                default: System.out.println("Please select valid key");
                    break;
            }
        }
    }
}