
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

Seq[Any](format.raw/*3.1*/("""<div class="container-fluid">
	<div class="row">
		<div class="span12">
		
			
		
			<!-- panel -->
			<div class="panel panel-default">
				<div class="panel-body">
				
					
				
					<!-- search -->
					
					<a href=""""),_display_(/*17.16*/routes/*17.22*/.Application.index()),format.raw/*17.42*/(""""><img src=""""),_display_(/*17.55*/routes/*17.61*/.Assets.at("images/logo.jpg")),format.raw/*17.90*/(""""></a>
					
					<datalist id="Liste">
					</datalist>
					
					"""),_display_(/*22.7*/helper/*22.13*/.form(routes.Application.songsBySearch, 'class -> "navbar-form navbar-left")/*22.89*/ {_display_(Seq[Any](format.raw/*22.91*/("""
						"""),format.raw/*23.7*/("""<div class="form-group">	
							<input class="form-control" placeholder="Titel" id="search" onkeyup="sendSearch()" name="search" list="Liste"/>
							<button type="submit" class="btn btn-default">Suchen</a></button>
						</div>
					
					""")))}),format.raw/*28.7*/("""

					"""),format.raw/*30.6*/("""<!-- search -->	

					<!-- login-->
							"""),_display_(/*33.9*/if(session.get("username") == null)/*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""	
									"""),format.raw/*34.10*/("""<div class="navbar-form navbar-right">																
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*35.67*/routes/*35.73*/.Application.authenticateAdmin()),format.raw/*35.105*/("""" style="color:white">Anmelden</a> </button>	
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*36.67*/routes/*36.73*/.Application.signup()),format.raw/*36.94*/("""" style="color:white">Signup</a> </button>	
									</div>					
							""")))}/*38.9*/else/*38.13*/{_display_(Seq[Any](format.raw/*38.14*/("""
								"""),format.raw/*39.9*/("""<div class="navbar-form navbar-right">
									<h3>Willkommen <span class="label label-info">"""),_display_(/*40.57*/session/*40.64*/.get("username")),format.raw/*40.80*/("""</span></h3>
									<button type="button" class="btn btn-primary"> <a href=""""),_display_(/*41.67*/routes/*41.73*/.Application.logoutUser()),format.raw/*41.98*/("""" style="color:white">Abmelden</a> </button>
								</div>
							""")))}),format.raw/*43.9*/("""
					"""),format.raw/*44.6*/("""<!--login -->	
					
				</div>
			</div>
			<!-- panel -->
			
		</div>
	</div>
</div>

<script type="text/javascript">
	
	 var webSocket;
	
  $(function() """),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
 """),format.raw/*59.2*/("""var WS = window["MozWebSocket"] ? MozWebSocket : WebSocket;
 webSocket = new WS('"""),_display_(/*60.23*/routes/*60.29*/.Application.searchResult().webSocketURL()),format.raw/*60.71*/("""');
 webSocket.onmessage = receiveEvent;
 """),format.raw/*62.2*/("""}"""),format.raw/*62.3*/(""")
 
  function sendSearch() """),format.raw/*64.25*/("""{"""),format.raw/*64.26*/("""
  	"""),format.raw/*65.4*/("""$("#Liste").html("");
 var g = $("#search").val();
 webSocket.send(g);
 """),format.raw/*68.2*/("""}"""),format.raw/*68.3*/(""";
 
 function receiveEvent(event) """),format.raw/*70.31*/("""{"""),format.raw/*70.32*/("""
		"""),format.raw/*71.3*/("""var lines = event.data.split(';');
		$("#Liste").html("");
		
		$.each( lines, function( index, value )"""),format.raw/*74.42*/("""{"""),format.raw/*74.43*/("""
   	"""),format.raw/*75.5*/("""$("#Liste").append("<option>" + value + "</option>");
		"""),format.raw/*76.3*/("""}"""),format.raw/*76.4*/(""");		
 """),format.raw/*77.2*/("""}"""),format.raw/*77.3*/(""";
 
 </script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 13 10:56:23 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/headlogin.scala.html
                  HASH: b0d3f6d86edce1428706935f424d9595f0ae2035
                  MATRIX: 802->4|1067->242|1082->248|1123->268|1163->281|1178->287|1228->316|1328->390|1343->396|1428->472|1468->474|1503->482|1781->730|1817->739|1891->787|1935->822|1974->823|2014->835|2163->957|2178->963|2232->995|2372->1108|2387->1114|2429->1135|2522->1210|2535->1214|2574->1215|2611->1225|2734->1321|2750->1328|2787->1344|2894->1424|2909->1430|2955->1455|3055->1525|3089->1532|3288->1703|3317->1704|3347->1707|3457->1790|3472->1796|3535->1838|3606->1882|3634->1883|3692->1913|3721->1914|3753->1919|3855->1994|3883->1995|3947->2031|3976->2032|4007->2036|4141->2142|4170->2143|4203->2149|4287->2206|4315->2207|4349->2214|4377->2215
                  LINES: 29->3|43->17|43->17|43->17|43->17|43->17|43->17|48->22|48->22|48->22|48->22|49->23|54->28|56->30|59->33|59->33|59->33|60->34|61->35|61->35|61->35|62->36|62->36|62->36|64->38|64->38|64->38|65->39|66->40|66->40|66->40|67->41|67->41|67->41|69->43|70->44|84->58|84->58|85->59|86->60|86->60|86->60|88->62|88->62|90->64|90->64|91->65|94->68|94->68|96->70|96->70|97->71|100->74|100->74|101->75|102->76|102->76|103->77|103->77
                  -- GENERATED --
              */
          