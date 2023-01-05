

public class Game {
    private int id;
    private String date;
    private Team home_team;
    private int home_team_score;
    private int period;
    private boolean postseason;
    private int season;
    private String status;
    private String time;
    private Team visitor_team;
    private int visitor_team_score;

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHome_team(Team home_team) {
        this.home_team = home_team;
    }

    public void setHome_team_score(int home_team_score) {
        this.home_team_score = home_team_score;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setPostseason(boolean postseason) {
        this.postseason = postseason;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVisitor_team(Team visitor_team) {
        this.visitor_team = visitor_team;
    }

    public void setVisitor_team_score(int visitor_team_score) {
        this.visitor_team_score = visitor_team_score;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Team getHome_team() {
        return home_team;
    }

    public int getHome_team_score() {
        return home_team_score;
    }

    public int getPeriod() {
        return period;
    }

    public boolean isPostseason() {
        return postseason;
    }

    public int getSeason() {
        return season;
    }

    public String getStatus() {
        return status;
    }

    public String getTime() {
        return time;
    }

    public Team getVisitor_team() {
        return visitor_team;
    }

    public int getVisitor_team_score() {
        return visitor_team_score;
    }
}
