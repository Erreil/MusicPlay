
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
object aplogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/main("Admin Panel Login")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
	"""),format.raw/*4.2*/("""<div>
		<div class="panel panel-default">
		  <div class="panel-body">
			<div class="navbar-form">
				<h2><span class="label label-danger">Admin Panel</span></h2>
			</div>

					"""),_display_(/*11.7*/helper/*11.13*/.form(routes.Application.authenticateAdmin)/*11.56*/ {_display_(Seq[Any](format.raw/*11.58*/("""
						"""),format.raw/*12.7*/("""<input type="text" class="form-control" placeholder="Benutzer" name="Username" id="Username" value=""""),_display_(/*12.108*/loginForm("username")/*12.129*/.value),format.raw/*12.135*/("""" />
						<input type="text" class="form-control" placeholder="Passwort" name="Password" id="Password" />
						<button type="submit" class="btn btn-primary">Anmelden</button>
					""")))}),format.raw/*15.7*/("""
							
			"""),_display_(/*17.5*/if(loginForm.hasGlobalErrors)/*17.34*/ {_display_(Seq[Any](format.raw/*17.36*/("""
		    """),format.raw/*18.7*/("""<p style="color:red"> """),_display_(/*18.30*/loginForm/*18.39*/.globalError.message),format.raw/*18.59*/("""</p>
			""")))}),format.raw/*19.5*/("""
			        
		"""),format.raw/*21.3*/("""</div>
	</div>
""")))}))}
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jan 11 20:36:21 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aplogin.scala.html
                  HASH: 58a4f43af3e29f232de9949c7cb960494171f7af
                  MATRIX: 730->1|842->25|872->30|905->55|943->56|972->59|1187->248|1202->254|1254->297|1294->299|1329->307|1458->408|1489->429|1517->435|1733->621|1774->636|1812->665|1852->667|1887->675|1937->698|1955->707|1996->727|2036->737|2080->754
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|43->15|45->17|45->17|45->17|46->18|46->18|46->18|46->18|47->19|49->21
                  -- GENERATED --
              */
          