package com.example.myapplication;

import java.util.ArrayList;

class ItemHaircare {

    static int[] iconList = {
            R.drawable.shampo_lovepink , R.drawable.shampo_lovebiru , R.drawable.hairserum_votala ,
            R.drawable.hairperfector_olaplex, R.drawable.hairvit_ellips,R.drawable.hairvit_sevichred,
            R.drawable.hairoil_prose, R.drawable.hairmask_pantene, R.drawable.hairserum_gro,
            R.drawable.conditioner_loveblue, R.drawable.hairmask_garnier, R.drawable.shampo_pantene,
            R.drawable.hairmask_naturelab, R.drawable.conditioner_tresemme, R.drawable.conditioner_pantene,
            R.drawable.hairserum_dove, R.drawable.shampo_tresemme, R.drawable.shampo_pantene5in1,
            R.drawable.shampo_tresemmeclean, R.drawable.hairvit_sevichyllw, R.drawable.hairserum_kerastase
    };

    static String[] Headline = {"Love Beuty dan Planet Murumuru Butter & Rose Shampoo",
            "Love Beuty dan Planet Coconut Water & Mimosa Flower Shampoo",
            "Votala Hair Growth Serum", "The Original Olaplex Hair Perfector",
            "Ellips Hair Vitamin Nutri Color", "SEVICH Hair Vitamin Serum Capsule Red version",
            "Prose Hair Oil", "Pantene Soothing Recovery Mask",
            "Vegamour Gro Hair Serum", "Love beauty and planet indian lilac & clove leaf conditioner",
            "Garnier Whole Blends Repairing Mask", "Pantene Beautiful Length Shampoo",
            "Repair Treatment Masque Nature Lab", "Tresemme Keratin Smooth Conditioner",
            "Pantene Sheer Volume Conditioner", "Dove Nourishing Oil Care Serum",
            "Tresemme Keratin Smooth Shampoo", "Pantene Advance Care 5in1 Shampoo",
            "Tresemme Clean & Replenish Shampoo", "SEVICH Hair Vitamin Serum Capsule Yellow version",
            "Kerastase Serum Cicanuit Blond Absolu"
    };

    static String[] Subhead = {"Rp 64.000/400ml", "Rp 64.000/400ml", "Rp 270.000/30ml", "Rp 439.000/100ml",
            "Rp 15.000/6 buah", "Rp 230.000/30pcs", "Rp 648.000", "Rp 162.000/225ml", "Rp 767.000/30ml",
            "Rp 64.000/400ml", "Rp 131.000/300ml", "Rp 20.000/300ml", "Rp 230.000/200ml", "Rp 50.000/400ml",
            "Rp 58.000/525ml", "Rp 150.000/40ml", "Rp 67.000/650ml", "Rp 270.000/1.3liter", "Rp 75.000/650ml",
            "Rp 230.000/30pcs", "Rp 385.000/90ml"
    };
    static String[] detail = {
            "Love Beuty dan Planet Murumuru Butter & Rose Shampoo dapat menutrisi dan melindungi rambut agar tampak sehat berkilau, termasuk rambut yang diwarnai. Dilengkapi dengan kandungan bahan alami Murumuru Butter dari Amazon dan keharuman Bulgarian Rose yang lembut menyegarkan. Mengandung Water, Sodium Laureth Sulfate, Cocamidopropyl Betaine, Sodium Chloride, Glycol Distearate, Perfume, Sodium Benzoate, Citric Acid, Polyquaternium-10, Cocamide MEA, PPG-9, Disodium EDTA, Glycerin, Cocos Nucifera (Coconut) Oil, Astrocaryum Murumuru Seed Butter. Cocok untuk semua jenis rambut.",
            "Love Beuty dan Planet Coconut Water & Mimosa Flower Shampoo membuat rambutmu tampak tebal bervolume dan tidak lepek.Dilengkapi dengan kandungan bahan alami organic Coconut Water dan keharuman Mimosa Flower yang lembut. Mengandung Water, Sodium Laureth Sulfate, Cocamidopropyl Betaine, Sodium Chloride, Perfume, Sodium Benzoate, Citric Acid, PPG-9, Disodium EDTA, Polyquaternium-10, Cocos Nucifera (Coconut) Oil, Glycerin, Cocos Nucifera (Coconut) Water, Acacia Decurrens Flower Extract. Cocok untuk semua jenis rambut",
            "Votala Hair Growth Serum adalah perawatan rambut, paling populer untuk produk  serum pertumbuhan rambut / minyak rambut. Serum ini dirancang untuk merawat dan mengaktifkan folikel rambut yang tidak aktif untuk mendorong pertumbuhan rambut. Mengandung 100% Natural Ingredients: Hair Growth Oil uses ginger, fleece-flower root, angelica, niacinamide, tocopherol (vitamin E), danshen (salvia sclarea) extract. These ingredients promote the healthy development of hair and scalp, resulting in thicker and healthier hair. Cocok untuk Rambut yang sedikit bervolume.",
            "The Original Olaplex Hair Perfector dipakai untuk rambut rusak akibat proses kimia ke rambut seperti bleaching, pewarnaan rambut, paparan sinar matahari, klorin kolam renang, rambut sering di catok dan bonding/ikatan rambut sehingga membuat batang rambut menjadi tipis, cepat patah, megar, kering dan rontok. Produk ini dapat mengurangi kerusakan rambut dan membuat rambut lebih kuat. Mengandung Water (Aqua), Bis-Aminopropyl Diglycol Dimaleate, Propylene Glycol, Cetearyl Alcohol, Behentrimonium Methosulfate, Cetyl Alcohol, Phenoxyethanol, Glycerin, Hydroxyethyl Ethylcellulose, Stearamidopropyl Dimethylamine, Quaternium-91, Sodium Benzoate, Fragrance. Cocok untuk Rambut yang mudah rusak.",
            "Ellips Hair Vitamin Nutri Color dapat merawat rambut yang kusam akibat sinar matahari menutrisi rambut diwarnai dan melindungi kemilau rambut yang diwarnai. Mengandung Cyclopentasiloxane Cyclotetrasiloxane Dimethiconol Fragrance Tocopheryl Acetate Helianthus Annuus Seed Oil Polysilicone-15 Soybean (Glycine Soja) Oil Panthenyl Ethyl Ether Retinyl Palmitate Argania Spinosa Oil Amodimethicone Ascorbyl Palmitate. Cocok untuk Semua jenis rambut.",
            "SEVICH Hair Vitamin Serum sangat memperbaiki rambut rusak, perawatan harian rambut halus dan halus. Bahan utamanya dapat menutrisi dan memperbaiki rambut rapuh dan kasar, menjadikan rambut lebih sehat dan kuat, serta lebih lembut saat disentuh. Mengandung Moroccan oil, jojoba oil, vitamins A, C, E, and vitamin B5. Cocok untuk Rambut yang kering dan rusak.",
            "Prose Hair Oil dapat membantu menutrisi kulit kepala dari dalam, memberikan perlindungan ekstra pada rambut dan serta memperkuat rambut. Mengandung Tsubaki oil, Hazelnut oil, Poppy oil, Cucumber oil. Cocok untuk Semua jenis rambut.",
            "Pantene Soothing Recovery Mask adalah perawatan untuk menjinakkan rambut yang sulit diatur dan mudah kusut. Ini mengunci kelembapan dan membantu mengindahkan rambut. Dengan penggunaan teratur, masker dapat membantu mengubah rambut keriting menjadi tampak lebih sehat, lebih berkilau, dan lebih kuat. Mengandung Water, Stearyl Alcohol, Bis-Aminopropyl Dimethicone, Behentrimonium Chloride, Cetyl Alcohol, Fragrance, Benzyl Alcohol, Disodium EDTA, Histidine Citric, Acid Panthenol, Panthenyl Ethyl Ether, Persea Gratissima (Avocado) Oil Argania Spinosa Kernel Oil. Cocok untuk jenis rambut kering.",
            "Vegamour Gro Hair Serum dilengkapi dengan fitoaktif yang terbukti secara klinis, menangkal racun berbahaya atau hormon sintetis. Dapat memelihara folikel rambut, membantu menghambat produksi DHT, mendukung siklus pertumbuhan rambut yang memanjang dan mempromosikan rambut yang tampak lebih tebal, lebih penuh, dan lebih panjang. Mengandung Water/aqua/eau, butylene glycol, alcohol denat. glycerin, caffeine, polysorbate 20, curcuma longa (tumeric) callus conditioned media, panthenol, disodium edta, limonene, citrus aurantium bergamia (bergamot) peel oil. Cocok untuk Semua jenis rambut.",
            "Diresapi dengan Lilac India, kondisioner ini melembabkan dan membuat rambut Anda terasa super lembut dan halus. Hirup keindahan rambut Anda yang baru dicuci dengan aroma daun cengkeh yang manis dan hangat. Kondisioner ini juga 97% Alami Derived dan bebas kekejaman, bebas paraben, bebas silikon, bebas pewarna, &diformulasikan tanpa phthalates. Mengandung Coconut Oil. Cocok untuk semua jenis rambut.",
            "Garnier Whole Blends Repairing Mask  dipadukan untuk rambut indah alami, setiap hari. Diciptakan perpaduan alami khas dari bahan-bahan pilihan yang dikombinasikan dengan wewangian sensorik yang dipilih untuk merawat rambut. Bahan-bahan pilihan dan wewangian unik ini dicampur ke dalam formula perawatan yang membantu memulihkan kesehatan dan keindahan alami rambut dengan setiap penggunaan. Mengandung water, cetearyl alcohol, behentrimonium chloride, amodimethicone, candelilla cera / candelilla wax, cetyl esters, glycerin, honey, argania spinosa kernel oil, royal jelly, trideceth-6, aloe barbadensis/aloe barbadensis leaf juice, alcohol, propolis extract, isopropyl alcohol. Cocok untuk semua jenis rambut.",
            "Panten Beautiful Length Shampoo membantu memperkuat rambut dari kerusakan yang menyebabkan kerontokan sehingga Anda dapat menumbuhkan rambut lebih lama. Mengandung water, Sodium Laureth Sulfate, Cocamidopropyl Betaine, Sodium Citrate, Sodium Xylenesulfonate, Sodium Lauryl Sulfate, Glycol Distearate, Sodium Chloride, Stearyl Alcohol, Fragrance, Dimethiconol, Cetyl Alcohol, Dimethicone, Sodium Benzoate, Citric Acid. Cocok untuk jenis rambut rontok.",
            "Repair Treatment Masque Nature Lab kembali  dengan Masker Perawatan Perbaikan Sempurna yang mengkondisikan dari akar rambut. Dapat mengembalikan rambut kusam dari kulit kepala ke helai. Rambut rusak terlihat membaik dan rambut baru tumbuh lebih kuat. Mengandung aqua (water, eau), Cetearyl alcohol, Dimethicone, Steartrimonium chloride, Glucose, Phyllostachys pubescens meristem cell lysate, Argania spinosa sprout cell extract, Malus domestica fruit cell culture extract, Vitis vinifera (grape) fruit cell extract, Glutamic acid, Keratin. Cocok untuk jenis rambut rusak.",
            "Kondisioner kualitas salon dengan Hydrolyzed Keratin yang dapat memberikan rambut lembut dan tahan lama. Dapat mengatasi rambut kering dan sulit diatur. Rasakan perawatan rambut ala salon di rumah setiap hari. Mengandung water, Cetearyl Alcohol, Behentrimonium Chloride, Dimethicone, Perfume, Dipropylene Glycol, Stearamidopropyl Dimethylamine, Amodimethicone, Sodium chloride, Lactic acid, Disodium EDTA, Phenoxyethanol, PEG-7 Propylheptyl Ether, Cetrimonium Chloride, Magnesium Nitrate. Cocok untuk semua jenis rambut.",
            "Pantene Sheer Volume Conditioner memberikan rambut nutrisi yang dibutuhkannya. Membungkus setiap helai dengan nutrisi Pro-V, Pantene Sheer Volume Conditioner memberikan kelembutan dan pengelolaan yang nyata sekaligus memberikan kekuatan pada rambut. Mengandung water, Stearyl Alcohol, Stearamidopropyl Dimethylamine, Cetyl Alcohol, Fragrance, Glutamic Acid, Bis-aminopropyl Dimethicone, Benzyl Alcohol, Citric Acid, Disodium Edta, Histidine. Cocok untuk semua jenis rambut.",
            "Perawatan minyak rambut tanpa bilas memberi nutrisi, melindungi, dan menambah kilau. Mengandung lipid pelembab untuk menembus dan menghaluskan helai rambut. Meninggalkan rambut lebih mudah diatur dan berkilau. Mengandung cyclopentasiloxane, Dimethicone,Amodimethicone, Cyclohexasiloxane, Cyclotetrasiloxane, Perfume,Tocopheryl Acetate, Prunus Amygdalus Dulcis(Sweet Almond) Oil, Cocos Nucifera(Coconut) Oil, Ethylhexyl Methoxycinnamate, Butylated Hydroxytoluene. Cocok untuk semua jenis rambut.",
            "Tresemme Keratin Smooth Shampoo, formulanya yang telah disempurnakan dapat menutrisi secara mendalam hingga 10 lapisan ke dalam inti rambut dan memberikan hasil rambut lembut kualitas salon yang tahan lama sampai 48 jam. Mengandung water, Sodium Laureth Sulfate, Dimethiconol, Cocamidopropyl Betaine, Sodium chloride, Perfume, Citric acid, Gluconolactone, TEA-Dodecylbenzenesulfonate, Carbomer, Amodimethicone, Sodium benzoate, Glycol Distearate, Guar Hydroxypropyltrimonium Chloride, Sodium sulfate. Cocok untuk jenis rambut kering.",
            "Shampoo dari Pantene adalah produk perawatan rambut yang kuat namun lembut untuk semua jenis rambut, bahkan rambut yang diwarnai. Diformulasikan dengan lima manfaat dalam satu, sampo ini memberikan kelembapan, kekuatan terhadap kerusakan, kehalusan, perlindungan ringan dan warna yang cerah. Mengandung water, Sodium Laureth Sulfate, Sodium Citrate,Cocamidopropyl Betaine, Sodium Xylenesulfonate, Sodium Lauryl Sulfate, Stearyl Alcohol, Sodium Chloride, Fragrance, Cetyl Alcohol, Glycerin. Cocok untuk semua jenis rambut.",
            "menguasai keseimbangan antara menghilangkan penumpukan dan mengembalikan kelembapan. Rambut akan terasa bersih, jernih, dan ternutrisi dengan indah. Sampoo akan memperjelas dan dengan lembut menghilangkan penumpukan dan residu berat yang mengurangi kilau rambut. Mengandung water/Aqua, Sodium Laureth Sulfate, Cocamidopropyl Betaine, Sodium Chloride, Perfume/Parfum, Polyquaternium 10, Sodium Benzoate, DMDM Hydantoin, Disodium EDTA, Citric Acid, Magnesium Nitrate, Polysorbate 20, Isopropyl Alcohol, Sodium Acetate. Cocok untuk semua jenis rambut.",
            "SEVICH Hair Vitamin Serum Capsule Yellow dapat melembutkan rambut, menutrisinya dan mempertahankan kelembapannya, rambut terasa lebih sehat, berkilau dan mudah diatur. Mengandung moroccan oil, jojoba oil, vitamins A, C, E, and vitamin B5, Argan Macadamia Avocado Oils, Repair Damaged Hair. Cocok untuk semua jenis rambut.",
            "Serum tanpa krim putih dalam gel ini menghidrasi secara mendalam dan mengembalikan serat yang diputihkan semalaman untuk rambut pirang yang lebih lembut dan sehat keesokan paginya. Konsentrasi tertinggi Asam Hyaluronic dikombinasikan dengan bunga Edelweiss langsung montok, mengurangi kerusakan dan menutup ujung bercabang. Rambut keesokan paginya lembut, terhidrasi dan bebas kusut, bercahaya dengan sentuhan ringan satin. Mengandung hyaluronic Acid, Edelweiss flower, Aqua / Water, Leontopodium Alpinum Flower/Leaf Extract, Citric Acid. Cocok untuk jenis rambut blonde."
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
