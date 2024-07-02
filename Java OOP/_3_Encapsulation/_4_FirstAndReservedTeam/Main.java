package _4_FirstAndReservedTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());

            Team team = new Team("Black Eagles");

            for (int i = 0; i < n; i++) {
                String[] input = reader.readLine().split(" ");
                try {
                    team.addPlayer(new Person(input[0], input[1], Integer.parseInt(input[2]),
                            Double.parseDouble(input[3])));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.printf("First team have %d players%n" +
                            "Reserve team have %d players",
                    team.getFirstTeam().size(),
                    team.getReserveTeam().size());
        }
}
//5
//Asen Ivanov 20 2200
//Boiko Borisov 57 3333
//Ventsislav Ivanov 27 600
//Grigor Dimitrov 25 666.66
//Boiko Angelov 35 555

//First team have 4 players
//Reserve team have 1 players
