function readSelectedUsers(){

	var rowCount = $('#userTable tr').length;
									 
	$(".progress-bar").attr("aria-valuemin","0");
	$(".progress-bar").attr("aria-valuemax", rowCount);
	$(".progress-bar").attr("aria-valuenow","0");
	$(".progress-bar").attr("style","width: 0%");
	$(".progress-bar").text("0%");
	$(".sr-only").text("arbeite..");
	$(".progress-bar").attr("class","progress-bar");
		
	var counter = 0;
	$("#userTable").find('tr').each(function (rowIndex, r){
		counter++;
		$(".progress-bar").attr("aria-valuenow", rowCount);
		$(".progress-bar").attr("style","width: " + (counter / rowCount) * 100 + "%");
		$(".progress-bar").text((counter / rowCount) * 100 + "%");
		var id;	
		$(this).find('td').each(function (colIndex, c){
			id = c.textContent;
			return false;
		});
					
		$(this).find('td input:checked').each(function () {  
					deleteUser(id);
			     
    });
	});
	
	$(".progress-bar").attr("class","progress-bar progress-bar-success");
	getUsers(); 
}

//AJAX
function deleteUser(id){
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){		
				return true;
		}
		else{
			return false;
		}
	}
	
	var url = window.location.href;
	request.open("POST", url + "/deleteUser/" + id, false);
	request.send();
}

//AJAX
function getUsers(){
	
	$("#userTable > tbody").html("");
	
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){							
				var json = $.parseJSON(request.responseText);
				
				for (var i = 0; i < json.length; i++){
					
					var row = "<tr>";
					row += "<td>" + json[i]["id"] + "</td>";
					row += "<td>" + json[i]["username"] + "</td>";
					row += "<td>" + json[i]["firstname"] + "</td>";
					row += "<td>" + json[i]["lastname"] + "</td>";
					row += "<td>" + json[i]["mail"] + "</td>";
					row += "<td><input type=\"checkbox\" name=\"box\"></td>"
					row += "</tr>"
					
					$("#userTable tbody").append(row);
				}
		}
	}
	
	var url = window.location.href;
	request.open("GET", url + "/users", true);
	request.send();
}

function readSelectedSongs(){

	var rowCount = $('#songTable tr').length;
									 
	$(".progress-bar").attr("aria-valuemin","0");
	$(".progress-bar").attr("aria-valuemax", rowCount);
	$(".progress-bar").attr("aria-valuenow","0");
	$(".progress-bar").attr("style","width: 0%");
	$(".progress-bar").text("0%");
	$(".sr-only").text("arbeite..");
	$(".progress-bar").attr("class","progress-bar");
		
	var counter = 0;
	$("#songTable").find('tr').each(function (rowIndex, r){
		counter++;
		$(".progress-bar").attr("aria-valuenow", rowCount);
		$(".progress-bar").attr("style","width: " + (counter / rowCount) * 100 + "%");
		$(".progress-bar").text((counter / rowCount) * 100 + "%");
		var id;	
		$(this).find('td').each(function (colIndex, c){
			id = c.textContent;
			return false;
		});
					
		$(this).find('td input:checked').each(function () {  
					deleteSong(id);
			     
    });
	});
	
	$(".progress-bar").attr("class","progress-bar progress-bar-success");
	getSongs(); 
}

//AJAX
function deleteSong(id){
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){		
				return true;
		}
		else{
			return false;
		}
	}
	
	var url = window.location.href;
	request.open("POST", url + "/deleteSong/" + id, false);
	request.send();
}

//AJAX
function getSongs(){
	
	$("#songTable > tbody").html("");
	
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){							
				var json = $.parseJSON(request.responseText);
				
				for (var i = 0; i < json.length; i++){
					
					var row = "<tr>";
					row += "<td>" + json[i]["id"] + "</td>";
					row += "<td>" + json[i]["artist"]["alias"] + "</td>";
					row += "<td>" + json[i]["titel"] + "</td>";
					row += "<td><input type=\"checkbox\" name=\"box\"></td>"
					row += "</tr>"
					
					$("#songTable tbody").append(row);
				}
		}
	}
	
	var url = window.location.href;
	request.open("GET", url + "/songs", true);
	request.send();
}

function readSelectedArtists(){

	var rowCount = $('#artistTable tr').length;
									 
	$(".progress-bar").attr("aria-valuemin","0");
	$(".progress-bar").attr("aria-valuemax", rowCount);
	$(".progress-bar").attr("aria-valuenow","0");
	$(".progress-bar").attr("style","width: 0%");
	$(".progress-bar").text("0%");
	$(".sr-only").text("arbeite..");
	$(".progress-bar").attr("class","progress-bar");
		
	var counter = 0;
	$("#artistTable").find('tr').each(function (rowIndex, r){
		counter++;
		$(".progress-bar").attr("aria-valuenow", rowCount);
		$(".progress-bar").attr("style","width: " + (counter / rowCount) * 100 + "%");
		$(".progress-bar").text((counter / rowCount) * 100 + "%");
		var id;	
		$(this).find('td').each(function (colIndex, c){
			id = c.textContent;
			return false;
		});
					
		$(this).find('td input:checked').each(function () {  
					deleteArtist(id);
			     
    });
	});
	
	$(".progress-bar").attr("class","progress-bar progress-bar-success");
	getArtists(); 
}

//AJAX
function deleteArtist(id){
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){		
				return true;
		}
		else{
			return false;
		}
	}
	
	var url = window.location.href;
	request.open("POST", url + "/deleteArtist/" + id, false);
	request.send();
}

//AJAX
function getArtists(){
	
	$("#artistTable > tbody").html("");
	
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){							
				var json = $.parseJSON(request.responseText);
				
				for (var i = 0; i < json.length; i++){
					
					var row = "<tr>";
					row += "<td>" + json[i]["id"] + "</td>";
					row += "<td>" + json[i]["alias"] + "</td>";
					row += "<td>" + json[i]["firstname"] + "</td>";
					row += "<td>" + json[i]["lastname"] + "</td>";
					row += "<td>" + json[i]["country"]["name"] + "</td>";
					row += "<td><input type=\"checkbox\" name=\"box\"></td>"
					row += "</tr>"
					
					$("#artistTable tbody").append(row);
				}
		}
	}
	
	var url = window.location.href;
	request.open("GET", url + "/artists", true);
	request.send();
}

function readSongRanking(){

	var rowCount = $('#songRankingTable tr').length;
									 
	$(".progress-bar").attr("aria-valuemin","0");
	$(".progress-bar").attr("aria-valuemax", rowCount);
	$(".progress-bar").attr("aria-valuenow","0");
	$(".progress-bar").attr("style","width: 0%");
	$(".progress-bar").text("0%");
	$(".progress-bar").attr("class","progress-bar");
		
	var counter = 0;
	$("#songRankingTable").find('tr').each(function (rowIndex, r){
		counter++;
		$(".progress-bar").attr("aria-valuenow", rowCount);
		$(".progress-bar").attr("style","width: " + (counter / rowCount) * 100 + "%");
		$(".progress-bar").text((counter / rowCount) * 100 + "%");
		var id;	
		var rank;
		$(this).find('td').each(function (colIndex, c){
			
			if(colIndex == 0){
				 id = c.textContent;
				 rank = $("#input" + id).val();
				 updateSongRanking(id, rank);
				 return false;
			}
			
		});
	});
	
	$(".progress-bar").attr("class","progress-bar progress-bar-success");
	getSongRankings(); 
}

//AJAX
function updateSongRanking(id, rank){
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){		
				return true;
		}
		else{
			return false;
		}
	}
	
	var url = window.location.href;
	request.open("POST", url + "/updateRanking/" + id + ";" + rank, false);
	request.send();
}

function getSongRankings(){	
	location.reload();
}

function playMusic(link, titel){
	$("#songTitel").html(titel);
		
	$("#audioPlayer").html("<source src=\"" + link +"\" type=\"audio/mpeg\" />");
	
	var audio = $("#audioPlayer");
	audio.load();
	audio.play();
}
 	
function getSearchValue(){
		return $("#search")-val();
}

//AJAX
function addToFavorites (url) {
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){		
				return true;
		}
		else{
			return false;
		}
	}

	request.open("POST", url , false);
	request.send();
}

function chkFormular () {
  if (document.Formular.Username.value == "") {
    alert("Bitte Ihren Benutzernamen eingeben!");
    document.Formular.Username.focus();
    return false;
  }
  if (document.Formular.Password.value == "") {
    alert("Bitte Ihr Passwort eingeben!");
    document.Formular.Password.focus();
    return false;
  }
  
  if (document.Formular.Firstname.value == "") {
    alert("Bitte Ihren Vornamen eingeben!");
    document.Formular.Firstname.focus();
    return false;
  }
  
  if (document.Formular.Lastname.value == "") {
    alert("Bitte Ihren Nachnamen eingeben!");
    document.Formular.Lastname.focus();
    return false;
  }
  
  if (document.Formular.Zip.value == "") {
    alert("Bitte Ihre Postleitzahl eingeben!");
    document.Formular.Zip.focus();
    return false;
  }
  
  if (document.Formular.Location.value == "") {
    alert("Bitte Ihren Ort eingeben!");
    document.Formular.Location.focus();
    return false;
  }
  
  if (document.Formular.Street.value == "") {
    alert("Bitte Ihre Strasse eingeben!");
    document.Formular.Street.focus();
    return false;
  }
  
  if (document.Formular.StreetNumber.value == "") {
    alert("Bitte Ihre Strassennummer eingeben!");
    document.Formular.StreetNumber.focus();
    return false;
  }
  
  if (document.Formular.Mail.value == "") {
    alert("Bitte Ihre E-Mail eingeben!");
    document.Formular.Mail.focus();
    return false;
  }
  
  if (document.Formular.Mail.value.indexOf('@') == -1){
    alert("Bitte geben Sie Ihre richtige E-Mail-Adresse ein!");
    document.Formular.Mail.focus();
    return false;
  }
}

function chkFormularSong() {
  if (document.Formular.titel.value == "") {
    alert("Bitte Titel eingeben!");
    document.Formular.titel.focus();
    return false;
  }
  
   if (document.Formular.artistId.value == "") {
    alert("Bitte ArtistId eingeben!");
    document.Formular.artistId.focus();
    return false;
  }
  
  if (document.Formular.songFile.value == "") {
    alert("Bitte wählen Sie ein Datei aus!");
    document.Formular.songFile.focus();
    return false;
  }
}

function chkFormularArtist() {
  if (document.Formular.Firstname.value == "") {
    alert("Bitte Vorname eingeben!");
    document.Formular.Firstname.focus();
    return false;
  }
  
   if (document.Formular.Lastname.value == "") {
    alert("Bitte Nachnamen eingeben!");
    document.Formular.Lastname.focus();
    return false;
  }
  
  if (document.Formular.Alias.value == "") {
    alert("Bitte Alias eingeben!");
    document.Formular.Alias.focus();
    return false;
  }
  
   if (document.Formular.CountryId.value == "") {
    alert("Bitte CountryId eingeben!");
    document.Formular.CountryId.focus();
    return false;
  }
  
   if (document.Formular.CountryId.value != "1" && document.Formular.CountryId.value != "2" && document.Formular.CountryId.value && "3" ) {
    alert("Die CountryId muss zwischen 1 und 3 liegen!");
    document.Formular.CountryId.focus();
    return false;
  }
  
}
