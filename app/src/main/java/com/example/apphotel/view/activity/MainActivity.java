package com.example.apphotel.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.apphotel.R;

public class MainActivity extends AppCompatActivity {

    private Button botao_login;
    public Button registrar_botao;
    private Intent intent;
    private Intent intentRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = new Intent(this,PrincipalActivity.class);
        intentRegistrar = new Intent(this,CadastrarUsuarioAcitivty.class);
        setContentView(R.layout.activity_main);
        configuraBotaoLogin();
        configuraBotaoRegistrarse();
    }

    private void configuraBotaoLogin(){
        botao_login = findViewById(R.id.login_button);

        botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    private void configuraBotaoRegistrarse(){
        registrar_botao =  findViewById(R.id.registrar_button);

        registrar_botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRegistrar);
            }
        });
        System.out.println("teste");

    }


}