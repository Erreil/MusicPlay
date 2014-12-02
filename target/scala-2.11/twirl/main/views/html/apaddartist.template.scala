
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
object apaddartist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Artist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artists: List[Artist]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*2.2*/main("Artist hinzufügen")/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""

"""),_display_(/*4.2*/aphead("Inan", "Ödunc")),format.raw/*4.25*/("""
"""),format.raw/*5.1*/("""<div class="row">

    """),_display_(/*7.6*/apleftcategory()),format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<div class="span8">
        <div class="navbar-left container">
		
			<!-- Panel -->
            <div class="panel panel-default">
                <div class="panel-body">
				
				
					<!-- Erstellen -->
						<div class="panel panel-success">
							<div class="panel-heading">Erstellen</div>
							<div class="panel-body">
								<form class="navbar-form" role="search">
									<div class="form-group">
										<input type="text" class="form-control" placeholder="Vorname" id="Firstname" />
										<input type="text" class="form-control" placeholder="Lastname" id="Lastname" />
										<input type="text" class="form-control" placeholder="Alias" id="Alias" />
										<button type="submit" class="btn btn-success">Hinzufügen</button>
									</div>
								</form>
							</div>
						</div>
					<!-- Erstellen -->
										
					<!-- Progressbar -->
					<p>
						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;>
								<span class="sr-only">60% abgeschlossen</span>
							</div>
						</div>
					</p>
					<!-- Progressbar -->
                    		
					<!-- Table -->
					<div class="panel panel-info">
						<div class="panel-heading">Verfügbare Künstler</div>
						<div class="panel-body">								
							<table class="table">
								<thead>
									<tr>
										<th> Id </th>
										<th> Alias </th>
										<th> Vorname </th>
										<th> Nachname </th>
									</tr>
								</thead>
								<tbody>
									"""),_display_(/*56.11*/for(artist <- artists) yield /*56.33*/{_display_(Seq[Any](format.raw/*56.34*/("""
										"""),format.raw/*57.11*/("""<tr>
											<td>"""),_display_(/*58.17*/artist/*58.23*/.Id),format.raw/*58.26*/("""</td>
											<td>"""),_display_(/*59.17*/artist/*59.23*/.Alias),format.raw/*59.29*/("""</td>
											<td>"""),_display_(/*60.17*/artist/*60.23*/.Firstname),format.raw/*60.33*/("""</td>
											<td>"""),_display_(/*61.17*/artist/*61.23*/.Lastname),format.raw/*61.32*/("""</td>
											<td>
												<input type="checkbox">
											</td>
										</tr>
									""")))}),format.raw/*66.11*/("""
								"""),format.raw/*67.9*/("""</tbody>
							</table>				
						</div>
					</div>
					<!-- Table -->
					
					<!-- Delete -->
						<form class="navbar-form navbar-right" role="search">
								<button type="button" class="btn btn-primary">Ausgewählte löschen</button>
						</form>
					<!-- Delete -->

				</div>
			</div>			
			<!-- Panel -->
			
		</div>
	</div>
</div>
""")))}))}
  }

  def render(artists:List[Artist]): play.twirl.api.HtmlFormat.Appendable = apply(artists)

  def f:((List[Artist]) => play.twirl.api.HtmlFormat.Appendable) = (artists) => apply(artists)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 12:35:21 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/apaddartist.scala.html
                  HASH: 55338bc080581556df9ed596cb7632d87c133095
                  MATRIX: 735->1|846->24|874->27|907->52|945->53|975->58|1018->81|1046->83|1097->109|1133->125|1165->131|2800->1739|2838->1761|2877->1762|2917->1774|2966->1796|2981->1802|3005->1805|3055->1828|3070->1834|3097->1840|3147->1863|3162->1869|3193->1879|3243->1902|3258->1908|3288->1917|3425->2023|3462->2033
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|33->5|35->7|35->7|36->8|84->56|84->56|84->56|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|94->66|95->67
                  -- GENERATED --
              */
          