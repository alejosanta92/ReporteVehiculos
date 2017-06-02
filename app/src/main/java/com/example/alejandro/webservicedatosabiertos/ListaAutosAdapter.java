package com.example.alejandro.webservicedatosabiertos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alejandro.webservicedatosabiertos.models.ReporteVehiculo;

import java.util.ArrayList;

/**
 * Created by alejandro on 2/06/17.
 */

public class ListaAutosAdapter extends RecyclerView.Adapter<ListaAutosAdapter.ViewHolder> {
    private ArrayList<ReporteVehiculo> dataset;

    private Context context;

    public ListaAutosAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_autos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ReporteVehiculo a = dataset.get(position);
        holder.clase.setText(a.getClase());
      //  holder.numero.setText(a.getExtranjero().toString());
       // holder.oficial.setText(a.getOficial().toString());
        holder.particular.setText(a.getParticular().toString());
        holder.publico.setText(a.getPublico().toString());
        holder.total.setText(a.getTotal().toString());


    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void agregarAuto(ArrayList<ReporteVehiculo> listaAuto) {
        dataset.addAll(listaAuto);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView clase;
        private TextView particular;
        private TextView publico;
        private TextView total;

        public ViewHolder(View itemView) {
            super(itemView);


            clase = (TextView) itemView.findViewById(R.id.clase);
            particular=(TextView) itemView.findViewById(R.id.particular);
            publico=(TextView) itemView.findViewById(R.id.publico);
            total=(TextView) itemView.findViewById(R.id.total);
        }
    }
}
