
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

Seq[Any](format.raw/*2.1*/("""<div class="row">
	<div class="span12">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="navbar-form">
					<h2><span class="label label-danger">Admin Panel</span></h2>
				</div>
				<br/>
				<div class="navbar-form">
				<p>Angemeldeter Benutzer:</p>
				<h3><span class="label label-info">"""),_display_(/*12.41*/session/*12.48*/.get("username")),format.raw/*12.64*/("""</span></h3>	
				<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*13.62*/routes/*13.68*/.Application.logoutAdmin()),format.raw/*13.94*/("""" style="color:white">Abmelden</a> </button>	
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
                  DATE: Mon Jan 12 20:01:53 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aphead.scala.html
                  HASH: 8fbea4a6a1cf43193c9dc56b7f4b8378a8748346
                  MATRIX: 799->3|1161->338|1177->345|1214->361|1317->437|1332->443|1379->469
                  LINES: 29->2|39->12|39->12|39->12|40->13|40->13|40->13
                  -- GENERATED --
              */
          