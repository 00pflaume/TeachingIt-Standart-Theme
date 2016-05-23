package de.simonbrungs.teachingit.theme;

import de.simonbrungs.teachingit.TeachingIt;
import de.simonbrungs.teachingit.api.plugin.theme.ErrorPageContentGenerator;
import de.simonbrungs.teachingit.api.plugin.theme.Theme;
import de.simonbrungs.teachingit.api.users.TempUser;

public class MainTheme extends Theme {
	Errors errors = new Errors();

	@Override
	public String getBodyEnd(TempUser arg0) {
		return "</div><footer class='footer'><ul class='listeul'><a href='http://simonsator.de/' class='footerLink'>"
				+ "©Simonsator</a></ul><ul class='listeul'>Developer: Simon 'Simonsator' Brungs'</ul></footer>";
	}

	@Override
	public String getBodyStart(TempUser arg0) {
		return "<body class='body'>" + "<div class='kopf'>"
				+ " <nav class='navbar navbar-inverse navbar-static-top ng-scope' id='site-nav' role='navigation'>"
				+ " <div class='container'> <div align='center'>" + " <a class='navbar-brand' href='http://"
				+ TeachingIt.getInstance().getHomeDirectory() + "'> "
				+ "<img src='https://fanart.tv/fanart/music/ddeb3502-8693-4619-b41d-263105f84477"
				+ "/musiclogo/example-4e0660c8549ac.png' alt='TeachingIT' " + "class='logo' width='310'> </a> </div>"
				+ " <div style='height: 0px;' class='navbar-collapse collapse' id='navbar-collapse-1'> "
				+ "<ul class='nav navbar-nav navbar-right'> </ul> </div> </div> </nav> </div> " + "" + "" + "" + "" + ""
				+ "<div class='mitte'>";
	}

	@Override
	public ErrorPageContentGenerator getErrorPageGenerator() {
		return errors;
	}

	@Override
	public String getHeader() {
		return "<style type='text/css'>" + ".kopf {background-color: #3498db;}"
				+ ".body { color:#2c3e50; margin: 0px; padding; 0 px; height: 100%; width: 100%; font-family: Calibri; } "
				+ ".logo { margin-top: 1%; margin-bottom: 1%; } "
				+ ".mitte { margin-left: 25%; margin-right: 25%; width: 50%; margin-top: 4%; margin-bottom: 200px;"
				+ " box-shadow: 0px 2px 5px 0px rgba(0, 0, 0, 0.26); padding: 1%; }"
				+ " .geschrieben { color:#2c3e50; margin-left:2%; margin-right:2%; min-width:92%;"
				+ " background-color:#2ecc71;" + " padding: 2%; box-shadow: 0px 2px 5px 0px rgba(0, 0, 0, 0.26); }"
				+ " .joinend { color:#2c3e50; margin-left:2%; margin-right:2%; min-width:92%; background-color:#16a085;"
				+ " padding: 2%; box-shadow: 0px 2px 5px 0px rgba(0, 0, 0, 0.26); } "
				+ ".left { color:#2c3e50; margin-left:2%; margin-right:2%; min-width:92%; background-color:#e74c3c;"
				+ " padding: 2%; box-shadow: 0px 2px 5px 0px rgba(0, 0, 0, 0.26); } "
				+ ".chatlog { color:#2c3e50; margin-left:2%; margin-right:2%; min-width:92%; background-color:#f39c12;"
				+ " padding: 2%; box-shadow: 0px 2px 5px 0px rgba(0, 0, 0, 0.26); } "
				+ "h1 { text-align: center; color:#2980b9; } "
				+ ".footer { text-align: center; padding: 30px 0px; margin-top: 70px;"
				+ " border-top: 1px solid #E5E5E5; clear: both;"
				+ " font-size: 14px; background-color: #ecf0f1; margin-bottom: 0%; color: #565656;"
				+ " white-space: nowrap; position: fixed; bottom: 0px; width: 100%; } "
				+ ".listeul {display: inline-block;list-style: outside none none;width: 716px;color: #565656;} "
				+ ".footerLink {text-decoration: none;color: #565656;}</style>";
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub

	}

}
