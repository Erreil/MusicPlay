#MusicPlay#

***

## Wichtige Informationen ##
 Heroku-Link: http://musicplayerio.herokuapp.com
 'Wichtig' kein HTTPS verwenden, es kann zu Problem kommen. (z.B bei Websockets)
 
 Browser: Google Chrome

***

## Projektbeschreibung ##

Der Hauptfokus des Projekts lag auf der Programmierung einer optimalen Music-Seite. Dem Benutzer sollen durch die Seite ein gewisse Anzahl an Funktionalitäten geboten werden. Die Kernidee des Projekts ist das anhören verschiedener Lieder aus der ganzen Welt. Zusätzlich sollen dem Nutzer weitere Möglichkeiten geboten werden, wie z.B. das Verwalten von eigenen Playlisten oder Favoriten. Die Seite soll Benutzer- und Bedienfreundlich sein.

***

## Die ersten Ideen ##

Vom Beginn an war unser Team sich einig eine Music-Seite zu programmieren. Zuerst wurden erste Ideen gesammelt, schließlich ein Mockup erstellt. Jede Funktionalität der Seite wurde mit Vorsicht betrachtet und der Aufwand mit einkalkuliert.

![Mockup](/public/images/Home.png)


Wie man in unserem Mockup schon sehen kann, hatten wir uns zuerst alle Funktionalitäten, die wir mit in das Projekt einbauen wollten notiert und aufgezeichnet.

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
- Der Benutzer soll bis zu 20 Play Lists anlegen können
- Verwendbarkeit sollte einwandfrei laufen
- Seite muss 7/24 verfügbar sein
- Es dürfen keine Benutzer mit demselben Namen existieren
- Passwörter bei der Benutzeranmeldung müssen verschlüsselt übertragen werden


![UseCase-Diagramm](/public/images/UseCase-Diagramm.png)

***

## Architektur ##

![Klassen-Diagramm](/public/images/Klassendiagramm.png)

###Darstellung:###

Die Seiten können in folgende Bereich unterteilt werden:

 - ###Benutzerbereich###

Die Ansicht im Browser wird durch fünf Html-Dateien bereitgestellt. Um redundanten Code zu vermeiden wurde diese Aufteilung durchgeführt.
Dabei wird durch *main.scala.html* der Header der Seite definiert.
Den oberen Bereich des *Body*-Tags ist in der *headlogin.scala.html* angegeben.
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
Oberer *Body*-Bereich: *aphead.scala.html*
Linker *Body*-Bereich: *apleftcategory.scala.html*

Inhalt:

 - *apaddartist.scala.html*
 - *apaddsong.sala.html*
 - *aprankmanagement.sala.html*
 - *apusermanagement.sala.html*

 - ###Sonstige Bereiche###

Ausnahmebereiche, die anders aufgebaut werden, ist der Login- und Signupbereich. Diese enthalten nur die *main.scala.html* für den *Head*. Dies sind folgende Dateien:

 - *aplogin.scala.html*
 - *signup.scala.html*
 
Logik:

Der Aufbau der Logik ist im Klassendiagram gegeben.
 ***
## verwendete Technologien ##

Web:
- JavaScript/JQuery

Allen Html-Seiten steht ein allgemeiner JavaScript zu Verfügung. Dieser wird zu Beginn in der main.scala.html eingebunden. Das Script unterstützt diese bei folgenden Funktionen:

 - Abhandeln der AJAX Abfragen
 - Aktualisieren der Progressladebalken
 - Einblenden oder Ausblenden von Elementen
 - Kommunikation über WebSockets
 
Des Weiteren werden über JQuery die meisten übergaben von Werten zwischen den einzelnen Html-Tags gehändelt.

Einsatz im Projekt:

Im Projekt existiert eine selbstgeschriebene *Script.js*, welche wie bereits erwähnt in der *main.scala.html* eingebunden wird. Die Datei ist vordefiniertem Ordner von *Play Framework*-*public/javascripts* hinterlegt. Diese enthält Funktion für folgende Aufgaben:

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
        <td> Liest den eingegebenen Wert im Suchfeld aus </td>
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

Im Projekt wird hauptsächlich der gegeben CSS-Design von *bootstrap* verwendet. Alle Elemente bauen darauf auf. Auch das Layout der Seite wird durch die gegebenen *columns* von *bootstrap* realisiert. Es existiert keine eigene CSS-Datei, da die gegeben CSS von *bootstrap* für diese Projekt ausreichend ist. In einzelnen Fällen wird auf das *Style-Attribut* zurückgegriffen um einzelne Feinheiten anzupassen.

Database:
- SQLLite

Als Datenbank wird SQLite verwendet. Dieses ist kein vollständiges Datenbanksystem, ist aber für das Projekt ausreichend. Alle notwendigen SQL-Abfragen konnten damit ausgeführt werden.

Entwicklung:
- Java

Die gesamte Logik, serverseitig, wird per Java-Code ausgeführt. Alle Interaktion mit der Datenbank und das Handling zwischen Server und Client werden auch per Java-Code durchgeführt. 

Sonstige Technologien:
- WebSocket

Um Seiten nicht neu Laden zu müssen und dennoch eine Kommunikation zwischen Client und Server zu ermöglichen werden WebSockets eingesetzt. Diese verbinden sich beim Aufbau der Html-Seiten und behalten die Verbindung aufrecht, solange die Html-Seite geöffnet ist.

In unserem Projekt werden WebSockets während der Eingabe im Suchfeld für Songs eingesetzt. Dabei werden vom Server nach Eingabe erster Suchzeichen Vorschläge vom Server an Client geschickt und angezeigt.

- AJAX

Mit AJAX können Http-Anfragen, sowohl über GET als auch über POST an den Server geschickt werden. Dies wird über JavaScript durchgeführt und ein erneuter Seitenaufbau ist nicht notwendig. Somit können Inhalte der Seite ohne erneuten Aufbau der Seite realisiert werden.

In unserem Projekt wird die Technologie verwendet um im AdminPanel die Tabellen nach dem Löschen von Einträgen zu aktualisieren.

- JSON

JSON ist ein kompaktes Datenformat in Textform zum Datenaustausch. 

JSON wurde in unserem Projekt für AJAX verwendet. Die übertragenen Daten an den Client sind im JSON-Format.

- Playframework

Das Entwickeln wurde über das Playframework durchgeführt.
***

## Erfahrungen ##

Das Entwickeln dieser Webanwendung war für uns neues Gebiet. Zwar hatte unser Team gute Java-Kenntnisse, aber es fehlte jegliche Erfahrung mit den sonstigen eingesetzten Technologien. Somit war es ein schwieriger aber lernreicher Entwicklungsprozess.

Durch dieses Projekt wurden viele neue Erkenntnisse gewonnen. Web ist für unser Team klarer geworden.
***
## Probleme ##

Wir hatten sehr viele Probleme bei diesem Projekt, wir wollen aber nur die wichtigsten aufzählen:

 - Anbindung des Projekts an Playframework
 
 Leider konnte unsere Projekt nicht problemlos an *Play* angebunden werden. Unsere Inhalte wurden nicht angezeigt, sondern nur die Standardseite von *Play*. Fehlerlösung: Cache von *Play* musste geleert werden.
 
 - SQLlite Abfragen
 
 Hier hatten wir das Problem, dass die SQLite-Datenbank ständig *locked* war. Nach einigen Recherchen konnte das Problem ermitteln. Fehlerursache war, dass nach jedem Kontakt mit der Datenbank jegliche eingesetzten Objekte für die Datenbank entladen werden mussten. Sprich nicht nur die *Connection* sondern auch die einzelnen *Statements*.

## wichtige Codeschnipsel ##

###AJAX Implementierung###

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

###Websocket Implementierung###

`<script type="text/javascript">`  
` var webSocket;`  
`  $(function() {`  
` var WS = window["MozWebSocket"] ? MozWebSocket : WebSocket;`  
` webSocket = new WS('@routes.Application.searchResult().webSocketURL()');`  
` webSocket.onmessage = receiveEvent;`  
` })`  

`  function sendSearch() {`  
`  	$("#Liste").html("");`  
` var g = $("#search").val();`  
` webSocket.send(g);`
` };`  
 
` function receiveEvent(event) {`  
`		var lines = event.data.split(';');`  
`		$("#Liste").html("");`  
		
`		$.each( lines, function( index, value ){`  
`   	$("#Liste").append("<option>" + value + "</option>");`  
`		});`	  	
` };`  
 
 `</script>`  

