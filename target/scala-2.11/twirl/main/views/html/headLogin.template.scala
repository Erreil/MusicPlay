
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
object headlogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Boolean,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, Username: String, Firstname: String, Lastname: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.78*/("""

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
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							"""),_display_(/*23.9*/if(isLoggedIn == false)/*23.32*/{_display_(Seq[Any](format.raw/*23.33*/("""
								"""),format.raw/*24.9*/("""<input type="text" class="form-control" placeholder="Benutzer" id="Username" />
								<input type="text" class="form-control" placeholder="Passwort" id="Password" />
								<button type="submit" class="btn btn-default">Anmelden</button>
								<button type="submit" class="btn btn-primary"><a style="color: white" href=""""),_display_(/*27.86*/routes/*27.92*/.Application.signup()),format.raw/*27.113*/(""""> Sign Up</a></button>
							""")))}/*28.9*/else/*28.13*/{_display_(Seq[Any](format.raw/*28.14*/("""
								"""),format.raw/*29.9*/("""<h3>Willkommen  <span class="label label-info"> """),_display_(/*29.58*/Firstname),format.raw/*29.67*/("""  """),_display_(/*29.70*/Lastname),format.raw/*29.78*/("""</span></h3>
							""")))}),format.raw/*30.9*/("""

						"""),format.raw/*32.7*/("""</div>
					</form>	
					<!-- login -->	
					
				</div>
			</div>
			<!-- panel -->
			
		</div>
	</div>
</div>"""))}
  }

  def render(isLoggedIn:Boolean,Username:String,Firstname:String,Lastname:String): play.twirl.api.HtmlFormat.Appendable = apply(isLoggedIn,Username,Firstname,Lastname)

  def f:((Boolean,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (isLoggedIn,Username,Firstname,Lastname) => apply(isLoggedIn,Username,Firstname,Lastname)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 16:42:48 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/headlogin.scala.html
                  HASH: 4cf58c6619045cf2f26571248dcac6790de86264
                  MATRIX: 749->1|913->77|943->81|1589->701|1621->724|1660->725|1697->735|2052->1063|2067->1069|2110->1090|2161->1123|2174->1127|2213->1128|2250->1138|2326->1187|2356->1196|2386->1199|2415->1207|2467->1229|2504->1239
                  LINES: 26->1|29->1|31->3|51->23|51->23|51->23|52->24|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|57->29|57->29|58->30|60->32
                  -- GENERATED --
              */
          