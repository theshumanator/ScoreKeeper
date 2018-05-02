package com.example.fatoumeh.scorekeeper;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeTeamGoals=0;
    int homeTeamRedCard=0;
    int homeTeamYellowCard=0;

    int awayTeamGoals=0;
    int awayTeamRedCard=0;
    int awayTeamYellowCard=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the goals, yellow and red cards for a given team
     */
    public void displayTeamStats(int goals, int redCard, int yellowCard, boolean homeTeam) {

        if (homeTeam) {
            TextView goalView = (TextView) findViewById(R.id.team_home_goals);
            goalView.setText(String.valueOf(goals));

            TextView redView = (TextView) findViewById(R.id.team_home_red_card);
            redView.setText(String.valueOf(redCard));

            TextView yellowView = (TextView) findViewById(R.id.team_home_yellow_card);
            yellowView.setText(String.valueOf(yellowCard));

        } else {
            TextView goalView = (TextView) findViewById(R.id.team_away_goals);
            goalView.setText(String.valueOf(goals));

            TextView redView = (TextView) findViewById(R.id.team_away_red_card);
            redView.setText(String.valueOf(redCard));

            TextView yellowView = (TextView) findViewById(R.id.team_away_yellow_card);
            yellowView.setText(String.valueOf(yellowCard));

        }

    }

    //Updates the home team goal stat
    public void updateHomeTeamGoal(View v) {
        homeTeamGoals++;
        displayTeamStats(homeTeamGoals,homeTeamRedCard,homeTeamYellowCard, true);
    }

    //Updates the home team red card stat
    public void updateHomeTeamRedCard(View v) {
        homeTeamRedCard++;
        displayTeamStats(homeTeamGoals,homeTeamRedCard,homeTeamYellowCard, true);
    }

    //Updates the home team yellow card stat
    public void updateHomeTeamYellowCard(View v) {
        homeTeamYellowCard++;
        displayTeamStats(homeTeamGoals,homeTeamRedCard,homeTeamYellowCard, true);
    }

    //Updates the away team goal stat
    public void updateAwayTeamGoal(View v) {
        awayTeamGoals++;
        displayTeamStats(awayTeamGoals,awayTeamRedCard,awayTeamYellowCard, false);
    }

    //Updates the away team red card stat
    public void updateAwayTeamRedCard(View v) {
        awayTeamRedCard++;
        displayTeamStats(awayTeamGoals,awayTeamRedCard,awayTeamYellowCard, false);
    }

    //Updates the away team yellow card stat
    public void updateHomeAwayYellowCard(View v) {
        awayTeamYellowCard++;
        displayTeamStats(awayTeamGoals,awayTeamRedCard,awayTeamYellowCard, false);
    }

    /**
     * Resets all the scores on the screen
     **/

    public void resetScore(View v) {
        homeTeamGoals=0;
        homeTeamRedCard=0;
        homeTeamYellowCard=0;

        awayTeamGoals=0;
        awayTeamRedCard=0;
        awayTeamYellowCard=0;

        displayTeamStats(homeTeamGoals,homeTeamRedCard,homeTeamYellowCard, true);
        displayTeamStats(awayTeamGoals,awayTeamRedCard,awayTeamYellowCard, false);

    }
}
