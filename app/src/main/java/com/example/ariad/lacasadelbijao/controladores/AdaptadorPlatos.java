package com.example.ariad.lacasadelbijao.controladores;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import com.example.ariad.lacasadelbijao.R;
        import com.example.ariad.lacasadelbijao.entidades.Platos;

        import java.util.ArrayList;


/**
 * Created by ariad on 4/06/2019.
 */

public class AdaptadorPlatos extends ArrayAdapter<Platos> {
    Context context;
    ArrayList<Platos> listap = new ArrayList<>();

    public AdaptadorPlatos(Context context, ArrayList<Platos> listap) {
        super(context, R.layout.filap, listap);
        this.context = context;
        this.listap=listap;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater =
                (LayoutInflater)
                        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vistap = layoutInflater.
                inflate(R.layout.filap, parent, false);

        TextView tv_nombrePlato = (TextView)  vistap.findViewById(R.id.tv_nombrePlato);
        TextView tv_descripcionPlato = (TextView) vistap.findViewById(R.id.tv_descripcionPlato);
        TextView tv_precio = (TextView) vistap.findViewById(R.id.tv_precio);


        tv_nombrePlato.setText(listap.get(position).getNombrep());
        tv_descripcionPlato.setText(listap.get(position).getDescripcionp());
        tv_precio.setText(String.valueOf(listap.get(position).getPreciop()));


        return vistap;
    }

}
