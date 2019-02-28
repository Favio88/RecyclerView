package com.favio.recyclerview.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.favio.recyclerview.R;
import com.favio.recyclerview.modelos.Persona;

import java.util.List;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.ViewHolder> {

    List<Persona> listaPersonas;

    public AdaptadorPersona(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        ViewHolder vh=new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_nombre.setText(listaPersonas.get(position).getNombre());
        holder.tv_apellido.setText(listaPersonas.get(position).getApellido());
        holder.tv_edad.setText(listaPersonas.get(position).getEdad().toString());
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_nombre, tv_apellido, tv_edad;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_nombre=(TextView) itemView.findViewById(R.id.tv_nombre);
            tv_apellido=(TextView) itemView.findViewById(R.id.tv_apellido);
            tv_edad=(TextView) itemView.findViewById(R.id.tv_edad);
        }
    }
}
