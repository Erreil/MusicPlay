
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

Seq[Any](format.raw/*1.2*/("""<div class="row">
		<div class="span12">
			<div class="panel panel-default navbar-fixed-bottom">
				<div class="panel-body">
					<audio controls style="width:100%">
						<source src="test.mp3" type="audio/mpeg">
					</audio> 
				</div>
				<div class="panel-footer">Songtitel</div>
			</div>
		</div>
	</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 16:11:23 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/footerPlayer.scala.html
                  HASH: e8d7b155fad376709797fd4b98a3f676b9cb8187
                  MATRIX: 805->1
                  LINES: 29->1
                  -- GENERATED --
              */
          