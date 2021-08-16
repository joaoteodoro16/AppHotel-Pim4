package com.example.apphotel.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apphotel.R;
import com.example.apphotel.model.OpcaoMenu;

import java.util.ArrayList;
import java.util.List;

public class OpcoesMenuAdapter extends RecyclerView.Adapter<OpcoesMenuAdapter.MyViewHolder> {

    private ArrayList<OpcaoMenu> opcaoMenusLista =  new ArrayList<OpcaoMenu>();

    public OpcoesMenuAdapter(ArrayList<OpcaoMenu> opcao) {
        this.opcaoMenusLista = opcao;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listaOpcoes = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.opcoes_menu,parent,false);

        return new MyViewHolder(listaOpcoes);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OpcaoMenu opcaoMenu = opcaoMenusLista.get(
                position
        );
        holder.titulo.setText(opcaoMenu.getTitulo());
        holder.icone.setImageResource(opcaoMenu.getImagem());
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private ImageView icone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo_opcao_textView);
            icone = itemView.findViewById(R.id.icone_opcao_imageView);
        }
    }

}
