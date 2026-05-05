/*Description: Create a Player POJO class having playerId, playerName and runs. Initialize using constructor. Store 5 player objects in an array and find the player who scored maximum runs.
INPUT:
Enter Player Details:
Player1: 1 Virat 85
Player2: 2 Rohit 120
Player3: 3 KL 45
Player4: 4 Gill 95
Player5: 5 Hardik 60

OUTPUT:
Highest Run Scorer: Rohit
Runs: 120*/
class Player {
    int playerId;
    String playerName;
    int runs;

    // Constructor
    public Player(int id, String name, int r) {
        playerId = id;
        playerName = name;
        runs = r;
    }
}

class PlayerApp {
    public static void main(String[] args) {

        // Array of 5 players
        Player[] p = new Player[5];

        // Initializing objects
        p[0] = new Player(1, "Virat", 85);
        p[1] = new Player(2, "Rohit", 120);
        p[2] = new Player(3, "KL", 45);
        p[3] = new Player(4, "Gill", 95);
        p[4] = new Player(5, "Hardik", 60);

        // Find max runs
        Player max = p[0];

        for (int i = 1; i < p.length; i++) {
            if (p[i].runs > max.runs) {
                max = p[i];
            }
        }

        // Output
        System.out.println("Highest Run Scorer: " + max.playerName);
        System.out.println("Runs: " + max.runs);
    }
}