
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("SignIn")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
	"""),format.raw/*3.2*/("""<div>
	
		<!-- header -->
		<div class="panel panel-default">
		  <div class="panel-body">			
			<div class="navbar-form">
				<h2><span class="label label-primary">Sign Up</span></h2>
			</div>				
		  </div>
		</div>
		<!-- header -->
		
		<!-- Formular -->
		<div class="panel panel-default">
			<div class="panel-body">		
				<div class="panel panel-success">
					<div class="panel-heading">Bitte geben Sie folgenden Daten ein:</div>
					<div class="panel-body">
						<div class="input-group">
							<span class="input-group-addon">Vorname:</span>
							<input type="text" class="form-control">
							<span class="input-group-addon">Nachname:</span>
							<input type="text" class="form-control">
						</div>
						<div class="input-group">
							<span class="input-group-addon">E-Mail:</span>
							<input type="text" class="form-control">
							<span class="input-group-addon">Telefon:</span>
							<input type="text" class="form-control">
						</div>
						<div class="input-group">
							<span class="input-group-addon">PLZ:</span>
							<input type="text" class="form-control">
							<span class="input-group-addon">Wohnort:</span>
							<input type="text" class="form-control">
						</div>
						<div class="input-group">
							<span class="input-group-addon">Straße:</span>
							<input type="text" class="form-control">
							<span class="input-group-addon">Straßennummer:</span>
							<input type="text" class="form-control">
						</div>
						<div class="input-group">
							<span class="input-group-addon">Passwort:</span>
							<input type="text" class="form-control">
							<span class="input-group-addon">Passwort wiederholen:</span>
							<input type="text" class="form-control">
						</div>
					</div>
				</div>
				
				<form class="navbar-form navbar-right" role="search">
					<button type="submit" class="btn btn-success">Registrieren</button>
				</form>
			</div>
				
		</div>
			<!-- Formular -->			
	</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 16:42:48 CET 2014
                  SOURCE: C:/FH2/Web_Projekt/musicplay/app/views/signup.scala.html
                  HASH: 53eec027103e75f39e5e6cef3b78e48171530b8f
                  MATRIX: 799->3|821->17|859->18|888->21
                  LINES: 29->2|29->2|29->2|30->3
                  -- GENERATED --
              */
          