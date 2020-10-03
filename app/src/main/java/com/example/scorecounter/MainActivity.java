package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view){
//        displayForTeamA(3);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View view){
//        displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointsForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score){

        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){

        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForTeamB(View view){
//        displayForTeamA(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsForTeamB(View view){
//        displayForTeamA(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOnePointsForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    public void resetScore(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;

        // For showing the current score
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
}
