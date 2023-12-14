import java.util.*;

public class RoadTrip {
    // Brainstorm
    // List<Passenger> passengers;
    // Set<String> diary;
    // Map<Passenger, List<String>> favoriteFoods;
    private String minivanNickname;

    ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    HashSet<String> diary = new HashSet<String>();
    HashMap<Passenger, ArrayList<String>> favoriteFoods = new HashMap<>();

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < 8) {
            passengers.add(passenger);
            favoriteFoods.put(passenger, new ArrayList<>());
            return true;
        } else {
            System.out.println("Minivan full");
            return false;
        }
    }

    public void displayPassengers() {
        Iterator<Passenger> passengerIterator = passengers.iterator();
        while (passengerIterator.hasNext()) {
            Passenger passenger = passengerIterator.next();
            System.out.println(passenger);
            ArrayList<String> foods = favoriteFoods.get(passenger);
            System.out.println("Favorite foods: " + foods);
        }
    }

    public void addDiaryEntry(String entry) {
        diary.add(entry);
    }

    public void displayDiary() {
        Iterator<String> diaryIterator = diary.iterator();
        while (diaryIterator.hasNext()) {
            String entry = diaryIterator.next();
            System.out.println(entry);
        }
    }

    public boolean addFavoriteFood(Passenger passenger, String food) {
        if (passengers.contains(passenger)) {
            favoriteFoods.get(passenger).add(food);
            return true;
        } else {
            System.out.println("Passenger not found");
            return false;
        }
    }
}
