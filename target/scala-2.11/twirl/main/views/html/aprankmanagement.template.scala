
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


"""),_display_(/*4.2*/main("Song Rank verwalten")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""

	"""),_display_(/*6.3*/aphead()),format.raw/*6.11*/("""
	
		"""),format.raw/*8.3*/("""<div class="row">	
			"""),_display_(/*9.5*/apleftcategory()),format.raw/*9.21*/("""	
			"""),format.raw/*10.4*/("""<div class="span8">
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
									
									"""),_display_(/*35.11*/if(country == "eu")/*35.30*/{_display_(Seq[Any](format.raw/*35.31*/("""
										"""),format.raw/*36.11*/("""<li role="presentation" class="active"><a href=""""),_display_(/*36.60*/routes/*36.66*/.Application.aprankmanagement("eu")),format.raw/*36.101*/("""">TOP 10 Europe</a></li>
										<li role="presentation"><a href=""""),_display_(/*37.45*/routes/*37.51*/.Application.aprankmanagement("usa")),format.raw/*37.87*/("""">TOP 10 USA</a></li>
										<li role="presentation"><a href=""""),_display_(/*38.45*/routes/*38.51*/.Application.aprankmanagement("uk")),format.raw/*38.86*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*39.11*/("""
												
									"""),_display_(/*41.11*/if(country == "usa")/*41.31*/{_display_(Seq[Any](format.raw/*41.32*/("""
										"""),format.raw/*42.11*/("""<li role="presentation"><a href=""""),_display_(/*42.45*/routes/*42.51*/.Application.aprankmanagement("eu")),format.raw/*42.86*/("""">TOP 10 Europe</a></li>
										<li role="presentation" class="active"><a href=""""),_display_(/*43.60*/routes/*43.66*/.Application.aprankmanagement("usa")),format.raw/*43.102*/("""">TOP 10 USA</a></li>
										<li role="presentation"><a href=""""),_display_(/*44.45*/routes/*44.51*/.Application.aprankmanagement("uk")),format.raw/*44.86*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*45.11*/("""
												
									"""),_display_(/*47.11*/if(country == "uk")/*47.30*/{_display_(Seq[Any](format.raw/*47.31*/("""
										"""),format.raw/*48.11*/("""<li role="presentation"><a href=""""),_display_(/*48.45*/routes/*48.51*/.Application.aprankmanagement("eu")),format.raw/*48.86*/("""">TOP 10 Europe</a></li>
										<li role="presentation"><a href=""""),_display_(/*49.45*/routes/*49.51*/.Application.aprankmanagement("usa")),format.raw/*49.87*/("""">TOP 10 USA</a></li>
										<li role="presentation" class="active"><a href=""""),_display_(/*50.60*/routes/*50.66*/.Application.aprankmanagement("uk")),format.raw/*50.101*/("""">TOP 10 UK</a></li>
									""")))}),format.raw/*51.11*/("""
									
								"""),format.raw/*53.9*/("""</ul>
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
										"""),_display_(/*67.12*/if(songList != null)/*67.32*/{_display_(Seq[Any](format.raw/*67.33*/("""
											"""),_display_(/*68.13*/for(song <- songList) yield /*68.34*/{_display_(Seq[Any](format.raw/*68.35*/("""
											"""),format.raw/*69.12*/("""<tr>
												<td>"""),_display_(/*70.18*/song/*70.22*/.getId()),format.raw/*70.30*/("""</td>
												<td>"""),_display_(/*71.18*/song/*71.22*/.getArtist().getAlias()),format.raw/*71.45*/("""</td>
												<td>"""),_display_(/*72.18*/song/*72.22*/.getTitel()),format.raw/*72.33*/("""</td>	
												<td><input id="input"""),_display_(/*73.34*/song/*73.38*/.getId()),format.raw/*73.46*/(""""   type="number" min="0" max="10" value="""),_display_(/*73.88*/song/*73.92*/.getRank()),format.raw/*73.102*/("""></td>
											</tr>
										""")))}),format.raw/*75.12*/("""
										""")))}),format.raw/*76.12*/("""
										

									"""),format.raw/*79.10*/("""</tbody>
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
                  DATE: Tue Jan 13 12:37:52 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aprankmanagement.scala.html
                  HASH: f27925d312af353cc8ee6f30055e855a82a8e816
                  MATRIX: 745->1|872->40|904->47|939->74|977->75|1008->81|1036->89|1069->96|1118->120|1154->136|1187->142|1954->882|1982->901|2021->902|2061->914|2137->963|2152->969|2209->1004|2306->1074|2321->1080|2378->1116|2472->1183|2487->1189|2543->1224|2606->1256|2659->1282|2688->1302|2727->1303|2767->1315|2828->1349|2843->1355|2899->1390|3011->1475|3026->1481|3084->1517|3178->1584|3193->1590|3249->1625|3312->1657|3365->1683|3393->1702|3432->1703|3472->1715|3533->1749|3548->1755|3604->1790|3701->1860|3716->1866|3773->1902|3882->1984|3897->1990|3954->2025|4017->2057|4065->2078|4429->2415|4458->2435|4497->2436|4538->2450|4575->2471|4614->2472|4655->2485|4705->2508|4718->2512|4747->2520|4798->2544|4811->2548|4855->2571|4906->2595|4919->2599|4951->2610|5019->2651|5032->2655|5061->2663|5130->2705|5143->2709|5175->2719|5243->2756|5287->2769|5340->2794
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|36->8|37->9|37->9|38->10|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|81->53|95->67|95->67|95->67|96->68|96->68|96->68|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|101->73|101->73|101->73|103->75|104->76|107->79
                  -- GENERATED --
              */
          