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

public class penjelasan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan);

        Button btnKembali = (Button) findViewById(R.id.btBackMenuUtama);
        btnKembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(penjelasan.this, MenuUtama.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        Bundle extras = this.getIntent().getExtras();

        String judul = extras.getString("judul");
        String isi = extras.getString("isi");
        String isi2 = extras.getString("isi2");
        String isi3 = extras.getString("isi3");
        String isi4 = extras.getString("isi4");
        String isi5 = extras.getString("isi5");
        String isi6 = extras.getString("isi6");
        String isi7 = extras.getString("isi7");
        String url = extras.getString("url");
        String url2 = extras.getString("url2");
        String url3 = extras.getString("url3");
        String url4 = extras.getString("url4");
        String url5 = extras.getString("url5");
        String url6 = extras.getString("url6");
        String url7 = extras.getString("url7");

        TextView tvJudul = (TextView)findViewById(R.id.textView3);
        WebView wvIsi = (WebView)findViewById(R.id.webView4);
        WebView wvIsi2 = (WebView)findViewById(R.id.webView5);
        WebView wvIsi3 = (WebView)findViewById(R.id.webView6);
        WebView wvIsi4 = (WebView)findViewById(R.id.webView7);
        WebView wvIsi5 = (WebView)findViewById(R.id.webView8);
        WebView wvIsi6 = (WebView)findViewById(R.id.webView9);
        WebView wvIsi7 = (WebView)findViewById(R.id.webView10);
        ImageView imgView = (ImageView)findViewById(R.id.gambar1);
        ImageView imgView2 = (ImageView)findViewById(R.id.gambar2);
        ImageView imgView3 = (ImageView)findViewById(R.id.gambar3);
        ImageView imgView4 = (ImageView)findViewById(R.id.gambar4);
        ImageView imgView5 = (ImageView)findViewById(R.id.gambar5);
        ImageView imgView6 = (ImageView)findViewById(R.id.gambar6);
        ImageView imgView7 = (ImageView)findViewById(R.id.gambar7);

        tvJudul.setText(judul);
        wvIsi.loadData("<p style=\"text-align: justify\">" + isi + "</p>", "text/html", "UTF-8");
        wvIsi2.loadData("<p style=\"text-align: justify\">" + isi2 + "</p>", "text/html", "UTF-8");
        wvIsi3.loadData("<p style=\"text-align: justify\">" + isi3 + "</p>", "text/html", "UTF-8");
        wvIsi4.loadData("<p style=\"text-align: justify\">" + isi4 + "</p>", "text/html", "UTF-8");
        wvIsi5.loadData("<p style=\"text-align: justify\">" + isi5 + "</p>", "text/html", "UTF-8");
        wvIsi6.loadData("<p style=\"text-align: justify\">" + isi6 + "</p>", "text/html", "UTF-8");
        wvIsi7.loadData("<p style=\"text-align: justify\">" + isi7 + "</p>", "text/html", "UTF-8");

        Picasso.with(this).load(url).into(imgView);
        Picasso.with(this).load(url2).into(imgView2);
        Picasso.with(this).load(url3).into(imgView3);
        Picasso.with(this).load(url4).into(imgView4);
        Picasso.with(this).load(url5).into(imgView5);
        Picasso.with(this).load(url6).into(imgView6);
        Picasso.with(this).load(url7).into(imgView7);
    }
}
