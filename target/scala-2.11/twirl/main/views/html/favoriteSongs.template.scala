
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
object favoriteSongs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Artist],List[Song],play.twirl.api.HtmlFormat.Appendable] {

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
											"""),format.raw/*43.12*/("""</tr>
										""")))}),format.raw/*44.12*/("""
									""")))}),format.raw/*45.11*/("""
								"""),format.raw/*46.9*/("""</tbody>
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
	
	"""),_display_(/*62.3*/footerPlayer()),format.raw/*62.17*/("""	
""")))}))}
  }

  def render(artists:List[Artist],songsList:List[Song]): play.twirl.api.HtmlFormat.Appendable = apply(artists,songsList)

  def f:((List[Artist],List[Song]) => play.twirl.api.HtmlFormat.Appendable) = (artists,songsList) => apply(artists,songsList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 22 20:11:34 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/Master/MusicPlay/app/views/favoriteSongs.scala.html
                  HASH: 808c7fcd8a867fb7ea8198496375b632377c32d7
                  MATRIX: 748->1|882->47|912->52|933->65|971->66|1001->71|1032->82|1062->86|1141->139|1183->160|1213->163|1688->611|1743->657|1782->658|1822->670|1926->755|1939->759|1978->760|2018->773|2059->798|2098->799|2139->812|2189->835|2205->842|2249->865|2300->889|2316->896|2348->907|2409->941|2436->959|2484->969|2538->995|2636->1066|2651->1072|2713->1112|2746->1117|2763->1124|2796->1135|2869->1177|2917->1197|2966->1215|3009->1227|3046->1237|3238->1403|3273->1417
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|39->11|58->30|58->30|58->30|59->31|62->34|62->34|62->34|63->35|63->35|63->35|64->36|65->37|65->37|65->37|66->38|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|71->43|72->44|73->45|74->46|90->62|90->62
                  -- GENERATED --
              */
          