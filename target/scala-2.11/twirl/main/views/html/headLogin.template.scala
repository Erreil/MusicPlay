
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
object headlogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<div class="container-fluid">
	<div class="row">
		<div class="span12">
		
			<!-- panel -->
			<div class="panel panel-default">
				<div class="panel-body">
				
					<!-- search -->
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Artist/Titel" id="search" />
							<button type="submit" class="btn btn-default">Suchen</button>
						</div>
					</form>	
					<!-- search -->	

					<!-- login -->
							"""),_display_(/*21.9*/if(session.get("username") == null)/*21.44*/{_display_(Seq[Any](format.raw/*21.45*/("""
								"""),_display_(/*22.10*/helper/*22.16*/.form(routes.Application.authenticateUser, 'class -> "navbar-form navbar-right")/*22.96*/ {_display_(Seq[Any](format.raw/*22.98*/("""
									"""),format.raw/*23.10*/("""<div class="form-group">
										<input type="text" class="form-control" placeholder="Benutzer" id="Username" />
										<input type="text" class="form-control" placeholder="Passwort" id="Password" />
										<button type="submit" class="btn btn-primary">Anmelden</button>
									</div>
								""")))}),format.raw/*28.10*/("""
							""")))}/*29.9*/else/*29.13*/{_display_(Seq[Any](format.raw/*29.14*/("""
								"""),format.raw/*30.9*/("""<h3>Willkommen <span class="label label-info">"""),_display_(/*30.56*/session/*30.63*/.get("username")),format.raw/*30.79*/("""</span></h3>
								<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*31.66*/routes/*31.72*/.Application.logoutUser()),format.raw/*31.97*/("""" style="color:white">Abmelden</a> </button>
							""")))}),format.raw/*32.9*/("""
					"""),format.raw/*33.6*/("""<!-- login -->	
					
				</div>
			</div>
			<!-- panel -->
			
		</div>
	</div>
</div>"""))}
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jan 11 23:25:03 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/headlogin.scala.html
                  HASH: 4d8c25855e228fc1e05b8a9757d301a35c327e39
                  MATRIX: 732->1|844->25|874->29|1428->557|1472->592|1511->593|1549->604|1564->610|1653->690|1693->692|1732->703|2072->1012|2100->1022|2113->1026|2152->1027|2189->1037|2263->1084|2279->1091|2316->1107|2422->1186|2437->1192|2483->1217|2567->1271|2601->1278
                  LINES: 26->1|29->1|31->3|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|56->28|57->29|57->29|57->29|58->30|58->30|58->30|58->30|59->31|59->31|59->31|60->32|61->33
                  -- GENERATED --
              */
          