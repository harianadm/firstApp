package radaelli.chagas.adami.harian.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        // recebendo a intent criada no main activity
        Intent i = getIntent();
        // pegando o conteúdo do dicionario criado na main activity e salvando em uma string
        String textoDigitado = i.getStringExtra("Texto");
        // Pegando o textView da tela com o id
        TextView tvTexto = findViewById(R.id.tvTexto);
        // Setando o texto da textView como o texto salvo antes
        tvTexto.setText(textoDigitado);
    }
}