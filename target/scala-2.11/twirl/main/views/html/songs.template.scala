
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
object songs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Artist],List[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artists: List[Artist], songsList: List[Song]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/main("Songs")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""

"""),_display_(/*5.2*/headlogin()),format.raw/*5.13*/("""

"""),format.raw/*7.1*/("""<div class="container-fluid">
<div class="row">

"""),_display_(/*10.2*/leftCategory(artists)),format.raw/*10.23*/("""
	"""),format.raw/*11.2*/("""<div class="col-md-8">
		<div class="navbar-left">

				<!-- panel -->
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="container">
														
							<!-- table -->
							<table class="table table-striped">
								<thead>
									<tr>
										<th> Künstler </th>
										<th> Songtitel </th>
										<th> </th>
									</tr>
								</thead>
								<tbody>
									
									"""),_display_(/*30.11*/if(songsList == null || songsList.size() <= 0)/*30.57*/{_display_(Seq[Any](format.raw/*30.58*/("""
										"""),format.raw/*31.11*/("""<tr>
											<td>Es sind keine Songs vorhanden!</td>
										</tr>
									""")))}/*34.11*/else/*34.15*/{_display_(Seq[Any](format.raw/*34.16*/("""
										"""),_display_(/*35.12*/for(topSong <- songsList) yield /*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
											"""),format.raw/*36.12*/("""<tr>
												<td>"""),_display_(/*37.18*/topSong/*37.25*/.getArtist().getAlias()),format.raw/*37.48*/("""</td>
												<td>"""),_display_(/*38.18*/topSong/*38.25*/.getTitel()),format.raw/*38.36*/("""</td>
												
												"""),_display_(/*40.14*/defining("music/")/*40.32*/ { path =>_display_(Seq[Any](format.raw/*40.42*/("""												
												"""),format.raw/*41.13*/("""<td><button type="button" class="btn btn-primary" onclick="playMusic('"""),_display_(/*41.84*/routes/*41.90*/.Assets.at(path + topSong.getFileName())),format.raw/*41.130*/("""', '"""),_display_(/*41.135*/topSong/*41.142*/.getTitel()),format.raw/*41.153*/("""');"> Play </button>	</td>
												 """)))}),format.raw/*42.15*/("""
												 
												 """),_display_(/*44.15*/if(session.get("username") != null)/*44.50*/{_display_(Seq[Any](format.raw/*44.51*/("""	
												 		"""),format.raw/*45.16*/("""<td><button type="button" class="btn btn-primary" onclick="addToFavorites('"""),_display_(/*45.92*/routes/*45.98*/.Application.addToFavorites(topSong.getId())),format.raw/*45.142*/("""')">Zu Favoriten</button> 	</td>
												 """)))}),format.raw/*46.15*/("""							 
											"""),format.raw/*47.12*/("""</tr>
										""")))}),format.raw/*48.12*/("""
									""")))}),format.raw/*49.11*/("""
								"""),format.raw/*50.9*/("""</tbody>
							</table>
							<!-- table -->
							
						</div>
					</div>
				</div>
				<!-- panel -->

		</div>
	</div>
	
	
</div>
</div>
	
	"""),_display_(/*66.3*/footerPlayer()),format.raw/*66.17*/("""	
""")))}))}
  }

  def render(artists:List[Artist],songsList:List[Song]): play.twirl.api.HtmlFormat.Appendable = apply(artists,songsList)

  def f:((List[Artist],List[Song]) => play.twirl.api.HtmlFormat.Appendable) = (artists,songsList) => apply(artists,songsList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 15 20:39:29 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/songs.scala.html
                  HASH: b7b23cfa18b3e20d0ea5fc147ec86069c8500a04
                  MATRIX: 740->1|874->47|904->52|925->65|963->66|993->71|1024->82|1054->86|1133->139|1175->160|1205->163|1680->611|1735->657|1774->658|1814->670|1918->755|1931->759|1970->760|2010->773|2051->798|2090->799|2131->812|2181->835|2197->842|2241->865|2292->889|2308->896|2340->907|2401->941|2428->959|2476->969|2530->995|2628->1066|2643->1072|2705->1112|2738->1117|2755->1124|2788->1135|2861->1177|2919->1208|2963->1243|3002->1244|3048->1262|3151->1338|3166->1344|3232->1388|3311->1436|3360->1457|3409->1475|3452->1487|3489->1497|3681->1663|3716->1677
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|39->11|58->30|58->30|58->30|59->31|62->34|62->34|62->34|63->35|63->35|63->35|64->36|65->37|65->37|65->37|66->38|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|75->47|76->48|77->49|78->50|94->66|94->66
                  -- GENERATED --
              */
          