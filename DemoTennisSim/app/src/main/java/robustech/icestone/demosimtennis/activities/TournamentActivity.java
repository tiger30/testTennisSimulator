package robustech.icestone.demosimtennis.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import robustech.icestone.demosimtennis.R;

public class TournamentActivity extends AppCompatActivity {
    private TextView tvTotalPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String totalPlayers = getIntent().getStringExtra("totalPlayers");

        tvTotalPlayers = (TextView) findViewById(R.id.tvTotalPlayers);
        tvTotalPlayers.setText("Total players in tournament: " + totalPlayers.toString());
    }
}
