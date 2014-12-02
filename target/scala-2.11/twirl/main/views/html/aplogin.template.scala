
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
object aplogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Admin Panel Login")/*1.27*/{_display_(Seq[Any](format.raw/*1.28*/("""
	"""),format.raw/*2.2*/("""<div>
		<div class="panel panel-default">
		  <div class="panel-body">
			<div class="navbar-form">
				<h2><span class="label label-danger">Admin Panel</span></h2>
			</div>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Benutzer" id="Username" />
					<input type="text" class="form-control" placeholder="Passwort" id="Password" />
					<button type="submit" class="btn btn-primary"><a style="color: white" href=""""),_display_(/*12.83*/routes/*12.89*/.Application.apaddsong()),format.raw/*12.113*/(""""> Anmelden</a></button>
				</div>
			</form>	
		</div>
	</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 22:04:00 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aplogin.scala.html
                  HASH: 6d8b7def74ae922a89ec63d10ef206c32bf90f53
                  MATRIX: 800->1|833->26|871->27|900->30|1449->552|1464->558|1510->582
                  LINES: 29->1|29->1|29->1|30->2|40->12|40->12|40->12
                  -- GENERATED --
              */
          