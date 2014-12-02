// @SOURCE:C:/FH2/Web_Projekt/musicplay/conf/routes
// @HASH:41f11e9edbcf47488e26087a36488ce5ec589cdf
// @DATE:Sun Nov 30 21:06:39 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:12
def apaddartist(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddartist")
}
                        

// @LINE:13
def showTopTen(country:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("country", dynamicString(country)))
}
                        

// @LINE:7
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:10
def apaddsong(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apaddsong")
}
                        

// @LINE:11
def apusermanagement(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "apusermanagement")
}
                        

// @LINE:9
def aplogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aplogin")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:8
def adminpanel(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

}
                          
}
                  


// @LINE:17
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

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:12
def apaddartist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apaddartist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddartist"})
      }
   """
)
                        

// @LINE:13
def showTopTen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showTopTen",
   """
      function(country) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country))})
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
                        

// @LINE:10
def apaddsong : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apaddsong",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apaddsong"})
      }
   """
)
                        

// @LINE:11
def apusermanagement : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.apusermanagement",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apusermanagement"})
      }
   """
)
                        

// @LINE:9
def aplogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aplogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aplogin"})
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
                        

// @LINE:8
def adminpanel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adminpanel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

}
              
}
        


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:12
def apaddartist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apaddartist(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddartist", Seq(), "GET", """""", _prefix + """apaddartist""")
)
                      

// @LINE:13
def showTopTen(country:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showTopTen(country), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showTopTen", Seq(classOf[String]), "GET", """""", _prefix + """$country<[^/]+>""")
)
                      

// @LINE:7
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:10
def apaddsong(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apaddsong(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apaddsong", Seq(), "GET", """""", _prefix + """apaddsong""")
)
                      

// @LINE:11
def apusermanagement(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.apusermanagement(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "apusermanagement", Seq(), "GET", """""", _prefix + """apusermanagement""")
)
                      

// @LINE:9
def aplogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aplogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aplogin", Seq(), "GET", """""", _prefix + """aplogin""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def adminpanel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adminpanel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adminpanel", Seq(), "GET", """""", _prefix + """admin""")
)
                      

}
                          
}
        
    