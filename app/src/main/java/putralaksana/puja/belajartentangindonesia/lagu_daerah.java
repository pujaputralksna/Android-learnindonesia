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

public class lagu_daerah extends AppCompatActivity {

    private ListView lvItem;
    private String[] lagudaerah = new String[]{ "Anak Kambing Saya","Apuse","Bubuy Bulan","Bungong Jeumpa",
            "Cik Cik Periuk","Gundul Pacul","Kampuang Nan Jauh Di Mato","Si Patokaan","Rasa Sayange",
            "Surilang"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_daerah);

        lvItem = (ListView)findViewById(R.id.lv_Item3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(lagu_daerah.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, lagudaerah);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3){
                if(pos == 0) {
                    Intent intent = new Intent(lagu_daerah.this, kambing.class);
                    startActivity(intent);
                }
                else if(pos == 1) {
                    Intent intent = new Intent(lagu_daerah.this, apuse.class);
                    startActivity(intent);
                }
                else if(pos == 2) {
                    Intent intent = new Intent(lagu_daerah.this, bubuy.class);
                    startActivity(intent);
                }
                else if(pos == 3) {
                    Intent intent = new Intent(lagu_daerah.this, bungong.class);
                    startActivity(intent);
                }
                else if(pos == 4) {
                    Intent intent = new Intent(lagu_daerah.this, periuk.class);
                    startActivity(intent);
                }
                else if(pos == 5) {
                    Intent intent = new Intent(lagu_daerah.this, gundul.class);
                    startActivity(intent);
                }
                else if(pos == 6) {
                    Intent intent = new Intent(lagu_daerah.this, kampuang.class);
                    startActivity(intent);
                }
                else if(pos == 7) {
                    Intent intent = new Intent(lagu_daerah.this, patokaan.class);
                    startActivity(intent);
                }
                else if(pos == 8) {
                    Intent intent = new Intent(lagu_daerah.this, sayange.class);
                    startActivity(intent);
                }
                else if(pos == 9) {
                    Intent intent = new Intent(lagu_daerah.this, surilang.class);
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