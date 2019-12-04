package com.harny.valentin.spotifake;

public class Constants {
    public static String DATABASE_NAME = "spotifake.db";
    public static int DATABASE_VERSION = 1;

    // TABLE ALBUM
    public static final String TABLE_NAME_ALBUM = "Album";
    public static final String DATABASE_CREATE_TABLE_ALBUM = "CREATE TABLE "+TABLE_NAME_ALBUM+" (id INTEGER PRIMARY KEY AUTOINCREMENT, titre TEXT, creator TEXT, image BLOB)";
    public static final String TABLE_ALBUM_TITRE = "titre";
    public static final String TABLE_ALBUM_CREATOR = "creator";
    public static final String TABLE_ALBUM_IMAGE = "image";
    public static final String INSERT_ALBUM_VALUES = "INSERT INTO "+TABLE_NAME_ALBUM+" ("+TABLE_ALBUM_TITRE+","+TABLE_ALBUM_CREATOR+","+TABLE_ALBUM_IMAGE+") VALUES " +
            "('RAP FR 2018','Valentin',"+R.drawable.album_rap_fr +")," +
            "('RAP US 2018','Valentin',"+R.drawable.album_rap_us +")," +
            "('OLD RAP FR','Valentin',"+R.drawable.album_old_rap_us +")," +
            "('OLD RAP US','Valentin',"+R.drawable.album_old_rap_fr +")," +
            "('Vieille Musique Soirée','Valentin',"+R.drawable.album_vieille_soiree +")," +
            "('Soirée 2018','Valentin',"+R.drawable.album_soiree+")," +
            "('Electro','Valentin',"+R.drawable.album_electro+")," +
            "('Musique du Nord','Valentin',"+R.drawable.album_nord+")," +
            "('Musique Films','Valentin',"+R.drawable.album_film+")," +
            "('Parodie','Valentin',"+R.drawable.album_parodie+")";

    // TABLE TITRE
    public static final String TABLE_NAME_TITRE = "Titre";
    public static final String DATABASE_CREATE_TABLE_TITRE = "CREATE TABLE "+TABLE_NAME_TITRE+" (id INTEGER PRIMARY KEY AUTOINCREMENT, titre TEXT, author TEXT, url TEXT, album INTEGER, FOREIGN KEY(album) REFERENCES Album(id))";
    public static final String TABLE_TITRE_TITRE = "titre";
    public static final String TABLE_TITRE_AUTHOR = "author";
    public static final String TABLE_TITRE_URL = "url";
    public static final String TABLE_TITRE_ALBUM = "album";
    public static final String INSERT_TITRE_VALUES = "INSERT INTO "+TABLE_NAME_TITRE+" ("+TABLE_TITRE_TITRE+","+TABLE_TITRE_AUTHOR+","+TABLE_TITRE_URL+","+TABLE_TITRE_ALBUM+") VALUES " +
            // RAP FR 2018
            "('Plus tard','Big Flo & Oli','_UgsqtaXiwI', 1)," +
            "('Mauvais','GLK (feat. Ninho)','kISEei2UlXc', 1)," +
            "('Bizness','Lorenzo','OAq4t0n1rkY', 1)," +
            "('Ouais ouais','Zola','ZKnUrhbKL6g', 1)," +
            "('Malabar','Diddi Trix','v0izHVd0X6A', 1)," +
            "('Mama','Maes','9PmlEyJkXU8', 1)," +
            "('Trop beau','Lomepal','o8wpucx7W8M', 1)," +
            "('Le Code','SCH','oAAiRBGY-BI', 1)," +
            "('Train de vie','Koba LaD','IUy2KcZpYMc', 1)," +
            "('Jolie','Shay','phh1aZvUyN8', 1)," +
            "('Poussette','JUL','aebnfmh9qE8', 1)," +
            // RAP US 2018
            "('Going Bad','Meek Mill (feat. Drake)','T3lKEb0Cs94', 2)," +
            "('Drug Addicts','Lil Pump','bnCT0GXgLJg', 2)," +
            "('Kooda','6IX9INE','yz7Cn3pHibo', 2)," +
            "('Look At Me!','XXXTENTACION','wJGcwEv7838', 2)," +
            "('This Is America','Childish Gambino','VYOjWnS4cMY', 2)," +
            "('I Love It','Kanye West & Lil Pump (feat. Adele Givens)','cwQgjq0mCdE', 2)," +
            "('SICKO MODE','Travis Scott (feat. Drake)','6ONRf7h3Mdk', 2)," +
            "('Gods Plan','Drake','xpVfcZ0ZcFM', 2)," +
            "('Better Now','Post Malone','UYwF-jdcVjY', 2)," +
            "('Lucid Dreams','Juice WRLD','mzB1VGEGcSU', 2)," +
            // OLD RAP FR
            "('Freestyle PSG','Niska (feat. Rako, Brigi, Trafiquinté, Madrane)','p-Ylj6ZUmtE', 3)," +
            "('A7','SCH','httfJoffl9E', 3)," +
            "('Gomu Bang','XVBARBAR','kCm9YivDD6U', 3)," +
            "('Freestyle Du Sale','Lorenzo','NG2IUO6bibE', 3)," +
            "('Comme tu veux','DTF','mxqZsnsrcn0', 3)," +
            "('Ma dope','Nekfeu (feat. SPri Noir)','Z68u6dJqoI0', 3)," +
            "('Le coup du patron','Dosseh, Gradur, Joke','pye0xaSmLuw', 3)," +
            "('La bise','Sadek (feat. Brulux)','L4g9gpmQMyg', 3)," +
            "('Jfais mes affaires','Djadja & Dinaz','v2o3in-Aud0', 3)," +
            "('OULOULOU','DABS','rkFXnA436OQ', 3)," +
            "('Toka','Sofiane','XZBU7BWQsZs', 3)," +
            // OLD RAP US
            "('Black And Yellow','Wiz Khalifa','UePtoxDhJSw', 4)," +
            "('50 Cent','In Da Club','OUeaAOIAbXs', 4)," +
            "('Still D.R.E.','Dr. Dre (feat. Snoop Dogg)','_CL6n0FJZpk', 4)," +
            "('All Eyez On Me','2pac','05PCmqjIeNE', 4)," +
            "('Panda','Desiigner','4NJlUribp3c', 4)," +
            "('Ni**as In Paris','Jay-Z & Kanye West','gG_dA32oH44', 4)," +
            "('CoCo','O.T. Genasis','6vYnas6q3Sg', 4)," +
            "('Rap God','Eminem','XbGs_qK2PQA', 4)," +
            "('Swimming Pools','Kendrick Lamar','B5YNiCfWC3A', 4)," +
            "('Mirror','Lil Wayne (feat. Bruno Mars)','OZLUa8JUR18', 4)," +
            // VIEILLE MUSIQUE SOIREE
            "('Ce matin va être une pure soirée','Fatal Bazooka (feat. Big Ali, PZK, Dogg SoSo)','AS4GlgkW5Fc', 5)," +
            "('Nuit de Folie','Début de Soirée','yTzyJ7kDLL4', 5)," +
            "('La queuleuleu','Bézu','9qSGXi8kYVQ', 5)," +
            "('Boogie Wonderland','Earth, Wind & Fire','god7hAPv8f0', 5)," +
            "('Get Lucky','Daft Punk (feat. Pharrell Williams, Nile Rodgers)','5NV6Rdv1a3I', 5)," +
            "('La Macarena','Los Del Rio','anzzNp8HlVQ', 5)," +
            "('Les Démons de Minuit','Images','p_ZxDNZjzVk', 5)," +
            "('YMCA','Village People','CS9OO0S5w2k', 5)," +
            "('Alors On Danse','Stromae','VHoT4N43jK8', 5)," +
            "('Im so excited','The Pointer Sisters','rQqwG_rQx7A', 5)," +
            // SOIREE 2018
            "('Copines','Aya Nakamura','EkGiGf8utCM', 6)," +
            "('Bum Bum Tam Tam','MC Fioti','_P7S2lKif-A', 6)," +
            "('Basique','Orelsan','2bjk26RwjyU', 6)," +
            "('Bad Boy','Marwa Loud','JIoj1RYvz1Y', 6)," +
            "('Bella','MHD','jR3y0bxKAvg', 6)," +
            "('Alright','Jain','MARsW26KXQg', 6)," +
            "('Nuit de Folie','LAlgérino (feat. Soolking)','CRPNcrBAiOc', 6)," +
            "('Solo','Clean Bandit (feat. Demi Lovato)','8JnfIa84TnU', 6)," +
            "('Mad Love','Sean Paul, David Guetta (feat. Becky G)','mlf4bidp2yc', 6)," +
            "('Rise','Jonas Blue (feat. Jack & Jack)','btrzs54s1Rc', 6)," +
            "('Toto et Ninetta','JUL','5SLzAGoR_Is', 6)," +
            // ELECTRO
            "('The Code','W&W, Ummet Ozcan','J0TTXHp1QYc', 7)," +
            "('Mammoth','Dimitri Vegas, MOGUAI, Like Mike','_o-XIryB2gg', 7)," +
            "('TSUNAMI','DVBBS, Borgeous','0EWbonj7f18', 7)," +
            "('Yee','Deorro','jKwmaB6A8KY', 7)," +
            "('Spaceman','Hardwell','7ty7mk3UOmo', 7)," +
            "('Rattle','Bingo Players','FgbFquhbhYA', 7)," +
            "('Pursuit Of Happiness','Kid Cudi (feat. MGMT)','7xzU9Qqdqww', 7)," +
            "('Live The Night','W&W, Hardwell, Lil Jon','30RJIwwH2Zg', 7)," +
            "('Get Loose','Showtek, Noisecontrollers','Sd8HrOLVUtA', 7)," +
            "('Animals','Martin Garrix','gCYcHz2k5x0', 7)," +
            "('Levels','Avicii','_ovdm2yX4MA', 7)," +
            // MUSIQUE DU NORD
            "('On est d Boulogne','Les Fra-Gueules','wINjpRCFHZ0', 8)," +
            "('Va kère eune bière pour tin père','Le Chti Orkestra','4OE_pFlPvnc', 8)," +
            "('Les Corons','Pierre Bachelet','cXARMIQdIpM', 8)," +
            "('Hé Biloute Monte Le Son','CHTI DJ','O_Ty0IO9B80', 8)," +
            "('Mi chui cyhti et ti','Inconnu','wdyC0Oad460', 8)," +
            "('Biloute Ché Mi','Parole de Chti','kHE97p2i5xw', 8)," +
            "('Ché un bon d mi','Raoul et les Capenoules','U_newGM0Yqs', 8)," +
            "('Pot pourri','Les Capenoules','pv0TAV6tdXk', 8)," +
            "('Vous saluent bien','Les Capenoules','FcqHWapucuw', 8)," +
            "('Allez Lensois','Les Leaders','InoZVBIJ2rs', 8)," +
            "('Champions les sang et or','Les Leaders','Ne1vYzjufJE', 8)," +
            // FILMS
            "('Skyfall','Adele','DeumyOzKqgI', 9)," +
            "('GhostBusters Theme Song','GhostBusters','m9We2XsVZfc', 9)," +
            "('The Imperial March','Star Wars','-bzWSJG93P8', 9)," +
            "('Space Jam Theme Song','Space Jam','J9FImc2LOr8', 9)," +
            "('The Back to the Future Theme Song','Back to the Future','e8TZbze72Bc', 9)," +
            "('Pirates des Caraïbes Theme Song','Pirates des Caraïbes','zcQmM0HjMH8', 9)," +
            "('Superman Theme Song','Superman','e9vrfEoc8_g', 9)," +
            "('Harry Potter Theme Song','Harry Potter','Htaj3o3JD8I', 9)," +
            "('Le casse de Brice','Brice de Nice','E7oWe5t6CGk', 9)," +
            "('Le Frunkp','Alphonse Brown','lqeI3MN7Dj8', 9)," +
            // PARODIE
            "('HO MACRON','AYA NAKAMURA','Pld7DioOkp8', 10)," +
            "('MACRON OÙ T ES ?','STROMAE','XncT9JHiv8k', 10)," +
            "('BOBO','NISKA','Xc8g-XELrFY', 10)," +
            "('Chargés comme jamais','MAITRE GIMS','9RSobwrNbqw', 10)," +
            "('RAMENER L ESSENCE A LA MAISON','VEGEDREAM','GwgerMw_y_E', 10)," +
            "('MBAPPE','SOPRANO','xaEujY5M36o', 10)," +
            "('Libérée, Délivrée','Jvous emmerde','s1seMO4Jd2U', 10)," +
            "('Andalouse','Kendji Girafe','3usyiF012ME', 10)," +
            "('Se-Krak','Kaapris','dh7FTk5FJ6M', 10)," +
            "('Maquillée','KEBLACK','GayXNrb-TK4', 10)";
}
