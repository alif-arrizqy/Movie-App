package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Author by Alif Ayatulloh Ar-Rizqy,Time on 8:04 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class MainActivity extends AppCompatActivity {
    List<Movie> listmovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listmovie = new ArrayList<>();
        listmovie.add(new Movie("Bucin", "Film Bucin bercerita tentang 4 sahabat (Andovi, Tommy, Jovi, dan Chandra) yang berusaha keluar dari hubungan yang tidak sehat karena mereka BUCIN (Budak Cinta). Mereka memutuskan untuk mengikuti kelas ANTI BUCIN agar mereka bisa menjalankan hubungan yang lebih dewasa, dan tidak diperbudak oleh cinta.\n" +
                "\n" +
                "Ternyata metode pengajaran cinta di kelas ini, yang diajar oleh Vania (Susan Sameh), sangatlah ekstrim, malah kelas ini mengancam hubungan percintaan dan persahabatan mereka. Akankah mereka lulus dari kelas anti bucin ini?\n", "Remaja 13+", "Romance, Drama", R.drawable.bucin));
        listmovie.add(new Movie("Gretel and Hansel", "Dahulu kala di sebuah desa dongeng yang jauh di sana, seorang gadis muda membimbing adik lelakinya ke dalam hutan yang gelap mencari makanan dan pekerjaan, dan mereka menemukan sebuah pusat kejahatan yang menakutkan.", "Remaja 13+", "Fantasy, Horror, Thiller", R.drawable.gretelandhansel));
        listmovie.add(new Movie("Jexi", "Phil (Adam Devine) memiliki ketergantungan besar dengan ponselnya. Karena hal ini, ia tidak memiliki teman dan pacar. Saat harus mengganti ponsel pintarnya dengan model terbaru yang canggih dan punya fitur asisten virtual (Jexi), hidupnya kini lebih baik. Namun kecerdasan tinggi Jexi perlahan membuat hidup Phil menjadi mimpi buruk.", "Remaja 13+", "Comedy, Family", R.drawable.jexi));
        listmovie.add(new Movie("Killerman", "Moe (Liam Hemsworth) adalah seorang pencuci uang yang melakukan bisnisnya di New York. Pada suatu hari, ia terbangun tanpa mengingat apapun dengan uang berjumlah jutaan dollar dan obat-obatan terlarang di sisinya. Bingung dengan kondisinya, Moe mencoba mencari jawaban sambil bertahan hidup dari beragam pihak yang berusaha memburunya.", "Dewasa 17+", "Action, Crime, Drama", R.drawable.killerman
        ));
        listmovie.add(new Movie("My Spy", "JJ (Dave Bautista) adalah seorang agen CIA yang sangat hebat. Namun dibalik kesangarannya JJ adalah pribadi yang baik. Hal ini terjadi saat ia harus bekerjasama dengan Sophie (Chloe Coleman), gadis cantik berusia 9 tahun. Keduanya akan menjadi tim dan memecahkan kasus sulit.", "Remaja 13+", "Action, Comedy, Family", R.drawable.myspy));
        listmovie.add(new Movie("Teen Spirit", "Violet (Elle Fanning) gadis pemalu yang berasal dari kota kecil. Impiannya adalah menjadi seorang penyanyi terkenal. Dengan bantuan seorang mentor, Violet mengikuti ajang pencarian bakat.\n" +
                "Keberhasilan akan mengujinya melewati masa-masa sulit dan menentukan masa depannya sendiri.\n", "Dewasa 17+", "Drama, Music", R.drawable.teenspirit));
        listmovie.add(new Movie("Trauma Center", "Madison Taylor (Nicky Whelan) harus melewati malam yang mencekam. Ia dihadapi dalam kondisi sendirian dan terjebak di rumah sakit.\n" +
                "Diburu oleh dua polisi korup yang ingin membunuhnya. Sementara Det. Wakes (Bruce Willis) berusaha membantunya karena Nicky adalah saksi kunci\n" +
                "kasus pembunuhan yang sedang ditangani Wakes.\n", "Dewasa 17+", "Action, Thiller", R.drawable.traumacenter));
        listmovie.add(new Movie("Trolls World Tour", "Petualangan Poppy (Anna Kendrick) dan Branch (Justin Timberlake) berlanjut. Kali ini mereka menemukan bahwa ada enam suku troll berbeda yang tersebar di enam negeri berbeda.\n" +
                "\n" +
                "Setiap suku juga dikhususkan untuk enam jenis musik yang berbeda. Queen Barb (Rachel Bloom) dan ayahnya, King Thrash (Ozzy Osbourne) dari suku Rock ingin memusnahkan semua genre musik agar bisa berkuasa.\n" +
                "\n" +
                "Misi Poppy dan Branch kali ini menyatukan semua suku dan mengagalkan keinginan suku musik Rock.\n", "Semua Umur", "Animation, Comedy", R.drawable.trollsworldtour));

        listmovie.add(new Movie("My Spy", "JJ (Dave Bautista) adalah seorang agen CIA yang sangat hebat. Namun dibalik kesangarannya JJ adalah pribadi yang baik. Hal ini terjadi saat ia harus bekerjasama dengan Sophie (Chloe Coleman), gadis cantik berusia 9 tahun. Keduanya akan menjadi tim dan memecahkan kasus sulit.", "Remaja 13+", "Action, Comedy, Family", R.drawable.myspy));
        listmovie.add(new Movie("Teen Spirit", "Violet (Elle Fanning) gadis pemalu yang berasal dari kota kecil. Impiannya adalah menjadi seorang penyanyi terkenal. Dengan bantuan seorang mentor, Violet mengikuti ajang pencarian bakat.\n" +
                "Keberhasilan akan mengujinya melewati masa-masa sulit dan menentukan masa depannya sendiri.\n", "Dewasa 17+", "Drama, Music", R.drawable.teenspirit));
        listmovie.add(new Movie("Trauma Center", "Madison Taylor (Nicky Whelan) harus melewati malam yang mencekam. Ia dihadapi dalam kondisi sendirian dan terjebak di rumah sakit.\n" +
                "Diburu oleh dua polisi korup yang ingin membunuhnya. Sementara Det. Wakes (Bruce Willis) berusaha membantunya karena Nicky adalah saksi kunci\n" +
                "kasus pembunuhan yang sedang ditangani Wakes.\n", "Dewasa 17+", "Action, Thiller", R.drawable.traumacenter));
        listmovie.add(new Movie("Trolls World Tour", "Petualangan Poppy (Anna Kendrick) dan Branch (Justin Timberlake) berlanjut. Kali ini mereka menemukan bahwa ada enam suku troll berbeda yang tersebar di enam negeri berbeda.\n" +
                "\n" +
                "Setiap suku juga dikhususkan untuk enam jenis musik yang berbeda. Queen Barb (Rachel Bloom) dan ayahnya, King Thrash (Ozzy Osbourne) dari suku Rock ingin memusnahkan semua genre musik agar bisa berkuasa.\n" +
                "\n" +
                "Misi Poppy dan Branch kali ini menyatukan semua suku dan mengagalkan keinginan suku musik Rock.\n", "Semua Umur", "Animation, Comedy", R.drawable.trollsworldtour));


        RecyclerView myRecyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter rvAdapter = new RecyclerViewAdapter(this, listmovie);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        myRecyclerView.setAdapter(rvAdapter);
    }
}
