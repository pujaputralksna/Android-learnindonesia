package putralaksana.puja.belajartentangindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class materi extends AppCompatActivity {

    private ListView lvItem;
    private String[] judul = new String[]{ "Negara Kita Indonesia","Pembagian Wilayah","Iklim di Indonesia","Kebudayaan Indonesia","Kekayaan Alam Indonesia","Zaman Kerajaan di Indonesia",
    "Peninggalan Bersejarah","Pahlawan-pahlawan Indonesia","Tempat Wisata di Indonesia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        lvItem = (ListView)findViewById(R.id.lv_Item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(materi.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, judul);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3){
                if(pos == 0) {
                    Intent intent = new Intent(materi.this, negara.class);
                    startActivity(intent);
                }
                else if(pos == 1) {
                    Intent intent = new Intent(materi.this, wilayah.class);
                    startActivity(intent);
                }
                else if(pos == 2) {
                    Intent intent = new Intent(materi.this, iklim.class);
                    startActivity(intent);
                }
                else if(pos == 3) {
                    Intent intent = new Intent(materi.this, budaya.class);
                    startActivity(intent);
                }
                else if(pos == 4) {
                    Intent intent = new Intent(materi.this, alam.class);
                    startActivity(intent);
                }
                else if(pos == 5) {
                    Intent intent = new Intent(materi.this, kerajaan.class);
                    startActivity(intent);
                }
                else if(pos == 6) {
                    Intent intent = new Intent(materi.this, peninggalan.class);
                    startActivity(intent);
                }
                else if(pos == 7) {
                    Intent intent = new Intent(materi.this, pahlawan.class);
                    startActivity(intent);
                }
                else if(pos == 8) {
                    Intent intent = new Intent(materi.this, wisata.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(materi.this, MenuUtama.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
