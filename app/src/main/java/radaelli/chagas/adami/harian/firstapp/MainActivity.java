package radaelli.chagas.adami.harian.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Criando o botão com o id do objeto botão na tela
        Button btnEnviar = findViewById(R.id.btnEnviar);
        // Atribuindo uma ação ao botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            // Definindo a ação do botão
            @Override
            public void onClick(View view) {
                // Pegando o editText da tela com o id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                // Salvando o conteudo(string) do editText em uma variavel
                String textoDigitado = etDigiteAqui.getText().toString();
                // criando a intenção de navegar da mainActivity para a nextActivity
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                // criando um dicionario onde a chave é Texto e o conteúdo é o texto salvo antes
                i.putExtra("Texto",textoDigitado);
                // iniciando a segunda tela
                startActivity(i);

            }
        });
    }
}