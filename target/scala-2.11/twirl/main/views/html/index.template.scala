
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Artist],List[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(country: String, artists: List[Artist], topSongsList: List[Song]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main("Startseite")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""

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
							
							<!-- tabs -->
							<ul class="nav nav-tabs" role="tablist">
							
							"""),_display_(/*22.9*/if(country == "eu")/*22.28*/{_display_(Seq[Any](format.raw/*22.29*/("""
								"""),format.raw/*23.9*/("""<li role="presentation" class="active"><a href=""""),_display_(/*23.58*/routes/*23.64*/.Application.showTopTen("eu")),format.raw/*23.93*/("""">TOP 10 Europe</a></li>
								<li role="presentation"><a href=""""),_display_(/*24.43*/routes/*24.49*/.Application.showTopTen("usa")),format.raw/*24.79*/("""">TOP 10 USA</a></li>
								<li role="presentation"><a href=""""),_display_(/*25.43*/routes/*25.49*/.Application.showTopTen("uk")),format.raw/*25.78*/("""">TOP 10 UK</a></li>
							""")))}),format.raw/*26.9*/("""
							
							"""),_display_(/*28.9*/if(country == "usa")/*28.29*/{_display_(Seq[Any](format.raw/*28.30*/("""
								"""),format.raw/*29.9*/("""<li role="presentation"><a href=""""),_display_(/*29.43*/routes/*29.49*/.Application.showTopTen("eu")),format.raw/*29.78*/("""">TOP 10 Europe</a></li>
								<li role="presentation" class="active"><a href=""""),_display_(/*30.58*/routes/*30.64*/.Application.showTopTen("usa")),format.raw/*30.94*/("""">TOP 10 USA</a></li>
								<li role="presentation"><a href=""""),_display_(/*31.43*/routes/*31.49*/.Application.showTopTen("uk")),format.raw/*31.78*/("""">TOP 10 UK</a></li>
							""")))}),format.raw/*32.9*/("""
							
							"""),_display_(/*34.9*/if(country == "uk")/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
								"""),format.raw/*35.9*/("""<li role="presentation"><a href=""""),_display_(/*35.43*/routes/*35.49*/.Application.showTopTen("eu")),format.raw/*35.78*/("""">TOP 10 Europe</a></li>
								<li role="presentation"><a href=""""),_display_(/*36.43*/routes/*36.49*/.Application.showTopTen("usa")),format.raw/*36.79*/("""">TOP 10 USA</a></li>
								<li role="presentation" class="active"><a href=""""),_display_(/*37.58*/routes/*37.64*/.Application.showTopTen("uk")),format.raw/*37.93*/("""">TOP 10 UK</a></li>
							""")))}),format.raw/*38.9*/("""
							
							"""),format.raw/*40.8*/("""</ul>
							<!-- tabs -->
							
							<!-- table -->
							<table class="table table-striped">
								<thead>
									<tr>
										<th> Pos </th>
										<th> Künstler </th>
										<th> Songtitel </th>
										<th> </th>
									</tr>
								</thead>
								<tbody>
									
									"""),_display_(/*55.11*/if(topSongsList.size() <= 0)/*55.39*/{_display_(Seq[Any](format.raw/*55.40*/("""
										"""),format.raw/*56.11*/("""<tr>
											<td>Es sind keine Songs vorhanden!</td>
										</tr>
									""")))}/*59.11*/else/*59.15*/{_display_(Seq[Any](format.raw/*59.16*/("""
										"""),_display_(/*60.12*/for(topSong <- topSongsList) yield /*60.40*/{_display_(Seq[Any](format.raw/*60.41*/("""
											"""),format.raw/*61.12*/("""<tr>
												<td>"""),_display_(/*62.18*/topSong/*62.25*/.getRank()),format.raw/*62.35*/("""</td>
												<td>"""),_display_(/*63.18*/topSong/*63.25*/.getArtist().getAlias()),format.raw/*63.48*/("""</td>
												<td>"""),_display_(/*64.18*/topSong/*64.25*/.getTitel()),format.raw/*64.36*/("""</td>
												
												"""),_display_(/*66.14*/defining("music/")/*66.32*/ { path =>_display_(Seq[Any](format.raw/*66.42*/("""												
												"""),format.raw/*67.13*/("""<td><button type="button" class="btn btn-primary" onclick="playMusic('"""),_display_(/*67.84*/routes/*67.90*/.Assets.at(path + topSong.getFileName())),format.raw/*67.130*/("""', '"""),_display_(/*67.135*/topSong/*67.142*/.getTitel()),format.raw/*67.153*/("""');"> Play </button>	</td>
												 """)))}),format.raw/*68.15*/("""
											"""),format.raw/*69.12*/("""</tr>
										""")))}),format.raw/*70.12*/("""
									""")))}),format.raw/*71.11*/("""
								"""),format.raw/*72.9*/("""</tbody>
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
	
	"""),_display_(/*88.3*/footerPlayer()),format.raw/*88.17*/("""	
""")))}))}
  }

  def render(country:String,artists:List[Artist],topSongsList:List[Song]): play.twirl.api.HtmlFormat.Appendable = apply(country,artists,topSongsList)

  def f:((String,List[Artist],List[Song]) => play.twirl.api.HtmlFormat.Appendable) = (country,artists,topSongsList) => apply(country,artists,topSongsList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 20 08:35:22 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/index.scala.html
                  HASH: 9fa2883f3a2fc9aa1115f3550c12d585584df9d1
                  MATRIX: 747->1|901->67|931->72|957->90|995->91|1025->96|1056->107|1086->111|1165->164|1207->185|1237->188|1536->461|1564->480|1603->481|1640->491|1716->540|1731->546|1781->575|1876->643|1891->649|1942->679|2034->744|2049->750|2099->779|2159->809|2204->828|2233->848|2272->849|2309->859|2370->893|2385->899|2435->928|2545->1011|2560->1017|2611->1047|2703->1112|2718->1118|2768->1147|2828->1177|2873->1196|2901->1215|2940->1216|2977->1226|3038->1260|3053->1266|3103->1295|3198->1363|3213->1369|3264->1399|3371->1479|3386->1485|3436->1514|3496->1544|3541->1562|3888->1882|3925->1910|3964->1911|4004->1923|4108->2008|4121->2012|4160->2013|4200->2026|4244->2054|4283->2055|4324->2068|4374->2091|4390->2098|4421->2108|4472->2132|4488->2139|4532->2162|4583->2186|4599->2193|4631->2204|4692->2238|4719->2256|4767->2266|4821->2292|4919->2363|4934->2369|4996->2409|5029->2414|5046->2421|5079->2432|5152->2474|5193->2487|5242->2505|5285->2517|5322->2527|5514->2693|5549->2707
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|39->11|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|83->55|83->55|83->55|84->56|87->59|87->59|87->59|88->60|88->60|88->60|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|95->67|95->67|95->67|95->67|96->68|97->69|98->70|99->71|100->72|116->88|116->88
                  -- GENERATED --
              */
          