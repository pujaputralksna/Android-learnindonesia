package putralaksana.puja.belajartentangindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebView;
import com.squareup.picasso.Picasso;

public class penjelasan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan2);

        Button btnKembali = (Button) findViewById(R.id.btBackMenuUtama);
        btnKembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(penjelasan2.this, MenuUtama.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        Bundle extras = this.getIntent().getExtras();

        String judul = extras.getString("judul");
        String isi = extras.getString("isi");
        String url = extras.getString("url");
        String url2 = extras.getString("url2");
        TextView tvJudul = (TextView)findViewById(R.id.textView3);
        WebView wvIsi = (WebView)findViewById(R.id.webView4);
        ImageView imgView = (ImageView)findViewById(R.id.gambar1);
        ImageView imgView2 = (ImageView)findViewById(R.id.gambar2);

        tvJudul.setText(judul);
        wvIsi.loadData("<p style=\"text-align: justify\">" + isi + "</p>", "text/html", "UTF-8");

        Picasso.with(this).load(url).into(imgView);
        Picasso.with(this).load(url2).into(imgView2);
    }
}
