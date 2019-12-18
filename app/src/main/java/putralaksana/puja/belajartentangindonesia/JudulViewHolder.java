package putralaksana.puja.belajartentangindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Puja on 4/19/2017.
 */

public class JudulViewHolder extends RecyclerView.ViewHolder{
    public TextView tvJudul;
    public View mView;

    public JudulViewHolder(View v) {
        super(v);
        tvJudul = (TextView)itemView.findViewById(R.id.judul);
        mView = v;
    }
    public void setJudul(String judul) { tvJudul.setText(judul);}
}
