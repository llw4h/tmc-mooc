
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("File: ");
        String file = scan.nextLine();
        System.out.print("Team: ");
        String team = scan.nextLine();
        ArrayList<Match> matches = readRecordsFromFile(file);
        int[] counts = numberOfGamesWinsLosses(team, matches);
        System.out.println("Games: " + counts[0]);
        System.out.println("Wins: " + counts[1]);
        System.out.println("Losses: " + counts[2]);
    }
    
    public static ArrayList<Match> readRecordsFromFile(String file){
        ArrayList<Match> teams = new ArrayList<>();
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String visiting = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                teams.add(new Match(home, visiting, homePoints, visitingPoints));
            }
            return teams;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return teams;
        }
    }
    
    public static int[] numberOfGamesWinsLosses(String team, ArrayList<Match> matches){
        int[] counts = new int[3];
        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;
        for (Match m : matches){
            if (m.getHomeTeam().equals(team) || m.getVisitingTeam().equals(team)){
                gamesCount++;
            }
            if ((m.getHomePoints() > m.getVisitingPoints() && m.getHomeTeam().equals(team)) || 
                    (m.getHomePoints() < m.getVisitingPoints() && m.getVisitingTeam().equals(team))){
                winsCount++;
            } 
            if ((m.getHomePoints() < m.getVisitingPoints() && m.getHomeTeam().equals(team)) ||
                    m.getHomePoints() > m.getVisitingPoints() && m.getVisitingTeam().equals(team)){
                lossesCount++;
            }
        }
        counts[0] = gamesCount;
        counts[1] = winsCount;
        counts[2] = lossesCount;
        return counts;
    }

}
