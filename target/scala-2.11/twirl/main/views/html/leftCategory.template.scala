
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
object leftCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Artist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artists: List[Artist]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<div class="col-md-2">
		<nav class="navbar navbar-default" role="navigation">			
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Kategorien</h3>
				</div>
				<div class="panel-body">	
					<div class="list-group" id="artistGroup">
						
						"""),_display_(/*12.8*/if(session.get("username") != null)/*12.43*/{_display_(Seq[Any](format.raw/*12.44*/("""	
						"""),format.raw/*13.7*/("""<a href=""""),_display_(/*13.17*/routes/*13.23*/.Application.getMySongs()),format.raw/*13.48*/("""" class="list-group-item">Meine Songs</a>
						""")))}),format.raw/*14.8*/("""
															
					"""),_display_(/*16.7*/if(artists.size() <= 0)/*16.30*/{_display_(Seq[Any](format.raw/*16.31*/("""
							"""),format.raw/*17.8*/("""<a href="#" class="list-group-item">Keine Kategorien vorhanden</a>
						""")))}/*18.8*/else/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
							"""),_display_(/*19.9*/if(artists.size() > 0)/*19.31*/{_display_(Seq[Any](format.raw/*19.32*/("""
							"""),format.raw/*20.8*/("""<div class="list-group" id="artistGroup">
								<a class="list-group-item active" id="artistActiveItem"> Artist </a>								
									"""),_display_(/*22.11*/for(artist <- artists) yield /*22.33*/{_display_(Seq[Any](format.raw/*22.34*/("""				
									"""),format.raw/*23.10*/("""<a href=""""),_display_(/*23.20*/routes/*23.26*/.Application.songsByArtist(artist.getAlias())),format.raw/*23.71*/("""" class="list-group-item">"""),_display_(/*23.98*/artist/*23.104*/.getAlias()),format.raw/*23.115*/("""</a>
									""")))}),format.raw/*24.11*/("""
								""")))}),format.raw/*25.10*/("""
							"""),format.raw/*26.8*/("""</div>
						""")))}),format.raw/*27.8*/("""
				"""),format.raw/*28.5*/("""</div>
			</div>
		</nav>	
</div>"""))}
  }

  def render(artists:List[Artist]): play.twirl.api.HtmlFormat.Appendable = apply(artists)

  def f:((List[Artist]) => play.twirl.api.HtmlFormat.Appendable) = (artists) => apply(artists)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 13 13:41:44 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/leftCategory.scala.html
                  HASH: 76afc5b21e51c5d05dade9a8f217705d53a4ac1d
                  MATRIX: 736->1|847->24|877->28|1210->335|1254->370|1293->371|1329->380|1366->390|1381->396|1427->421|1507->471|1558->496|1590->519|1629->520|1665->529|1758->604|1771->608|1810->609|1846->619|1877->641|1916->642|1952->651|2118->790|2156->812|2195->813|2238->828|2275->838|2290->844|2356->889|2410->916|2426->922|2459->933|2506->949|2548->960|2584->969|2629->984|2662->990
                  LINES: 26->1|29->1|31->3|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|44->16|44->16|44->16|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|51->23|51->23|52->24|53->25|54->26|55->27|56->28
                  -- GENERATED --
              */
          