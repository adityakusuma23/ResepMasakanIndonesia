package net.aditkus.resepmasakanindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView deskripsi;
    TextView namaResep;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deskripsi = (TextView)findViewById(R.id.deskripsi);
        namaResep = (TextView)findViewById(R.id.nama_makanan);
        recyclerView = (RecyclerView)findViewById(R.id.rv_resep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[]namaResep = {"Ayam Goreng","Rendang","Gudeg","Sayur Asem","Capcay"};

        String[]deskripsi = {"Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur bumbu lalu digoreng dalam minyak goreng panas. Sementara itu beberapa rumah makan di Indonesia juga menghidangkan ayam goreng tradisional Indonesia seperti Ayam Goreng Suharti dan Mbok Berek.",
                "Rendang (bahasa Minang: Randang) adalah salah satu masakan tradisional Minangkabau yang menggunakan daging dan santan kelapa sebagai bahan utama dengan kandungan bumbu rempah-rempah yang kaya. Masakan dengan citarasa yang pedas ini digemari oleh seluruh kalangan masyarakat, dan dapat ditemukan di seluruh Rumah Makan Padang di Indonesia, Malaysia, ataupun di negara lainnya. Masakan ini kadang lebih dikenal dengan nama Rendang Padang, padahal rendang merupakan masakan khas Minang secara umum.",
                "Gudeg adalah masakan khas Jogjakarta, dibuat dari nangka muda, gula merah dan bumbu yang dimasak hingga berjam-jam. Karena kekhasannya tersebut, jika ke Jogja tanpa makan gudeg, belumlah afdol. Gudeg dimakan bersama nasi dan lauk pelengkapnya untuk menetralisir rasa manis dari gudeg. Lauk yang selalu setia mendampingi gudeg adalah areh (santan kental) dan sambal krecek, tahu atau tempe, telur atau ayam tergantung selera.",
                "Sayur asam atau sayur asem adalah masakan sejenis sayur yang khas Indonesia. Ada banyak variasi lokal sayur asam seperti sayur asam Jakarta (variasi dari orang Betawi di Jakarta), sayur asam kangkung (variasi yang menggunakan kangkung), dan sayur asam ikan asin.",
                "capcay adalah masakan sederhana yang terdiri dari aneka sayuran dipotong kecil-kecil dan kadangkala dimasak dengan baso ikan, baso sapi, udang, dan daging ayam."};

        int [] gambarResep = {R.drawable.ayamgoreng,R.drawable.rendangg,R.drawable.nasgudeg,R.drawable.sayursem,R.drawable.capcay};

        String[] detailResep = {"Bahan-bahan :\t \n" +
                        "4 sayap ayam \n" +
                        "1 sdm garam \n" +
                        "2 kemiri \n" +
                        "2 daun jeruk \n" +
                        "1 cm kunyit \n" +
                        "2 bawang putih \n\n" +
                        "Langkah : \t\n" +
                        "-\tHaluskan bawang putih, kemiri, kunyit dan garam. \n" +
                        "-\tRebus bumbu dan ayam serta daun jeruk, masak hingga ayam empuk. \n" +
                        "-\tSetelah empuk diamkan kurang lebih 10 menit supaya  dingin. \n" +
                        "-\tGoreng hingga kecoklatan lalu angkat, sajikan dengan sambal dan lalapan. \n",
                "Bahan-bahan\t:\n" +
                        "500 gr daging sapi\n" +
                        "1/2 buah kelapa tua dijadikan santan\n" +
                        "1 batang serai (memarkan)\n" +
                        "2 lembar daun salam\n" +
                        "3 lembar daun jeruk\n" +
                        "1 buah jeruk limau/ nipis\n" +
                        "secukupnya Garam & gula merah\n" +
                        "secukupnya Minyak goreng\n" +
                        "Bumbu yg dihaluskan ::\n" +
                        "7 siung bawang merah\n" +
                        "6 siung bawang putih\n" +
                        "1 ons cabai merah\n" +
                        "4 buah cabai rawit (sesuai selera)\n" +
                        "1/2 ruas lengkoas\n" +
                        "1/2 ruas jahe\n" +
                        "1 ruas kunyit\n" +
                        "1 sdt ketumbar\n" +
                        "1 sdt jinten\n" +
                        "1 sdt merica bubuk\n" +
                        "1/4 biji pala\n" +
                        "2 buah kemiri\n\n" +
                        "Langkah :\t\n" +
                        "-\tCuci bersih daging sapi, kemudian lumuri dgn perasan jeruk nipis dan garam secukupnya. Diamkan kurang lebih 5 mnt, lalu cuci kembali & tiriskan.\n" +
                        "-\tRebus daging sapi hingga setengah matang, angkat & sisihkan.\n" +
                        "-\tPanaskan minyak goreng, tumis bumbu yg dihaluskan hingga harum. Tambahkan serai, daun salam & daun jeruk kedalam wajan.\n" +
                        "-\tMasukkan santan kedalam tumisan bumbu. Beri garam & gula merah secukupnya. Aduk rata hingga mendidih. Koreksi rasa.\n" +
                        "-\tMasukkan rebusan daging kedalam bumbu. Aduk terus agar santan tidak pecah. Tunggu hingga kuah menyusut, meresap ke dalam daging & daging empuk.\n" +
                        "\n" +
                        "-\tAngkat lalu sajikan. \n",
                "Bahan-bahan\n" +
                        "1.\t500 gr nangka muda\n" +
                        "2.\t150 gr gula merah\n" +
                        "3.\t1 liter santan kental\n" +
                        "4.\t5 lembar daun salam\n" +
                        "5.\t3 lembar daun jeruk\n" +
                        "6.\t1 Batang serai\n" +
                        "7.\t1 ruas lengkuas\n" +
                        "^ bumbu halus ^\n" +
                        "8.\t5 siung bawang merah\n" +
                        "9.\t3 siung bawang putih\n" +
                        "10.\t2 butir kemiri\n" +
                        "11.\t1 sdt ketumbar\n" +
                        "12.\tSecukupnya gula, garam\n" +
                        "^ pelengkap ^\n" +
                        "13.\tSecukupnya telur yang Sudah direbus\n" +
                        "Langkah\n" +
                        "1.\tRebus nangka muda sebentar saja untuk menghilangkan getahnya. Buang air dan sisihkan.\n" +
                        "2.\tMasukan kedalam panci : daun salam, daun jeruk, serai, lengkuas, gula merah. Kemudian bumbu halus, irisan nangka,lalu siram dengan santan. Tambahkan gula dan garam. Masak dengan api kecil dan tutup rapat sekitar 1-2 jam untuk mendapatkan hasil yang maksimal.\n" +
                        "3.\tJika santan tinggal setengah, masukan telur rebus. Koreksi rasa. Masak sampai air agak mengering. Jika suka yg berkuah, waktu memasak nya dikurangi.\n",
                "Bahan-bahan\n" +
                                "1.\tBahan Isi:\n" +
                                "2.\t2 ikat kangkung (potong dan bersihkan)\n" +
                                "3.\t2 buah timun krai (potong dan bersihkan)\n" +
                                "4.\t10 lonjor kacang panjang (potong dan bersihkan)\n" +
                                "5.\t1/4 buah kol/ kubis (potong dan bersihkan)\n" +
                                "6.\t1 genggam kecambah kedelai (buang ekornya dan bersihkan)\n" +
                                "7.\t1/4 kg daging sapi/ iga sapi\n" +
                                "8.\t2 L air\n" +
                                "Bahan Bumbu:\n" +
                                "9.\t5 siung bawang merah (bersihkan dan iris tipis)\n" +
                                "10.\t2 siung bawang putih (bersihkan dan iris tipis)\n" +
                                "11.\t5 buah belimbing wuluh (potong dan bersihkan)\n" +
                                "12.\t2 ruas lengkuas\n" +
                                "13.\t3 lembar daun salam\n" +
                                "14.\tSecukupnya gula\n" +
                                "15.\tSecukupnya garam\n" +
                                "Langkah\n" +
                                "1.\tDidihkan air bersama daging atau iga.\n" +
                                "2.\tTambahkan semua bahan bumbu kecuali belimbing wuluh, gula dan garam. Tunggu hingga daging empuk.\n" +
                                "3.\tSetelah daging empuk, tambahkan belimbing wuluh. Tunggu hingga 5 menit.\n" +
                                "4.\tMasukkan semua bahan isi.\n" +
                                "5.\tTambahkan gula dan garam, tes rasa.\n" +
                                "6.\tTunggu hingga mendidih. Matikan api.\n" +
                                "7.\tSajikan dengan nasi, sambal terasi, ikan laut, tahu dan tempe goreng agar lebih nikmat \n",
                "Bahan-bahan\n" +
                                "1.\t1/2 ikat sawi hijau butir bawang merah\n" +
                                "2.\t1/2 brokoli (aku pakai brokoli putih)\n" +
                                "3.\t1 buah Wortel kecil\n" +
                                "4.\t3 Sosis ayam\n" +
                                "5.\t3 bakso sapi\n" +
                                "6.\t(iris serong)\n" +
                                "7.\tSaus tiram\n" +
                                "8.\tGaram (secukupnya)\n" +
                                "9.\tGula (secukupnya)\n" +
                                "10.\tiris Bawang bombay (uk.kecil)\n" +
                                "11.\t1 bawang putih (iris tipis)\n" +
                                "12.\t2 sdt minyak\n" +
                                "13.\t1 gelas air\n" +
                                "14.\tBumbu halus :\n" +
                                "15.\t3 butir bawang merah\n" +
                                "16.\tMerica (secukupnya)\n" +
                                "Langkah\n" +
                                "1.\tPanaskan minyak masukan irisan bawang putih dan bawang bombay. Beserta bumbu halus. Tumis hingga harum.\n" +
                                "2.\tMasukan segelas air. Sawi. Brokoli. Wortel. Aduk\n" +
                                "3.\tMasukan sosis, bakso, merica bubuk, garam, gula, saus tiram (icip sesuai selera) aduk. Hidangkan\n"};

        String[] titleBar = {"Ayam Goreng","Rendang","Gudeg","Sayur Asem","Capcay"};


        ArrayList<resep>resepArrayList = new ArrayList<>();

        for (int i = 0; i<namaResep.length;i++) {
            resep resep = new resep(namaResep[i], deskripsi[i], gambarResep[i],detailResep[i],titleBar[i]);
            resepArrayList.add(resep);
        }

        resepAdapter resepAdapter = new resepAdapter(this,resepArrayList);
        recyclerView.setAdapter(resepAdapter);
    }

}
