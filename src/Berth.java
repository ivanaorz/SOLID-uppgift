import java.util.ArrayList;
import java.util.List;

public class Berth {
    Character[] berths = {'A', 'B', 'C', 'D', 'E'};
    private List<Character> takenBerths;
    private List<Character> vacantBerths;
    private int numberOfBerths = 5;

    public Berth(Character[] berths, List<Character> takenBerths, List<Character> vacantBerths, int numberOfBerths) {
        this.berths = berths;
        this.takenBerths = takenBerths;
        this.vacantBerths = vacantBerths;
        this.numberOfBerths = numberOfBerths;
    }

    public boolean isAvailable() {
        return ==null;
    }

    public boolean park(Vehicle vehicle) {
        for (Berth berth : berths) {
            if (berth.park(vehicle)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}
