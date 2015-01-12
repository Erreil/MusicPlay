
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
object aprankmanagement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Song],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songList: List[Song], country: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main("Song Rank verwalten")/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""

	"""),_display_(/*5.3*/aphead()),format.raw/*5.11*/("""
	
		"""),format.raw/*7.3*/("""<div class="row">	
			"""),_display_(/*8.5*/apleftcategory()),format.raw/*8.21*/("""	
			"""),format.raw/*9.4*/("""<div class="span8">
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
						
						<!-- Panel -->
						<div class="panel panel-info">
							<div class="panel-heading">Verf�gbare Songs</div>
							<div class="panel-body">
								
								<!-- tabs -->
								<ul class="nav nav-tabs" role="tablist">
									
									"""),_display_(/*34.11*/if(country == "eu")/*34.30*/{_display_(Seq[Any](format.raw/*34.31*/("""
										"""),format.raw/*35.11*/("""<li role="presentation" class="active"><a href=""""),_display_(/*35.60*/routes/*35.66*/.Application.aprankmanagement("eu")),format.raw/*35.101*/("""">TOP 10 Europe</a></li>
										<li role="presentation"><a href=""""),_display_(/*36.45*/routes/*36.51*/.Application.aprankmanagement("usa")),format.raw/*36.87*/("""">TOP 10 USA</a></li>
										<li role="presentation"><a href=""""),_display_(/*37.45*/routes/*37.51*/.Application.aprankmanagement("uk")),format.raw/*37.86*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*38.11*/("""
												
									"""),_display_(/*40.11*/if(country == "usa")/*40.31*/{_display_(Seq[Any](format.raw/*40.32*/("""
										"""),format.raw/*41.11*/("""<li role="presentation"><a href=""""),_display_(/*41.45*/routes/*41.51*/.Application.aprankmanagement("eu")),format.raw/*41.86*/("""">TOP 10 Europe</a></li>
										<li role="presentation" class="active"><a href=""""),_display_(/*42.60*/routes/*42.66*/.Application.aprankmanagement("usa")),format.raw/*42.102*/("""">TOP 10 USA</a></li>
										<li role="presentation"><a href=""""),_display_(/*43.45*/routes/*43.51*/.Application.aprankmanagement("uk")),format.raw/*43.86*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*44.11*/("""
												
									"""),_display_(/*46.11*/if(country == "uk")/*46.30*/{_display_(Seq[Any](format.raw/*46.31*/("""
										"""),format.raw/*47.11*/("""<li role="presentation"><a href=""""),_display_(/*47.45*/routes/*47.51*/.Application.aprankmanagement("eu")),format.raw/*47.86*/("""">TOP 10 Europe</a></li>
										<li role="presentation"><a href=""""),_display_(/*48.45*/routes/*48.51*/.Application.aprankmanagement("usa")),format.raw/*48.87*/("""">TOP 10 USA</a></li>
										<li role="presentation" class="active"><a href=""""),_display_(/*49.60*/routes/*49.66*/.Application.aprankmanagement("uk")),format.raw/*49.101*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*50.11*/("""
									
								"""),format.raw/*52.9*/("""</ul>
								<!-- tabs -->
								
								<!-- Table -->	
								<table class="table" id="songRankingTable">	
									<thead>
										<tr>
											<th> Id </th>
											<th> K�nstler </th>
											<th> Songtitel </th>
											<th> Rank </th>
										</tr>
									</thead>
									<tbody>
										"""),_display_(/*66.12*/for(song <- songList) yield /*66.33*/{_display_(Seq[Any](format.raw/*66.34*/("""
											"""),format.raw/*67.12*/("""<tr>
												<td>"""),_display_(/*68.18*/song/*68.22*/.getId()),format.raw/*68.30*/("""</td>
												<td>"""),_display_(/*69.18*/song/*69.22*/.getArtist().getAlias()),format.raw/*69.45*/("""</td>
												<td>"""),_display_(/*70.18*/song/*70.22*/.getTitel()),format.raw/*70.33*/("""</td>	
												<td><input id="input"""),_display_(/*71.34*/song/*71.38*/.getId()),format.raw/*71.46*/(""""   type="number" min="0" max="10" value="""),_display_(/*71.88*/song/*71.92*/.getRank()),format.raw/*71.102*/("""></td>
											</tr>
										""")))}),format.raw/*73.12*/("""
									"""),format.raw/*74.10*/("""</tbody>
								</table>
								<!-- Table -->		
								
							</div>
						</div>
						<!-- Panel -->
						
						<!-- Assign -->
						<form class="navbar-form navbar-right" role="search">
							<button type="button" class="btn btn-primary" onclick="readSongRanking();">Zuordnen</button>
						</form>
						<!-- Assign -->
						
					</div>
				</div>
				<!-- Panel -->
						
				</div>	
			</div>			
		</div>
""")))}))}
  }

  def render(songList:List[Song],country:String): play.twirl.api.HtmlFormat.Appendable = apply(songList,country)

  def f:((List[Song],String) => play.twirl.api.HtmlFormat.Appendable) = (songList,country) => apply(songList,country)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jan 11 20:07:20 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aprankmanagement.scala.html
                  HASH: 1a95bfe58bb136085f7d2ca56cb3f19c34772f4a
                  MATRIX: 745->1|872->40|902->45|937->72|975->73|1006->79|1034->87|1067->94|1116->118|1152->134|1184->140|1951->880|1979->899|2018->900|2058->912|2134->961|2149->967|2206->1002|2303->1072|2318->1078|2375->1114|2469->1181|2484->1187|2540->1222|2603->1254|2656->1280|2685->1300|2724->1301|2764->1313|2825->1347|2840->1353|2896->1388|3008->1473|3023->1479|3081->1515|3175->1582|3190->1588|3246->1623|3309->1655|3362->1681|3390->1700|3429->1701|3469->1713|3530->1747|3545->1753|3601->1788|3698->1858|3713->1864|3770->1900|3879->1982|3894->1988|3951->2023|4014->2055|4062->2076|4426->2413|4463->2434|4502->2435|4543->2448|4593->2471|4606->2475|4635->2483|4686->2507|4699->2511|4743->2534|4794->2558|4807->2562|4839->2573|4907->2614|4920->2618|4949->2626|5018->2668|5031->2672|5063->2682|5131->2719|5170->2730
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|36->8|36->8|37->9|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|80->52|94->66|94->66|94->66|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|99->71|99->71|99->71|101->73|102->74
                  -- GENERATED --
              */
          