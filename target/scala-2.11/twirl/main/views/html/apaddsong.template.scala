
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
object apaddsong extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Song],Form[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songList: List[Song], songForm: Form[Song]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Song hinzufügen")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""

"""),_display_(/*5.2*/aphead()),format.raw/*5.10*/("""
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
								"""),_display_(/*19.10*/helper/*19.16*/.form(action = routes.Application.newSong, 'enctype -> "multipart/form-data", 'onsubmit -> "return chkFormularSong()", 'name -> "Formular" )/*19.156*/ {_display_(Seq[Any](format.raw/*19.158*/("""
										"""),format.raw/*20.11*/("""<p>Titel: <input type="text" name="titel" id="titel"></p>
										<p>ArtistId: <input type="text" name="artistId" id="artistId"></p>
										<input type="file" name="songFile" id="songFile">
										<input type="submit" value="Anlegen">
								""")))}),format.raw/*24.10*/("""
							"""),format.raw/*25.8*/("""</div>
						</div>
						<!-- Erstellen -->
						
						<!-- Progressbar -->
						<p>
							<div class="progress">
								<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;>
									<span class="sr-only"></span>
								</div>
							</div>
						</p>
						<!-- Progressbar -->
						
						<!-- Table -->
						<div class="panel panel-info">
							<div class="panel-heading">Verfügbare Songs</div>
								<div class="panel-body">								
									<table class="table" id="songTable">
										<thead>
											<tr>
												<th> Id </th>
												<th> Künstler </th>
												<th> Songtitel </th>
											</tr>
										</thead>
										<tbody>
											"""),_display_(/*52.13*/for(song <- songList) yield /*52.34*/{_display_(Seq[Any](format.raw/*52.35*/("""
												"""),format.raw/*53.13*/("""<tr>
													<td>"""),_display_(/*54.19*/song/*54.23*/.getId()),format.raw/*54.31*/("""</td>
													<td>"""),_display_(/*55.19*/song/*55.23*/.getArtist().getAlias()),format.raw/*55.46*/("""</td>
													<td>"""),_display_(/*56.19*/song/*56.23*/.getTitel()),format.raw/*56.34*/("""</td>
													<td>
														<input type="checkbox">
													</td>
												</tr>
											""")))}),format.raw/*61.13*/("""
										"""),format.raw/*62.11*/("""</tbody>
									</table>				
								</div>
							</div>
							<!-- Table -->
							
							<!-- Delete -->
							<form class="navbar-form navbar-right" role="search">
									<button type="button" class="btn btn-primary" onclick="readSelectedSongs();">Ausgewählte löschen</button>
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

  def render(songList:List[Song],songForm:Form[Song]): play.twirl.api.HtmlFormat.Appendable = apply(songList,songForm)

  def f:((List[Song],Form[Song]) => play.twirl.api.HtmlFormat.Appendable) = (songList,songForm) => apply(songList,songForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 22 21:32:12 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/Master/MusicPlay/app/views/apaddsong.scala.html
                  HASH: f1ad7bf915cd9cf41ac87f8e7351c70d812da41a
                  MATRIX: 742->1|874->45|904->50|935->73|973->74|1003->79|1031->87|1060->90|1107->112|1143->128|1174->133|1521->453|1536->459|1686->599|1727->601|1767->613|2054->869|2090->878|2898->1659|2935->1680|2974->1681|3016->1695|3067->1719|3080->1723|3109->1731|3161->1756|3174->1760|3218->1783|3270->1808|3283->1812|3315->1823|3462->1939|3502->1951
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|35->7|35->7|36->8|47->19|47->19|47->19|47->19|48->20|52->24|53->25|80->52|80->52|80->52|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|89->61|90->62
                  -- GENERATED --
              */
          