package br.ifsul.entradadedadostextuais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button btCopia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.etTexto);
        tv = findViewById(R.id.tv);
        btCopia = findViewById(R.id.btCopiaTexto);

    }

    public void onClickCopiaTexto(View v){
        tv.setText(et.getText());
    }
}