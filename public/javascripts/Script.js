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

function getArtists(){
	
	$("#artistTable > tbody").html("");
	
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){							
				var json = $.parseJSON(request.responseText);
				
				for (var i = 0; i < json.length; i++){
					
					var row = "<tr>";
					row += "<td>" + json[i]["id"] + "</td>";
					row += "<td>" + json[i]["alias"]["alias"] + "</td>";
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
	
	$("#songRankingTable > tbody").html("");
	
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200){							
				var json = $.parseJSON(request.responseText);
				
				for (var i = 0; i < json.length; i++){
					
					var row = "<tr>";
					row += "<td>" + json[i]["id"] + "</td>";
					row += "<td>" + json[i]["artist"]["alias"] + "</td>";
					row += "<td>" + json[i]["titel"] + "</td>";
					row += "<td><input id=\"input" + json[i]["id"] + "\"   type=\"number\" min=\"0\" max=\"10\" value=" + json[i]["rank"] + "></td>";
					row += "</tr>"
					
					$("#songRankingTable tbody").append(row);
				}
		}
	}
	
	var url = window.location.href;
	request.open("GET", url + "/songRankings", true);
	request.send();
}

function playMusic(link, titel){
	$("#songTitel").html(titel);
		
	$("#audioPlayer").html("<source src=\"" + link +"\" type=\"audio/mpeg\" />");
	
	var audio = $("#audioPlayer");
	audio.load();
	audio.play();
}
