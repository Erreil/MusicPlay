
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
object apaddartist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Artist],Form[Artist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artists: List[Artist], artistForm: Form[Artist]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Artist hinzufügen")/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""

"""),_display_(/*8.2*/aphead()),format.raw/*8.10*/("""
"""),format.raw/*9.1*/("""<div class="row">

    """),_display_(/*11.6*/apleftcategory()),format.raw/*11.22*/("""
    """),format.raw/*12.5*/("""<div class="span8">
        <div class="navbar-left container">
		
			<!-- Panel -->
            <div class="panel panel-default">
                <div class="panel-body">
				
				
					<!-- Erstellen -->
						<div class="panel panel-success">
							<div class="panel-heading">Erstellen</div>
							<div class="panel-body">
			
										"""),_display_(/*25.12*/helper/*25.18*/.form(action = routes.Application.newArtist(), 'id -> "artistForm", 'onsubmit -> "return chkFormularArtist()", 'name -> "Formular")/*25.149*/{_display_(Seq[Any](format.raw/*25.150*/("""
											"""),_display_(/*26.13*/helper/*26.19*/.inputText(artistForm("Firstname"))),format.raw/*26.54*/("""
											"""),_display_(/*27.13*/helper/*27.19*/.inputText(artistForm("Lastname"))),format.raw/*27.53*/("""
											"""),_display_(/*28.13*/helper/*28.19*/.inputText(artistForm("Alias"))),format.raw/*28.50*/("""
											"""),_display_(/*29.13*/helper/*29.19*/.inputText(artistForm("CountryId"))),format.raw/*29.54*/("""
											
											"""),format.raw/*31.12*/("""<input type="submit" value="Anlegen">							
										""")))}),format.raw/*32.12*/("""
										
										"""),format.raw/*34.11*/("""<br/>
										
										<p>Country Ids: Deutschland: 1 Amerika: 2 UK: 3</p>

							</div>
						</div>
					<!-- Erstellen -->
										
					<!-- Progressbar -->
					<p>
						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;>
								<span class="sr-only"></span>
							</div>
						</div>
					</p>
					<!-- Progressbar -->
                    		
					<!-- Table -->
					<div class="panel panel-info">
						<div class="panel-heading">Verfügbare Künstler</div>
						<div class="panel-body">								
							<table class="table" id ="artistTable">
								<thead>
									<tr>
										<th> Id </th>
										<th> Alias </th>
										<th> Vorname </th>
										<th> Nachname </th>
										<th> Land </th>
									</tr>
								</thead>
								<tbody>
									"""),_display_(/*67.11*/for(artist <- artists) yield /*67.33*/{_display_(Seq[Any](format.raw/*67.34*/("""
										"""),format.raw/*68.11*/("""<tr>
											<td>"""),_display_(/*69.17*/artist/*69.23*/.getId()),format.raw/*69.31*/("""</td>
											<td>"""),_display_(/*70.17*/artist/*70.23*/.getAlias()),format.raw/*70.34*/("""</td>
											<td>"""),_display_(/*71.17*/artist/*71.23*/.getFirstname()),format.raw/*71.38*/("""</td>
											<td>"""),_display_(/*72.17*/artist/*72.23*/.getLastname()),format.raw/*72.37*/("""</td>
											<td>"""),_display_(/*73.17*/artist/*73.23*/.getCountry().getName()),format.raw/*73.46*/("""</td>
											<td>
												<input type="checkbox">
											</td>
										</tr>
									""")))}),format.raw/*78.11*/("""
								"""),format.raw/*79.9*/("""</tbody>
							</table>				
						</div>
					</div>
					<!-- Table -->
					
					<!-- Delete -->
						<form class="navbar-form navbar-right" role="search">
								<button type="button" class="btn btn-primary" onclick="readSelectedArtists();">Ausgewählte löschen</button>
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

  def render(artists:List[Artist],artistForm:Form[Artist]): play.twirl.api.HtmlFormat.Appendable = apply(artists,artistForm)

  def f:((List[Artist],Form[Artist]) => play.twirl.api.HtmlFormat.Appendable) = (artists,artistForm) => apply(artists,artistForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 22 21:37:53 CET 2015
                  SOURCE: C:/FH2/Web_Projekt/Master/MusicPlay/app/views/apaddartist.scala.html
                  HASH: e5b0a8f56df9a6bbedacd2adb7141ea235fef8e1
                  MATRIX: 748->1|933->50|963->107|991->110|1024->135|1062->136|1092->141|1120->149|1148->151|1200->177|1237->193|1270->199|1653->555|1668->561|1809->692|1849->693|1890->707|1905->713|1961->748|2002->762|2017->768|2072->802|2113->816|2128->822|2180->853|2221->867|2236->873|2292->908|2346->934|2434->991|2486->1015|3429->1931|3467->1953|3506->1954|3546->1966|3595->1988|3610->1994|3639->2002|3689->2025|3704->2031|3736->2042|3786->2065|3801->2071|3837->2086|3887->2109|3902->2115|3937->2129|3987->2152|4002->2158|4046->2181|4183->2287|4220->2297
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|36->9|38->11|38->11|39->12|52->25|52->25|52->25|52->25|53->26|53->26|53->26|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|58->31|59->32|61->34|94->67|94->67|94->67|95->68|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|100->73|100->73|100->73|105->78|106->79
                  -- GENERATED --
              */
          