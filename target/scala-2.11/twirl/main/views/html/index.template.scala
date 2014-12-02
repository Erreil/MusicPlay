
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,List[MusicType],List[Artist],List[Song],List[NewsEntry],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(country: String, musicTypes: List[MusicType], artists: List[Artist], topSongsList: List[Song], newsList: List[NewsEntry]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.124*/("""

"""),_display_(/*3.2*/main("Startseite")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""

"""),_display_(/*5.2*/headlogin(false, "erreil", "Erik", "Reil")),format.raw/*5.44*/("""

"""),format.raw/*7.1*/("""<div class="container-fluid">
<div class="row">

"""),_display_(/*10.2*/leftCategory(musicTypes, artists)),format.raw/*10.35*/("""
	"""),format.raw/*11.2*/("""<div class="col-md-8">
		<div class="navbar-left">

				<!-- panel -->
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="container">
							
							<!-- tabs -->
							<ul class="nav nav-tabs" role="tablist">
							
							"""),_display_(/*22.9*/if(country == "europe")/*22.32*/{_display_(Seq[Any](format.raw/*22.33*/("""
								"""),format.raw/*23.9*/("""<li role="presentation" class="active"><a href=""""),_display_(/*23.58*/routes/*23.64*/.Application.showTopTen("europe")),format.raw/*23.97*/("""">TOP 10 Europe</a></li>
								<li role="presentation"><a href=""""),_display_(/*24.43*/routes/*24.49*/.Application.showTopTen("usa")),format.raw/*24.79*/("""">TOP 10 USA</a></li>
								<li role="presentation"><a href=""""),_display_(/*25.43*/routes/*25.49*/.Application.showTopTen("uk")),format.raw/*25.78*/("""">TOP 10 UK</a></li>
							""")))}),format.raw/*26.9*/("""
							
							"""),_display_(/*28.9*/if(country == "usa")/*28.29*/{_display_(Seq[Any](format.raw/*28.30*/("""
								"""),format.raw/*29.9*/("""<li role="presentation"><a href=""""),_display_(/*29.43*/routes/*29.49*/.Application.showTopTen("europe")),format.raw/*29.82*/("""">TOP 10 Europe</a></li>
								<li role="presentation" class="active"><a href=""""),_display_(/*30.58*/routes/*30.64*/.Application.showTopTen("usa")),format.raw/*30.94*/("""">TOP 10 USA</a></li>
								<li role="presentation"><a href=""""),_display_(/*31.43*/routes/*31.49*/.Application.showTopTen("uk")),format.raw/*31.78*/("""">TOP 10 UK</a></li>
							""")))}),format.raw/*32.9*/("""
							
							"""),_display_(/*34.9*/if(country == "uk")/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
								"""),format.raw/*35.9*/("""<li role="presentation"><a href=""""),_display_(/*35.43*/routes/*35.49*/.Application.showTopTen("europe")),format.raw/*35.82*/("""">TOP 10 Europe</a></li>
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
									</tr>
								</thead>
								<tbody>
									
									"""),_display_(/*54.11*/if(topSongsList.size() <= 0)/*54.39*/{_display_(Seq[Any](format.raw/*54.40*/("""
										"""),format.raw/*55.11*/("""<tr>
											<td>Es sind keine Songs vorhanden!</td>
										</tr>
									""")))}/*58.11*/else/*58.15*/{_display_(Seq[Any](format.raw/*58.16*/("""
										"""),_display_(/*59.12*/for(topSong <- topSongsList) yield /*59.40*/{_display_(Seq[Any](format.raw/*59.41*/("""
											"""),format.raw/*60.12*/("""<tr>
												<td>"""),_display_(/*61.18*/topSong/*61.25*/.Rank),format.raw/*61.30*/("""</td>
												<td>"""),_display_(/*62.18*/topSong/*62.25*/.Artist.Alias),format.raw/*62.38*/("""</td>
												<td>"""),_display_(/*63.18*/topSong/*63.25*/.Titel),format.raw/*63.31*/("""</td>
											</tr>
										""")))}),format.raw/*65.12*/("""
									""")))}),format.raw/*66.11*/("""
								"""),format.raw/*67.9*/("""</tbody>
							</table>
							<!-- table -->
							
						</div>
					</div>
				</div>
				<!-- panel -->

		</div>
	</div>
	
	"""),_display_(/*79.3*/news(newsList)),format.raw/*79.17*/("""
"""),format.raw/*80.1*/("""</div>
</div>
	
	"""),_display_(/*83.3*/footerPlayer()),format.raw/*83.17*/("""	
""")))}))}
  }

  def render(country:String,musicTypes:List[MusicType],artists:List[Artist],topSongsList:List[Song],newsList:List[NewsEntry]): play.twirl.api.HtmlFormat.Appendable = apply(country,musicTypes,artists,topSongsList,newsList)

  def f:((String,List[MusicType],List[Artist],List[Song],List[NewsEntry]) => play.twirl.api.HtmlFormat.Appendable) = (country,musicTypes,artists,topSongsList,newsList) => apply(country,musicTypes,artists,topSongsList,newsList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 16:30:12 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/index.scala.html
                  HASH: b3803fd5f7fd2fbf6d265866177c2b59e1579ba2
                  MATRIX: 779->1|990->123|1020->128|1046->146|1084->147|1114->152|1176->194|1206->198|1285->251|1339->284|1369->287|1668->560|1700->583|1739->584|1776->594|1852->643|1867->649|1921->682|2016->750|2031->756|2082->786|2174->851|2189->857|2239->886|2299->916|2344->935|2373->955|2412->956|2449->966|2510->1000|2525->1006|2579->1039|2689->1122|2704->1128|2755->1158|2847->1223|2862->1229|2912->1258|2972->1288|3017->1307|3045->1326|3084->1327|3121->1337|3182->1371|3197->1377|3251->1410|3346->1478|3361->1484|3412->1514|3519->1594|3534->1600|3584->1629|3644->1659|3689->1677|4014->1975|4051->2003|4090->2004|4130->2016|4234->2101|4247->2105|4286->2106|4326->2119|4370->2147|4409->2148|4450->2161|4500->2184|4516->2191|4542->2196|4593->2220|4609->2227|4643->2240|4694->2264|4710->2271|4737->2277|4804->2313|4847->2325|4884->2335|5054->2479|5089->2493|5118->2495|5165->2516|5200->2530
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|39->11|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|82->54|82->54|82->54|83->55|86->58|86->58|86->58|87->59|87->59|87->59|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|93->65|94->66|95->67|107->79|107->79|108->80|111->83|111->83
                  -- GENERATED --
              */
          