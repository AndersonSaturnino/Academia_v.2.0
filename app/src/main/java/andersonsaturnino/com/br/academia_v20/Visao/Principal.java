package andersonsaturnino.com.br.academia_v20.Visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import andersonsaturnino.com.br.academia_v20.R;

public class Principal extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG) .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void CadastrarTreinoClick(View view) {
        intent = new Intent(this, Cadastro_Treinos.class);
        startActivity(intent);
    }

    public void CadastrarAgendaClick(View view) {
        intent = new Intent(this, Cadastro_Agenda.class);
        startActivity(intent);
    }

    public void TreinarClick(View view) {
        intent = new Intent(this, Treinar.class);
        startActivity(intent);
    }

    public void AbrirMapaClick(MenuItem item) {
        intent = new Intent(this, Mapa.class);
        startActivity(intent);
    }

    public void CadastrarUsuariosClick(View view) {
        intent = new Intent(this, Cadastro_Usuario.class);
        startActivity(intent);
    }
}
