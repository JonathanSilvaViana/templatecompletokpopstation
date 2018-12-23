package kpopstation.com.br;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import kpopstation.com.br.kpopstation.R;

public class MenuActivity extends AppCompatActivity {

    FloatingActionButton compartilhar;

    Button guiadeestudos, noticias, sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ação de compartilhar

        compartilhar = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //avisa as pessoas
                Toast.makeText(MenuActivity.this, "Disponível apenas para Android", Toast.LENGTH_LONG).show();
                //faz a brincadeira
                Intent intentCompartilhar = new Intent();
                intentCompartilhar.setAction(Intent.ACTION_SEND);
                intentCompartilhar.putExtra(Intent.EXTRA_TEXT, "Baixe o aplicativo do Kpopstation: https://play.google.com/store/apps/details?id=kpopstation.com.br.kpopstation");
                intentCompartilhar.setType("text/plain");
                startActivity(intentCompartilhar);
            }
        });

        //guia de estudos

        guiadeestudos = (Button)findViewById(R.id.bt_estudos);

        guiadeestudos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guiadeestudos = new Intent(MenuActivity.this, GuiaEstudosActivity.class);
                startActivity(guiadeestudos);
            }
        });

        noticias = (Button)findViewById(R.id.bt_noticias);

        noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noticias = new Intent(MenuActivity.this, Posts.class);
                startActivity(noticias);
            }
        });

        sobre = (Button)findViewById(R.id.sobreoaplicativo);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobre = new Intent(MenuActivity.this, SobreActivity.class);
                startActivity(sobre);
            }
        });
    }

}
