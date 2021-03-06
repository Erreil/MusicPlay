// @SOURCE:C:/FH2/Web_Projekt/Master/MusicPlay/conf/routes
// @HASH:671619afd0e8e5c51cfe95dab75d929e67d5dbaf
// @DATE:Thu Jan 22 20:42:34 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:41
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:41
class ReverseAssets {


// @LINE:41
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def aprankmanagement(country:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aprankmanagement/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)))
}
                        

// @LINE:35
def addToFavorites(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addToFavorites/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:25
def deleteArtist(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "apaddartist/deleteArtist/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:17
def newSong(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "apaddsong/newSong")
}
                        

// @LINE:22
def apaddartist(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddartist")
}
                        

// @LINE:29
def updateRankingUk(parameter:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aprankmanagement/uk/updateRanking/" + implicitly[PathBindable[String]].unbind("parameter", dynamicString(parameter)))
}
                        

// @LINE:36
def getMySongs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mySongs")
}
                        

// @LINE:14
def logoutUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:31
def showTopTen(country:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "topten/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)))
}
                        

// @LINE:13
def authenticateUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:20
def getUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apusermanagement/users")
}
                        

// @LINE:16
def getSongs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddsong/songs")
}
                        

// @LINE:7
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:11
def authenticateAdmin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aplogin")
}
                        

// @LINE:15
def apaddsong(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddsong")
}
                        

// @LINE:12
def logoutAdmin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aplogout")
}
                        

// @LINE:19
def apusermanagement(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apusermanagement")
}
                        

// @LINE:10
def aplogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aplogin")
}
                        

// @LINE:30
def getSongRankings(country:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aprankmanagement/songRankings/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)))
}
                        

// @LINE:33
def songsBySearch(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:32
def songsByArtist(artist:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "artist/" + implicitly[PathBindable[String]].unbind("artist", dynamicString(artist)))
}
                        

// @LINE:24
def getArtists(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddartist/artists")
}
                        

// @LINE:27
def updateRankingEu(parameter:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aprankmanagement/eu/updateRanking/" + implicitly[PathBindable[String]].unbind("parameter", dynamicString(parameter)))
}
                        

// @LINE:34
def searchResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchResult")
}
                        

// @LINE:8
def newUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup/newUser")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def adminpanel(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:28
def updateRankingUsa(parameter:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aprankmanagement/usa/updateRanking/" + implicitly[PathBindable[String]].unbind("parameter", dynamicString(parameter)))
}
                        

// @LINE:18
def deleteSong(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "apaddsong/deleteSong/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:21
def deleteUser(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "apusermanagement/deleteUser/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:23
def newArtist(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "apaddartist/newArtist")
}
                        

}
                          
}
                  


// @LINE:41
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:41
class ReverseAssets {


// @LINE:41
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def aprankmanagement : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aprankmanagement",
   """
      function(country) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aprankmanagement/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country))})
      }
   """
)
                        

// @LINE:35
def addToFavorites : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addToFavorites",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addToFavorites/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def deleteArtist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteArtist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddartist/deleteArtist/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def newSong : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newSong",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddsong/newSong"})
      }
   """
)
                        

// @LINE:22
def apaddartist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apaddartist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddartist"})
      }
   """
)
                        

// @LINE:29
def updateRankingUk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRankingUk",
   """
      function(parameter) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aprankmanagement/uk/updateRanking/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("parameter", encodeURIComponent(parameter))})
      }
   """
)
                        

// @LINE:36
def getMySongs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getMySongs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mySongs"})
      }
   """
)
                        

// @LINE:14
def logoutUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logoutUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:31
def showTopTen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showTopTen",
   """
      function(country) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topten/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country))})
      }
   """
)
                        

// @LINE:13
def authenticateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticateUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:20
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apusermanagement/users"})
      }
   """
)
                        

// @LINE:16
def getSongs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getSongs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddsong/songs"})
      }
   """
)
                        

// @LINE:7
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:11
def authenticateAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticateAdmin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aplogin"})
      }
   """
)
                        

// @LINE:15
def apaddsong : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apaddsong",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddsong"})
      }
   """
)
                        

// @LINE:12
def logoutAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logoutAdmin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aplogout"})
      }
   """
)
                        

// @LINE:19
def apusermanagement : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apusermanagement",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apusermanagement"})
      }
   """
)
                        

// @LINE:10
def aplogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aplogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aplogin"})
      }
   """
)
                        

// @LINE:30
def getSongRankings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getSongRankings",
   """
      function(country) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aprankmanagement/songRankings/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country))})
      }
   """
)
                        

// @LINE:33
def songsBySearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.songsBySearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:32
def songsByArtist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.songsByArtist",
   """
      function(artist) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("artist", encodeURIComponent(artist))})
      }
   """
)
                        

// @LINE:24
def getArtists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getArtists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddartist/artists"})
      }
   """
)
                        

// @LINE:27
def updateRankingEu : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRankingEu",
   """
      function(parameter) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aprankmanagement/eu/updateRanking/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("parameter", encodeURIComponent(parameter))})
      }
   """
)
                        

// @LINE:34
def searchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchResult"})
      }
   """
)
                        

// @LINE:8
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/newUser"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def adminpanel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adminpanel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:28
def updateRankingUsa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRankingUsa",
   """
      function(parameter) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aprankmanagement/usa/updateRanking/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("parameter", encodeURIComponent(parameter))})
      }
   """
)
                        

// @LINE:18
def deleteSong : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteSong",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddsong/deleteSong/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUser",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apusermanagement/deleteUser/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def newArtist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newArtist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddartist/newArtist"})
      }
   """
)
                        

}
              
}
        


// @LINE:41
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:41
class ReverseAssets {


// @LINE:41
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def aprankmanagement(country:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aprankmanagement(country), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aprankmanagement", Seq(classOf[String]), "GET", """""", _prefix + """aprankmanagement/$country<[^/]+>""")
)
                      

// @LINE:35
def addToFavorites(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addToFavorites(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addToFavorites", Seq(classOf[Integer]), "POST", """""", _prefix + """addToFavorites/$id<[^/]+>""")
)
                      

// @LINE:25
def deleteArtist(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteArtist(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteArtist", Seq(classOf[Integer]), "POST", """""", _prefix + """apaddartist/deleteArtist/$id<[^/]+>""")
)
                      

// @LINE:17
def newSong(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newSong(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newSong", Seq(), "POST", """""", _prefix + """apaddsong/newSong""")
)
                      

// @LINE:22
def apaddartist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apaddartist(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddartist", Seq(), "GET", """""", _prefix + """apaddartist""")
)
                      

// @LINE:29
def updateRankingUk(parameter:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRankingUk(parameter), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingUk", Seq(classOf[String]), "POST", """""", _prefix + """aprankmanagement/uk/updateRanking/$parameter<[^/]+>""")
)
                      

// @LINE:36
def getMySongs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getMySongs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getMySongs", Seq(), "GET", """""", _prefix + """mySongs""")
)
                      

// @LINE:14
def logoutUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logoutUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logoutUser", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:31
def showTopTen(country:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showTopTen(country), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showTopTen", Seq(classOf[String]), "GET", """""", _prefix + """topten/$country<[^/]+>""")
)
                      

// @LINE:13
def authenticateUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticateUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticateUser", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:20
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUsers", Seq(), "GET", """""", _prefix + """apusermanagement/users""")
)
                      

// @LINE:16
def getSongs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getSongs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getSongs", Seq(), "GET", """""", _prefix + """apaddsong/songs""")
)
                      

// @LINE:7
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:11
def authenticateAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticateAdmin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticateAdmin", Seq(), "POST", """""", _prefix + """aplogin""")
)
                      

// @LINE:15
def apaddsong(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apaddsong(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddsong", Seq(), "GET", """""", _prefix + """apaddsong""")
)
                      

// @LINE:12
def logoutAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logoutAdmin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logoutAdmin", Seq(), "GET", """""", _prefix + """aplogout""")
)
                      

// @LINE:19
def apusermanagement(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apusermanagement(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apusermanagement", Seq(), "GET", """""", _prefix + """apusermanagement""")
)
                      

// @LINE:10
def aplogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aplogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aplogin", Seq(), "GET", """""", _prefix + """aplogin""")
)
                      

// @LINE:30
def getSongRankings(country:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getSongRankings(country), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getSongRankings", Seq(classOf[String]), "GET", """""", _prefix + """aprankmanagement/songRankings/$country<[^/]+>""")
)
                      

// @LINE:33
def songsBySearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.songsBySearch(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "songsBySearch", Seq(), "GET", """""", _prefix + """search""")
)
                      

// @LINE:32
def songsByArtist(artist:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.songsByArtist(artist), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "songsByArtist", Seq(classOf[String]), "GET", """""", _prefix + """artist/$artist<[^/]+>""")
)
                      

// @LINE:24
def getArtists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getArtists(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getArtists", Seq(), "GET", """""", _prefix + """apaddartist/artists""")
)
                      

// @LINE:27
def updateRankingEu(parameter:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRankingEu(parameter), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingEu", Seq(classOf[String]), "POST", """""", _prefix + """aprankmanagement/eu/updateRanking/$parameter<[^/]+>""")
)
                      

// @LINE:34
def searchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchResult", Seq(), "GET", """""", _prefix + """searchResult""")
)
                      

// @LINE:8
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newUser", Seq(), "POST", """""", _prefix + """signup/newUser""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def adminpanel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adminpanel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adminpanel", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:28
def updateRankingUsa(parameter:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRankingUsa(parameter), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingUsa", Seq(classOf[String]), "POST", """""", _prefix + """aprankmanagement/usa/updateRanking/$parameter<[^/]+>""")
)
                      

// @LINE:18
def deleteSong(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteSong(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteSong", Seq(classOf[Integer]), "POST", """""", _prefix + """apaddsong/deleteSong/$id<[^/]+>""")
)
                      

// @LINE:21
def deleteUser(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUser", Seq(classOf[Integer]), "POST", """""", _prefix + """apusermanagement/deleteUser/$id<[^/]+>""")
)
                      

// @LINE:23
def newArtist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newArtist(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newArtist", Seq(), "POST", """""", _prefix + """apaddartist/newArtist""")
)
                      

}
                          
}
        
    