
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
					"""),_display_(/*10.7*/if(artists.size() <= 0 && musicTypes.size() <= 0)/*10.56*/{_display_(Seq[Any](format.raw/*10.57*/("""
							"""),format.raw/*11.8*/("""<a href="#" class="list-group-item">Keine Kategorien vorhanden</a>
						""")))}/*12.8*/else/*12.12*/{_display_(Seq[Any](format.raw/*12.13*/("""
							"""),_display_(/*13.9*/if(artists.size() > 0)/*13.31*/{_display_(Seq[Any](format.raw/*13.32*/("""
							"""),format.raw/*14.8*/("""<div class="list-group" id="artistGroup">
								<a href="#" class="list-group-item active" id="artistActiveItem"> Artist </a>								
									"""),_display_(/*16.11*/for(artist <- artists) yield /*16.33*/{_display_(Seq[Any](format.raw/*16.34*/("""				
									"""),format.raw/*17.10*/("""<a href="#" class="list-group-item">"""),_display_(/*17.47*/artist/*17.53*/.getAlias()),format.raw/*17.64*/("""</a>
									""")))}),format.raw/*18.11*/("""
								""")))}),format.raw/*19.10*/("""
							"""),format.raw/*20.8*/("""</div>
												
							"""),_display_(/*22.9*/if(musicTypes.size() > 0)/*22.34*/{_display_(Seq[Any](format.raw/*22.35*/("""
								"""),format.raw/*23.9*/("""<div class="list-group" id="musicTypeGroup">
									<a href="#" class="list-group-item active"> Musikart </a>									
									"""),_display_(/*25.11*/for(musicType <- musicTypes) yield /*25.39*/{_display_(Seq[Any](format.raw/*25.40*/("""
										"""),format.raw/*26.11*/("""<a href="#" class="list-group-item">"""),_display_(/*26.48*/musicType/*26.57*/.getType()),format.raw/*26.67*/("""</a>
									""")))}),format.raw/*27.11*/("""
								"""),format.raw/*28.9*/("""</div>
							""")))}),format.raw/*29.9*/("""
						""")))}),format.raw/*30.8*/("""
				"""),format.raw/*31.5*/("""</div>
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
                  DATE: Sat Jan 10 11:29:28 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/leftCategory.scala.html
                  HASH: c07c48668f1218eaa10375a26bee806606d5dff2
                  MATRIX: 752->1|892->53|922->57|1208->317|1266->366|1305->367|1341->376|1434->451|1447->455|1486->456|1522->466|1553->488|1592->489|1628->498|1803->646|1841->668|1880->669|1923->684|1987->721|2002->727|2034->738|2081->754|2123->765|2159->774|2215->804|2249->829|2288->830|2325->840|2485->973|2529->1001|2568->1002|2608->1014|2672->1051|2690->1060|2721->1070|2768->1086|2805->1096|2851->1112|2890->1121|2923->1127
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|47->19|48->20|50->22|50->22|50->22|51->23|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|56->28|57->29|58->30|59->31
                  -- GENERATED --
              */
          