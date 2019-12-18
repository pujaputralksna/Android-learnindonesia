package putralaksana.puja.belajartentangindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class peninggalan extends AppCompatActivity {

    public FirebaseRecyclerAdapter<data, JudulViewHolder> mAdapter;
    Intent intent;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam);

        RecyclerView messagesView = (RecyclerView) findViewById(R.id.RCView);

        intent = new Intent(this, penjelasan.class);
        extras = new Bundle();

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref = ref.child("peninggalan_data");
        messagesView.setHasFixedSize(false);
        messagesView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new FirebaseRecyclerAdapter<data, JudulViewHolder>(data.class, R.layout.isi, JudulViewHolder.class, ref ) {
            @Override
            protected void populateViewHolder(JudulViewHolder viewHolder, final data model, int position) {
                viewHolder.setJudul(model.getJudul());



                viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        extras.putString("judul",model.getJudul());
                        extras.putString("isi",model.getIsi());
                        extras.putString("isi2",model.getIsi2());
                        extras.putString("isi3",model.getIsi3());
                        extras.putString("isi4",model.getIsi4());
                        extras.putString("isi5",model.getIsi5());
                        extras.putString("isi6",model.getIsi6());
                        extras.putString("isi7",model.getIsi7());
                        extras.putString("url",model.getUrl());
                        extras.putString("url2",model.getUrl2());
                        extras.putString("url3",model.getUrl3());
                        extras.putString("url4",model.getUrl4());
                        extras.putString("url5",model.getUrl5());
                        extras.putString("url6",model.getUrl6());
                        extras.putString("url7",model.getUrl7());
                        intent.putExtras(extras);
                        startActivity(intent);
                    }
                });
            }
        };
        messagesView.setAdapter(mAdapter);
    }
}
