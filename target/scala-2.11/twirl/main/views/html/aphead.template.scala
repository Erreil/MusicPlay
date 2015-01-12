
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
object aphead extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="row">
	<div class="span12">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="navbar-form">
					<h2><span class="label label-danger">Admin Panel</span></h2>
				</div>
				<br/>
				<div class="navbar-form">
				<p>Angemeldeter Benutzer:</p>
				<h3><span class="label label-info">"""),_display_(/*11.41*/session/*11.48*/.get("username")),format.raw/*11.64*/("""</span></h3>	
				<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*12.62*/routes/*12.68*/.Application.logoutAdmin()),format.raw/*12.94*/("""" style="color:white">Abmelden</a> </button>	
				</div>
			</div>
		</div>
	</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jan 11 22:39:28 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aphead.scala.html
                  HASH: 7f9ec0937f48b2618b8e73a03433660fe87d07f0
                  MATRIX: 799->0|1161->335|1177->342|1214->358|1317->434|1332->440|1379->466
                  LINES: 29->1|39->11|39->11|39->11|40->12|40->12|40->12
                  -- GENERATED --
              */
          