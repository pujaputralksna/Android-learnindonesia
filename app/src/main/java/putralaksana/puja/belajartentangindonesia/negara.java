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

public class negara extends AppCompatActivity {

    public FirebaseRecyclerAdapter<data, JudulViewHolder> mAdapter;
    Intent intent;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam);

        RecyclerView messagesView = (RecyclerView) findViewById(R.id.RCView);

        intent = new Intent(this, penjelasan2.class);
        extras = new Bundle();

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref = ref.child("negara_data");
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
                        extras.putString("url",model.getUrl());
                        extras.putString("url2",model.getUrl2());
                        intent.putExtras(extras);
                        startActivity(intent);
                    }
                });
            }
        };
        messagesView.setAdapter(mAdapter);
    }
}
