# This is an open-source, easy-to-use Quran text API for to be used in Java and Android programming.

Usage:

1. Set Mushaf (one of MUSHAF_SIMPLIFIED, MUSHAF_UTHMANI, MUSHAF_ENGLISH_LITERAL)
`Quran.setMushaf(Quran.MUSHAF_SIMPLIFIED);`
2. *Optional:* Load Mushaf into memory for faster access (skip this step on Android to preserve memory)
`Quran.load();`
3. Get verse/ayah
`Quran.getVerseContent(0)`
-----
You can also access translation texts using QuranicTextManager class.
