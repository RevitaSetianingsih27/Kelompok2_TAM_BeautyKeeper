package com.example.myapplication;

import java.util.ArrayList;

class ItemBodycare {

    static int[] iconList = {
            R.drawable.bodylotion_champagne , R.drawable.bodylotion_scarlettromansa , R.drawable.bodymilk_topicrem,
            R.drawable.bodymist_eskulin , R.drawable.bodymist_herborist, R.drawable.bodymist_wardah,
            R.drawable.bodyoil_ovale, R.drawable.bodyoil_wardah,R.drawable.bodyserum_nature,
            R.drawable.bodylotion_scarlettfresh, R.drawable.bodylotion_scarlettjolly, R.drawable.bodyserum_laguna,
            R.drawable.bodyserum_mineral, R.drawable.bodyscrub_bodyshop, R.drawable.bodyscrub_scarlettmango,
            R.drawable.bodyscrub_scarlettpome, R.drawable.bodyscrub_scarlettpomegrante, R.drawable.bodyscrub_scarlettromansa,
            R.drawable.bodyserum_franklin
    };

    static String[] Headline = {"BBW Champagne Toast Body Lotion", "Scarlett Whitening Body Lotion - Romansa", "Topicrem Essentials Ultra-Moisturizing Body Milk",
            "Eskulin Body mist Dazzling purple", "Herborist Minyak Zaitun Massage Oil", "Wardah Scentsation Body Mist",
            "Ovale Olive Oil", "Wardah Pure Olive Oil", "Natur-E White Brightening Hand & Body Serum",
            "Scarlett Whitening Body Lotion Freshy", "Scarlett Whitening Body Lotion Jolly", "LAGUNA Replenishing Body Serum",
            "Mineral Botanica Body Serum", "The Body Shop Mango Whipped Lotion", "Scarlett Whitening Shower Scrub - Mango",
            "Scarlett Whitening Body Scrub (LULUR) - Pomegrante", "Scarlett Whitening Shower Scrub Pomegranate", "Scarlett Whitening Body Scrub Romansa",
            "East Falls Body Serum"
    };

    static String[] Subhead = {"Rp 125.000/236ml", "Rp 75.000/300ml", "Rp 400.000/500ml", "Rp 21.000/125ml",
            "Rp 25.000", "Rp 96.000/100ml", "Rp 35.000/100ml", "Rp 20.000/50ml", "Rp 52.000/180ml",
            "Rp 75.000/300ml", "Rp 75.000/300ml", "Rp 350.000/60ml", "Rp 86.000/100g", "Rp 200.000/250ml",
            "Rp 75.000/ 300ml", "Rp 75.000/300ml", "Rp 75.000/300ml", "Rp 75.000/50gram", "Rp 540.000/120ml"

    };
    static String[] detail = {
            "Champagne Toast Body Lotion dapat ini cepat menyerap pada kulit, tidak lengket, dan mampu memberikan kelembaban hingga 16 jam, dapat menutrisi kulit, mencerahkan serta memberikan kesan halus pada kulit.",
            "Dapat mencerahkan kulit tubuhmu dengan cepat (dapat dilihat perbedaannya hanya dalam pemakaian pertama), penggunaan secara rutin dapat membantu menutrisi, melembabkan serta mencerahkan kulit tubuh secara lebih maksimal.",
            "Body Milk ini merupakan lotion pelembab dari Perancis yang memiliki tekstur ringan dan menyerap dengan cepat, serta mampu menjaga kelembaban hingga 24 jam. Dapat memperbaiki tingkat kelembaban kulit sehingga kulit jadi halus, lembut dan terlindungi.",
            "Produk ini punya kemasan yang lucu, mungil dan desainnya juga simple, untuk dibawa kemana-mana juga gampang dan gak makan tempat banyak jadi praktis banget, selain itu produk ini salah satu produk lokal yang punya wangi tahan lama lebih dari 4 jam masih terasa loh Ma wanginya dan juga wanginya gak bikin enek, kalem dan segar. Wanginya tahan lama meski parfume ini hanya disemprot dibaju kalau dibadan akan tambah tahan lama. Parfume ini cair banget dan mudah meresap ke badan dan baju jadi wanginya tetap nempel walaupun udah beraktivitas dan kena matahari.",
            "Herborist Minyak Zaitun Massage Oil merupakan minyak zaitun yang dipercaya sebagai pelengkap dasar kosmetik ataupun kesehatan kulit. Perawatan kecantikan ini diperkaya dengan kandungan antioksidan alami dan vitamin E. Hal tersebut membuat minyak yang diekstrak dari buah zaitun menjadi primadona diantara minyak lainnya.",
            "Body Mist terbaru dari Wardah dengan formula baru dan free alcohol. Diformulasikan dengan aroma natural tanpa pewarna sehingga tidak menimbulkan noda pada bagian tubuh maupun baju.",
            "Ovale Olive Oil rerbuat dari minyak buah zaitun yang membantu mengurangi kekeringan pada kulit wajah dan leher, serta menjaga kelembaban dan kehalusannya. Juga bekerja melindungi kelembaban rambut dan kulit kepala.",
            "Pure Olive Oil Wardah bermanfaat untuk yang memiliki permasalahan dengan jerawat dan juga  Produk ini  dapat digunakan langsung ke bibir yang kering, menyamarkan kantung mata yang hitam.",
            "Natur-E White Brightening Hand & Body Serum memiliki Tone-up Effect yang membuat kulit tampak lebih cerah alami pada saat pemakaian pertama. Dan efek mencerahkan diklaim dapat terlihat setelah 28 hari pemakaian. Ditambah meningkatnya kelembapan kulit hanya dalam 10 jam pemakaian.",
            "Scarlett Whitening Body Lotion Freshy memiliki tekstur cream yang cukup kental dengan aroma yang menenangkan. Ketika diaplikasikan di kulit, sehingga akan mendapatkan sensasi rasa segar dan menyenangkan, selai itu dapat mencerahkan dan memutihkan kulit., memproteksi kulit dari gangguan eksternal, serta membebaskan kulit dari kusam dan gelap.",
            "Scarlett Whitening Body Lotion Jolly adalah body lotion yang berguna untuk melembapkan kulit , menutrisi kulit dan mencerahkan kulit yang hadir dengan aroma parfum mewah.",
            "LAGUNA Replenishing Body Serum dapat memberikan nutrisi yang dalam, hidrasi, dan kilau cantik ke kulit dan mengatasi berbagai masalah kulit seperti kusam & kering, kekurangan vitamin dan nutrisi esensial dan kulit kasar.",
            "Body serum dengan tekstur yang lebih kental dan cepat menyerap pada kulit dapat memberikan kelembaban yang lebih tahan lama pada kulit. Selain itu memiliki kandungan instant white yang berfungsi untuk mencerahkan kulit yang kusam secara instant selama beraktifitas di luar ruangan.",
            "Pelembap tubuh bertekstur losion dengan aroma mango yang manis dan menyegarkan. Diperkaya dengan mango seed oil dari India sebagai kandungan pelembap. Membantu melembapkan kulit agar terasa lembut dan segar.",
            "Dibuat khusus untuk kamu yang ingin mencerahkan kulit tubuh, mengandung Glutathione (vitamin pencerah kulit paling cepat di dunia) dan butiran Vitamin E. Juga terdapat butiran scrub yang mampu mengangkat sel kulit mati dan kotoran yang menumpuk di kulit tubuhmu.",
            "Dibuat khusus untuk kamu yang ingin mencerahkan kulit tubuh secara lebih maksimal, mengandung Glutathione (vitamin pencerah kulit paling cepat di dunia) dan butiran Vitamin E. Juga terdapat butiran scrub yang mampu menghidrasi kulit, mengangkat sel kulit mati dan kotoran yang ada di kulit tubuhmu agar menjadi lebih lembut.",
            "Whitening Shower Scrub Pomegranate dibuat khusus untuk kamu yang ingin mencerahkan kulit tubuh, mengandung Glutathione (vitamin pencerah kulit paling cepat di dunia) dan butiran Vitamin E. Juga terdapat butiran scrub yang mampu mengangkat sel kulit mati dan kotoran yang menumpuk di kulit tubuh.",
            "Scarlett Whitening Body Scrub Romansa dengan kandungan glutathione dan vitamin E tidak hanya ampuh mengangkat sel kulit mati, tapi juga meregenerasi kulit, melembapkan, menghaluskan, dan mencerahkan kulit secara maksimal.",
            "Memelihara dan melembabkan kulit Anda dengan East Falls Body Serum alami kami yang menampilkan campuran Lemongrass, Bergamot, dan Clary Sage yang segar dan bersih. Campuran terkonsentrasi minyak hydrating ini dirancang untuk melembutkan dan menghaluskan sekaligus merevitalisasi tekstur."
    };
    static ArrayList<ItemModel> getListData() {
        ArrayList<ItemModel> list = new ArrayList<>();
        for (int position = 0; position < Headline.length; position++) {
            ItemModel dataItem = new ItemModel();
            dataItem.setName(Headline[position]);
            dataItem.setType(Subhead[position]);
            dataItem.setImage(iconList[position]);
            dataItem.setDetail(detail[position]);
            list.add(dataItem);
        }
        return list;
    }
}
