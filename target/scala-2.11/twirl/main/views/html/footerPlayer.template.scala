
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
object footerPlayer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.2*/("""<script type="text/javascript">
	
		$(document).ready(function()"""),format.raw/*4.31*/("""{"""),format.raw/*4.32*/("""
		
			"""),format.raw/*6.4*/("""$('#hideShow').click(function()"""),format.raw/*6.35*/("""{"""),format.raw/*6.36*/("""				
				"""),format.raw/*7.5*/("""var name = $('#hideShow').text();
				
				if(name == "Verstecken")"""),format.raw/*9.29*/("""{"""),format.raw/*9.30*/("""
					"""),format.raw/*10.6*/("""$('#hideShow').text("Anzeigen");
					$('#songBarII').hide();
				"""),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""else"""),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
					"""),format.raw/*13.6*/("""$('#hideShow').text("Verstecken");
					$('#songBarII').show();
				"""),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""

			"""),format.raw/*17.4*/("""}"""),format.raw/*17.5*/(""");

		"""),format.raw/*19.3*/("""}"""),format.raw/*19.4*/(""");
	</script>

	<div class="row">
		<div class="span12">
			<div class="panel panel-default navbar-fixed-bottom">
				<div class="pull-right" id="songBarI">
					<button type="button" class="btn btn-default btn-xs" id="hideShow">Verstecken</button>
				</div> 
				<div class="panel-body" id="songBarII">	
					
					<audio controls style="width:100%" id="audioPlayer">
						<source src=""""),_display_(/*31.21*/routes/*31.27*/.Assets.at("music/Psycho Metal - Freestyle Skills.mp3")),format.raw/*31.82*/("""" type="audio/mpeg" />					
					</audio>
													
					<div class="panel-footer" id="songTitel">Songtitel</div>
				</div>				
			</div>
		</div>
	</div>
	
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 12 00:19:01 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/footerPlayer.scala.html
                  HASH: e730893797692942a7949ad91b3c689b25bcdee1
                  MATRIX: 805->3|898->69|926->70|961->79|1019->110|1047->111|1083->121|1179->190|1207->191|1241->198|1336->266|1364->267|1396->271|1425->272|1459->279|1556->349|1584->350|1618->357|1646->358|1681->366|1709->367|2138->769|2153->775|2229->830
                  LINES: 29->2|31->4|31->4|33->6|33->6|33->6|34->7|36->9|36->9|37->10|39->12|39->12|39->12|39->12|40->13|42->15|42->15|44->17|44->17|46->19|46->19|58->31|58->31|58->31
                  -- GENERATED --
              */
          