
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

"""),_display_(/*4.2*/aphead()),format.raw/*4.10*/("""
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
								<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%">
									<span class="sr-only"></span>
								</div>
							</div>
						</p>
						<!-- Progressbar -->
							
						<!-- Table -->
						<div class="panel panel-info">
							<div class="panel-heading">Verfügbare Benutzer</div>
								<div class="panel-body">								
									<table class="table" id="userTable">
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
													<td>"""),_display_(/*41.19*/user/*41.23*/.getId()),format.raw/*41.31*/("""</td>
													<td>"""),_display_(/*42.19*/user/*42.23*/.getUsername()),format.raw/*42.37*/("""</td>
													<td>"""),_display_(/*43.19*/user/*43.23*/.getFirstname()),format.raw/*43.38*/("""</td>
													<td>"""),_display_(/*44.19*/user/*44.23*/.getLastname()),format.raw/*44.37*/("""</td>
													<td>"""),_display_(/*45.19*/user/*45.23*/.getMail()),format.raw/*45.33*/("""</td>
													<td>
														<input type="checkbox" name="box">
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
									<button type="button" class="btn btn-primary" onclick="readSelectedUsers();">Ausgewählte löschen</button>
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
                  DATE: Thu Jan 15 20:38:03 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apusermanagement.scala.html
                  HASH: 7b9cbb1ffa55f90e0687dc4bfd5185ebbd789ed9
                  MATRIX: 738->1|845->20|873->23|907->49|945->50|975->55|1003->63|1032->66|1081->90|1117->106|1148->111|2131->1067|2165->1085|2204->1086|2246->1100|2297->1124|2310->1128|2339->1136|2391->1161|2404->1165|2439->1179|2491->1204|2504->1208|2540->1223|2592->1248|2605->1252|2640->1266|2692->1291|2705->1295|2736->1305|2894->1432|2934->1444|3386->1866
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|33->5|35->7|35->7|36->8|67->39|67->39|67->39|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|78->50|79->51|97->69
                  -- GENERATED --
              */
          