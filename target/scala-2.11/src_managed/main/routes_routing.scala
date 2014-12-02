// @SOURCE:C:/FH2/Web_Projekt/musicplay/conf/routes
// @HASH:41f11e9edbcf47488e26087a36488ce5ec589cdf
// @DATE:Sun Nov 30 21:06:39 CET 2014


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
private[this] lazy val controllers_Application_adminpanel2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Application_adminpanel2_invoker = createInvoker(
controllers.Application.adminpanel(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adminpanel", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:9
private[this] lazy val controllers_Application_aplogin3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aplogin"))))
private[this] lazy val controllers_Application_aplogin3_invoker = createInvoker(
controllers.Application.aplogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aplogin", Nil,"GET", """""", Routes.prefix + """aplogin"""))
        

// @LINE:10
private[this] lazy val controllers_Application_apaddsong4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddsong"))))
private[this] lazy val controllers_Application_apaddsong4_invoker = createInvoker(
controllers.Application.apaddsong(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddsong", Nil,"GET", """""", Routes.prefix + """apaddsong"""))
        

// @LINE:11
private[this] lazy val controllers_Application_apusermanagement5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apusermanagement"))))
private[this] lazy val controllers_Application_apusermanagement5_invoker = createInvoker(
controllers.Application.apusermanagement(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apusermanagement", Nil,"GET", """""", Routes.prefix + """apusermanagement"""))
        

// @LINE:12
private[this] lazy val controllers_Application_apaddartist6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("apaddartist"))))
private[this] lazy val controllers_Application_apaddartist6_invoker = createInvoker(
controllers.Application.apaddartist(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddartist", Nil,"GET", """""", Routes.prefix + """apaddartist"""))
        

// @LINE:13
private[this] lazy val controllers_Application_showTopTen7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("country", """[^/]+""",true))))
private[this] lazy val controllers_Application_showTopTen7_invoker = createInvoker(
controllers.Application.showTopTen(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showTopTen", Seq(classOf[String]),"GET", """""", Routes.prefix + """$country<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.adminpanel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aplogin""","""controllers.Application.aplogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddsong""","""controllers.Application.apaddsong()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apusermanagement""","""controllers.Application.apusermanagement()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """apaddartist""","""controllers.Application.apaddartist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$country<[^/]+>""","""controllers.Application.showTopTen(country:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_adminpanel2_route(params) => {
   call { 
        controllers_Application_adminpanel2_invoker.call(controllers.Application.adminpanel())
   }
}
        

// @LINE:9
case controllers_Application_aplogin3_route(params) => {
   call { 
        controllers_Application_aplogin3_invoker.call(controllers.Application.aplogin())
   }
}
        

// @LINE:10
case controllers_Application_apaddsong4_route(params) => {
   call { 
        controllers_Application_apaddsong4_invoker.call(controllers.Application.apaddsong())
   }
}
        

// @LINE:11
case controllers_Application_apusermanagement5_route(params) => {
   call { 
        controllers_Application_apusermanagement5_invoker.call(controllers.Application.apusermanagement())
   }
}
        

// @LINE:12
case controllers_Application_apaddartist6_route(params) => {
   call { 
        controllers_Application_apaddartist6_invoker.call(controllers.Application.apaddartist())
   }
}
        

// @LINE:13
case controllers_Application_showTopTen7_route(params) => {
   call(params.fromPath[String]("country", None)) { (country) =>
        controllers_Application_showTopTen7_invoker.call(controllers.Application.showTopTen(country))
   }
}
        

// @LINE:17
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     