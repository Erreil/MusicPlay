MusicPlay
=========

# Homepage to play music


## Dokumentation:


# Projektbeschreibung #

Der Haupt-Fokus des Projektes ist für uns, eine optimale Music-Load Seite zu programmieren. 
Die Kern-Idee ist es, dass die Benutzer Ihre Songs auswählen, speichern oder abspielen können. 
Dazu soll die Seite eine Vielfalt von Optionen zur Verfügung stellen, wie z.B. eine Registrierung oder auch eigene Playlist. 
Also steht der Nutzen des Projektes an erster Stelle. Ziel vom Projekt ist es am Ende eine erfolgreiche Anwendung zu haben.
Ein Meilensteinplan zu haben ist sehr wichtig, um bei Fehlern nicht unter Druck zu geraten.
Die Zielerreichung und Qualität der Ergebnisse wurden dann in den Übungen sichergestellt.

## Anforderungsanalyse ##

functional requirements:

- Ein Benutzerkonto kann erstellt werden.
- Nach Artist oder Songs kann gesucht werden
- Jedes einzelne Lied kann angehört werden
- Das Logo wird auf jeder Seite erscheinen
- Es wird möglich sein, die Top 10 der USA, Europa  und UK als Übersicht aufzurufen
- Der Benutzer kann sich eine Playlist erstellen

non functional requirements:

- Song muss nach Auswahl sofort abgespielt werden, ohne warten
- Der Benutzer soll bis zu 20 Playlists anlegen können
- Verwendbarkeit sollte einwandfrei laufen
- Seite muss 7/24 verfügbar sein
- Es dürfen keine Benutzer mit demselben Namen existieren
- Passwörter bei der Benutzeranmeldung müssen verschlüsselt übertragen werden


### Die ersten Ideen ###

Die ersten Ideen haben wir stichpunktartig notiert und als Skizze auf ein Blatt Papier skizziert.
Am Ende haben wir beschlossen eine Music-Load Seite zu implementieren.
Im Nachhinein haben wir uns erste Schritte wie z.B. was unbedingt in das Projekt rein muss bzw. nicht fehlen darf notiert.


#### Architektur ####

Darestellung:

Die Seiten können in folgende Bereich unterteilt werden:

Benutzerbereich:

Die Ansicht in Browser wird durch fünf Html-Datein bereitgestellt. Um redundanten Code zu vermeiden wurde diese Aufteilung durchgeführt.

Dabei wird durch *main.scala.html* der Header der Seite definiert.
Den oberen bereich des *body*-Tags ist in der *headlogin.scala.html* angegeben.
Der linke Bereich in der *leftCategory.scala.html*.
Der unter Bereich ist definiert durch die *footerPlayer.scala.html*.

Diese Teile werden bei jedem Seitenaufbau eingebunden.

Der wechselnde Inhalt ist in der vierten Html-Datei definiert. Dies könnten folgende Dateien sein:

 - *favoriteSongs.scala.html*
 - *index.scala.html*
 - *songs.scala.html*

Adminpanel:

Das Adminpanel ist ähnlich dem Benutzerbereich aufgebaut. Hierbei erfolgt der Aufbau aus vier Teilen.

*Header*-Definition: *main.scala.html*
Oberer *body*-Bereich: *aphead.scala.html*
Linker *body*-Bereich: *apleftcategory.scala.html*

Inhalt:

 - *apaddartist.scala.html*
 - *apaddsong.sala.html*
 - *aprankmanagement.sala.html*
 - *apusermanagement.sala.html*

Sonstige Bereiche:

Ausnahmebereiche, die anders aufgebaut werden, ist der Login- und Signupbereich.Diese enthalten nur die *main.scala.html* für den *Head*. Dies sind folgende Dateien:

 - *aplogin.scala.html*
 - *signup.scala.html*
 
Logik:

Der Aufbau der Logik ist im Klassendiagram gegeben.
 
##### verwendete Technologien #####

Web:
- JavaScript/JQuery

Allen Html-Seiten steht ein allgemeiner JavaScript zu verfügung. Dieser wird zu beginn in der main.scala.html eingebunden. Das Script unterstützt diese bei folgenden Funktionen:

 - Abhandeln der AJAX Abfragen
 - Aktualisieren der Progressladebalken
 - Einblenden oder Ausblenden von Elementen
 - Kommunikation über WebSockets
 
Desweiteren werden über JQuery die meisten übergaben von Werten zwischen den einzelnen Html-Tags gehändelt.

Einsatz im Projekt:

Im Projekt exisitiert eine selbstgeschriebe *Script.js*, welche wie bereits erwähnt in der *main.scala.html* eingebunden wird. Die Datei ist vordefiniertem Ordner von *PlayFramework*-*public/javascripts* hinterlegt. Diese enthält Funktion für folgende Aufgaben:

Funktion --> Aufgabe --> Datei

readSelectedUsers() --> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge -->  *apusermanagement.sala.html*
readSelectedSongs() --> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge --> *apaddsong.sala.html*
readSelectedArtists() --> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge --> *apaddartist.scala.html*
readSongRanking() --> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge --> *aprankmanagement.sala.html*

deleteUser() --> Löscht den übergebenen User anhand Id über AJAX -->  *apusermanagement.sala.html*
deleteSong() --> Löscht den übergebenen Song anhand Id über AJAX --> *apaddsong.sala.html*
deleteArtist() --> Löscht den übergebenen Artist anhand Id über AJAX --> *apaddartist.scala.html*
updateSongRanking() --> Aktualisiert Ranking anhand gegebener Id --> *aprankmanagement.sala.html*

getUsers() --> Lädt User in die Tabelle nach -->  *apusermanagement.sala.html*
getSongs() --> Lädt Songs in die Tabelle nach --> *apaddsong.sala.html*
getArtists() --> Lädt Artists in die Tabelle nach --> *apaddartist.scala.html*
getSongRankings() --> Lädt Songs in die Tabelle nach --> *aprankmanagement.sala.html*

playMusic() --> Setzt den Source-Tag für den Mediaplayer --> *footerPlayer.scala.html*

getSearchValue() --> Liest den einegegben Wert im Suchfeld aus --> *aphead.scala.html*

addToFavorites () --> Fügt über AJAX Favoriten hinzu --> *songs.scala.html*

 
- Scala

 Alle Parameter, die an die Html übergeben werden, werden durch Scala übergeben.
 Dynamische Inhalte werden durch Scala bereitgestellt und z.B Tabellen erzeugt oder andere Html-Elemente definiert.

CSS:
- bootstrap

Im Projekt wird hauptsächlich der gegeben CSS-Design von *bootstrap* verwendet. Alle Elemente bauen darauf auf. Auch das Layout der Seite wird durch die gegebenen *columns* von *bootstrap* realisiert. Es existiert keine eigene CSS-Datei, da die gegebe CSS von *bootstrap* für diese Projekt ausreichend ist. In einzelnen Fällen wird auf das *Style-Attribut* zurückgegriffen um einzelne Feinheiten anzupassen.

Database:
- SQLLite

Als Datenbank wird SQLite verwendet. Dieses ist kein vollständiges Datenbanksystem, ist aber für das Projekt ausreichend. Alle notwendigen SQL-Abfragen konnten damit ausgeführt werden.

Entwicklung:
- Java

Die gesamte Logik, serverseitig, wird per Java-Code ausgeführt. Alle Interaktion mit der Datenbank und das Handling zwischen Server und Client wird auch per Java-Code durchgeführt. 

Sonstige Technologien:
- WebSocket

Um Seiten nich neuladen zu müssen und dennoch eine Kommunikation zwischen Client und Server zu ermöglichen werden WebSockets eingesetzt. Diese verbinden sich beim Aufbau der Html-Seiten und behalten die Verbindung aufrecht, solange die Html-Seite geöffnet ist.

In unserem Projekt werden WebSockets während der Eingabe im Suchfeld für Songs eingesetzt. Dabei werden vom Server nach Eingabe erster Suchzeichen Vorschläge vom Server an Client geschickt und angezeigt.

- AJAX

Mit AJAX können Http-Anfragen, sowohl über GET als auch über POST an den Server geschickt werden. Dies wird über JavaScript durchgeführt und ein erneuter Seitenaufbau ist nicht notwendig. Somit können Inhalte der Seite ohne erneuten Aufbau der Seite realisiert werden.

In unserem Projekt wird die Technologie verwendet um im AdminPanel die Tabellen nach dem Löschen von von Einträgen zu aktualisieren.

- JSON

JSON ist ein komptaktes Datenformat in Textform zum Datenaustausch. 

JSON wurde in unserem Projekt für AJAX verwendet. Die übertragenen Daten an den Client sind im JSON-Format.

- Playframework

Das ganze Projekt 

###### Erfahrungen ######

####### Probleme #######

######## wichtige Codeschnipsel ########
