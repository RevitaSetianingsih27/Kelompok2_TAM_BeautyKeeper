package com.example.myapplication;

import java.util.ArrayList;

class ItemMakeup {

    static int[] iconList = {
            R.drawable.lipstik_maybelline , R.drawable.primer_pixi , R.drawable.eyeshadow_focallure ,
            R.drawable.foundie_maybelline ,  R.drawable.bbcream_maybelline, R.drawable.concealer_pixi ,
            R.drawable.foundie_nyx, R.drawable.blush_jafra, R.drawable.liptint_eminamagic,
            R.drawable.liptint_eminaglossy, R.drawable.bbcream_garnier, R.drawable.concealer_pixi2
    };

    static String[] Headline = {
            "Maybeline Superstay Matte Ink", "Pixi Flawlwss Beauty Primer", "Focallure Eyeshadow",
            "Maybeline Superstay 24H Foundation", "Maybeline Dream Fresh BB Cream", "Pixy Concealing Base",
            "NYK Stay Mate but Not Flat Liquid Foundation", "Jafra Long Wear Creme Blush",
            "Emina Magic Potion Liptint", "Emina Glossy Stain", "Garnier Skin Active BB Cream",
            "Pixy petra concealer"
    };

    static String[] Subhead = {
            "Rp 64.000/pcs", "Rp 180.000/12ml", "Rp 170.000", "Rp 229.000/30ml", "Rp 224.000/30ml", "Rp 40.000",
            "Rp 115.000", "Rp 55.000", "Rp 41.000", "Rp 47.000", "Rp 94.000", "Rp 39.000"
    };

    static String[] detail = {
            "Maybelline Super Stay Matte Ink merupakan liquid lipstick dengan tekstur creamy dan hasil matte yang tahan hingga 16 jam pemakaian. Dilengkapi dengan pigmentasi warna yang tinggi dan aplikator berbentuk arrow yang akan memudahkan pengaplikasian secara merata.",
            "Pixi Flawlwss Beauty Primer dapat menghidrasi kulit, memberi  cahaya bersinar sepanjang hari, dan membuat riasan saya tetap bertahan. Terbuat dengan bahan-bahan terbaik untuk kulit mengandung manfaat anti-penuaan dan penunjang kulit yang kuat dan untuk revitalisasi, perlindungan dan anti-penuaan.",
            "Gaya tidak berlebihan, ringkas, berbobot, cantik dan mempesona, kita bisa mendapatkan semua riasan wajah dalam satu palet atau riasan harian. Bubuknya juga seragam, dan ekstensibilitasnya kuat dan berpigmen.",
            "Superstay 24H Foundation adalah foundation cair full coverage dengan hasil matte dari Maybelline. Formula ringan dan tahan lama, sehingga wajah terlihat flawless hingga 24 jam, berdaya cover tinggi namun tetap terasa ringan di kulit.",
            "Maybelline Dream Fresh BB  memiliki manfaat 8-in-1 untuk kulit. Mengaburkan ketidaksempurnaan, meningkatkan, menghidrasi, mencerahkan, menghaluskan, menyempurnakan warna kulit, bebas minyak. Krim BB yang menghidrasi dan melindungi kulit dengan spektrum luas SPF 30.",
            "Concealing Base ini membuat kulit tampak lebih cerah, menjaga kulit dari paparan sinar matahari, menjaga kelembaban kulit, membuat formula menyatu di kulit dengan sempurna.",
            "Stay Matte But Not Flat Liquid Foundation memberikan cakupan penuh dengan hasil akhir matte yang diperkaya mineral. Formula bebas minyak dan berbasis air sangat cocok baik saat berada di studio atau di luar dan sepanjang hari.",
            "Crème Blush menciptakan tampilan yang halus atau berani. Vitamin A, C & E plus Ceramide Triple Complex eksklusif JAFRA memberikan manfaat antioksidan dan kelembapan bebas minyak yang ringan.",
            "mengandung beberapa formula yang memang bertugas untuk melembapkan bibir, mampu menyerap dan membantu penetrasi produk skincare atau makeup tanpa meninggalkan sisa atau rasa lengket.",
            "Emina Glossy Stain punya warna yang cukup pigmented, bisa menutupi dengan semurna warna bibir. dapat memberikan kesan warna bibir yang segar dan merekah. Setelah dipakaipun hasilnya glossy.",
            "Garnier Skin Active BB Cream adalah pelembap harian dengan cakupan yang menyempurnakan kulit untuk memberikan banyak manfaat dalam satu produk.",
            "Base Make Up yang dapat berfungsi sebagai foundation maupun concealer dengan tekstur ringan. Dengan 2-Way Whitening dari paduan Natural Whitening Powder dan Derivate Vitamin C untuk membuat wajah tampak lebih cerah."
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
