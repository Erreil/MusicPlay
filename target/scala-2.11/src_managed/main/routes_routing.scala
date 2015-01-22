// @SOURCE:C:/FH2/Web_Projekt/Master/MusicPlay/conf/routes
// @HASH:6463c33b048981dbe53196ee4a4c6dc4fb063518
// @DATE:Thu Jan 22 20:11:32 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_signup1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signup1_invoker = createInvoker(
controllers.Application.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:8
private[this] lazy val controllers_Application_newUser2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/newUser"))))
private[this] lazy val controllers_Application_newUser2_invoker = createInvoker(
controllers.Application.newUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newUser", Nil,"POST", """""", Routes.prefix + """signup/newUser"""))
        

// @LINE:9
private[this] lazy val controllers_Application_adminpanel3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Application_adminpanel3_invoker = createInvoker(
controllers.Application.adminpanel(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adminpanel", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:10
private[this] lazy val controllers_Application_aplogin4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aplogin"))))
private[this] lazy val controllers_Application_aplogin4_invoker = createInvoker(
controllers.Application.aplogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aplogin", Nil,"GET", """""", Routes.prefix + """aplogin"""))
        

// @LINE:11
private[this] lazy val controllers_Application_authenticateAdmin5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aplogin"))))
private[this] lazy val controllers_Application_authenticateAdmin5_invoker = createInvoker(
controllers.Application.authenticateAdmin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticateAdmin", Nil,"POST", """""", Routes.prefix + """aplogin"""))
        

// @LINE:12
private[this] lazy val controllers_Application_logoutAdmin6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aplogout"))))
private[this] lazy val controllers_Application_logoutAdmin6_invoker = createInvoker(
controllers.Application.logoutAdmin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logoutAdmin", Nil,"GET", """""", Routes.prefix + """aplogout"""))
        

// @LINE:13
private[this] lazy val controllers_Application_authenticateUser7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_authenticateUser7_invoker = createInvoker(
controllers.Application.authenticateUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticateUser", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:14
private[this] lazy val controllers_Application_logoutUser8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logoutUser8_invoker = createInvoker(
controllers.Application.logoutUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logoutUser", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:15
private[this] lazy val controllers_Application_apaddsong9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddsong"))))
private[this] lazy val controllers_Application_apaddsong9_invoker = createInvoker(
controllers.Application.apaddsong(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddsong", Nil,"GET", """""", Routes.prefix + """apaddsong"""))
        

// @LINE:16
private[this] lazy val controllers_Application_getSongs10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddsong/songs"))))
private[this] lazy val controllers_Application_getSongs10_invoker = createInvoker(
controllers.Application.getSongs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getSongs", Nil,"GET", """""", Routes.prefix + """apaddsong/songs"""))
        

// @LINE:17
private[this] lazy val controllers_Application_newSong11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddsong/newSong"))))
private[this] lazy val controllers_Application_newSong11_invoker = createInvoker(
controllers.Application.newSong(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newSong", Nil,"POST", """""", Routes.prefix + """apaddsong/newSong"""))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteSong12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddsong/deleteSong/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteSong12_invoker = createInvoker(
controllers.Application.deleteSong(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteSong", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """apaddsong/deleteSong/$id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Application_apusermanagement13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apusermanagement"))))
private[this] lazy val controllers_Application_apusermanagement13_invoker = createInvoker(
controllers.Application.apusermanagement(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apusermanagement", Nil,"GET", """""", Routes.prefix + """apusermanagement"""))
        

// @LINE:20
private[this] lazy val controllers_Application_getUsers14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apusermanagement/users"))))
private[this] lazy val controllers_Application_getUsers14_invoker = createInvoker(
controllers.Application.getUsers(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUsers", Nil,"GET", """""", Routes.prefix + """apusermanagement/users"""))
        

// @LINE:21
private[this] lazy val controllers_Application_deleteUser15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apusermanagement/deleteUser/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteUser15_invoker = createInvoker(
controllers.Application.deleteUser(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUser", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """apusermanagement/deleteUser/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_Application_apaddartist16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddartist"))))
private[this] lazy val controllers_Application_apaddartist16_invoker = createInvoker(
controllers.Application.apaddartist(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddartist", Nil,"GET", """""", Routes.prefix + """apaddartist"""))
        

// @LINE:23
private[this] lazy val controllers_Application_newArtist17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddartist/newArtist"))))
private[this] lazy val controllers_Application_newArtist17_invoker = createInvoker(
controllers.Application.newArtist(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newArtist", Nil,"GET", """""", Routes.prefix + """apaddartist/newArtist"""))
        

// @LINE:24
private[this] lazy val controllers_Application_getArtists18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddartist/artists"))))
private[this] lazy val controllers_Application_getArtists18_invoker = createInvoker(
controllers.Application.getArtists(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getArtists", Nil,"GET", """""", Routes.prefix + """apaddartist/artists"""))
        

// @LINE:25
private[this] lazy val controllers_Application_deleteArtist19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddartist/deleteArtist/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteArtist19_invoker = createInvoker(
controllers.Application.deleteArtist(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteArtist", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """apaddartist/deleteArtist/$id<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_Application_aprankmanagement20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aprankmanagement/"),DynamicPart("country", """[^/]+""",true))))
private[this] lazy val controllers_Application_aprankmanagement20_invoker = createInvoker(
controllers.Application.aprankmanagement(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aprankmanagement", Seq(classOf[String]),"GET", """""", Routes.prefix + """aprankmanagement/$country<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_Application_updateRankingEu21_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aprankmanagement/eu/updateRanking/"),DynamicPart("parameter", """[^/]+""",true))))
private[this] lazy val controllers_Application_updateRankingEu21_invoker = createInvoker(
controllers.Application.updateRankingEu(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingEu", Seq(classOf[String]),"POST", """""", Routes.prefix + """aprankmanagement/eu/updateRanking/$parameter<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_Application_updateRankingUsa22_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aprankmanagement/usa/updateRanking/"),DynamicPart("parameter", """[^/]+""",true))))
private[this] lazy val controllers_Application_updateRankingUsa22_invoker = createInvoker(
controllers.Application.updateRankingUsa(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingUsa", Seq(classOf[String]),"POST", """""", Routes.prefix + """aprankmanagement/usa/updateRanking/$parameter<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_Application_updateRankingUk23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aprankmanagement/uk/updateRanking/"),DynamicPart("parameter", """[^/]+""",true))))
private[this] lazy val controllers_Application_updateRankingUk23_invoker = createInvoker(
controllers.Application.updateRankingUk(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRankingUk", Seq(classOf[String]),"POST", """""", Routes.prefix + """aprankmanagement/uk/updateRanking/$parameter<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_Application_getSongRankings24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aprankmanagement/songRankings/"),DynamicPart("country", """[^/]+""",true))))
private[this] lazy val controllers_Application_getSongRankings24_invoker = createInvoker(
controllers.Application.getSongRankings(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getSongRankings", Seq(classOf[String]),"GET", """""", Routes.prefix + """aprankmanagement/songRankings/$country<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_Application_showTopTen25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("topten/"),DynamicPart("country", """[^/]+""",true))))
private[this] lazy val controllers_Application_showTopTen25_invoker = createInvoker(
controllers.Application.showTopTen(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showTopTen", Seq(classOf[String]),"GET", """""", Routes.prefix + """topten/$country<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_Application_songsByArtist26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("artist/"),DynamicPart("artist", """[^/]+""",true))))
private[this] lazy val controllers_Application_songsByArtist26_invoker = createInvoker(
controllers.Application.songsByArtist(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "songsByArtist", Seq(classOf[String]),"GET", """""", Routes.prefix + """artist/$artist<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_Application_songsBySearch27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_songsBySearch27_invoker = createInvoker(
controllers.Application.songsBySearch(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "songsBySearch", Nil,"GET", """""", Routes.prefix + """search"""))
        

// @LINE:34
private[this] lazy val controllers_Application_searchResult28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchResult"))))
private[this] lazy val controllers_Application_searchResult28_invoker = createInvoker(
controllers.Application.searchResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "searchResult", Nil,"GET", """""", Routes.prefix + """searchResult"""))
        

// @LINE:35
private[this] lazy val controllers_Application_addToFavorites29_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addToFavorites/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_addToFavorites29_invoker = createInvoker(
controllers.Application.addToFavorites(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addToFavorites", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """addToFavorites/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_Application_getMySongs30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mySongs"))))
private[this] lazy val controllers_Application_getMySongs30_invoker = createInvoker(
controllers.Application.getMySongs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getMySongs", Nil,"GET", """""", Routes.prefix + """mySongs"""))
        

// @LINE:41
private[this] lazy val controllers_Assets_at31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at31_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/newUser""","""controllers.Application.newUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.adminpanel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aplogin""","""controllers.Application.aplogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aplogin""","""controllers.Application.authenticateAdmin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aplogout""","""controllers.Application.logoutAdmin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticateUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logoutUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddsong""","""controllers.Application.apaddsong()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddsong/songs""","""controllers.Application.getSongs()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddsong/newSong""","""controllers.Application.newSong()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddsong/deleteSong/$id<[^/]+>""","""controllers.Application.deleteSong(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apusermanagement""","""controllers.Application.apusermanagement()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apusermanagement/users""","""controllers.Application.getUsers()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apusermanagement/deleteUser/$id<[^/]+>""","""controllers.Application.deleteUser(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddartist""","""controllers.Application.apaddartist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddartist/newArtist""","""controllers.Application.newArtist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddartist/artists""","""controllers.Application.getArtists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddartist/deleteArtist/$id<[^/]+>""","""controllers.Application.deleteArtist(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aprankmanagement/$country<[^/]+>""","""controllers.Application.aprankmanagement(country:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aprankmanagement/eu/updateRanking/$parameter<[^/]+>""","""controllers.Application.updateRankingEu(parameter:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aprankmanagement/usa/updateRanking/$parameter<[^/]+>""","""controllers.Application.updateRankingUsa(parameter:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aprankmanagement/uk/updateRanking/$parameter<[^/]+>""","""controllers.Application.updateRankingUk(parameter:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aprankmanagement/songRankings/$country<[^/]+>""","""controllers.Application.getSongRankings(country:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """topten/$country<[^/]+>""","""controllers.Application.showTopTen(country:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """artist/$artist<[^/]+>""","""controllers.Application.songsByArtist(artist:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.songsBySearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchResult""","""controllers.Application.searchResult()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addToFavorites/$id<[^/]+>""","""controllers.Application.addToFavorites(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mySongs""","""controllers.Application.getMySongs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_signup1_route(params) => {
   call { 
        controllers_Application_signup1_invoker.call(controllers.Application.signup())
   }
}
        

// @LINE:8
case controllers_Application_newUser2_route(params) => {
   call { 
        controllers_Application_newUser2_invoker.call(controllers.Application.newUser())
   }
}
        

// @LINE:9
case controllers_Application_adminpanel3_route(params) => {
   call { 
        controllers_Application_adminpanel3_invoker.call(controllers.Application.adminpanel())
   }
}
        

// @LINE:10
case controllers_Application_aplogin4_route(params) => {
   call { 
        controllers_Application_aplogin4_invoker.call(controllers.Application.aplogin())
   }
}
        

// @LINE:11
case controllers_Application_authenticateAdmin5_route(params) => {
   call { 
        controllers_Application_authenticateAdmin5_invoker.call(controllers.Application.authenticateAdmin())
   }
}
        

// @LINE:12
case controllers_Application_logoutAdmin6_route(params) => {
   call { 
        controllers_Application_logoutAdmin6_invoker.call(controllers.Application.logoutAdmin())
   }
}
        

// @LINE:13
case controllers_Application_authenticateUser7_route(params) => {
   call { 
        controllers_Application_authenticateUser7_invoker.call(controllers.Application.authenticateUser())
   }
}
        

// @LINE:14
case controllers_Application_logoutUser8_route(params) => {
   call { 
        controllers_Application_logoutUser8_invoker.call(controllers.Application.logoutUser())
   }
}
        

// @LINE:15
case controllers_Application_apaddsong9_route(params) => {
   call { 
        controllers_Application_apaddsong9_invoker.call(controllers.Application.apaddsong())
   }
}
        

// @LINE:16
case controllers_Application_getSongs10_route(params) => {
   call { 
        controllers_Application_getSongs10_invoker.call(controllers.Application.getSongs())
   }
}
        

// @LINE:17
case controllers_Application_newSong11_route(params) => {
   call { 
        controllers_Application_newSong11_invoker.call(controllers.Application.newSong())
   }
}
        

// @LINE:18
case controllers_Application_deleteSong12_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteSong12_invoker.call(controllers.Application.deleteSong(id))
   }
}
        

// @LINE:19
case controllers_Application_apusermanagement13_route(params) => {
   call { 
        controllers_Application_apusermanagement13_invoker.call(controllers.Application.apusermanagement())
   }
}
        

// @LINE:20
case controllers_Application_getUsers14_route(params) => {
   call { 
        controllers_Application_getUsers14_invoker.call(controllers.Application.getUsers())
   }
}
        

// @LINE:21
case controllers_Application_deleteUser15_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteUser15_invoker.call(controllers.Application.deleteUser(id))
   }
}
        

// @LINE:22
case controllers_Application_apaddartist16_route(params) => {
   call { 
        controllers_Application_apaddartist16_invoker.call(controllers.Application.apaddartist())
   }
}
        

// @LINE:23
case controllers_Application_newArtist17_route(params) => {
   call { 
        controllers_Application_newArtist17_invoker.call(controllers.Application.newArtist())
   }
}
        

// @LINE:24
case controllers_Application_getArtists18_route(params) => {
   call { 
        controllers_Application_getArtists18_invoker.call(controllers.Application.getArtists())
   }
}
        

// @LINE:25
case controllers_Application_deleteArtist19_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteArtist19_invoker.call(controllers.Application.deleteArtist(id))
   }
}
        

// @LINE:26
case controllers_Application_aprankmanagement20_route(params) => {
   call(params.fromPath[String]("country", None)) { (country) =>
        controllers_Application_aprankmanagement20_invoker.call(controllers.Application.aprankmanagement(country))
   }
}
        

// @LINE:27
case controllers_Application_updateRankingEu21_route(params) => {
   call(params.fromPath[String]("parameter", None)) { (parameter) =>
        controllers_Application_updateRankingEu21_invoker.call(controllers.Application.updateRankingEu(parameter))
   }
}
        

// @LINE:28
case controllers_Application_updateRankingUsa22_route(params) => {
   call(params.fromPath[String]("parameter", None)) { (parameter) =>
        controllers_Application_updateRankingUsa22_invoker.call(controllers.Application.updateRankingUsa(parameter))
   }
}
        

// @LINE:29
case controllers_Application_updateRankingUk23_route(params) => {
   call(params.fromPath[String]("parameter", None)) { (parameter) =>
        controllers_Application_updateRankingUk23_invoker.call(controllers.Application.updateRankingUk(parameter))
   }
}
        

// @LINE:30
case controllers_Application_getSongRankings24_route(params) => {
   call(params.fromPath[String]("country", None)) { (country) =>
        controllers_Application_getSongRankings24_invoker.call(controllers.Application.getSongRankings(country))
   }
}
        

// @LINE:31
case controllers_Application_showTopTen25_route(params) => {
   call(params.fromPath[String]("country", None)) { (country) =>
        controllers_Application_showTopTen25_invoker.call(controllers.Application.showTopTen(country))
   }
}
        

// @LINE:32
case controllers_Application_songsByArtist26_route(params) => {
   call(params.fromPath[String]("artist", None)) { (artist) =>
        controllers_Application_songsByArtist26_invoker.call(controllers.Application.songsByArtist(artist))
   }
}
        

// @LINE:33
case controllers_Application_songsBySearch27_route(params) => {
   call { 
        controllers_Application_songsBySearch27_invoker.call(controllers.Application.songsBySearch())
   }
}
        

// @LINE:34
case controllers_Application_searchResult28_route(params) => {
   call { 
        controllers_Application_searchResult28_invoker.call(controllers.Application.searchResult())
   }
}
        

// @LINE:35
case controllers_Application_addToFavorites29_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_addToFavorites29_invoker.call(controllers.Application.addToFavorites(id))
   }
}
        

// @LINE:36
case controllers_Application_getMySongs30_route(params) => {
   call { 
        controllers_Application_getMySongs30_invoker.call(controllers.Application.getMySongs())
   }
}
        

// @LINE:41
case controllers_Assets_at31_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at31_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     