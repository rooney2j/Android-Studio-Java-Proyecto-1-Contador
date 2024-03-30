package pe.ronnie.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pe.ronnie.contador.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        contador = 0;

        Button btn_incrementar = findViewById(R.id.btn_incrementar);
        Button btn_resetear = findViewById(R.id.btn_resetear);
        Button btn_decrementar = findViewById(R.id.btn_decrementar);

        btn_incrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementar_contador(view);
            }
        });

        btn_resetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetear_contador(view);
            }
        });

        btn_decrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementar_contador(view);
            }
        });

    }

    public void incrementar_contador(View vista) {
        contador++;

        mostrar_resultado();
    }

    public void decrementar_contador(View vista) {
        if(contador > 0) {
            contador--;

            mostrar_resultado();
        }
        else {
            Toast.makeText(MainActivity.this, "No existen pulsaciones negativas", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetear_contador(View vista) {
        contador = 0;

        mostrar_resultado();
    }

    public void mostrar_resultado() {
        TextView texto_resultado = (TextView) findViewById(R.id.txt_contador_pulsaciones);

        texto_resultado.setText("Contador: " + contador);
    }

}