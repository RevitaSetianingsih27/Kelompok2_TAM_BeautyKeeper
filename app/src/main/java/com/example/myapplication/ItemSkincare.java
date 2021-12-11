package com.example.myapplication;

import java.util.ArrayList;

class ItemSkincare {

    static int[] iconList = {
            R.drawable.facialwash_cosrx , R.drawable.facialwash_scarlett , R.drawable.lipmask_etude ,
            R.drawable.lipmask_laneige , R.drawable.mask_daisy,R.drawable.mask_innisfree, R.drawable.moist_nivea,
            R.drawable.moist_wardah, R.drawable.serum_scarlettbright, R.drawable.serum_scrarlettacne,
            R.drawable.sleepmask_laneige, R.drawable.sleepmask_watermelon, R.drawable.sunscreen_skinaqua,
            R.drawable.sunscreen_wardah, R.drawable.toner_cosrx, R.drawable.serum_somebymi
    };

    static String[] Headline = {"CosrxLow pH Good Morning Cleans", "Scarlett Whitening Facial Wash", "Etude House Cherry Lip gel Patch",
            "Laneige Lip Sleeping Mask", "Daisy Organic Face Mask Green Tea","Innisfree It's Real Squeeze Mask (Greentea)",  "Nivea Soft Moisturizing Cream",
            "Wardah Purifying Moisturizer Gel with Witch Hazel Extract", "Scarlett Whitening Brightly Ever After", "Scarlett Whitening Acne Serum",
            "Laneige Water Sleeping Mask", "GLOW RECIPE Watermelon Glow Sleeping Mask", "Skin Aqua UV Moisture Milk Spf 50+ Pa+++",
            "Wardah UV Shield Light Matte Sun Stick", "COSRX AHA/BHA Clarifying Treatment Toner", "Some by mi Snail Truecica Miracle Serum"
    };

    static String[] Subhead = {"Rp 114.500", "Rp 75.000/100ml", "Rp 35.000", "Rp 46.000/20g", "Rp 15.000/20 gr",
            "Rp 20.000/20ml","Rp 21.000/100ml","Rp 17.500", "Rp 75.000/15ml", "Rp 75.000/15ml", "Rp 28.000/15ml",
            "Rp 388.888", "Rp 48.000/40gr", "Rp 96.000", "Rp 30.000", "520.000/50ml"
    };
    static String[] detail = {
            "Merupakan produk asal Korea Selatan yang menggunakan bahan-bahan alami. Pembersih wajah dengan formula lembut yang bagus digunakan pada pagi hari. Mampu membersihkan kulit sensitif sekalipun dengan lembut berkat kandungannya yang memiliki kadar acid yang mirip dengan kadar pH kulit. Gel cleanser ini mampu menenangkan, mengeksfoliasi, melembapkan sekaligus membersihkan kulit wajah. Mengandung water, Cocamidopropyl Betaine, Sodium Lauroyl Methyl Isethionate, Polysorbate 20, Styrax Japonicus Branch/Fruit/Leaf Extract, Butylene Glycol.",
            "Facial wash ini mengandung Gluthatione, Vitamin E, Rose Petals, Aloe Vera yang bermanfaat untuk menyeimbangkan kelembapan kulit, mencerahkan kulit, menutrisi kulit, mengontrol kadar minyak berlebih, mengecilkan pori-pori, dan membantu menghilangkan jerawat. Cara pakainya, tuangkan facial wash ke tangan secukupnya kemudian aplikasikan ke wajah dengan memijatnya secara lembut.",
            "Mengandung Cherry extracts 10mg. Bentuknya yang seperti bibir dengan tekstur jelly pasti akan membuat kamu gemas. Selain melembabkan, lip mask dari brand kenamaan asal Korea ini juga berfungsi sebagai exfoliator yang mengelupas kulit mati sehingga membuat bibir terlihat lebih cerah.",
            "Laneige Lip Sleeping Mask merupakan produk lip mask yang bisa menghilangkan kulit mati yang kering dan terkelupas selama tidur. Hasilnya bisa bikin bibir  lembut, lembap, dan kenyal di pagi hari.",
            "Daisy Organic Face Mask Greentea merupakan masker dengan mengkombinasikan bahan-bahan natural dan pure permium greentea powder yang berfungsi untuk mengatasi jerawat yang meradang karena mampu menenangkan kulit.",
            "Masker ini akan mencari 'kelembaban' yang akan mewujudkan kondisi kulit yang ideal, innisfree meneliti varietas teh hijau yang unik di Korea, dan setelah menganalisa berbagai bahan aktif akhirnya berhasil membuat Beauty Green Tea yang sangat kaya dengan Amino acid yang sangat efektif sebagai pelembab kulit.",
            "merupakan pelembab yang bisa digunakan pada wajah, tangan, dan anggota tubuh lain. Diklaim dengan formula ringan dan mudah meresap, dilengkapi dengan jojoba oil dan vitamin E untuk kulit lembut, halus, dan segar.",
            "Wardah Purifying Moisturizer Gel merupakan gel pelembab bertekstur ringan untuk menjaga keseimbangan dan kelembapan kulit normal-berminyak. Memiliki kandungan ekstrak witch hazel yang membantu melembabkan sekaligus meringkas pori-pori kulit.",
            "Scarlett Brightly Ever After Serum mengandung Phyto Whitening, Glutathione, Vitamin C, Niacinamide dan Lavender Water yang dapat membantu menutrisi, melembapkan kulit dan memudarkan noda di wajah. Serum ini juga dapat mengontrol kadar minyak berlebih di kulit, membantu mengecilkan pori-pori, menutrisi dan melembapkan kulit serta membuatnya menjadi lebih relaks.",
            "Scarlett Whitening Acne Serum memiliki manfaat yaitu membantu menyembuhkan jerawat meradang, jerawat batu, kulit kemerahan dan iritasi. Membantu meregenerasi dan menjaga kulit yang sensitive tanpa menimbulkan iritasi. Dan membantu mencerahkan kulit secara aman karena menggunakan Liquorice Extract dan Vitamin C yang juga berfungsi sebagai anti oxidant + anti pollution.",
            "Laneige Water Sleeping Mask merupakan sleeping mask yang memiliki kandungan pelembap yang kuat dan dapat membantu kulit terlihat bersih, cerah, dan sehat di keesokkan hari. Adapun sleeping mask ini memiliki manfaat Sleep-tox yang menutrisi kulit seakan kulit wajah sudah beristirahat dengan cukup.",
            "Masker tidur mewah berpori yang menghaluskan dan menyempurnakan kulit, semalaman. Formula anti bantal ini bertindak sebagai masker wajah asam hialuronat yang mencerahkan, diformulasikan dengan Ekstrak Semangka kaya asam amino yang menenangkan, Asam Hyaluronic yang menghidrasi, dan AHA pemurnian pori yang bekerja saat Anda tidur untuk mengelupas dan memperjelas dengan lembut.",
            "SKIN AQUA UV Moisture Milk SPF 50+ merupakan Krim Sunscreen untuk wajah yang dipergunakan untuk melindungi wajah kita dari sengatan matahari, dan selain melindungi wajah dari paparan sinar matahari juga dapat mencerahkan wajah dan mencegah penuaan dini.",
            "Wardah UV Shield Light Matte Sun Stick SPF 50 PA ++++ adalah inovasi sunscreen dalam bentuk stick dengan kemasan yang on the go, diformulasikan dengan Broad Spectrum Protection sehingga 50x lebih optimal, menjaga kulit dari sinar UV A/ UV B serta pancaran blue light berlebih.",
            "AHA/BHA Clarifying Treatment Toner adalah toner yang memiliki beragam manfaatnya seperti mengangkat sel   kulit mati agar wajah lebih cerah, halus, mengurangi garis halus, memudarkan bekas jerawat dan flek, serta untuk salicylic acid bisa membantu mengatasi jerawat dan mengontrol minyak berlebih di kulit.",
            "Serum ini kaya akan Snail Truecica™ (terdiri dari Truecica™ dan filtrat sekresi Siput Hitam) yang merupakan bahan ekslusif Some By Mi. Mampu untuk meregenerasi kulit, menjaga lapisan pelindung kulit, dan menyamarkan bekas jerawat. Memiliki tekstur yang cair dan ringan sehingga mudah terserap oleh kulit tanpa terasa lengket."
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
