package com.example.movies.datalocal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.movies.R;
import com.example.movies.adapter.RecyclerViewAdapter;
import com.example.movies.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Author by Alif Ayatulloh Ar-Rizqy,Time on 8:04 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class DataMovie extends AppCompatActivity {
    List<MovieModel> listmovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_movie);

        //Ini buat list movie
        listmovie = new ArrayList<>();
        listmovie.add(new MovieModel("Bucin", "Film Bucin bercerita tentang 4 sahabat (Andovi, Tommy, Jovi, dan Chandra) " +
                "yang berusaha keluar dari hubungan yang tidak sehat karena mereka BUCIN (Budak Cinta). Mereka memutuskan untuk " +
                "mengikuti kelas ANTI BUCIN agar mereka bisa menjalankan hubungan yang lebih dewasa, dan tidak diperbudak oleh" +
                " cinta.\n" +
                "\n" +
                "Ternyata metode pengajaran cinta di kelas ini, yang diajar oleh Vania (Susan Sameh), sangatlah ekstrim, malah kelas " +
                "ini mengancam hubungan percintaan dan persahabatan mereka. Akankah mereka lulus dari kelas anti bucin ini?\n",
                "Remaja 13+", "Romance, Drama", R.drawable.bucin, "https://youtu.be/xSdAC9WSJ5s"));
        listmovie.add(new MovieModel("Gretel and Hansel", "Dahulu kala di sebuah desa dongeng yang jauh di sana, " +
                "seorang gadis muda membimbing adik lelakinya ke dalam hutan yang gelap mencari makanan dan pekerjaan, dan " +
                "mereka menemukan sebuah pusat kejahatan yang menakutkan.", "Remaja 13+", "Fantasy, Horror, " +
                "Thiller", R.drawable.gretelandhansel, "https://youtu.be/QZblQLhKcZQ"));
        listmovie.add(new MovieModel("Jexi", "Phil (Adam Devine) memiliki ketergantungan besar dengan ponselnya. Karena hal ini," +
                " ia tidak memiliki teman dan pacar. Saat harus mengganti ponsel pintarnya dengan model terbaru yang canggih dan punya " +
                "fitur asisten virtual (Jexi), hidupnya kini lebih baik. Namun kecerdasan tinggi Jexi perlahan membuat hidup Phil menjadi" +
                " mimpi buruk.", "Remaja 13+", "Comedy, Family", R.drawable.jexi, "https://youtu.be/txSOaY-je-o"));
        listmovie.add(new MovieModel("Killerman", "Moe (Liam Hemsworth) adalah seorang pencuci uang yang melakukan bisnisnya " +
                "di New York. Pada suatu hari, ia terbangun tanpa mengingat apapun dengan uang berjumlah jutaan dollar dan obat-obatan" +
                " terlarang di sisinya. Bingung dengan kondisinya, Moe mencoba mencari jawaban sambil bertahan hidup dari beragam pihak" +
                " yang berusaha memburunya.", "Dewasa 17+", "Action, Crime, Drama", R.drawable.killerman
                , "https://youtu.be/i5niXDUtGEM"));
        listmovie.add(new MovieModel("My Spy", "JJ (Dave Bautista) adalah seorang agen CIA yang sangat hebat. Namun dibalik " +
                "kesangarannya JJ adalah pribadi yang baik. Hal ini terjadi saat ia harus bekerjasama dengan Sophie (Chloe Coleman), " +
                "gadis cantik berusia 9 tahun. Keduanya akan menjadi tim dan memecahkan kasus sulit.", "Remaja 13+",
                "Action, Comedy, Family", R.drawable.myspy, "https://youtu.be/dFGYK-iRMgw"));
        listmovie.add(new MovieModel("Teen Spirit", "Violet (Elle Fanning) gadis pemalu yang berasal dari kota kecil. " +
                "Impiannya adalah menjadi seorang penyanyi terkenal. Dengan bantuan seorang mentor, Violet mengikuti ajang pencarian" +
                " bakat.\n" +
                "Keberhasilan akan mengujinya melewati masa-masa sulit dan menentukan masa depannya sendiri.\n",
                "Dewasa 17+", "Drama, Music", R.drawable.teenspirit, "https://youtu.be/lRPUrnXzqZY"));
        listmovie.add(new MovieModel("Trauma Center", "Madison Taylor (Nicky Whelan) harus melewati malam yang mencekam." +
                " Ia dihadapi dalam kondisi sendirian dan terjebak di rumah sakit.\n" +
                "Diburu oleh dua polisi korup yang ingin membunuhnya. Sementara Det. Wakes (Bruce Willis) berusaha membantunya karena" +
                " Nicky adalah saksi kunci\n" +
                "kasus pembunuhan yang sedang ditangani Wakes.\n", "Dewasa 17+", "Action, Thiller", R.drawable.bucin,"https://youtu.be/Y2DrOhVpPZo"));
        listmovie.add(new MovieModel("Trolls World Tour", "Petualangan Poppy (Anna Kendrick) dan Branch (Justin Timberlake)" +
                " berlanjut. Kali ini mereka menemukan bahwa ada enam suku troll berbeda yang tersebar di enam negeri berbeda.\n" +
                "\n" +
                "Setiap suku juga dikhususkan untuk enam jenis musik yang berbeda. Queen Barb (Rachel Bloom) dan ayahnya, King Thrash (Ozzy Osbourne) dari suku Rock ingin memusnahkan semua genre musik agar bisa berkuasa.\n" +
                "\n" +
                "Misi Poppy dan Branch kali ini menyatukan semua suku dan mengagalkan keinginan suku musik Rock.\n",
                "Semua Umur", "Animation, Comedy", R.drawable.trollsworldtour, "https://youtu.be/yP86-TR6IME"));

        listmovie.add(new MovieModel("My Spy", "JJ (Dave Bautista) adalah seorang agen CIA yang sangat hebat. Namun dibalik " +
                "kesangarannya JJ adalah pribadi yang baik. Hal ini terjadi saat ia harus bekerjasama dengan Sophie (Chloe Coleman)," +
                " gadis cantik berusia 9 tahun. Keduanya akan menjadi tim dan memecahkan kasus sulit.", "Remaja 13+",
                "Action, Comedy, Family", R.drawable.myspy, "https://youtu.be/dFGYK-iRMgw"));
        listmovie.add(new MovieModel("Teen Spirit", "Violet (Elle Fanning) gadis pemalu yang berasal dari kota kecil. " +
                "Impiannya adalah menjadi seorang penyanyi terkenal. Dengan bantuan seorang mentor, Violet mengikuti ajang pencarian bakat.\n" +
                "Keberhasilan akan mengujinya melewati masa-masa sulit dan menentukan masa depannya sendiri.\n",
                "Dewasa 17+", "Drama, Music", R.drawable.teenspirit, "https://youtu.be/lRPUrnXzqZY"));
        listmovie.add(new MovieModel("Trauma Center", "Madison Taylor (Nicky Whelan) harus melewati malam yang mencekam." +
                " Ia dihadapi dalam kondisi sendirian dan terjebak di rumah sakit.\n" +
                "Diburu oleh dua polisi korup yang ingin membunuhnya. Sementara Det. Wakes (Bruce Willis) berusaha membantunya " +
                "karena Nicky adalah saksi kunci\n" +
                "kasus pembunuhan yang sedang ditangani Wakes.\n", "Dewasa 17+", "Action, Thiller", R.drawable.traumacenter, "https://youtu.be/Y2DrOhVpPZo"));
        listmovie.add(new MovieModel("Trolls World Tour", "Petualangan Poppy (Anna Kendrick) dan Branch (Justin Timberlake)" +
                " berlanjut. Kali ini mereka menemukan bahwa ada enam suku troll berbeda yang tersebar di enam negeri berbeda.\n" +
                "\n" +
                "Setiap suku juga dikhususkan untuk enam jenis musik yang berbeda. Queen Barb (Rachel Bloom) dan ayahnya, King Thrash " +
                "(Ozzy Osbourne) dari suku Rock ingin memusnahkan semua genre musik agar bisa berkuasa.\n" +
                "\n" +
                "Misi Poppy dan Branch kali ini menyatukan semua suku dan mengagalkan keinginan suku musik Rock.\n", "Semua " +
                "Umur", "Animation, Comedy", R.drawable.trollsworldtour, "https://youtu.be/yP86-TR6IME"));

        RecyclerView myRecyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter rvAdapter = new RecyclerViewAdapter(this, listmovie);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        myRecyclerView.setAdapter(rvAdapter);
    }
}
