package andersonsaturnino.com.br.academia_v20.Visao.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import andersonsaturnino.com.br.academia_v20.R;
import andersonsaturnino.com.br.academia_v20.Visao.maps.Mapa;

/**
 * Classe responsavel por realizar login
 * tendo opçao de conta local ou integraçao com facebook
 *
 * @author Lucas Ferreira
 * Criada em 16/03/2016
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tb_login);
        toolbar.setTitle("Logar");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mnCadastrar) {
            Intent login = new Intent(LoginActivity.this, Cadastro_Usuario.class);
            startActivity(login);
        }

        return super.onOptionsItemSelected(item);
    }
}
