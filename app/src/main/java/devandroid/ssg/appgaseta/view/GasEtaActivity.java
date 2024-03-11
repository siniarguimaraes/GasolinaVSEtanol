package devandroid.ssg.appgaseta.view;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.ssg.appgaseta.R;
import devandroid.ssg.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    //UtilGasEta utilGasEta = new UtilGasEta();
    EditText editGasolina;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta);

        //utilGasEta.MetodoEstatico();
        //UtilGasEta.MetodoNaoEstatico();

        editGasolina = findViewById(R.id.editGasolina);

        Toast.makeText(GasEtaActivity.this,UtilGasEta.mensagem(),Toast.LENGTH_LONG).show();


    }
}
