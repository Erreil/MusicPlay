
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
object aphead extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Firstname: String, Lastname: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""	
		
"""),format.raw/*3.1*/("""<div class="row">
	<div class="span12">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="navbar-form">
					<h2><span class="label label-danger">Admin Panel</span></h2>
				</div>
				<br/>
				<div class="navbar-form">
				<p>Angemeldeter Benutzer:</p>
				<h3><span class="label label-info">"""),_display_(/*13.41*/Firstname),format.raw/*13.50*/(""" """),_display_(/*13.52*/Lastname),format.raw/*13.60*/("""</span></h3>		
				</div>
			</div>
		</div>
	</div>
</div>"""))}
  }

  def render(Firstname:String,Lastname:String): play.twirl.api.HtmlFormat.Appendable = apply(Firstname,Lastname)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (Firstname,Lastname) => apply(Firstname,Lastname)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 22:04:00 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/aphead.scala.html
                  HASH: 7b50277a57d056a65375f32582b1915041f8f26a
                  MATRIX: 731->1|856->38|889->45|1251->380|1281->389|1310->391|1339->399
                  LINES: 26->1|29->1|31->3|41->13|41->13|41->13|41->13
                  -- GENERATED --
              */
          