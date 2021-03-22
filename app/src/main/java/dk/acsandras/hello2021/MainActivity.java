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

    /**
     * Denne metode kan angives som klik-metoden for knappen i XML'en.
     * Brug syntaksen android:onClick="beregn" i knappens XML
     * Metoden beregner resultat = omsætning minus omkostninger
     * @param view
     */
    public void beregn(android.view.View view) {

        // Android indlæser en activity og dens elementer automatisk fra XML i superklassen R
        // Men hvis vi vil arbejde med GUI-objekterne, skal vi erklære dem som variabler, så vi kan bruge dem som objekter
        // Det, som findViewById returnerer, typecastes til den øsnkede type, her (EditText)
        EditText omsaetning   = (EditText)findViewById(R.id.omsaetningEditText);
        EditText omkostning   = (EditText)findViewById(R.id.omkostningEditText);
        EditText resultat = (EditText)findViewById(R.id.resultatEditText);

        // Log.d bruges til logging og debugging. Du vælger taggen selv.
        Log.d("AndrásDebug", "Omsætning er " + omsaetning.getText().toString() + " og omkostning er " + omkostning.getText().toString());

        // Beregner resultat fra det indtastede
        int resultatInt;
        resultatInt = Integer.valueOf(omsaetning.getText().toString()) - Integer.valueOf(omkostning.getText().toString());
        Log.d("AndrásDebug", "Resultatet er " + resultatInt);

        // Sætter værdien i textfeltet
        resultat.setText(String.valueOf(resultatInt));

        // Bare for sjovt: Sådan laver du en snackbar
        Snackbar.make(view, "Resultatet er " + resultatInt + "!", Snackbar.LENGTH_LONG)
               .setAction("Action", null).show();
    }

    /**
     *
     *  Lige nu er det denne metode, som gennemføres, når knappen klikkes.
     *  TODO Kan du ændre XML'en, så det beregn() som kører, når der klikkes på knappen?
     *
     * */
    public void sigHejiLoggen(android.view.View view) {
        Log.d("András", "Hej Log!");
    }

    }