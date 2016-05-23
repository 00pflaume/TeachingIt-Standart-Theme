package de.simonbrungs.teachingit.theme;

import de.simonbrungs.teachingit.api.events.ContentCreateEvent;
import de.simonbrungs.teachingit.api.plugin.theme.ErrorPageContentGenerator;

public class Errors extends ErrorPageContentGenerator {

	@Override
	public ContentCreateEvent getErrorPageNotFound(ContentCreateEvent arg0) {
		arg0.setContent("<h1>Error 404</h1> Content not found");
		return arg0;
	}

}
