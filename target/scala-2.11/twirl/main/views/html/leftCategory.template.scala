
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
object leftCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[MusicType],List[Artist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(musicTypes: List[MusicType], artists: List[Artist]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*3.1*/("""<div class="col-md-2">
		<nav class="navbar navbar-default" role="navigation">			
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Kategorien</h3>
				</div>
				<div class="panel-body">											
					<div class="list-group">
						"""),_display_(/*11.8*/if(artists.size() <= 0 && musicTypes.size() <= 0)/*11.57*/{_display_(Seq[Any](format.raw/*11.58*/("""
								"""),format.raw/*12.9*/("""<a href="#" class="list-group-item">Keine Kategorien vorhanden</a>
							""")))}/*13.9*/else/*13.13*/{_display_(Seq[Any](format.raw/*13.14*/("""
								"""),_display_(/*14.10*/if(artists.size() > 0)/*14.32*/{_display_(Seq[Any](format.raw/*14.33*/("""
								"""),format.raw/*15.9*/("""<a href="#" class="list-group-item active"> Artist </a>								
									"""),_display_(/*16.11*/for(artist <- artists) yield /*16.33*/{_display_(Seq[Any](format.raw/*16.34*/("""				
									"""),format.raw/*17.10*/("""<a href="#" class="list-group-item">"""),_display_(/*17.47*/artist/*17.53*/.Alias),format.raw/*17.59*/("""</a>
									""")))}),format.raw/*18.11*/("""
								""")))}),format.raw/*19.10*/("""
													
								"""),_display_(/*21.10*/if(musicTypes.size() > 0)/*21.35*/{_display_(Seq[Any](format.raw/*21.36*/("""
									"""),format.raw/*22.10*/("""<a href="#" class="list-group-item active"> Musikart </a>									
									"""),_display_(/*23.11*/for(musicType <- musicTypes) yield /*23.39*/{_display_(Seq[Any](format.raw/*23.40*/("""
										"""),format.raw/*24.11*/("""<a href="#" class="list-group-item">"""),_display_(/*24.48*/musicType/*24.57*/.Type),format.raw/*24.62*/("""</a>
									""")))}),format.raw/*25.11*/("""
								""")))}),format.raw/*26.10*/("""
							""")))}),format.raw/*27.9*/("""
					"""),format.raw/*28.6*/("""</div>
				</div>
			</div>
		</nav>	
</div>"""))}
  }

  def render(musicTypes:List[MusicType],artists:List[Artist]): play.twirl.api.HtmlFormat.Appendable = apply(musicTypes,artists)

  def f:((List[MusicType],List[Artist]) => play.twirl.api.HtmlFormat.Appendable) = (musicTypes,artists) => apply(musicTypes,artists)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 15:38:39 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/leftCategory.scala.html
                  HASH: a6ccea7878dd9718c2d36512f4f7898e44d859aa
                  MATRIX: 752->1|892->53|922->57|1240->349|1298->398|1337->399|1374->409|1468->485|1481->489|1520->490|1558->501|1589->523|1628->524|1665->534|1767->609|1805->631|1844->632|1887->647|1951->684|1966->690|1993->696|2040->712|2082->723|2135->749|2169->774|2208->775|2247->786|2352->864|2396->892|2435->893|2475->905|2539->942|2557->951|2583->956|2630->972|2672->983|2712->993|2746->1000
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|47->19|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|54->26|55->27|56->28
                  -- GENERATED --
              */
          