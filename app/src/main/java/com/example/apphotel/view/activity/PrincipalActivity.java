package com.example.apphotel.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.apphotel.R;
import com.example.apphotel.model.OpcaoMenu;
import com.example.apphotel.view.adapter.OpcoesMenuAdapter;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    private RecyclerView opcoesMenuPrincipal;
    private ArrayList<OpcaoMenu> opcaoMenusLista = new ArrayList<OpcaoMenu>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        configuraOpcoesMenu();

    }

    public void configuraOpcoesMenu(){
        opcoesMenuPrincipal = findViewById(R.id.opcoes_menu_recyclerView);

        //Definir Layout
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(this);
        opcoesMenuPrincipal.setLayoutManager(layoutManager);

        //Botoes de opção da tela principal

        OpcaoMenu op =  new OpcaoMenu("Visualizar reserva",R.drawable.visualizar);
        this.opcaoMenusLista.add(op);

        op =  new OpcaoMenu("Agendar reserva",R.drawable.reserved);
        this.opcaoMenusLista.add(op);

        op =  new OpcaoMenu("Cancelar reserva",R.drawable.cancelled);
        this.opcaoMenusLista.add(op);

        op =  new OpcaoMenu("Serviços de quarto",R.drawable.reception);
        this.opcaoMenusLista.add(op);

        //Definir Adapter
        OpcoesMenuAdapter opcoesMenuAdapter = new OpcoesMenuAdapter(opcaoMenusLista);
        opcoesMenuPrincipal.setAdapter(opcoesMenuAdapter);

    }



}