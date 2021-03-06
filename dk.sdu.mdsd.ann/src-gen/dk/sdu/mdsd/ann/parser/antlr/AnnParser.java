/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.parser.antlr;

import com.google.inject.Inject;
import dk.sdu.mdsd.ann.parser.antlr.internal.InternalAnnParser;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AnnParser extends AbstractAntlrParser {

	@Inject
	private AnnGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAnnParser createParser(XtextTokenStream stream) {
		return new InternalAnnParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ANNModel";
	}

	public AnnGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnnGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
