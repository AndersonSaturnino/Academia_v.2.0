package andersonsaturnino.com.br.academia_v20.Visao;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import andersonsaturnino.com.br.academia_v20.DAO.UsuariosDAO;
import andersonsaturnino.com.br.academia_v20.R;

public class Cadastro_Usuario extends AppCompatActivity {

    UsuariosDAO usuariosDAO;
    private EditText edtNome;
    private EditText edtDataNasc;
    private RadioGroup grupoSexo;
    private String sexo = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        grupoSexo = (RadioGroup) findViewById(R.id.RadioGroup);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Não Implementado", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ImageButton imageButton = (ImageButton) findViewById(R.id.lgFace);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                        if (checkedId == R.id.rbFem) {
                            sexo = "Feminino";
                        } else if (checkedId == R.id.rbMasc) {
                            sexo = "Masculino";
                        }
                    }
                });
                Toast.makeText(Cadastro_Usuario.this, sexo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
