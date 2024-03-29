package net.aditkus.resepmasakanindonesia;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {
    TextView tv_detail;
    ImageView img_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

       img_detail = (ImageView)findViewById(R.id.gambar_deskripsi);
        tv_detail = (TextView)findViewById(R.id.isi_resep);

        Intent i = getIntent();


        int Gambar = i.getIntExtra("gambar",0);
        img_detail.setImageResource(Gambar);

        String IsiResep = i.getStringExtra("detailresep");
        tv_detail.setText(IsiResep);

        String judul = i.getStringExtra("menuBar");
        getSupportActionBar().setTitle(judul);
    }
}
