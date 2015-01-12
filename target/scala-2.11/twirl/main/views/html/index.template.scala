
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,List[MusicType],List[Artist],List[Song],Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(country: String, musicTypes: List[MusicType], artists: List[Artist], topSongsList: List[Song], loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Startseite")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""

"""),_display_(/*5.2*/headlogin(loginForm)),format.raw/*5.22*/("""

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
								"""),format.raw/*23.9*/("""<li role="presentation" class="active"><a href=""""),_display_(/*23.58*/routes/*23.64*/.Application.showTopTen("eu")),format.raw/*23.93*/("""">TOP 10 Europe</a></li>
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

  def render(country:String,musicTypes:List[MusicType],artists:List[Artist],topSongsList:List[Song],loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(country,musicTypes,artists,topSongsList,loginForm)

  def f:((String,List[MusicType],List[Artist],List[Song],Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (country,musicTypes,artists,topSongsList,loginForm) => apply(country,musicTypes,artists,topSongsList,loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 12 00:39:17 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/index.scala.html
                  HASH: 36249bb6467919326b4dde677ffbf82c0ec764ef
                  MATRIX: 775->1|983->120|1013->125|1039->143|1077->144|1107->149|1147->169|1177->173|1256->226|1310->259|1340->262|1639->535|1671->558|1710->559|1747->569|1823->618|1838->624|1888->653|1983->721|1998->727|2049->757|2141->822|2156->828|2206->857|2266->887|2311->906|2340->926|2379->927|2416->937|2477->971|2492->977|2546->1010|2656->1093|2671->1099|2722->1129|2814->1194|2829->1200|2879->1229|2939->1259|2984->1278|3012->1297|3051->1298|3088->1308|3149->1342|3164->1348|3218->1381|3313->1449|3328->1455|3379->1485|3486->1565|3501->1571|3551->1600|3611->1630|3656->1648|4003->1968|4040->1996|4079->1997|4119->2009|4223->2094|4236->2098|4275->2099|4315->2112|4359->2140|4398->2141|4439->2154|4489->2177|4505->2184|4536->2194|4587->2218|4603->2225|4647->2248|4698->2272|4714->2279|4746->2290|4807->2324|4834->2342|4882->2352|4936->2378|5034->2449|5049->2455|5111->2495|5144->2500|5161->2507|5194->2518|5267->2560|5308->2573|5357->2591|5400->2603|5437->2613|5629->2779|5664->2793
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|38->10|38->10|39->11|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|83->55|83->55|83->55|84->56|87->59|87->59|87->59|88->60|88->60|88->60|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|95->67|95->67|95->67|95->67|96->68|97->69|98->70|99->71|100->72|116->88|116->88
                  -- GENERATED --
              */
          