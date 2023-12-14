import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        RoadTrip roadTrip = new RoadTrip();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minivan nickname: ");
        String minivanNickname = scanner.nextLine();

        roadTrip.addDiaryEntry("We climbed a mountain and the saw the beautiful landscape of Yellowstone.");
        roadTrip.addDiaryEntry("We had a picnic, there were a lot of trees.");
        roadTrip.addDiaryEntry("We hunted for deer.");

        boolean passengerQuit = true;

        while (passengerQuit) {
            System.out.println("Enter the passengers first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter the passengers last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter the passengers phone number: ");
            String phoneNumber = scanner.nextLine();

            Passenger passenger = new Passenger(firstName, lastName, phoneNumber);
            roadTrip.addPassenger(passenger);

            boolean favoriteFoodsQuit = true;

            while (favoriteFoodsQuit) {
                System.out.println("Enter passenger's favorite food or typr 'quit' to exit: ");
                String favFood = scanner.nextLine();
                if (!favFood.equals("quit")) {
                    roadTrip.addFavoriteFood(passenger, favFood);
                } else {
                    favoriteFoodsQuit = false;
                }
            }

            System.out.println("Type 'quit' to exit if you want to add another passenger: ");
            if (scanner.nextLine().equals("quit")) {
                passengerQuit = false;
            }
        }

        roadTrip.displayPassengers();
        roadTrip.displayDiary();
    }
}
