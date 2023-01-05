public class Player {
    private int id;
    private String first_name;
    private int height_feet;
    private int height_inches;
    private String last_name;
    private String position;
    private Team team;
    private int weight;


    public void setTeam(Team team) {
        this.team = team;
    }


    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public int getHeight_inches() {
        return height_inches;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    public int getWeight() {
        return weight;
    }
}
