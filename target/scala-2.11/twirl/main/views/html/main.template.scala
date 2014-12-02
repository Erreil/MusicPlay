
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta charset="UTF-8"/>
		<meta name="description" content="Page to play music" />
		<meta name="keywords" content="musik, music, play" />
		<meta name="author" content="Inan �d�nc, Erik Reil" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png")),format.raw/*15.97*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*16.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*17.67*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""
		
		"""),format.raw/*22.3*/("""<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
		<script src="js/bootstrap.min.js"></script>
    </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 16:07:46 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/main.scala.html
                  HASH: 36a2b82900791d99f3eae925a0208f51b82185f4
                  MATRIX: 727->1|845->31|875->35|956->90|981->95|1408->495|1423->501|1488->544|1577->606|1592->612|1645->644|1698->670|1713->676|1779->721|1864->779|1879->785|1938->823|2035->893|2063->900|2098->908
                  LINES: 26->1|29->1|31->3|35->7|35->7|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|50->22
                  -- GENERATED --
              */
          