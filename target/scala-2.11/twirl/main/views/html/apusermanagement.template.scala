
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
object apusermanagement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*2.2*/main("Benutzer verwalten")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""

"""),_display_(/*4.2*/aphead("Inan", "Ödunc")),format.raw/*4.25*/("""
	"""),format.raw/*5.2*/("""<div class="row">	
	
"""),_display_(/*7.2*/apleftcategory()),format.raw/*7.18*/("""	
		"""),format.raw/*8.3*/("""<div class="span8">
			<div class="navbar-left container">
			
				<!-- Panel -->
				<div class="panel panel-default">
					<div class="panel-body">							
						<!-- Progressbar -->
						<p>
							<div class="progress">
								<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;>
									<span class="sr-only">60% abgeschlossen</span>
								</div>
							</div>
						</p>
						<!-- Progressbar -->
							
						<!-- Table -->
						<div class="panel panel-info">
							<div class="panel-heading">Verfügbare Benutzer</div>
								<div class="panel-body">								
									<table class="table">
										<thead>
											<tr>
												<th> Id </th>
												<th> Benutzername </th>
												<th> Vorname </th>
												<th> Nachname </th>
												<th> Mail </th>
											</tr>
										</thead>
										<tbody>
											"""),_display_(/*39.13*/for(user <- users) yield /*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""
												"""),format.raw/*40.13*/("""<tr>
													<td>"""),_display_(/*41.19*/user/*41.23*/.Id),format.raw/*41.26*/("""</td>
													<td>"""),_display_(/*42.19*/user/*42.23*/.Username),format.raw/*42.32*/("""</td>
													<td>"""),_display_(/*43.19*/user/*43.23*/.Firstname),format.raw/*43.33*/("""</td>
													<td>"""),_display_(/*44.19*/user/*44.23*/.Lastname),format.raw/*44.32*/("""</td>
													<td>"""),_display_(/*45.19*/user/*45.23*/.Mail),format.raw/*45.28*/("""</td>
													<td>
														<input type="checkbox">
													</td>
												</tr>
											""")))}),format.raw/*50.13*/("""
										"""),format.raw/*51.11*/("""</tbody>
									</table>				
								</div>
							</div>
							<!-- Table -->
							
							<!-- Delete -->
							<form class="navbar-form navbar-right" role="search">
									<button type="button" class="btn btn-primary">Ausgewählte löschen</button>
							</form>
							<!-- Delete -->
					</div>
				</div>
				<!-- Panel -->
				
			</div>
		</div>		
	</div>
""")))}),format.raw/*69.2*/("""
"""))}
  }

  def render(users:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 12:29:15 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apusermanagement.scala.html
                  HASH: afd9489f984680008a4e63c47f2a0003babf114b
                  MATRIX: 738->1|845->20|873->23|907->49|945->50|975->55|1018->78|1047->81|1096->105|1132->121|1163->126|2149->1085|2183->1103|2222->1104|2264->1118|2315->1142|2328->1146|2352->1149|2404->1174|2417->1178|2447->1187|2499->1212|2512->1216|2543->1226|2595->1251|2608->1255|2638->1264|2690->1289|2703->1293|2729->1298|2876->1414|2916->1426|3337->1817
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|33->5|35->7|35->7|36->8|67->39|67->39|67->39|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|78->50|79->51|97->69
                  -- GENERATED --
              */
          