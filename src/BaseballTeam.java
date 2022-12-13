import java.util.Objects;

public class BaseballTeam {

        private String city;
        private String mascot;
        private int numberOfPlayers;

    public BaseballTeam(String city, String mascot, int numberOfPlayers) {
        this.city = city;
        this.mascot = mascot;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseballTeam that = (BaseballTeam) o;
        return numberOfPlayers == that.numberOfPlayers && Objects.equals(city, that.city) && Objects.equals(mascot, that.mascot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, mascot, numberOfPlayers);
    }
}
