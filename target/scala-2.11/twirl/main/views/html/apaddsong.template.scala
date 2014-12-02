
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
object apaddsong extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songList: List[Song]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Song hinzufügen")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""

"""),_display_(/*5.2*/aphead("Inan", "Ödunc")),format.raw/*5.25*/("""
	"""),format.raw/*6.2*/("""<div class="row">		
"""),_display_(/*7.2*/apleftcategory()),format.raw/*7.18*/("""	
		"""),format.raw/*8.3*/("""<div class="span8">
			<div class="navbar-left container">
				
				<!-- Panel -->
				<div class="panel panel-default">
					<div class="panel-body">	

						<!-- Erstellen -->
						<div class="panel panel-success">
							<div class="panel-heading">Erstellen</div>
							<div class="panel-body">
								<form class="navbar-form" role="search">
									<div class="form-group">
										<input type="text" class="form-control" placeholder="Songtitel" id="Songtitel" />
										<input type="text" class="form-control" placeholder="Artist Id" id="Artist" />
										<button type="button" class="btn btn-primary">Song auswählen...</button>
										<button type="submit" class="btn btn-success">Hinzufügen</button>
									</div>
								</form>
							</div>
						</div>
						<!-- Erstellen -->
						
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
							<div class="panel-heading">Verfügbare Songs</div>
								<div class="panel-body">								
									<table class="table">
										<thead>
											<tr>
												<th> Id </th>
												<th> Künstler </th>
												<th> Songtitel </th>
											</tr>
										</thead>
										<tbody>
											"""),_display_(/*54.13*/for(song <- songList) yield /*54.34*/{_display_(Seq[Any](format.raw/*54.35*/("""
												"""),format.raw/*55.13*/("""<tr>
													<td>"""),_display_(/*56.19*/song/*56.23*/.Id),format.raw/*56.26*/("""</td>
													<td>"""),_display_(/*57.19*/song/*57.23*/.Artist.Alias),format.raw/*57.36*/("""</td>
													<td>"""),_display_(/*58.19*/song/*58.23*/.Titel),format.raw/*58.29*/("""</td>
													<td>
														<input type="checkbox">
													</td>
												</tr>
											""")))}),format.raw/*63.13*/("""
										"""),format.raw/*64.11*/("""</tbody>
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
""")))}))}
  }

  def render(songList:List[Song]): play.twirl.api.HtmlFormat.Appendable = apply(songList)

  def f:((List[Song]) => play.twirl.api.HtmlFormat.Appendable) = (songList) => apply(songList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 12:35:48 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apaddsong.scala.html
                  HASH: dae05d58c96875cad83eba6fe1cc14a454876850
                  MATRIX: 731->1|841->23|871->28|902->51|940->52|970->57|1013->80|1042->83|1089->105|1125->121|1156->126|2748->1691|2785->1712|2824->1713|2866->1727|2917->1751|2930->1755|2954->1758|3006->1783|3019->1787|3053->1800|3105->1825|3118->1829|3145->1835|3292->1951|3332->1963
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|35->7|35->7|36->8|82->54|82->54|82->54|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|91->63|92->64
                  -- GENERATED --
              */
          