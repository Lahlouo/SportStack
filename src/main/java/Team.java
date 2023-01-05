import java.util.ArrayList;

public class Team {
    private String abreviation;
    private String city;
    private String conference;
    private String division;
    private String full_name;
    private int id;
    private String name;

    private ArrayList<Player> players;
    private ArrayList<Game> schedule;

    public void addPlayer(Player p){
        players.add(p);
    }
    public void removePlayer(Player p){
        players.remove(p);
    }

    public String getAbreviation() {
        return abreviation;
    }

    public String getCity() {
        return city;
    }

    public String getConference() {
        return conference;
    }

    public String getDivision() {
        return division;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Game> getSchedule() {
        return schedule;
    }
}
