## This is a complete, open-source and easy-to-use Quran text API for to be used in Java and Android programming. Very straight forward to install; just add .jar files as libraries and you are all set. Below are some examples of usage:

**Mushaf:**
1. Set Mushaf (one of MUSHAF_SIMPLIFIED, MUSHAF_UTHMANI, MUSHAF_ENGLISH_LITERAL)
`Quran.setMushaf(Quran.MUSHAF_SIMPLIFIED);`
2. Download it (or skip this step and have it downloaded automatically when required)
`QuranicTextManager.updateText(Quran.MUSHAF_SIMPLIFIED);`
3. *Optional:* Load Mushaf into memory for faster access (skip this step on Android to preserve memory)
`Quran.load();`
4. Get verse/ayah
`Quran.getVerseContent(0);`
-----

**Translations and other texts:**
1. Check required resources
```java
boolean b = QuranicTextManager.init();
```
2. Get texts list (type, minimum completion percent, language code) 
```java
List<QuranicTextIdentifier> qti = QuranicTextManager.getTextsOnServer(QuranicTextType.TRANSLATION_TEXT, 100, "en");
```
   *or get a list of locally available (already downloaded) texts*
```java
List<QuranicTextIdentifier> qti = QuranicTextManager.getLocalTexts();
```
3. Add returned texts to the provided ordered list
```java
for (int i = 0; i < qti.size(); i++)
  QuranicTextList.addText(qti.get(i).getID());
```
4. Get a text
```java
QuranicText qtxt = QuranicTextList.getTextByOrder(0);
```
5. Download the text and make its content available offline
```java
QuranicTextManager.updateText(qtxt.getIdentifier().getID());
```
6. Get text content
```java
qtxt.getVerseContent(Quran.getVerse(Quran.SECTION_COUNT, 1));
```
**Bookmarks:**
```java
QuranicBookmarkList qbl = new QuranicBookmarkList(); //create a bookmark list
qbl.addBookmark(new QuranicBookmark(Quran.getRandomVerse(), "some random verse")); //add a bookmark to the list
QuranicBookmarkManager.createNewFileAndWrite(new File("random bookmarks list"), qbl.getBookmarks()); //save list to file
QuranicBookmark[] readBookmarks = QuranicBookmarkManager.getBookmarks(new File("another bookmarks list")); //read bookmarks from file
qbl.clearBookmarks();
qbl.addBookmarks(readBookmarks); //add read bookmarks to the list
qbl.getBookmark(0); //get first bookmark
 ```
 
**You can also use this library to find similar verses to a particular one, find section/surah names and meanings, check for prostration verses etc. Check "doc" folder for a complete methods overview.**
