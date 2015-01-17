#MusicPlay#
***

## Projektbeschreibung ##


Der Haupt-Fokus des Projektes ist für uns, eine optimale Music-Load Seite zu programmieren. 
Die Benutzer sollen mit der Seite viele Funktionalitäten zur Auswahl haben. Die Kern Idee ist es, dass wir den Nutzer es ermöglichen,sich Lieder aus der ganzen Welt anzuhören. Die Nutzer werden sich zusätzlich Playlists bzw. Favoriten erstellen können.
Dazu soll die Seite eine Vielfalt von Optionen zur Verfügung stellen, wie z.B. eine Registrierung oder auch eigene Playlist. 
Für uns steht die Benutzerfreundlichkeit an erster Stelle. Natürlich wollen wir auch, dass alles optimal läuft.
Ziel von unserem Projekt ist es am Ende eine erfolgreiche Anwendung zu haben.
Für uns war es wichtig, dass Projekt mit Meilensteinen zu setzen, da es immer wieder zu Problemen kam und es sonst nicht Zeitlich gereicht hätte, Sie dann rechtzeitig zu beheben.
Die Zielerreichung und Qualität der Ergebnisse wurden dann immer in den Übungen sichergestellt.


***

## Die ersten Ideen ##

Unsere erste Idee , die wir dann auch übernommen haben war eine Music-Play Seite zum implementieren.
Als nächsten Schritt haben wir uns in der Gruppe überlegt, was wir alles in das Projekt einbauen möchten.
Vorallem war es wichtig, immer den Aufwand einzukalkulieren. Zusätzlich müssten wir uns bewusst sein, dass unser Projekt (Music-Play) gewisse Funktionalitäten haben muss.

![Mockup](/public/images/Mockup.png "Mockup")

Wie man in unserem Mockup schon sehen kann, hatten wir uns zuerst alle Funktionalitäten die wir mit in das Projekt einbauen wollten notiert und aufgezeichnet.

***

## Anforderungsanalyse ##

###functional requirements:###

- Ein Benutzerkonto kann erstellt werden.
- Nach Artist oder Songs kann gesucht werden
- Jedes einzelne Lied kann angehört werden
- Das Logo wird auf jeder Seite erscheinen
- Es wird möglich sein, die Top 10 der USA, Europa  und UK als Übersicht aufzurufen
- Der Benutzer kann sich eine Playlist erstellen

###non functional requirements:###

- Song muss nach Auswahl sofort abgespielt werden, ohne warten
- Der Benutzer soll bis zu 20 Playlists anlegen können
- Verwendbarkeit sollte einwandfrei laufen
- Seite muss 7/24 verfügbar sein
- Es dürfen keine Benutzer mit demselben Namen existieren
- Passwörter bei der Benutzeranmeldung müssen verschlüsselt übertragen werden

***

## Architektur ##

###Darstellung:###

Die Seiten können in folgende Bereich unterteilt werden:

 - ###Benutzerbereich###

Die Ansicht in Browser wird durch fünf Html-Datein bereitgestellt. Um redundanten Code zu vermeiden wurde diese Aufteilung durchgeführt.
Dabei wird durch *main.scala.html* der Header der Seite definiert.
Den oberen bereich des *body*-Tags ist in der *headlogin.scala.html* angegeben.
Der linke Bereich in der *leftCategory.scala.html*.
Der unter Bereich ist definiert durch die *footerPlayer.scala.html*.

Diese Teile werden bei jedem Seitenaufbau eingebunden.

Der wechselnde Inhalt ist in der fünften Html-Datei definiert. Dies könnten folgende Dateien sein:

 - *favoriteSongs.scala.html*
 - *index.scala.html*
 - *songs.scala.html*

 - ###Adminpanel###

Das Adminpanel ist ähnlich dem Benutzerbereich aufgebaut. Hierbei erfolgt der Aufbau aus vier Teilen.

*Header*-Definition: *main.scala.html*
Oberer *body*-Bereich: *aphead.scala.html*
Linker *body*-Bereich: *apleftcategory.scala.html*

Inhalt:

 - *apaddartist.scala.html*
 - *apaddsong.sala.html*
 - *aprankmanagement.sala.html*
 - *apusermanagement.sala.html*

 - ###Sonstige Bereiche###

Ausnahmebereiche, die anders aufgebaut werden, ist der Login- und Signupbereich.Diese enthalten nur die *main.scala.html* für den *Head*. Dies sind folgende Dateien:

 - *aplogin.scala.html*
 - *signup.scala.html*
 
Logik:

Der Aufbau der Logik ist im Klassendiagram gegeben.
 ***
## verwendete Technologien ##

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

<table>
    <tr>
        <th>Funktion </th>
        <th> Aufgabe </th>
        <th> Datei </th>
    </tr>
    <tr>
        <td> readSelectedUsers() </td>
        <td> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge </td>
        <td> *apusermanagement.sala.html* </td>
    </tr>
    <tr>
        <td> readSelectedSongs() </td>
        <td> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge </td>
        <td> *apaddsong.sala.html* </td>
    </tr>
       <tr>
        <td> readSelectedArtists() </td>
        <td> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge </td>
        <td> *apaddartist.scala.html* </td>
    </tr>
    <tr>
        <td> readSongRanking() </td>
        <td> Durchläuft die Tabelle und überprüft auf ausgewählte Einträge </td>
        <td> *aprankmanagement.sala.html* </td>
    </tr>
        <tr>
        <td> deleteUser() </td>
        <td> Löscht den übergebenen User anhand Id über AJAX </td>
        <td> *apusermanagement.sala.html* </td>
    </tr>
        <tr>
        <td> deleteSong() </td>
        <td> Löscht den übergebenen Song anhand Id über AJAX </td>
        <td> *apaddsong.sala.html* </td>
    </tr>
    <tr>
        <td> deleteArtist() </td>
        <td> Löscht den übergebenen Artist anhand Id über AJAX </td>
        <td> *apaddartist.scala.html* </td>
    </tr>
    <tr>
        <td> updateSongRanking() </td>
        <td> Aktualisiert Ranking anhand gegebener Id </td>
        <td> *aprankmanagement.sala.html* </td>
    </tr>
    <tr>
        <td> getUsers() </td>
        <td> Lädt User in die Tabelle nach </td>
        <td> *apusermanagement.sala.html* </td>
    </tr>
    <tr>
        <td> getSongs() </td>
        <td> Lädt Songs in die Tabelle nach </td>
        <td> *apaddsong.sala.html* </td>
    </tr>
    <tr>
        <td> getArtists() </td>
        <td> Lädt Artists in die Tabelle nach </td>
        <td> *apaddartist.scala.html* </td>
    </tr>
    <tr>
        <td> getSongRankings() </td>
        <td> Lädt Songs in die Tabelle nach </td>
        <td> *aprankmanagement.sala.html* </td>
    </tr>
    <tr>
        <td> playMusic() </td>
        <td> Setzt den Source-Tag für den Mediaplayer </td>
        <td> *footerPlayer.scala.html* </td>
    </tr>
     <tr>
        <td> getSearchValue() </td>
        <td> Liest den einegegben Wert im Suchfeld aus </td>
        <td> *aphead.scala.html* </td>
    </tr>
    <tr>
        <td> addToFavorites() </td>
        <td> Fügt über AJAX Favoriten hinz </td>
        <td> *songs.scala.html* </td>
    </tr>
</table>

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

Das Entwickeln wurde über das Playframework durchgeführt.
***

## Erfahrungen ##

Das Entwickeln dieser Webanwendung war für uns neues Gebiet. Zwar hatte unser Team gute Java-Kenntnise, aber es fehlten jegliche Erfahrung mit den sonstigen eingesetzten Technologien. Somit war es ein schwieriger aber lernreicher Entwicklungsprozess.

Durch dieses Projekt wurden viele neue Erkenntnise gewonnen. Web ist für unserer Team klarer geworden.
***
## Probleme ##

Wir hatten sehr viele Probleme bei diesem Projekt, wir wollen aber nur die wichtigsten aufzählen:

 - Anbindung des Projekts an Playframework
 
 Leider konnte unsere Projekt nicht problemlos an *Play* angebunden werden. Unsere Inhalte wurden nicht angezeigt, sondern nur die Standardseite von *Play*. Fehlerlösung: Cache von *Play* musste gellert werden.
 
 - SQLlite Abfragen
 
 Hier hatten wir das Problem, dass die SQLite-Datenbank ständig *locked* war. Nach einigen Recherchen konnte das Problem ermitteln. Fehlerursache war, dass nach jedem Kontakt mit der Datenbank jegliche eingesetzten Objekte für die Datenbank entladen werden mussten. Sprich nicht nur die *Connection* sondern auch die einzelnen *Statements*.

## wichtige Codeschnipsel ##

`function deleteSong(id){`  
`	var request = new XMLHttpRequest();`  
`	request.onreadystatechange = function() {`  
`		if(request.readyState == 4 && request.status == 200){`  
`				return true;`  
`		}`  
`		else{`  
`			return false;`  
`		}`  
`	}`  
	
`	var url = window.location.href;`  
`	request.open("POST", url + "/deleteSong/" + id, false);`  
`	request.send();`  
}

