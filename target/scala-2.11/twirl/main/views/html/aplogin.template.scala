
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

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
	"""),format.raw/*4.2*/("""<div>
		<div class="panel panel-default">
		  <div class="panel-body">
			<div class="navbar-form">
			</div>

					"""),_display_(/*10.7*/helper/*10.13*/.form(routes.Application.authenticateAdmin, 'class -> "navbar-form navbar-left")/*10.93*/ {_display_(Seq[Any](format.raw/*10.95*/("""
						"""),format.raw/*11.7*/("""<div class="form-group">
						<input type="text" class="form-control" placeholder="Benutzer" name="Username" id="Username" value=""""),_display_(/*12.108*/loginForm("username")/*12.129*/.value),format.raw/*12.135*/("""" />
						<input type="password" class="form-control" placeholder="Passwort" name="Password" id="Password" />
						<button type="submit" class="btn btn-primary">Anmelden</button>
						
						"""),_display_(/*16.8*/if(loginForm.hasGlobalErrors)/*16.37*/ {_display_(Seq[Any](format.raw/*16.39*/("""
		    			"""),format.raw/*17.10*/("""<p style="color:red"> """),_display_(/*17.33*/loginForm/*17.42*/.globalError.message),format.raw/*17.62*/("""</p>
						""")))}),format.raw/*18.8*/("""
						"""),format.raw/*19.7*/("""</div>
					""")))}),format.raw/*20.7*/("""
							

			        
		"""),format.raw/*24.3*/("""</div>
	</div>
""")))}))}
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 22 20:11:34 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/Master/MusicPlay/app/views/aplogin.scala.html
                  HASH: 920e555faea8a7a68fbbcade2ef5e4a9715388ec
                  MATRIX: 730->1|842->25|872->30|893->43|931->44|960->47|1109->170|1124->176|1213->256|1253->258|1288->266|1449->399|1480->420|1508->426|1733->625|1771->654|1811->656|1850->667|1900->690|1918->699|1959->719|2002->732|2037->740|2081->754|2136->782
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|38->10|38->10|38->10|38->10|39->11|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|47->19|48->20|52->24
                  -- GENERATED --
              */
          