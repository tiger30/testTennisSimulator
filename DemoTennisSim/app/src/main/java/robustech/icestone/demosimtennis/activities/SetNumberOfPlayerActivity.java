package robustech.icestone.demosimtennis.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import robustech.icestone.demosimtennis.R;

public class SetNumberOfPlayerActivity extends AppCompatActivity {

    private static final String LOG_TAG = SetNumberOfPlayerActivity.class.getSimpleName();
    private EditText etNumberPlayer;
    private Button btnStart;

    private final int TOURNAMENT_RESULT_REQUEST_CODE = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_number_of_player);

        etNumberPlayer = (EditText) findViewById(R.id.etNumberPlayer);
        btnStart = (Button) findViewById(R.id.btnStart);
        //launch tournament
        onStartTournament();
    }

    private void onStartTournament(){
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNumberPlayer.getText().length() > 0) {
                    Toast.makeText(SetNumberOfPlayerActivity.this, "Total number of player: " + etNumberPlayer.getText().toString(), Toast.LENGTH_SHORT).show();
                    String totalPlayers = etNumberPlayer.getText().toString();
                    launchTournamentView(totalPlayers);
                } else {
                    Toast.makeText(SetNumberOfPlayerActivity.this, "Please enter number of player", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void launchTournamentView(String totalPlayer) {
        Intent i = new Intent(SetNumberOfPlayerActivity.this, TournamentActivity.class);
        i.putExtra("totalPlayers", totalPlayer);

        startActivityForResult(i, TOURNAMENT_RESULT_REQUEST_CODE);
    }
}
