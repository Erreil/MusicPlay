
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
		<meta name="author" content="Inan Ödunc, Erik Reil" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script src=""""),_display_(/*14.17*/routes/*14.23*/.Assets.at("javascripts/jquery-1.11.1.min.js")),format.raw/*14.69*/("""" type="text/javascript"></script>
		<link rel="stylesheet" media="screen" href=""""),_display_(/*15.48*/routes/*15.54*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*15.97*/("""">
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("javascripts/bootstrap.js")),format.raw/*16.63*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("javascripts/Script.js")),format.raw/*17.60*/("""" type="text/javascript"></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.at("images/favicon.png")),format.raw/*18.93*/("""">
    
    <style type="text/css">
			body """),format.raw/*21.9*/("""{"""),format.raw/*21.10*/("""
  			"""),format.raw/*22.6*/("""background-color: #BEC1C8;
			"""),format.raw/*23.4*/("""}"""),format.raw/*23.5*/("""
"""),format.raw/*24.1*/("""</style>
    
    </head>
    <body>
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
		
		"""),format.raw/*30.3*/("""<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*33.65*/(""""></script>
    </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 22 20:11:34 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/Master/MusicPlay/app/views/main.scala.html
                  HASH: f51624b3ed6fde54e22ff1fecd3398d12801c193
                  MATRIX: 727->1|845->31|875->35|956->90|981->95|1368->455|1383->461|1450->507|1560->590|1575->596|1639->639|1688->661|1703->667|1762->705|1843->759|1858->765|1914->800|2031->890|2046->896|2099->928|2173->975|2202->976|2236->983|2294->1014|2322->1015|2351->1017|2428->1067|2456->1074|2491->1082|2814->1378|2829->1384|2892->1426
                  LINES: 26->1|29->1|31->3|35->7|35->7|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|50->22|51->23|51->23|52->24|56->28|56->28|58->30|61->33|61->33|61->33
                  -- GENERATED --
              */
          