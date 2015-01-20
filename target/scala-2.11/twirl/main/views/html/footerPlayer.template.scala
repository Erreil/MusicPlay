
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

Seq[Any](format.raw/*1.1*/("""﻿
	<script type="text/javascript">
	
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
					
					<audio controls autoplay style="width:100%" id="audioPlayer">			
					</audio>
													
					<div class="panel-footer" id="songTitel"></div>
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
                  DATE: Thu Jan 15 20:26:54 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/footerPlayer.scala.html
                  HASH: 9eb6b15b401736a12e37696952e9240be92c1094
                  MATRIX: 805->0|902->70|930->71|965->80|1023->111|1051->112|1087->122|1183->191|1211->192|1245->199|1340->267|1368->268|1400->272|1429->273|1463->280|1560->350|1588->351|1622->358|1650->359|1685->367|1713->368
                  LINES: 29->1|32->4|32->4|34->6|34->6|34->6|35->7|37->9|37->9|38->10|40->12|40->12|40->12|40->12|41->13|43->15|43->15|45->17|45->17|47->19|47->19
                  -- GENERATED --
              */
          