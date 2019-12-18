package putralaksana.puja.belajartentangindonesia;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer soundbackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        soundbackground = MediaPlayer.create(this,R.raw.indonesia);

        soundbackground.setLooping(true);
        soundbackground.setVolume(1,1);
        soundbackground.start();

        Button btnMateri = (Button) findViewById(R.id.btMateri);
        btnMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, materi.class);
                startActivity(intent);
                soundbackground.stop();
            }
        });

        Button btnAbout = (Button) findViewById(R.id.btTentang);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, tentang.class);
                startActivity(intent);
            }
        });

        Button btnExit = (Button) findViewById(R.id.btKeluar);
        btnExit.setOnClickListener(this);

        Button btnLagu = (Button) findViewById(R.id.btLagu);
        btnLagu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, lagu.class);
                startActivity(intent);
                soundbackground.stop();
            }
        });

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btKeluar:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MenuUtama.this);
                keluar.setMessage("Apakah anda yakin ingin keluar?").setCancelable(false).setPositiveButton("Ya",new AlertDialog.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface arg0, int arg1){
                        android.os.Process.killProcess(android.os.Process.myPid());
                        Intent exit = new Intent(Intent.ACTION_MAIN);
                        exit.addCategory(Intent.CATEGORY_HOME);
                        exit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(exit);
                    }
                }).setNegativeButton("Tidak",new AlertDialog.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int arg1){
                        dialog.cancel();
                    }
                });
                AlertDialog dialog1 = keluar.create();
                dialog1.setTitle("Keluar");
                dialog1.show();
                break;
        }
    }
}
