package andersonsaturnino.com.br.academia_v20.Visao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import andersonsaturnino.com.br.academia_v20.R;

/**
 * Classe responsavel por realizar login
 * tendo opçao de conta local ou integraçao com facebook
 *
 * @author Lucas Ferreira
 * Criada em 16/03/2016
 */
public class LoginActivity extends AppCompatActivity {

    private Button logarFace;
    private Button logarLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
