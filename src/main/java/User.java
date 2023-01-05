import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList <Team> teams;
    private ArrayList <League> leagues;
    private ArrayList <Game> calendar;

    public User(String name){
        this.name = name;
    }

    public User(){
        this.name= "";
    }

    public void addToCalendar(Game game){ calendar.add(game); }

    public void addTeam(Team team){
        teams.add(team);
    }

    public void removeTeam(Team team){
        teams.remove(team);
    }


}
