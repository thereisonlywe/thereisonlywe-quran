package info.thereisonlywe.quran;

import info.thereisonlywe.core.essentials.LocaleEssentials;

public class QuranConstants
{
	public static String getSectionMeaning(int sectionNo, String langCode)
	{
		return getSectionMeanings(langCode)[sectionNo - 1];
	}

	public static String getSectionMeaning(int sectionNo)
	{
		return getSectionMeaning(sectionNo, LocaleEssentials.LANGUAGE_DEFAULT);
	}

	public static String[] getSectionMeanings(String langCode)
	{
		if (langCode.equals(LocaleEssentials.LANGUAGE_TURKISH))
		{
			return new String[] { "Açılım", "İnek", "İmran Ailesi", "Kadınlar",
				"Ziyafet", "Davar", "Araf", "Ganimetler", "Tövbe", "Yunus", "Hud",
				"Yusuf", "Gök Gürültüsü", "İbrahim", "Hicr", "Arı", "Gece Yolculuğu",
				"Mağara", "Meryem", "Ta Ha", "Peygamberler", "Hac", "Müminler", "Işık",
				"Furkan", "Şairler", "Karınca", "Tarihi Vakalar", "Dişi Örümcek",
				"Romalılar", "Lokman", "Secde", "Topluluklar", "Sebe", "Yaratan",
				"Ya Sin", "Saf Tutanlar", "Sad", "Yığınlar", "Bağışlayan", "Ayrıntı",
				"Danışma", "Gösteriş", "Duman", "Diz Çöküş", "Kum Tepeleri",
				"Muhammed", "Fetih", "Odalar", "Kaf", "Savuranlar", "Tur Dağı",
				"Yıldız", "Ay", "Rahman", "Olay", "Demir", "Mücadele", "Toplanma",
				"Sorgulanan Kadınlar", "Saf Tutmak", "Cuma", "Münafıklar", "Aldanış",
				"Boşanma", "Yasaklama", "Yönetim", "Kalem", "Gerçekleşen",
				"Yükseliş Yolları", "Nuh", "Cin", "Bürünen", "Gizlenen", "Diriliş",
				"İnsan", "Gönderilenler", "Haber", "Söküp Çıkarılanlar", "Surat Astı ",
				"Dolama", "Parçalanma", "Kandıranlar", "Yarılma", "Burçlar",
				"Sabah Yıldızı", "Yüce", "Kuşatan", "Tan Vakti", "Şehir", "Güneş",
				"Gece", "Kuşluk Vakti", "Ferahlık", "İncir", "Asılıp Tutulan",
				"Kudret, Kader", "Kanıt", "Deprem", "Hırıldayarak Koşanlar",
				"Şiddetli Ses", "Çoğalma", "Zaman", "Dedikoducu", "Fil",
				"Kureyş Toplumu", "Yardımlaşma", "Kevser", "Kâfirler", "Yardım",
				"Hurma Lifi", "İhlas", "Tan", "İnsanlar" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_GERMAN))
		{
			return new String[] { "Die Eröffnung", "Die Kuh", "Die Sippe Imrans",
				"Die Frauen", "Der Tisch", "Das Vieh", "Die Höhen", "Die Beute",
				"Die Buße", "Jonas", "Hud", "Joseph", "Der Donner", "Abraham",
				"Das steinige Land", "Die Biene", "Die nächtliche Reise", "Die Höhle",
				"Maria", "Ta Ha", "Die Propheten", "Die Wallfahrt", "Die Gläubigen",
				"Das Licht", "Die Rettung", "Die Dichter", "Die Ameisen",
				"Die Geschichte", "Die Spinne", "Die Byzantiner", "Luqman",
				"Die Anbetung", "Die Gruppen", "Die Sabäer", "Der Schöpfer", "Ya-Sin",
				"Die in Reih und Glied stehen", "Sad", "Die Scharen", "Der Vergebende",
				"Auseinandergesetzt sind", "Die Beratung", "Der Prunk", "Der Rauch",
				"Das Knien", "Die Dünen", "Mohammed", "Der Erfolg", "Die Gemächer",
				"Qaf", "Das Aufwirbeln", "Der Berg", "Der Stern", "Der Mond",
				"Der Barmherzige", "Die hereinbrechende Katastrophe", "Das Eisen",
				"Der Streit", "Die Versammlung", "Die Prüfung", "Reih und Glied",
				"Der Freitag", "Die Heuchler", "Die Übervorteilung", "Die Entlassung",
				"Das Verbot", "Die Herrschaft", "Die Schreibfeder", "Die Wahrheit",
				"Die Himmelsleiter", "Noah", "Die Jinn", "Der sich eingehüllt hat",
				"Der sich zugedeckt hat", "Die Auferstehung", "Der Mensch",
				"Die Gesandten", "Die Ankündigung", "Die ausziehen",
				"Er zog die Stirne kraus", "Das Einhüllen", "Die Spaltung",
				"Die Betrüger", "Das Zerbrechen", "Die Türme",
				"Der bei Nacht kommende", "Der Allerhöchste", "Die zudecken wird",
				"Die Morgendämmerung", "Die Stadt", "Die Sonne", "Die Nacht",
				"Der Morgen", "Das Weiten", "Die Feigenbäume", "Der Blutklumpen",
				"Die Bestimmung", "Der klare Beweis", "Das Beben", "Das Laufen",
				"Die Polternde", "Die Sucht, mehr zu haben", "Der Nachmittag",
				"Der Stichler", "Der Elefant", "Die Quraisch", "Die Hilfeleistung",
				"Die Fülle", "Die Ungläubigen", "Die Hilfe", "Der Palmfaserstrick",
				"Die Aufrichtigkeit", "Das Frühlicht", "Die Menschheit" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_RUSSIAN))
		{
			return new String[] { "Открывающая Книгу", "Корова", "Семейство Имрана",
				"Женщины", "Трапеза", "Скот", "Преграды", "Трофеи", "Покаяние", "Юнус",
				"Худ", "Юсуф", "Гром", "Ибрахим", "Аль-Хиджр", "Пчёлы",
				"Ночной перенос", "Пещера", "Мариам", "Та Ха", "Пророки",
				"Паломничество", "Верующие", "Свет", "Различение", "Поэты", "Муравьи",
				"Повествование", "Паук", "Римляне", "Лукман", "Поклон", "Сонмы",
				"Саба", "Творец", "Йа Син", "Выстроившиеся в ряды", "Буква Сад",
				"Толпы", "Прощающий", "Разъяснены", "Совет", "Украшения", "Дым",
				"Коленопреклонённые", "Пески", "Мухаммед", "Победа", "Комнаты",
				"Буква Каф", "Рассеивающие", "Гора", "Звезда", "Месяц", "Милостивый",
				"Падающее", "Железо", "Препирающаяся", "Собрание", "Испытуемая",
				"Ряды", "День пятничной молитвы", "Лицемеры", "Раскрытие самообмана",
				"Развод", "Запрещение", "Власть", "Письменная трость", "Неминуемое",
				"Ступени", "Нух", "Джинны", "Закутавшийся", "Завернувшийся",
				"Воскресение", "Человек", "Посылаемые", "Весть", "Исторгающие",
				"Нахмурился", "Скручивание", "Раскалывание", "Обвешивающие",
				"Разверзнется", "Созвездия", "Ночной путник", "Высочайший",
				"Покрывающее", "Заря", "Город", "Солнце", "Ночь", "Утро", "Раскрытие",
				"Смоковница", "Сгусток", "Предопределение", "Ясное знамение",
				"Землетрясение", "Скачущие", "Великое бедствие", "Приумножение",
				"Время", "Хулитель", "Слон", "Курайшиты", "Милостыня", "Каусар",
				"Неверующие", "Помощь", "Пальмовые волокна", "Искренность", "Рассвет",
				"Люди" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_FRENCH))
		{
			return new String[] { "Fatiha, Liminaire", "La vache, La génisse",
				"La famille de ʿImrân", "Les femmes", "La table est servie, La table",
				"Les troupeaux, Le bétail", "Al-aʿrâf, Les redans", "Le butin",
				"L’immunité, Le repentir, La dénonciation", "Jonas", "Hûd", "Joseph",
				"Le tonnerre", "Abraham", "Al-hijr", "Les abeilles",
				"Le voyage nocturne", "La caverne, La grotte", "Marie", "Ta ha",
				"Les prophètes", "Le pèlerinage", "Les croyants", "La lumière",
				"La loi, Le critère, La séparation", "Les poètes", "Les fourmis",
				"Le récit, L’histoire", "L’araignée", "Les romains, Les grecs",
				"Luqman", "La prosternation", "Les factions, Les coalisés", "Saba",
				"Le créateur, Les anges", "Ya sîn",
				"Ceux qui sont placés en rangs, En rangs", "Ṣād",
				"Les groupes, Par vagues", "Celui qui pardonne, Le croyant",
				"Versets clairement exposés, Ils s’articulent",
				"La délibération, La concertation", "L’ornement, Les enjolivures",
				"La fumée", "Celle qui est agenouillée, Assise sur les talons",
				"Al-Ahqâf", "Mahomet", "La victoire, Tout s’ouvre",
				"Les appartements privés", "Qāf",
				"Ceux qui se déplacent rapidement, Vanner", "Le Mont", "L’étoile",
				"La Lune", "Le miséricordieux",
				"Celle qui est inéluctable, L’échéante", "Le fer",
				"La discussion, La protestataire", "Le rassemblement, Le regroupement",
				"L’épreuve, L’examinante", "Le rang, En ligne", "Le vendredi",
				"Les hypocrites", "La duperie réciproque, Alternance dans la lésion",
				"La répudiation", "L’interdiction", "La royauté", "Le calame",
				"Celle qui doit venir, L’inéluctable", "Les degrés, Les paliers",
				"Noé", "Les djinns", "Celui qui s’est enveloppé, L’emmitouflé",
				"Celui qui est revêtu d’un manteau, Il s’est couvert d’une cape",
				"La résurrection", "L’Homme", "Les envoyés, L’Envoi", "L’Annonce",
				"Ceux qui arrachent, Tirer", "Il s’est renfrogné, L’Air sévère",
				"Le décrochement, Le redéploiement", "La rupture du ciel, Se fendre",
				"Les fraudeurs, Les escamoteurs", "La déchirure, La fissuration",
				"Les constellations, Les châteaux",
				"L’astre nocturne, L’arrivant du soir", "Le Très-Haut",
				"Celle qui enveloppe, L’occultante", "L’aube", "La cité, La ville",
				"Le soleil", "La nuit", "La clarté du jour",
				"L’ouverture, L’épanouissement", "Le figuier",
				"Le caillot de sang, L’accrochement", "Le décret, Grandeur",
				"La preuve décisive, Le signe évident", "Le tremblement de terre",
				"Les Coursiers rapides, Galoper", "Celle qui fracasse",
				"La rivalité, Rivaliser par le nombre", "L’instant, Le temps",
				"Le calomniateur, Le Détracteur", "L’éléphant", "Quraysh",
				"Le nécessaire, L’aide", "L’abondance, L’affluence",
				"Al-Kafirun, Les incrédules, les dénégateurs", "Le secours victorieux",
				"La corde, La fibre, Abû Lahab", "Le culte pur, le monothéisme pur",
				"L’aurore, Le point du jour", "Les hommes" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_DUTCH))
		{
			return new String[] { "De Opening", "De Koe", "Imrans Mensen",
				"De Vrouwen", "De Tafel", "Het Vee", "De Kantelen", "De Buit",
				"Het Berouw", "(de profeet) Jonas", "(de profeet) Hud",
				"Jozef (zoon van Jakob)", "De Donder", "Abraham", "Al-Hidjr",
				"De Bijen", "De Nachtreis", "De Grot", "Maryam (Maria)",
				"(de Arabische letters) Ta Ha", "De Profeten", "De Bedevaart",
				"De Gelovigen", "Het Licht", "Het Reddend Onderscheidingsmiddel",
				"De Dichters", "De Mieren", "Het Verhaal", "De Spin", "De Romeinen",
				"Luqman", "De Eerbiedige Neerbuiging", "De Partijen", "Saba (Sheba)",
				"De Engelen", "(de Arabische letters) Ya Sin", "De Zich Opstellenden",
				"(de Arabische letter) Sad", "De Drommen", "Hij Die Vergeeft",
				"Zij Zijn Uiteengezet", "Het Beraad", "Pracht en Praal", "De Rook",
				"De Neergeknielden", "De Zandduinen", "Mohammed", "Het Succes",
				"De Binnenste Vertrekken", "(de Arabische letter) Qaf",
				"De Schiftende Winden", "De Berg", "De Sterren", "De Maan",
				"De Weldadige, de Weldoener", "Het Onvermijdelijke", "IJzer",
				"De Vrouw die pleitte", "Exodus, Ballingschap",
				"De Vrouw die ondervraagd werd", "De Gelederen",
				"Vrijdag, De Bijeenkomst", "De Hypocrieten",
				"Wederzijdse Winst en Verlies", "De Scheiding (Echtscheiding)",
				"Verbod", "Heerschappij", "De Pen", "De Realiteit",
				"De Stijgende Trap(pen), De Hoogte", "(de profeet) Nuh (Noach)",
				"De Djinns", "Degene gekleed in een mantel",
				"Degene omwikkeld met gewaden", "De Wederopstanding", "De Mensheid",
				"De Afgezanten, de Uitgezonden Winden", "De Aankondiging, het Nieuws",
				"Zij die (de ziel) wegrukken (Engelen)", "Hij Fronste",
				"Het Rollen (of Opvouwen, Omverwerpen)", "De Splijting",
				"De Oplichters", "De Scheuring", "De Sterrenstelsels",
				"De Heldere Ster (Nachtkomer)", "De Hoogste", "De Overweldiging",
				"De Dageraad", "De Stad", "De Zon", "De Nacht", "De Voormiddag",
				"Soelaas, Troost", "De Vijg", "De Klonter (Embryo)", "Het Noodlot",
				"Het (duidelijke) Bewijs", "De Aardbeving", "De Renners (Paarden)",
				"De Ramp, Het Uur der Waarheid (Dag des Oordeels)",
				"De Vergaring (van goederen)", "De Namiddag",
				"De Roddelaar, Lasteraar", "De Olifant", "De Qoeraisj",
				"Kleine Vriendelijkheden, Liefdadigheid",
				"De (Rivier/Bron van) Overvloed", "De Ongelovigen", "Goddelijke Hulp",
				"Doorns, Palmvezels", "Oprechtheid", "De Dageraad", "De Mensheid" };
		}
		else
		{
			return new String[] {
				"The Opening",
				"The Calf, The Cow",
				"The Family of Imran, The House of 'Imrán",
				"The Women",
				"The Food, The Repast",
				"The Cattle",
				"The Heights, The Faculty of Discernment",
				"The Spoils of War",
				"The Repentance",
				"Jonah",
				"Hud",
				"Joseph",
				"The Thunder",
				"Abraham",
				"The Rocky Tract, The Stoneland, The Rock City, Al-Hijr",
				"The Honey Bees, The Bee",
				"The Night Journey",
				"The Cave",
				"Mary",
				"Ta-Ha, O Man",
				"The Prophets",
				"The Pilgrimage",
				"The Believers",
				"The Light",
				"The Criterion, The Standard, The Standard of True and False",
				"The Poets",
				"The Ant, The Ants",
				"The Narrations, The Stories, The Story",
				"The Spider",
				"The Romans, The Byzantines",
				"Luqman",
				"The Prostration, Worship, Adoration",
				"The Clans, The Confederates, The Combined Forces",
				"Sheba",
				"The Originator",
				"Ya Sin, O Thou Human Being",
				"Those Who Set The Ranks, Drawn Up In Ranks, Those Ranged in Ranks",
				"Sad",
				"The Crowds, The Troops, Throngs",
				"The Forgiver (God), Forgiving",
				"Expounded, Explained In Detail, Clearly Spelled Out",
				"The Consultation",
				"The Gold Adornments, The Ornaments of Gold, Luxury, Gold",
				"The Smoke",
				"The Kneeling Down, Crouching",
				"Winding Sand-tracts, The Dunes, The Sand-Dunes",
				"Muhammad",
				"The Victory, Conquest",
				"The Private Apartments, The Inner Apartments",
				"Qaf",
				"The Wind That Scatter, The Winnowing Winds, The Dust-Scattering Winds",
				"The Mount, Mount Sinai",
				"The Star, The Unfolding",
				"The Moon",
				"The Most Merciful, The Most Gracious",
				"The Inevitable, The Event, That Which Must Come to Pass",
				"The Iron",
				"The Pleading, The Pleading Woman",
				"The Mustering, The Gathering, Exile, Banishment",
				"The Examined One, She That Is To Be Examined",
				"The Ranks, Battle Array",
				"The Congregation, Friday",
				"The Hypocrites",
				"The Cheating, The Mutual Disillusion, The Mutual Loss and Gain, Loss and Gain",
				"Divorce",
				"The Prohibition",
				"The Dominion, Sovereignty, Control",
				"The Pen",
				"The Sure Reality, The Laying-Bare of the Truth",
				"The Ways of Ascent, The Ascending Stairways",
				"Noah",
				"The Spirits, The Unseen Beings",
				"The Enfolded One, The Enshrouded One, Bundled Up, The Enwrapped One",
				"The One Wrapped Up, The Cloaked One, The Man Wearing A Cloak, The Enfolded One",
				"Resurrection, The Day of Resurrection, Rising Of The Dead",
				"The Human, Man",
				"Those Sent Forth, The Emissaries, Winds Sent Forth",
				"The Great News, The Announcement, The Tiding",
				"Those Who Tear Out, Those Who Drag Forth, Soul-snatchers, Those That Rise",
				"He Frowned",
				"The Folding Up, The Overthrowing, Shrouding in Darkness",
				"The Cleaving Asunder, Bursting Apart",
				"The Dealers in Fraud, Defrauding, The Cheats, Those Who Give Short Measure",
				"The Rending Asunder, The Sundering, Splitting Open, The Splitting Asunder",
				"The Mansions Of The Stars, Constellations, The Great Constellations",
				"The Night-Visitant, The Morning Star, The Nightcomer, That Which Comes in the Night",
				"The Most High, The All-Highest, Glory To Your Lord In The Highest",
				"The Overwhelming Event, The Overshadowing Event, The Pall",
				"The Break of Day, The Daybreak, The Dawn",
				"The City, The Land",
				"The Sun",
				"The Night",
				"The Glorious Morning Light, The Forenoon, Morning Hours, Morning Bright, The Bright Morning Hours",
				"The Expansion of Breast, Solace, Consolation, Relief, Patient, The Opening-Up of the Heart",
				"The Fig Tree, The Fig",
				"The Clinging Clot, Clot of Blood, The Germ-Cell",
				"The Night of Honor, The Night of Decree, Power, Fate, Destiny",
				"The Clear Evidence, The Evidence of the Truth",
				"The Earthquake",
				"The Courser, The Chargers, The War Horse",
				"The Striking Hour, The Great Calamity, The Stunning Blow, The Sudden Calamity",
				"The Piling Up, Rivalry in World Increase, Competition, Greed for More and More",
				"The Time, The Declining Day, The Epoch, The Flight of Time",
				"The Scandalmonger, The Traducer, The Gossipmonger, The Slanderer",
				"The Elephant", "Quraysh",
				"The Neighbourly Assistance, Small Kindnesses, Almsgiving, Assistance",
				"Abundance, Plenty, Good in Abundance",
				"The Disbelievers, The Kafirs, Those Who Deny the Truth",
				"The Help, Divine Support, Victory, Succour",
				"The Plaited Rope, The Palm Fibre, The Twisted Strands",
				"Purity of Faith, The Fidelity, The Declaration of [God's] Perfection",
				"The Daybreak, Dawn, The Rising Dawn", "Mankind, Men" };
		}
	}

	public static String getSectionName(int sectionNo, String langCode)
	{
		return getSectionNames(langCode)[sectionNo - 1];
	}

	public static String getSectionName(int sectionNo)
	{
		return getSectionName(sectionNo, LocaleEssentials.LANGUAGE_DEFAULT);
	}

	public static String[] getSectionNames_Formatted(String langCode)
	{
		String[] list = getSectionNames(langCode);
		for (int i = 0; i < list.length; i++)
			list[i] = (i + 1) + " | " + list[i];
		return list;
	}

	public static String[] getSectionNames_Formatted()
	{
		return getSectionNames_Formatted(LocaleEssentials.LANGUAGE_DEFAULT);
	}

	public static String[] getSectionNames(String langCode)
	{
		if (langCode.equals(LocaleEssentials.LANGUAGE_TURKISH))
		{
			return new String[] { "Fatiha", "Bakara", "Âl-i İmran", "Nisa", "Maide",
				"Enam", "Araf", "Enfal", "Tevbe", "Yunus", "Hud", "Yusuf", "Rad",
				"İbrahim", "Hicr", "Nahl", "İsra", "Kehf", "Meryem", "Taha", "Enbiya",
				"Hac", "Müminun", "Nur", "Furkan", "Şuara", "Neml", "Kasas", "Ankebut",
				"Rum", "Lokman", "Secde", "Ahzab", "Sebe", "Fatır", "Yasin", "Saffat",
				"Sad", "Zümer", "Gafir", "Fussilet", "Şura", "Zuhruf", "Duhan",
				"Casiye", "Ahkaf", "Muhammed", "Fetih", "Hucurat", "Kaf", "Zariyat",
				"Tur", "Necm", "Kamer", "Rahman", "Vakıa", "Hadid", "Mücadile", "Haşr",
				"Mümtehine", "Saff", "Cuma", "Münafikun", "Tegâbun", "Talak", "Tahrim",
				"Mülk", "Kalem", "Hakka", "Mearic", "Nuh", "Cin", "Müzemmil",
				"Müdessir", "Kıyamet", "İnsan", "Mürselat", "Nebe", "Naziat", "Abese",
				"Tekvir", "İnfitar", "Mutaffifin", "İnşikak", "Buruc", "Tarık", "Ala",
				"Ğaşiye", "Fecir", "Beled", "Şems", "Leyl", "Duha", "İnşirah", "Tin",
				"Alak", "Kadr", "Beyyine", "Zilzal", "Adiyat", "Karia", "Tekasür",
				"Asr", "Hümeze", "Fil", "Kureyş", "Maun", "Kevser", "Kâfirun", "Nasr",
				"Mesed", "İhlas", "Felak", "Nas" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_ARABIC)
			|| langCode.equals("ps") || langCode.equals("fa")
			|| langCode.equals("ku") || langCode.equals("ur"))
		{
			return new String[] { "الفاتحة", "البقرة", "آل عمران", "النسآء",
				"المائدة", "الأنعام", "الأعراف", "الأنفال", "التوبة", "يونس", "هود",
				"يوسف", "الرعد", "إبراهيم", "الحجر", "النحل", "الإسراء", "الكهف",
				"مريم", "طه", "الأنبياء", "الحج", "المؤمنون", "النور‎", "الفرقان",
				"الشعراء", "النمل", "القصص", "العنكبوت", "الروم", "لقمان", "السجدة",
				"الأحزاب", "سبأ", "فاطر", "يس", "الصافات", "ص", "الزمر", "غافر",
				"فصلت", "الشورى", "الزخرف", "الدخان", "الجاثية", "الأحقاف", "محمد",
				"الفتح", "الحجرات", "ق", "الذاريات", "الطور", "النجم", "القمر",
				"الرحمن", "الواقعة", "الحديد", " المجادلة", "الحشر", "الممتحنة",
				"الصف", "الجمعة", "المنافقون", "التغابن", "الطلاق", "التحريم", "الملك",
				"القلم", "الحاقة", "المعارج", "نوح", "الجن", "المزمل", "المدثر",
				"القيامة", "الإنسان", "المرسلات", "النبأ", "النازعات", "النازعات",
				"التكوير", "الانفطار", "المطففين", "الانشقاق", "البروج", "الطارق",
				"الأعلى", "الغاشية", "الفجر", "البلد", "لشمس", "الليل", "الضحى",
				"الشرح", "التين", "العلق", "القدر", "البينة", "الزلزلة", "الزلزلة",
				"القارعة", "التكاثر", "العصر", "الهمزة", "الفيل", "قريش", "الماعون",
				"الكوثر", "الكافرون", "النصر", "المسد", "الإخلاص", "الفلق", "الناس" };
		}
		else if (langCode.equals(LocaleEssentials.LANGUAGE_RUSSIAN))
		{
			return new String[] { "Аль-Фатиха", "Аль-Бакара", "Аль Имран", "Ан-Ниса",
				"Аль-Маида", "Аль-Анам", "Аль-Араф", "Аль-Анфаль", "Ат-Тауба", "Йунус",
				"Худ", "Йусуф", "Ар-Раад", "Ибрахим", "Аль-Хиджр", "Ан-Нахль",
				"Аль-Исра", "Аль-Кахф", "Марьям", "Та Ха", "Аль-Анбийа", "Аль-Хадж",
				"Аль-Муминун", "Ан-Нур", "Аль-Фуркан", "Аш-Шуара", "Ан-Намль",
				"Аль-Касас", "Аль-Анкабут", "Ар-Рум", "Лукман", "Ас-Саджда",
				"Аль-Ахзаб", "Саба", "Фатыр", "Йа Син", "Ас-Саффат", "Сад", "Аз-Зумар",
				"Гафир", "Фуссилат", "Аш-Шура", "Аз-Зухруф", "Ад-Духан", "Аль-Джасийа",
				"Аль-Ахкаф", "Мухаммад", "Аль-Фатх", "Аль-Худжурат", "Каф",
				"Аз-Зарийат", "Ат-Тур", "Ан-Наджм", "Аль-Камар", "Ар-Рахман",
				"Аль-Вакиа", "Аль-Хадид", "Аль-Муджадила", "Аль-Хашр", "Аль-Мумтахана",
				"Ас-Сафф", "Аль-Джумуа", "Аль-Мунафикун", "Ат-Тагабун", "Ат-Талак",
				"Ат-Тахрим", "Аль-Мульк", "Аль-Калам", "Аль-Хакка", "Аль-Мааридж",
				"Нух", "Аль-Джинн", "Аль-Муззаммиль", "Аль-Муддассир", "Аль-Кийама",
				"Аль-Инсан", "Аль-Мурсалят", "Ан-Наба", "Ан-Назиат", "Абаса",
				"Ат-Таквир", "Аль-Инфитар", "Аль-Мутаффифин", "Аль-Иншикак",
				"Аль-Бурудж", "Ат-Тарик", "Аль-Аля", "Аль-Гашийа", "Аль-Фаджр",
				"Аль-Балад", "Аш-Шамс", "Аль-Лайл", "Ад-Духа", "Аш-Шарх", "Ат-Тин",
				"Аль-Алак", "Аль-Кадр", "Аль-Баййина", "Аз-Залзала", "Аль-Адийат",
				"Аль-Кариа", "Ат-Такасур", "Аль-Аср", "Аль-Хумаза", "Аль-Филь",
				"Курейш", "Аль-Маун", "Аль-Каусар", "Аль-Кафирун", "Ан-Наср",
				"Аль-Масад", "Аль-Ихлас", "Аль-Фалак", "Ан-Нас" };
		}
		else
		{
			return new String[] { "Al-Fatiha", "Al-Baqara", "Al Imran", "An-Nisa",
				"Al-Ma'ida", "Al-An'am", "Al-A'raf", "Al-Anfal", "At-Tawba", "Yunus",
				"Hud", "Yusuf", "Ar-Ra'd", "Ibrahim", "Al-Hijr", "An-Nahl", "Al-Isra",
				"Al-Kahf", "Maryam", "Ta-Ha", "Al-Anbiya", "Al-Hajj", "Al-Mu'minoon",
				"An-Nur", "Al-Furqan", "Ash-Shu'ara", "An-Naml", "Al-Qasas",
				"Al-Ankabut", "Ar-Rum", "Luqman", "As-Sajda", "Al-Ahzab", "Saba",
				"Fatir", "Ya Sin", "As-Saaffat", "Sad", "Az-Zumar", "Ghafir",
				"Fussilat", "Ash-Shura", "Az-Zukhruf", "Ad-Dukhan", "Al-Jathiya",
				"Al-Ahqaf", "Muhammad", "Al-Fath", "Al-Hujurat", "Qaf", "Adh-Dhariyat",
				"At-Tur", "An-Najm", "Al-Qamar", "Ar-Rahman", "Al-Waqi'a", "Al-Hadid",
				"Al-Mujadila", "Al-Hashr", "Al-Mumtahina", "As-Saff", "Al-Jumua",
				"Al-Munafiqun", "At-Taghabun", "At-Talaq", "At-Tahrim", "Al-Mulk",
				"Al-Qalam", "Al-Haaqqa", "Al-Maarij", "Nuh", "Al-Jinn", "Al-Muzzammil",
				"Al-Muddathir", "Al-Qiyama", "Al-Insan", "Al-Mursalat", "An-Naba",
				"An-Naziat", "Abasa", "At-Takwir", "Al-Infitar", "Al-Mutaffifin",
				"Al-Inshiqaq", "Al-Burooj", "At-Tariq", "Al-Ala", "Al-Ghashiya",
				"Al-Fajr", "Al-Balad", "Ash-Shams", "Al-Lail", "Ad-Dhuha",
				"Al-Inshirah", "At-Tin", "Al-Alaq", "Al-Qadr", "Al-Bayyina",
				"Az-Zalzala", "Al-Adiyat", "Al-Qaria", "At-Takathur", "Al-Asr",
				"Al-Humaza", "Al-Fil", "Quraysh", "Al-Ma'un", "Al-Kawthar",
				"Al-Kafirun", "An-Nasr", "Al-Masadd", "Al-Ikhlas", "Al-Falaq", "Al-Nas" };
		}
	}

	public static int getSectionNumber(int revelationOrder) // revelationOrder >
	// 0
	{
		final int[] tmp = getSectionRevelationOrders();
		for (int i = 0; i < tmp.length; i++)
		{
			if (revelationOrder == tmp[i]) { return i + 1; }
		}
		return -2;
	}

	public static int getSectionRevelationOrder(int sectionNo)
	{
		return getSectionRevelationOrders()[sectionNo - 1];
	}

	public static int[] getSectionRevelationOrders()
	{
		return new int[] { 5, 87, 89, 92, 112, 55, 39, 88, 113, 51, 52, 53, 96, 72,
			54, 70, 50, 69, 44, 45, 73, 103, 74, 102, 42, 47, 48, 49, 85, 84, 57, 75,
			90, 58, 43, 41, 56, 38, 59, 60, 61, 62, 63, 64, 65, 66, 95, 111, 106, 34,
			67, 76, 23, 37, 97, 46, 94, 105, 101, 91, 109, 110, 104, 108, 99, 107,
			77, 2, 78, 79, 71, 40, 3, 4, 31, 98, 33, 80, 81, 24, 7, 82, 86, 83, 27,
			36, 8, 68, 10, 35, 26, 9, 11, 12, 28, 1, 25, 100, 93, 14, 30, 16, 13, 32,
			19, 29, 17, 15, 18, 114, 6, 22, 20, 21 };
	}

	public static int[] getSimilarVerseIndices(int verseIndex)
	{
		if (verseIndex < 1000)
		{
			return getSimilarVerseIndices1000(verseIndex);
		}
		else if (verseIndex < 2000)
		{
			return getSimilarVerseIndices2000(verseIndex);
		}
		else if (verseIndex < 3000)
		{
			return getSimilarVerseIndices3000(verseIndex);
		}
		else if (verseIndex < 4000)
		{
			return getSimilarVerseIndices4000(verseIndex);
		}
		else if (verseIndex < 5000) { return getSimilarVerseIndices5000(verseIndex); }
		return getSimilarVerseIndices6000(verseIndex);
	}

	public static QuranicVerse[] getSimilarVerses(QuranicVerse verse)
	{
		final int[] indices = getSimilarVerseIndices(verse.getIndex());
		if (indices == null) return null;
		final QuranicVerse[] result = new QuranicVerse[indices.length];
		for (int i = 0; i < result.length; i++)
		{
			result[i] = Quran.getVerse(indices[i]);
		}
		return result;
	}

	public static int getVerseCount(int sectionNo)
	{
		return getVerseCounts()[sectionNo - 1];
	}

	public static int[] getVerseCounts()
	{
		return new int[] { 7, 286, 200, 176, 120, 165, 206, 75, 129, 109, 123, 111,
			43, 52, 99, 128, 111, 110, 98, 135, 112, 78, 118, 64, 77, 227, 93, 88,
			69, 60, 34, 30, 73, 54, 45, 83, 182, 88, 75, 85, 54, 53, 89, 59, 37, 35,
			38, 29, 18, 45, 60, 49, 62, 55, 78, 96, 29, 22, 24, 13, 14, 11, 11, 18,
			12, 12, 30, 52, 52, 44, 28, 28, 20, 56, 40, 31, 50, 40, 46, 42, 29, 19,
			36, 25, 22, 17, 19, 26, 30, 20, 15, 21, 11, 8, 8, 19, 5, 8, 8, 11, 11, 8,
			3, 9, 5, 4, 7, 3, 6, 3, 5, 4, 5, 6 };
	}

	public static boolean[] isMeccanSection()
	{
		return new boolean[] { true, false, false, false, false, true, true, false,
			false, true, true, true, false, true, true, true, true, true, true, true,
			true, false, true, false, true, true, true, true, true, true, true, true,
			false, true, true, true, true, true, true, true, true, true, true, true,
			true, true, false, false, false, true, true, true, true, true, false,
			true, false, false, false, false, false, false, false, false, false,
			false, true, true, true, true, true, true, true, true, true, false, true,
			true, true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false, true, true,
			true, true, true, true, true, true, true, true, false, true, true, true,
			true };
	}

	public static boolean isMeccanSection(int sectionNo)
	{
		return isMeccanSection()[sectionNo - 1];
	}

	private static int[] getSimilarVerseIndices1000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 0:
				return new int[] { 3188 };
			case 1:
				return new int[] { 833, 950, 1373, 3202, 3969, 4132, 4197 };
			case 6:
				return new int[] { 68, 268, 280, 283, 446, 569, 737, 840, 1115, 1378,
					2848, 4247, 4522, 5117 };
			case 7:
				return new int[] { 293, 3340, 3409, 3469, 3503 };
			case 8:
				return new int[] { 1400, 3504, 301, 317, 579, 800, 2127, 4278, 4498 };
			case 9:
				return new int[] { 1162, 2629, 4309, 3305, 3518 };
			case 11:
				return new int[] { 3473 };
			case 12:
				return new int[] { 3714 };
			case 13:
				return new int[] { 709, 4608, 16, 120, 468, 483, 595, 701, 1161, 1260,
					1760, 1761, 2006, 4482 };
			case 14:
				return new int[] { 3349, 132, 530, 171, 206, 210, 213, 2597, 2602,
					2605, 3474, 3488 };
			case 15:
				return new int[] { 32, 219, 448, 1501, 3223, 3585, 4163, 4190, 4277,
					4307, 4755, 5090, 5153, 5525 };
			case 16:
				return new int[] { 1311, 13, 448, 709 };
			case 17:
				return new int[] { 3822 };
			case 20:
				return new int[] { 82 };
			case 21:
				return new int[] { 898, 1139, 1374, 2747 };
			case 22:
				return new int[] { 181, 928, 1408 };
			case 24:
				return new int[] { 177 };
			case 27:
				return new int[] { 189, 493 };
			case 29:
				return new int[] { 1401, 1485 };
			case 33:
				return new int[] { 1731 };
			case 34:
				return new int[] { 2660, 3448 };
			case 35:
				return new int[] { 5228 };
			case 40:
				return new int[] { 964, 2089, 2189, 2463 };
			case 41:
				return new int[] { 972 };
			case 42:
				return new int[] { 977 };
			case 44:
				return new int[] { 2470, 737, 836, 988, 4522 };
			case 45:
				return new int[] { 5208, 263, 989, 678, 754, 2651, 5093, 408, 1390,
					1711, 87, 88, 223, 281, 399, 995, 1389, 1495, 2683, 3424, 5120 };
			case 46:
				return new int[] { 53, 128 };
			case 47:
				return new int[] { 712 };
			case 48:
				return new int[] { 363 };
			case 49:
				return new int[] { 89, 116, 283, 569, 1239, 1245, 2635, 2672, 2846,
					5116, 5494 };
			case 53:
				return new int[] { 128, 46 };
			case 54:
				return new int[] { 129, 858, 239 };
			case 55:
				return new int[] { 1094, 1755 };
			case 57:
				return new int[] { 98 };
			case 58:
				return new int[] { 70, 80, 381, 386, 711, 1261, 1643, 1644, 2019, 2795,
					2837 };
			case 59:
				return new int[] { 93, 942, 1582, 2721, 2889, 3294, 3525, 4262 };
			case 63:
				return new int[] { 1113 };
			case 64:
				return new int[] { 1114 };
			case 65:
				return new int[] { 1115, 1118, 3373 };
			case 66:
				return new int[] { 1113 };
			case 68:
				return new int[] { 737, 280, 283, 268 };
			case 69:
				return new int[] { 1124, 99 };
			case 70:
				return new int[] { 575, 2800, 2804, 2810, 2811 };
			case 72:
				return new int[] { 714 };
			case 74:
				return new int[] { 75, 76 };
			case 75:
				return new int[] { 74, 76 };
			case 76:
				return new int[] { 74, 75, 916, 1087, 1683, 1770, 4373 };
			case 79:
				return new int[] { 248, 395, 757, 2851, 5091 };
			case 83:
				return new int[] { 1923, 1477, 3780, 241, 765, 1714, 1991, 2664, 3381,
					5110 };
			case 88:
				return new int[] { 995, 1495, 3397, 31, 549, 614, 3346, 3348, 3666,
					4190, 4293, 4546, 263, 1367, 1772, 2617, 4294, 4556, 4611, 5227, 45,
					87, 223, 281, 283, 349, 399, 408, 665, 677, 761, 989, 1372, 1389,
					1390, 1711, 1735, 2169, 2246, 2345, 2608, 2644, 2650, 2683, 3158,
					3423, 3453, 3476, 3521, 3609, 3993, 3997, 4225, 4297, 4493, 4502,
					5120, 5908, 5919, 6103, 6136, 6178 };
			case 92:
				return new int[] { 1985, 168, 380, 2167, 566, 586, 858, 938, 1289,
					1451, 2823, 3501, 3664 };
			case 94:
				return new int[] { 647, 538 };
			case 95:
				return new int[] { 107 };
			case 98:
				return new int[] { 57, 93, 4166 };
			case 100:
				return new int[] { 5182, 1147 };
			case 101:
				return new int[] { 5183, 252, 1281 };
			case 103:
				return new int[] { 714 };
			case 107:
				return new int[] { 95 };
			case 109:
				return new int[] { 288, 1049, 4307 };
			case 113:
				return new int[] { 1350, 3361, 4302, 3506, 1585, 663, 1308, 3488, 3627 };
			case 116:
				return new int[] { 5494, 5116, 448, 569, 2672 };
			case 118:
				return new int[] { 68, 268, 280, 283, 44, 462, 737, 836, 988, 1425,
					4522, 1722 };
			case 120:
				return new int[] { 709 };
			case 121:
				return new int[] { 252, 253, 267, 355, 365, 722, 2822 };
			case 122:
				return new int[] { 1431 };
			case 123:
				return new int[] { 339, 2284, 3786, 4200 };
			case 125:
				return new int[] { 3683 };
			case 128:
				return new int[] { 53, 46 };
			case 129:
				return new int[] { 54, 858, 239 };
			case 135:
				return new int[] { 456, 5178 };
			case 140:
				return new int[] { 147 };
			case 141:
				return new int[] { 387, 949, 2023 };
			case 142:
				return new int[] { 376 };
			case 145:
				return new int[] { 4286 };
			case 147:
				return new int[] { 140 };
			case 152:
				return new int[] { 808 };
			case 153:
				return new int[] { 1457, 352, 902, 823, 1489, 2648, 3505 };
			case 155:
				return new int[] { 150, 156, 146 };
			case 156:
				return new int[] { 150 };
			case 159:
				return new int[] { 255 };
			case 160:
				return new int[] { 586, 108, 241 };
			case 166:
				return new int[] { 1352 };
			case 167:
				return new int[] { 383, 4578, 379, 748, 1195, 2666, 5117 };
			case 168:
				return new int[] { 380, 92, 1985, 2247, 2522, 3531 };
			case 169:
				return new int[] { 5147 };
			case 172:
				return new int[] { 173, 1945, 3351, 4547 };
			case 174:
				return new int[] { 930, 214 };
			case 175:
				return new int[] { 986, 86, 981, 1431, 1015, 1681, 1691, 36, 596, 663,
					744, 859, 1381, 1469, 1908, 1973, 2548, 2606, 2909, 5039 };
			case 176:
				return new int[] { 772, 3489 };
			case 178:
				return new int[] { 63, 1113, 2428 };
			case 179:
				return new int[] { 671, 933, 2015 };
			case 180:
				return new int[] { 369 };
			case 181:
				return new int[] { 22 };
			case 182:
				return new int[] { 219, 3691 };
			case 187:
				return new int[] { 671, 685, 722, 913, 1212, 2811, 2848, 4495, 4592,
					4612 };
			case 188:
				return new int[] { 179, 671, 707 };
			case 189:
				return new int[] { 184, 674, 842, 288, 446, 539, 800, 2817, 2848, 5176 };
			case 196:
				return new int[] { 755, 201, 223, 268, 461, 535, 586, 599, 670, 722,
					1268, 3995, 5084, 250, 566, 160, 180, 224, 228, 267, 273, 279, 288,
					292, 302, 369, 394, 408, 432, 438, 459, 468, 472, 479, 511, 521, 528,
					534, 541, 567, 568, 569, 576, 581, 594, 629, 652, 659, 660, 665, 676,
					681, 712, 771, 774, 858, 896, 936, 938, 998, 1002, 1039, 1179, 1195,
					1206, 1231, 1238, 1241, 1250, 1254, 1263, 1270, 1272, 1354, 1458,
					1491, 1585, 1726, 1737, 1752, 1935, 1988, 1994, 2016, 2619, 2632,
					2812, 2821, 2823, 2848, 3328, 3331, 3468, 3486, 3571, 3585, 3627,
					3677, 3703, 4118, 4247, 4522, 4545, 4548, 4576, 4577, 4578, 4623,
					4626, 5117, 5157, 5159, 5166, 5196, 5494, 5525 };
			case 198:
				return new int[] { 179, 188, 205, 232, 381, 671, 702, 707, 766, 1228,
					1239, 1333, 1336, 2015, 2795, 2852, 4625, 5115, 5161, 5212, 5494 };
			case 199:
				return new int[] { 1198 };
			case 201:
				return new int[] { 196, 681, 1354 };
			case 205:
				return new int[] { 1239, 5494, 149, 179, 188, 198, 224, 232, 323, 381,
					671, 702, 707, 742, 766, 933, 1228, 1229, 1261, 1333, 1336, 1663,
					2015, 2795, 2812, 2823, 2852, 3687, 4625, 5102, 5115, 5156, 5161,
					5212, 5229 };
			case 207:
				return new int[] { 206, 1109, 308, 1930, 1941, 2022, 5094, 5128 };
			case 208:
				return new int[] { 672, 2829 };
			case 210:
				return new int[] { 2605, 2823 };
			case 213:
				return new int[] { 322, 606, 271, 4582 };
			case 214:
				return new int[] { 174, 930, 2811, 4386 };
			case 218:
				return new int[] { 4067 };
			case 224:
				return new int[] { 1231, 5102, 5494, 255, 568, 722, 769, 1233, 1254,
					1268, 2812, 2823, 2848, 2852, 4626, 5114, 5115, 5156, 5212, 171, 219,
					220, 263, 267, 288, 323, 381, 432, 448, 459, 535, 576, 586, 671, 702,
					703, 723, 742, 763, 1188, 1195, 1229, 1234, 1261, 1272, 1295, 1325,
					1367, 2611, 2652, 2795, 2811, 3585, 4294, 4548, 4556, 4611, 4623,
					5084, 5159, 5229, 5236 };
			case 233:
				return new int[] { 187, 250, 1176, 1212, 4612 };
			case 240:
				return new int[] { 246 };
			case 246:
				return new int[] { 240 };
			case 247:
				return new int[] { 186 };
			case 248:
				return new int[] { 395, 757, 2851, 2849, 79, 193, 225, 272, 2848, 2630,
					5091, 668 };
			case 249:
				return new int[] { 1423, 4193 };
			case 250:
				return new int[] { 196, 187, 230, 233, 237, 252, 267, 279, 722, 1176,
					1212, 1270, 1294, 2811, 4612, 5084, 160, 201, 224, 268, 305, 438,
					449, 459, 461, 566, 567, 568, 576, 581, 586, 587, 592, 1219, 1231,
					1233, 1253, 1254, 1268, 1272, 1275, 1315, 1345, 1354, 2652, 2812,
					4548, 4582, 4626, 5173, 5494 };
			case 251:
				return new int[] { 5085 };
			case 256:
				return new int[] { 439, 292 };
			case 257:
				return new int[] { 2634 };
			case 258:
				return new int[] { 400, 4478 };
			case 260:
				return new int[] { 1780 };
			case 267:
				return new int[] { 365, 722 };
			case 268:
				return new int[] { 280, 283, 68, 461, 4522 };
			case 274:
				return new int[] { 253, 2811 };
			case 280:
				return new int[] { 68, 268, 283, 118, 737, 4522, 44, 462, 836, 988,
					1425, 461, 840, 1780, 3636 };
			case 282:
				return new int[] { 5097 };
			case 283:
				return new int[] { 68, 268, 280, 569, 665, 737, 118, 4293, 4522 };
			case 284:
				return new int[] { 5185, 394, 703, 1353, 3602, 5102, 5143, 422, 535,
					551, 586, 674, 725, 773, 4067 };
			case 286:
				return new int[] { 190 };
			case 287:
				return new int[] { 453, 317, 4494 };
			case 293:
				return new int[] { 7, 3340, 3409, 3469, 3503 };
			case 294:
				return new int[] { 261 };
			case 295:
				return new int[] { 716, 714, 3690, 103, 4539, 219, 5168 };
			case 297:
				return new int[] { 1787, 288, 5131, 1424, 3361 };
			case 301:
				return new int[] { 317, 1737, 4498 };
			case 302:
				return new int[] { 408, 5120, 5525 };
			case 303:
				return new int[] { 1211, 1213 };
			case 304:
				return new int[] { 1197 };
			case 307:
				return new int[] { 490, 6137 };
			case 308:
				return new int[] { 2781, 207, 299, 483, 485, 567, 709, 4139, 5135, 5236 };
			case 311:
				return new int[] { 219, 491 };
			case 313:
				return new int[] { 67, 404, 1268 };
			case 314:
				return new int[] { 348, 383, 1937, 3437, 569, 1303, 1308, 2809, 3589,
					223, 226, 337, 1696, 1717, 1740, 2609, 2804, 2813 };
			case 315:
				return new int[] { 2838 };
			case 317:
				return new int[] { 287, 453 };
			case 323:
				return new int[] { 1229, 2812, 5102, 224, 671, 742, 769, 1188, 1261,
					3603, 5115, 5156, 5212, 5215, 5229, 5422, 5494 };
			case 326:
				return new int[] { 230, 262, 413, 1332, 1337, 2811, 2850 };
			case 332:
				return new int[] { 339, 2257 };
			case 333:
				return new int[] { 2259 };
			case 336:
				return new int[] { 1697 };
			case 337:
				return new int[] { 649, 663 };
			case 338:
				return new int[] { 778 };
			case 340:
				return new int[] { 778 };
			case 343:
				return new int[] { 2285, 4388, 1528, 740, 785, 3765, 4385 };
			case 344:
				return new int[] { 5176 };
			case 345:
				return new int[] { 751 };
			case 346:
				return new int[] { 1189 };
			case 348:
				return new int[] { 314, 383, 1308, 3589, 1937, 3437, 569, 594, 2809,
					4244, 5226 };
			case 349:
				return new int[] { 761, 665, 432, 3453, 31, 283, 677, 1367, 1372, 1495,
					1735, 1772, 2169, 2246, 2345, 2608, 2617, 3158, 3423, 3476, 3521,
					3609, 3993, 3997, 4225, 4294, 4297, 4502, 4556, 4611, 5227, 5908,
					5919, 6103, 6136, 6178, 2845, 3666, 4293, 4493 };
			case 352:
				return new int[] { 1457, 153, 1489, 1856, 2648, 3505 };
			case 354:
				return new int[] { 418, 1753, 2658, 3661 };
			case 359:
				return new int[] { 141, 387, 949, 2023, 3585, 471, 528, 1400, 1760,
					2020, 3379, 3568, 3703, 149, 176, 191, 202, 219, 288, 371, 437, 439,
					453, 494, 498, 514, 516, 521, 524, 535, 584, 586, 594, 599, 619, 772,
					774, 924, 940, 1035, 1039, 1090, 1192, 1194, 1201, 1276, 1304, 1348,
					1349, 1354, 1356, 1382, 1434, 1463, 1489, 1492, 1506, 1589, 1633,
					1663, 1704, 1706, 1744, 1771, 2048, 2059, 2060, 2061, 2062, 2064,
					2072, 2182, 2249, 2277, 2313, 2763, 2872, 2939, 2998, 3034, 3052,
					3070, 3089, 3105, 3121, 3310, 3332, 3417, 3533, 3572, 3587, 3626,
					3650, 3677, 3704, 3817, 4153, 4210, 4291, 4317, 4322, 4656, 5134,
					5620 };
			case 360:
				return new int[] { 218, 750, 1295 };
			case 361:
				return new int[] { 605 };
			case 362:
				return new int[] { 390 };
			case 363:
				return new int[] { 48 };
			case 364:
				return new int[] { 539 };
			case 366:
				return new int[] { 111, 1188, 5095, 5103, 5180 };
			case 368:
				return new int[] { 1238, 1241 };
			case 369:
				return new int[] { 180, 468, 472, 479, 3995 };
			case 370:
				return new int[] { 367, 299, 311, 491 };
			case 376:
				return new int[] { 142 };
			case 377:
				return new int[] { 673, 1675 };
			case 378:
				return new int[] { 219, 264, 735, 776, 1253, 1271, 1314, 1343, 5169,
					5181 };
			case 379:
				return new int[] { 167 };
			case 380:
				return new int[] { 168, 92, 1985, 2247, 2522, 3531 };
			case 381:
				return new int[] { 2795, 702, 1261, 2823, 5115, 2019, 224, 671, 707,
					762, 1239, 1351, 2845, 2852, 4294, 4548, 5102, 5156, 5212, 5494, 58,
					70, 80, 179, 188, 198, 205, 232, 386, 711, 766, 1228, 1333, 1336,
					1643, 1644, 2015, 2837, 4625, 5161 };
			case 382:
				return new int[] { 629 };
			case 384:
				return new int[] { 279, 1219, 1349 };
			case 386:
				return new int[] { 5169, 353, 367, 680, 762, 776, 809, 881, 932, 990,
					1261, 1380, 2154, 3458, 4495, 58, 70, 80, 370, 381, 542, 711, 771,
					1423, 1432, 1490, 1643, 1644, 2016, 2019, 2710, 2795, 2837, 3407,
					4295 };
			case 387:
				return new int[] { 141, 949, 2023, 359 };
			case 390:
				return new int[] { 362, 289, 1231, 5103, 5109 };
			case 391:
				return new int[] { 91 };
			case 392:
				return new int[] { 219, 441 };
			case 394:
				return new int[] { 284, 703, 1353, 3602, 5102, 5143, 273, 288, 511,
					521, 535, 586, 629, 665, 670, 676, 722, 755, 774, 1179, 1268, 1737,
					2848, 3585, 4067, 4118, 4577, 4623, 5159, 5196, 5525 };
			case 398:
				return new int[] { 4543 };
			case 399:
				return new int[] { 263, 281, 408, 1390, 45, 87, 88, 223, 989, 995,
					1389, 1495, 1711, 2683, 5120 };
			case 400:
				return new int[] { 258, 4478, 299, 4163, 4210, 219, 237, 259, 278, 605,
					939, 996, 1042, 1054, 2610, 3278, 3416, 3582, 4288, 4477, 4584, 5153 };
			case 401:
				return new int[] { 421, 618, 623, 624, 4814, 261, 290, 321, 663, 765,
					1431, 1751, 1949, 2353, 2658, 3488, 3606, 4275, 4324, 4485, 4627,
					5110, 5126, 5163, 5177, 5199, 685, 686, 1977, 5084 };
			case 407:
				return new int[] { 1278 };
			case 408:
				return new int[] { 302, 5120, 263 };
			case 415:
				return new int[] { 674, 757, 768, 2630 };
			case 418:
				return new int[] { 1169, 354, 1753, 3585, 3661 };
			case 419:
				return new int[] { 347, 1224, 5089 };
			case 421:
				return new int[] { 686, 290, 4596, 401, 618, 623, 624, 4814, 685 };
			case 422:
				return new int[] { 492, 703, 1204, 195, 284, 288, 670, 674, 676, 679,
					725, 758, 2671, 2821, 4612, 4623, 5112, 5143 };
			case 425:
				return new int[] { 5095 };
			case 426:
				return new int[] { 432, 761, 1325 };
			case 428:
				return new int[] { 307, 490, 1772, 3397, 6137 };
			case 429:
				return new int[] { 1936, 799, 991, 3227, 3450, 4349 };
			case 430:
				return new int[] { 714 };
			case 431:
				return new int[] { 4247 };
			case 433:
				return new int[] { 722, 4555, 219, 432, 677, 1776, 2845, 3350, 4611,
					5114 };
			case 434:
				return new int[] { 1250, 220, 763, 2853, 3585, 5494 };
			case 437:
				return new int[] { 4291 };
			case 439:
				return new int[] { 256 };
			case 440:
				return new int[] { 437, 444, 487, 626, 3328, 426, 761 };
			case 441:
				return new int[] { 392, 32, 95, 189, 218, 263, 270, 364, 448, 535, 539,
					543, 568, 627, 628, 629, 670, 671, 674, 676, 721, 722, 746, 761, 771,
					813, 1171, 1174, 1224, 1231, 1257, 1260, 1367, 1479, 1501, 1737,
					1767, 1999, 2322, 2611, 2817, 2848, 2852, 3351, 3588, 3612, 3666,
					3751, 3993, 4128, 4138, 4167, 4520, 4529, 4543, 4547, 4556, 4608,
					4611, 4617, 5101, 5150, 5172, 5176, 5205, 5236, 5525 };
			case 445:
				return new int[] { 5097 };
			case 449:
				return new int[] { 1421, 67, 279, 450, 1275, 1295, 2652, 3194, 5173,
					5494 };
			case 453:
				return new int[] { 287, 317 };
			case 454:
				return new int[] { 1175, 5111 };
			case 455:
				return new int[] { 739, 102, 116, 271, 307, 448, 1198, 1206, 1231,
					4629, 5114 };
			case 456:
				return new int[] { 5178, 135 };
			case 458:
				return new int[] { 447, 1200 };
			case 461:
				return new int[] { 268, 4548, 68, 196, 223, 280, 283, 288, 490, 535,
					586, 670, 722, 896, 1254, 1268, 3585, 3636, 3677, 3995, 5494 };
			case 463:
				return new int[] { 466, 1354, 1587, 1685 };
			case 465:
				return new int[] { 569, 249, 778, 1038, 1207, 1237, 1365, 3995 };
			case 468:
				return new int[] { 709, 369, 701 };
			case 469:
				return new int[] { 468, 709, 180, 369, 701, 1313, 2004 };
			case 470:
				return new int[] { 369, 468, 704 };
			case 473:
				return new int[] { 741 };
			case 474:
				return new int[] { 1210, 2604 };
			case 476:
				return new int[] { 3684 };
			case 481:
				return new int[] { 685, 708, 290, 321, 687, 1200, 1273, 5131, 788,
					1977, 5076, 5917, 26, 112, 115, 154, 265, 318, 457, 805, 1476, 1484,
					2600, 2835, 3359, 3458, 3660, 4256, 4280, 4542, 5109, 5199, 5228,
					5236, 5241, 2825, 525, 577, 578, 686, 785, 890, 1529, 2184, 2611,
					2832, 3559, 3584, 3587, 3626, 3652, 4119, 4270, 4499, 4596, 4603 };
			case 482:
				return new int[] { 170, 1369, 3430, 483, 4477 };
			case 484:
				return new int[] { 740 };
			case 488:
				return new int[] { 2649, 3971, 4608, 5927 };
			case 490:
				return new int[] { 307, 6137, 487, 4077, 4587, 787, 1323, 1334, 5227,
					268, 491, 505, 614, 753, 1306, 1772, 1931, 2617, 4307, 4556, 5125,
					5494 };
			case 492:
				return new int[] { 422, 703, 1204, 195, 288, 670, 674, 676, 679, 725,
					758, 2671, 2821, 4612, 4623, 5112, 5143, 1022, 4621 };
			case 499:
				return new int[] { 524, 525 };
			case 500:
				return new int[] { 497, 89 };
			case 505:
				return new int[] { 4599, 787, 1306, 1323, 1334, 5227, 614, 753, 5125,
					5207, 307, 490, 4587, 5086, 6137, 506, 1345, 1931, 2423, 2617, 5469 };
			case 506:
				return new int[] { 505, 5469, 3568, 120, 585, 1297, 3474, 4599, 5108,
					5227 };
			case 509:
				return new int[] { 603 };
			case 518:
				return new int[] { 2848, 2849, 5159, 253, 288, 446, 669, 1249, 2808,
					2811 };
			case 519:
				return new int[] { 518 };
			case 521:
				return new int[] { 288 };
			case 522:
				return new int[] { 606, 661, 3551, 3562, 237, 320, 367, 625, 722, 2605,
					2922, 3583, 5196, 67, 91, 281, 386, 517, 540, 577, 592, 603, 608,
					635, 700, 763, 776, 1172, 1212, 1261, 1354, 1769, 2007, 2156, 2600,
					2624, 2626, 2654, 2664, 2845, 3358, 3458, 3591, 3670, 3676, 4073,
					4080, 4294, 4587, 4611, 5096, 5129, 5217, 5221 };
			case 529:
				return new int[] { 546, 472, 594, 5098 };
			case 531:
				return new int[] { 551, 68, 234, 270, 509, 644, 737, 1252, 1253, 1333,
					2792, 3541, 3582, 3601, 5125, 5218 };
			case 534:
				return new int[] { 111, 180, 302, 408, 594, 629, 660, 771, 1737, 4576,
					4577, 5525 };
			case 537:
				return new int[] { 573, 498, 562, 571, 624, 658, 663, 3535, 3571, 3580,
					4610 };
			case 540:
				return new int[] { 608 };
			case 542:
				return new int[] { 771, 1423, 1432, 2016, 812, 834, 367, 370, 386, 5169 };
			case 543:
				return new int[] { 5525 };
			case 544:
				return new int[] { 580, 635, 709, 2125, 2156, 171, 255, 281, 311, 436,
					538, 561, 566, 567, 665, 682, 685, 712, 719, 763, 913, 1429, 1490,
					1675, 2307, 2619, 2811, 2823, 2845, 2848, 3589, 3594, 3677, 3702,
					4080, 4294, 4548, 4567, 4578, 4592, 5098, 5158, 5196, 5227 };
			case 549:
				return new int[] { 31, 614, 1772, 3397, 5227, 1334, 2617, 4556, 307,
					490, 787, 1323, 5919 };
			case 553:
				return new int[] { 772, 5192 };
			case 561:
				return new int[] { 2307 };
			case 562:
				return new int[] { 5095 };
			case 566:
				return new int[] { 586, 1272, 1752 };
			case 572:
				return new int[] { 561, 3603 };
			case 574:
				return new int[] { 191, 1400, 3585 };
			case 578:
				return new int[] { 525, 3587 };
			case 579:
				return new int[] { 4498 };
			case 588:
				return new int[] { 592, 644, 2924, 3537, 3582, 3591, 3605, 4596, 602 };
			case 590:
				return new int[] { 567 };
			case 591:
				return new int[] { 535, 588, 592, 644, 2924, 3537, 3582, 3591, 3605,
					4587, 4596, 4606 };
			case 597:
				return new int[] { 716, 3995, 219 };
			case 598:
				return new int[] { 515, 621, 3556, 508, 521, 535, 556, 588, 592, 602,
					644, 2924, 3537, 3582, 3591, 3605, 3700, 4596, 2860 };
			case 599:
				return new int[] { 528 };
			case 602:
				return new int[] { 592, 615, 213, 237, 320, 515, 584, 588, 598, 603,
					621, 644, 1354, 1717, 2924, 3537, 3556, 3582, 3591, 3605, 4582, 4592,
					4596, 5214, 5217 };
			case 603:
				return new int[] { 509, 584, 596, 662, 4586, 522, 577, 592, 657, 3583,
					4592, 4608 };
			case 608:
				return new int[] { 540 };
			case 609:
				return new int[] { 1720, 2656, 3381, 3498, 4152, 4410 };
			case 612:
				return new int[] { 2092 };
			case 614:
				return new int[] { 549, 5227, 2617, 4556, 505, 1306, 1334, 1367, 1772,
					2608, 3397, 31, 307, 490, 753, 787, 1323, 2845, 4294, 4587, 4611,
					5125, 5236, 6137 };
			case 615:
				return new int[] { 3549, 665 };
			case 616:
				return new int[] { 2459, 4172 };
			case 618:
				return new int[] { 401, 421, 623, 624, 4814, 261, 290, 321, 663, 765,
					1431, 1751, 1949, 2353, 2658, 3488, 3606, 4275, 4324, 4485, 4627,
					5110, 5126, 5163, 5177, 5199, 685, 1977, 3572, 4608, 237, 605, 686,
					1138, 1349, 2825, 3703, 4586, 4589, 4596, 5084 };
			case 622:
				return new int[] { 509, 584, 596, 603, 650, 657, 662, 4586, 4589, 4601 };
			case 624:
				return new int[] { 401, 421, 618, 623, 4814, 261, 290, 321, 663, 765,
					1431, 1751, 1949, 2353, 2658, 3488, 3606, 4275, 4324, 4485, 4627,
					5110, 5126, 5163, 5177, 5199, 122, 573, 662, 800, 1418, 1952, 2854,
					3391, 3494, 3535, 3580, 5075, 5149, 5202 };
			case 625:
				return new int[] { 522, 661, 2605, 3551, 3559, 3562, 3569, 4603 };
			case 626:
				return new int[] { 437, 440, 586, 2609, 120, 223, 226, 337, 444, 550,
					569, 1201, 1289, 1308, 1319, 2184, 2605, 2804, 3589 };
			case 629:
				return new int[] { 660, 1367, 1737, 3751, 4556, 5525, 32, 263, 448,
					543, 568, 594, 665, 3666, 4547, 5159 };
			case 635:
				return new int[] { 580, 2156, 2125, 2138 };
			case 639:
				return new int[] { 509, 522, 531, 584, 596, 603, 640, 662, 3572, 3583,
					4586, 4608 };
			case 641:
				return new int[] { 3586 };
			case 642:
				return new int[] { 644 };
			case 643:
				return new int[] { 529, 594 };
			case 650:
				return new int[] { 657, 4589, 4601, 509, 548, 584, 596, 603, 622, 662,
					3557, 4586 };
			case 652:
				return new int[] { 268, 748, 252, 459, 538, 569, 709, 934, 1195, 1268,
					3995, 4576, 4578 };
			case 657:
				return new int[] { 219, 259, 265, 509, 603, 650, 1042, 3569, 3584,
					4589, 4601 };
			case 659:
				return new int[] { 1988, 4545, 4576, 4578, 568, 576, 1195, 2619, 4548,
					223, 391, 652, 904, 998, 1039, 1206, 1268, 1491, 1752, 1994, 2603,
					3474, 3995, 5119, 5189 };
			case 660:
				return new int[] { 629, 594, 268, 296, 302, 369, 408, 468, 470, 472,
					534, 569, 665, 748, 771, 858, 1271, 1324, 1367, 1737, 3627, 3751,
					3995, 4556, 4576, 4578, 5159, 5525 };
			case 661:
				return new int[] { 522, 3551, 3562, 4587, 625, 787, 1297, 1302, 1306,
					1323, 1334, 5469, 6137 };
			case 665:
				return new int[] { 3549 };
			case 675:
				return new int[] { 237, 288, 411, 446 };
			case 676:
				return new int[] { 627, 670 };
			case 677:
				return new int[] { 1367, 2845, 4611, 665, 3609, 3666, 4556, 2644, 3476,
					4225, 5908, 5919, 31, 283, 614, 1483, 1735, 2246, 2345, 2608, 2617,
					3158, 4294, 4297, 4614, 5227, 349, 761, 1372, 1495, 1772, 2169, 3423,
					3453, 3521, 3993, 3997, 4502, 6103, 6136, 6178, 468, 549, 629, 701,
					709, 1233, 1295, 1737, 2852, 3751, 4077, 4293, 4493, 4555, 5159,
					5226, 88, 219, 432, 433, 995, 1776, 2650, 3346, 3348, 3350, 3397,
					4190, 4546, 5114 };
			case 678:
				return new int[] { 754, 5093, 45, 2651, 5208, 3424 };
			case 682:
				return new int[] { 732 };
			case 688:
				return new int[] { 1755 };
			case 697:
				return new int[] { 5142 };
			case 702:
				return new int[] { 381, 2795, 224, 671, 1239, 1336, 1351, 2823, 2848,
					2852, 5102, 5115, 5156, 5212, 5494 };
			case 703:
				return new int[] { 422, 492, 1204, 284, 394, 1353, 3602, 5102, 5143,
					224, 674, 758, 1231, 1254, 2671, 2821, 4067, 4626, 5186 };
			case 705:
				return new int[] { 3522 };
			case 706:
				return new int[] { 226, 234, 1274 };
			case 707:
				return new int[] { 179, 188, 1261, 381, 671, 933, 1336, 1351, 2015,
					2795, 2823 };
			case 708:
				return new int[] { 290, 685, 2825, 2835, 3660, 5131, 321, 481, 686,
					4596, 4809, 5103 };
			case 714:
				return new int[] { 103, 295, 5168 };
			case 715:
				return new int[] { 712, 713, 289, 341, 580, 682, 716, 881, 952, 1739,
					1742, 3349, 3491, 3583, 4231, 4517, 4592 };
			case 723:
				return new int[] { 3161, 3472, 724, 171, 220, 224, 255, 263, 283, 535,
					568, 569, 674, 774, 938, 1179, 1231, 1263, 1268, 1295, 1305, 1367,
					2611, 2848, 2852, 3565, 4556, 4611, 4612, 4626, 5114, 5116, 5236,
					5494 };
			case 724:
				return new int[] { 171, 255, 614, 723, 2848, 4599, 15, 220, 224, 263,
					427, 505, 506, 568, 592, 644, 719, 763, 827, 1172, 1179, 1208, 1231,
					1233, 1234, 1268, 1295, 1341, 1367, 1742, 2611, 2811, 2823, 2842,
					2845, 2852, 2922, 3544, 3568, 3603, 4294, 4556, 4611, 4612, 4626,
					5098, 5114, 5125, 5129, 5155, 5196, 5227, 5236, 5469 };
			case 737:
				return new int[] { 68, 44, 836, 988, 4522, 270, 283 };
			case 739:
				return new int[] { 1198 };
			case 742:
				return new int[] { 224, 323, 1229, 1261, 2812, 5102, 5156, 5229, 5494,
					421, 517, 1325, 4616 };
			case 744:
				return new int[] { 1973, 859, 1381, 1469, 2548, 2606, 2909, 4593 };
			case 746:
				return new int[] { 67 };
			case 747:
				return new int[] { 5883 };
			case 752:
				return new int[] { 439 };
			case 753:
				return new int[] { 505, 2423, 307, 490, 614, 787, 1306, 1323, 1334,
					4587, 5125, 5227, 6137, 31, 549, 1772, 1931, 2617, 5086, 5207 };
			case 754:
				return new int[] { 678, 5093, 45, 2651, 5208, 3424 };
			case 755:
				return new int[] { 196, 273, 511, 670, 2848, 3585 };
			case 756:
				return new int[] { 1228, 2014, 67, 288, 493, 672, 675, 764, 930, 1003,
					2823, 3448, 3751, 5112, 5160 };
			case 760:
				return new int[] { 5210, 2844, 1935, 3357 };
			case 761:
				return new int[] { 349, 4546, 5102 };
			case 762:
				return new int[] { 184 };
			case 765:
				return new int[] { 5110, 4627 };
			case 766:
				return new int[] { 179, 188, 198, 202, 205, 217, 224, 232, 303, 323,
					381, 670, 671, 702, 707, 742, 933, 1172, 1184, 1207, 1211, 1228,
					1229, 1239, 1261, 1333, 1336, 2015, 2795, 2812, 2823, 2852, 4154,
					4625, 5094, 5102, 5115, 5129, 5132, 5156, 5161, 5212, 5229, 5494 };
			case 767:
				return new int[] { 2819, 2844, 3357, 5078 };
			case 771:
				return new int[] { 2016, 108, 5117, 292, 302, 408, 534, 535, 594, 629,
					660, 670, 676, 722, 1423, 1737, 1935, 2631, 2821, 2823, 2848, 3585,
					5131, 5525 };
			case 772:
				return new int[] { 176, 3489 };
			case 773:
				return new int[] { 586 };
			case 780:
				return new int[] { 782, 5176 };
			case 787:
				return new int[] { 1306, 1323, 1334, 5125, 5207, 6137, 505, 4587, 5086 };
			case 788:
				return new int[] { 5199, 290, 685, 5076, 1476, 3458, 4280, 5241, 321,
					481, 708, 1200, 1977, 3660, 4300, 26, 112, 115, 154, 265, 318, 457,
					687, 805, 890, 1273, 2600, 2835, 3359, 3652, 4119, 4256, 4542, 5131,
					5228, 5236, 1722, 3606, 5078, 5126, 5163, 5917 };
			case 791:
				return new int[] { 261 };
			case 792:
				return new int[] { 3750 };
			case 793:
				return new int[] { 4634 };
			case 795:
				return new int[] { 778, 1479, 3648, 4516 };
			case 798:
				return new int[] { 2523 };
			case 799:
				return new int[] { 429, 1936, 4349, 3227, 3450, 1037, 1039, 1056, 1402,
					1436, 1704, 3172, 3209, 3291, 3359, 3417, 3703, 3860, 4153, 4214,
					4554 };
			case 801:
				return new int[] { 2752, 143, 903, 2486, 3344, 3399 };
			case 803:
				return new int[] { 1378, 4070, 1012, 3066, 3087, 3120, 4530 };
			case 805:
				return new int[] { 1470 };
			case 806:
				return new int[] { 849, 861, 3606 };
			case 808:
				return new int[] { 152, 127, 539, 800, 877, 3303, 3699 };
			case 809:
				return new int[] { 1380, 881, 990, 3407, 932, 1490, 2154, 5169 };
			case 810:
				return new int[] { 1391, 3313, 3325 };
			case 812:
				return new int[] { 1006, 1393, 1493, 1987, 3326, 4265, 542, 316, 876,
					1885, 3138, 4107, 4214 };
			case 817:
				return new int[] { 2709, 4496 };
			case 818:
				return new int[] { 4543, 881 };
			case 820:
				return new int[] { 5094, 1122, 1704, 3311, 4307 };
			case 825:
				return new int[] { 1733 };
			case 828:
				return new int[] { 1147, 4513 };
			case 833:
				return new int[] { 3969, 1, 950, 1373, 3202, 4132, 4197 };
			case 836:
				return new int[] { 44, 737, 988, 4522, 68, 118, 268, 280, 283, 462,
					1425, 2195 };
			case 837:
				return new int[] { 1017, 1025, 1100, 65, 827, 945, 989, 1116, 1118,
					1135, 1988, 3373 };
			case 839:
				return new int[] { 858 };
			case 840:
				return new int[] { 2167 };
			case 843:
				return new int[] { 1127 };
			case 851:
				return new int[] { 1385 };
			case 857:
				return new int[] { 840, 685, 839, 1349, 1423, 5131 };
			case 864:
				return new int[] { 865, 866, 3198, 5231, 1645, 2201, 3276, 5168 };
			case 865:
				return new int[] { 864, 866, 3198, 1645 };
			case 866:
				return new int[] { 864, 865, 3198, 2201, 5168, 5231 };
			case 870:
				return new int[] { 31 };
			case 876:
				return new int[] { 4080, 1470, 3456 };
			case 883:
				return new int[] { 1394 };
			case 884:
				return new int[] { 3742, 4229, 1912 };
			case 885:
				return new int[] { 886, 1368 };
			case 886:
				return new int[] { 885, 914 };
			case 890:
				return new int[] { 4119, 4194 };
			case 891:
				return new int[] { 5254 };
			case 892:
				return new int[] { 1471 };
			case 895:
				return new int[] { 925, 4277, 26, 91, 173, 252, 582, 1141, 3546, 3582,
					4098, 5090 };
			case 905:
				return new int[] { 2025, 5277 };
			case 906:
				return new int[] { 907, 672, 909, 2014 };
			case 908:
				return new int[] { 1133 };
			case 914:
				return new int[] { 885, 886 };
			case 915:
				return new int[] { 896, 3519, 4245, 4293, 1664, 2814, 3043, 3521, 4237,
					4523, 5002 };
			case 917:
				return new int[] { 1049, 1316, 1329, 1371, 3769, 4234, 4486 };
			case 918:
				return new int[] { 4128 };
			case 919:
				return new int[] { 3310 };
			case 920:
				return new int[] { 1595, 3251, 4528, 150, 155 };
			case 923:
				return new int[] { 4096 };
			case 925:
				return new int[] { 900 };
			case 928:
				return new int[] { 1408 };
			case 930:
				return new int[] { 174, 214 };
			case 931:
				return new int[] { 932 };
			case 935:
				return new int[] { 1705 };
			case 942:
				return new int[] { 879, 1989, 3294 };
			case 947:
				return new int[] { 3440 };
			case 948:
				return new int[] { 3335, 3247 };
			case 949:
				return new int[] { 387, 141, 2023 };
			case 950:
				return new int[] { 1, 833, 1373, 3202, 3969, 4132, 4197 };
			case 952:
				return new int[] { 4064 };
			case 961:
				return new int[] { 2774 };
			case 962:
				return new int[] { 2775, 682, 1115, 1130, 4245 };
			case 963:
				return new int[] { 1821 };
			case 965:
				return new int[] { 4045 };
			case 971:
				return new int[] { 2091 };
			case 972:
				return new int[] { 41 };
			case 976:
				return new int[] { 1102 };
			case 977:
				return new int[] { 42, 2470 };
			case 987:
				return new int[] { 1412, 1961 };
			case 988:
				return new int[] { 44, 737, 836, 4522 };
			case 989:
				return new int[] { 45, 993, 263, 1390, 5208 };
			case 992:
				return new int[] { 1194, 398, 818, 1499, 4543 };
			case 994:
				return new int[] { 2511 };
			case 995:
				return new int[] { 88, 1495, 3397, 31, 549, 614 };
			case 998:
				return new int[] { 1491, 1752, 566, 938, 4224, 4578, 223, 391, 652,
					659, 904, 1039, 1195, 1206, 1268, 1988, 1994, 2603, 2619, 3474, 3995,
					4545, 4576, 5119, 5189 };
			default:
				return null;
		}
	}

	private static int[] getSimilarVerseIndices2000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 1000:
				return new int[] { 997 };
			case 1003:
				return new int[] { 997 };
			case 1004:
				return new int[] { 858, 918 };
			case 1008:
				return new int[] { 196, 755 };
			case 1012:
				return new int[] { 2695, 1556, 1018, 1026, 1038, 1522, 1533 };
			case 1013:
				return new int[] { 862, 1625, 2287, 2536, 3336, 3479, 3629, 3751, 4079,
					4364, 4541, 5269 };
			case 1014:
				return new int[] { 1020, 1057, 866, 1018, 1026, 1038, 1400, 1500, 1522,
					1533, 1535, 1550, 1556, 1560, 1564, 2433, 3204, 3504, 3724, 4375,
					5058, 5365, 5420 };
			case 1015:
				return new int[] { 1681, 1691, 86, 175, 596, 981, 986, 1431, 36, 744,
					859, 1381, 1469, 1908, 1973, 2548, 2606, 2909, 4104, 5039 };
			case 1016:
				return new int[] { 1022 };
			case 1017:
				return new int[] { 1025, 1436 };
			case 1018:
				return new int[] { 1026, 1038, 1522, 1533, 1556, 1012, 2695 };
			case 1019:
				return new int[] { 1043, 1499, 2696 };
			case 1020:
				return new int[] { 1014, 1057, 866, 1018, 1026, 1038, 1400, 1500, 1522,
					1533, 1535, 1550, 1556, 1560, 1564, 2433, 3204, 3504, 3724, 4375,
					5058, 5365, 5420 };
			case 1025:
				return new int[] { 1017, 1566, 837, 938, 1004, 1100, 1130, 1408, 1436,
					1530, 1538, 2559 };
			case 1029:
				return new int[] { 3637, 4180 };
			case 1031:
				return new int[] { 1044, 3376 };
			case 1032:
				return new int[] { 1046 };
			case 1033:
				return new int[] { 3367, 3212 };
			case 1034:
				return new int[] { 3213 };
			case 1035:
				return new int[] { 3214, 3363, 3368 };
			case 1036:
				return new int[] { 3371, 3372 };
			case 1037:
				return new int[] { 1056, 1402, 1436, 3172, 3209, 3227, 3291, 3860,
					4349, 4554, 429, 799, 1039, 1704, 1936, 3417, 3450, 3703, 4153, 4214 };
			case 1040:
				return new int[] { 1472, 1675 };
			case 1043:
				return new int[] { 1019, 1499, 2696, 2705 };
			case 1044:
				return new int[] { 1031, 3376 };
			case 1045:
				return new int[] { 819, 1017, 1025, 1090, 1130, 1402, 1408, 1436, 1458,
					2559, 3418, 938, 993, 1043, 1099, 1129, 1304, 1324, 1488, 1490, 1566,
					2890, 3417, 4117, 4153, 4202, 4214, 5181 };
			case 1046:
				return new int[] { 1032 };
			case 1052:
				return new int[] { 1384, 1926 };
			case 1054:
				return new int[] { 1437 };
			case 1056:
				return new int[] { 3172, 1438, 1436 };
			case 1057:
				return new int[] { 1014, 1020, 4370, 1400, 1447, 3504, 5058, 5365 };
			case 1059:
				return new int[] { 2962, 3085, 1023, 1504, 1808, 3118, 3368, 4531 };
			case 1060:
				return new int[] { 2963 };
			case 1061:
				return new int[] { 2964 };
			case 1062:
				return new int[] { 2965, 1080 };
			case 1065:
				return new int[] { 1442 };
			case 1066:
				return new int[] { 2972 };
			case 1067:
				return new int[] { 2973 };
			case 1068:
				return new int[] { 2412, 690, 692, 1087, 1091 };
			case 1071:
				return new int[] { 730, 831, 876, 910, 1092, 1100, 1133, 1243, 1355,
					1375, 1488, 1996, 1997, 3335, 3638, 5118, 5189 };
			case 1074:
				return new int[] { 2417, 2978 };
			case 1083:
				return new int[] { 1786 };
			case 1086:
				return new int[] { 1438 };
			case 1088:
				return new int[] { 4374 };
			case 1089:
				return new int[] { 1099 };
			case 1092:
				return new int[] { 1488, 730, 831, 876, 910, 1071, 1100, 1133, 1243,
					1355, 1375, 1996, 1997, 3335, 3638, 4060, 5118, 5189 };
			case 1094:
				return new int[] { 55, 1755 };
			case 1100:
				return new int[] { 837, 1017, 1025 };
			case 1104:
				return new int[] { 4004 };
			case 1106:
				return new int[] { 2019, 2010 };
			case 1112:
				return new int[] { 1134 };
			case 1114:
				return new int[] { 64 };
			case 1115:
				return new int[] { 65, 3373, 569 };
			case 1118:
				return new int[] { 65 };
			case 1119:
				return new int[] { 71 };
			case 1124:
				return new int[] { 69 };
			case 1127:
				return new int[] { 843 };
			case 1130:
				return new int[] { 2559, 1129, 2890, 962, 1017, 1025, 938, 993, 1436,
					5181 };
			case 1131:
				return new int[] { 2125, 2156 };
			case 1134:
				return new int[] { 1112 };
			case 1135:
				return new int[] { 5314, 827, 837, 980, 989, 1100, 1926, 1945, 4082,
					5219 };
			case 1139:
				return new int[] { 21, 898, 1374, 2747 };
			case 1145:
				return new int[] { 1150, 1973, 2525 };
			case 1147:
				return new int[] { 844, 2667, 3699, 4198, 100, 4513 };
			case 1148:
				return new int[] { 1132 };
			case 1149:
				return new int[] { 902 };
			case 1150:
				return new int[] { 3672, 1720, 4152 };
			case 1153:
				return new int[] { 4253 };
			case 1159:
				return new int[] { 2501 };
			case 1161:
				return new int[] { 2629 };
			case 1162:
				return new int[] { 9, 2629, 4309, 723, 3161, 3305, 3472, 3518 };
			case 1163:
				return new int[] { 1233 };
			case 1167:
				return new int[] { 1445 };
			case 1169:
				return new int[] { 418, 80, 116, 299, 311, 370, 490, 491, 897, 1996,
					2646, 3311, 3447, 3585, 3595, 4307, 4322, 5494 };
			case 1172:
				return new int[] { 5129, 202, 217, 505, 506, 592, 701, 724, 1297, 1314,
					2842, 3568, 3603, 4154, 4599, 5107, 5469, 171, 237, 281, 285, 303,
					320, 367, 522, 540, 606, 608, 635, 670, 723, 763, 766, 1111, 1160,
					1179, 1184, 1205, 1207, 1211, 1235, 1237, 1258, 1263, 1293, 1305,
					1308, 1324, 1328, 1339, 1341, 1354, 2156, 2605, 2624, 2626, 2654,
					2838, 2840, 2841, 2845, 2852, 2922, 3544, 3554, 3561, 3565, 3583,
					3589, 4073, 4080, 4294, 4612, 4625, 4626, 5108, 5116, 5123, 5125,
					5132, 5133, 5173, 5196, 5217, 5221, 67, 70, 80, 91, 120, 144, 146,
					155, 164, 182, 191, 209, 210, 213, 223, 234, 235, 239, 255, 289, 296,
					305, 311, 337, 341, 381, 386, 389, 393, 404, 427, 436, 437, 448, 474,
					504, 544, 551, 561, 562, 566, 572, 577, 579, 580, 584, 585, 602, 603,
					611, 614, 617, 625, 642, 645, 661, 680, 682, 685, 709, 711, 712, 713,
					715, 718, 719, 722, 728, 757, 762, 765, 776, 787, 807, 809, 827, 852,
					876, 881, 912, 913, 930, 932, 979, 1084, 1131, 1175, 1208, 1210,
					1212, 1219, 1223, 1240, 1261, 1264, 1270, 1306, 1323, 1333, 1334,
					1345, 1368, 1394, 1427, 1429, 1490, 1550, 1633, 1635, 1647, 1675,
					1703, 1717, 1719, 1739, 1742, 1751, 1754, 1757, 1769, 1975, 1976,
					1979, 2007, 2061, 2067, 2125, 2138, 2307, 2596, 2597, 2600, 2602,
					2604, 2606, 2612, 2619, 2655, 2656, 2664, 2669, 2789, 2795, 2811,
					2820, 2823, 2830, 2834, 2848, 2925, 3166, 3221, 3222, 3245, 3301,
					3345, 3349, 3358, 3363, 3383, 3407, 3438, 3445, 3446, 3458, 3474,
					3480, 3488, 3490, 3491, 3498, 3499, 3538, 3551, 3562, 3591, 3670,
					3676, 3677, 3686, 3687, 3691, 3995, 4078, 4093, 4094, 4099, 4109,
					4125, 4165, 4231, 4245, 4250, 4287, 4315, 4317, 4514, 4530, 4541,
					4547, 4548, 4553, 4555, 4570, 4572, 4582, 4587, 4592, 4598, 4609,
					4611, 5094, 5095, 5096, 5098, 5099, 5110, 5115, 5138, 5155, 5158,
					5169, 5180, 5187, 5204, 5209, 5214, 5218, 5219, 5220, 5223, 5227,
					5228, 5232, 5268, 5601, 6137 };
			case 1174:
				return new int[] { 32, 218, 263, 441, 448, 543, 568, 627, 629, 671,
					737, 1171, 1204, 1262, 1367, 1737, 2244, 2322, 3351, 3666, 3751,
					4136, 4520, 4547, 4548, 4556, 5112, 5150, 5159, 5525 };
			case 1179:
				return new int[] { 273, 288, 394, 511, 521, 535, 586, 629, 665, 670,
					676, 722, 723, 755, 774, 1263, 1268, 1737, 2848, 2852, 3585, 4577,
					4612, 4623, 4626, 5117, 5159, 5196, 5525 };
			case 1180:
				return new int[] { 397, 1206, 5144 };
			case 1181:
				return new int[] { 1214, 1463 };
			case 1182:
				return new int[] { 538, 1201 };
			case 1184:
				return new int[] { 202, 670, 5132, 171, 1207, 2853 };
			case 1186:
				return new int[] { 551, 5185 };
			case 1188:
				return new int[] { 5102, 769, 1231, 2848, 3585, 5114 };
			case 1190:
				return new int[] { 3648 };
			case 1192:
				return new int[] { 149, 219, 387, 437, 471, 528, 584, 619, 924, 1349,
					1400, 1463, 1492, 1744, 1760, 1771, 2182, 2763, 3332, 3379, 3568,
					3585, 3703, 4153, 4210, 4317, 4322, 5620, 81, 370, 453, 594, 1193,
					1201, 5155, 15, 32, 80, 83, 91, 103, 104, 108, 113, 116, 120, 141,
					146, 150, 155, 170, 173, 176, 179, 191, 202, 203, 206, 221, 237, 252,
					261, 276, 278, 279, 288, 290, 299, 305, 311, 321, 322, 341, 354, 359,
					371, 384, 389, 391, 400, 401, 409, 418, 436, 438, 439, 446, 448, 458,
					490, 491, 493, 503, 504, 508, 515, 516, 521, 524, 525, 526, 527, 535,
					548, 550, 556, 567, 568, 571, 574, 578, 586, 598, 599, 605, 618, 620,
					621, 623, 626, 627, 633, 641, 649, 663, 671, 672, 685, 686, 711, 740,
					741, 765, 772, 774, 823, 844, 879, 895, 897, 907, 925, 928, 939, 940,
					949, 986, 996, 1023, 1035, 1039, 1040, 1042, 1090, 1138, 1141, 1169,
					1176, 1182, 1194, 1203, 1219, 1251, 1258, 1265, 1289, 1304, 1308,
					1348, 1350, 1354, 1356, 1369, 1382, 1399, 1408, 1423, 1429, 1431,
					1434, 1478, 1501, 1505, 1506, 1558, 1573, 1585, 1589, 1633, 1662,
					1663, 1671, 1703, 1704, 1714, 1717, 1732, 1740, 1751, 1753, 1759,
					1761, 1769, 1787, 1795, 1923, 1933, 1936, 1937, 1953, 1977, 1996,
					2015, 2023, 2048, 2061, 2122, 2155, 2277, 2297, 2298, 2313, 2504,
					2580, 2596, 2606, 2609, 2646, 2658, 2665, 2670, 2672, 2710, 2797,
					2799, 2841, 2844, 2871, 2939, 2998, 3034, 3052, 3070, 3089, 3105,
					3121, 3218, 3223, 3278, 3310, 3311, 3319, 3327, 3344, 3361, 3363,
					3364, 3368, 3416, 3417, 3418, 3437, 3447, 3488, 3489, 3500, 3502,
					3506, 3533, 3534, 3536, 3538, 3553, 3554, 3555, 3556, 3566, 3570,
					3572, 3582, 3586, 3587, 3595, 3626, 3627, 3650, 3661, 3670, 3676,
					3677, 3681, 3700, 3704, 3817, 4034, 4124, 4161, 4163, 4239, 4269,
					4277, 4281, 4284, 4288, 4291, 4302, 4307, 4318, 4324, 4477, 4504,
					4519, 4537, 4554, 4584, 4593, 4627, 4806, 5084, 5090, 5094, 5110,
					5131, 5132, 5153, 5218, 5450, 5494, 5525, 5550, 5828, 5954, 6134 };
			case 1194:
				return new int[] { 398, 818, 4543, 992 };
			case 1198:
				return new int[] { 199, 739, 1231 };
			case 1199:
				return new int[] { 2672 };
			case 1204:
				return new int[] { 5186, 422, 492, 703, 32, 511, 674, 758, 1022, 1268,
					2671, 2821, 3158, 3573, 4623 };
			case 1208:
				return new int[] { 3544, 2848 };
			case 1209:
				return new int[] { 383, 3636 };
			case 1210:
				return new int[] { 474, 2604 };
			case 1211:
				return new int[] { 303, 296, 3362, 4120, 4154 };
			case 1213:
				return new int[] { 303, 1211 };
			case 1214:
				return new int[] { 1181, 95, 2666, 3557 };
			case 1216:
				return new int[] { 462 };
			case 1218:
				return new int[] { 470, 472 };
			case 1227:
				return new int[] { 2804 };
			case 1228:
				return new int[] { 756, 2014, 672, 1229, 2823, 179, 188, 198, 205, 224,
					232, 323, 381, 671, 702, 707, 742, 766, 906, 933, 1239, 1261, 1333,
					1336, 2015, 2795, 2812, 2852, 4623, 4625, 5102, 5115, 5156, 5161,
					5212, 5229, 5494 };
			case 1229:
				return new int[] { 5494 };
			case 1230:
				return new int[] { 2848, 252, 518, 1249, 1274, 1294, 1331, 1340, 2646,
					2808, 2849, 4619, 5159 };
			case 1233:
				return new int[] { 1231, 1254, 224, 1234, 1367 };
			case 1234:
				return new int[] { 1231 };
			case 1235:
				return new int[] { 1238, 1237, 285, 1258 };
			case 1243:
				return new int[] { 5189, 491, 5118 };
			case 1245:
				return new int[] { 1239, 2672 };
			case 1249:
				return new int[] { 518, 722, 1294, 1331, 2825, 2848, 253, 267, 289,
					290, 365, 685, 708, 1208, 1230, 1261, 1340, 1344, 2646, 2808, 2811,
					2835, 2849, 4619, 5103, 5131, 5159 };
			case 1250:
				return new int[] { 472, 289, 434, 676, 5084, 5114 };
			case 1254:
				return new int[] { 1231, 1233, 224, 4626, 82, 268, 288, 461, 535, 568,
					586, 703, 722, 1234, 1268, 1272, 3585, 3601, 4167, 5084, 5494 };
			case 1260:
				return new int[] { 4608 };
			case 1261:
				return new int[] { 381, 517, 707, 722, 776, 2795, 2823, 219, 224, 290,
					305, 323, 386, 421, 444, 504, 671, 685, 708, 742, 933, 1042, 1229,
					1249, 1325, 1336, 1351, 2812, 2825, 2835, 2848, 2852, 3458, 3670,
					4548, 5095, 5102, 5103, 5115, 5131, 5156, 5161, 5180, 5229, 5494 };
			case 1266:
				return new int[] { 5170, 2825, 4146 };
			case 1267:
				return new int[] { 5171, 4610 };
			case 1273:
				return new int[] { 290, 321, 481, 685, 687, 708, 1200, 5131, 1529 };
			case 1275:
				return new int[] { 5173, 3355, 5185, 1038, 1995 };
			case 1277:
				return new int[] { 2852, 3342 };
			case 1278:
				return new int[] { 270 };
			case 1279:
				return new int[] { 68, 183, 270, 551, 628, 737, 1278, 5125 };
			case 1285:
				return new int[] { 1760, 1761 };
			case 1288:
				return new int[] { 1318 };
			case 1289:
				return new int[] { 1319 };
			case 1293:
				return new int[] { 1308, 5125, 285, 462, 465, 472, 505, 506, 529, 546,
					592, 701, 723, 724, 1111, 1160, 1172, 1179, 1205, 1235, 1237, 1258,
					1263, 1297, 1305, 1314, 1324, 1328, 1339, 1341, 2838, 2840, 2841,
					2842, 2852, 3544, 3554, 3561, 3565, 3568, 3589, 3603, 4599, 4612,
					4625, 4626, 5107, 5108, 5116, 5123, 5129, 5133, 5173, 5469 };
			case 1297:
				return new int[] { 5469 };
			case 1302:
				return new int[] { 4588, 5469 };
			case 1304:
				return new int[] { 3417 };
			case 1306:
				return new int[] { 505, 787, 1323, 1334, 5174, 6137, 307, 614, 4587,
					5086, 5207, 490, 753, 1931, 5125, 5227 };
			case 1307:
				return new int[] { 5237 };
			case 1311:
				return new int[] { 16 };
			case 1312:
				return new int[] { 777, 784 };
			case 1314:
				return new int[] { 5193, 1271 };
			case 1316:
				return new int[] { 1329, 917, 1049, 1371, 3519, 3769, 4234, 4245, 4486,
					4523, 5002 };
			case 1318:
				return new int[] { 1288, 5117 };
			case 1319:
				return new int[] { 1289 };
			case 1321:
				return new int[] { 1327, 5190, 1053 };
			case 1322:
				return new int[] { 1110 };
			case 1323:
				return new int[] { 787, 1334, 1306, 505, 5086, 5207, 490, 4587, 6137,
					307, 549, 614, 753, 1931, 5125, 5174, 5227, 5919, 31, 487, 680, 1427,
					1772, 2423, 2617, 4556, 2608, 2864, 4599, 5236, 272, 428, 661, 1297,
					1345, 2170, 3397, 4077, 4245 };
			case 1324:
				return new int[] { 296, 594, 701, 704, 741, 748, 2852 };
			case 1325:
				return new int[] { 2823, 517, 722, 2848, 4599 };
			case 1327:
				return new int[] { 1321, 5117 };
			case 1328:
				return new int[] { 1339 };
			case 1331:
				return new int[] { 1249, 2848 };
			case 1334:
				return new int[] { 787, 1323, 5125, 6137, 1306, 5207, 505, 4587, 5086 };
			case 1339:
				return new int[] { 1328, 5184 };
			case 1340:
				return new int[] { 2848, 252, 446, 518, 1230, 1249, 1294, 1331, 1336,
					2646, 2808, 2849, 4619, 5159 };
			case 1344:
				return new int[] { 1249, 1294 };
			case 1349:
				return new int[] { 115, 237, 252, 288, 384, 446, 668, 765, 1234, 4627,
					5110 };
			case 1350:
				return new int[] { 113, 3361, 4302, 3506, 1585, 663, 1111, 1308, 3488,
					3627 };
			case 1353:
				return new int[] { 284, 394, 703, 3602, 5102, 5143, 4067 };
			case 1355:
				return new int[] { 268, 569, 858, 896, 1354, 1550, 4535 };
			case 1359:
				return new int[] { 720, 4564, 4573, 5525 };
			case 1364:
				return new int[] { 3470, 1596, 1802, 1707, 2933, 3253 };
			case 1369:
				return new int[] { 170, 482, 4477, 686, 1007, 1138, 1430, 1912, 3244,
					3416, 3506, 4485, 5494 };
			case 1371:
				return new int[] { 917, 1049, 1316, 1329, 3769, 4234, 4486 };
			case 1372:
				return new int[] { 1772, 31, 2608, 2617, 3476, 4556, 5227, 5919, 283,
					549, 614, 1495, 2246, 2650, 3521, 4502 };
			case 1380:
				return new int[] { 809, 990, 932, 2154, 3407, 881, 1490, 4089 };
			case 1382:
				return new int[] { 1582, 4262, 219, 4285 };
			case 1388:
				return new int[] { 219, 2836, 1753, 1993, 3667, 5525 };
			case 1391:
				return new int[] { 810 };
			case 1395:
				return new int[] { 115, 219, 446, 1058, 4063 };
			case 1396:
				return new int[] { 4138, 1090, 1459 };
			case 1400:
				return new int[] { 1706, 3504 };
			case 1401:
				return new int[] { 1485, 29 };
			case 1404:
				return new int[] { 3147 };
			case 1407:
				return new int[] { 108, 249, 257, 1140, 1423, 1467, 1633, 1635, 1663,
					1938, 1961, 2596, 3414, 3438, 3704, 4193, 4498, 532 };
			case 1409:
				return new int[] { 4209, 1746 };
			case 1410:
				return new int[] { 1417 };
			case 1411:
				return new int[] { 2520, 3229, 3634, 3752, 5265, 3530 };
			case 1415:
				return new int[] { 3647, 881, 3516, 4529 };
			case 1419:
				return new int[] { 1111, 4421 };
			case 1421:
				return new int[] { 449, 4356 };
			case 1422:
				return new int[] { 663 };
			case 1423:
				return new int[] { 249, 4193, 771, 108, 149, 257, 633, 1432, 2016,
					2611, 3231, 259, 370, 471, 542, 671, 674, 685, 722, 928, 1463, 1501,
					1633, 1760, 1971, 2125, 2596, 2672, 3704, 4117, 4498, 5117, 5131,
					5194, 5236 };
			case 1425:
				return new int[] { 44, 68, 118, 268, 280, 283, 462, 737, 836, 988,
					4522, 4118 };
			case 1426:
				return new int[] { 1652, 3211, 4235 };
			case 1427:
				return new int[] { 1776, 4248, 701, 787, 1323, 1334, 1740, 2007, 5094 };
			case 1430:
				return new int[] { 4193, 3244, 1709, 1912, 3324, 3431, 3429 };
			case 1432:
				return new int[] { 2016, 1423, 771, 542, 5117, 367, 370, 386, 5169 };
			case 1433:
				return new int[] { 858 };
			case 1436:
				return new int[] { 1017, 1402 };
			case 1437:
				return new int[] { 1054 };
			case 1438:
				return new int[] { 1056, 1086, 2718 };
			case 1439:
				return new int[] { 3299, 5168, 3171, 3287, 3648, 4157, 4354 };
			case 1440:
				return new int[] { 4516 };
			case 1442:
				return new int[] { 1065 };
			case 1443:
				return new int[] { 252, 1096, 2974, 2408, 2972 };
			case 1445:
				return new int[] { 1167, 4295 };
			case 1447:
				return new int[] { 254, 1200 };
			case 1448:
				return new int[] { 5154, 997, 1042, 1000 };
			case 1452:
				return new int[] { 119, 124, 3467, 4490 };
			case 1456:
				return new int[] { 4489, 2024, 3527 };
			case 1458:
				return new int[] { 5181, 938, 3418, 802, 1468, 3338 };
			case 1459:
				return new int[] { 1396, 4138 };
			case 1460:
				return new int[] { 1451, 3132 };
			case 1463:
				return new int[] { 149 };
			case 1466:
				return new int[] { 4183 };
			case 1468:
				return new int[] { 802, 3338, 1458, 3438 };
			case 1469:
				return new int[] { 744, 859, 1381, 1973, 2548, 2606, 2909 };
			case 1472:
				return new int[] { 1040, 1675 };
			case 1474:
				return new int[] { 4724, 4725 };
			case 1476:
				return new int[] { 788, 3458, 4280, 5076, 5199, 5241, 26, 112, 115,
					154, 265, 290, 318, 321, 457, 481, 685, 687, 708, 805, 890, 1200,
					1273, 1977, 2600, 2835, 3359, 3652, 3660, 4119, 4256, 4542, 5131,
					5228, 5236, 952, 1976, 525, 577, 578, 785, 1484, 1529, 2184, 2611,
					3559, 3584, 3587, 3626, 4270, 4603, 5109, 5917 };
			case 1482:
				return new int[] { 4267 };
			case 1483:
				return new int[] { 3666, 677, 3609, 31, 283, 665, 1367, 1735, 2246,
					2345, 2644, 2845, 3476, 4225, 4297, 4556, 4611, 5252, 5908, 5919 };
			case 1485:
				return new int[] { 1401, 29 };
			case 1487:
				return new int[] { 120, 409, 1289, 2046, 4248 };
			case 1490:
				return new int[] { 809, 881, 932, 3407, 5169, 670, 990, 1380, 1501,
					2154, 2160, 149, 685, 819, 827, 913, 997, 2408, 2710, 2823, 2848,
					3613, 4117, 4295, 4592, 5158 };
			case 1491:
				return new int[] { 998, 1752, 1632, 4224, 566, 938, 4578, 223, 391,
					652, 659, 904, 1039, 1195, 1206, 1268, 1988, 1994, 2603, 2619, 3161,
					3472, 3474, 3995, 4545, 4576, 5119, 5189 };
			case 1492:
				return new int[] { 4153 };
			case 1493:
				return new int[] { 1006, 812, 1393, 1987, 3326, 4265, 4537, 316, 876,
					1885, 3138, 4107, 4214 };
			case 1494:
				return new int[] { 2009, 3163 };
			case 1495:
				return new int[] { 31, 88, 995, 1772, 283, 1372, 2617, 3397, 4294,
					4502, 5227 };
			case 1497:
				return new int[] { 2695, 2643, 5420 };
			case 1498:
				return new int[] { 4530, 1012, 1556 };
			case 1500:
				return new int[] { 1535, 1560 };
			case 1502:
				return new int[] { 1535 };
			case 1504:
				return new int[] { 1023, 4531 };
			case 1505:
				return new int[] { 3278 };
			case 1509:
				return new int[] { 2699 };
			case 1511:
				return new int[] { 4097, 1565, 923 };
			case 1512:
				return new int[] { 2699 };
			case 1522:
				return new int[] { 1018, 1026, 1038, 1533, 1556, 1012, 2695 };
			case 1525:
				return new int[] { 1441, 1639 };
			case 1528:
				return new int[] { 343, 785, 2285, 4388 };
			case 1530:
				return new int[] { 1566, 1538, 220, 1025 };
			case 1535:
				return new int[] { 1500 };
			case 1536:
				return new int[] { 1026, 1556 };
			case 1538:
				return new int[] { 1530, 1566 };
			case 1539:
				return new int[] { 1566 };
			case 1540:
				return new int[] { 1567 };
			case 1549:
				return new int[] { 3372 };
			case 1554:
				return new int[] { 1875 };
			case 1555:
				return new int[] { 4708 };
			case 1556:
				return new int[] { 1038 };
			case 1557:
				return new int[] { 1038, 3114, 1556, 3375 };
			case 1558:
				return new int[] { 193, 341, 395, 619, 671, 672, 907, 1038, 1275, 1995,
					2624, 3355, 3488, 4239, 5173, 5185, 5494 };
			case 1561:
				return new int[] { 4163 };
			case 1562:
				return new int[] { 1475, 1524 };
			case 1564:
				return new int[] { 1556 };
			case 1566:
				return new int[] { 1530, 1538 };
			case 1567:
				return new int[] { 1540, 1045 };
			case 1568:
				return new int[] { 4155, 2717 };
			case 1569:
				return new int[] { 1090, 2426, 2954, 4161, 4169 };
			case 1571:
				return new int[] { 1532, 3293 };
			case 1578:
				return new int[] { 1488, 3522, 2582 };
			case 1579:
				return new int[] { 1580, 916 };
			case 1580:
				return new int[] { 1579 };
			case 1582:
				return new int[] { 4262, 4285, 1382 };
			case 1584:
				return new int[] { 239, 243, 289, 5152 };
			case 1585:
				return new int[] { 113, 1350, 3361, 4302, 3364, 3585, 3627, 5525 };
			case 1587:
				return new int[] { 463, 1354, 1685 };
			case 1589:
				return new int[] { 3310, 2313 };
			case 1590:
				return new int[] { 716, 1462, 4279, 900 };
			case 1593:
				return new int[] { 923, 1565, 4096 };
			case 1595:
				return new int[] { 3251, 155 };
			case 1596:
				return new int[] { 2933, 3253, 1364, 1802, 1707, 3470 };
			case 1597:
				return new int[] { 4327 };
			case 1600:
				return new int[] { 3266 };
			case 1602:
				return new int[] { 1706 };
			case 1617:
				return new int[] { 3265, 872, 2556 };
			case 1622:
				return new int[] { 1621, 1623 };
			case 1623:
				return new int[] { 1622 };
			case 1629:
				return new int[] { 744, 1220, 1428, 3151, 4253, 4419 };
			case 1630:
				return new int[] { 81, 115, 151, 165, 215, 217, 219, 259, 311, 353,
					397, 444, 464, 607, 645, 1347, 1351, 1941, 2010, 3158, 3294, 4285,
					4287, 4299, 4489, 4569, 4576, 6133 };
			case 1634:
				return new int[] { 1636, 4034, 4061 };
			case 1638:
				return new int[] { 1641 };
			case 1641:
				return new int[] { 1638 };
			case 1644:
				return new int[] { 58, 70, 80, 381, 386, 711, 1261, 1643, 2019, 2795,
					2837 };
			case 1647:
				return new int[] { 762 };
			case 1652:
				return new int[] { 820, 1122, 1426, 1704, 3211, 4235 };
			case 1668:
				return new int[] { 1686 };
			case 1677:
				return new int[] { 170, 497, 1090, 2553, 2563, 3623, 4559 };
			case 1681:
				return new int[] { 1015, 1691, 86, 175, 596, 981, 986, 1431, 266, 3355,
					5167 };
			case 1686:
				return new int[] { 1668, 1770 };
			case 1687:
				return new int[] { 253, 671, 1556, 1675, 4161 };
			case 1693:
				return new int[] { 3267, 4110, 4276 };
			case 1694:
				return new int[] { 1664, 1207, 1935 };
			case 1697:
				return new int[] { 336 };
			case 1702:
				return new int[] { 1048, 3133, 3392, 4390, 819 };
			case 1706:
				return new int[] { 1400 };
			case 1713:
				return new int[] { 1733 };
			case 1714:
				return new int[] { 261, 765, 4627, 5110 };
			case 1715:
				return new int[] { 861, 1328, 1339, 2764, 3508, 4103, 5147, 5184, 5216 };
			case 1716:
				return new int[] { 5150 };
			case 1718:
				return new int[] { 3432, 4145 };
			case 1726:
				return new int[] { 369 };
			case 1727:
				return new int[] { 1731 };
			case 1729:
				return new int[] { 4140 };
			case 1731:
				return new int[] { 33 };
			case 1732:
				return new int[] { 1272, 5094, 3445, 4109, 1740, 1776, 3333, 3401,
					3644, 2058, 3641, 4283, 91, 206, 409, 437, 477, 569, 586, 820, 985,
					1427, 1752, 2007, 3311, 3364, 3403, 4083, 4171, 4307 };
			case 1733:
				return new int[] { 1713, 5525 };
			case 1734:
				return new int[] { 448, 2648, 5525, 32, 82, 124, 159, 171, 219, 220,
					224, 255, 263, 273, 284, 288, 299, 394, 422, 432, 433, 459, 492, 511,
					521, 535, 539, 551, 555, 568, 586, 627, 629, 665, 669, 670, 674, 676,
					677, 679, 703, 709, 719, 720, 722, 723, 725, 755, 762, 763, 769, 773,
					774, 1161, 1179, 1183, 1186, 1188, 1204, 1231, 1254, 1262, 1268,
					1272, 1295, 1327, 1353, 1357, 1367, 1501, 1737, 1776, 2008, 2608,
					2611, 2617, 2629, 2632, 2811, 2845, 2848, 2852, 3158, 3350, 3541,
					3573, 3585, 3588, 3601, 3602, 3751, 4067, 4167, 4294, 4547, 4551,
					4555, 4556, 4560, 4573, 4577, 4608, 4611, 4612, 4614, 4623, 4626,
					5090, 5101, 5102, 5112, 5113, 5114, 5115, 5127, 5143, 5159, 5162,
					5176, 5185, 5196, 5212, 5226, 5227, 5234, 5236 };
			case 1735:
				return new int[] { 31, 283, 665, 677, 1367, 2246, 2345, 2845, 3476,
					3609, 3666, 4225, 4297, 4556, 5908, 5919, 349, 761, 1372, 1495, 1772,
					2169, 2608, 2617, 3158, 3423, 3453, 3521, 3993, 3997, 4294, 4502,
					4611, 5227, 6103, 6136, 6178, 549, 1483, 2644, 4293, 4493, 88, 614,
					995, 2650, 3346, 3348, 3397, 4190, 4546 };
			case 1740:
				return new int[] { 120, 701, 709, 1427, 5094, 4153, 369, 468, 858,
					1308, 1732, 1771, 2184, 4083, 4233 };
			case 1743:
				return new int[] { 126 };
			case 1744:
				return new int[] { 4210 };
			case 1745:
				return new int[] { 1776, 2835 };
			case 1746:
				return new int[] { 1409, 4209 };
			case 1749:
				return new int[] { 2124, 3391 };
			case 1751:
				return new int[] { 4324, 3606, 261, 663, 1431, 2353, 2658, 4275, 290,
					321, 401, 421, 618, 623, 624, 765, 1949, 3488, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199 };
			case 1752:
				return new int[] { 1272, 998, 1491, 566, 586, 1776, 2007, 2823 };
			case 1755:
				return new int[] { 55, 1094 };
			case 1761:
				return new int[] { 1760, 1042 };
			case 1764:
				return new int[] { 1531 };
			case 1769:
				return new int[] { 3676, 3670, 522, 661, 2664, 3358, 3551, 3562, 5096 };
			case 1772:
				return new int[] { 5227, 31, 549, 614, 2617, 2608, 4556, 490, 3397,
					307, 1372, 1495, 5919, 6137, 428, 505, 753, 787, 1306, 1323, 1334,
					2423, 4294, 4587, 5086, 5125, 5207 };
			case 1776:
				return new int[] { 1272, 586, 1427, 1732, 1752, 5094, 219, 432, 566,
					701, 709, 719, 722, 858, 985, 1737, 1740, 2007, 2811, 2823, 3751,
					4067, 4083, 4307, 5162, 5525 };
			case 1780:
				return new int[] { 260 };
			case 1782:
				return new int[] { 1912, 3497, 3672, 4062, 1430, 1708, 1781, 3324,
					3400, 4193, 4485 };
			case 1784:
				return new int[] { 132 };
			case 1787:
				return new int[] { 879, 1042, 5131 };
			case 1788:
				return new int[] { 2140, 2700, 3173 };
			case 1790:
				return new int[] { 5446 };
			case 1791:
				return new int[] { 716 };
			case 1794:
				return new int[] { 1241, 1585, 1793 };
			case 1795:
				return new int[] { 1739, 3209 };
			case 1796:
				return new int[] { 296, 763 };
			case 1797:
				return new int[] { 4148 };
			case 1800:
				return new int[] { 4149, 287, 317, 453, 311, 491, 672, 858, 1739, 2829,
					4494, 322, 1393, 2011, 4127 };
			case 1802:
				return new int[] { 1364, 1596, 1707, 2933, 3253, 3470 };
			case 1803:
				return new int[] { 111, 534, 594, 704 };
			case 1806:
				return new int[] { 2715 };
			case 1808:
				return new int[] { 1023, 1059, 1504, 2962, 3085, 3118, 3368, 4531 };
			case 1811:
				return new int[] { 4347 };
			case 1813:
				return new int[] { 3131 };
			case 1815:
				return new int[] { 2749 };
			case 1817:
				return new int[] { 2915 };
			case 1818:
				return new int[] { 3794 };
			case 1820:
				return new int[] { 4636, 170, 272, 1098, 1512, 2223, 2699, 2938, 3174,
					3181, 3478, 4559 };
			case 1821:
				return new int[] { 963 };
			case 1823:
				return new int[] { 170 };
			case 1826:
				return new int[] { 916 };
			case 1827:
				return new int[] { 1829, 1834 };
			case 1828:
				return new int[] { 2316 };
			case 1829:
				return new int[] { 4040 };
			case 1830:
				return new int[] { 4041 };
			case 1834:
				return new int[] { 1827, 1829 };
			case 1835:
				return new int[] { 4046 };
			case 1839:
				return new int[] { 4050 };
			case 1840:
				return new int[] { 3268 };
			case 1841:
				return new int[] { 4052 };
			case 1843:
				return new int[] { 2093 };
			case 1846:
				return new int[] { 4689, 3078, 4465, 4751, 4899 };
			case 1848:
				return new int[] { 996, 3831, 5138 };
			case 1853:
				return new int[] { 4699 };
			case 1856:
				return new int[] { 352 };
			case 1858:
				return new int[] { 4705 };
			case 1866:
				return new int[] { 1553 };
			case 1870:
				return new int[] { 1550 };
			case 1875:
				return new int[] { 1554, 4707 };
			case 1876:
				return new int[] { 1430, 1709, 1710, 1754, 1912, 1979, 2401, 2475,
					2702, 3244, 3363, 3429, 3430, 3431, 3432, 3445, 3499, 3528, 3624,
					4099, 4109, 4304, 4485 };
			case 1878:
				return new int[] { 254, 341, 1575, 1911, 1913, 1965, 1967, 1969, 2939,
					2998, 3034, 3052, 3070, 3089, 3105, 3121, 3210, 3383, 3614 };
			case 1883:
				return new int[] { 1968, 3080 };
			case 1885:
				return new int[] { 4107, 4214, 812, 876, 1006, 1393, 1493, 1987, 3138,
					3326, 4265, 5861 };
			case 1886:
				return new int[] { 4512, 3416, 4409, 4451, 4667 };
			case 1889:
				return new int[] { 2478 };
			case 1899:
				return new int[] { 6215 };
			case 1901:
				return new int[] { 1381, 3448, 4124, 1265, 3319 };
			case 1904:
				return new int[] { 3781 };
			case 1908:
				return new int[] { 36, 86, 175, 981, 986, 1015, 1431, 1681, 1691, 5039 };
			case 1910:
				return new int[] { 28, 887, 1781, 2400 };
			case 1911:
				return new int[] { 1969, 1709, 3429 };
			case 1912:
				return new int[] { 1430, 1710, 3432, 170, 1007, 1782, 3244, 4485 };
			case 1913:
				return new int[] { 1911, 1965, 1967, 1969, 3210, 341, 4485 };
			case 1914:
				return new int[] { 3671, 4484 };
			case 1918:
				return new int[] { 1513, 1783 };
			case 1919:
				return new int[] { 5202, 767, 2819, 3384, 3583, 4627 };
			case 1920:
				return new int[] { 896, 1429, 1573, 3356, 29, 113, 171, 356, 371, 611,
					615, 665, 744, 784, 844, 858, 859, 983, 990, 1147, 1250, 1265, 1350,
					1381, 1400, 1401, 1467, 1469, 1485, 1492, 1585, 1720, 1973, 2182,
					2297, 2298, 2330, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3361, 3364, 3380, 3549, 3627, 3699, 3778,
					3810, 4095, 4100, 4152, 4198, 4206, 4302, 4317, 4482, 4513, 4514,
					4537, 4841, 5153, 5443 };
			case 1923:
				return new int[] { 83, 1477, 3780 };
			case 1929:
				return new int[] { 4129, 4208, 661, 1302, 5469, 6135 };
			case 1931:
				return new int[] { 490, 787, 1306, 1323, 1334, 6137, 31, 272, 307, 487,
					505, 549, 614, 753, 2170, 2423, 2617, 4556, 4587, 5125, 5227 };
			case 1932:
				return new int[] { 586, 773, 1928, 446, 996, 1002, 3541, 4130, 4396 };
			case 1934:
				return new int[] { 4505, 1480, 4105, 4215, 4535, 793, 798, 2523, 2937,
					3130 };
			case 1937:
				return new int[] { 3437 };
			case 1939:
				return new int[] { 65, 119, 1115, 1367, 2024, 2619, 4244 };
			case 1940:
				return new int[] { 123, 339, 351, 2284, 3786, 4200 };
			case 1942:
				return new int[] { 3398, 1161, 1999, 4307 };
			case 1943:
				return new int[] { 2489 };
			case 1945:
				return new int[] { 1926, 4082 };
			case 1947:
				return new int[] { 1907 };
			case 1949:
				return new int[] { 261, 290, 321, 401, 421, 618, 623, 624, 663, 765,
					1431, 1751, 2353, 2658, 3488, 3606, 4275, 4324, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199 };
			case 1952:
				return new int[] { 375 };
			case 1954:
				return new int[] { 2084 };
			case 1955:
				return new int[] { 3442, 3405 };
			case 1958:
				return new int[] { 4341 };
			case 1960:
				return new int[] { 3435 };
			case 1961:
				return new int[] { 3704 };
			case 1965:
				return new int[] { 3432, 170 };
			case 1971:
				return new int[] { 2848 };
			case 1973:
				return new int[] { 744, 1381, 2909, 859, 1469, 2548, 2606, 2665, 3627 };
			case 1977:
				return new int[] { 685 };
			case 1985:
				return new int[] { 92, 168, 380, 2522, 3531 };
			case 1987:
				return new int[] { 812, 1006, 1393, 1493, 3326, 4265, 4537, 316, 876,
					1885, 3138, 4107, 4214 };
			case 1988:
				return new int[] { 659, 4545, 4576, 4578, 448, 945, 1367, 347, 459,
					548, 568, 576, 586, 594, 682, 748, 858, 896, 912, 947, 1195, 1231,
					1737, 1739, 2619, 3638, 3995, 4244, 4543, 4548, 4592, 4607, 5084,
					5150, 5205 };
			case 1993:
				return new int[] { 716, 4279, 3667, 4548 };
			case 1995:
				return new int[] { 369, 712, 1038, 1275, 3355, 5173, 5185, 85, 100,
					180, 193, 395, 479, 491, 1039, 1558, 1992, 2624, 2851, 3585, 4064,
					5422 };
			case 1998:
				return new int[] { 328 };
			case 1999:
				return new int[] { 4307, 670, 761, 1161, 1501, 1942, 2848, 3398, 4167,
					364 };
			default:
				return null;
		}
	}

	private static int[] getSimilarVerseIndices3000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 2004:
				return new int[] { 180, 296, 369, 468, 469, 701, 709, 1313, 13, 16,
					120, 311, 313, 473, 483, 741, 762, 945, 1295, 1302, 1324, 1458, 2005,
					2006, 2619, 2853, 3362, 3418, 3995, 4195, 4287, 4482, 5108, 5128,
					5181 };
			case 2007:
				return new int[] { 735, 776, 1427, 1752, 270, 719, 932, 1271, 3301,
					4519, 5193, 91, 210, 292, 444, 701, 722, 1272, 1314, 1343, 1732,
					1740, 1776, 2184, 2605, 2823, 4083, 5094, 5169 };
			case 2008:
				return new int[] { 4560, 720, 1327, 2629, 4608 };
			case 2009:
				return new int[] { 1494, 3163 };
			case 2010:
				return new int[] { 2019 };
			case 2011:
				return new int[] { 453 };
			case 2014:
				return new int[] { 756, 1228, 906, 29, 395, 535, 672, 674, 683, 930,
					1003, 1467, 3356, 3751, 4239 };
			case 2015:
				return new int[] { 179, 671, 933 };
			case 2016:
				return new int[] { 771, 1432, 1423, 5117, 542, 367, 370, 386, 5169 };
			case 2018:
				return new int[] { 1933 };
			case 2019:
				return new int[] { 1106, 2010 };
			case 2022:
				return new int[] { 3366, 136, 207, 1941 };
			case 2023:
				return new int[] { 387, 141, 949, 359 };
			case 2024:
				return new int[] { 119, 1456, 4489, 3527, 219, 347, 800, 1382 };
			case 2027:
				return new int[] { 3228 };
			case 2030:
				return new int[] { 3525 };
			case 2031:
				return new int[] { 2307 };
			case 2037:
				return new int[] { 2141 };
			case 2045:
				return new int[] { 2912 };
			case 2047:
				return new int[] { 120 };
			case 2048:
				return new int[] { 1090, 1382, 1580, 1589, 2313, 3310, 5707 };
			case 2049:
				return new int[] { 259, 853 };
			case 2050:
				return new int[] { 2067 };
			case 2054:
				return new int[] { 3446, 528 };
			case 2057:
				return new int[] { 2067 };
			case 2058:
				return new int[] { 1732, 3445, 3641, 4109, 4283, 3333, 3401, 3644, 2124 };
			case 2060:
				return new int[] { 514 };
			case 2062:
				return new int[] { 940 };
			case 2064:
				return new int[] { 1518, 3347, 3483 };
			case 2069:
				return new int[] { 2193, 2117, 3466, 4084 };
			case 2071:
				return new int[] { 888, 1381, 1901, 3448, 4124 };
			case 2074:
				return new int[] { 813, 2196 };
			case 2076:
				return new int[] { 2863 };
			case 2077:
				return new int[] { 2126 };
			case 2083:
				return new int[] { 259 };
			case 2084:
				return new int[] { 3627 };
			case 2089:
				return new int[] { 40, 964, 2189, 2463 };
			case 2091:
				return new int[] { 971 };
			case 2093:
				return new int[] { 1843 };
			case 2094:
				return new int[] { 4484 };
			case 2098:
				return new int[] { 4488 };
			case 2100:
				return new int[] { 4364 };
			case 2103:
				return new int[] { 2114 };
			case 2109:
				return new int[] { 3654 };
			case 2111:
				return new int[] { 4268 };
			case 2114:
				return new int[] { 2103 };
			case 2115:
				return new int[] { 2056, 2221, 3297, 3337, 4419 };
			case 2117:
				return new int[] { 3466, 4084, 2193, 2069 };
			case 2119:
				return new int[] { 272 };
			case 2122:
				return new int[] { 2194 };
			case 2124:
				return new int[] { 1749, 3391, 2058, 4517 };
			case 2126:
				return new int[] { 2077 };
			case 2139:
				return new int[] { 2856 };
			case 2141:
				return new int[] { 2037 };
			case 2143:
				return new int[] { 1431, 122 };
			case 2154:
				return new int[] { 932, 990, 1380 };
			case 2169:
				return new int[] { 31, 283, 349, 665, 677, 761, 1367, 1372, 1495, 1735,
					1772, 2246, 2345, 2608, 2617, 3158, 3423, 3453, 3476, 3521, 3609,
					3993, 3997, 4225, 4294, 4297, 4502, 4556, 4611, 5227, 5908, 5919,
					6103, 6136, 6178, 2845, 3666, 4493 };
			case 2176:
				return new int[] { 2599, 3670, 4199 };
			case 2182:
				return new int[] { 3332, 1400, 1492, 4317, 29, 113, 171, 356, 371, 611,
					615, 665, 744, 784, 844, 858, 859, 889, 896, 983, 990, 1147, 1250,
					1265, 1350, 1381, 1401, 1429, 1467, 1469, 1485, 1573, 1585, 1920,
					1973, 2297, 2298, 2330, 2548, 2549, 2580, 2606, 2665, 2667, 2871,
					2909, 3024, 3182, 3201, 3356, 3361, 3364, 3380, 3549, 3627, 3699,
					3778, 3810, 4095, 4100, 4198, 4206, 4302, 4482, 4513, 4514, 4537,
					4841, 5153, 5443 };
			case 2185:
				return new int[] { 2325, 2478, 3311, 4307, 4356, 4359 };
			case 2187:
				return new int[] { 882 };
			case 2190:
				return new int[] { 3506, 170, 686, 1138, 1369, 2913, 3416, 4300, 5078 };
			case 2191:
				return new int[] { 3315 };
			case 2193:
				return new int[] { 2117, 2069, 3466, 4084 };
			case 2195:
				return new int[] { 219, 836 };
			case 2200:
				return new int[] { 2202 };
			case 2205:
				return new int[] { 67, 3269 };
			case 2206:
				return new int[] { 2211, 2214 };
			case 2207:
				return new int[] { 3180 };
			case 2208:
				return new int[] { 3278, 3889 };
			case 2211:
				return new int[] { 2206, 2214 };
			case 2214:
				return new int[] { 2206, 2211 };
			case 2223:
				return new int[] { 1098, 1820, 3174, 3181 };
			case 2227:
				return new int[] { 3642 };
			case 2237:
				return new int[] { 864, 865, 866, 1378, 1500, 1535, 1695, 2128, 3198,
					4267 };
			case 2243:
				return new int[] { 91, 210, 601, 985, 1105, 1289, 1427, 1451, 1461,
					1740, 1776, 2705, 3364, 3415, 4083, 4183, 4233, 4248, 4356 };
			case 2244:
				return new int[] { 704, 218, 296, 347, 369, 472, 4483 };
			case 2245:
				return new int[] { 2195 };
			case 2246:
				return new int[] { 31, 3476, 3521, 4556, 5919, 283, 549, 665, 677,
					1367, 1372, 1735, 1772, 2345, 2608, 2617, 2845, 3609, 3666, 4225,
					4297, 5227, 5908, 349, 761, 1495, 2169, 3158, 3423, 3453, 3993, 3997,
					4294, 4502, 4611, 6103, 6136, 6178, 490, 614, 1110, 1483, 2644, 2650,
					4293, 4493, 88, 995, 3346, 3348, 3397, 4190, 4546 };
			case 2247:
				return new int[] { 380 };
			case 2257:
				return new int[] { 332 };
			case 2258:
				return new int[] { 2270, 332, 339, 1672, 4704 };
			case 2259:
				return new int[] { 333, 778 };
			case 2260:
				return new int[] { 3330, 3732 };
			case 2264:
				return new int[] { 2282 };
			case 2265:
				return new int[] { 2290, 2300, 2303, 2305 };
			case 2269:
				return new int[] { 339, 332, 2257 };
			case 2270:
				return new int[] { 2258 };
			case 2278:
				return new int[] { 2324 };
			case 2282:
				return new int[] { 2264 };
			case 2283:
				return new int[] { 649, 663, 93, 259, 337, 778, 780, 782, 784, 5168,
					5176 };
			case 2285:
				return new int[] { 343, 4388, 1528, 740, 785, 3765, 4385 };
			case 2286:
				return new int[] { 4389, 3996, 4734 };
			case 2290:
				return new int[] { 2305, 2300, 2303, 2265 };
			case 2297:
				return new int[] { 4198, 844, 990, 1147, 2667, 3699, 4095, 4513, 740,
					986, 2163, 4281 };
			case 2298:
				return new int[] { 2871 };
			case 2300:
				return new int[] { 2303, 2290, 2305, 2265 };
			case 2301:
				return new int[] { 3280 };
			case 2303:
				return new int[] { 2300, 2290, 2305 };
			case 2305:
				return new int[] { 2290, 2300, 2303, 2265 };
			case 2308:
				return new int[] { 1122 };
			case 2309:
				return new int[] { 3318, 616, 2429, 2924 };
			case 2311:
				return new int[] { 5003, 5706 };
			case 2313:
				return new int[] { 219, 1090, 1382, 1400, 1424, 1589, 2048, 2221, 3310,
					3614, 72, 108, 142, 155, 170, 261, 376, 736, 900, 907, 920, 1555,
					1573, 1595, 1717, 1933, 2088, 2457, 2498, 2510, 2670, 2874, 2939,
					2998, 3034, 3052, 3070, 3089, 3105, 3121, 3232, 3251, 3297, 3337,
					3749, 4242, 4263, 4285, 4451, 5132, 5494, 5525, 6081 };
			case 2316:
				return new int[] { 1828, 2258 };
			case 2320:
				return new int[] { 2870 };
			case 2322:
				return new int[] { 4516, 1378, 2666, 3648, 3751 };
			case 2323:
				return new int[] { 4665, 794, 2347, 3972 };
			case 2325:
				return new int[] { 2185, 5494, 490 };
			case 2327:
				return new int[] { 2336 };
			case 2330:
				return new int[] { 3778, 29, 113, 171, 356, 371, 611, 615, 665, 744,
					784, 844, 858, 859, 896, 983, 990, 1147, 1250, 1265, 1350, 1381,
					1400, 1401, 1429, 1467, 1469, 1485, 1492, 1573, 1585, 1920, 1973,
					2182, 2297, 2298, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3356, 3361, 3364, 3380, 3549, 3627, 3699,
					3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5153, 5443 };
			case 2336:
				return new int[] { 2327 };
			case 2337:
				return new int[] { 2508 };
			case 2339:
				return new int[] { 4276 };
			case 2342:
				return new int[] { 375, 1429, 1721, 2501, 2612, 2831, 3223, 3245, 3434,
					4125, 4929 };
			case 2345:
				return new int[] { 31, 283, 665, 677, 1367, 1735, 2246, 2845, 3476,
					3609, 3666, 4225, 4297, 4556, 5908, 5919, 349, 761, 1372, 1495, 1772,
					2169, 2608, 2617, 3158, 3423, 3453, 3521, 3993, 3997, 4294, 4502,
					4611, 5227, 6103, 6136, 6178, 549, 1483, 2644, 4293, 4493, 88, 614,
					995, 2650, 3346, 3348, 3397, 4190, 4546 };
			case 2347:
				return new int[] { 4665 };
			case 2353:
				return new int[] { 261, 663, 1431, 1751, 2658, 3606, 4275, 4324, 290,
					321, 401, 421, 618, 623, 624, 765, 1949, 3488, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199, 685, 686, 1886, 2314, 2913, 2955, 3416,
					3506, 3792, 3979, 4035, 4409, 4420, 4451, 4512, 4667, 5708, 122,
					5149, 39, 113, 170, 734, 788, 867, 1138, 1350, 1369, 1429, 1464,
					1595, 1977, 2190, 2498, 2959, 3183, 3223, 3627, 3703, 3996, 4169,
					4300, 5078, 5084, 5202 };
			case 2357:
				return new int[] { 3280 };
			case 2359:
				return new int[] { 5727 };
			case 2362:
				return new int[] { 1739, 4149, 4494, 5532 };
			case 2369:
				return new int[] { 3283, 3170 };
			case 2397:
				return new int[] { 3509 };
			case 2399:
				return new int[] { 868, 1140 };
			case 2400:
				return new int[] { 4334, 28 };
			case 2401:
				return new int[] { 1430, 1709, 1710, 1754, 1876, 1912, 1979, 2475,
					2702, 3244, 3363, 3429, 3430, 3431, 3432, 3445, 3499, 3528, 3624,
					4099, 4109, 4304, 4485 };
			case 2408:
				return new int[] { 252, 881 };
			case 2412:
				return new int[] { 1068 };
			case 2417:
				return new int[] { 1074, 2978 };
			case 2418:
				return new int[] { 2980 };
			case 2421:
				return new int[] { 5960 };
			case 2423:
				return new int[] { 753, 505, 1306, 6137, 307, 490, 549, 614, 787, 1323,
					1334, 1772, 1931, 4587, 5086, 5125, 5207, 5227, 2170, 31, 428, 2617,
					3397, 5142, 5174 };
			case 2429:
				return new int[] { 2309, 3318, 2924 };
			case 2435:
				return new int[] { 1101 };
			case 2436:
				return new int[] { 744, 3647, 497, 1141, 1412, 1722, 1973, 2857, 4544 };
			case 2445:
				return new int[] { 868, 1042, 5228 };
			case 2448:
				return new int[] { 2244 };
			case 2449:
				return new int[] { 861, 5689, 3245 };
			case 2457:
				return new int[] { 261, 2510, 2670 };
			case 2458:
				return new int[] { 2408, 6052 };
			case 2459:
				return new int[] { 616, 2576 };
			case 2460:
				return new int[] { 4085, 4278 };
			case 2463:
				return new int[] { 40, 964, 2089, 2189 };
			case 2468:
				return new int[] { 975 };
			case 2470:
				return new int[] { 44 };
			case 2475:
				return new int[] { 3528 };
			case 2476:
				return new int[] { 1382, 1582, 4262, 4285 };
			case 2477:
				return new int[] { 4668 };
			case 2483:
				return new int[] { 2288 };
			case 2484:
				return new int[] { 2936 };
			case 2486:
				return new int[] { 143, 801, 903, 3344, 3399 };
			case 2489:
				return new int[] { 1943 };
			case 2496:
				return new int[] { 3756, 5301 };
			case 2498:
				return new int[] { 3996, 4451, 1886, 4512, 4667 };
			case 2501:
				return new int[] { 1159, 3434 };
			case 2504:
				return new int[] { 2763, 4406, 1759, 3319, 3946 };
			case 2508:
				return new int[] { 2337, 122 };
			case 2510:
				return new int[] { 261, 2457 };
			case 2511:
				return new int[] { 994 };
			case 2513:
				return new int[] { 5648 };
			case 2515:
				return new int[] { 1007, 4254, 1912, 2752, 2916 };
			case 2520:
				return new int[] { 1411, 3229, 3634, 3752, 5265, 3530 };
			case 2521:
				return new int[] { 5525, 302, 408, 5089 };
			case 2522:
				return new int[] { 168, 380, 1985, 3531 };
			case 2523:
				return new int[] { 798 };
			case 2530:
				return new int[] { 93, 1582, 2129, 2721, 2889, 3294, 3525, 4185, 4262 };
			case 2531:
				return new int[] { 3677, 5252, 4080 };
			case 2533:
				return new int[] { 1126 };
			case 2536:
				return new int[] { 862, 1013, 1625, 2287, 3336, 3479, 3629, 3751, 4079,
					4364, 4541, 5269 };
			case 2538:
				return new int[] { 1366, 373, 1007, 1708 };
			case 2547:
				return new int[] { 1551, 2130 };
			case 2548:
				return new int[] { 744, 859, 1381, 1469, 1973, 2606, 2909, 2665, 784,
					29, 86, 113, 171, 175, 356, 371, 596, 611, 615, 665, 844, 858, 896,
					981, 983, 986, 990, 1015, 1147, 1250, 1265, 1350, 1400, 1401, 1429,
					1431, 1467, 1485, 1492, 1573, 1585, 1681, 1691, 1920, 2182, 2297,
					2298, 2330, 2549, 2580, 2667, 2871, 3024, 3182, 3201, 3332, 3356,
					3361, 3364, 3380, 3549, 3627, 3699, 3778, 3810, 4095, 4100, 4198,
					4206, 4302, 4317, 4482, 4513, 4514, 4537, 4841, 5153, 5443 };
			case 2549:
				return new int[] { 1467, 2580, 3356, 5153, 29, 113, 171, 356, 371, 611,
					615, 665, 744, 784, 844, 858, 859, 896, 983, 990, 1147, 1250, 1265,
					1350, 1381, 1400, 1401, 1429, 1469, 1485, 1492, 1573, 1585, 1920,
					1973, 2182, 2297, 2298, 2330, 2548, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3361, 3364, 3380, 3549, 3627, 3699, 3778,
					3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5443 };
			case 2552:
				return new int[] { 3885 };
			case 2553:
				return new int[] { 1090, 2563, 3623 };
			case 2559:
				return new int[] { 1130, 1129, 2890, 1017, 1025 };
			case 2576:
				return new int[] { 2459 };
			case 2580:
				return new int[] { 1467, 2549, 3356, 5153, 29, 113, 171, 356, 371, 611,
					615, 665, 744, 784, 844, 858, 859, 896, 983, 990, 1147, 1250, 1265,
					1350, 1381, 1400, 1401, 1429, 1469, 1485, 1492, 1573, 1585, 1920,
					1973, 2182, 2297, 2298, 2330, 2548, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3361, 3364, 3380, 3549, 3627, 3699, 3778,
					3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5443 };
			case 2582:
				return new int[] { 31, 1578, 1487 };
			case 2592:
				return new int[] { 1158 };
			case 2594:
				return new int[] { 1613, 818, 4543 };
			case 2597:
				return new int[] { 2602, 3488, 932, 3474 };
			case 2600:
				return new int[] { 3458, 4542, 115, 265, 4280, 26, 112, 154, 290, 318,
					321, 457, 481, 685, 687, 708, 788, 805, 1200, 1273, 1476, 1977, 2835,
					3359, 3660, 4256, 5076, 5131, 5199, 5228, 5236, 5241, 67, 881, 3485,
					5590 };
			case 2601:
				return new int[] { 2160, 4504 };
			case 2602:
				return new int[] { 3488, 2597, 712, 191, 896, 932, 3474, 66, 108, 126,
					193, 223, 230, 235, 237, 241, 289, 365, 516, 530, 569, 597, 600, 634,
					635, 717, 859, 930, 936, 1038, 1206, 1268, 1354, 1550, 1737, 1742,
					1961, 2061, 2823, 2848, 2922, 3301, 3329, 3501, 3568, 3583, 3664,
					3670, 3677, 3995, 4286, 4599, 5096, 5196, 5217 };
			case 2604:
				return new int[] { 474, 1210 };
			case 2606:
				return new int[] { 744, 859, 1381, 1469, 1973, 2548, 2909 };
			case 2608:
				return new int[] { 2617, 4556, 5227, 1772, 614, 31, 5236, 5919, 490,
					549, 665, 677, 1367, 1372, 2845, 3158, 4294, 4611 };
			case 2610:
				return new int[] { 278, 3307 };
			case 2611:
				return new int[] { 5236, 1231, 4611, 2848 };
			case 2616:
				return new int[] { 3522 };
			case 2617:
				return new int[] { 2608, 4556, 5227, 31, 614, 1772, 549, 490, 3397,
					3692, 4294, 5919 };
			case 2626:
				return new int[] { 2624 };
			case 2629:
				return new int[] { 9, 1161, 1162 };
			case 2631:
				return new int[] { 2848 };
			case 2632:
				return new int[] { 432, 755, 3486, 32, 82, 159, 171, 196, 219, 220,
					224, 255, 263, 273, 284, 288, 394, 422, 433, 448, 492, 511, 521, 535,
					539, 551, 568, 586, 599, 627, 629, 665, 669, 670, 674, 676, 677, 679,
					703, 719, 722, 723, 725, 762, 763, 769, 773, 774, 1179, 1183, 1186,
					1188, 1204, 1231, 1238, 1241, 1254, 1262, 1268, 1272, 1295, 1353,
					1357, 1367, 1501, 1734, 1737, 1776, 2608, 2611, 2617, 2648, 2811,
					2845, 2848, 2852, 3158, 3350, 3541, 3573, 3585, 3588, 3601, 3602,
					3751, 4067, 4167, 4294, 4547, 4551, 4555, 4556, 4577, 4611, 4612,
					4623, 4626, 5101, 5102, 5112, 5113, 5114, 5115, 5143, 5157, 5159,
					5162, 5166, 5176, 5185, 5196, 5212, 5226, 5227, 5234, 5236, 5525 };
			case 2636:
				return new int[] { 1304, 3981, 4641, 1758, 4137, 4163, 4854, 3663 };
			case 2638:
				return new int[] { 3650 };
			case 2639:
				return new int[] { 265, 2181 };
			case 2643:
				return new int[] { 1497, 5420 };
			case 2644:
				return new int[] { 3609, 3666, 677, 1233, 2650, 2816, 3476, 4225, 5908,
					5919, 31, 283, 549, 665, 1367, 1483, 1735, 2246, 2345, 2845, 4293,
					4297, 4556, 4611, 88, 349, 614, 761, 995, 1372, 1495, 1772, 2169,
					2608, 2617, 3158, 3346, 3348, 3397, 3423, 3453, 3521, 3993, 3997,
					4190, 4294, 4493, 4502, 4546, 5227, 6103, 6136, 6178 };
			case 2645:
				return new int[] { 3610, 3643 };
			case 2647:
				return new int[] { 5525 };
			case 2648:
				return new int[] { 219 };
			case 2649:
				return new int[] { 1737 };
			case 2650:
				return new int[] { 1372, 3476, 2644, 4293, 31, 549, 614, 1772, 2246,
					2608, 2617, 3521, 4556, 4611, 5227, 5919 };
			case 2651:
				return new int[] { 5093, 45, 678, 754, 5208, 470, 3362, 3666, 4483,
					3424, 3474, 4481 };
			case 2652:
				return new int[] { 224, 4548, 5494 };
			case 2654:
				return new int[] { 4294, 367 };
			case 2655:
				return new int[] { 3497, 3672, 5080, 1007, 1586, 1709, 2834 };
			case 2656:
				return new int[] { 3498, 4547 };
			case 2658:
				return new int[] { 261, 663, 1431, 1751, 2353, 3606, 4275, 4324, 290,
					321, 401, 421, 618, 623, 624, 765, 1949, 3488, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199, 122, 5149, 3494 };
			case 2660:
				return new int[] { 34, 3448, 4498 };
			case 2663:
				return new int[] { 347, 1992, 119, 633, 579, 716, 952, 1456, 2024,
					3323, 3364, 3527, 4489, 4498 };
			case 2664:
				return new int[] { 3670, 5096, 3358 };
			case 2668:
				return new int[] { 879, 4124, 2634 };
			case 2669:
				return new int[] { 171, 210, 213, 230, 389, 606, 712, 932, 2597, 2602,
					2605, 2612, 2655, 2811, 3349, 3474, 3488, 3496, 3687, 5098, 5104 };
			case 2670:
				return new int[] { 261, 2457, 2510 };
			case 2671:
				return new int[] { 422, 492, 703, 758, 1204 };
			case 2674:
				return new int[] { 4685, 4746 };
			case 2675:
				return new int[] { 1370 };
			case 2677:
				return new int[] { 5403 };
			case 2678:
				return new int[] { 5404 };
			case 2679:
				return new int[] { 5405 };
			case 2681:
				return new int[] { 5408 };
			case 2683:
				return new int[] { 45, 87, 88, 223, 263, 281, 399, 408, 989, 995, 1389,
					1390, 1495, 1711, 5120 };
			case 2684:
				return new int[] { 3510 };
			case 2685:
				return new int[] { 5642 };
			case 2690:
				return new int[] { 4335 };
			case 2691:
				return new int[] { 2693, 272, 1905, 4397 };
			case 2694:
				return new int[] { 4212 };
			case 2695:
				return new int[] { 1012, 1018, 1026, 1038, 1522, 1533, 1556 };
			case 2698:
				return new int[] { 2711, 3369 };
			case 2702:
				return new int[] { 1430, 1709, 1710, 1754, 1876, 1912, 1979, 2401,
					2475, 3244, 3363, 3429, 3430, 3431, 3432, 3445, 3499, 3528, 3624,
					4099, 4109, 4304, 4485 };
			case 2703:
				return new int[] { 794 };
			case 2704:
				return new int[] { 1012, 1018, 1026, 1038, 1522, 1533, 1556, 2695 };
			case 2709:
				return new int[] { 4496, 817 };
			case 2710:
				return new int[] { 809, 881, 932, 990, 1380, 1490, 2154, 3407, 4295,
					108, 1042, 1760, 2408 };
			case 2711:
				return new int[] { 2698, 3369 };
			case 2715:
				return new int[] { 1806 };
			case 2717:
				return new int[] { 1568, 4155 };
			case 2718:
				return new int[] { 1438, 1086 };
			case 2721:
				return new int[] { 3294, 93, 1582, 2889, 3525, 4262, 942, 4185, 59,
					2129, 2530 };
			case 2723:
				return new int[] { 3616 };
			case 2725:
				return new int[] { 3440 };
			case 2733:
				return new int[] { 2572 };
			case 2734:
				return new int[] { 4126, 940 };
			case 2738:
				return new int[] { 2777, 4503 };
			case 2744:
				return new int[] { 3644 };
			case 2747:
				return new int[] { 21, 898, 1139, 1374 };
			case 2749:
				return new int[] { 832, 1815 };
			case 2750:
				return new int[] { 5263, 3511, 963 };
			case 2752:
				return new int[] { 801, 2515, 2916, 264, 1369, 4200 };
			case 2754:
				return new int[] { 3803, 5025, 3840, 4632 };
			case 2755:
				return new int[] { 3226 };
			case 2758:
				return new int[] { 1722 };
			case 2760:
				return new int[] { 3787, 952 };
			case 2764:
				return new int[] { 861, 1328, 1339, 1715, 3508, 4103, 5147, 5184, 5216 };
			case 2766:
				return new int[] { 1103 };
			case 2768:
				return new int[] { 4251 };
			case 2773:
				return new int[] { 5335 };
			case 2774:
				return new int[] { 961 };
			case 2775:
				return new int[] { 962 };
			case 2777:
				return new int[] { 2738, 4503 };
			case 2781:
				return new int[] { 308, 1108 };
			case 2785:
				return new int[] { 2158 };
			case 2788:
				return new int[] { 2461 };
			case 2795:
				return new int[] { 381, 702, 1261, 2823, 5115, 2019, 224, 671, 707,
					762, 1239, 1351, 2845, 2852, 4294, 4548, 5102, 5156, 5212, 5494, 58,
					70, 80, 179, 188, 198, 205, 232, 386, 711, 766, 1228, 1333, 1336,
					1643, 1644, 2015, 2837, 4625, 5161 };
			case 2800:
				return new int[] { 575, 2804, 2810, 2811, 70, 605, 257, 518, 2848,
					5159, 5494 };
			case 2804:
				return new int[] { 575, 2800, 2810, 2811 };
			case 2808:
				return new int[] { 2848, 518, 2849, 253, 504, 668, 1230, 1249, 1294,
					1331, 1340, 2646, 4619, 5159, 225, 272, 1344, 2851 };
			case 2810:
				return new int[] { 575, 2800, 2804, 2811, 70, 605, 5494, 149, 179, 257,
					671, 1351, 2015 };
			case 2813:
				return new int[] { 701, 709, 120, 468, 2804, 2809 };
			case 2814:
				return new int[] { 4237, 896, 915, 1664, 3043, 3519, 3521, 4523, 5002 };
			case 2815:
				return new int[] { 3237, 32, 67, 97, 115, 150, 219, 288, 354, 446, 663,
					716, 850, 881, 986, 1058, 1122, 1166, 1263, 1282, 1393, 1395, 1398,
					1399, 1445, 1723, 1771, 2461, 2600, 2648, 2656, 2788, 3498, 3536,
					3585, 3690, 4232, 4295, 4547, 5090 };
			case 2817:
				return new int[] { 3585 };
			case 2819:
				return new int[] { 767 };
			case 2824:
				return new int[] { 220 };
			case 2826:
				return new int[] { 120 };
			case 2828:
				return new int[] { 218, 329 };
			case 2832:
				return new int[] { 686, 685, 4596, 481, 4499 };
			case 2834:
				return new int[] { 305, 5737 };
			case 2836:
				return new int[] { 219, 148, 1388 };
			case 2838:
				return new int[] { 315, 2841 };
			case 2842:
				return new int[] { 505, 3603, 4599, 506, 561, 572, 592, 724, 1172,
					3568, 5129, 5469 };
			case 2846:
				return new int[] { 2672, 49, 89, 116, 283, 569, 1239, 1245, 2635, 5116,
					5494 };
			case 2847:
				return new int[] { 2666, 5089 };
			case 2849:
				return new int[] { 2848 };
			case 2856:
				return new int[] { 2139 };
			case 2857:
				return new int[] { 1722, 2084, 744, 1141, 1412, 2436, 3627, 3647, 3727,
					4100, 4410 };
			case 2863:
				return new int[] { 2076 };
			case 2866:
				return new int[] { 3657, 3658, 4261 };
			case 2870:
				return new int[] { 1931, 1090, 2320 };
			case 2871:
				return new int[] { 2298 };
			case 2885:
				return new int[] { 900 };
			case 2886:
				return new int[] { 3636 };
			case 2888:
				return new int[] { 4117 };
			case 2889:
				return new int[] { 93, 1582, 2721, 3294, 3525, 4262, 4185, 59, 942,
					2129, 2530 };
			case 2890:
				return new int[] { 1129, 1130, 2559, 938, 993, 1017, 1025, 1436, 5181 };
			case 2901:
				return new int[] { 1709, 885, 1430, 4193, 2916, 4334, 28, 2400, 3324,
					3784, 4196, 4211, 5255 };
			case 2902:
				return new int[] { 1010, 3221, 170, 887 };
			case 2903:
				return new int[] { 4335, 4640 };
			case 2905:
				return new int[] { 911 };
			case 2907:
				return new int[] { 3671 };
			case 2908:
				return new int[] { 1479, 1010 };
			case 2909:
				return new int[] { 1381, 1973, 744, 859, 1469, 2548, 2606, 2665, 108 };
			case 2912:
				return new int[] { 573, 2045 };
			case 2913:
				return new int[] { 3506, 5078, 1007, 1366 };
			case 2914:
				return new int[] { 97 };
			case 2915:
				return new int[] { 1709, 2400, 4334, 1817 };
			case 2916:
				return new int[] { 1430, 1709, 2515, 2752, 2901, 4193 };
			case 2921:
				return new int[] { 644 };
			case 2922:
				return new int[] { 2061, 939, 237, 5196 };
			case 2923:
				return new int[] { 4081, 4104 };
			case 2924:
				return new int[] { 588, 592, 644, 2925, 3537, 3582, 3591, 3605, 4596 };
			case 2925:
				return new int[] { 2924, 4250 };
			case 2928:
				return new int[] { 5135, 5236 };
			case 2932:
				return new int[] { 3252 };
			case 2933:
				return new int[] { 1364, 1596, 1707, 1802, 3253, 3470 };
			case 2935:
				return new int[] { 2123 };
			case 2936:
				return new int[] { 2484 };
			case 2937:
				return new int[] { 793, 798, 1480, 1934, 2523, 3130, 4105, 4215, 4505,
					4535 };
			case 2938:
				return new int[] { 3478, 4636, 170, 272, 1512, 1820, 2599, 2699, 4559 };
			case 2939:
				return new int[] { 2998, 3034, 3052, 3070, 3089, 3105, 3121, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 2940:
				return new int[] { 2999, 3035, 3053, 3071, 3090, 3106, 3122 };
			case 2947:
				return new int[] { 4370 };
			case 2955:
				return new int[] { 4420, 39, 2959 };
			case 2959:
				return new int[] { 2955, 5483 };
			case 2962:
				return new int[] { 1023, 1059, 1504, 1808, 3085, 3118, 3368, 4531 };
			case 2963:
				return new int[] { 1060 };
			case 2964:
				return new int[] { 1061 };
			case 2965:
				return new int[] { 1062 };
			case 2972:
				return new int[] { 1066 };
			case 2973:
				return new int[] { 1067 };
			case 2974:
				return new int[] { 1443, 2408 };
			case 2976:
				return new int[] { 1070 };
			case 2978:
				return new int[] { 1074, 2417 };
			case 2980:
				return new int[] { 2418 };
			case 2988:
				return new int[] { 4438 };
			case 2998:
				return new int[] { 2939, 3034, 3052, 3070, 3089, 3105, 3121, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 2999:
				return new int[] { 2940, 3035, 3053, 3071, 3090, 3106, 3122 };
			default:
				return null;
		}
	}

	private static int[] getSimilarVerseIndices4000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 3006:
				return new int[] { 3023 };
			case 3014:
				return new int[] { 330, 3887 };
			case 3019:
				return new int[] { 4184 };
			case 3023:
				return new int[] { 3006 };
			case 3024:
				return new int[] { 29, 113, 171, 356, 371, 611, 615, 665, 744, 784,
					844, 858, 859, 896, 983, 990, 1147, 1250, 1265, 1350, 1381, 1400,
					1401, 1429, 1467, 1469, 1485, 1492, 1573, 1585, 1920, 1973, 2182,
					2297, 2298, 2330, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3182, 3201, 3332, 3356, 3361, 3364, 3380, 3549, 3627, 3699, 3778,
					3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5153, 5443 };
			case 3028:
				return new int[] { 456, 1603, 3728, 5178 };
			case 3034:
				return new int[] { 2939, 2998, 3052, 3070, 3089, 3105, 3121, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 3035:
				return new int[] { 2940, 2999, 3053, 3071, 3090, 3106, 3122 };
			case 3040:
				return new int[] { 3058, 3076, 3095, 3111 };
			case 3043:
				return new int[] { 1664, 896, 915, 2814, 3519, 3521, 4237, 4523, 5002 };
			case 3047:
				return new int[] { 3098 };
			case 3050:
				return new int[] { 1436, 1017, 3745 };
			case 3052:
				return new int[] { 2939, 2998, 3034, 3070, 3089, 3105, 3121, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 3053:
				return new int[] { 2940, 2999, 3035, 3071, 3090, 3106, 3122 };
			case 3058:
				return new int[] { 3040, 3076, 3095, 3111 };
			case 3066:
				return new int[] { 1012, 4530, 803, 1378, 1475, 1498, 1556, 3087, 3120,
					4070 };
			case 3070:
				return new int[] { 2939, 2998, 3034, 3052, 3089, 3105, 3121 };
			case 3071:
				return new int[] { 2940, 2999, 3035, 3053, 3090, 3106, 3122 };
			case 3076:
				return new int[] { 3040, 3058, 3095, 3111 };
			case 3080:
				return new int[] { 1883, 1968 };
			case 3085:
				return new int[] { 1023, 1059, 1504, 1808, 2962, 3118, 3368, 4531 };
			case 3087:
				return new int[] { 1026, 1536, 803, 1012, 1378, 3066, 3120, 4070, 4530 };
			case 3089:
				return new int[] { 2939, 2998, 3034, 3052, 3070, 3105, 3121 };
			case 3090:
				return new int[] { 2940, 2999, 3035, 3053, 3071, 3106, 3122 };
			case 3091:
				return new int[] { 4878 };
			case 3095:
				return new int[] { 3040, 3058, 3076, 3111 };
			case 3098:
				return new int[] { 3047 };
			case 3102:
				return new int[] { 3922 };
			case 3104:
				return new int[] { 3216 };
			case 3105:
				return new int[] { 2939, 2998, 3034, 3052, 3070, 3089, 3121, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 3106:
				return new int[] { 2940, 2999, 3035, 3053, 3071, 3090, 3122 };
			case 3111:
				return new int[] { 3040, 3058, 3076, 3095 };
			case 3112:
				return new int[] { 3439 };
			case 3114:
				return new int[] { 1557, 66, 1027, 1038, 3375 };
			case 3118:
				return new int[] { 1023, 1059, 1504, 1808, 2962, 3085, 3368, 3614,
					4531, 4778 };
			case 3119:
				return new int[] { 1564 };
			case 3120:
				return new int[] { 803, 1012, 1378, 3066, 3087, 4070, 4530, 120, 180,
					369, 704, 1475, 1498, 1556, 1575, 2596, 2603, 2649, 3995, 4316, 4389 };
			case 3121:
				return new int[] { 2939, 2998, 3034, 3052, 3070, 3089, 3105, 254, 341,
					1575, 1878, 1911, 1913, 1965, 1967, 1969, 3210, 3383, 3614 };
			case 3122:
				return new int[] { 2940, 2999, 3035, 3053, 3071, 3090, 3106 };
			case 3130:
				return new int[] { 793, 798, 1480, 1934, 2523, 2937, 4105, 4215, 4505,
					4535 };
			case 3131:
				return new int[] { 1813 };
			case 3132:
				return new int[] { 1451, 1460 };
			case 3133:
				return new int[] { 1048, 1702, 3392, 4390, 1610, 3176, 3208, 3260, 3262 };
			case 3138:
				return new int[] { 812, 876, 1006, 1393, 1493, 1885, 1987, 3326, 4107,
					4214, 4265 };
			case 3142:
				return new int[] { 1492 };
			case 3144:
				return new int[] { 3339 };
			case 3147:
				return new int[] { 1404 };
			case 3151:
				return new int[] { 744, 1220, 1428, 1629, 4253, 4419 };
			case 3158:
				return new int[] { 2845, 171, 665, 677, 1367, 2608, 2617, 3993, 4294,
					4556, 4611, 5227 };
			case 3161:
				return new int[] { 3472, 723, 4224, 1162, 1491, 1632 };
			case 3163:
				return new int[] { 1494, 2009 };
			case 3164:
				return new int[] { 1473 };
			case 3165:
				return new int[] { 3280 };
			case 3166:
				return new int[] { 3281 };
			case 3167:
				return new int[] { 418, 3632, 4058, 4274, 4474, 4511 };
			case 3168:
				return new int[] { 3282 };
			case 3170:
				return new int[] { 3283 };
			case 3171:
				return new int[] { 3648, 5168, 1439, 3287, 4516, 4354 };
			case 3172:
				return new int[] { 1056, 1037, 1039, 1402, 1436, 3209, 3291, 3860, 4349 };
			case 3181:
				return new int[] { 1098, 1820, 2223, 3174 };
			case 3182:
				return new int[] { 3377 };
			case 3183:
				return new int[] { 3606, 5078, 5202 };
			case 3184:
				return new int[] { 1363, 2788 };
			case 3188:
				return new int[] { 0 };
			case 3195:
				return new int[] { 31 };
			case 3201:
				return new int[] { 100, 5153 };
			case 3203:
				return new int[] { 1026, 1533 };
			case 3204:
				return new int[] { 1550 };
			case 3208:
				return new int[] { 1048, 1610, 1702, 3133, 3176, 3260, 3262, 3392, 4390 };
			case 3209:
				return new int[] { 1037, 1056, 1402, 1436, 3172, 3291, 3860, 4349, 429,
					799, 1039, 1704, 1936, 3227, 3417, 3450, 3703, 4153, 4214, 4554 };
			case 3210:
				return new int[] { 1911, 1913, 1965, 1967, 1969 };
			case 3211:
				return new int[] { 1426, 4235, 1652 };
			case 3212:
				return new int[] { 1033, 3367 };
			case 3213:
				return new int[] { 1034 };
			case 3214:
				return new int[] { 1035, 3363, 3368 };
			case 3216:
				return new int[] { 3104 };
			case 3217:
				return new int[] { 627, 676, 1975, 3173, 3660 };
			case 3225:
				return new int[] { 1711, 1762, 2858, 2886, 3351, 3608, 3612, 3636,
					3648, 4243, 4246, 4520 };
			case 3226:
				return new int[] { 2755 };
			case 3227:
				return new int[] { 3450, 429, 1037, 1936, 799, 1039, 1056, 1402, 1436,
					1704, 3172, 3209, 3291, 3359, 3417, 3703, 3860, 4153, 4214, 4349,
					4554 };
			case 3228:
				return new int[] { 2027, 1889 };
			case 3229:
				return new int[] { 1411, 2520, 3634, 3752, 5265, 3530 };
			case 3230:
				return new int[] { 342, 4387 };
			case 3231:
				return new int[] { 249, 1423, 4193, 257, 1489, 1633 };
			case 3232:
				return new int[] { 3320 };
			case 3233:
				return new int[] { 1424, 847, 1478, 3608 };
			case 3234:
				return new int[] { 191, 1400 };
			case 3236:
				return new int[] { 1456, 4489 };
			case 3237:
				return new int[] { 67, 115, 451, 663, 760, 881, 986, 1058, 1122, 1935,
					2600, 2605, 2844, 4295, 5210 };
			case 3238:
				return new int[] { 3460 };
			case 3239:
				return new int[] { 3461 };
			case 3244:
				return new int[] { 1430, 1912 };
			case 3247:
				return new int[] { 3335, 948 };
			case 3250:
				return new int[] { 1471 };
			case 3251:
				return new int[] { 1595, 155, 920, 80, 91, 146, 391, 996 };
			case 3252:
				return new int[] { 2932 };
			case 3253:
				return new int[] { 1364, 1596, 1707, 1802, 2933, 3470 };
			case 3257:
				return new int[] { 3259 };
			case 3259:
				return new int[] { 3257 };
			case 3262:
				return new int[] { 1048, 1610, 1702, 3133, 3176, 3208, 3260, 3392, 4390 };
			case 3264:
				return new int[] { 2387 };
			case 3265:
				return new int[] { 1617, 872, 2556 };
			case 3268:
				return new int[] { 1840 };
			case 3269:
				return new int[] { 3266 };
			case 3272:
				return new int[] { 2700, 3276, 5239 };
			case 3280:
				return new int[] { 3165 };
			case 3282:
				return new int[] { 3168 };
			case 3283:
				return new int[] { 3170 };
			case 3287:
				return new int[] { 3648, 5168 };
			case 3291:
				return new int[] { 1402, 1037, 1056, 1436, 3172, 3209, 3860, 4349,
					4714, 429, 799, 1039, 1704, 1936, 3227, 3417, 3450, 3703, 4153, 4214,
					4554 };
			case 3293:
				return new int[] { 1532, 1571, 1109, 1930, 4067 };
			case 3294:
				return new int[] { 942, 2721 };
			case 3295:
				return new int[] { 3297, 149, 336, 1141, 1560, 1697, 2190, 3296, 3337,
					3387, 4518 };
			case 3297:
				return new int[] { 3505 };
			case 3300:
				return new int[] { 100, 4513 };
			case 3301:
				return new int[] { 932 };
			case 3303:
				return new int[] { 127, 152, 808, 877 };
			case 3305:
				return new int[] { 1728 };
			case 3307:
				return new int[] { 278 };
			case 3311:
				return new int[] { 4307, 820, 91, 116, 409, 490, 1042, 1732, 1740,
					3364, 5094, 5494 };
			case 3312:
				return new int[] { 477 };
			case 3313:
				return new int[] { 3325, 810, 3316 };
			case 3315:
				return new int[] { 2191 };
			case 3316:
				return new int[] { 3313, 3325 };
			case 3318:
				return new int[] { 2309, 2429, 2924 };
			case 3319:
				return new int[] { 4777 };
			case 3320:
				return new int[] { 3232, 1477 };
			case 3322:
				return new int[] { 3323 };
			case 3323:
				return new int[] { 3322 };
			case 3324:
				return new int[] { 1914, 1430, 3454, 4193, 4484, 3671, 191, 4282 };
			case 3325:
				return new int[] { 3313, 810, 3316 };
			case 3326:
				return new int[] { 812, 1006, 1393, 1493, 1987 };
			case 3331:
				return new int[] { 68, 569, 737 };
			case 3332:
				return new int[] { 2182, 4317, 924, 1400, 1492 };
			case 3335:
				return new int[] { 948, 3247 };
			case 3337:
				return new int[] { 1457 };
			case 3340:
				return new int[] { 7, 293, 3409, 3469, 3503 };
			case 3342:
				return new int[] { 1277, 124, 447, 623, 936, 1304, 1926, 1933, 1935,
					2845, 2849, 3350, 3417, 3703, 4153, 4554, 5108, 5258 };
			case 3343:
				return new int[] { 4493, 924, 1959 };
			case 3344:
				return new int[] { 143, 3399, 584, 744, 1040, 1220, 3462, 3553, 5155,
					5230 };
			case 3346:
				return new int[] { 1367, 3521, 4546, 88, 549, 614, 995, 3348, 3397,
					3666, 4190, 4293, 31, 2845, 4092, 4244, 4294, 4556, 4611 };
			case 3347:
				return new int[] { 3483 };
			case 3348:
				return new int[] { 88, 549, 614, 995, 3346, 3397, 3666, 4190, 4293,
					4546, 1367, 4556, 4611, 31, 283, 349, 665, 677, 761, 1372, 1495,
					1735, 1772, 2169, 2246, 2345, 2608, 2617, 2644, 2650, 3158, 3423,
					3453, 3476, 3521, 3609, 3993, 3997, 4225, 4294, 4297, 4493, 4502,
					5227, 5908, 5919, 6103, 6136, 6178 };
			case 3350:
				return new int[] { 3342, 219, 432, 433, 677, 1776, 2845, 4611, 5114 };
			case 3355:
				return new int[] { 1038, 1275, 5173, 5185, 60, 1995, 67, 190, 286,
					1018, 1026, 1522, 1533, 1556, 1558, 1691, 1755, 5167, 5422 };
			case 3357:
				return new int[] { 2844, 760, 767, 5210 };
			case 3358:
				return new int[] { 2664, 3359, 3458, 3670, 5096, 67, 265, 266, 367,
					386, 522, 542, 625, 661, 722, 776, 834, 1007, 1022, 1212, 1261, 1367,
					1397, 1769, 1979, 2007, 2127, 2600, 2605, 3222, 3419, 3445, 3551,
					3562, 3660, 3676, 4542, 4611, 5205 };
			case 3360:
				return new int[] { 708 };
			case 3361:
				return new int[] { 4302, 113, 1350, 1308, 1585, 3506, 663, 1787, 3488,
					3585, 3627, 4284 };
			case 3362:
				return new int[] { 296, 4483, 4120, 1211, 1295, 1324, 1367, 2651, 3666,
					4556 };
			case 3367:
				return new int[] { 1033, 3212 };
			case 3369:
				return new int[] { 2698, 2711 };
			case 3372:
				return new int[] { 1549 };
			case 3373:
				return new int[] { 65, 1115, 1116 };
			case 3375:
				return new int[] { 1038, 1556, 1012, 2695 };
			case 3376:
				return new int[] { 1031, 1044 };
			case 3377:
				return new int[] { 3182 };
			case 3378:
				return new int[] { 1376 };
			case 3381:
				return new int[] { 1935, 2656, 3498, 1722, 1753, 3477, 3661, 5149 };
			case 3383:
				return new int[] { 1270, 1368, 1768, 3416, 254, 341, 1575, 1878, 1911,
					1913, 1965, 1967, 1969, 2939, 2998, 3034, 3052, 3070, 3089, 3105,
					3121, 3210, 3614 };
			case 3387:
				return new int[] { 1424 };
			case 3389:
				return new int[] { 825 };
			case 3392:
				return new int[] { 1048, 1702, 3133, 4390 };
			case 3393:
				return new int[] { 1283 };
			case 3394:
				return new int[] { 734, 4081 };
			case 3395:
				return new int[] { 4110 };
			case 3397:
				return new int[] { 549, 614, 1772, 5227, 31, 88, 995, 2617, 4556 };
			case 3398:
				return new int[] { 1942, 1161, 1999, 4307 };
			case 3399:
				return new int[] { 143, 3344 };
			case 3400:
				return new int[] { 1708, 4062, 1007, 1368, 1781, 3493, 3497, 3672, 4095 };
			case 3401:
				return new int[] { 3333, 3644, 4283, 1732, 3445, 4109, 2825, 237, 267,
					288, 290, 365, 668, 708, 765, 1234, 1349, 2058, 3641, 4627, 5110,
					5209 };
			case 3403:
				return new int[] { 4083 };
			case 3404:
				return new int[] { 3500, 1385 };
			case 3405:
				return new int[] { 1955, 3442 };
			case 3407:
				return new int[] { 4089, 809, 881, 932, 990, 1380, 1490 };
			case 3409:
				return new int[] { 7, 293, 3340, 3469, 3503 };
			case 3413:
				return new int[] { 1470, 1753, 4290 };
			case 3414:
				return new int[] { 108, 1140, 1418, 1635, 1663, 1737, 1938, 3264, 3438,
					4498, 249, 257, 301, 825, 1084, 1193, 1407, 1423, 1467, 1633, 1961,
					2596, 2641, 3501, 3664, 3704, 4077, 4193 };
			case 3415:
				return new int[] { 3403, 4083, 4233, 2243 };
			case 3418:
				return new int[] { 3703, 712, 1099, 1402, 1436, 1458, 3417, 4153, 4554,
					4608, 5181 };
			case 3419:
				return new int[] { 1367, 1397, 3222, 3358, 3435 };
			case 3420:
				return new int[] { 3463, 3422, 4178, 4499 };
			case 3421:
				return new int[] { 2796 };
			case 3422:
				return new int[] { 3420, 3463, 4178, 4499 };
			case 3423:
				return new int[] { 31, 283, 349, 665, 677, 761, 1367, 1372, 1495, 1735,
					1772, 2169, 2246, 2345, 2608, 2617, 3158, 3453, 3476, 3521, 3609,
					3993, 3997, 4225, 4294, 4297, 4502, 4556, 4611, 5227, 5908, 5919,
					6103, 6136, 6178, 2845, 3666, 4493, 88, 549, 614, 995, 2644, 2650,
					3346, 3348, 3397, 4190, 4293, 4546 };
			case 3424:
				return new int[] { 548, 2705, 45, 678, 754, 1100, 2651, 3643, 5093,
					5208 };
			case 3426:
				return new int[] { 3606 };
			case 3427:
				return new int[] { 1394, 883 };
			case 3428:
				return new int[] { 3670, 4199, 351, 2176, 2599 };
			case 3430:
				return new int[] { 3429, 4300, 170, 482, 3431, 3432 };
			case 3431:
				return new int[] { 1430, 3429, 3432 };
			case 3432:
				return new int[] { 170 };
			case 3434:
				return new int[] { 2501, 122, 375, 1429, 1721, 2342, 2612, 2831, 3223,
					3245, 4125, 4929 };
			case 3435:
				return new int[] { 861, 3606, 4509, 1960, 5075, 5126, 5149, 5163 };
			case 3438:
				return new int[] { 1635 };
			case 3439:
				return new int[] { 3112 };
			case 3440:
				return new int[] { 947, 2725 };
			case 3442:
				return new int[] { 1955, 3405 };
			case 3444:
				return new int[] { 4319 };
			case 3445:
				return new int[] { 4109, 1732, 3333, 3401, 2058, 3641, 4283, 1979, 3644 };
			case 3446:
				return new int[] { 2054 };
			case 3450:
				return new int[] { 3227, 1704, 3417, 3703, 4214, 4554, 429, 799, 1402,
					1436, 1936, 4153 };
			case 3451:
				return new int[] { 4318 };
			case 3452:
				return new int[] { 3698, 4172 };
			case 3453:
				return new int[] { 1367, 3609, 5227, 349, 665, 761, 4297, 31, 283, 677,
					1372, 1495, 1735, 1772, 2169, 2246, 2345, 2608, 2617, 3158, 3423,
					3476, 3521, 3993, 3997, 4225, 4294, 4502, 4556, 4611, 5908, 5919,
					6103, 6136, 6178, 2845, 3666, 4493 };
			case 3454:
				return new int[] { 3324, 1914, 4484, 3671 };
			case 3456:
				return new int[] { 2833 };
			case 3457:
				return new int[] { 456, 5178 };
			case 3458:
				return new int[] { 265, 2600 };
			case 3460:
				return new int[] { 3238 };
			case 3461:
				return new int[] { 3239 };
			case 3463:
				return new int[] { 3420 };
			case 3465:
				return new int[] { 1984, 3531, 4507 };
			case 3466:
				return new int[] { 4084, 2117 };
			case 3467:
				return new int[] { 1054, 4167, 119, 124, 913, 1327, 1351, 1935, 2848,
					5101, 5117, 1452, 4102, 4490 };
			case 3468:
				return new int[] { 1737, 1418, 2160, 3264, 3501, 3664, 4187, 4209,
					4504, 4526 };
			case 3469:
				return new int[] { 7, 293, 3340, 3409, 3503 };
			case 3470:
				return new int[] { 1364, 1596, 1707, 1802, 2933, 3253 };
			case 3472:
				return new int[] { 3161, 723, 4224, 1162, 1491, 1632 };
			case 3473:
				return new int[] { 11 };
			case 3474:
				return new int[] { 932 };
			case 3475:
				return new int[] { 4480 };
			case 3476:
				return new int[] { 5919, 31, 1372, 2246, 4556, 4225, 5908, 283, 549,
					665, 677, 1367, 1735, 1772, 2345, 2608, 2617, 2650, 2845, 3521, 3609,
					3666, 4297, 5227, 349, 761, 1495, 2169, 2644, 3158, 3423, 3453, 3993,
					3997, 4294, 4502, 4611, 6103, 6136, 6178, 614, 1483, 4293, 4493, 88,
					995, 3346, 3348, 3397, 4190, 4546 };
			case 3477:
				return new int[] { 614, 1302, 1306, 1753, 3381, 3661, 5149, 1367, 1960,
					3435, 4509, 5075, 5126, 5163, 5179 };
			case 3479:
				return new int[] { 483, 1479 };
			case 3480:
				return new int[] { 3198 };
			case 3486:
				return new int[] { 5097 };
			case 3488:
				return new int[] { 2602 };
			case 3489:
				return new int[] { 176, 772 };
			case 3490:
				return new int[] { 617 };
			case 3491:
				return new int[] { 4064 };
			case 3494:
				return new int[] { 290, 623, 662, 1418, 2854, 5075, 5098, 5126, 5155,
					5163, 5177, 5199, 2658, 122, 261, 321, 401, 421, 618, 624, 663, 765,
					800, 1431, 1751, 1949, 1952, 2353, 3391, 3488, 3606, 3674, 4275,
					4324, 4485, 4627, 4814, 5110, 5149, 5202 };
			case 3497:
				return new int[] { 3672, 2655, 4062, 5080 };
			case 3498:
				return new int[] { 2656, 4547 };
			case 3499:
				return new int[] { 1754, 3624, 4304 };
			case 3500:
				return new int[] { 3404 };
			case 3503:
				return new int[] { 7, 293, 3340, 3409, 3469 };
			case 3504:
				return new int[] { 1400, 8, 301, 317, 579, 800, 1014, 1020, 1057, 2127,
					4278, 4498, 5058, 5365 };
			case 3505:
				return new int[] { 3297 };
			case 3506:
				return new int[] { 1366, 2913, 1007, 5078 };
			case 3508:
				return new int[] { 5216, 5147, 861, 1328, 1339, 1715, 2764, 4103, 5184 };
			case 3509:
				return new int[] { 2397 };
			case 3510:
				return new int[] { 2684, 5641 };
			case 3511:
				return new int[] { 5263 };
			case 3516:
				return new int[] { 818, 1415, 4543 };
			case 3518:
				return new int[] { 9, 1162, 2629, 3305, 4309 };
			case 3519:
				return new int[] { 4523, 5002, 858, 915, 1664, 4245 };
			case 3521:
				return new int[] { 1367, 2246, 6103, 31, 1372, 1772, 2608, 2617, 3346,
					3476, 4556, 5227, 5919, 283, 349, 665, 677, 761, 1495, 1735, 2169,
					2345, 3158, 3423, 3453, 3609, 3993, 3997, 4225, 4294, 4297, 4502,
					4611, 5908, 6136, 6178, 448, 549, 614, 896, 2650, 2845, 3666, 4493,
					4546 };
			case 3524:
				return new int[] { 2196 };
			case 3525:
				return new int[] { 2030 };
			case 3527:
				return new int[] { 1456, 2024, 4489, 119, 1382, 2611, 347, 682, 732,
					2663, 4103 };
			case 3528:
				return new int[] { 2475 };
			case 3530:
				return new int[] { 1411, 2520, 3229, 3634, 3752, 5265 };
			case 3531:
				return new int[] { 2649, 168, 380, 1985, 2522, 3465 };
			case 3533:
				return new int[] { 516, 3580 };
			case 3534:
				return new int[] { 586, 620, 627, 4593 };
			case 3535:
				return new int[] { 573, 3580, 663, 624, 1220 };
			case 3541:
				return new int[] { 586, 773, 4606 };
			case 3544:
				return new int[] { 1208, 3592, 3554, 2840 };
			case 3547:
				return new int[] { 1054, 108, 456, 539, 623, 1550, 3570, 4166, 4535,
					4597 };
			case 3549:
				return new int[] { 665, 615 };
			case 3553:
				return new int[] { 5155, 3585, 5218, 81, 202, 305, 493, 503, 504, 516,
					574, 584, 586, 633, 774, 1354, 1506, 1759, 3218, 3344, 3572, 4593,
					103, 104, 120, 149, 176, 191, 219, 234, 238, 288, 371, 387, 389, 437,
					446, 471, 508, 511, 515, 521, 524, 525, 526, 527, 528, 531, 535, 548,
					550, 551, 568, 578, 594, 598, 599, 619, 620, 621, 626, 627, 641, 663,
					683, 772, 823, 907, 924, 940, 1012, 1023, 1039, 1040, 1192, 1201,
					1203, 1229, 1251, 1252, 1253, 1258, 1295, 1304, 1333, 1349, 1400,
					1434, 1463, 1492, 1503, 1633, 1663, 1671, 1744, 1760, 1771, 1795,
					1936, 2061, 2182, 2504, 2609, 2763, 2792, 2797, 2799, 2841, 3319,
					3327, 3332, 3363, 3368, 3379, 3417, 3418, 3489, 3533, 3534, 3538,
					3556, 3566, 3568, 3570, 3586, 3587, 3677, 3700, 3703, 3704, 4153,
					4210, 4269, 4317, 4322, 4431, 4519, 4554, 5125, 5153, 5192, 5450,
					5620 };
			case 3554:
				return new int[] { 1308 };
			case 3556:
				return new int[] { 515, 598, 621, 3582, 3605, 4588, 4596 };
			case 3557:
				return new int[] { 548, 4608 };
			case 3558:
				return new int[] { 5127 };
			case 3559:
				return new int[] { 4603, 577, 2184, 3584, 26, 112, 115, 154, 265, 457,
					1977, 2611, 2835, 3359, 3660, 5228, 625, 4608 };
			case 3561:
				return new int[] { 701, 1122, 3603 };
			case 3571:
				return new int[] { 569, 663, 774, 1263, 3580, 3677, 180, 196, 234, 268,
					273, 288, 292, 302, 369, 394, 408, 446, 461, 468, 472, 479, 498, 511,
					521, 534, 535, 541, 551, 562, 571, 573, 586, 594, 599, 629, 638, 642,
					658, 660, 665, 670, 676, 712, 722, 740, 755, 771, 858, 896, 936, 938,
					1002, 1179, 1250, 1268, 1295, 1308, 1458, 1585, 1726, 1737, 1935,
					2016, 2792, 2821, 2823, 2848, 2852, 3331, 3468, 3501, 3535, 3557,
					3585, 3627, 3664, 3703, 3995, 4080, 4118, 4188, 4247, 4522, 4577,
					4623, 4626, 5117, 5159, 5161, 5196, 5227, 5525 };
			case 3572:
				return new int[] { 288, 524, 3586, 4608 };
			case 3573:
				return new int[] { 32, 511, 679, 1204, 1268, 3158, 3541, 4623, 5226 };
			case 3575:
				return new int[] { 5083 };
			case 3577:
				return new int[] { 4590 };
			case 3579:
				return new int[] { 1390, 1740, 4104, 4153 };
			case 3580:
				return new int[] { 573, 663, 3535, 3533, 270, 292, 722, 3571, 5161 };
			case 3586:
				return new int[] { 524, 3572, 288, 290, 641, 1349, 3703, 4608 };
			case 3587:
				return new int[] { 191, 288, 516, 524, 528, 535, 594, 879, 1787, 1935,
					2821, 2823, 2825, 2848, 2851, 3584, 3677, 3703, 5131 };
			case 3588:
				return new int[] { 1501, 5236 };
			case 3589:
				return new int[] { 1308, 569, 594, 701, 226, 348, 529, 538, 665, 709,
					858, 1324, 2852, 5226, 2609, 120, 223, 249, 268, 296, 314, 337, 369,
					459, 465, 468, 472, 490, 544, 555, 566, 586, 626, 629, 649, 652, 660,
					677, 723, 748, 1179, 1235, 1237, 1241, 1263, 1271, 1272, 1277, 1295,
					1314, 1367, 1427, 1740, 1752, 1776, 1988, 2184, 2605, 2804, 2809,
					2823, 2845, 3437, 3568, 3627, 3699, 3751, 3995, 4067, 4077, 4153,
					4555, 4556, 4567, 4576, 4578, 4599, 4607, 4612, 4614, 4626, 5108,
					5118, 5123, 5133, 5159 };
			case 3594:
				return new int[] { 4605, 3570, 3702, 95, 220, 296, 539, 544, 586, 633,
					702, 1264, 2641, 2848, 5084 };
			case 3595:
				return new int[] { 1140, 4288 };
			case 3597:
				return new int[] { 4604, 665, 3549, 581, 615 };
			case 3601:
				return new int[] { 82, 448 };
			case 3602:
				return new int[] { 284, 394, 703, 1353, 5102, 5143, 501, 4067 };
			case 3603:
				return new int[] { 323, 540 };
			case 3605:
				return new int[] { 592, 4588, 588, 644, 2924, 3537, 3556, 3582, 3591,
					4596, 509, 515, 522, 535, 539, 577, 591, 598, 602, 603, 621, 625,
					657, 661, 1249, 1301, 1302, 2184, 2909, 3551, 3559, 3562, 3569, 3570,
					3584, 4603, 4608, 5194 };
			case 3606:
				return new int[] { 1751, 4324, 5199 };
			case 3607:
				return new int[] { 5078 };
			case 3609:
				return new int[] { 2644, 677, 1367, 3666, 3453, 31, 283, 665, 1233,
					1483, 1735, 2246, 2345, 2845, 3476, 4225, 4297, 4556, 4611, 5908,
					5919, 349, 761, 1372, 1495, 1772, 2169, 2608, 2617, 2816, 3158, 3423,
					3521, 3993, 3997, 4294, 4502, 5227, 6103, 6136, 6178, 549, 4293,
					4493, 88, 614, 995, 2650, 3346, 3348, 3397, 4190, 4546 };
			case 3610:
				return new int[] { 2645, 4483, 3643 };
			case 3611:
				return new int[] { 2648 };
			case 3612:
				return new int[] { 1711 };
			case 3613:
				return new int[] { 1490 };
			case 3616:
				return new int[] { 2723 };
			case 3624:
				return new int[] { 1754, 3499, 4304 };
			case 3631:
				return new int[] { 1042, 4286 };
			case 3632:
				return new int[] { 4274 };
			case 3633:
				return new int[] { 108 };
			case 3634:
				return new int[] { 1411, 2520, 3229, 3752, 5265, 3530 };
			case 3637:
				return new int[] { 1028 };
			case 3639:
				return new int[] { 4347 };
			case 3640:
				return new int[] { 817, 3069, 3846 };
			case 3641:
				return new int[] { 3644, 1732, 2058, 3445, 4109, 4283, 3333, 3401, 108,
					1140 };
			case 3643:
				return new int[] { 2645, 3424, 3610 };
			case 3644:
				return new int[] { 3401, 3333 };
			case 3645:
				return new int[] { 916 };
			case 3649:
				return new int[] { 3297 };
			case 3650:
				return new int[] { 5258 };
			case 3656:
				return new int[] { 4670 };
			case 3657:
				return new int[] { 2866, 3658, 4261 };
			case 3658:
				return new int[] { 1437, 2866, 3657, 4261 };
			case 3663:
				return new int[] { 822 };
			case 3664:
				return new int[] { 3501, 1289 };
			case 3666:
				return new int[] { 1367, 4297, 4556, 677, 1483, 3609, 31, 283, 296,
					549, 665, 1295, 1735, 2246, 2345, 2644, 2845, 3476, 4225, 4293, 4611,
					5908, 5919, 383, 470, 629, 704, 1233, 1324, 2651, 2809, 3362, 3669,
					3751, 3995, 4483, 5093, 5252, 88, 614, 995, 3346, 3348, 3397, 4190,
					4546, 171, 218, 263, 348, 349, 369, 468, 568, 594, 660, 701, 709,
					748, 761, 870, 1110, 1271, 1322, 1347, 1365, 1372, 1495, 1772, 1939,
					2037, 2141, 2169, 2244, 2608, 2617, 2852, 3158, 3423, 3453, 3521,
					3522, 3610, 3695, 3993, 3997, 4128, 4294, 4313, 4493, 4502, 4552,
					4555, 4564, 4576, 4578, 4614, 5081, 5159, 5226, 5227, 6103, 6136,
					6178 };
			case 3671:
				return new int[] { 1914 };
			case 3672:
				return new int[] { 3497 };
			case 3674:
				return new int[] { 4582, 5098 };
			case 3676:
				return new int[] { 1769, 3670, 522, 661, 2664, 3358, 3551, 3562, 5096 };
			case 3684:
				return new int[] { 936, 1402, 4082, 5258, 476, 1304, 1758, 3417 };
			case 3685:
				return new int[] { 3650, 5258, 2638 };
			case 3688:
				return new int[] { 1780, 1728 };
			case 3689:
				return new int[] { 665, 2828, 4297 };
			case 3690:
				return new int[] { 716, 103, 219, 295, 4539 };
			case 3692:
				return new int[] { 2617, 2170, 1931, 1306, 2423, 6137 };
			case 3693:
				return new int[] { 996, 4131 };
			case 3697:
				return new int[] { 411, 446, 675, 1202, 3491, 4064, 4295, 5202, 1477,
					5080, 5253 };
			case 3703:
				return new int[] { 1704, 3417, 4153, 4214, 4554 };
			case 3704:
				return new int[] { 1961 };
			case 3710:
				return new int[] { 3297, 3505 };
			case 3714:
				return new int[] { 12 };
			case 3717:
				return new int[] { 2171 };
			case 3724:
				return new int[] { 3271, 866, 1014, 1018, 1020, 1026, 1038, 1500, 1522,
					1533, 1535, 1550, 1556, 1560, 1564, 2433, 3204, 4375, 5420 };
			case 3728:
				return new int[] { 456, 1603, 3028, 5178 };
			case 3730:
				return new int[] { 4362 };
			case 3732:
				return new int[] { 1424, 1787, 4337, 5078 };
			case 3735:
				return new int[] { 2475, 3528 };
			case 3736:
				return new int[] { 3757 };
			case 3738:
				return new int[] { 2691 };
			case 3742:
				return new int[] { 884, 4229 };
			case 3745:
				return new int[] { 3050 };
			case 3747:
				return new int[] { 5159 };
			case 3750:
				return new int[] { 792 };
			case 3752:
				return new int[] { 1411, 2520, 3229, 3634, 5265, 3530 };
			case 3755:
				return new int[] { 2238, 4125, 4649 };
			case 3757:
				return new int[] { 3736 };
			case 3758:
				return new int[] { 3248, 3394, 3826, 4500, 4501, 4750, 5235 };
			case 3765:
				return new int[] { 343, 2285, 4385, 4388 };
			case 3767:
				return new int[] { 4247, 4943 };
			case 3768:
				return new int[] { 398, 818, 1194, 4543 };
			case 3769:
				return new int[] { 4234, 917, 1049, 1316, 1329, 1371, 4486 };
			case 3778:
				return new int[] { 2330, 29, 113, 171, 356, 371, 611, 615, 665, 744,
					784, 844, 858, 859, 896, 983, 990, 1147, 1250, 1265, 1350, 1381,
					1400, 1401, 1429, 1467, 1469, 1485, 1492, 1573, 1585, 1920, 1973,
					2182, 2297, 2298, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3356, 3361, 3364, 3380, 3549, 3627, 3699,
					3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5153, 5443 };
			case 3780:
				return new int[] { 83, 1477, 1923 };
			case 3781:
				return new int[] { 1904 };
			case 3782:
				return new int[] { 265 };
			case 3783:
				return new int[] { 35 };
			case 3784:
				return new int[] { 28, 885, 1430, 1972, 1980, 2400, 2901, 4193, 4196,
					4211, 4282, 4334, 5255 };
			case 3785:
				return new int[] { 2127, 4542, 1479, 5078 };
			case 3786:
				return new int[] { 123, 339, 2284, 4200, 351, 1940 };
			case 3787:
				return new int[] { 2760 };
			case 3793:
				return new int[] { 5245 };
			case 3794:
				return new int[] { 1818 };
			case 3802:
				return new int[] { 3648 };
			case 3803:
				return new int[] { 2754, 5025, 3840, 4632 };
			case 3806:
				return new int[] { 5724 };
			case 3808:
				return new int[] { 3522, 5864, 4688, 5267, 5650, 5659 };
			case 3810:
				return new int[] { 29, 113, 171, 356, 371, 611, 615, 665, 744, 784,
					844, 858, 859, 896, 983, 990, 1147, 1250, 1265, 1350, 1381, 1400,
					1401, 1429, 1467, 1469, 1485, 1492, 1573, 1585, 1920, 1973, 2182,
					2297, 2298, 2330, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3356, 3361, 3364, 3380, 3549, 3627, 3699,
					3778, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514, 4537,
					4841, 5153, 5443 };
			case 3812:
				return new int[] { 3879, 5431 };
			case 3814:
				return new int[] { 3837, 4759, 259, 526, 2049, 2763, 3993, 5300 };
			case 3817:
				return new int[] { 446, 1771, 1760 };
			case 3820:
				return new int[] { 4363 };
			case 3821:
				return new int[] { 5639 };
			case 3822:
				return new int[] { 17 };
			case 3826:
				return new int[] { 3248, 3394, 3758, 4500, 4501, 4750, 5235 };
			case 3827:
				return new int[] { 3861, 3915, 3947, 3956 };
			case 3835:
				return new int[] { 4021 };
			case 3837:
				return new int[] { 3814, 4759, 259, 526, 2049, 2763, 3993, 5300 };
			case 3840:
				return new int[] { 2754, 3803, 5025, 4632 };
			case 3846:
				return new int[] { 3069, 3640 };
			case 3860:
				return new int[] { 1037, 1056, 1402, 1436, 3172, 3209, 3291, 4349, 429,
					799, 1039, 1704, 1936, 3227, 3417, 3450, 3703, 4153, 4214, 4554 };
			case 3861:
				return new int[] { 3827, 3915, 3947, 3956 };
			case 3863:
				return new int[] { 2558, 3902 };
			case 3865:
				return new int[] { 3895, 3916 };
			case 3867:
				return new int[] { 3892, 3897, 3908, 3918, 5665 };
			case 3879:
				return new int[] { 3812, 5431 };
			case 3885:
				return new int[] { 2552 };
			case 3887:
				return new int[] { 330, 3014 };
			case 3892:
				return new int[] { 3867, 3897, 3908, 3918, 5665 };
			case 3895:
				return new int[] { 3865, 3916 };
			case 3901:
				return new int[] { 3907 };
			case 3902:
				return new int[] { 2558, 3863 };
			case 3907:
				return new int[] { 3901 };
			case 3908:
				return new int[] { 3867, 3892, 3897, 3918, 5665 };
			case 3915:
				return new int[] { 3827, 3861, 3947, 3956 };
			case 3916:
				return new int[] { 3865, 3895 };
			case 3918:
				return new int[] { 3867, 3892, 3897, 3908, 5665 };
			case 3922:
				return new int[] { 3102 };
			case 3941:
				return new int[] { 1398, 5306 };
			case 3946:
				return new int[] { 2763, 4777, 5148 };
			case 3947:
				return new int[] { 3827, 3861, 3915, 3956 };
			case 3956:
				return new int[] { 3827, 3861, 3915, 3947 };
			case 3961:
				return new int[] { 3965 };
			case 3965:
				return new int[] { 3961 };
			case 3969:
				return new int[] { 1, 833, 950, 1373, 3202, 4132, 4197 };
			case 3971:
				return new int[] { 5927, 488, 2649, 4608, 5905 };
			case 3972:
				return new int[] { 794, 2323, 2347, 3528, 4242, 4527, 4665, 4726 };
			case 3973:
				return new int[] { 4631 };
			case 3976:
				return new int[] { 2696, 3287 };
			case 3979:
				return new int[] { 685, 686, 4409 };
			case 3981:
				return new int[] { 2636, 1304, 4137, 4641, 4854, 1758, 4163 };
			case 3983:
				return new int[] { 4643 };
			case 3984:
				return new int[] { 1775 };
			case 3985:
				return new int[] { 1006 };
			case 3994:
				return new int[] { 4009 };
			case 3996:
				return new int[] { 5525, 448, 3351, 4512 };
			case 3997:
				return new int[] { 1772, 31, 283, 349, 665, 677, 761, 1367, 1372, 1495,
					1735, 2169, 2246, 2345, 2608, 2617, 3158, 3423, 3453, 3476, 3521,
					3609, 3993, 4225, 4294, 4297, 4502, 4556, 4611, 5227, 5908, 5919,
					6103, 6136, 6178, 763, 2845, 3666, 4493 };
			default:
				return null;
		}
	}

	private static int[] getSimilarVerseIndices5000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 4009:
				return new int[] { 3994 };
			case 4012:
				return new int[] { 2566 };
			case 4021:
				return new int[] { 3835 };
			case 4022:
				return new int[] { 4661 };
			case 4023:
				return new int[] { 4742 };
			case 4030:
				return new int[] { 991 };
			case 4040:
				return new int[] { 1829 };
			case 4041:
				return new int[] { 1830 };
			case 4043:
				return new int[] { 40 };
			case 4045:
				return new int[] { 965 };
			case 4046:
				return new int[] { 1835 };
			case 4050:
				return new int[] { 1839 };
			case 4052:
				return new int[] { 1841 };
			case 4058:
				return new int[] { 4474, 4511, 4134, 418, 3167, 3632, 4274 };
			case 4059:
				return new int[] { 4068 };
			case 4062:
				return new int[] { 1007, 3497, 3672 };
			case 4068:
				return new int[] { 4059 };
			case 4070:
				return new int[] { 803, 1378, 1012, 3066, 3087, 3120, 4530 };
			case 4076:
				return new int[] { 3166 };
			case 4077:
				return new int[] { 490 };
			case 4081:
				return new int[] { 4104, 1120, 3394 };
			case 4082:
				return new int[] { 1926, 1945, 936, 1402, 3684, 5258, 124, 980, 1135,
					1304, 1704, 1748, 1933, 1935, 2845, 2849, 3342, 3417, 3650, 3703,
					4107, 4214, 4554, 4726, 5108, 5140, 5219, 5314 };
			case 4083:
				return new int[] { 1740, 1941, 3403, 4233, 1461, 108, 858, 985, 1272,
					1427, 1732, 1752, 1776, 2007, 3415, 5094, 5303 };
			case 4084:
				return new int[] { 3466, 2117, 2193, 3294, 5146, 2069 };
			case 4085:
				return new int[] { 2460 };
			case 4086:
				return new int[] { 1975 };
			case 4089:
				return new int[] { 3407, 990, 1380 };
			case 4091:
				return new int[] { 4293, 4664 };
			case 4092:
				return new int[] { 3346, 4525, 67, 573, 876, 1006, 4244, 4606 };
			case 4093:
				return new int[] { 1739, 4080, 4165, 4315, 4317, 580, 2125 };
			case 4094:
				return new int[] { 1739, 2612, 4080, 4093, 4165, 4315, 4317, 572, 580,
					763, 1131, 2125, 2156, 2830, 5209 };
			case 4096:
				return new int[] { 923, 1565, 1593 };
			case 4097:
				return new int[] { 1511 };
			case 4098:
				return new int[] { 1471 };
			case 4100:
				return new int[] { 858 };
			case 4105:
				return new int[] { 1480, 1934, 4215, 4505, 4535, 793, 798, 2523, 2937,
					3130 };
			case 4107:
				return new int[] { 4214, 1885, 1304, 3417, 124, 812, 876, 936, 1006,
					1393, 1402, 1493, 1704, 1748, 1926, 1933, 1935, 1987, 2845, 2849,
					3138, 3326, 3342, 3650, 3684, 3703, 4082, 4265, 4554, 4726, 5108,
					5140, 5258, 5861 };
			case 4109:
				return new int[] { 3445, 1732, 3333, 3401, 2058, 3641, 4283, 3644 };
			case 4117:
				return new int[] { 2125 };
			case 4118:
				return new int[] { 268, 394, 4522, 44, 68, 118, 280, 283, 462, 737,
					836, 988, 1425 };
			case 4119:
				return new int[] { 890, 1722, 1476, 1976, 3458, 3652, 788, 1484, 4280,
					5076, 5199, 5241, 26, 112, 115, 154, 265, 290, 321, 457, 524, 525,
					577, 578, 668, 685, 708, 785, 805, 879, 881, 952, 1042, 1231, 1787,
					1935, 1975, 1977, 2184, 2600, 2611, 2825, 2835, 3359, 3381, 3559,
					3584, 3587, 3660, 4148, 4194, 4238, 4542, 4603, 4608, 5103, 5109,
					5121, 5131, 5219, 5228, 5236, 318, 481, 687, 1200, 1273, 1529, 2760,
					3626, 4256, 4270, 5917 };
			case 4120:
				return new int[] { 3362, 1211 };
			case 4123:
				return new int[] { 1097 };
			case 4127:
				return new int[] { 317, 322, 2011, 287, 453, 1393, 1800 };
			case 4129:
				return new int[] { 4208, 1929, 661, 1302, 5469, 6135 };
			case 4130:
				return new int[] { 4128 };
			case 4131:
				return new int[] { 996 };
			case 4134:
				return new int[] { 4058, 4474, 4511 };
			case 4136:
				return new int[] { 671 };
			case 4138:
				return new int[] { 1396, 1090, 1459, 4128, 4529, 4543, 5525, 95 };
			case 4140:
				return new int[] { 1729 };
			case 4141:
				return new int[] { 1345, 505 };
			case 4146:
				return new int[] { 1385, 3404, 3500, 6134, 1266, 5170, 982, 4197 };
			case 4147:
				return new int[] { 96, 1760, 1902 };
			case 4149:
				return new int[] { 1800 };
			case 4152:
				return new int[] { 1720 };
			case 4153:
				return new int[] { 3417, 3703, 4214, 4554 };
			case 4154:
				return new int[] { 5204, 202, 1172, 1211, 5099, 5129 };
			case 4155:
				return new int[] { 1568, 2717 };
			case 4162:
				return new int[] { 4170 };
			case 4163:
				return new int[] { 1758, 1304 };
			case 4165:
				return new int[] { 1739, 4080, 4093, 4315, 4317, 580, 2125 };
			case 4167:
				return new int[] { 4188, 2848, 3467 };
			case 4168:
				return new int[] { 3289 };
			case 4170:
				return new int[] { 4162 };
			case 4171:
				return new int[] { 409, 1272, 1732, 1930, 3403, 5094 };
			case 4174:
				return new int[] { 1519 };
			case 4176:
				return new int[] { 307, 1231 };
			case 4177:
				return new int[] { 1755 };
			case 4179:
				return new int[] { 1770 };
			case 4180:
				return new int[] { 778, 2160 };
			case 4181:
				return new int[] { 4128, 4192 };
			case 4182:
				return new int[] { 4157 };
			case 4183:
				return new int[] { 985, 218, 91, 210, 601, 1105, 1289, 1427, 1451,
					1461, 1466, 1740, 1776, 2243, 2705, 3364, 4083, 4233, 4248, 4356 };
			case 4184:
				return new int[] { 1731, 3019 };
			case 4185:
				return new int[] { 93, 1582, 2129, 2721, 2889, 3294, 3525, 4262, 4488,
					2530 };
			case 4187:
				return new int[] { 2477, 4668 };
			case 4189:
				return new int[] { 1140, 3438, 19, 108, 170, 1616, 1635, 1663, 1938,
					3414, 3416, 3633, 3641, 4498 };
			case 4190:
				return new int[] { 88, 549, 614, 995, 3346, 3348, 3397, 3666, 4293,
					4546, 283, 665, 1367, 4556, 4611 };
			case 4191:
				return new int[] { 2160, 2601, 4504 };
			case 4192:
				return new int[] { 4128, 4181 };
			case 4193:
				return new int[] { 249, 1423, 1430, 257, 1633, 3231 };
			case 4194:
				return new int[] { 890 };
			case 4195:
				return new int[] { 896, 945, 1933, 4535, 821 };
			case 4196:
				return new int[] { 1972, 4063 };
			case 4200:
				return new int[] { 123, 339, 2284, 3786 };
			case 4201:
				return new int[] { 4167, 4188, 4136, 4306 };
			case 4206:
				return new int[] { 990 };
			case 4207:
				return new int[] { 4529, 1386, 97, 371, 716, 881, 5150 };
			case 4208:
				return new int[] { 4129, 1929, 661, 1302, 5469, 6135 };
			case 4209:
				return new int[] { 1409, 1746 };
			case 4211:
				return new int[] { 4193, 4196, 4063, 28, 885, 1430, 2400, 2901, 3784,
					4334, 5255 };
			case 4212:
				return new int[] { 2694 };
			case 4214:
				return new int[] { 3417, 4153, 3703 };
			case 4215:
				return new int[] { 1480, 1934, 4105, 4505, 4535, 1054 };
			case 4216:
				return new int[] { 3349 };
			case 4221:
				return new int[] { 1053 };
			case 4224:
				return new int[] { 1491, 1632, 3161, 3472, 998 };
			case 4225:
				return new int[] { 5908, 6103, 3476, 5919, 31, 283, 665, 677, 1367,
					1735, 2246, 2345, 2845, 3609, 3666, 4297, 4556, 349, 761, 1372, 1495,
					1772, 2169, 2608, 2617, 2644, 3158, 3423, 3453, 3521, 3993, 3997,
					4294, 4502, 4611, 5227, 6136, 6178, 549, 1483, 4293, 4493, 88, 614,
					995, 2650, 3346, 3348, 3397, 4190, 4546 };
			case 4227:
				return new int[] { 1709 };
			case 4234:
				return new int[] { 3769 };
			case 4235:
				return new int[] { 1426, 3211, 1652 };
			case 4237:
				return new int[] { 2814 };
			case 4239:
				return new int[] { 241, 586 };
			case 4243:
				return new int[] { 3608, 2886, 3636, 1762, 2858, 3225, 3351, 3612,
					3648, 4246, 4520, 5235 };
			case 4244:
				return new int[] { 348, 1939, 1988, 3346, 3638, 5118, 4092 };
			case 4245:
				return new int[] { 1390, 701, 753, 3519, 4523 };
			case 4247:
				return new int[] { 4522 };
			case 4248:
				return new int[] { 1427, 1776 };
			case 4250:
				return new int[] { 2925, 3331 };
			case 4252:
				return new int[] { 1090, 1996 };
			case 4253:
				return new int[] { 1153 };
			case 4258:
				return new int[] { 95, 3648, 4516 };
			case 4262:
				return new int[] { 1582, 4285, 1382 };
			case 4263:
				return new int[] { 4487, 892 };
			case 4265:
				return new int[] { 812, 1006, 1393, 1493, 1987, 3326, 4306 };
			case 4268:
				return new int[] { 2111 };
			case 4274:
				return new int[] { 3632, 418, 3167, 4058, 4122, 4474, 4511 };
			case 4275:
				return new int[] { 261, 663, 1431, 1751, 2353, 2658, 3606, 4324, 290,
					321, 401, 421, 618, 623, 624, 765, 1949, 3488, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199, 122, 5149, 662, 800, 1418, 1952, 2854,
					3391, 3494, 5075, 5202 };
			case 4277:
				return new int[] { 895, 2154, 4060, 91, 173, 252, 645, 925, 983, 1195,
					1722, 2848, 3582, 3626, 4098, 5090 };
			case 4279:
				return new int[] { 716, 1993 };
			case 4280:
				return new int[] { 3458, 5076, 788, 1476, 5199, 5241, 2600, 4542 };
			case 4281:
				return new int[] { 1662, 288, 740, 5131 };
			case 4283:
				return new int[] { 3401, 3644, 1732, 2058, 3445, 3641, 4109, 2825, 3333 };
			case 4285:
				return new int[] { 1582, 4262 };
			case 4288:
				return new int[] { 3595, 219, 299, 879, 902, 996, 1400 };
			case 4290:
				return new int[] { 1753, 3413, 218, 329, 2828 };
			case 4291:
				return new int[] { 437, 1226 };
			case 4295:
				return new int[] { 446, 881 };
			case 4296:
				return new int[] { 1338 };
			case 4297:
				return new int[] { 665, 3666, 31, 283, 677, 1367, 1735, 2246, 2345,
					2845, 3453, 3476, 3609, 4225, 4556, 5908, 5919, 349, 761, 1372, 1495,
					1772, 2169, 2608, 2617, 3158, 3423, 3521, 3993, 3997, 4294, 4502,
					4611, 5227, 6103, 6136, 6178, 296, 549, 1295, 1483, 2644, 2809, 3995,
					4293, 4493 };
			case 4299:
				return new int[] { 1010, 1479, 2902, 3462, 4606, 5078 };
			case 4300:
				return new int[] { 685, 290, 788, 2835, 5078, 5199 };
			case 4301:
				return new int[] { 683 };
			case 4302:
				return new int[] { 113, 1350, 3361, 1585, 1308, 3506, 126, 663, 2665,
					3364, 3488, 3585, 3627, 4284, 5153 };
			case 4304:
				return new int[] { 1754, 3499, 3624 };
			case 4306:
				return new int[] { 4265, 1390, 2165, 4167, 4188, 4201, 4279 };
			case 4307:
				return new int[] { 3311 };
			case 4309:
				return new int[] { 9, 1162, 2629, 3305, 3518 };
			case 4313:
				return new int[] { 4529 };
			case 4317:
				return new int[] { 1739, 4080, 4093, 4165, 4315, 1219, 1354, 1492,
					3332, 3568, 120, 252, 437, 438, 580, 584, 924, 1345, 1349, 1400,
					1429, 1573, 1717, 1744, 1760, 1771, 2125, 2182, 2665, 3474, 3627,
					4153 };
			case 4320:
				return new int[] { 290, 686, 708, 4596, 4809, 421, 685, 4283, 267, 365,
					540, 608, 1732, 2058, 3333, 3401, 3445, 3641, 3644, 3660, 4109 };
			case 4324:
				return new int[] { 1751, 3606, 261, 663, 1431, 2353, 2658, 4275, 290,
					321, 401, 421, 618, 623, 624, 765, 1949, 3488, 4485, 4627, 4814,
					5110, 5126, 5163, 5177, 5199, 3506 };
			case 4327:
				return new int[] { 1597 };
			case 4333:
				return new int[] { 3400, 3493, 4095 };
			case 4334:
				return new int[] { 2400, 1981, 2901, 28, 272, 395, 497, 885, 1430,
					1709, 1972, 1978, 1980, 2630, 2915, 3784, 4193, 4196, 4211, 5255,
					5263 };
			case 4335:
				return new int[] { 2690, 3402 };
			case 4336:
				return new int[] { 1972, 1980, 1981 };
			case 4341:
				return new int[] { 1958 };
			case 4346:
				return new int[] { 981, 4347, 997 };
			case 4349:
				return new int[] { 429, 799, 1037, 1056, 1402, 1436, 1936, 3172, 3209,
					3291, 3860, 3417, 3703, 4153, 4214, 1039, 1704, 3227, 3450, 4554 };
			case 4354:
				return new int[] { 1439, 3287, 3299, 3648, 5168, 3171 };
			case 4355:
				return new int[] { 825, 5146 };
			case 4359:
				return new int[] { 306, 2185 };
			case 4363:
				return new int[] { 3820 };
			case 4364:
				return new int[] { 862, 1013, 1625, 2100, 2287, 2536, 3336, 3479, 3629,
					3751, 4079, 4541, 4656, 5269 };
			case 4367:
				return new int[] { 827, 1528, 1976, 3708, 5262 };
			case 4370:
				return new int[] { 1057, 2129 };
			case 4373:
				return new int[] { 1087, 76 };
			case 4374:
				return new int[] { 1088 };
			case 4376:
				return new int[] { 5260 };
			case 4378:
				return new int[] { 3170, 3283, 4720 };
			case 4385:
				return new int[] { 343, 2285, 3765, 4388 };
			case 4386:
				return new int[] { 174, 214, 930, 3764 };
			case 4388:
				return new int[] { 343, 2285, 1528, 3765, 4385 };
			case 4389:
				return new int[] { 2286 };
			case 4390:
				return new int[] { 1048, 1702, 3133, 3392, 1610, 3176, 3208, 3260, 3262 };
			case 4392:
				return new int[] { 1002 };
			case 4396:
				return new int[] { 996, 1932, 773, 848, 1328, 1339, 1386, 1928, 3347,
					3483, 3516, 4064, 4753, 5184, 5664 };
			case 4400:
				return new int[] { 2018, 1573 };
			case 4406:
				return new int[] { 2504 };
			case 4407:
				return new int[] { 5416, 4779, 4734 };
			case 4408:
				return new int[] { 35, 861, 887, 2486, 2902, 3435, 3462, 3606, 3785,
					5078, 5230 };
			case 4409:
				return new int[] { 1111, 2856, 5917, 685, 686, 1886, 2913, 3506, 3979 };
			case 4410:
				return new int[] { 5117 };
			case 4419:
				return new int[] { 744, 1220, 1428, 1629, 2056, 2115, 2221, 3151, 3297,
					3337, 4253 };
			case 4420:
				return new int[] { 2955 };
			case 4421:
				return new int[] { 1111, 1419 };
			case 4422:
				return new int[] { 3224, 3977, 4644 };
			case 4433:
				return new int[] { 4159 };
			case 4438:
				return new int[] { 2988 };
			case 4445:
				return new int[] { 1005, 4488 };
			case 4451:
				return new int[] { 1886, 2498, 4512, 4667, 685, 686, 2314, 2353, 2913,
					2955, 3416, 3506, 3792, 3979, 3996, 4035, 4409, 4420, 5708 };
			case 4454:
				return new int[] { 4780, 54, 92, 129, 2521 };
			case 4463:
				return new int[] { 5650 };
			case 4467:
				return new int[] { 4754 };
			case 4469:
				return new int[] { 5695 };
			case 4470:
				return new int[] { 1306, 1427, 5086, 1345, 4141, 4502 };
			case 4474:
				return new int[] { 4058, 4134, 4511, 418, 3167, 3632, 4274 };
			case 4477:
				return new int[] { 170 };
			case 4478:
				return new int[] { 258, 400, 219, 259, 299, 632, 1042, 1054, 3338,
					4210, 4477 };
			case 4480:
				return new int[] { 3475 };
			case 4481:
				return new int[] { 3474 };
			case 4483:
				return new int[] { 296, 3362, 3610, 2244, 2651, 3666, 5093 };
			case 4484:
				return new int[] { 1914, 1781, 3324, 3454, 191, 2094, 3671, 764, 2659,
					4193, 4387 };
			case 4485:
				return new int[] { 3488, 261, 290, 321, 401, 421, 618, 623, 624, 663,
					765, 1431, 1709, 1751, 1949, 2353, 2658, 3429, 3606, 4099, 4275,
					4324, 4627, 4814, 5110, 5126, 5163, 5177, 5199, 1912 };
			case 4486:
				return new int[] { 1367, 85, 448, 712, 985, 1049, 1295, 1503, 1739,
					3751, 4067, 4307, 5090, 5095, 5239, 5525 };
			case 4487:
				return new int[] { 4263, 892 };
			case 4488:
				return new int[] { 2098, 1456, 4185 };
			case 4489:
				return new int[] { 1456, 2024, 3527, 119 };
			case 4490:
				return new int[] { 3995, 5117 };
			case 4492:
				return new int[] { 1156, 1706, 1964, 3294 };
			case 4494:
				return new int[] { 287, 453, 317, 1739, 4149, 5532, 858 };
			case 4497:
				return new int[] { 3648 };
			case 4499:
				return new int[] { 481, 685, 686, 2832, 3420, 3422, 3463, 4178, 4596 };
			case 4501:
				return new int[] { 996 };
			case 4502:
				return new int[] { 5919, 283, 1372, 1495, 1772, 2845, 4293, 4294, 4611,
					31, 349, 665, 677, 761, 1367, 1735, 2169, 2246, 2345, 2608, 2617,
					3158, 3423, 3453, 3476, 3521, 3609, 3993, 3997, 4225, 4297, 4556,
					5227, 5908, 6103, 6136, 6178, 3666, 4493, 4546, 4547 };
			case 4503:
				return new int[] { 2777 };
			case 4505:
				return new int[] { 1934, 1480, 4105, 4215, 4535, 793, 798, 2523, 2937,
					3130 };
			case 4506:
				return new int[] { 3364, 1585, 3516, 1004 };
			case 4507:
				return new int[] { 858 };
			case 4509:
				return new int[] { 3435, 861, 3606, 5075, 5126, 5149, 5163, 1753, 1960,
					3381, 3477, 3661, 5179 };
			case 4511:
				return new int[] { 4058, 4134, 4474, 418, 3167, 3632, 4274 };
			case 4512:
				return new int[] { 1886, 3416 };
			case 4516:
				return new int[] { 3648, 2322, 1378, 778, 2666, 5168, 795, 1479, 4497,
					95, 1190, 1365, 1440, 3171, 3287, 3751, 4258, 4543 };
			case 4521:
				return new int[] { 1489, 880 };
			case 4522:
				return new int[] { 4247, 44, 737, 836, 988, 268, 68, 118, 280, 283,
					462, 1425, 569, 292, 538, 712, 938, 1002, 2848, 4118, 5117, 5159 };
			case 4523:
				return new int[] { 3519, 5002, 753, 4245, 896, 915, 1316, 1329, 1580,
					1664, 2814, 3043, 3521, 4237 };
			case 4527:
				return new int[] { 4242 };
			case 4528:
				return new int[] { 920, 287, 317, 453, 948, 1410, 1417, 2011, 2734,
					4126, 4494 };
			case 4529:
				return new int[] { 881, 4543 };
			case 4531:
				return new int[] { 1023, 1504 };
			case 4532:
				return new int[] { 1501 };
			case 4539:
				return new int[] { 219 };
			case 4542:
				return new int[] { 2127, 2600, 3458, 3785, 5228 };
			case 4543:
				return new int[] { 818, 4529, 4128, 398 };
			case 4545:
				return new int[] { 659, 1988, 4576, 4578, 568, 576, 1195, 2619, 4548 };
			case 4546:
				return new int[] { 4293, 4611 };
			case 4547:
				return new int[] { 32, 173, 448, 3351, 5525 };
			case 4554:
				return new int[] { 3417, 3703, 4153, 1704, 4214 };
			case 4555:
				return new int[] { 722, 2845, 433, 448, 551, 629, 665, 677, 701, 762,
					763, 1271, 1295, 1367, 2852, 3751, 4294, 4547, 4556, 4611, 5115,
					5159, 5196, 5226, 5919 };
			case 4556:
				return new int[] { 2608, 2617, 1772, 31, 549, 614, 1367, 5227, 5919,
					2845, 3666, 5236 };
			case 4558:
				return new int[] { 1489, 3667 };
			case 4565:
				return new int[] { 538 };
			case 4567:
				return new int[] { 544 };
			case 4569:
				return new int[] { 4576, 115, 1347, 65, 249, 709, 1207, 2845, 2852,
					3377, 3699, 4128, 4313 };
			case 4573:
				return new int[] { 720, 1359, 4564, 5525, 16, 299, 1208, 2647, 3544,
					3592 };
			case 4576:
				return new int[] { 4578 };
			case 4577:
				return new int[] { 220, 270, 273, 288, 394, 511, 521, 534, 535, 551,
					586, 629, 665, 670, 676, 722, 755, 774, 1179, 1268, 1737, 2848, 3585,
					4623, 5112, 5115, 5159, 5196, 5525 };
			case 4578:
				return new int[] { 4576, 659, 1988, 4545, 167, 383, 1314, 4548, 249,
					268, 296, 448, 459, 568, 576, 594, 629, 652, 660, 709, 748, 998,
					1195, 1271, 1324, 1367, 1491, 2619, 3751, 3995, 4556 };
			case 4580:
				return new int[] { 5094, 820 };
			case 4587:
				return new int[] { 6137, 787, 1334, 307, 490, 1306, 1323, 5125, 487,
					505, 614, 753, 5086, 5207, 5227 };
			case 4589:
				return new int[] { 4586, 650, 657, 4601, 618, 623, 662, 4596 };
			case 4590:
				return new int[] { 3577 };
			case 4596:
				return new int[] { 686, 421, 290, 685, 708, 4809, 540, 608, 4320 };
			case 4599:
				return new int[] { 1325, 2851, 505, 2848 };
			case 4601:
				return new int[] { 650, 657, 4589 };
			case 4603:
				return new int[] { 3559, 4608, 577, 2184, 3584, 625, 981 };
			case 4604:
				return new int[] { 3597, 665, 581, 1737, 3549, 3636 };
			case 4605:
				return new int[] { 3594, 3702, 4217, 2641, 3570 };
			case 4606:
				return new int[] { 3541 };
			case 4610:
				return new int[] { 1267, 5171 };
			case 4612:
				return new int[] { 288, 2811, 5115, 5116 };
			case 4614:
				return new int[] { 677, 709, 107, 268, 299, 459, 468, 490, 555, 649,
					701, 1241, 1295, 3585, 4611, 5194 };
			case 4616:
				return new int[] { 402, 538, 558, 1229, 2823, 2852, 5494 };
			case 4619:
				return new int[] { 518, 1230, 1249, 1294, 1331, 1340, 2646, 2808, 2848,
					2849, 5159, 1344, 4611, 5133 };
			case 4621:
				return new int[] { 195, 422, 492, 3204 };
			case 4627:
				return new int[] { 765, 2825, 2854, 5110, 288, 290, 321, 668, 685,
					5202, 5209, 261, 401, 421, 618, 623, 624, 663, 1431, 1751, 1949,
					2353, 2658, 3488, 3606, 4275, 4324, 4485, 4814, 5126, 5163, 5177,
					5199, 237, 252, 446, 708, 1349, 1970, 2646, 2831, 4629, 5078, 5084,
					5103, 5131, 5494 };
			case 4629:
				return new int[] { 5078, 271, 448, 472, 1231, 1250, 5084, 116, 239,
					243, 261, 289, 455, 739, 1381, 2165, 2831, 2854, 3583, 4627, 5110,
					5114, 5116, 5152, 5198, 5200, 102 };
			case 4631:
				return new int[] { 3973 };
			case 4632:
				return new int[] { 2754, 3803, 3840, 5025 };
			case 4633:
				return new int[] { 3582 };
			case 4634:
				return new int[] { 793 };
			case 4636:
				return new int[] { 2599, 2938, 3478, 1820, 170, 272, 1512, 2699, 4559 };
			case 4637:
				return new int[] { 3614 };
			case 4638:
				return new int[] { 28, 887, 1170, 1723, 1781, 1823, 1910, 1965, 2400,
					2657, 2690, 2902, 3218, 3402, 3432, 3478, 3686, 4078, 4335 };
			case 4640:
				return new int[] { 2903, 4335 };
			case 4641:
				return new int[] { 2636, 3981, 4137, 4854, 1304 };
			case 4643:
				return new int[] { 3983 };
			case 4644:
				return new int[] { 3224, 3977, 4422 };
			case 4646:
				return new int[] { 5411 };
			case 4649:
				return new int[] { 2238, 3755, 4125 };
			case 4651:
				return new int[] { 2579 };
			case 4654:
				return new int[] { 5282 };
			case 4656:
				return new int[] { 1752, 4364 };
			case 4661:
				return new int[] { 4022 };
			case 4664:
				return new int[] { 4091, 4293 };
			case 4667:
				return new int[] { 1886, 2913, 3506, 4451, 4512, 623, 685, 686, 2314,
					2353, 2498, 2689, 2955, 3416, 3792, 3979, 3996, 4035, 4409, 4420,
					5078, 5708 };
			case 4668:
				return new int[] { 2477, 4187 };
			case 4669:
				return new int[] { 4783 };
			case 4670:
				return new int[] { 3656 };
			case 4685:
				return new int[] { 2674, 4746 };
			case 4688:
				return new int[] { 5267, 5864, 1414, 3522, 3808 };
			case 4689:
				return new int[] { 1846, 3078, 4465, 4751, 4899 };
			case 4690:
				return new int[] { 5023 };
			case 4699:
				return new int[] { 1853 };
			case 4702:
				return new int[] { 1542, 3991 };
			case 4704:
				return new int[] { 2258, 2270 };
			case 4705:
				return new int[] { 1858 };
			case 4707:
				return new int[] { 1875 };
			case 4708:
				return new int[] { 1555 };
			case 4714:
				return new int[] { 3291 };
			case 4720:
				return new int[] { 4835, 3170, 3283, 4378 };
			case 4724:
				return new int[] { 4725, 1474 };
			case 4725:
				return new int[] { 4724, 273, 663, 930, 1474 };
			case 4727:
				return new int[] { 3218, 4382, 4766 };
			case 4734:
				return new int[] { 2286, 3996, 4407, 5416 };
			case 4742:
				return new int[] { 4023 };
			case 4746:
				return new int[] { 2674, 4685 };
			case 4748:
				return new int[] { 3647 };
			case 4750:
				return new int[] { 4500, 5235 };
			case 4751:
				return new int[] { 1846, 4689, 4899 };
			case 4752:
				return new int[] { 4139 };
			case 4753:
				return new int[] { 5664, 773, 848, 996, 1328, 1339, 1386, 1928, 1932,
					3347, 3483, 3516, 4064, 4396, 5184 };
			case 4754:
				return new int[] { 4467 };
			case 4759:
				return new int[] { 3814, 3837, 259, 526, 2049, 2763, 3993, 5300 };
			case 4766:
				return new int[] { 4727 };
			case 4774:
				return new int[] { 5316 };
			case 4775:
				return new int[] { 5317 };
			case 4777:
				return new int[] { 3319, 5148, 538, 763, 1143, 1265, 1381, 1901, 2763,
					2845, 3221, 3448, 3946, 4124 };
			case 4778:
				return new int[] { 3118, 3614 };
			case 4779:
				return new int[] { 4407, 5416 };
			case 4780:
				return new int[] { 4454, 54, 92, 129, 2521 };
			case 4782:
				return new int[] { 2477, 4187, 4668 };
			case 4783:
				return new int[] { 4669 };
			case 4813:
				return new int[] { 5277, 2025 };
			case 4814:
				return new int[] { 401, 421, 618, 623, 624, 5084, 261, 290, 321, 663,
					765, 1431, 1751, 1949, 2353, 2658, 3488, 3606, 4275, 4324, 4485,
					4627, 5110, 5126, 5163, 5177, 5199, 472, 685, 4267 };
			case 4821:
				return new int[] { 952, 2043, 3677, 4064 };
			case 4835:
				return new int[] { 4720 };
			case 4841:
				return new int[] { 858, 29, 113, 171, 356, 371, 611, 615, 665, 744,
					784, 844, 859, 896, 983, 990, 1147, 1250, 1265, 1350, 1381, 1400,
					1401, 1429, 1467, 1469, 1485, 1492, 1573, 1585, 1920, 1973, 2182,
					2297, 2298, 2330, 2548, 2549, 2580, 2606, 2665, 2667, 2871, 2909,
					3024, 3182, 3201, 3332, 3356, 3361, 3364, 3380, 3549, 3627, 3699,
					3778, 3810, 4095, 4100, 4198, 4206, 4302, 4317, 4482, 4513, 4514,
					4537, 5153, 5443 };
			case 4849:
				return new int[] { 4806 };
			case 4854:
				return new int[] { 2636, 3981, 4137, 4641, 1304 };
			case 4860:
				return new int[] { 4862, 4867, 4877, 4885, 4896 };
			case 4861:
				return new int[] { 4863, 4866, 4875 };
			case 4862:
				return new int[] { 4867, 4877, 4885, 4860, 4896 };
			case 4863:
				return new int[] { 4861, 4866, 4875 };
			case 4864:
				return new int[] { 4233 };
			case 4866:
				return new int[] { 4861, 4863, 4875 };
			case 4867:
				return new int[] { 4862, 4877, 4885, 4860, 4896 };
			case 4875:
				return new int[] { 4861, 4863, 4866 };
			case 4877:
				return new int[] { 4862, 4867, 4885, 4860, 4896 };
			case 4878:
				return new int[] { 3091 };
			case 4882:
				return new int[] { 4884 };
			case 4885:
				return new int[] { 4862, 4867, 4877, 4860, 4896 };
			case 4896:
				return new int[] { 4860, 4862, 4867, 4877, 4885 };
			case 4899:
				return new int[] { 1846, 4689, 4751 };
			case 4901:
				return new int[] { 0, 2, 169, 2138, 2294, 2307, 2310, 2318, 2324, 2327,
					2334, 2336, 2337, 2342, 2345, 2352, 2437, 2456, 2508, 2518, 2524,
					2594, 2913, 2914, 2917, 2936, 3188, 3715, 3719, 3727, 3756, 4219,
					4343, 4344, 4360, 4369, 4662, 5147, 5243, 5259, 5260, 5269, 5708,
					5709 };
			case 4913:
				return new int[] { 4916, 4918, 4921, 4923, 4925, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4916:
				return new int[] { 4913, 4918, 4921, 4923, 4925, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4918:
				return new int[] { 4913, 4916, 4921, 4923, 4925, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4921:
				return new int[] { 4913, 4916, 4918, 4923, 4925, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4923:
				return new int[] { 4913, 4916, 4918, 4921, 4925, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4925:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4928, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4928:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4930, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4929:
				return new int[] { 375, 1429, 1721, 2342, 2501, 2612, 2831, 3223, 3245,
					3434, 4125 };
			case 4930:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4932,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4932:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4934:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4936:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4938:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4940, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4940:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4942, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4942:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4945, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4943:
				return new int[] { 3767 };
			case 4945:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4947, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4946:
				return new int[] { 5751 };
			case 4947:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4949, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4949:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4951, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4951:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4953, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4953:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4955,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4955:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4956:
				return new int[] { 4974 };
			case 4957:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4959:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4961:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4963, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4963:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4965, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4965:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4967, 4969, 4971, 4973, 4975, 4977 };
			case 4967:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4969, 4971, 4973, 4975, 4977 };
			case 4969:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4967, 4971, 4973, 4975, 4977 };
			case 4971:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4967, 4969, 4973, 4975, 4977 };
			case 4973:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4975, 4977 };
			case 4974:
				return new int[] { 4956 };
			case 4975:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4977 };
			case 4977:
				return new int[] { 4913, 4916, 4918, 4921, 4923, 4925, 4928, 4930,
					4932, 4934, 4936, 4938, 4940, 4942, 4945, 4947, 4949, 4951, 4953,
					4955, 4957, 4959, 4961, 4963, 4965, 4967, 4969, 4971, 4973, 4975 };
			case 4995:
				return new int[] { 5609 };
			default:
				return null;
		}
	}

	private static int[] getSimilarVerseIndices6000(int verseIndex)
	{
		switch (verseIndex)
		{
			case 5002:
				return new int[] { 896, 915, 1316, 1329, 1664, 2814, 3043, 3519, 3521,
					4237, 4245, 4523 };
			case 5003:
				return new int[] { 5706, 2311 };
			case 5023:
				return new int[] { 4690 };
			case 5025:
				return new int[] { 2754, 3803, 3840, 4632 };
			case 5038:
				return new int[] { 5415 };
			case 5039:
				return new int[] { 36, 86, 175, 981, 986, 1015, 1431, 1681, 1691, 1908 };
			case 5052:
				return new int[] { 5074, 5374 };
			case 5058:
				return new int[] { 1014, 1020, 1057, 1400, 3504, 5365 };
			case 5074:
				return new int[] { 5052, 5374 };
			case 5075:
				return new int[] { 5126, 5163, 290, 623, 662, 1418, 2854, 3494, 5177,
					5199, 3435, 3606, 4509, 5149 };
			case 5076:
				return new int[] { 788, 1476, 3458, 4280, 5199, 5241, 481, 685, 708,
					4542, 26, 112, 115, 154, 265, 290, 318, 321, 457, 687, 805, 890,
					1200, 1273, 1977, 2600, 2835, 3359, 3652, 3660, 4119, 4256, 5131,
					5228, 5236, 1111, 1350, 4300, 5917 };
			case 5077:
				return new int[] { 35, 889, 668, 237, 288, 765, 1234, 1349, 2825, 2854,
					3401, 4283, 4627, 5110, 5209 };
			case 5079:
				return new int[] { 113, 708, 1111, 1350, 2856, 4101, 4409, 5076, 5917 };
			case 5080:
				return new int[] { 2655, 3497, 3672, 1709, 2901, 319, 1007, 1586, 2040,
					2477, 3741, 3744, 4062 };
			case 5081:
				return new int[] { 1295, 2852 };
			case 5085:
				return new int[] { 251, 5092 };
			case 5086:
				return new int[] { 787, 5207, 1306, 1323, 1334, 505, 5236 };
			case 5091:
				return new int[] { 2851, 410, 79, 225, 248, 265, 272, 2848, 3458 };
			case 5092:
				return new int[] { 5085 };
			case 5097:
				return new int[] { 445, 3486 };
			case 5098:
				return new int[] { 529, 5155, 3494, 171, 712, 3674 };
			case 5102:
				return new int[] { 323, 769, 1188, 1229, 5115, 5212 };
			case 5103:
				return new int[] { 5095, 5180 };
			case 5109:
				return new int[] { 5121, 685, 1231, 2611, 5110, 5917, 154, 265, 288,
					289, 290, 321, 390, 472, 708, 732, 785, 881, 2825, 2835, 3652, 4148,
					5103, 5131, 5236 };
			case 5113:
				return new int[] { 679 };
			case 5116:
				return new int[] { 116, 5494 };
			case 5117:
				return new int[] { 370, 2848 };
			case 5118:
				return new int[] { 1243, 5189, 5226, 1355, 4244, 730, 831, 876, 910,
					1071, 1092, 1100, 1133, 1375, 1488, 1996, 1997, 3335, 3638 };
			case 5119:
				return new int[] { 5189, 3474, 223, 391, 652, 659, 904, 998, 1039,
					1195, 1206, 1268, 1491, 1752, 1988, 1994, 2603, 2619, 3995, 4545,
					4576, 4578 };
			case 5120:
				return new int[] { 408, 223, 302 };
			case 5121:
				return new int[] { 5109 };
			case 5122:
				return new int[] { 759 };
			case 5123:
				return new int[] { 5108 };
			case 5124:
				return new int[] { 5099 };
			case 5126:
				return new int[] { 5163, 290, 623, 5177, 5199, 5075, 261, 321, 401,
					421, 618, 624, 663, 765, 1431, 1751, 1949, 2353, 2658, 3488, 3606,
					4275, 4324, 4485, 4627, 4814, 5110 };
			case 5128:
				return new int[] { 120, 701, 709 };
			case 5129:
				return new int[] { 1172, 202, 217, 4154, 171, 237, 281, 303, 320, 367,
					505, 506, 522, 540, 592, 606, 608, 635, 670, 701, 724, 763, 766,
					1184, 1207, 1211, 1297, 1314, 1354, 2156, 2605, 2624, 2626, 2654,
					2842, 2845, 2922, 3568, 3583, 3603, 4073, 4080, 4294, 4599, 5107,
					5132, 5196, 5217, 5221, 5469, 67, 70, 80, 91, 120, 144, 146, 155,
					164, 182, 191, 209, 210, 213, 223, 234, 235, 239, 255, 285, 289, 296,
					305, 311, 337, 341, 381, 386, 389, 393, 404, 427, 436, 437, 448, 474,
					504, 544, 551, 561, 562, 566, 572, 577, 579, 580, 584, 585, 602, 603,
					611, 614, 617, 625, 642, 645, 661, 680, 682, 685, 709, 711, 712, 713,
					715, 718, 719, 722, 723, 728, 757, 762, 765, 776, 787, 807, 809, 827,
					852, 876, 881, 912, 913, 930, 932, 979, 1084, 1111, 1131, 1160, 1175,
					1179, 1205, 1208, 1210, 1212, 1219, 1223, 1235, 1237, 1240, 1258,
					1261, 1263, 1264, 1270, 1293, 1305, 1306, 1308, 1323, 1324, 1328,
					1333, 1334, 1339, 1341, 1345, 1368, 1394, 1427, 1429, 1490, 1550,
					1633, 1635, 1647, 1675, 1703, 1717, 1719, 1739, 1742, 1751, 1754,
					1757, 1769, 1975, 1976, 1979, 2007, 2061, 2067, 2125, 2138, 2307,
					2596, 2597, 2600, 2602, 2604, 2606, 2612, 2619, 2655, 2656, 2664,
					2669, 2789, 2795, 2811, 2820, 2823, 2830, 2834, 2838, 2840, 2841,
					2848, 2852, 2925, 3166, 3221, 3222, 3245, 3301, 3345, 3349, 3358,
					3363, 3383, 3407, 3438, 3445, 3446, 3458, 3474, 3480, 3488, 3490,
					3491, 3498, 3499, 3538, 3544, 3551, 3554, 3561, 3562, 3565, 3589,
					3591, 3670, 3676, 3677, 3686, 3687, 3691, 3995, 4078, 4093, 4094,
					4099, 4109, 4125, 4165, 4231, 4245, 4250, 4287, 4315, 4317, 4514,
					4530, 4541, 4547, 4548, 4553, 4555, 4570, 4572, 4582, 4587, 4592,
					4598, 4609, 4611, 4612, 4625, 4626, 5094, 5095, 5096, 5098, 5099,
					5108, 5110, 5115, 5116, 5123, 5125, 5133, 5138, 5155, 5158, 5169,
					5173, 5180, 5187, 5204, 5209, 5214, 5218, 5219, 5220, 5223, 5227,
					5228, 5232, 5268, 5601, 6137 };
			case 5131:
				return new int[] { 290, 471, 685, 321, 708, 2825, 2835, 108, 722, 879,
					1042, 1760, 1787, 1977, 3660, 3670, 4284, 5103 };
			case 5133:
				return new int[] { 670, 4611 };
			case 5135:
				return new int[] { 5236 };
			case 5140:
				return new int[] { 5203 };
			case 5142:
				return new int[] { 697, 753, 2423, 5208 };
			case 5143:
				return new int[] { 676, 5114, 239, 448, 472, 586, 627, 773, 1231, 1250,
					3541, 5084, 82, 271, 284, 288, 394, 422, 492, 493, 539, 670, 679,
					703, 725, 858, 1353, 1367, 1737, 1928, 2843, 3497, 3602, 4067, 4612,
					4623, 5102, 5112, 5116, 5198 };
			case 5144:
				return new int[] { 1206, 397, 1180 };
			case 5152:
				return new int[] { 472, 243, 1231, 4257 };
			case 5154:
				return new int[] { 1448, 135, 292, 4140, 5135, 5236 };
			case 5155:
				return new int[] { 3553, 5218, 584, 5098 };
			case 5156:
				return new int[] { 224, 5102, 5494, 255, 288, 323, 459, 576, 685, 742,
					769, 1188, 1229, 1231, 1261, 1325, 2812, 2852, 5131, 5159, 5229 };
			case 5163:
				return new int[] { 5126, 290, 623, 5177, 5199, 5075, 261, 321, 401,
					421, 618, 624, 663, 765, 1431, 1751, 1949, 2353, 2658, 3488, 3606,
					4275, 4324, 4485, 4627, 4814, 5110 };
			case 5164:
				return new int[] { 5165 };
			case 5165:
				return new int[] { 4167, 5164 };
			case 5169:
				return new int[] { 932, 1343, 1490, 3301, 264, 378, 1253, 5181, 719,
					776, 809, 881, 3407, 4519 };
			case 5170:
				return new int[] { 1266, 2825, 4146 };
			case 5171:
				return new int[] { 1267, 4610 };
			case 5173:
				return new int[] { 1275, 3355, 5185, 1038, 1995 };
			case 5174:
				return new int[] { 1306, 787, 1323, 1334, 5086, 5207, 505, 5919, 6137 };
			case 5177:
				return new int[] { 5199, 290, 623, 5126, 5163, 261, 321, 401, 421, 618,
					624, 663, 765, 1431, 1751, 1949, 2353, 2658, 3488, 3606, 4275, 4324,
					4485, 4627, 4814, 5110 };
			case 5178:
				return new int[] { 456, 135 };
			case 5179:
				return new int[] { 1753, 1960, 3381, 3435, 3477, 3661, 4509, 5075,
					5126, 5149, 5163 };
			case 5180:
				return new int[] { 5095, 5103, 722, 111, 366, 1188, 305, 365, 1261,
					2811 };
			case 5181:
				return new int[] { 1129 };
			case 5182:
				return new int[] { 100 };
			case 5183:
				return new int[] { 101, 289, 252, 1281 };
			case 5184:
				return new int[] { 1328, 1339 };
			case 5186:
				return new int[] { 1204, 703, 1022 };
			case 5189:
				return new int[] { 5119, 1243, 5118 };
			case 5190:
				return new int[] { 1321, 1053, 1327, 448, 629 };
			case 5192:
				return new int[] { 553, 772, 1193, 1295 };
			case 5193:
				return new int[] { 1314, 1271, 26, 252, 268, 569, 652, 748, 785, 1937,
					3437, 4578, 4588 };
			case 5198:
				return new int[] { 472, 1250, 5084, 5114, 5116, 445, 240, 271, 277,
					289, 448, 676, 1231, 2843, 3497, 4629, 5106, 5143, 5206 };
			case 5199:
				return new int[] { 5177, 788 };
			case 5200:
				return new int[] { 5078, 271, 448, 1231, 5152, 243, 289, 4629, 5206 };
			case 5202:
				return new int[] { 1477, 1919, 4627 };
			case 5203:
				return new int[] { 1264, 296, 470, 704, 5140 };
			case 5204:
				return new int[] { 4154 };
			case 5206:
				return new int[] { 5116, 240, 277, 472, 5084, 5106, 5114, 289, 445,
					1111, 1250, 2843, 5078, 5198, 5200, 271, 448, 1231, 2818, 3497, 5152 };
			case 5207:
				return new int[] { 787, 1334, 5086 };
			case 5208:
				return new int[] { 45, 678, 754, 2651, 5093, 263, 989 };
			case 5210:
				return new int[] { 760, 2844, 1935, 3357 };
			case 5211:
				return new int[] { 414, 452, 679, 1285, 1760, 1761, 5113 };
			case 5212:
				return new int[] { 5102, 5115 };
			case 5215:
				return new int[] { 323, 504, 769, 1188, 1229, 5102, 251, 253, 305, 518,
					580, 668, 744, 1207, 1231, 1972, 2808, 2812, 2848, 2849, 3585, 3603,
					5084, 5114, 5230, 5494 };
			case 5216:
				return new int[] { 3508, 861, 1328, 1339, 1715, 2764, 4103, 5147, 5184 };
			case 5226:
				return new int[] { 665, 594, 629, 677, 1295, 1367, 2845, 2852, 3573,
					3589, 3751, 4555, 4556, 5118, 5159 };
			case 5228:
				return new int[] { 4542, 685, 2835 };
			case 5230:
				return new int[] { 668, 744, 1678 };
			case 5235:
				return new int[] { 4500, 4750, 4529 };
			case 5237:
				return new int[] { 1307 };
			case 5241:
				return new int[] { 788, 1476, 3458, 4280, 5076, 5199, 26, 112, 115,
					154, 265, 290, 318, 321, 457, 481, 685, 687, 708, 805, 890, 1200,
					1273, 1977, 2600, 2835, 3359, 3652, 3660, 4119, 4256, 4542, 5131,
					5228, 5236 };
			case 5242:
				return new int[] { 1479 };
			case 5252:
				return new int[] { 2531, 3677, 1483, 3666, 4080 };
			case 5253:
				return new int[] { 411, 446, 675, 1202, 1477, 3491, 3697, 4064, 4295,
					5080, 5202 };
			case 5254:
				return new int[] { 891 };
			case 5256:
				return new int[] { 5257 };
			case 5258:
				return new int[] { 3650, 936, 1402, 3684, 4082, 3685, 124, 1304, 1704,
					1748, 1926, 1933, 1935, 2638, 2845, 2849, 3342, 3417, 3703, 4107,
					4214, 4554, 4726, 5108, 5140 };
			case 5262:
				return new int[] { 827, 1528, 1976, 2835, 3708, 4367 };
			case 5263:
				return new int[] { 2750, 3511, 1978 };
			case 5264:
				return new int[] { 5263 };
			case 5265:
				return new int[] { 1411, 2520, 3229, 3634, 3752, 3530 };
			case 5266:
				return new int[] { 3389, 4532 };
			case 5267:
				return new int[] { 4688, 5864, 1479, 3522, 4543 };
			case 5269:
				return new int[] { 3336 };
			case 5277:
				return new int[] { 4813, 2025, 905 };
			case 5282:
				return new int[] { 4654 };
			case 5285:
				return new int[] { 5860, 3475 };
			case 5300:
				return new int[] { 259, 526, 2049, 2763, 3814, 3837, 3993, 4759 };
			case 5301:
				return new int[] { 2496, 3756 };
			case 5303:
				return new int[] { 4083, 108, 109, 1941, 3380, 3403, 3619 };
			case 5304:
				return new int[] { 307, 6137 };
			case 5306:
				return new int[] { 1398, 3941 };
			case 5309:
				return new int[] { 633, 1992, 3364 };
			case 5313:
				return new int[] { 5418 };
			case 5314:
				return new int[] { 1135, 980, 1926, 1945, 4082, 5219 };
			case 5316:
				return new int[] { 4774 };
			case 5317:
				return new int[] { 4775 };
			case 5318:
				return new int[] { 5614 };
			case 5323:
				return new int[] { 5324, 5325 };
			case 5335:
				return new int[] { 2773 };
			case 5343:
				return new int[] { 6163 };
			case 5347:
				return new int[] { 2181 };
			case 5356:
				return new int[] { 6199, 6010 };
			case 5362:
				return new int[] { 5818 };
			case 5363:
				return new int[] { 5824 };
			case 5364:
				return new int[] { 956, 3220 };
			case 5365:
				return new int[] { 1014, 1020, 1057, 1400, 3504, 5058 };
			case 5374:
				return new int[] { 5052, 5074 };
			case 5378:
				return new int[] { 3507 };
			case 5397:
				return new int[] { 5408 };
			case 5403:
				return new int[] { 2677 };
			case 5404:
				return new int[] { 2678 };
			case 5405:
				return new int[] { 2679 };
			case 5408:
				return new int[] { 880, 2681, 5397 };
			case 5411:
				return new int[] { 4646 };
			case 5415:
				return new int[] { 5038 };
			case 5416:
				return new int[] { 4407, 4779, 4734 };
			case 5418:
				return new int[] { 5313, 4525 };
			case 5420:
				return new int[] { 866, 1014, 1018, 1020, 1026, 1038, 1497, 1500, 1522,
					1533, 1535, 1550, 1556, 1560, 1564, 2433, 2643, 3204, 3724, 4375 };
			case 5421:
				return new int[] { 3355 };
			case 5429:
				return new int[] { 1524 };
			case 5430:
				return new int[] { 511, 5102 };
			case 5431:
				return new int[] { 3812, 3879 };
			case 5433:
				return new int[] { 5228, 5243 };
			case 5437:
				return new int[] { 1972, 1980, 1981 };
			case 5441:
				return new int[] { 569, 3372 };
			case 5442:
				return new int[] { 5446 };
			case 5443:
				return new int[] { 665, 1492, 3549 };
			case 5451:
				return new int[] { 809, 881, 932, 990, 1042, 1380, 1490, 2154, 2408,
					2710, 3407, 3613, 4295 };
			case 5453:
				return new int[] { 4166 };
			case 5467:
				return new int[] { 744 };
			case 5469:
				return new int[] { 505, 506, 1297, 1302, 585, 614, 661, 3568, 5125,
					5227 };
			case 5473:
				return new int[] { 1717, 4530 };
			case 5482:
				return new int[] { 5615 };
			case 5483:
				return new int[] { 2959 };
			case 5484:
				return new int[] { 2477, 3485, 3986, 4668 };
			case 5489:
				return new int[] { 157 };
			case 5493:
				return new int[] { 5619, 5710 };
			case 5531:
				return new int[] { 5827 };
			case 5532:
				return new int[] { 1739, 4149, 4494, 858, 2362 };
			case 5590:
				return new int[] { 2600, 3458, 4542 };
			case 5596:
				return new int[] { 5875 };
			case 5603:
				return new int[] { 2825 };
			case 5609:
				return new int[] { 4995 };
			case 5614:
				return new int[] { 5318 };
			case 5615:
				return new int[] { 5482 };
			case 5619:
				return new int[] { 5493, 5710 };
			case 5620:
				return new int[] { 584, 219, 471, 503, 516, 619, 1760, 3533, 3703,
					4322, 5828, 149, 278, 290, 305, 387, 437, 509, 524, 527, 528, 548,
					596, 603, 662, 685, 686, 924, 1042, 1192, 1349, 1400, 1463, 1492,
					1671, 1732, 1744, 1753, 1771, 2182, 2763, 3319, 3332, 3379, 3568,
					3572, 3585, 3586, 3681, 4153, 4210, 4284, 4317, 4586, 5131, 5525,
					5550 };
			case 5621:
				return new int[] { 4279 };
			case 5641:
				return new int[] { 3510 };
			case 5642:
				return new int[] { 2685 };
			case 5650:
				return new int[] { 3522, 3808, 4463, 5864 };
			case 5652:
				return new int[] { 5973 };
			case 5659:
				return new int[] { 3808 };
			case 5664:
				return new int[] { 4753, 773, 848, 996, 1328, 1339, 1386, 1928, 1932,
					3347, 3483, 3516, 4064, 4396, 5184 };
			case 5665:
				return new int[] { 3867, 3892, 3897, 3908, 3918 };
			case 5674:
				return new int[] { 3234 };
			case 5689:
				return new int[] { 861, 2449, 3245 };
			case 5695:
				return new int[] { 4469 };
			case 5698:
				return new int[] { 2894 };
			case 5706:
				return new int[] { 5003, 2311 };
			case 5708:
				return new int[] { 2913 };
			case 5710:
				return new int[] { 5493, 5619 };
			case 5724:
				return new int[] { 3806 };
			case 5727:
				return new int[] { 2359 };
			case 5737:
				return new int[] { 305, 2834 };
			case 5751:
				return new int[] { 4946 };
			case 5813:
				return new int[] { 5833 };
			case 5818:
				return new int[] { 5362 };
			case 5824:
				return new int[] { 5363 };
			case 5827:
				return new int[] { 5531 };
			case 5828:
				return new int[] { 5620, 696, 1007, 3166, 3281, 4196, 5141 };
			case 5833:
				return new int[] { 5143, 5813 };
			case 5845:
				return new int[] { 5846 };
			case 5846:
				return new int[] { 5845 };
			case 5860:
				return new int[] { 5285, 3475 };
			case 5861:
				return new int[] { 1885, 4107, 4214 };
			case 5864:
				return new int[] { 3522, 3808, 4688, 5267, 5650 };
			case 5875:
				return new int[] { 5596 };
			case 5876:
				return new int[] { 448, 1367, 2852, 3521, 5881, 218, 543, 6039 };
			case 5881:
				return new int[] { 722 };
			case 5883:
				return new int[] { 747 };
			case 5905:
				return new int[] { 3971, 5927 };
			case 5908:
				return new int[] { 4225, 6103, 3476, 5919, 31, 283, 665, 677, 1367,
					1735, 2246, 2345, 2845, 3609, 3666, 4297, 4556, 349, 761, 1372, 1495,
					1772, 2169, 2608, 2617, 2644, 3158, 3423, 3453, 3521, 3993, 3997,
					4294, 4502, 4611, 5227, 6136, 6178, 549, 1483, 4293, 4493, 88, 614,
					995, 2650, 3346, 3348, 3397, 4190, 4546 };
			case 5915:
				return new int[] { 1409 };
			case 5917:
				return new int[] { 5109, 481, 685, 708, 290, 321, 687, 785, 1111, 1200,
					1273, 1484, 2611, 2856, 3652, 4270, 4409, 5131, 288, 788, 2825, 4542,
					5076, 5078, 26, 112, 113, 115, 154, 265, 318, 457, 525, 577, 578,
					805, 890, 1350, 1476, 1529, 1977, 2184, 2600, 2835, 3359, 3458, 3559,
					3584, 3587, 3626, 3660, 4101, 4119, 4256, 4280, 4603, 5079, 5199,
					5228, 5236, 5241 };
			case 5918:
				return new int[] { 180, 369, 468, 469, 470, 473, 480, 701, 704, 709,
					1209, 1302, 1313, 2004, 2813, 4482, 5140, 5203 };
			case 5919:
				return new int[] { 31, 4556, 549, 1772, 2608, 2617, 5227, 3476, 614,
					787, 1323, 1334, 1372, 2246, 2845, 4293, 4502, 490, 4225, 5908, 283,
					665, 677, 1306, 1367, 1735, 2345, 3397, 3521, 3609, 3666, 4294, 4297,
					4611, 5086, 5174, 5207, 5236 };
			case 5927:
				return new int[] { 3971, 488, 2649, 4608, 5905 };
			case 5940:
				return new int[] { 1739, 2612, 2830, 4080, 4093, 4094, 4165, 4315, 4317 };
			case 5954:
				return new int[] { 261, 916, 1141, 1412, 2178 };
			case 5960:
				return new int[] { 2421 };
			case 5973:
				return new int[] { 5652 };
			case 5998:
				return new int[] { 6188 };
			case 6010:
				return new int[] { 5356, 6199 };
			case 6016:
				return new int[] { 2881 };
			case 6039:
				return new int[] { 6178, 218, 543, 5876 };
			case 6052:
				return new int[] { 2408, 2458 };
			case 6055:
				return new int[] { 249, 556, 649, 1295, 1354, 1753, 4614, 5192 };
			case 6094:
				return new int[] { 6095 };
			case 6095:
				return new int[] { 6094 };
			case 6103:
				return new int[] { 4225, 5908, 3521, 31, 283, 349, 665, 677, 761, 1367,
					1372, 1495, 1735, 1772, 2169, 2246, 2345, 2608, 2617, 3158, 3423,
					3453, 3476, 3609, 3993, 3997, 4294, 4297, 4502, 4556, 4611, 5227,
					5919, 6136, 6178, 2845, 3666, 4493, 88, 549, 614, 995, 2644, 2650,
					3346, 3348, 3397, 4190, 4293, 4546 };
			case 6133:
				return new int[] { 219, 259, 645, 151, 311, 4285, 81, 115, 165, 215,
					217, 353, 397, 444, 464, 607, 1347, 1351, 1630, 1941, 2010, 3158,
					3294, 4287, 4299, 4489, 4569, 4576 };
			case 6134:
				return new int[] { 2672 };
			case 6136:
				return new int[] { 31, 283, 349, 665, 677, 761, 1367, 1372, 1495, 1735,
					1772, 2169, 2246, 2345, 2608, 2617, 3158, 3423, 3453, 3476, 3521,
					3609, 3993, 3997, 4225, 4294, 4297, 4502, 4556, 4611, 5227, 5908,
					5919, 6103, 6178, 2845, 3666, 4493, 88, 549, 614, 995, 2644, 2650,
					3346, 3348, 3397, 4190, 4293, 4546 };
			case 6137:
				return new int[] { 787, 1334, 5125, 4587, 307, 490, 1306, 487, 1323,
					5207 };
			case 6144:
				return new int[] { 6145 };
			case 6145:
				return new int[] { 6144 };
			case 6157:
				return new int[] { 6158, 6159 };
			case 6161:
				return new int[] { 5383 };
			case 6163:
				return new int[] { 5343 };
			case 6171:
				return new int[] { 6170 };
			case 6178:
				return new int[] { 6039, 31, 283, 349, 665, 677, 761, 1367, 1372, 1495,
					1735, 1772, 2169, 2246, 2345, 2608, 2617, 3158, 3423, 3453, 3476,
					3521, 3609, 3993, 3997, 4225, 4294, 4297, 4502, 4556, 4611, 5227,
					5908, 5919, 6103, 6136, 2845, 3666, 4493, 88, 549, 614, 995, 2644,
					2650, 3346, 3348, 3397, 4190, 4293, 4546 };
			case 6188:
				return new int[] { 5998 };
			case 6199:
				return new int[] { 5356, 6010 };
			case 6214:
				return new int[] { 2792 };
			case 6215:
				return new int[] { 1899 };
			case 6224:
				return new int[] { 2139, 2856 };
			default:
				return null;
		}
	}
}
