package com.bluehat.mystadion.Utils;

import android.widget.ArrayAdapter;

import com.bluehat.mystadion.Model.StadionModel;
import com.bluehat.mystadion.R;

import java.util.ArrayList;

public class StadionData {
    static String title[] = {
            "Stadion Gelora Bung Karno",
            "Stadion Palaran",
            "Gelora Bung Tomo",
            "Stadion Utama Riau",
            "Stadion Jatidiri",
            "Stadion Batakan",
            "Stadion Gelora Sriwijaya",
            "Stadion Si Jalak Harupat",
            "Stadion Gelora Bandung Lautan Api",
            "Stadion Wibawa Mukti",
            "Stadion Maguwoharjo",
            "Stadion Patriot Candrabhaga",
            "Stadion Manahan"
    };

    static int images[][] = {
            {R.drawable.gbk1, R.drawable.gbk2, R.drawable.gbk3},
            {R.drawable.palaran1, R.drawable.palaran2, R.drawable.palaran3},
            {R.drawable.bungtomo1, R.drawable.bungtomo2, R.drawable.bungtomo3},
            {R.drawable.riau1, R.drawable.riau2, R.drawable.riau3},
            {R.drawable.jatidiri1, R.drawable.jatidiri2, R.drawable.jatidiri3},
            {R.drawable.batakan1, R.drawable.batakan2, R.drawable.batakan3},
            {R.drawable.sriwijaya1, R.drawable.sriwijaya2, R.drawable.sriwijaya3},
            {R.drawable.harupat1, R.drawable.harupat2, R.drawable.harupat3},
            {R.drawable.bandung1, R.drawable.bandung2, R.drawable.bandung3},
            {R.drawable.mukti1, R.drawable.mukti2, R.drawable.mukti3},
            {R.drawable.maguwoharjo1, R.drawable.maguwoharjo2, R.drawable.maguwoharjo3},
            {R.drawable.patriot1, R.drawable.patriot2, R.drawable.patriot3},
            {R.drawable.manahan1, R.drawable.manahan2, R.drawable.manahan3},
    };

    static String content[] = {
            "Stadion Utama Gelora Bung Karno adalah sebuah stadion serbaguna di Jakarta, Indonesia yang merupakan bagian dari kompleks olahraga Gelanggang Olahraga Bung Karno. Stadion ini umumnya digunakan sebagai arena pertandingan sepak bola tingkat internasional. Stadion ini dinamai untuk menghormati Soekarno, Presiden Republik Indonesia pertama, yang juga merupakan tokoh yang mencetuskan gagasan pembangunan kompleks olahraga ini. Dalam rangka de-Soekarnoisasi, pada masa Orde Baru, nama stadion ini diubah menjadi Stadion Utama Senayan melalui Keputusan Presiden No. 4/1984. Setelah bergulirnya gelombang reformasi pada 1998, nama Stadion ini dikembalikan kepada namanya semula melalui Surat Keputusan Presiden No. 7/2001.\n" +
                    "\nKetika pertama kali dibuka pada tahun 1962, stadion ini memiliki kapasitas tempat duduk sebesar 110.000. Kapasitas ini telah berkurang dua kali: pertama menjadi 88.083 pada tahun 2006 untuk Piala Asia AFC 2007 dan kedua hingga 77,193 antara 2016 dan 2017 untuk Pesta Olahraga Asia dan Pesta Olahraga Difabel Asia 2018. Dalam renovasi 2016-17, semua bangku penonton diganti dengan kursi tunggal. Kapasitas 88.083 membuatnya menjadi stadion sepak bola asosiasi terbesar ke-7 di dunia. Saat ini, stadion ini merupakan stadion sepak bola asosiasi terbesar ke-28 di dunia dan stadion sepak bola asosiasi terbesar ke-8 di Asia.",
            "Stadion ini dibangun oleh Pemerintah Provinsi Kaltim untuk menghadapi PON XVII dan diresmikan penggunaannya oleh Presiden RI Susilo Bambang Yudhoyono pada tanggal 18 Juni 2008. Stadion ini digunakan sebagai tempat upacara pembukaan PON XVII pada tanggal 5 Juli 2008 dan upacara penutupan PON XVII pada 17 Juli 2008. Selain itu stadion ini juga ditunjuk oleh PSSI menggelar babak final dan 8 besar Divisi Utama Liga Indonesia 2008.Stadion ini Juga sudah dipakai oleh Klub Putra Samarinda pada Putaran ke 2 Indonesia Super League 2014.",
            "Stadion Gelora Bung Tomo adalah sebuah stadion serbaguna di Surabaya, Indonesia yang merupakan bagian dari kompleks olahraga Surabaya Sport Center. Stadion ini dibuka pada 6 Agustus 2010. Keseluruhan komplek olahraga sedang dibangun. Stadion ini digunakan untuk pertandingan sepak bola dan menjadi basis baru bagi Persebaya Surabaya, menggantikan Stadion Gelora 10 November. Stadion Gelora Bung Tomo sendiri dapat menampung 60.000 penonton.",
            "Stadion Utama Riau adalah sebuah stadion serbaguna di Pekanbaru, Riau, Indonesia . Setelah selesai pada tahun 2012, maka akan digunakan terutama untuk pertandingan sepak bola dan akan menjadi tuan rumah upacara pembukaan dan penutupan Pekan Olahraga Nasional 2012. Stadion ini mampu menampung 44.000 penonton & menghabiskan dana hingga Rp 1,18 triliun .Stadion ini dibangun pada tahun 2009 dan akan selesai pada tahun 2012 sebelum pembukaan PON 18 2012 yang dilaksanakan di Riau.\n" +
                    "Stadion ini juga menjadi tempat Kualifikasi Kejuaraan U-22 AFC 2013. Stadion ini akan mulai digunakan kembali pada 2017 oleh PSPS untuk Liga 2. PSPS mendaftarkan Stadion Utama menjadi salah satu stadion yang digunakan pada laga Liga 2, stadion lainnya adalah Stadion Kaharuddin Nasution.\n" +
                    "\nPada tahun 2019, dilaporkan bahwa kondisi stadion dalam keadaaan yang memprihatinkan, di mana terjadi kerusakan dan vandalisme pada berbagai sudut stadion.",
            "Stadion Jatidiri adalah sebuah stadion yang terletak di Kota Semarang, Jawa Tengah. Letaknya di bagian selatan Kota Semarang, tepatnya daerah Karangrejo, Kecamatan Gajahmungkur. Stadion ini merupakan markas dari kesebelasan PSIS Semarang. Kapasitasnya mencapai 21.000 orang. Selain sebuah stadion, dalam satu kompleks ini juga terdapat GOR (Gedung Olah Raga), kolam renang, dan sarana olahraga lainnya. Stadion Jatidiri dibangun pada era pemerintahan Gubernur Muhammad Ismail dan diresmikan tahun1991. Tahun 2016 dimulainya renovasi stadion oleh Pemerintah Provinsi Jawa Tengah melalui Gubernur Ganjar Pranowo Stadion dan akan selesai akhir tahun pada 2020, Renovasi terdiri dari drainase dan lapangannya, tribune, atap, dan fasilitas penunjang lain yang nantinya akan menjadi stadion internasional, renovasi juga akan menyeluruh termasuk GOR (sedang pengerjaan), kolam renang, wisma Atlet dll.",
            "Stadion Batakan Jalan Mulawarman, Kelurahan Manggar, Balikpapan Timur, Manggar, Balikpapan Timur, Kota Balikpapan, Kalimantan Timur. " +
                    "Stadion yang rampung dibangun pada tahun 2017 lalu ini menghabiskan biaya konstruksi sebesar Rp 1,4 triliun. "+
                    "Bangku penumpang di Stadion Batakan memiliki kapasitas 42.000 orang. "+
                    "Stadion Batakan menjadi salah satu stadion termegah di Indonesia dan bertaraf internasionla. " +
                    "Desain Stadion Batakan mirip seperti Stadion Emirates milik klub Arsenal, London, Inggris. " +
                    "Stadion Batakan juga merupakan markas klub sepak bola Persiba Balikpapan.",
            "Stadion Gelora Sriwijaya (lebih di kenal dengan nama Stadion Jakabaring) adalah stadion multifungsi terbesar ketiga di Indonesia setelah Stadion Utama Gelora Bung Karno dan Stadion Utama Palaran. Berlokasi di Palembang, Indonesia, stadion ini juga diakui sebagai salah satu stadion terbaik yang bertaraf internasional.[butuh rujukan] Kebanyakan, stadion ini difungsikan untuk tempat penyelenggaraan pertandingan-pertandingan sepak bola. Stadion dengan luas lahan sekitar 40 hektar ini dapat memuat hingga 38.000 - 45.000 orang dengan 4 tribun (A, B, C dan D) bertingkat mengelilingi lapangan. Tribun utama di sisi barat dan timur (A dan B) dilindungi atap yang ditopang 2 pelengkung (arch) baja berukuran raksasa. Bentuk atap stadion merupakan simbol kejayaan kemaharajaan",
            "Untuk Si Jalak Harupat sebagai julukan pahlawan nasional Indonesia Oto Iskandar di Nata, lihat Oto Iskandar di Nata.\n" +
                    "Pengembangan Kawasan Olahraga Si Jalak Harupat\n" +
                    "Si Jalak Harupat adalah suatu stadion olahraga yang berlokasi di desa Kopo dan Cibodas, Kecamatan Kutawaringin, Kabupaten Bandung. Nama Si Jalak Harupat diambil dari julukan salah seorang pahlawan nasional dari Bojongsoang, Bandung yaitu Otto Iskandardinata.\n" +
                    "\n" +
                    "Kini stadion tersebut menjadi milik Pemerintah Kabupaten Bandung. Persikab Bandung, yang merupakan wakil Kabupaten Bandung di Liga 3 Indonesia menjadikan stadion tersebut sebagai kandangnya. Begitu pula dengan tim se daerah Bandung Persikab, Persib yang menjadikan stadion ini sebagai homebase mereka di Liga 1 Indonesia.\n" +
                    "\n" +
                    "Stadion ini dibangun mulai Januari 2003 pada saat Kabupaten Bandung dipimpin oleh bupati Obar Sobarna. Selanjutnya diresmikan pada hari jadi Kabupaten Bandung yang ke 364, tanggal 26 April 2005 oleh Agum Gumelar yang menjabat sebagai Ketua Umum Komite Olahraga Nasional Indonesia Pusat.",
            "Stadion Gelora Bandung Lautan Api adalah sebuah stadion olahraga yang berada di Desa Rancanumpang, Kecamatan Gedebage, Kota Bandung, Jawa Barat. Stadion berada di antara ruas Jalan Tol Purwakarta-Bandung-Cileunyi KM 149 dan Jalan Bypass Soekarno-Hatta Bandung. Akses jalan menuju Stadion akan dibuat pintu tol khusus di KM 149 ruas Tol Purbaleunyi dan ruas jalan dari arah Stasiun KA Cimekar dan dari jalan Rancanumpang. Dibuat juga ruas jalan baru menyusuri tol sekitar 2 kilometer, disamping ruas jalan yang sudah ada. Stadion ini menjadi home base bagi klub sepak bola,Persib bersama dengan Stadion Si Jalak Harupat.",
            "Stadion Wibawa Mukti (sebelumnya dikenal dengan Stadion Utama Kabupaten Bekasi) adalah stadion sepak bola yang terletak di Desa Sertajaya, Cikarang Timur, Kabupaten Bekasi. Stadion ini dibangun untuk menjadi tuan rumah Porda Jabar XII tahun 2014 di Kabupaten Bekasi dan tuan rumah PON XIX Jabar 2016 dan kemungkinan akan menjadi salah satu venue sepak bola di asian games 2018 serta direncanakan menjadi kandang untuk klub Persikasi Kabupaten Bekasi di masa mendatang, Stadion ini diperkirakan bisa menampung 30.000 orang dengan bangku single seat, Stadion ini juga memiliki akses transportasi yang sangat baik, salah satunya dekat dengan gerbang tol Cibatu KM 34.7 Jakarta-Cikampek. Hanya kualitas rumputnya saja yang masih dibilang buruk.",
            "Stadion Maguwoharjo (dikenal dengan nama Maguwoharjo International Stadium), adalah stadion sepak bola di Kabupaten Sleman, DI Yogyakarta, yang juga merupakan markas klub sepak bola PSS Sleman. Stadion ini dibangun pada tahun 2005 dan mengalami pembenahan pada tahun 2007 akibat dari gempa bumi yang terjadi pada 27 Mei 2006. Stadion Maguwoharjo memiliki kapasitas maksimal sampai dengan 40.000 penonton. Stadion ini memiliki tipe Stadion Sepak bolaModern dengan konsep “Mini San Siro” dengan ciri khas menara yang terletak di empat penjuru stadion dengan tangga berputarnya. Seperti halnya stadion-stadion modern lain di Eropa terutama di Inggris stadion ini tidak memiliki lintasan atletik sehingga penonton akan lebih nyaman dalam menyaksikan pertandingan.\n" +
                    "\n" +
                    "Stadion yang kabarnya dibangun dengan biaya kurang lebih Rp 100 miliar. Pada awal pembangunannya, Stadion Maguwoharjo belum dilengkapi dengan fasilitas lampu stadion. Sebenarnya pemasangan lampu sudah direncanakan dan dana pun sudah disiapkan oleh pemerintah daerah. Namun, karena adanya bencana gunung merapi yang menimpa Kabupaten Sleman dan sekitarnya, dana yang sedianya digunakan untuk memasang lampu pada stadion dialihkan untuk dana tanggap bencana. Rencana tersebut akhirnya terlaksana pada awal Januari 2013, lampu stadion sudah dipasang disisi timur dan barat sebanyak masing-masing 72 buah.",
            "Stadion Patriot Candrabhaga adalah stadion multi-fungsi di Kota Bekasi, Jawa Barat. Stadion ini lebih sering digunakan dalam pertandingan sepak bola. Stadion dibangun pada tahun 1980 untuk menjadi tuan rumah Pekan Olahraga Daerah (Porda) Jawa Barat IV Tahun 1984. Pada tahun 2012, stadion ini direnovasi menjadi stadion bertaraf internasional yang berkapasitas 30,000 dan diresmikan pada 11 Maret 2014. Stadion ini adalah kandang dari Persipasi Bekasi, Patriot Candrabhaga FC, dan sebagai kandang sementara Persija Jakarta.",
            "Stadion Manahan adalah sebuah stadion sepak bola yang berada di kota Surakarta, Jawa Tengah, Indonesia. Stadion berkapasitas 25.000 penonton ini merupakan markas dari klub Persis Solo. Manahan merupakan stadion pertama di Indonesia yang menjadi tuan rumah event olahraga difabel terbesar di Asia Tenggara ASEAN Para Games 2011. Stadion ini diresmikan pada tanggal 21 Februari 1998 oleh Presiden Republik Indonesia, Soeharto. Saat ini sebagian besar digunakan untuk pertandingan sepak bola dan digunakan sebagai tempat rumah Persis Solo.\n" +
                    "\n" +
                    "Dilihat dari letak geografis, Stadion Manahan di Solo cukup strategis. Berdiri megah di tengah-tengah pusat kota, berdekatan dengan stasiun kereta, terminal,bandara, hotel, jalan raya dan pusat perbelanjaan menjadikan Stadion Manahan sebagai salah satu yang paling representatif dalam menggelar event olahraga skala nasional dan internasional olahraga. Stadion ini terletak di pusat kota Solo, tepatnya di Jalan Adi Sucipto, Manahan, Banjarsari, Solo. Berjarak 9 kilometer dari Bandara Internasional Adisumarmo."
    };

    static String location[] = {
            "Jakarta",
            "Samarinda",
            "Surabaya",
            "Pekanbaru",
            "Semarang",
            "Balikpapan",
            "Palembang",
            "Bandung",
            "Bandung",
            "Kabupaten Bekasi",
            "Sleman",
            "Kota Bekasi",
            "Surakarta"
    };

    static String chairs[] = {
            "88.306",
            "60.000",
            "55.000",
            "45.000",
            "45.000",
            "42.000",
            "40.000",
            "40.000",
            "38.000",
            "35.000",
            "30.000",
            "28.000",
            "25.000"
    };

    public static ArrayList<StadionModel> getListStadion(){
        ArrayList<StadionModel> list = new ArrayList<>();
        for(int i = 0; i < title.length; i++){
            StadionModel stadion = new StadionModel(title[i], content[i], images);
            list.add(stadion);
        }
        return list;
    }

    public StadionModel getOnListStadion(int i){
        StadionModel stadion = new StadionModel(title[i], content[i], chairs[i], location[i], images);

        return stadion;
    }
}
