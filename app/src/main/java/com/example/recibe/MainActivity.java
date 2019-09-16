package com.example.recibe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();

        if (Intent.ACTION_SEND.equals(action)&& type!=null){
            if ("text/plain".equals(type)){
                manipularTexto(intent);
            }
        }
    }
    public void manipularTexto(Intent intent){
        String sharedText= getIntent().getStringExtra(
                Intent.EXTRA_TEXT);
        if (sharedText !=null){

            TextView titulo=(TextView)findViewById(R.id.titulo_id);
            titulo.setText(sharedText);
            //Toast.makeText(MainActivity.this,sharedText,Toast.LENGTH_LONG).show();

            /*
            if (sharedText.equals("opcion 1")){
                TextView titulo=(TextView)findViewById(R.id.titulo_id);
                TextView cuerpo=(TextView)findViewById(R.id.cuerpo_id);
                titulo.setText("Esta es la opcion 1 del pedido");
                cuerpo.setText("Este es el cuerpo del pedido 1");

            }
            if (sharedText.equals("opcion 2")){
                TextView titulo=(TextView)findViewById(R.id.titulo_id);
                TextView cuerpo=(TextView)findViewById(R.id.cuerpo_id);
                titulo.setText("Esta es la opcion 2 del pedido");
                cuerpo.setText("Este es el cuerpo del pedido 2");

            }*/


        }
    }
}
