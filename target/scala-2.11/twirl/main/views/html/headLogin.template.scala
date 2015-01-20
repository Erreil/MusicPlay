
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
object headlogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""﻿

<div class="container-fluid">
	<div class="row">
		<div class="span12">
		
			
		
			<!-- panel -->
			<div class="panel panel-default">
				<div class="panel-body">
				
					
				
					<!-- search -->

					<datalist id="Liste">
					</datalist>
					
					"""),_display_(/*20.7*/helper/*20.13*/.form(routes.Application.songsBySearch, 'class -> "navbar-form navbar-left")/*20.89*/ {_display_(Seq[Any](format.raw/*20.91*/("""
						"""),format.raw/*21.7*/("""<div class="form-group">	
							<a href=""""),_display_(/*22.18*/routes/*22.24*/.Application.index()),format.raw/*22.44*/(""""><img src=""""),_display_(/*22.57*/routes/*22.63*/.Assets.at("images/logo.jpg")),format.raw/*22.92*/(""""></a>
							<input class="form-control" placeholder="Titel" id="search" onkeyup="sendSearch()" name="search" list="Liste"/>
							<button type="submit" class="btn btn-default">Suchen</a></button>
						</div>
					
					""")))}),format.raw/*27.7*/("""

					"""),format.raw/*29.6*/("""<!-- search -->	

					<!-- login-->
							"""),_display_(/*32.9*/if(session.get("username") == null)/*32.44*/{_display_(Seq[Any](format.raw/*32.45*/("""	
									"""),format.raw/*33.10*/("""<div class="navbar-form navbar-right">																
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*34.67*/routes/*34.73*/.Application.authenticateAdmin()),format.raw/*34.105*/("""" style="color:white">Anmelden</a> </button>	
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*35.67*/routes/*35.73*/.Application.signup()),format.raw/*35.94*/("""" style="color:white">Signup</a> </button>	
									</div>					
							""")))}/*37.9*/else/*37.13*/{_display_(Seq[Any](format.raw/*37.14*/("""
								"""),format.raw/*38.9*/("""<div class="navbar-form navbar-right">
									<h3>Willkommen <span class="label label-info">"""),_display_(/*39.57*/session/*39.64*/.get("username")),format.raw/*39.80*/("""</span></h3>
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*40.67*/routes/*40.73*/.Application.logoutUser()),format.raw/*40.98*/("""" style="color:white">Abmelden</a> </button>
								</div>
							""")))}),format.raw/*42.9*/("""
					"""),format.raw/*43.6*/("""<!--login -->	
					
				</div>
			</div>
			<!-- panel -->
			
		</div>
	</div>
</div>

<script type="text/javascript">
	
	 var webSocket;
	
  $(function() """),format.raw/*57.16*/("""{"""),format.raw/*57.17*/("""
 """),format.raw/*58.2*/("""var WS = window["MozWebSocket"] ? MozWebSocket : WebSocket;
 webSocket = new WS('"""),_display_(/*59.23*/routes/*59.29*/.Application.searchResult().webSocketURL()),format.raw/*59.71*/("""');
 webSocket.onmessage = receiveEvent;
 """),format.raw/*61.2*/("""}"""),format.raw/*61.3*/(""")
 
  function sendSearch() """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
  	"""),format.raw/*64.4*/("""$("#Liste").html("");
 var g = $("#search").val();
 webSocket.send(g);
 """),format.raw/*67.2*/("""}"""),format.raw/*67.3*/(""";
 
 function receiveEvent(event) """),format.raw/*69.31*/("""{"""),format.raw/*69.32*/("""
		"""),format.raw/*70.3*/("""var lines = event.data.split(';');
		$("#Liste").html("");
		
		$.each( lines, function( index, value )"""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
   	"""),format.raw/*74.5*/("""$("#Liste").append("<option>" + value + "</option>");
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/(""");		
 """),format.raw/*76.2*/("""}"""),format.raw/*76.3*/(""";
 
 </script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 15 20:26:54 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/headlogin.scala.html
                  HASH: b7226e296b964ab069490a69e07a3a32e0d0521f
                  MATRIX: 802->0|1110->282|1125->288|1210->364|1250->366|1285->374|1356->418|1371->424|1412->444|1452->457|1467->463|1517->492|1776->721|1812->730|1886->778|1930->813|1969->814|2009->826|2158->948|2173->954|2227->986|2367->1099|2382->1105|2424->1126|2517->1201|2530->1205|2569->1206|2606->1216|2729->1312|2745->1319|2782->1335|2889->1415|2904->1421|2950->1446|3050->1516|3084->1523|3283->1694|3312->1695|3342->1698|3452->1781|3467->1787|3530->1829|3601->1873|3629->1874|3687->1904|3716->1905|3748->1910|3850->1985|3878->1986|3942->2022|3971->2023|4002->2027|4136->2133|4165->2134|4198->2140|4282->2197|4310->2198|4344->2205|4372->2206
                  LINES: 29->1|48->20|48->20|48->20|48->20|49->21|50->22|50->22|50->22|50->22|50->22|50->22|55->27|57->29|60->32|60->32|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|71->43|85->57|85->57|86->58|87->59|87->59|87->59|89->61|89->61|91->63|91->63|92->64|95->67|95->67|97->69|97->69|98->70|101->73|101->73|102->74|103->75|103->75|104->76|104->76
                  -- GENERATED --
              */
          