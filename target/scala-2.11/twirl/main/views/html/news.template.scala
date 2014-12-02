
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
object news extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[NewsEntry],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newsList: List[NewsEntry]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<div class="col-md-2">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<h3 class="panel-title">News</h3>	
		</div>
		<div class="panel-body">

					"""),_display_(/*10.7*/for(news <- newsList) yield /*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
						"""),format.raw/*11.7*/("""<div class="panel panel-default">
							<div class="panel-heading">
								<span style="font-size:20px">"""),_display_(/*13.39*/news/*13.43*/.Headline),format.raw/*13.52*/(""" """),format.raw/*13.53*/("""</span>
							</div>
							<div class="panel-body">
								<img src=""""),_display_(/*16.20*/routes/*16.26*/.Assets.at("images/busta.jpg")),format.raw/*16.56*/("""" alt="Kein Bild" class="img-responsive img-rounded">
							</div>
							<div class="panel-footer">
								"""),_display_(/*19.10*/news/*19.14*/.ShortDescription),format.raw/*19.31*/("""
							"""),format.raw/*20.8*/("""</div>
						</div>
					""")))}),format.raw/*22.7*/("""				
			"""),format.raw/*23.4*/("""</div>
			
			

		</div>
	</div>
</div>
"""))}
  }

  def render(newsList:List[NewsEntry]): play.twirl.api.HtmlFormat.Appendable = apply(newsList)

  def f:((List[NewsEntry]) => play.twirl.api.HtmlFormat.Appendable) = (newsList) => apply(newsList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 16:37:43 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/news.scala.html
                  HASH: a79990b040502fd7e784845522c90841473e376c
                  MATRIX: 731->1|846->28|876->32|1077->207|1114->228|1153->229|1188->237|1324->346|1337->350|1367->359|1396->360|1499->436|1514->442|1565->472|1706->586|1719->590|1757->607|1793->616|1851->644|1887->653
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|39->11|41->13|41->13|41->13|41->13|44->16|44->16|44->16|47->19|47->19|47->19|48->20|50->22|51->23
                  -- GENERATED --
              */
          