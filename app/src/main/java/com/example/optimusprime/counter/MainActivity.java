package com.example.optimusprime.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add1(View view) {
        teamAscore = teamAscore + 1;
        da(teamAscore);
    }

    public void add2(View view) {
        teamAscore = teamAscore + 2;
        da(teamAscore);
    }

    public void add4(View view) {
        teamAscore = teamAscore + 4;
        da(teamAscore);
    }

    public void add6(View view) {
        teamAscore = teamAscore + 6;
        da(teamAscore);
    }

    public void add1b(View view) {
        teamBscore = teamBscore + 1;
        db(teamBscore);
    }

    public void add2b(View view) {
        teamBscore = teamBscore + 2;
        db(teamBscore);
    }

    public void add4b(View view) {
        teamBscore = teamBscore + 4;
        db(teamBscore);
    }

    public void add6b(View view) {
        teamBscore = teamBscore + 6;
        db(teamBscore);
    }

    public void reset(View view) {
        teamAscore = 0;
        teamBscore = 0;
        da(teamAscore);
        db(teamBscore);

    }

    private void da(int a) {
        TextView q = (TextView)findViewById(R.id.scoreA);
        q.setText(a);
    }

    private void db(int b) {
        TextView qb = (TextView)findViewById(R.id.scoreB);
        qb.setText(b);
    }
}