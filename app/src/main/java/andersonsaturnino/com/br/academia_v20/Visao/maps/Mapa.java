package andersonsaturnino.com.br.academia_v20.Visao.maps;

import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import andersonsaturnino.com.br.academia_v20.R;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Ourinhos and move the camera
        LatLng ourinhos = new LatLng(-22.97, -49.87);
        mMap.addMarker(new MarkerOptions().position(ourinhos).title("Ourinhos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ourinhos));
        mMap.getMaxZoomLevel();
    }

    public void capturarTela() {
        GoogleMap.SnapshotReadyCallback callback = new GoogleMap.SnapshotReadyCallback() {
            Bitmap bitmap;

            @Override
            public void onSnapshotReady(Bitmap snapshot) {
                bitmap = snapshot;

                    File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);

                    try {
                        FileOutputStream out = new FileOutputStream(file + "/" + "MapaTela" + System.currentTimeMillis() + ".png");
                        bitmap.compress(Bitmap.CompressFormat.PNG, 90, out);
                        out.close();

                    }catch (FileNotFoundException e) {
                        Toast.makeText(Mapa.this, "Arquivo Não Encontrado: " + e.getMessage(),Toast.LENGTH_LONG).show();
                    } catch (IOException e) {
                        Toast.makeText(Mapa.this, "Erro ao Acessar o Arquivo: " + e.getMessage(),Toast.LENGTH_LONG).show();
                    }
                }
        };
        mMap.snapshot(callback);
        Toast.makeText(Mapa.this, "Capturado com Sucesso!",Toast.LENGTH_LONG).show();
    }

    public void btnCapturaTela(View view) {
        capturarTela();
    }
}
