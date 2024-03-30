package pe.ronnie.contador;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        contador = 0;
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