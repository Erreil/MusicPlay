
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
object apleftcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="span4">
	<div class="navbar-left">
		<nav class="navbar navbar-default" role="navigation">			
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Verwaltung</h3>
				</div>
				<div class="panel-body">
					<ul class="nav nav-pills nav-stacked" role="tablist">
						<li role="presentation"><a href=""""),_display_(/*10.41*/routes/*10.47*/.Application.apaddsong()),format.raw/*10.71*/("""">Song hinzufügen </a></li>
						<li role="presentation"><a href=""""),_display_(/*11.41*/routes/*11.47*/.Application.apaddartist()),format.raw/*11.73*/("""">Artist anlegen </a></li>
						<li role="presentation"><a href=""""),_display_(/*12.41*/routes/*12.47*/.Application.apusermanagement()),format.raw/*12.78*/("""">Benutzer verwalten </a></li>					
					</ul>
				</div>
			</div>
		</nav>	
	</div>	
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 22:01:23 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apleftcategory.scala.html
                  HASH: 1f33efa75e4d46f4e74e74d0d3b44c5eb920b355
                  MATRIX: 807->0|1202->368|1217->374|1262->398|1358->467|1373->473|1420->499|1515->567|1530->573|1582->604
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12
                  -- GENERATED --
              */
          