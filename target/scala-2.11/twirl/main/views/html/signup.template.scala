
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("SignUp")/*6.16*/{_display_(Seq[Any](format.raw/*6.17*/("""
	"""),format.raw/*7.2*/("""<div>
	
		<!-- header -->
		<div class="panel panel-default">
		  <div class="panel-body">			
			<div class="navbar-form">
				<h2><span class="label label-primary">Sign Up</span></h2>
			</div>				
		  </div>
		</div>
		<!-- header -->
				
		<!-- Formular -->
		<div class="panel panel-default">
			<div class="panel-body">		
				<div class="panel panel-success">
					<div class="panel-heading">Bitte geben Sie folgenden Daten ein:</div>
					<div class="panel-body">
						"""),_display_(/*25.8*/helper/*25.14*/.form(action = routes.Application.newUser(), 'id -> "userForm")/*25.77*/{_display_(Seq[Any](format.raw/*25.78*/("""
						
						"""),_display_(/*27.8*/helper/*27.14*/.inputText(userForm("Username"))),format.raw/*27.46*/("""
						"""),_display_(/*28.8*/helper/*28.14*/.inputText(userForm("Password"))),format.raw/*28.46*/("""
						"""),_display_(/*29.8*/helper/*29.14*/.inputText(userForm("Firstname"))),format.raw/*29.47*/("""
						"""),_display_(/*30.8*/helper/*30.14*/.inputText(userForm("Lastname"))),format.raw/*30.46*/("""
						"""),_display_(/*31.8*/helper/*31.14*/.inputText(userForm("Zip"))),format.raw/*31.41*/("""
						"""),_display_(/*32.8*/helper/*32.14*/.inputText(userForm("Location"))),format.raw/*32.46*/("""
						"""),_display_(/*33.8*/helper/*33.14*/.inputText(userForm("Street"))),format.raw/*33.44*/("""
						"""),_display_(/*34.8*/helper/*34.14*/.inputText(userForm("StreetNumber"))),format.raw/*34.50*/("""
						"""),_display_(/*35.8*/helper/*35.14*/.inputText(userForm("Mail"))),format.raw/*35.42*/("""
						
						"""),format.raw/*37.7*/("""<input type="submit" value="Registrieren">
						""")))}),format.raw/*38.8*/("""
			
						
					"""),format.raw/*41.6*/("""</div>		
				</div>					
			</div>
		</div>
		<!-- Formular -->
	</div>
""")))}))}
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 08 21:56:13 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/signup.scala.html
                  HASH: ad669759b5cf8081d0fbc35943e2f17ee950b8c7
                  MATRIX: 728->1|886->23|916->80|944->83|966->97|1004->98|1033->101|1555->597|1570->603|1642->666|1681->667|1724->684|1739->690|1792->722|1827->731|1842->737|1895->769|1930->778|1945->784|1999->817|2034->826|2049->832|2102->864|2137->873|2152->879|2200->906|2235->915|2250->921|2303->953|2338->962|2353->968|2404->998|2439->1007|2454->1013|2511->1049|2546->1058|2561->1064|2610->1092|2653->1108|2734->1159|2781->1179
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|34->7|52->25|52->25|52->25|52->25|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|64->37|65->38|68->41
                  -- GENERATED --
              */
          