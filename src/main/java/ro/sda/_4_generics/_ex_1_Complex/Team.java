package ro.sda._4_generics._ex_1_Complex;

/*

 Create a generic class to implement a league table for sport.
 The class should allow teams to be added to the list, and store
 a list of teams that belong to the league.

 Your class should have a method to print out the teams in order,
 with the team at the top of the league printed first.

 Only teams of the same type should be added to any particular
 instance of the league class - the program should fail to compile
 if an attempt is made to add an incompatible team.
*/
public class Team<T> {
    private String name;
    private int playedGames;
    private int won;
    private int lost;
    private int tie;

    public Team(String name) {
        this.name = name;
    }

    private void matchResult(Team<T> opositeTeam, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            this.won++;
            opositeTeam.lost++;
            message = " beat " ;
        } else if (ourScore < theirScore) {
            this.lost++;
            opositeTeam.won++;
            message = " lost to  ";
        } else {
            this.tie++;
            opositeTeam.tie++;
            message = " drew to ";
        }
        this.playedGames++;
        opositeTeam.playedGames++;
        System.out.println(this.name + message + opositeTeam.name);
    }

    public int calculatePoints(){
        return this.won * 3 + this.tie;
    }

}
