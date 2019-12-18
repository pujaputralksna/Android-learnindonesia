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

public class lagu_nasional extends AppCompatActivity {

    private ListView lvItem;
    private String[] lagunas = new String[]{ "Indonesia Raya","Garuda Pancasila","Mengheningkan Cipta","Syukur",
    "Satu Nusa Satu Bangsa","Rayuan Pulau Kelapa","Hari Merdeka","Halo Halo Bandung","Bagimu Negeri",
    "Indonesia Tumpah Darahku"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_nasional);

        lvItem = (ListView)findViewById(R.id.lv_Item2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(lagu_nasional.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, lagunas);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3){
                if(pos == 0) {
                    Intent intent = new Intent(lagu_nasional.this, Idn_raya.class);
                    startActivity(intent);
                }
                else if(pos == 1) {
                    Intent intent = new Intent(lagu_nasional.this, Garuda.class);
                    startActivity(intent);
                }
                else if(pos == 2) {
                    Intent intent = new Intent(lagu_nasional.this, Cipta.class);
                    startActivity(intent);
                }
                else if(pos == 3) {
                    Intent intent = new Intent(lagu_nasional.this, Syukur.class);
                    startActivity(intent);
                }
                else if(pos == 4) {
                    Intent intent = new Intent(lagu_nasional.this, satu_nusa.class);
                    startActivity(intent);
                }
                else if(pos == 5) {
                    Intent intent = new Intent(lagu_nasional.this, rayuan.class);
                    startActivity(intent);
                }
                else if(pos == 6) {
                    Intent intent = new Intent(lagu_nasional.this, Merdeka.class);
                    startActivity(intent);
                }
                else if(pos == 7) {
                    Intent intent = new Intent(lagu_nasional.this, Halo_bandung.class);
                    startActivity(intent);
                }
                else if(pos == 8) {
                    Intent intent = new Intent(lagu_nasional.this, Bagimu_negri.class);
                    startActivity(intent);
                }
                else if(pos == 9) {
                    Intent intent = new Intent(lagu_nasional.this, tumpah_darah.class);
                    startActivity(intent);
                }
            }
        });
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