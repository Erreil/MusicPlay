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

Im Projekt exisitiert eine selbstgeschriebe Script.js, welche wie bereits erwähnt in der main.scala.html eingebunden wird. Die Datei ist vordefiniertem Ordner von "PlayFramework"-"public/javascripts" hinterlegt. Diese enthält Funktion für folgende Aufgaben:


 
- Scala

 Alle Parameter, die an die Html übergeben werden, werden durch Scala übergeben.
 Dynamische Inhalte werden durch Scala bereitgestellt und z.B Tabellen erzeugt oder anderen Html-Elemente definiert.

CSS:
- bootstrap

Im Projekt wird hauptsächlich der gegeben CSS-Design von "bootstrap" verwendet. Alle Elemente bauen darauf auf. Auch das Layout der Seite wird durch die gegebenen "columns" von "bootstrap" realisiert. Es existiert keine eigene CSS-Datei, da die gegebe CSS von "bootstrap" für diese Projekt ausreichend. In einzelnen Fällen wird das auf "Style-Attribut" zurückgegriffen um einzelnen Feinheiten anzupassen.

Database:
- SQLLite

Als Datenbank wird SQLite verwendet. Dieses ist kein vollständiges Datenbanksystem, ist aber für das Projekt ausreichend. Alle notwendigen SQL-Abfragen konnte damit ausgeführt werden.

Entwicklung:
- Java

Die gesamte Logik, serverseitig wird per Java-Code ausgeführt. Alle Interaktion mit der Datenbank und das Handling zwischen Server und Client wird auch per Java-Code durchgeführt. 

Sonstige Technologien:
- Websocket
- AJAX
- JSON
- 

- Playframework
- 

###### Erfahrungen ######

####### Probleme #######

######## wichtige Codeschnipsel ########



