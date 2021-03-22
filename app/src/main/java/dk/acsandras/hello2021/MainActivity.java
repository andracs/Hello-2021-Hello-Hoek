package dk.acsandras.hello2021;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void beregn(android.view.View view) {

        EditText omsaetning   = (EditText)findViewById(R.id.omsaetningEditText);
        EditText omkostning   = (EditText)findViewById(R.id.omkostningEditText);
        EditText resultat = (EditText)findViewById(R.id.resultatEditText);

        Log.d("AndrásDebug", "Omsætning er " + omsaetning.getText().toString() + " og omkostning er " + omkostning.getText().toString());

        int resultatInt;
        resultatInt = Integer.valueOf(omsaetning.getText().toString()) - Integer.valueOf(omkostning.getText().toString());
        Log.d("AndrásDebug", "Resultatet er " + resultatInt);

        resultat.setText(String.valueOf(resultatInt));

        Snackbar.make(view, "Resultatet er " + resultatInt + "!", Snackbar.LENGTH_LONG)
               .setAction("Action", null).show();
    }

    public void sigHejiLoggen(android.view.View view) {
        Log.d("András", "Hej Log!");
    }

    }