
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

Seq[Any](format.raw/*1.1*/("""﻿<div class="span4">
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
						<li role="presentation"><a href=""""),_display_(/*13.41*/routes/*13.47*/.Application.aprankmanagement("eu")),format.raw/*13.82*/("""">Ranking verwalten </a></li>				
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
                  DATE: Thu Jan 15 20:26:54 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apleftcategory.scala.html
                  HASH: 48da538c0e0022c92a5866c2d9786e32bcbfec19
                  MATRIX: 807->0|1203->369|1218->375|1263->399|1359->468|1374->474|1421->500|1516->568|1531->574|1583->605|1684->679|1699->685|1755->720
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13
                  -- GENERATED --
              */
          