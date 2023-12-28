import java.util.ArrayList;
public class League {
    private String name;
    private String season;
    private ArrayList<Team> teams;
    private Schedule schedule;
    private String rules;
    private int standings;
    private String startDate;
    private String endDate;
    private String venue;
    private String prize;
    private String commissioner;
    private String sponsorshipInformation;
    private String broadcastingRights;
    private String ticketInformation;
    private String history;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public ArrayList<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getRules() {
        return this.rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getStandings() {
        return this.standings;
    }

    public void setStandings(int standings) {
        this.standings = standings;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getVenue() {
        return this.venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getPrize() {
        return this.prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getCommissioner() {
        return this.commissioner;
    }

    public void setCommissioner(String commissioner) {
        this.commissioner = commissioner;
    }

    public String getSponsorshipInformation() {
        return this.sponsorshipInformation;
    }

    public void setSponsorshipInformation(String sponsorshipInformation) {
        this.sponsorshipInformation = sponsorshipInformation;
    }

    public String getBroadcastingRights() {
        return this.broadcastingRights;
    }

    public void setBroadcastingRights(String broadcastingRights) {
        this.broadcastingRights = broadcastingRights;
    }

    public String getTicketInformation() {
        return this.ticketInformation;
    }

    public void setTicketInformation(String ticketInformation) {
        this.ticketInformation = ticketInformation;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
