import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {


        getSchedule();
        getTeams();
        getPlayers();
    }

    public static Players getPlayers() throws Exception{
        Players players = new Players();
        Gson gson = new Gson();
        HttpRequest getPlayers = HttpRequest.newBuilder()
                .uri(new URI("https://free-nba.p.rapidapi.com/players"))
                .header("X-RapidAPI-Key", "e0cb896e5cmshbba930970f2086cp1313b2jsn4c9f60e03507")
                .header("X-RapidAPI-Host","free-nba.p.rapidapi.com")
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getPlayersResponse = httpClient.send(getPlayers, HttpResponse.BodyHandlers.ofString());

        players = gson.fromJson(getPlayersResponse.body(),Players.class);
        Player p = players.getData()[0];
        System.out.println(p.getLast_name());
        return null;
    }

    public static Teams getTeams() throws Exception{
        Teams t = new Teams();
        Gson gson = new Gson();
        //get all teams
        HttpRequest getTeams = HttpRequest.newBuilder()
                .uri(new URI("https://free-nba.p.rapidapi.com/teams"))
                .header("X-RapidAPI-Key", "e0cb896e5cmshbba930970f2086cp1313b2jsn4c9f60e03507")
                .header("X-RapidAPI-Host","free-nba.p.rapidapi.com")
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getGamesResponse = httpClient.send(getTeams, HttpResponse.BodyHandlers.ofString());

        t = gson.fromJson(getGamesResponse.body(),Teams.class);

        Team team = t.getData()[0];
        System.out.println(team.getFull_name());

        return null;
    }

    public static Schedule getSchedule() throws Exception{
        Schedule s = new Schedule();
        Gson gson = new Gson();
        Game [] schedule = new Game[25];
        //get all games
        HttpRequest getGames = HttpRequest.newBuilder()
                .uri(new URI("https://free-nba.p.rapidapi.com/games"))
                .header("X-RapidAPI-Key", "e0cb896e5cmshbba930970f2086cp1313b2jsn4c9f60e03507")
                .header("X-RapidAPI-Host","free-nba.p.rapidapi.com")
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getGamesResponse = httpClient.send(getGames, HttpResponse.BodyHandlers.ofString());

        //all games are here:
        s = gson.fromJson(getGamesResponse.body(), Schedule.class);

        schedule = s.getData();
        Game g = schedule[0];
        System.out.println(g.getHome_team_score());

        return null;
    }
}
