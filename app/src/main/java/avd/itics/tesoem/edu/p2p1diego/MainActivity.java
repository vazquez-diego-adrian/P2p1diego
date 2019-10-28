package avd.itics.tesoem.edu.p2p1diego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rmasculino, rfemenido;
    RadioButton Suma, Resta, Multiplicacion, Division;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenido = (RadioButton) findViewById(R.id.rfemenino);
        Suma = (RadioButton) findViewById(R.id.suma);
        Resta = (RadioButton) findViewById(R.id.Resta);
        Multiplicacion = (RadioButton) findViewById(R.id.Multiplicación);
        Division = (RadioButton) findViewById(R.id.División);
        result = (TextView) findViewById(R.id.result);


    }

    public void invocarmensaje(View view) {
        if (rmasculino.isChecked()) {
            Toast.makeText(this, "Selecciono Masculino", Toast.LENGTH_LONG).show();

        }
        if (rfemenido.isChecked()) {
            Toast.makeText(this, "Selecciono Femenino", Toast.LENGTH_LONG).show();
        }
    }
    public void Funciones(View view) {
        if (Suma.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1+valor2;
            result.setText(" " + res);

        }
        if (Resta.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1-valor2;
            result.setText(" " + res);

        } if (Multiplicacion.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1*valor2;
            result.setText(" " + res);

        } if (Division.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1/valor2;
            result.setText(" " + res);

        }
    }

}
