package net.aditkus.resepmasakanindonesia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Aditya on 01-Oct-17.
 */

public class resepAdapter extends RecyclerView.Adapter<resepAdapter.ResepViewHolder>{
    private Context context;
    private ArrayList<resep> Resep;

    public resepAdapter(Context context, ArrayList<resep> resep) {
        this.context = context;
        this.Resep = resep;
    }

    @Override
    public resepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_resep,parent,false);
        return new ResepViewHolder(view);
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView deskripsi;
        TextView namaResep;
        public ResepViewHolder(View itemView) {
            super(itemView);
            namaResep = (TextView)itemView.findViewById(R.id.nama_makanan);
            deskripsi= (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }

    @Override
    public void onBindViewHolder(resepAdapter.ResepViewHolder holder, final int position) {
        holder.namaResep.setText(Resep.get(position).getJudulresep());
        holder.deskripsi.setText(Resep.get(position).getDeskripsimakanan());

        holder.namaResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailResepActivity.class);
                i.putExtra("gambar", Resep.get(position).getGambar());
                i.putExtra("detailresep", Resep.get(position).getIsiResep());
                i.putExtra("menuBar",Resep.get(position).getMenuBar());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Resep.size();
    }

}
