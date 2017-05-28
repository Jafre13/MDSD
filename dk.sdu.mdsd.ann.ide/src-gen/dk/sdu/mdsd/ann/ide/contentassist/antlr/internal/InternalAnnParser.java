package dk.sdu.mdsd.ann.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'out'", "'external'", "'('", "')'", "'function'", "'='", "'derivative'", "'e'", "'nlog'", "'sin'", "'cos'", "'sqrt'", "'pow'", "','", "'sigmoid'", "'tansig'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAnnParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnn.g"; }


    	private AnnGrammarAccess grammarAccess;

    	public void setGrammarAccess(AnnGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleANNModel"
    // InternalAnn.g:53:1: entryRuleANNModel : ruleANNModel EOF ;
    public final void entryRuleANNModel() throws RecognitionException {
        try {
            // InternalAnn.g:54:1: ( ruleANNModel EOF )
            // InternalAnn.g:55:1: ruleANNModel EOF
            {
             before(grammarAccess.getANNModelRule()); 
            pushFollow(FOLLOW_1);
            ruleANNModel();

            state._fsp--;

             after(grammarAccess.getANNModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANNModel"


    // $ANTLR start "ruleANNModel"
    // InternalAnn.g:62:1: ruleANNModel : ( ( rule__ANNModel__Group__0 ) ) ;
    public final void ruleANNModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:66:2: ( ( ( rule__ANNModel__Group__0 ) ) )
            // InternalAnn.g:67:2: ( ( rule__ANNModel__Group__0 ) )
            {
            // InternalAnn.g:67:2: ( ( rule__ANNModel__Group__0 ) )
            // InternalAnn.g:68:3: ( rule__ANNModel__Group__0 )
            {
             before(grammarAccess.getANNModelAccess().getGroup()); 
            // InternalAnn.g:69:3: ( rule__ANNModel__Group__0 )
            // InternalAnn.g:69:4: rule__ANNModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANNModel"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalAnn.g:78:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalAnn.g:79:1: ( ruleDECIMAL EOF )
            // InternalAnn.g:80:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalAnn.g:87:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:91:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalAnn.g:92:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalAnn.g:92:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalAnn.g:93:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalAnn.g:94:3: ( rule__DECIMAL__Group__0 )
            // InternalAnn.g:94:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleLayer"
    // InternalAnn.g:103:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalAnn.g:104:1: ( ruleLayer EOF )
            // InternalAnn.g:105:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalAnn.g:112:1: ruleLayer : ( ( rule__Layer__Alternatives ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:116:2: ( ( ( rule__Layer__Alternatives ) ) )
            // InternalAnn.g:117:2: ( ( rule__Layer__Alternatives ) )
            {
            // InternalAnn.g:117:2: ( ( rule__Layer__Alternatives ) )
            // InternalAnn.g:118:3: ( rule__Layer__Alternatives )
            {
             before(grammarAccess.getLayerAccess().getAlternatives()); 
            // InternalAnn.g:119:3: ( rule__Layer__Alternatives )
            // InternalAnn.g:119:4: rule__Layer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleHidden"
    // InternalAnn.g:128:1: entryRuleHidden : ruleHidden EOF ;
    public final void entryRuleHidden() throws RecognitionException {
        try {
            // InternalAnn.g:129:1: ( ruleHidden EOF )
            // InternalAnn.g:130:1: ruleHidden EOF
            {
             before(grammarAccess.getHiddenRule()); 
            pushFollow(FOLLOW_1);
            ruleHidden();

            state._fsp--;

             after(grammarAccess.getHiddenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHidden"


    // $ANTLR start "ruleHidden"
    // InternalAnn.g:137:1: ruleHidden : ( ( rule__Hidden__Group__0 ) ) ;
    public final void ruleHidden() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:141:2: ( ( ( rule__Hidden__Group__0 ) ) )
            // InternalAnn.g:142:2: ( ( rule__Hidden__Group__0 ) )
            {
            // InternalAnn.g:142:2: ( ( rule__Hidden__Group__0 ) )
            // InternalAnn.g:143:3: ( rule__Hidden__Group__0 )
            {
             before(grammarAccess.getHiddenAccess().getGroup()); 
            // InternalAnn.g:144:3: ( rule__Hidden__Group__0 )
            // InternalAnn.g:144:4: rule__Hidden__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHidden"


    // $ANTLR start "entryRuleInput"
    // InternalAnn.g:153:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalAnn.g:154:1: ( ruleInput EOF )
            // InternalAnn.g:155:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalAnn.g:162:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:166:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalAnn.g:167:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalAnn.g:167:2: ( ( rule__Input__Group__0 ) )
            // InternalAnn.g:168:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalAnn.g:169:3: ( rule__Input__Group__0 )
            // InternalAnn.g:169:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:178:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalAnn.g:179:1: ( ruleOutput EOF )
            // InternalAnn.g:180:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnn.g:187:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:191:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalAnn.g:192:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalAnn.g:192:2: ( ( rule__Output__Group__0 ) )
            // InternalAnn.g:193:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalAnn.g:194:3: ( rule__Output__Group__0 )
            // InternalAnn.g:194:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLearningRule"
    // InternalAnn.g:203:1: entryRuleLearningRule : ruleLearningRule EOF ;
    public final void entryRuleLearningRule() throws RecognitionException {
        try {
            // InternalAnn.g:204:1: ( ruleLearningRule EOF )
            // InternalAnn.g:205:1: ruleLearningRule EOF
            {
             before(grammarAccess.getLearningRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getLearningRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLearningRule"


    // $ANTLR start "ruleLearningRule"
    // InternalAnn.g:212:1: ruleLearningRule : ( ( rule__LearningRule__Alternatives ) ) ;
    public final void ruleLearningRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:216:2: ( ( ( rule__LearningRule__Alternatives ) ) )
            // InternalAnn.g:217:2: ( ( rule__LearningRule__Alternatives ) )
            {
            // InternalAnn.g:217:2: ( ( rule__LearningRule__Alternatives ) )
            // InternalAnn.g:218:3: ( rule__LearningRule__Alternatives )
            {
             before(grammarAccess.getLearningRuleAccess().getAlternatives()); 
            // InternalAnn.g:219:3: ( rule__LearningRule__Alternatives )
            // InternalAnn.g:219:4: rule__LearningRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LearningRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLearningRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLearningRule"


    // $ANTLR start "entryRuleActivation"
    // InternalAnn.g:228:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // InternalAnn.g:229:1: ( ruleActivation EOF )
            // InternalAnn.g:230:1: ruleActivation EOF
            {
             before(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_1);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getActivationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // InternalAnn.g:237:1: ruleActivation : ( ( rule__Activation__Alternatives ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:241:2: ( ( ( rule__Activation__Alternatives ) ) )
            // InternalAnn.g:242:2: ( ( rule__Activation__Alternatives ) )
            {
            // InternalAnn.g:242:2: ( ( rule__Activation__Alternatives ) )
            // InternalAnn.g:243:3: ( rule__Activation__Alternatives )
            {
             before(grammarAccess.getActivationAccess().getAlternatives()); 
            // InternalAnn.g:244:3: ( rule__Activation__Alternatives )
            // InternalAnn.g:244:4: rule__Activation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:253:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalAnn.g:254:1: ( ruleExternal EOF )
            // InternalAnn.g:255:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalAnn.g:262:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:266:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalAnn.g:267:2: ( ( rule__External__Group__0 ) )
            {
            // InternalAnn.g:267:2: ( ( rule__External__Group__0 ) )
            // InternalAnn.g:268:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalAnn.g:269:3: ( rule__External__Group__0 )
            // InternalAnn.g:269:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:278:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // InternalAnn.g:279:1: ( ruleCustom EOF )
            // InternalAnn.g:280:1: ruleCustom EOF
            {
             before(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            ruleCustom();

            state._fsp--;

             after(grammarAccess.getCustomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalAnn.g:287:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:291:2: ( ( ( rule__Custom__Group__0 ) ) )
            // InternalAnn.g:292:2: ( ( rule__Custom__Group__0 ) )
            {
            // InternalAnn.g:292:2: ( ( rule__Custom__Group__0 ) )
            // InternalAnn.g:293:3: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // InternalAnn.g:294:3: ( rule__Custom__Group__0 )
            // InternalAnn.g:294:4: rule__Custom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Custom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleExpression"
    // InternalAnn.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAnn.g:304:1: ( ruleExpression EOF )
            // InternalAnn.g:305:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAnn.g:312:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:316:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAnn.g:317:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAnn.g:317:2: ( ( rule__Expression__Group__0 ) )
            // InternalAnn.g:318:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAnn.g:319:3: ( rule__Expression__Group__0 )
            // InternalAnn.g:319:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalAnn.g:328:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalAnn.g:329:1: ( ruleFactor EOF )
            // InternalAnn.g:330:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalAnn.g:337:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:341:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalAnn.g:342:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalAnn.g:342:2: ( ( rule__Factor__Group__0 ) )
            // InternalAnn.g:343:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalAnn.g:344:3: ( rule__Factor__Group__0 )
            // InternalAnn.g:344:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAnn.g:354:1: ( rulePrimary EOF )
            // InternalAnn.g:355:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAnn.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAnn.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAnn.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalAnn.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAnn.g:369:3: ( rule__Primary__Alternatives )
            // InternalAnn.g:369:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMath"
    // InternalAnn.g:378:1: entryRuleMath : ruleMath EOF ;
    public final void entryRuleMath() throws RecognitionException {
        try {
            // InternalAnn.g:379:1: ( ruleMath EOF )
            // InternalAnn.g:380:1: ruleMath EOF
            {
             before(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            ruleMath();

            state._fsp--;

             after(grammarAccess.getMathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalAnn.g:387:1: ruleMath : ( ( rule__Math__Alternatives ) ) ;
    public final void ruleMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:391:2: ( ( ( rule__Math__Alternatives ) ) )
            // InternalAnn.g:392:2: ( ( rule__Math__Alternatives ) )
            {
            // InternalAnn.g:392:2: ( ( rule__Math__Alternatives ) )
            // InternalAnn.g:393:3: ( rule__Math__Alternatives )
            {
             before(grammarAccess.getMathAccess().getAlternatives()); 
            // InternalAnn.g:394:3: ( rule__Math__Alternatives )
            // InternalAnn.g:394:4: rule__Math__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Math__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleEuler"
    // InternalAnn.g:403:1: entryRuleEuler : ruleEuler EOF ;
    public final void entryRuleEuler() throws RecognitionException {
        try {
            // InternalAnn.g:404:1: ( ruleEuler EOF )
            // InternalAnn.g:405:1: ruleEuler EOF
            {
             before(grammarAccess.getEulerRule()); 
            pushFollow(FOLLOW_1);
            ruleEuler();

            state._fsp--;

             after(grammarAccess.getEulerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEuler"


    // $ANTLR start "ruleEuler"
    // InternalAnn.g:412:1: ruleEuler : ( ( rule__Euler__Group__0 ) ) ;
    public final void ruleEuler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:416:2: ( ( ( rule__Euler__Group__0 ) ) )
            // InternalAnn.g:417:2: ( ( rule__Euler__Group__0 ) )
            {
            // InternalAnn.g:417:2: ( ( rule__Euler__Group__0 ) )
            // InternalAnn.g:418:3: ( rule__Euler__Group__0 )
            {
             before(grammarAccess.getEulerAccess().getGroup()); 
            // InternalAnn.g:419:3: ( rule__Euler__Group__0 )
            // InternalAnn.g:419:4: rule__Euler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Euler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEulerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEuler"


    // $ANTLR start "entryRuleNLog"
    // InternalAnn.g:428:1: entryRuleNLog : ruleNLog EOF ;
    public final void entryRuleNLog() throws RecognitionException {
        try {
            // InternalAnn.g:429:1: ( ruleNLog EOF )
            // InternalAnn.g:430:1: ruleNLog EOF
            {
             before(grammarAccess.getNLogRule()); 
            pushFollow(FOLLOW_1);
            ruleNLog();

            state._fsp--;

             after(grammarAccess.getNLogRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNLog"


    // $ANTLR start "ruleNLog"
    // InternalAnn.g:437:1: ruleNLog : ( ( rule__NLog__Group__0 ) ) ;
    public final void ruleNLog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:441:2: ( ( ( rule__NLog__Group__0 ) ) )
            // InternalAnn.g:442:2: ( ( rule__NLog__Group__0 ) )
            {
            // InternalAnn.g:442:2: ( ( rule__NLog__Group__0 ) )
            // InternalAnn.g:443:3: ( rule__NLog__Group__0 )
            {
             before(grammarAccess.getNLogAccess().getGroup()); 
            // InternalAnn.g:444:3: ( rule__NLog__Group__0 )
            // InternalAnn.g:444:4: rule__NLog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NLog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNLogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNLog"


    // $ANTLR start "entryRuleSin"
    // InternalAnn.g:453:1: entryRuleSin : ruleSin EOF ;
    public final void entryRuleSin() throws RecognitionException {
        try {
            // InternalAnn.g:454:1: ( ruleSin EOF )
            // InternalAnn.g:455:1: ruleSin EOF
            {
             before(grammarAccess.getSinRule()); 
            pushFollow(FOLLOW_1);
            ruleSin();

            state._fsp--;

             after(grammarAccess.getSinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalAnn.g:462:1: ruleSin : ( ( rule__Sin__Group__0 ) ) ;
    public final void ruleSin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:466:2: ( ( ( rule__Sin__Group__0 ) ) )
            // InternalAnn.g:467:2: ( ( rule__Sin__Group__0 ) )
            {
            // InternalAnn.g:467:2: ( ( rule__Sin__Group__0 ) )
            // InternalAnn.g:468:3: ( rule__Sin__Group__0 )
            {
             before(grammarAccess.getSinAccess().getGroup()); 
            // InternalAnn.g:469:3: ( rule__Sin__Group__0 )
            // InternalAnn.g:469:4: rule__Sin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalAnn.g:478:1: entryRuleCos : ruleCos EOF ;
    public final void entryRuleCos() throws RecognitionException {
        try {
            // InternalAnn.g:479:1: ( ruleCos EOF )
            // InternalAnn.g:480:1: ruleCos EOF
            {
             before(grammarAccess.getCosRule()); 
            pushFollow(FOLLOW_1);
            ruleCos();

            state._fsp--;

             after(grammarAccess.getCosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalAnn.g:487:1: ruleCos : ( ( rule__Cos__Group__0 ) ) ;
    public final void ruleCos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:491:2: ( ( ( rule__Cos__Group__0 ) ) )
            // InternalAnn.g:492:2: ( ( rule__Cos__Group__0 ) )
            {
            // InternalAnn.g:492:2: ( ( rule__Cos__Group__0 ) )
            // InternalAnn.g:493:3: ( rule__Cos__Group__0 )
            {
             before(grammarAccess.getCosAccess().getGroup()); 
            // InternalAnn.g:494:3: ( rule__Cos__Group__0 )
            // InternalAnn.g:494:4: rule__Cos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalAnn.g:503:1: entryRuleSqrt : ruleSqrt EOF ;
    public final void entryRuleSqrt() throws RecognitionException {
        try {
            // InternalAnn.g:504:1: ( ruleSqrt EOF )
            // InternalAnn.g:505:1: ruleSqrt EOF
            {
             before(grammarAccess.getSqrtRule()); 
            pushFollow(FOLLOW_1);
            ruleSqrt();

            state._fsp--;

             after(grammarAccess.getSqrtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalAnn.g:512:1: ruleSqrt : ( ( rule__Sqrt__Group__0 ) ) ;
    public final void ruleSqrt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:516:2: ( ( ( rule__Sqrt__Group__0 ) ) )
            // InternalAnn.g:517:2: ( ( rule__Sqrt__Group__0 ) )
            {
            // InternalAnn.g:517:2: ( ( rule__Sqrt__Group__0 ) )
            // InternalAnn.g:518:3: ( rule__Sqrt__Group__0 )
            {
             before(grammarAccess.getSqrtAccess().getGroup()); 
            // InternalAnn.g:519:3: ( rule__Sqrt__Group__0 )
            // InternalAnn.g:519:4: rule__Sqrt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSqrtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRulePower"
    // InternalAnn.g:528:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalAnn.g:529:1: ( rulePower EOF )
            // InternalAnn.g:530:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            rulePower();

            state._fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalAnn.g:537:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:541:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalAnn.g:542:2: ( ( rule__Power__Group__0 ) )
            {
            // InternalAnn.g:542:2: ( ( rule__Power__Group__0 ) )
            // InternalAnn.g:543:3: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // InternalAnn.g:544:3: ( rule__Power__Group__0 )
            // InternalAnn.g:544:4: rule__Power__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePartOperator"
    // InternalAnn.g:553:1: entryRulePartOperator : rulePartOperator EOF ;
    public final void entryRulePartOperator() throws RecognitionException {
        try {
            // InternalAnn.g:554:1: ( rulePartOperator EOF )
            // InternalAnn.g:555:1: rulePartOperator EOF
            {
             before(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getPartOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalAnn.g:562:1: rulePartOperator : ( ( rule__PartOperator__Alternatives ) ) ;
    public final void rulePartOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:566:2: ( ( ( rule__PartOperator__Alternatives ) ) )
            // InternalAnn.g:567:2: ( ( rule__PartOperator__Alternatives ) )
            {
            // InternalAnn.g:567:2: ( ( rule__PartOperator__Alternatives ) )
            // InternalAnn.g:568:3: ( rule__PartOperator__Alternatives )
            {
             before(grammarAccess.getPartOperatorAccess().getAlternatives()); 
            // InternalAnn.g:569:3: ( rule__PartOperator__Alternatives )
            // InternalAnn.g:569:4: rule__PartOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalAnn.g:578:1: entryRuleFactorOperator : ruleFactorOperator EOF ;
    public final void entryRuleFactorOperator() throws RecognitionException {
        try {
            // InternalAnn.g:579:1: ( ruleFactorOperator EOF )
            // InternalAnn.g:580:1: ruleFactorOperator EOF
            {
             before(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalAnn.g:587:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:591:2: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // InternalAnn.g:592:2: ( ( rule__FactorOperator__Alternatives ) )
            {
            // InternalAnn.g:592:2: ( ( rule__FactorOperator__Alternatives ) )
            // InternalAnn.g:593:3: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // InternalAnn.g:594:3: ( rule__FactorOperator__Alternatives )
            // InternalAnn.g:594:4: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FactorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:603:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAnn.g:604:1: ( ruleNumberLiteral EOF )
            // InternalAnn.g:605:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAnn.g:612:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:616:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalAnn.g:617:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalAnn.g:617:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalAnn.g:618:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalAnn.g:619:3: ( rule__NumberLiteral__Group__0 )
            // InternalAnn.g:619:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleOperand"
    // InternalAnn.g:628:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalAnn.g:629:1: ( ruleOperand EOF )
            // InternalAnn.g:630:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalAnn.g:637:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:641:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalAnn.g:642:2: ( ( rule__Operand__Alternatives ) )
            {
            // InternalAnn.g:642:2: ( ( rule__Operand__Alternatives ) )
            // InternalAnn.g:643:3: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // InternalAnn.g:644:3: ( rule__Operand__Alternatives )
            // InternalAnn.g:644:4: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleNumberTypes"
    // InternalAnn.g:653:1: entryRuleNumberTypes : ruleNumberTypes EOF ;
    public final void entryRuleNumberTypes() throws RecognitionException {
        try {
            // InternalAnn.g:654:1: ( ruleNumberTypes EOF )
            // InternalAnn.g:655:1: ruleNumberTypes EOF
            {
             before(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalAnn.g:662:1: ruleNumberTypes : ( ( rule__NumberTypes__Alternatives ) ) ;
    public final void ruleNumberTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:666:2: ( ( ( rule__NumberTypes__Alternatives ) ) )
            // InternalAnn.g:667:2: ( ( rule__NumberTypes__Alternatives ) )
            {
            // InternalAnn.g:667:2: ( ( rule__NumberTypes__Alternatives ) )
            // InternalAnn.g:668:3: ( rule__NumberTypes__Alternatives )
            {
             before(grammarAccess.getNumberTypesAccess().getAlternatives()); 
            // InternalAnn.g:669:3: ( rule__NumberTypes__Alternatives )
            // InternalAnn.g:669:4: rule__NumberTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberTypes"


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:678:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalAnn.g:679:1: ( ruleLetter EOF )
            // InternalAnn.g:680:1: ruleLetter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalAnn.g:687:1: ruleLetter : ( ( rule__Letter__Group__0 ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:691:2: ( ( ( rule__Letter__Group__0 ) ) )
            // InternalAnn.g:692:2: ( ( rule__Letter__Group__0 ) )
            {
            // InternalAnn.g:692:2: ( ( rule__Letter__Group__0 ) )
            // InternalAnn.g:693:3: ( rule__Letter__Group__0 )
            {
             before(grammarAccess.getLetterAccess().getGroup()); 
            // InternalAnn.g:694:3: ( rule__Letter__Group__0 )
            // InternalAnn.g:694:4: rule__Letter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetter"


    // $ANTLR start "rule__Layer__Alternatives"
    // InternalAnn.g:702:1: rule__Layer__Alternatives : ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Layer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:706:1: ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAnn.g:707:2: ( ruleHidden )
                    {
                    // InternalAnn.g:707:2: ( ruleHidden )
                    // InternalAnn.g:708:3: ruleHidden
                    {
                     before(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHidden();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:713:2: ( ruleInput )
                    {
                    // InternalAnn.g:713:2: ( ruleInput )
                    // InternalAnn.g:714:3: ruleInput
                    {
                     before(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:719:2: ( ruleOutput )
                    {
                    // InternalAnn.g:719:2: ( ruleOutput )
                    // InternalAnn.g:720:3: ruleOutput
                    {
                     before(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Alternatives"


    // $ANTLR start "rule__LearningRule__Alternatives"
    // InternalAnn.g:729:1: rule__LearningRule__Alternatives : ( ( ( rule__LearningRule__SigmoidAssignment_0 ) ) | ( ( rule__LearningRule__TansigAssignment_1 ) ) | ( ( rule__LearningRule__NamedFunctionAssignment_2 ) ) );
    public final void rule__LearningRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:733:1: ( ( ( rule__LearningRule__SigmoidAssignment_0 ) ) | ( ( rule__LearningRule__TansigAssignment_1 ) ) | ( ( rule__LearningRule__NamedFunctionAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnn.g:734:2: ( ( rule__LearningRule__SigmoidAssignment_0 ) )
                    {
                    // InternalAnn.g:734:2: ( ( rule__LearningRule__SigmoidAssignment_0 ) )
                    // InternalAnn.g:735:3: ( rule__LearningRule__SigmoidAssignment_0 )
                    {
                     before(grammarAccess.getLearningRuleAccess().getSigmoidAssignment_0()); 
                    // InternalAnn.g:736:3: ( rule__LearningRule__SigmoidAssignment_0 )
                    // InternalAnn.g:736:4: rule__LearningRule__SigmoidAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LearningRule__SigmoidAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLearningRuleAccess().getSigmoidAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:740:2: ( ( rule__LearningRule__TansigAssignment_1 ) )
                    {
                    // InternalAnn.g:740:2: ( ( rule__LearningRule__TansigAssignment_1 ) )
                    // InternalAnn.g:741:3: ( rule__LearningRule__TansigAssignment_1 )
                    {
                     before(grammarAccess.getLearningRuleAccess().getTansigAssignment_1()); 
                    // InternalAnn.g:742:3: ( rule__LearningRule__TansigAssignment_1 )
                    // InternalAnn.g:742:4: rule__LearningRule__TansigAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LearningRule__TansigAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLearningRuleAccess().getTansigAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:746:2: ( ( rule__LearningRule__NamedFunctionAssignment_2 ) )
                    {
                    // InternalAnn.g:746:2: ( ( rule__LearningRule__NamedFunctionAssignment_2 ) )
                    // InternalAnn.g:747:3: ( rule__LearningRule__NamedFunctionAssignment_2 )
                    {
                     before(grammarAccess.getLearningRuleAccess().getNamedFunctionAssignment_2()); 
                    // InternalAnn.g:748:3: ( rule__LearningRule__NamedFunctionAssignment_2 )
                    // InternalAnn.g:748:4: rule__LearningRule__NamedFunctionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LearningRule__NamedFunctionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLearningRuleAccess().getNamedFunctionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningRule__Alternatives"


    // $ANTLR start "rule__Activation__Alternatives"
    // InternalAnn.g:756:1: rule__Activation__Alternatives : ( ( ruleExternal ) | ( ruleCustom ) );
    public final void rule__Activation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:760:1: ( ( ruleExternal ) | ( ruleCustom ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    alt3=2;
                }
                else if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnn.g:761:2: ( ruleExternal )
                    {
                    // InternalAnn.g:761:2: ( ruleExternal )
                    // InternalAnn.g:762:3: ruleExternal
                    {
                     before(grammarAccess.getActivationAccess().getExternalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getExternalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:767:2: ( ruleCustom )
                    {
                    // InternalAnn.g:767:2: ( ruleCustom )
                    // InternalAnn.g:768:3: ruleCustom
                    {
                     before(grammarAccess.getActivationAccess().getCustomParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCustom();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getCustomParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAnn.g:777:1: rule__Primary__Alternatives : ( ( ruleOperand ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleMath ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:781:1: ( ( ruleOperand ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleMath ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case 11:
            case 12:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAnn.g:782:2: ( ruleOperand )
                    {
                    // InternalAnn.g:782:2: ( ruleOperand )
                    // InternalAnn.g:783:3: ruleOperand
                    {
                     before(grammarAccess.getPrimaryAccess().getOperandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperand();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getOperandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:788:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAnn.g:788:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAnn.g:789:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalAnn.g:790:3: ( rule__Primary__Group_1__0 )
                    // InternalAnn.g:790:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:794:2: ( ruleMath )
                    {
                    // InternalAnn.g:794:2: ( ruleMath )
                    // InternalAnn.g:795:3: ruleMath
                    {
                     before(grammarAccess.getPrimaryAccess().getMathParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMath();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getMathParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Math__Alternatives"
    // InternalAnn.g:804:1: rule__Math__Alternatives : ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) );
    public final void rule__Math__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:808:1: ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 35:
                {
                alt5=5;
                }
                break;
            case 36:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAnn.g:809:2: ( ruleEuler )
                    {
                    // InternalAnn.g:809:2: ( ruleEuler )
                    // InternalAnn.g:810:3: ruleEuler
                    {
                     before(grammarAccess.getMathAccess().getEulerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEuler();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getEulerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:815:2: ( ruleNLog )
                    {
                    // InternalAnn.g:815:2: ( ruleNLog )
                    // InternalAnn.g:816:3: ruleNLog
                    {
                     before(grammarAccess.getMathAccess().getNLogParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNLog();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getNLogParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:821:2: ( ruleSin )
                    {
                    // InternalAnn.g:821:2: ( ruleSin )
                    // InternalAnn.g:822:3: ruleSin
                    {
                     before(grammarAccess.getMathAccess().getSinParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSin();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getSinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:827:2: ( ruleCos )
                    {
                    // InternalAnn.g:827:2: ( ruleCos )
                    // InternalAnn.g:828:3: ruleCos
                    {
                     before(grammarAccess.getMathAccess().getCosParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCos();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getCosParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnn.g:833:2: ( ruleSqrt )
                    {
                    // InternalAnn.g:833:2: ( ruleSqrt )
                    // InternalAnn.g:834:3: ruleSqrt
                    {
                     before(grammarAccess.getMathAccess().getSqrtParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSqrt();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getSqrtParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAnn.g:839:2: ( rulePower )
                    {
                    // InternalAnn.g:839:2: ( rulePower )
                    // InternalAnn.g:840:3: rulePower
                    {
                     before(grammarAccess.getMathAccess().getPowerParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePower();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getPowerParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math__Alternatives"


    // $ANTLR start "rule__PartOperator__Alternatives"
    // InternalAnn.g:849:1: rule__PartOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__PartOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:853:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnn.g:854:2: ( '+' )
                    {
                    // InternalAnn.g:854:2: ( '+' )
                    // InternalAnn.g:855:3: '+'
                    {
                     before(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:860:2: ( '-' )
                    {
                    // InternalAnn.g:860:2: ( '-' )
                    // InternalAnn.g:861:3: '-'
                    {
                     before(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartOperator__Alternatives"


    // $ANTLR start "rule__FactorOperator__Alternatives"
    // InternalAnn.g:870:1: rule__FactorOperator__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:874:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnn.g:875:2: ( '*' )
                    {
                    // InternalAnn.g:875:2: ( '*' )
                    // InternalAnn.g:876:3: '*'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:881:2: ( '/' )
                    {
                    // InternalAnn.g:881:2: ( '/' )
                    // InternalAnn.g:882:3: '/'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorOperator__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalAnn.g:891:1: rule__Operand__Alternatives : ( ( ruleLetter ) | ( ruleNumberLiteral ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:895:1: ( ( ruleLetter ) | ( ruleNumberLiteral ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_INT) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_INT) ) {
                    alt8=2;
                }
                else if ( (LA8_2==RULE_ID) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAnn.g:896:2: ( ruleLetter )
                    {
                    // InternalAnn.g:896:2: ( ruleLetter )
                    // InternalAnn.g:897:3: ruleLetter
                    {
                     before(grammarAccess.getOperandAccess().getLetterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLetter();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getLetterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:902:2: ( ruleNumberLiteral )
                    {
                    // InternalAnn.g:902:2: ( ruleNumberLiteral )
                    // InternalAnn.g:903:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getOperandAccess().getNumberLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNumberLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__NumberTypes__Alternatives"
    // InternalAnn.g:912:1: rule__NumberTypes__Alternatives : ( ( ruleDECIMAL ) | ( RULE_INT ) );
    public final void rule__NumberTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:916:1: ( ( ruleDECIMAL ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=11 && LA9_1<=14)||LA9_1==18||LA9_1==27||LA9_1==30||LA9_1==37) ) {
                    alt9=2;
                }
                else if ( (LA9_1==19) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnn.g:917:2: ( ruleDECIMAL )
                    {
                    // InternalAnn.g:917:2: ( ruleDECIMAL )
                    // InternalAnn.g:918:3: ruleDECIMAL
                    {
                     before(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDECIMAL();

                    state._fsp--;

                     after(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:923:2: ( RULE_INT )
                    {
                    // InternalAnn.g:923:2: ( RULE_INT )
                    // InternalAnn.g:924:3: RULE_INT
                    {
                     before(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTypes__Alternatives"


    // $ANTLR start "rule__ANNModel__Group__0"
    // InternalAnn.g:933:1: rule__ANNModel__Group__0 : rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 ;
    public final void rule__ANNModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:937:1: ( rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 )
            // InternalAnn.g:938:2: rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ANNModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__0"


    // $ANTLR start "rule__ANNModel__Group__0__Impl"
    // InternalAnn.g:945:1: rule__ANNModel__Group__0__Impl : ( ( rule__ANNModel__NameAssignment_0 ) ) ;
    public final void rule__ANNModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:949:1: ( ( ( rule__ANNModel__NameAssignment_0 ) ) )
            // InternalAnn.g:950:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            {
            // InternalAnn.g:950:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            // InternalAnn.g:951:2: ( rule__ANNModel__NameAssignment_0 )
            {
             before(grammarAccess.getANNModelAccess().getNameAssignment_0()); 
            // InternalAnn.g:952:2: ( rule__ANNModel__NameAssignment_0 )
            // InternalAnn.g:952:3: rule__ANNModel__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__0__Impl"


    // $ANTLR start "rule__ANNModel__Group__1"
    // InternalAnn.g:960:1: rule__ANNModel__Group__1 : rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 ;
    public final void rule__ANNModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:964:1: ( rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 )
            // InternalAnn.g:965:2: rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ANNModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__1"


    // $ANTLR start "rule__ANNModel__Group__1__Impl"
    // InternalAnn.g:972:1: rule__ANNModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ANNModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:976:1: ( ( '{' ) )
            // InternalAnn.g:977:1: ( '{' )
            {
            // InternalAnn.g:977:1: ( '{' )
            // InternalAnn.g:978:2: '{'
            {
             before(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__1__Impl"


    // $ANTLR start "rule__ANNModel__Group__2"
    // InternalAnn.g:987:1: rule__ANNModel__Group__2 : rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 ;
    public final void rule__ANNModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:991:1: ( rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 )
            // InternalAnn.g:992:2: rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ANNModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__2"


    // $ANTLR start "rule__ANNModel__Group__2__Impl"
    // InternalAnn.g:999:1: rule__ANNModel__Group__2__Impl : ( 'alpha' ) ;
    public final void rule__ANNModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1003:1: ( ( 'alpha' ) )
            // InternalAnn.g:1004:1: ( 'alpha' )
            {
            // InternalAnn.g:1004:1: ( 'alpha' )
            // InternalAnn.g:1005:2: 'alpha'
            {
             before(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__2__Impl"


    // $ANTLR start "rule__ANNModel__Group__3"
    // InternalAnn.g:1014:1: rule__ANNModel__Group__3 : rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 ;
    public final void rule__ANNModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1018:1: ( rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 )
            // InternalAnn.g:1019:2: rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ANNModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__3"


    // $ANTLR start "rule__ANNModel__Group__3__Impl"
    // InternalAnn.g:1026:1: rule__ANNModel__Group__3__Impl : ( ( rule__ANNModel__AlphaAssignment_3 ) ) ;
    public final void rule__ANNModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1030:1: ( ( ( rule__ANNModel__AlphaAssignment_3 ) ) )
            // InternalAnn.g:1031:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            {
            // InternalAnn.g:1031:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            // InternalAnn.g:1032:2: ( rule__ANNModel__AlphaAssignment_3 )
            {
             before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 
            // InternalAnn.g:1033:2: ( rule__ANNModel__AlphaAssignment_3 )
            // InternalAnn.g:1033:3: rule__ANNModel__AlphaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__AlphaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__3__Impl"


    // $ANTLR start "rule__ANNModel__Group__4"
    // InternalAnn.g:1041:1: rule__ANNModel__Group__4 : rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 ;
    public final void rule__ANNModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1045:1: ( rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 )
            // InternalAnn.g:1046:2: rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ANNModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__4"


    // $ANTLR start "rule__ANNModel__Group__4__Impl"
    // InternalAnn.g:1053:1: rule__ANNModel__Group__4__Impl : ( 'epochs' ) ;
    public final void rule__ANNModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1057:1: ( ( 'epochs' ) )
            // InternalAnn.g:1058:1: ( 'epochs' )
            {
            // InternalAnn.g:1058:1: ( 'epochs' )
            // InternalAnn.g:1059:2: 'epochs'
            {
             before(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__4__Impl"


    // $ANTLR start "rule__ANNModel__Group__5"
    // InternalAnn.g:1068:1: rule__ANNModel__Group__5 : rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 ;
    public final void rule__ANNModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1072:1: ( rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 )
            // InternalAnn.g:1073:2: rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__5"


    // $ANTLR start "rule__ANNModel__Group__5__Impl"
    // InternalAnn.g:1080:1: rule__ANNModel__Group__5__Impl : ( ( rule__ANNModel__EpochsAssignment_5 ) ) ;
    public final void rule__ANNModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1084:1: ( ( ( rule__ANNModel__EpochsAssignment_5 ) ) )
            // InternalAnn.g:1085:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            {
            // InternalAnn.g:1085:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            // InternalAnn.g:1086:2: ( rule__ANNModel__EpochsAssignment_5 )
            {
             before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 
            // InternalAnn.g:1087:2: ( rule__ANNModel__EpochsAssignment_5 )
            // InternalAnn.g:1087:3: rule__ANNModel__EpochsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__EpochsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__5__Impl"


    // $ANTLR start "rule__ANNModel__Group__6"
    // InternalAnn.g:1095:1: rule__ANNModel__Group__6 : rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 ;
    public final void rule__ANNModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1099:1: ( rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 )
            // InternalAnn.g:1100:2: rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__6"


    // $ANTLR start "rule__ANNModel__Group__6__Impl"
    // InternalAnn.g:1107:1: rule__ANNModel__Group__6__Impl : ( ( rule__ANNModel__ActivationAssignment_6 )* ) ;
    public final void rule__ANNModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1111:1: ( ( ( rule__ANNModel__ActivationAssignment_6 )* ) )
            // InternalAnn.g:1112:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            {
            // InternalAnn.g:1112:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            // InternalAnn.g:1113:2: ( rule__ANNModel__ActivationAssignment_6 )*
            {
             before(grammarAccess.getANNModelAccess().getActivationAssignment_6()); 
            // InternalAnn.g:1114:2: ( rule__ANNModel__ActivationAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnn.g:1114:3: rule__ANNModel__ActivationAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ANNModel__ActivationAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getActivationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__6__Impl"


    // $ANTLR start "rule__ANNModel__Group__7"
    // InternalAnn.g:1122:1: rule__ANNModel__Group__7 : rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 ;
    public final void rule__ANNModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1126:1: ( rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 )
            // InternalAnn.g:1127:2: rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__7"


    // $ANTLR start "rule__ANNModel__Group__7__Impl"
    // InternalAnn.g:1134:1: rule__ANNModel__Group__7__Impl : ( ( rule__ANNModel__LayerAssignment_7 )* ) ;
    public final void rule__ANNModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1138:1: ( ( ( rule__ANNModel__LayerAssignment_7 )* ) )
            // InternalAnn.g:1139:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            {
            // InternalAnn.g:1139:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            // InternalAnn.g:1140:2: ( rule__ANNModel__LayerAssignment_7 )*
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_7()); 
            // InternalAnn.g:1141:2: ( rule__ANNModel__LayerAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||(LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnn.g:1141:3: rule__ANNModel__LayerAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ANNModel__LayerAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getLayerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__7__Impl"


    // $ANTLR start "rule__ANNModel__Group__8"
    // InternalAnn.g:1149:1: rule__ANNModel__Group__8 : rule__ANNModel__Group__8__Impl ;
    public final void rule__ANNModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1153:1: ( rule__ANNModel__Group__8__Impl )
            // InternalAnn.g:1154:2: rule__ANNModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__8"


    // $ANTLR start "rule__ANNModel__Group__8__Impl"
    // InternalAnn.g:1160:1: rule__ANNModel__Group__8__Impl : ( '}' ) ;
    public final void rule__ANNModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1164:1: ( ( '}' ) )
            // InternalAnn.g:1165:1: ( '}' )
            {
            // InternalAnn.g:1165:1: ( '}' )
            // InternalAnn.g:1166:2: '}'
            {
             before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__8__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalAnn.g:1176:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1180:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalAnn.g:1181:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalAnn.g:1188:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1192:1: ( ( RULE_INT ) )
            // InternalAnn.g:1193:1: ( RULE_INT )
            {
            // InternalAnn.g:1193:1: ( RULE_INT )
            // InternalAnn.g:1194:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalAnn.g:1203:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1207:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalAnn.g:1208:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalAnn.g:1215:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1219:1: ( ( '.' ) )
            // InternalAnn.g:1220:1: ( '.' )
            {
            // InternalAnn.g:1220:1: ( '.' )
            // InternalAnn.g:1221:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalAnn.g:1230:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1234:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalAnn.g:1235:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalAnn.g:1241:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1245:1: ( ( RULE_INT ) )
            // InternalAnn.g:1246:1: ( RULE_INT )
            {
            // InternalAnn.g:1246:1: ( RULE_INT )
            // InternalAnn.g:1247:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__Hidden__Group__0"
    // InternalAnn.g:1257:1: rule__Hidden__Group__0 : rule__Hidden__Group__0__Impl rule__Hidden__Group__1 ;
    public final void rule__Hidden__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1261:1: ( rule__Hidden__Group__0__Impl rule__Hidden__Group__1 )
            // InternalAnn.g:1262:2: rule__Hidden__Group__0__Impl rule__Hidden__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hidden__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__0"


    // $ANTLR start "rule__Hidden__Group__0__Impl"
    // InternalAnn.g:1269:1: rule__Hidden__Group__0__Impl : ( 'hidden' ) ;
    public final void rule__Hidden__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1273:1: ( ( 'hidden' ) )
            // InternalAnn.g:1274:1: ( 'hidden' )
            {
            // InternalAnn.g:1274:1: ( 'hidden' )
            // InternalAnn.g:1275:2: 'hidden'
            {
             before(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__0__Impl"


    // $ANTLR start "rule__Hidden__Group__1"
    // InternalAnn.g:1284:1: rule__Hidden__Group__1 : rule__Hidden__Group__1__Impl rule__Hidden__Group__2 ;
    public final void rule__Hidden__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1288:1: ( rule__Hidden__Group__1__Impl rule__Hidden__Group__2 )
            // InternalAnn.g:1289:2: rule__Hidden__Group__1__Impl rule__Hidden__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Hidden__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__1"


    // $ANTLR start "rule__Hidden__Group__1__Impl"
    // InternalAnn.g:1296:1: rule__Hidden__Group__1__Impl : ( '{' ) ;
    public final void rule__Hidden__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1300:1: ( ( '{' ) )
            // InternalAnn.g:1301:1: ( '{' )
            {
            // InternalAnn.g:1301:1: ( '{' )
            // InternalAnn.g:1302:2: '{'
            {
             before(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__1__Impl"


    // $ANTLR start "rule__Hidden__Group__2"
    // InternalAnn.g:1311:1: rule__Hidden__Group__2 : rule__Hidden__Group__2__Impl rule__Hidden__Group__3 ;
    public final void rule__Hidden__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1315:1: ( rule__Hidden__Group__2__Impl rule__Hidden__Group__3 )
            // InternalAnn.g:1316:2: rule__Hidden__Group__2__Impl rule__Hidden__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Hidden__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__2"


    // $ANTLR start "rule__Hidden__Group__2__Impl"
    // InternalAnn.g:1323:1: rule__Hidden__Group__2__Impl : ( 'size' ) ;
    public final void rule__Hidden__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1327:1: ( ( 'size' ) )
            // InternalAnn.g:1328:1: ( 'size' )
            {
            // InternalAnn.g:1328:1: ( 'size' )
            // InternalAnn.g:1329:2: 'size'
            {
             before(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__2__Impl"


    // $ANTLR start "rule__Hidden__Group__3"
    // InternalAnn.g:1338:1: rule__Hidden__Group__3 : rule__Hidden__Group__3__Impl rule__Hidden__Group__4 ;
    public final void rule__Hidden__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1342:1: ( rule__Hidden__Group__3__Impl rule__Hidden__Group__4 )
            // InternalAnn.g:1343:2: rule__Hidden__Group__3__Impl rule__Hidden__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Hidden__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__3"


    // $ANTLR start "rule__Hidden__Group__3__Impl"
    // InternalAnn.g:1350:1: rule__Hidden__Group__3__Impl : ( ( rule__Hidden__SizeAssignment_3 ) ) ;
    public final void rule__Hidden__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1354:1: ( ( ( rule__Hidden__SizeAssignment_3 ) ) )
            // InternalAnn.g:1355:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1355:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            // InternalAnn.g:1356:2: ( rule__Hidden__SizeAssignment_3 )
            {
             before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1357:2: ( rule__Hidden__SizeAssignment_3 )
            // InternalAnn.g:1357:3: rule__Hidden__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__3__Impl"


    // $ANTLR start "rule__Hidden__Group__4"
    // InternalAnn.g:1365:1: rule__Hidden__Group__4 : rule__Hidden__Group__4__Impl rule__Hidden__Group__5 ;
    public final void rule__Hidden__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1369:1: ( rule__Hidden__Group__4__Impl rule__Hidden__Group__5 )
            // InternalAnn.g:1370:2: rule__Hidden__Group__4__Impl rule__Hidden__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Hidden__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__4"


    // $ANTLR start "rule__Hidden__Group__4__Impl"
    // InternalAnn.g:1377:1: rule__Hidden__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Hidden__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1381:1: ( ( 'activation' ) )
            // InternalAnn.g:1382:1: ( 'activation' )
            {
            // InternalAnn.g:1382:1: ( 'activation' )
            // InternalAnn.g:1383:2: 'activation'
            {
             before(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__4__Impl"


    // $ANTLR start "rule__Hidden__Group__5"
    // InternalAnn.g:1392:1: rule__Hidden__Group__5 : rule__Hidden__Group__5__Impl rule__Hidden__Group__6 ;
    public final void rule__Hidden__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1396:1: ( rule__Hidden__Group__5__Impl rule__Hidden__Group__6 )
            // InternalAnn.g:1397:2: rule__Hidden__Group__5__Impl rule__Hidden__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Hidden__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__5"


    // $ANTLR start "rule__Hidden__Group__5__Impl"
    // InternalAnn.g:1404:1: rule__Hidden__Group__5__Impl : ( ( rule__Hidden__L_ruleAssignment_5 ) ) ;
    public final void rule__Hidden__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1408:1: ( ( ( rule__Hidden__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1409:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1409:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            // InternalAnn.g:1410:2: ( rule__Hidden__L_ruleAssignment_5 )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1411:2: ( rule__Hidden__L_ruleAssignment_5 )
            // InternalAnn.g:1411:3: rule__Hidden__L_ruleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__L_ruleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__5__Impl"


    // $ANTLR start "rule__Hidden__Group__6"
    // InternalAnn.g:1419:1: rule__Hidden__Group__6 : rule__Hidden__Group__6__Impl ;
    public final void rule__Hidden__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1423:1: ( rule__Hidden__Group__6__Impl )
            // InternalAnn.g:1424:2: rule__Hidden__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__6"


    // $ANTLR start "rule__Hidden__Group__6__Impl"
    // InternalAnn.g:1430:1: rule__Hidden__Group__6__Impl : ( '}' ) ;
    public final void rule__Hidden__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1434:1: ( ( '}' ) )
            // InternalAnn.g:1435:1: ( '}' )
            {
            // InternalAnn.g:1435:1: ( '}' )
            // InternalAnn.g:1436:2: '}'
            {
             before(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalAnn.g:1446:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1450:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAnn.g:1451:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalAnn.g:1458:1: rule__Input__Group__0__Impl : ( 'in' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1462:1: ( ( 'in' ) )
            // InternalAnn.g:1463:1: ( 'in' )
            {
            // InternalAnn.g:1463:1: ( 'in' )
            // InternalAnn.g:1464:2: 'in'
            {
             before(grammarAccess.getInputAccess().getInKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalAnn.g:1473:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1477:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAnn.g:1478:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalAnn.g:1485:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1489:1: ( ( '{' ) )
            // InternalAnn.g:1490:1: ( '{' )
            {
            // InternalAnn.g:1490:1: ( '{' )
            // InternalAnn.g:1491:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalAnn.g:1500:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1504:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAnn.g:1505:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalAnn.g:1512:1: rule__Input__Group__2__Impl : ( 'size' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1516:1: ( ( 'size' ) )
            // InternalAnn.g:1517:1: ( 'size' )
            {
            // InternalAnn.g:1517:1: ( 'size' )
            // InternalAnn.g:1518:2: 'size'
            {
             before(grammarAccess.getInputAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalAnn.g:1527:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1531:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAnn.g:1532:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalAnn.g:1539:1: rule__Input__Group__3__Impl : ( ( rule__Input__SizeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1543:1: ( ( ( rule__Input__SizeAssignment_3 ) ) )
            // InternalAnn.g:1544:1: ( ( rule__Input__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1544:1: ( ( rule__Input__SizeAssignment_3 ) )
            // InternalAnn.g:1545:2: ( rule__Input__SizeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1546:2: ( rule__Input__SizeAssignment_3 )
            // InternalAnn.g:1546:3: rule__Input__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalAnn.g:1554:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1558:1: ( rule__Input__Group__4__Impl )
            // InternalAnn.g:1559:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalAnn.g:1565:1: rule__Input__Group__4__Impl : ( '}' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1569:1: ( ( '}' ) )
            // InternalAnn.g:1570:1: ( '}' )
            {
            // InternalAnn.g:1570:1: ( '}' )
            // InternalAnn.g:1571:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalAnn.g:1581:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1585:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnn.g:1586:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalAnn.g:1593:1: rule__Output__Group__0__Impl : ( 'out' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1597:1: ( ( 'out' ) )
            // InternalAnn.g:1598:1: ( 'out' )
            {
            // InternalAnn.g:1598:1: ( 'out' )
            // InternalAnn.g:1599:2: 'out'
            {
             before(grammarAccess.getOutputAccess().getOutKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalAnn.g:1608:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1612:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAnn.g:1613:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalAnn.g:1620:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1624:1: ( ( '{' ) )
            // InternalAnn.g:1625:1: ( '{' )
            {
            // InternalAnn.g:1625:1: ( '{' )
            // InternalAnn.g:1626:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalAnn.g:1635:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1639:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAnn.g:1640:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalAnn.g:1647:1: rule__Output__Group__2__Impl : ( 'size' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1651:1: ( ( 'size' ) )
            // InternalAnn.g:1652:1: ( 'size' )
            {
            // InternalAnn.g:1652:1: ( 'size' )
            // InternalAnn.g:1653:2: 'size'
            {
             before(grammarAccess.getOutputAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalAnn.g:1662:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1666:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAnn.g:1667:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalAnn.g:1674:1: rule__Output__Group__3__Impl : ( ( rule__Output__SizeAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1678:1: ( ( ( rule__Output__SizeAssignment_3 ) ) )
            // InternalAnn.g:1679:1: ( ( rule__Output__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1679:1: ( ( rule__Output__SizeAssignment_3 ) )
            // InternalAnn.g:1680:2: ( rule__Output__SizeAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1681:2: ( rule__Output__SizeAssignment_3 )
            // InternalAnn.g:1681:3: rule__Output__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Output__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalAnn.g:1689:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1693:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalAnn.g:1694:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalAnn.g:1701:1: rule__Output__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1705:1: ( ( 'activation' ) )
            // InternalAnn.g:1706:1: ( 'activation' )
            {
            // InternalAnn.g:1706:1: ( 'activation' )
            // InternalAnn.g:1707:2: 'activation'
            {
             before(grammarAccess.getOutputAccess().getActivationKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getActivationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__5"
    // InternalAnn.g:1716:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1720:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalAnn.g:1721:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Output__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5"


    // $ANTLR start "rule__Output__Group__5__Impl"
    // InternalAnn.g:1728:1: rule__Output__Group__5__Impl : ( ( rule__Output__L_ruleAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1732:1: ( ( ( rule__Output__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1733:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1733:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            // InternalAnn.g:1734:2: ( rule__Output__L_ruleAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1735:2: ( rule__Output__L_ruleAssignment_5 )
            // InternalAnn.g:1735:3: rule__Output__L_ruleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Output__L_ruleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__6"
    // InternalAnn.g:1743:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1747:1: ( rule__Output__Group__6__Impl )
            // InternalAnn.g:1748:2: rule__Output__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6"


    // $ANTLR start "rule__Output__Group__6__Impl"
    // InternalAnn.g:1754:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1758:1: ( ( '}' ) )
            // InternalAnn.g:1759:1: ( '}' )
            {
            // InternalAnn.g:1759:1: ( '}' )
            // InternalAnn.g:1760:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalAnn.g:1770:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1774:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalAnn.g:1775:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalAnn.g:1782:1: rule__External__Group__0__Impl : ( ( rule__External__NameAssignment_0 ) ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1786:1: ( ( ( rule__External__NameAssignment_0 ) ) )
            // InternalAnn.g:1787:1: ( ( rule__External__NameAssignment_0 ) )
            {
            // InternalAnn.g:1787:1: ( ( rule__External__NameAssignment_0 ) )
            // InternalAnn.g:1788:2: ( rule__External__NameAssignment_0 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_0()); 
            // InternalAnn.g:1789:2: ( rule__External__NameAssignment_0 )
            // InternalAnn.g:1789:3: rule__External__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalAnn.g:1797:1: rule__External__Group__1 : rule__External__Group__1__Impl ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1801:1: ( rule__External__Group__1__Impl )
            // InternalAnn.g:1802:2: rule__External__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalAnn.g:1808:1: rule__External__Group__1__Impl : ( 'external' ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1812:1: ( ( 'external' ) )
            // InternalAnn.g:1813:1: ( 'external' )
            {
            // InternalAnn.g:1813:1: ( 'external' )
            // InternalAnn.g:1814:2: 'external'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getExternalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__Custom__Group__0"
    // InternalAnn.g:1824:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1828:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // InternalAnn.g:1829:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Custom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__0"


    // $ANTLR start "rule__Custom__Group__0__Impl"
    // InternalAnn.g:1836:1: rule__Custom__Group__0__Impl : ( ( rule__Custom__NameAssignment_0 ) ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1840:1: ( ( ( rule__Custom__NameAssignment_0 ) ) )
            // InternalAnn.g:1841:1: ( ( rule__Custom__NameAssignment_0 ) )
            {
            // InternalAnn.g:1841:1: ( ( rule__Custom__NameAssignment_0 ) )
            // InternalAnn.g:1842:2: ( rule__Custom__NameAssignment_0 )
            {
             before(grammarAccess.getCustomAccess().getNameAssignment_0()); 
            // InternalAnn.g:1843:2: ( rule__Custom__NameAssignment_0 )
            // InternalAnn.g:1843:3: rule__Custom__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Custom__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__0__Impl"


    // $ANTLR start "rule__Custom__Group__1"
    // InternalAnn.g:1851:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1855:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // InternalAnn.g:1856:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Custom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__1"


    // $ANTLR start "rule__Custom__Group__1__Impl"
    // InternalAnn.g:1863:1: rule__Custom__Group__1__Impl : ( '(' ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1867:1: ( ( '(' ) )
            // InternalAnn.g:1868:1: ( '(' )
            {
            // InternalAnn.g:1868:1: ( '(' )
            // InternalAnn.g:1869:2: '('
            {
             before(grammarAccess.getCustomAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__1__Impl"


    // $ANTLR start "rule__Custom__Group__2"
    // InternalAnn.g:1878:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl rule__Custom__Group__3 ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1882:1: ( rule__Custom__Group__2__Impl rule__Custom__Group__3 )
            // InternalAnn.g:1883:2: rule__Custom__Group__2__Impl rule__Custom__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Custom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__2"


    // $ANTLR start "rule__Custom__Group__2__Impl"
    // InternalAnn.g:1890:1: rule__Custom__Group__2__Impl : ( ( rule__Custom__InputAssignment_2 ) ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1894:1: ( ( ( rule__Custom__InputAssignment_2 ) ) )
            // InternalAnn.g:1895:1: ( ( rule__Custom__InputAssignment_2 ) )
            {
            // InternalAnn.g:1895:1: ( ( rule__Custom__InputAssignment_2 ) )
            // InternalAnn.g:1896:2: ( rule__Custom__InputAssignment_2 )
            {
             before(grammarAccess.getCustomAccess().getInputAssignment_2()); 
            // InternalAnn.g:1897:2: ( rule__Custom__InputAssignment_2 )
            // InternalAnn.g:1897:3: rule__Custom__InputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Custom__InputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getInputAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__2__Impl"


    // $ANTLR start "rule__Custom__Group__3"
    // InternalAnn.g:1905:1: rule__Custom__Group__3 : rule__Custom__Group__3__Impl rule__Custom__Group__4 ;
    public final void rule__Custom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1909:1: ( rule__Custom__Group__3__Impl rule__Custom__Group__4 )
            // InternalAnn.g:1910:2: rule__Custom__Group__3__Impl rule__Custom__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Custom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__3"


    // $ANTLR start "rule__Custom__Group__3__Impl"
    // InternalAnn.g:1917:1: rule__Custom__Group__3__Impl : ( ')' ) ;
    public final void rule__Custom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1921:1: ( ( ')' ) )
            // InternalAnn.g:1922:1: ( ')' )
            {
            // InternalAnn.g:1922:1: ( ')' )
            // InternalAnn.g:1923:2: ')'
            {
             before(grammarAccess.getCustomAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__3__Impl"


    // $ANTLR start "rule__Custom__Group__4"
    // InternalAnn.g:1932:1: rule__Custom__Group__4 : rule__Custom__Group__4__Impl rule__Custom__Group__5 ;
    public final void rule__Custom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1936:1: ( rule__Custom__Group__4__Impl rule__Custom__Group__5 )
            // InternalAnn.g:1937:2: rule__Custom__Group__4__Impl rule__Custom__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Custom__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__4"


    // $ANTLR start "rule__Custom__Group__4__Impl"
    // InternalAnn.g:1944:1: rule__Custom__Group__4__Impl : ( '{' ) ;
    public final void rule__Custom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1948:1: ( ( '{' ) )
            // InternalAnn.g:1949:1: ( '{' )
            {
            // InternalAnn.g:1949:1: ( '{' )
            // InternalAnn.g:1950:2: '{'
            {
             before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__4__Impl"


    // $ANTLR start "rule__Custom__Group__5"
    // InternalAnn.g:1959:1: rule__Custom__Group__5 : rule__Custom__Group__5__Impl rule__Custom__Group__6 ;
    public final void rule__Custom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1963:1: ( rule__Custom__Group__5__Impl rule__Custom__Group__6 )
            // InternalAnn.g:1964:2: rule__Custom__Group__5__Impl rule__Custom__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Custom__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__5"


    // $ANTLR start "rule__Custom__Group__5__Impl"
    // InternalAnn.g:1971:1: rule__Custom__Group__5__Impl : ( 'function' ) ;
    public final void rule__Custom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1975:1: ( ( 'function' ) )
            // InternalAnn.g:1976:1: ( 'function' )
            {
            // InternalAnn.g:1976:1: ( 'function' )
            // InternalAnn.g:1977:2: 'function'
            {
             before(grammarAccess.getCustomAccess().getFunctionKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getFunctionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__5__Impl"


    // $ANTLR start "rule__Custom__Group__6"
    // InternalAnn.g:1986:1: rule__Custom__Group__6 : rule__Custom__Group__6__Impl rule__Custom__Group__7 ;
    public final void rule__Custom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1990:1: ( rule__Custom__Group__6__Impl rule__Custom__Group__7 )
            // InternalAnn.g:1991:2: rule__Custom__Group__6__Impl rule__Custom__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Custom__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__6"


    // $ANTLR start "rule__Custom__Group__6__Impl"
    // InternalAnn.g:1998:1: rule__Custom__Group__6__Impl : ( '=' ) ;
    public final void rule__Custom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2002:1: ( ( '=' ) )
            // InternalAnn.g:2003:1: ( '=' )
            {
            // InternalAnn.g:2003:1: ( '=' )
            // InternalAnn.g:2004:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__6__Impl"


    // $ANTLR start "rule__Custom__Group__7"
    // InternalAnn.g:2013:1: rule__Custom__Group__7 : rule__Custom__Group__7__Impl rule__Custom__Group__8 ;
    public final void rule__Custom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2017:1: ( rule__Custom__Group__7__Impl rule__Custom__Group__8 )
            // InternalAnn.g:2018:2: rule__Custom__Group__7__Impl rule__Custom__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Custom__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__7"


    // $ANTLR start "rule__Custom__Group__7__Impl"
    // InternalAnn.g:2025:1: rule__Custom__Group__7__Impl : ( ( rule__Custom__ExpAssignment_7 ) ) ;
    public final void rule__Custom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2029:1: ( ( ( rule__Custom__ExpAssignment_7 ) ) )
            // InternalAnn.g:2030:1: ( ( rule__Custom__ExpAssignment_7 ) )
            {
            // InternalAnn.g:2030:1: ( ( rule__Custom__ExpAssignment_7 ) )
            // InternalAnn.g:2031:2: ( rule__Custom__ExpAssignment_7 )
            {
             before(grammarAccess.getCustomAccess().getExpAssignment_7()); 
            // InternalAnn.g:2032:2: ( rule__Custom__ExpAssignment_7 )
            // InternalAnn.g:2032:3: rule__Custom__ExpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Custom__ExpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getExpAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__7__Impl"


    // $ANTLR start "rule__Custom__Group__8"
    // InternalAnn.g:2040:1: rule__Custom__Group__8 : rule__Custom__Group__8__Impl rule__Custom__Group__9 ;
    public final void rule__Custom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2044:1: ( rule__Custom__Group__8__Impl rule__Custom__Group__9 )
            // InternalAnn.g:2045:2: rule__Custom__Group__8__Impl rule__Custom__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Custom__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__8"


    // $ANTLR start "rule__Custom__Group__8__Impl"
    // InternalAnn.g:2052:1: rule__Custom__Group__8__Impl : ( 'derivative' ) ;
    public final void rule__Custom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2056:1: ( ( 'derivative' ) )
            // InternalAnn.g:2057:1: ( 'derivative' )
            {
            // InternalAnn.g:2057:1: ( 'derivative' )
            // InternalAnn.g:2058:2: 'derivative'
            {
             before(grammarAccess.getCustomAccess().getDerivativeKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getDerivativeKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__8__Impl"


    // $ANTLR start "rule__Custom__Group__9"
    // InternalAnn.g:2067:1: rule__Custom__Group__9 : rule__Custom__Group__9__Impl rule__Custom__Group__10 ;
    public final void rule__Custom__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2071:1: ( rule__Custom__Group__9__Impl rule__Custom__Group__10 )
            // InternalAnn.g:2072:2: rule__Custom__Group__9__Impl rule__Custom__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Custom__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__9"


    // $ANTLR start "rule__Custom__Group__9__Impl"
    // InternalAnn.g:2079:1: rule__Custom__Group__9__Impl : ( '=' ) ;
    public final void rule__Custom__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2083:1: ( ( '=' ) )
            // InternalAnn.g:2084:1: ( '=' )
            {
            // InternalAnn.g:2084:1: ( '=' )
            // InternalAnn.g:2085:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__9__Impl"


    // $ANTLR start "rule__Custom__Group__10"
    // InternalAnn.g:2094:1: rule__Custom__Group__10 : rule__Custom__Group__10__Impl rule__Custom__Group__11 ;
    public final void rule__Custom__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2098:1: ( rule__Custom__Group__10__Impl rule__Custom__Group__11 )
            // InternalAnn.g:2099:2: rule__Custom__Group__10__Impl rule__Custom__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Custom__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__10"


    // $ANTLR start "rule__Custom__Group__10__Impl"
    // InternalAnn.g:2106:1: rule__Custom__Group__10__Impl : ( ( rule__Custom__DerAssignment_10 ) ) ;
    public final void rule__Custom__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2110:1: ( ( ( rule__Custom__DerAssignment_10 ) ) )
            // InternalAnn.g:2111:1: ( ( rule__Custom__DerAssignment_10 ) )
            {
            // InternalAnn.g:2111:1: ( ( rule__Custom__DerAssignment_10 ) )
            // InternalAnn.g:2112:2: ( rule__Custom__DerAssignment_10 )
            {
             before(grammarAccess.getCustomAccess().getDerAssignment_10()); 
            // InternalAnn.g:2113:2: ( rule__Custom__DerAssignment_10 )
            // InternalAnn.g:2113:3: rule__Custom__DerAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Custom__DerAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getDerAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__10__Impl"


    // $ANTLR start "rule__Custom__Group__11"
    // InternalAnn.g:2121:1: rule__Custom__Group__11 : rule__Custom__Group__11__Impl ;
    public final void rule__Custom__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2125:1: ( rule__Custom__Group__11__Impl )
            // InternalAnn.g:2126:2: rule__Custom__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Custom__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__11"


    // $ANTLR start "rule__Custom__Group__11__Impl"
    // InternalAnn.g:2132:1: rule__Custom__Group__11__Impl : ( '}' ) ;
    public final void rule__Custom__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2136:1: ( ( '}' ) )
            // InternalAnn.g:2137:1: ( '}' )
            {
            // InternalAnn.g:2137:1: ( '}' )
            // InternalAnn.g:2138:2: '}'
            {
             before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__11__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAnn.g:2148:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2152:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAnn.g:2153:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalAnn.g:2160:1: rule__Expression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2164:1: ( ( ruleFactor ) )
            // InternalAnn.g:2165:1: ( ruleFactor )
            {
            // InternalAnn.g:2165:1: ( ruleFactor )
            // InternalAnn.g:2166:2: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalAnn.g:2175:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2179:1: ( rule__Expression__Group__1__Impl )
            // InternalAnn.g:2180:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalAnn.g:2186:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2190:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalAnn.g:2191:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalAnn.g:2191:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalAnn.g:2192:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAnn.g:2193:2: ( rule__Expression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAnn.g:2193:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalAnn.g:2202:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2206:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAnn.g:2207:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalAnn.g:2214:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2218:1: ( ( () ) )
            // InternalAnn.g:2219:1: ( () )
            {
            // InternalAnn.g:2219:1: ( () )
            // InternalAnn.g:2220:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 
            // InternalAnn.g:2221:2: ()
            // InternalAnn.g:2221:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalAnn.g:2229:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2233:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalAnn.g:2234:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalAnn.g:2241:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2245:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:2246:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:2246:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // InternalAnn.g:2247:2: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:2248:2: ( rule__Expression__OperatorAssignment_1_1 )
            // InternalAnn.g:2248:3: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalAnn.g:2256:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2260:1: ( rule__Expression__Group_1__2__Impl )
            // InternalAnn.g:2261:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalAnn.g:2267:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2271:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2272:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2272:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalAnn.g:2273:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2274:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalAnn.g:2274:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalAnn.g:2283:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2287:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalAnn.g:2288:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalAnn.g:2295:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2299:1: ( ( rulePrimary ) )
            // InternalAnn.g:2300:1: ( rulePrimary )
            {
            // InternalAnn.g:2300:1: ( rulePrimary )
            // InternalAnn.g:2301:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalAnn.g:2310:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2314:1: ( rule__Factor__Group__1__Impl )
            // InternalAnn.g:2315:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalAnn.g:2321:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2325:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalAnn.g:2326:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalAnn.g:2326:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalAnn.g:2327:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalAnn.g:2328:2: ( rule__Factor__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAnn.g:2328:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalAnn.g:2337:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2341:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalAnn.g:2342:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalAnn.g:2349:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2353:1: ( ( () ) )
            // InternalAnn.g:2354:1: ( () )
            {
            // InternalAnn.g:2354:1: ( () )
            // InternalAnn.g:2355:2: ()
            {
             before(grammarAccess.getFactorAccess().getFacLeftAction_1_0()); 
            // InternalAnn.g:2356:2: ()
            // InternalAnn.g:2356:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFacLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalAnn.g:2364:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2368:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalAnn.g:2369:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalAnn.g:2376:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2380:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:2381:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:2381:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalAnn.g:2382:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:2383:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalAnn.g:2383:3: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalAnn.g:2391:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2395:1: ( rule__Factor__Group_1__2__Impl )
            // InternalAnn.g:2396:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalAnn.g:2402:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2406:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2407:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2407:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalAnn.g:2408:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2409:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalAnn.g:2409:3: rule__Factor__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalAnn.g:2418:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2422:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAnn.g:2423:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalAnn.g:2430:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2434:1: ( ( '(' ) )
            // InternalAnn.g:2435:1: ( '(' )
            {
            // InternalAnn.g:2435:1: ( '(' )
            // InternalAnn.g:2436:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalAnn.g:2445:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2449:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAnn.g:2450:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalAnn.g:2457:1: rule__Primary__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2461:1: ( ( ruleExpression ) )
            // InternalAnn.g:2462:1: ( ruleExpression )
            {
            // InternalAnn.g:2462:1: ( ruleExpression )
            // InternalAnn.g:2463:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalAnn.g:2472:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2476:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAnn.g:2477:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalAnn.g:2483:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2487:1: ( ( ')' ) )
            // InternalAnn.g:2488:1: ( ')' )
            {
            // InternalAnn.g:2488:1: ( ')' )
            // InternalAnn.g:2489:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Euler__Group__0"
    // InternalAnn.g:2499:1: rule__Euler__Group__0 : rule__Euler__Group__0__Impl rule__Euler__Group__1 ;
    public final void rule__Euler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2503:1: ( rule__Euler__Group__0__Impl rule__Euler__Group__1 )
            // InternalAnn.g:2504:2: rule__Euler__Group__0__Impl rule__Euler__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Euler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Euler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__0"


    // $ANTLR start "rule__Euler__Group__0__Impl"
    // InternalAnn.g:2511:1: rule__Euler__Group__0__Impl : ( 'e' ) ;
    public final void rule__Euler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2515:1: ( ( 'e' ) )
            // InternalAnn.g:2516:1: ( 'e' )
            {
            // InternalAnn.g:2516:1: ( 'e' )
            // InternalAnn.g:2517:2: 'e'
            {
             before(grammarAccess.getEulerAccess().getEKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEulerAccess().getEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__0__Impl"


    // $ANTLR start "rule__Euler__Group__1"
    // InternalAnn.g:2526:1: rule__Euler__Group__1 : rule__Euler__Group__1__Impl rule__Euler__Group__2 ;
    public final void rule__Euler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2530:1: ( rule__Euler__Group__1__Impl rule__Euler__Group__2 )
            // InternalAnn.g:2531:2: rule__Euler__Group__1__Impl rule__Euler__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Euler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Euler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__1"


    // $ANTLR start "rule__Euler__Group__1__Impl"
    // InternalAnn.g:2538:1: rule__Euler__Group__1__Impl : ( '(' ) ;
    public final void rule__Euler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2542:1: ( ( '(' ) )
            // InternalAnn.g:2543:1: ( '(' )
            {
            // InternalAnn.g:2543:1: ( '(' )
            // InternalAnn.g:2544:2: '('
            {
             before(grammarAccess.getEulerAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEulerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__1__Impl"


    // $ANTLR start "rule__Euler__Group__2"
    // InternalAnn.g:2553:1: rule__Euler__Group__2 : rule__Euler__Group__2__Impl rule__Euler__Group__3 ;
    public final void rule__Euler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2557:1: ( rule__Euler__Group__2__Impl rule__Euler__Group__3 )
            // InternalAnn.g:2558:2: rule__Euler__Group__2__Impl rule__Euler__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Euler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Euler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__2"


    // $ANTLR start "rule__Euler__Group__2__Impl"
    // InternalAnn.g:2565:1: rule__Euler__Group__2__Impl : ( ( rule__Euler__ValueAssignment_2 ) ) ;
    public final void rule__Euler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2569:1: ( ( ( rule__Euler__ValueAssignment_2 ) ) )
            // InternalAnn.g:2570:1: ( ( rule__Euler__ValueAssignment_2 ) )
            {
            // InternalAnn.g:2570:1: ( ( rule__Euler__ValueAssignment_2 ) )
            // InternalAnn.g:2571:2: ( rule__Euler__ValueAssignment_2 )
            {
             before(grammarAccess.getEulerAccess().getValueAssignment_2()); 
            // InternalAnn.g:2572:2: ( rule__Euler__ValueAssignment_2 )
            // InternalAnn.g:2572:3: rule__Euler__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Euler__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEulerAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__2__Impl"


    // $ANTLR start "rule__Euler__Group__3"
    // InternalAnn.g:2580:1: rule__Euler__Group__3 : rule__Euler__Group__3__Impl ;
    public final void rule__Euler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2584:1: ( rule__Euler__Group__3__Impl )
            // InternalAnn.g:2585:2: rule__Euler__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Euler__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__3"


    // $ANTLR start "rule__Euler__Group__3__Impl"
    // InternalAnn.g:2591:1: rule__Euler__Group__3__Impl : ( ')' ) ;
    public final void rule__Euler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2595:1: ( ( ')' ) )
            // InternalAnn.g:2596:1: ( ')' )
            {
            // InternalAnn.g:2596:1: ( ')' )
            // InternalAnn.g:2597:2: ')'
            {
             before(grammarAccess.getEulerAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEulerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__3__Impl"


    // $ANTLR start "rule__NLog__Group__0"
    // InternalAnn.g:2607:1: rule__NLog__Group__0 : rule__NLog__Group__0__Impl rule__NLog__Group__1 ;
    public final void rule__NLog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2611:1: ( rule__NLog__Group__0__Impl rule__NLog__Group__1 )
            // InternalAnn.g:2612:2: rule__NLog__Group__0__Impl rule__NLog__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NLog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NLog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__0"


    // $ANTLR start "rule__NLog__Group__0__Impl"
    // InternalAnn.g:2619:1: rule__NLog__Group__0__Impl : ( 'nlog' ) ;
    public final void rule__NLog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2623:1: ( ( 'nlog' ) )
            // InternalAnn.g:2624:1: ( 'nlog' )
            {
            // InternalAnn.g:2624:1: ( 'nlog' )
            // InternalAnn.g:2625:2: 'nlog'
            {
             before(grammarAccess.getNLogAccess().getNlogKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNLogAccess().getNlogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__0__Impl"


    // $ANTLR start "rule__NLog__Group__1"
    // InternalAnn.g:2634:1: rule__NLog__Group__1 : rule__NLog__Group__1__Impl rule__NLog__Group__2 ;
    public final void rule__NLog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2638:1: ( rule__NLog__Group__1__Impl rule__NLog__Group__2 )
            // InternalAnn.g:2639:2: rule__NLog__Group__1__Impl rule__NLog__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__NLog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NLog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__1"


    // $ANTLR start "rule__NLog__Group__1__Impl"
    // InternalAnn.g:2646:1: rule__NLog__Group__1__Impl : ( '(' ) ;
    public final void rule__NLog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2650:1: ( ( '(' ) )
            // InternalAnn.g:2651:1: ( '(' )
            {
            // InternalAnn.g:2651:1: ( '(' )
            // InternalAnn.g:2652:2: '('
            {
             before(grammarAccess.getNLogAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNLogAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__1__Impl"


    // $ANTLR start "rule__NLog__Group__2"
    // InternalAnn.g:2661:1: rule__NLog__Group__2 : rule__NLog__Group__2__Impl rule__NLog__Group__3 ;
    public final void rule__NLog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2665:1: ( rule__NLog__Group__2__Impl rule__NLog__Group__3 )
            // InternalAnn.g:2666:2: rule__NLog__Group__2__Impl rule__NLog__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__NLog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NLog__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__2"


    // $ANTLR start "rule__NLog__Group__2__Impl"
    // InternalAnn.g:2673:1: rule__NLog__Group__2__Impl : ( ( rule__NLog__ValueAssignment_2 ) ) ;
    public final void rule__NLog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2677:1: ( ( ( rule__NLog__ValueAssignment_2 ) ) )
            // InternalAnn.g:2678:1: ( ( rule__NLog__ValueAssignment_2 ) )
            {
            // InternalAnn.g:2678:1: ( ( rule__NLog__ValueAssignment_2 ) )
            // InternalAnn.g:2679:2: ( rule__NLog__ValueAssignment_2 )
            {
             before(grammarAccess.getNLogAccess().getValueAssignment_2()); 
            // InternalAnn.g:2680:2: ( rule__NLog__ValueAssignment_2 )
            // InternalAnn.g:2680:3: rule__NLog__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NLog__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNLogAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__2__Impl"


    // $ANTLR start "rule__NLog__Group__3"
    // InternalAnn.g:2688:1: rule__NLog__Group__3 : rule__NLog__Group__3__Impl ;
    public final void rule__NLog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2692:1: ( rule__NLog__Group__3__Impl )
            // InternalAnn.g:2693:2: rule__NLog__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NLog__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__3"


    // $ANTLR start "rule__NLog__Group__3__Impl"
    // InternalAnn.g:2699:1: rule__NLog__Group__3__Impl : ( ')' ) ;
    public final void rule__NLog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2703:1: ( ( ')' ) )
            // InternalAnn.g:2704:1: ( ')' )
            {
            // InternalAnn.g:2704:1: ( ')' )
            // InternalAnn.g:2705:2: ')'
            {
             before(grammarAccess.getNLogAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNLogAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__3__Impl"


    // $ANTLR start "rule__Sin__Group__0"
    // InternalAnn.g:2715:1: rule__Sin__Group__0 : rule__Sin__Group__0__Impl rule__Sin__Group__1 ;
    public final void rule__Sin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2719:1: ( rule__Sin__Group__0__Impl rule__Sin__Group__1 )
            // InternalAnn.g:2720:2: rule__Sin__Group__0__Impl rule__Sin__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Sin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0"


    // $ANTLR start "rule__Sin__Group__0__Impl"
    // InternalAnn.g:2727:1: rule__Sin__Group__0__Impl : ( 'sin' ) ;
    public final void rule__Sin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2731:1: ( ( 'sin' ) )
            // InternalAnn.g:2732:1: ( 'sin' )
            {
            // InternalAnn.g:2732:1: ( 'sin' )
            // InternalAnn.g:2733:2: 'sin'
            {
             before(grammarAccess.getSinAccess().getSinKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSinAccess().getSinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0__Impl"


    // $ANTLR start "rule__Sin__Group__1"
    // InternalAnn.g:2742:1: rule__Sin__Group__1 : rule__Sin__Group__1__Impl rule__Sin__Group__2 ;
    public final void rule__Sin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2746:1: ( rule__Sin__Group__1__Impl rule__Sin__Group__2 )
            // InternalAnn.g:2747:2: rule__Sin__Group__1__Impl rule__Sin__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Sin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1"


    // $ANTLR start "rule__Sin__Group__1__Impl"
    // InternalAnn.g:2754:1: rule__Sin__Group__1__Impl : ( '(' ) ;
    public final void rule__Sin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2758:1: ( ( '(' ) )
            // InternalAnn.g:2759:1: ( '(' )
            {
            // InternalAnn.g:2759:1: ( '(' )
            // InternalAnn.g:2760:2: '('
            {
             before(grammarAccess.getSinAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSinAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1__Impl"


    // $ANTLR start "rule__Sin__Group__2"
    // InternalAnn.g:2769:1: rule__Sin__Group__2 : rule__Sin__Group__2__Impl rule__Sin__Group__3 ;
    public final void rule__Sin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2773:1: ( rule__Sin__Group__2__Impl rule__Sin__Group__3 )
            // InternalAnn.g:2774:2: rule__Sin__Group__2__Impl rule__Sin__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Sin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2"


    // $ANTLR start "rule__Sin__Group__2__Impl"
    // InternalAnn.g:2781:1: rule__Sin__Group__2__Impl : ( ( rule__Sin__ValueAssignment_2 ) ) ;
    public final void rule__Sin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2785:1: ( ( ( rule__Sin__ValueAssignment_2 ) ) )
            // InternalAnn.g:2786:1: ( ( rule__Sin__ValueAssignment_2 ) )
            {
            // InternalAnn.g:2786:1: ( ( rule__Sin__ValueAssignment_2 ) )
            // InternalAnn.g:2787:2: ( rule__Sin__ValueAssignment_2 )
            {
             before(grammarAccess.getSinAccess().getValueAssignment_2()); 
            // InternalAnn.g:2788:2: ( rule__Sin__ValueAssignment_2 )
            // InternalAnn.g:2788:3: rule__Sin__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sin__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSinAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2__Impl"


    // $ANTLR start "rule__Sin__Group__3"
    // InternalAnn.g:2796:1: rule__Sin__Group__3 : rule__Sin__Group__3__Impl ;
    public final void rule__Sin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2800:1: ( rule__Sin__Group__3__Impl )
            // InternalAnn.g:2801:2: rule__Sin__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__3"


    // $ANTLR start "rule__Sin__Group__3__Impl"
    // InternalAnn.g:2807:1: rule__Sin__Group__3__Impl : ( ')' ) ;
    public final void rule__Sin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2811:1: ( ( ')' ) )
            // InternalAnn.g:2812:1: ( ')' )
            {
            // InternalAnn.g:2812:1: ( ')' )
            // InternalAnn.g:2813:2: ')'
            {
             before(grammarAccess.getSinAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSinAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__3__Impl"


    // $ANTLR start "rule__Cos__Group__0"
    // InternalAnn.g:2823:1: rule__Cos__Group__0 : rule__Cos__Group__0__Impl rule__Cos__Group__1 ;
    public final void rule__Cos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2827:1: ( rule__Cos__Group__0__Impl rule__Cos__Group__1 )
            // InternalAnn.g:2828:2: rule__Cos__Group__0__Impl rule__Cos__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Cos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0"


    // $ANTLR start "rule__Cos__Group__0__Impl"
    // InternalAnn.g:2835:1: rule__Cos__Group__0__Impl : ( 'cos' ) ;
    public final void rule__Cos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2839:1: ( ( 'cos' ) )
            // InternalAnn.g:2840:1: ( 'cos' )
            {
            // InternalAnn.g:2840:1: ( 'cos' )
            // InternalAnn.g:2841:2: 'cos'
            {
             before(grammarAccess.getCosAccess().getCosKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCosAccess().getCosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0__Impl"


    // $ANTLR start "rule__Cos__Group__1"
    // InternalAnn.g:2850:1: rule__Cos__Group__1 : rule__Cos__Group__1__Impl rule__Cos__Group__2 ;
    public final void rule__Cos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2854:1: ( rule__Cos__Group__1__Impl rule__Cos__Group__2 )
            // InternalAnn.g:2855:2: rule__Cos__Group__1__Impl rule__Cos__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Cos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1"


    // $ANTLR start "rule__Cos__Group__1__Impl"
    // InternalAnn.g:2862:1: rule__Cos__Group__1__Impl : ( '(' ) ;
    public final void rule__Cos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2866:1: ( ( '(' ) )
            // InternalAnn.g:2867:1: ( '(' )
            {
            // InternalAnn.g:2867:1: ( '(' )
            // InternalAnn.g:2868:2: '('
            {
             before(grammarAccess.getCosAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCosAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1__Impl"


    // $ANTLR start "rule__Cos__Group__2"
    // InternalAnn.g:2877:1: rule__Cos__Group__2 : rule__Cos__Group__2__Impl rule__Cos__Group__3 ;
    public final void rule__Cos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2881:1: ( rule__Cos__Group__2__Impl rule__Cos__Group__3 )
            // InternalAnn.g:2882:2: rule__Cos__Group__2__Impl rule__Cos__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Cos__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cos__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2"


    // $ANTLR start "rule__Cos__Group__2__Impl"
    // InternalAnn.g:2889:1: rule__Cos__Group__2__Impl : ( ( rule__Cos__ValueAssignment_2 ) ) ;
    public final void rule__Cos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2893:1: ( ( ( rule__Cos__ValueAssignment_2 ) ) )
            // InternalAnn.g:2894:1: ( ( rule__Cos__ValueAssignment_2 ) )
            {
            // InternalAnn.g:2894:1: ( ( rule__Cos__ValueAssignment_2 ) )
            // InternalAnn.g:2895:2: ( rule__Cos__ValueAssignment_2 )
            {
             before(grammarAccess.getCosAccess().getValueAssignment_2()); 
            // InternalAnn.g:2896:2: ( rule__Cos__ValueAssignment_2 )
            // InternalAnn.g:2896:3: rule__Cos__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cos__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCosAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2__Impl"


    // $ANTLR start "rule__Cos__Group__3"
    // InternalAnn.g:2904:1: rule__Cos__Group__3 : rule__Cos__Group__3__Impl ;
    public final void rule__Cos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2908:1: ( rule__Cos__Group__3__Impl )
            // InternalAnn.g:2909:2: rule__Cos__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__3"


    // $ANTLR start "rule__Cos__Group__3__Impl"
    // InternalAnn.g:2915:1: rule__Cos__Group__3__Impl : ( ')' ) ;
    public final void rule__Cos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2919:1: ( ( ')' ) )
            // InternalAnn.g:2920:1: ( ')' )
            {
            // InternalAnn.g:2920:1: ( ')' )
            // InternalAnn.g:2921:2: ')'
            {
             before(grammarAccess.getCosAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCosAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__3__Impl"


    // $ANTLR start "rule__Sqrt__Group__0"
    // InternalAnn.g:2931:1: rule__Sqrt__Group__0 : rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 ;
    public final void rule__Sqrt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2935:1: ( rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 )
            // InternalAnn.g:2936:2: rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Sqrt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0"


    // $ANTLR start "rule__Sqrt__Group__0__Impl"
    // InternalAnn.g:2943:1: rule__Sqrt__Group__0__Impl : ( 'sqrt' ) ;
    public final void rule__Sqrt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2947:1: ( ( 'sqrt' ) )
            // InternalAnn.g:2948:1: ( 'sqrt' )
            {
            // InternalAnn.g:2948:1: ( 'sqrt' )
            // InternalAnn.g:2949:2: 'sqrt'
            {
             before(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0__Impl"


    // $ANTLR start "rule__Sqrt__Group__1"
    // InternalAnn.g:2958:1: rule__Sqrt__Group__1 : rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 ;
    public final void rule__Sqrt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2962:1: ( rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 )
            // InternalAnn.g:2963:2: rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Sqrt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1"


    // $ANTLR start "rule__Sqrt__Group__1__Impl"
    // InternalAnn.g:2970:1: rule__Sqrt__Group__1__Impl : ( '(' ) ;
    public final void rule__Sqrt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2974:1: ( ( '(' ) )
            // InternalAnn.g:2975:1: ( '(' )
            {
            // InternalAnn.g:2975:1: ( '(' )
            // InternalAnn.g:2976:2: '('
            {
             before(grammarAccess.getSqrtAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSqrtAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1__Impl"


    // $ANTLR start "rule__Sqrt__Group__2"
    // InternalAnn.g:2985:1: rule__Sqrt__Group__2 : rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3 ;
    public final void rule__Sqrt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2989:1: ( rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3 )
            // InternalAnn.g:2990:2: rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Sqrt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2"


    // $ANTLR start "rule__Sqrt__Group__2__Impl"
    // InternalAnn.g:2997:1: rule__Sqrt__Group__2__Impl : ( ( rule__Sqrt__ValueAssignment_2 ) ) ;
    public final void rule__Sqrt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3001:1: ( ( ( rule__Sqrt__ValueAssignment_2 ) ) )
            // InternalAnn.g:3002:1: ( ( rule__Sqrt__ValueAssignment_2 ) )
            {
            // InternalAnn.g:3002:1: ( ( rule__Sqrt__ValueAssignment_2 ) )
            // InternalAnn.g:3003:2: ( rule__Sqrt__ValueAssignment_2 )
            {
             before(grammarAccess.getSqrtAccess().getValueAssignment_2()); 
            // InternalAnn.g:3004:2: ( rule__Sqrt__ValueAssignment_2 )
            // InternalAnn.g:3004:3: rule__Sqrt__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSqrtAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2__Impl"


    // $ANTLR start "rule__Sqrt__Group__3"
    // InternalAnn.g:3012:1: rule__Sqrt__Group__3 : rule__Sqrt__Group__3__Impl ;
    public final void rule__Sqrt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3016:1: ( rule__Sqrt__Group__3__Impl )
            // InternalAnn.g:3017:2: rule__Sqrt__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__3"


    // $ANTLR start "rule__Sqrt__Group__3__Impl"
    // InternalAnn.g:3023:1: rule__Sqrt__Group__3__Impl : ( ')' ) ;
    public final void rule__Sqrt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3027:1: ( ( ')' ) )
            // InternalAnn.g:3028:1: ( ')' )
            {
            // InternalAnn.g:3028:1: ( ')' )
            // InternalAnn.g:3029:2: ')'
            {
             before(grammarAccess.getSqrtAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSqrtAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__3__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // InternalAnn.g:3039:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3043:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalAnn.g:3044:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Power__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // InternalAnn.g:3051:1: rule__Power__Group__0__Impl : ( 'pow' ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3055:1: ( ( 'pow' ) )
            // InternalAnn.g:3056:1: ( 'pow' )
            {
            // InternalAnn.g:3056:1: ( 'pow' )
            // InternalAnn.g:3057:2: 'pow'
            {
             before(grammarAccess.getPowerAccess().getPowKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getPowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // InternalAnn.g:3066:1: rule__Power__Group__1 : rule__Power__Group__1__Impl rule__Power__Group__2 ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3070:1: ( rule__Power__Group__1__Impl rule__Power__Group__2 )
            // InternalAnn.g:3071:2: rule__Power__Group__1__Impl rule__Power__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Power__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // InternalAnn.g:3078:1: rule__Power__Group__1__Impl : ( '(' ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3082:1: ( ( '(' ) )
            // InternalAnn.g:3083:1: ( '(' )
            {
            // InternalAnn.g:3083:1: ( '(' )
            // InternalAnn.g:3084:2: '('
            {
             before(grammarAccess.getPowerAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group__2"
    // InternalAnn.g:3093:1: rule__Power__Group__2 : rule__Power__Group__2__Impl rule__Power__Group__3 ;
    public final void rule__Power__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3097:1: ( rule__Power__Group__2__Impl rule__Power__Group__3 )
            // InternalAnn.g:3098:2: rule__Power__Group__2__Impl rule__Power__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Power__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__2"


    // $ANTLR start "rule__Power__Group__2__Impl"
    // InternalAnn.g:3105:1: rule__Power__Group__2__Impl : ( ( rule__Power__BaseAssignment_2 ) ) ;
    public final void rule__Power__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3109:1: ( ( ( rule__Power__BaseAssignment_2 ) ) )
            // InternalAnn.g:3110:1: ( ( rule__Power__BaseAssignment_2 ) )
            {
            // InternalAnn.g:3110:1: ( ( rule__Power__BaseAssignment_2 ) )
            // InternalAnn.g:3111:2: ( rule__Power__BaseAssignment_2 )
            {
             before(grammarAccess.getPowerAccess().getBaseAssignment_2()); 
            // InternalAnn.g:3112:2: ( rule__Power__BaseAssignment_2 )
            // InternalAnn.g:3112:3: rule__Power__BaseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Power__BaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getBaseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__2__Impl"


    // $ANTLR start "rule__Power__Group__3"
    // InternalAnn.g:3120:1: rule__Power__Group__3 : rule__Power__Group__3__Impl rule__Power__Group__4 ;
    public final void rule__Power__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3124:1: ( rule__Power__Group__3__Impl rule__Power__Group__4 )
            // InternalAnn.g:3125:2: rule__Power__Group__3__Impl rule__Power__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Power__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__3"


    // $ANTLR start "rule__Power__Group__3__Impl"
    // InternalAnn.g:3132:1: rule__Power__Group__3__Impl : ( ',' ) ;
    public final void rule__Power__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3136:1: ( ( ',' ) )
            // InternalAnn.g:3137:1: ( ',' )
            {
            // InternalAnn.g:3137:1: ( ',' )
            // InternalAnn.g:3138:2: ','
            {
             before(grammarAccess.getPowerAccess().getCommaKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__3__Impl"


    // $ANTLR start "rule__Power__Group__4"
    // InternalAnn.g:3147:1: rule__Power__Group__4 : rule__Power__Group__4__Impl rule__Power__Group__5 ;
    public final void rule__Power__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3151:1: ( rule__Power__Group__4__Impl rule__Power__Group__5 )
            // InternalAnn.g:3152:2: rule__Power__Group__4__Impl rule__Power__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Power__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__4"


    // $ANTLR start "rule__Power__Group__4__Impl"
    // InternalAnn.g:3159:1: rule__Power__Group__4__Impl : ( ( rule__Power__ExponentAssignment_4 ) ) ;
    public final void rule__Power__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3163:1: ( ( ( rule__Power__ExponentAssignment_4 ) ) )
            // InternalAnn.g:3164:1: ( ( rule__Power__ExponentAssignment_4 ) )
            {
            // InternalAnn.g:3164:1: ( ( rule__Power__ExponentAssignment_4 ) )
            // InternalAnn.g:3165:2: ( rule__Power__ExponentAssignment_4 )
            {
             before(grammarAccess.getPowerAccess().getExponentAssignment_4()); 
            // InternalAnn.g:3166:2: ( rule__Power__ExponentAssignment_4 )
            // InternalAnn.g:3166:3: rule__Power__ExponentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Power__ExponentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getExponentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__4__Impl"


    // $ANTLR start "rule__Power__Group__5"
    // InternalAnn.g:3174:1: rule__Power__Group__5 : rule__Power__Group__5__Impl ;
    public final void rule__Power__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3178:1: ( rule__Power__Group__5__Impl )
            // InternalAnn.g:3179:2: rule__Power__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__5"


    // $ANTLR start "rule__Power__Group__5__Impl"
    // InternalAnn.g:3185:1: rule__Power__Group__5__Impl : ( ')' ) ;
    public final void rule__Power__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3189:1: ( ( ')' ) )
            // InternalAnn.g:3190:1: ( ')' )
            {
            // InternalAnn.g:3190:1: ( ')' )
            // InternalAnn.g:3191:2: ')'
            {
             before(grammarAccess.getPowerAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__5__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalAnn.g:3201:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3205:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalAnn.g:3206:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalAnn.g:3213:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3217:1: ( ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3218:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3218:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            // InternalAnn.g:3219:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3220:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnn.g:3220:3: rule__NumberLiteral__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalAnn.g:3228:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3232:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalAnn.g:3233:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalAnn.g:3239:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3243:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // InternalAnn.g:3244:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3244:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // InternalAnn.g:3245:2: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // InternalAnn.g:3246:2: ( rule__NumberLiteral__ValueAssignment_1 )
            // InternalAnn.g:3246:3: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__Letter__Group__0"
    // InternalAnn.g:3255:1: rule__Letter__Group__0 : rule__Letter__Group__0__Impl rule__Letter__Group__1 ;
    public final void rule__Letter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3259:1: ( rule__Letter__Group__0__Impl rule__Letter__Group__1 )
            // InternalAnn.g:3260:2: rule__Letter__Group__0__Impl rule__Letter__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Letter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Letter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__0"


    // $ANTLR start "rule__Letter__Group__0__Impl"
    // InternalAnn.g:3267:1: rule__Letter__Group__0__Impl : ( ( rule__Letter__OperatorAssignment_0 )? ) ;
    public final void rule__Letter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3271:1: ( ( ( rule__Letter__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3272:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3272:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            // InternalAnn.g:3273:2: ( rule__Letter__OperatorAssignment_0 )?
            {
             before(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3274:2: ( rule__Letter__OperatorAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=12)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnn.g:3274:3: rule__Letter__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Letter__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__0__Impl"


    // $ANTLR start "rule__Letter__Group__1"
    // InternalAnn.g:3282:1: rule__Letter__Group__1 : rule__Letter__Group__1__Impl ;
    public final void rule__Letter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3286:1: ( rule__Letter__Group__1__Impl )
            // InternalAnn.g:3287:2: rule__Letter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__1"


    // $ANTLR start "rule__Letter__Group__1__Impl"
    // InternalAnn.g:3293:1: rule__Letter__Group__1__Impl : ( ( rule__Letter__ValueAssignment_1 ) ) ;
    public final void rule__Letter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3297:1: ( ( ( rule__Letter__ValueAssignment_1 ) ) )
            // InternalAnn.g:3298:1: ( ( rule__Letter__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3298:1: ( ( rule__Letter__ValueAssignment_1 ) )
            // InternalAnn.g:3299:2: ( rule__Letter__ValueAssignment_1 )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment_1()); 
            // InternalAnn.g:3300:2: ( rule__Letter__ValueAssignment_1 )
            // InternalAnn.g:3300:3: rule__Letter__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Letter__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__1__Impl"


    // $ANTLR start "rule__ANNModel__NameAssignment_0"
    // InternalAnn.g:3309:1: rule__ANNModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ANNModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3313:1: ( ( RULE_ID ) )
            // InternalAnn.g:3314:2: ( RULE_ID )
            {
            // InternalAnn.g:3314:2: ( RULE_ID )
            // InternalAnn.g:3315:3: RULE_ID
            {
             before(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__NameAssignment_0"


    // $ANTLR start "rule__ANNModel__AlphaAssignment_3"
    // InternalAnn.g:3324:1: rule__ANNModel__AlphaAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__ANNModel__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3328:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:3329:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:3329:2: ( ruleDECIMAL )
            // InternalAnn.g:3330:3: ruleDECIMAL
            {
             before(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__AlphaAssignment_3"


    // $ANTLR start "rule__ANNModel__EpochsAssignment_5"
    // InternalAnn.g:3339:1: rule__ANNModel__EpochsAssignment_5 : ( RULE_INT ) ;
    public final void rule__ANNModel__EpochsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3343:1: ( ( RULE_INT ) )
            // InternalAnn.g:3344:2: ( RULE_INT )
            {
            // InternalAnn.g:3344:2: ( RULE_INT )
            // InternalAnn.g:3345:3: RULE_INT
            {
             before(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__EpochsAssignment_5"


    // $ANTLR start "rule__ANNModel__ActivationAssignment_6"
    // InternalAnn.g:3354:1: rule__ANNModel__ActivationAssignment_6 : ( ruleActivation ) ;
    public final void rule__ANNModel__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3358:1: ( ( ruleActivation ) )
            // InternalAnn.g:3359:2: ( ruleActivation )
            {
            // InternalAnn.g:3359:2: ( ruleActivation )
            // InternalAnn.g:3360:3: ruleActivation
            {
             before(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__ActivationAssignment_6"


    // $ANTLR start "rule__ANNModel__LayerAssignment_7"
    // InternalAnn.g:3369:1: rule__ANNModel__LayerAssignment_7 : ( ruleLayer ) ;
    public final void rule__ANNModel__LayerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3373:1: ( ( ruleLayer ) )
            // InternalAnn.g:3374:2: ( ruleLayer )
            {
            // InternalAnn.g:3374:2: ( ruleLayer )
            // InternalAnn.g:3375:3: ruleLayer
            {
             before(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__LayerAssignment_7"


    // $ANTLR start "rule__Hidden__SizeAssignment_3"
    // InternalAnn.g:3384:1: rule__Hidden__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Hidden__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3388:1: ( ( RULE_INT ) )
            // InternalAnn.g:3389:2: ( RULE_INT )
            {
            // InternalAnn.g:3389:2: ( RULE_INT )
            // InternalAnn.g:3390:3: RULE_INT
            {
             before(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__SizeAssignment_3"


    // $ANTLR start "rule__Hidden__L_ruleAssignment_5"
    // InternalAnn.g:3399:1: rule__Hidden__L_ruleAssignment_5 : ( ruleLearningRule ) ;
    public final void rule__Hidden__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3403:1: ( ( ruleLearningRule ) )
            // InternalAnn.g:3404:2: ( ruleLearningRule )
            {
            // InternalAnn.g:3404:2: ( ruleLearningRule )
            // InternalAnn.g:3405:3: ruleLearningRule
            {
             before(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__L_ruleAssignment_5"


    // $ANTLR start "rule__Input__SizeAssignment_3"
    // InternalAnn.g:3414:1: rule__Input__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Input__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3418:1: ( ( RULE_INT ) )
            // InternalAnn.g:3419:2: ( RULE_INT )
            {
            // InternalAnn.g:3419:2: ( RULE_INT )
            // InternalAnn.g:3420:3: RULE_INT
            {
             before(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SizeAssignment_3"


    // $ANTLR start "rule__Output__SizeAssignment_3"
    // InternalAnn.g:3429:1: rule__Output__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Output__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3433:1: ( ( RULE_INT ) )
            // InternalAnn.g:3434:2: ( RULE_INT )
            {
            // InternalAnn.g:3434:2: ( RULE_INT )
            // InternalAnn.g:3435:3: RULE_INT
            {
             before(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__SizeAssignment_3"


    // $ANTLR start "rule__Output__L_ruleAssignment_5"
    // InternalAnn.g:3444:1: rule__Output__L_ruleAssignment_5 : ( ruleLearningRule ) ;
    public final void rule__Output__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3448:1: ( ( ruleLearningRule ) )
            // InternalAnn.g:3449:2: ( ruleLearningRule )
            {
            // InternalAnn.g:3449:2: ( ruleLearningRule )
            // InternalAnn.g:3450:3: ruleLearningRule
            {
             before(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__L_ruleAssignment_5"


    // $ANTLR start "rule__LearningRule__SigmoidAssignment_0"
    // InternalAnn.g:3459:1: rule__LearningRule__SigmoidAssignment_0 : ( ( 'sigmoid' ) ) ;
    public final void rule__LearningRule__SigmoidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3463:1: ( ( ( 'sigmoid' ) ) )
            // InternalAnn.g:3464:2: ( ( 'sigmoid' ) )
            {
            // InternalAnn.g:3464:2: ( ( 'sigmoid' ) )
            // InternalAnn.g:3465:3: ( 'sigmoid' )
            {
             before(grammarAccess.getLearningRuleAccess().getSigmoidSigmoidKeyword_0_0()); 
            // InternalAnn.g:3466:3: ( 'sigmoid' )
            // InternalAnn.g:3467:4: 'sigmoid'
            {
             before(grammarAccess.getLearningRuleAccess().getSigmoidSigmoidKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLearningRuleAccess().getSigmoidSigmoidKeyword_0_0()); 

            }

             after(grammarAccess.getLearningRuleAccess().getSigmoidSigmoidKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningRule__SigmoidAssignment_0"


    // $ANTLR start "rule__LearningRule__TansigAssignment_1"
    // InternalAnn.g:3478:1: rule__LearningRule__TansigAssignment_1 : ( ( 'tansig' ) ) ;
    public final void rule__LearningRule__TansigAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3482:1: ( ( ( 'tansig' ) ) )
            // InternalAnn.g:3483:2: ( ( 'tansig' ) )
            {
            // InternalAnn.g:3483:2: ( ( 'tansig' ) )
            // InternalAnn.g:3484:3: ( 'tansig' )
            {
             before(grammarAccess.getLearningRuleAccess().getTansigTansigKeyword_1_0()); 
            // InternalAnn.g:3485:3: ( 'tansig' )
            // InternalAnn.g:3486:4: 'tansig'
            {
             before(grammarAccess.getLearningRuleAccess().getTansigTansigKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLearningRuleAccess().getTansigTansigKeyword_1_0()); 

            }

             after(grammarAccess.getLearningRuleAccess().getTansigTansigKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningRule__TansigAssignment_1"


    // $ANTLR start "rule__LearningRule__NamedFunctionAssignment_2"
    // InternalAnn.g:3497:1: rule__LearningRule__NamedFunctionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LearningRule__NamedFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3501:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:3502:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:3502:2: ( ( RULE_ID ) )
            // InternalAnn.g:3503:3: ( RULE_ID )
            {
             before(grammarAccess.getLearningRuleAccess().getNamedFunctionActivationCrossReference_2_0()); 
            // InternalAnn.g:3504:3: ( RULE_ID )
            // InternalAnn.g:3505:4: RULE_ID
            {
             before(grammarAccess.getLearningRuleAccess().getNamedFunctionActivationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLearningRuleAccess().getNamedFunctionActivationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLearningRuleAccess().getNamedFunctionActivationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningRule__NamedFunctionAssignment_2"


    // $ANTLR start "rule__External__NameAssignment_0"
    // InternalAnn.g:3516:1: rule__External__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3520:1: ( ( RULE_ID ) )
            // InternalAnn.g:3521:2: ( RULE_ID )
            {
            // InternalAnn.g:3521:2: ( RULE_ID )
            // InternalAnn.g:3522:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__NameAssignment_0"


    // $ANTLR start "rule__Custom__NameAssignment_0"
    // InternalAnn.g:3531:1: rule__Custom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Custom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3535:1: ( ( RULE_ID ) )
            // InternalAnn.g:3536:2: ( RULE_ID )
            {
            // InternalAnn.g:3536:2: ( RULE_ID )
            // InternalAnn.g:3537:3: RULE_ID
            {
             before(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__NameAssignment_0"


    // $ANTLR start "rule__Custom__InputAssignment_2"
    // InternalAnn.g:3546:1: rule__Custom__InputAssignment_2 : ( ruleLetter ) ;
    public final void rule__Custom__InputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3550:1: ( ( ruleLetter ) )
            // InternalAnn.g:3551:2: ( ruleLetter )
            {
            // InternalAnn.g:3551:2: ( ruleLetter )
            // InternalAnn.g:3552:3: ruleLetter
            {
             before(grammarAccess.getCustomAccess().getInputLetterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getCustomAccess().getInputLetterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__InputAssignment_2"


    // $ANTLR start "rule__Custom__ExpAssignment_7"
    // InternalAnn.g:3561:1: rule__Custom__ExpAssignment_7 : ( ruleExpression ) ;
    public final void rule__Custom__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3565:1: ( ( ruleExpression ) )
            // InternalAnn.g:3566:2: ( ruleExpression )
            {
            // InternalAnn.g:3566:2: ( ruleExpression )
            // InternalAnn.g:3567:3: ruleExpression
            {
             before(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__ExpAssignment_7"


    // $ANTLR start "rule__Custom__DerAssignment_10"
    // InternalAnn.g:3576:1: rule__Custom__DerAssignment_10 : ( ruleExpression ) ;
    public final void rule__Custom__DerAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3580:1: ( ( ruleExpression ) )
            // InternalAnn.g:3581:2: ( ruleExpression )
            {
            // InternalAnn.g:3581:2: ( ruleExpression )
            // InternalAnn.g:3582:3: ruleExpression
            {
             before(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__DerAssignment_10"


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // InternalAnn.g:3591:1: rule__Expression__OperatorAssignment_1_1 : ( rulePartOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3595:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3596:2: ( rulePartOperator )
            {
            // InternalAnn.g:3596:2: ( rulePartOperator )
            // InternalAnn.g:3597:3: rulePartOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalAnn.g:3606:1: rule__Expression__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3610:1: ( ( ruleFactor ) )
            // InternalAnn.g:3611:2: ( ruleFactor )
            {
            // InternalAnn.g:3611:2: ( ruleFactor )
            // InternalAnn.g:3612:3: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // InternalAnn.g:3621:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3625:1: ( ( ruleFactorOperator ) )
            // InternalAnn.g:3626:2: ( ruleFactorOperator )
            {
            // InternalAnn.g:3626:2: ( ruleFactorOperator )
            // InternalAnn.g:3627:3: ruleFactorOperator
            {
             before(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_2"
    // InternalAnn.g:3636:1: rule__Factor__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3640:1: ( ( rulePrimary ) )
            // InternalAnn.g:3641:2: ( rulePrimary )
            {
            // InternalAnn.g:3641:2: ( rulePrimary )
            // InternalAnn.g:3642:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_2"


    // $ANTLR start "rule__Euler__ValueAssignment_2"
    // InternalAnn.g:3651:1: rule__Euler__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Euler__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3655:1: ( ( ruleExpression ) )
            // InternalAnn.g:3656:2: ( ruleExpression )
            {
            // InternalAnn.g:3656:2: ( ruleExpression )
            // InternalAnn.g:3657:3: ruleExpression
            {
             before(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__ValueAssignment_2"


    // $ANTLR start "rule__NLog__ValueAssignment_2"
    // InternalAnn.g:3666:1: rule__NLog__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__NLog__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3670:1: ( ( ruleExpression ) )
            // InternalAnn.g:3671:2: ( ruleExpression )
            {
            // InternalAnn.g:3671:2: ( ruleExpression )
            // InternalAnn.g:3672:3: ruleExpression
            {
             before(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__ValueAssignment_2"


    // $ANTLR start "rule__Sin__ValueAssignment_2"
    // InternalAnn.g:3681:1: rule__Sin__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Sin__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3685:1: ( ( ruleExpression ) )
            // InternalAnn.g:3686:2: ( ruleExpression )
            {
            // InternalAnn.g:3686:2: ( ruleExpression )
            // InternalAnn.g:3687:3: ruleExpression
            {
             before(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__ValueAssignment_2"


    // $ANTLR start "rule__Cos__ValueAssignment_2"
    // InternalAnn.g:3696:1: rule__Cos__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Cos__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3700:1: ( ( ruleExpression ) )
            // InternalAnn.g:3701:2: ( ruleExpression )
            {
            // InternalAnn.g:3701:2: ( ruleExpression )
            // InternalAnn.g:3702:3: ruleExpression
            {
             before(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__ValueAssignment_2"


    // $ANTLR start "rule__Sqrt__ValueAssignment_2"
    // InternalAnn.g:3711:1: rule__Sqrt__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Sqrt__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3715:1: ( ( ruleExpression ) )
            // InternalAnn.g:3716:2: ( ruleExpression )
            {
            // InternalAnn.g:3716:2: ( ruleExpression )
            // InternalAnn.g:3717:3: ruleExpression
            {
             before(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__ValueAssignment_2"


    // $ANTLR start "rule__Power__BaseAssignment_2"
    // InternalAnn.g:3726:1: rule__Power__BaseAssignment_2 : ( ruleExpression ) ;
    public final void rule__Power__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3730:1: ( ( ruleExpression ) )
            // InternalAnn.g:3731:2: ( ruleExpression )
            {
            // InternalAnn.g:3731:2: ( ruleExpression )
            // InternalAnn.g:3732:3: ruleExpression
            {
             before(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__BaseAssignment_2"


    // $ANTLR start "rule__Power__ExponentAssignment_4"
    // InternalAnn.g:3741:1: rule__Power__ExponentAssignment_4 : ( ruleExpression ) ;
    public final void rule__Power__ExponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3745:1: ( ( ruleExpression ) )
            // InternalAnn.g:3746:2: ( ruleExpression )
            {
            // InternalAnn.g:3746:2: ( ruleExpression )
            // InternalAnn.g:3747:3: ruleExpression
            {
             before(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__ExponentAssignment_4"


    // $ANTLR start "rule__NumberLiteral__OperatorAssignment_0"
    // InternalAnn.g:3756:1: rule__NumberLiteral__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__NumberLiteral__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3760:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3761:2: ( rulePartOperator )
            {
            // InternalAnn.g:3761:2: ( rulePartOperator )
            // InternalAnn.g:3762:3: rulePartOperator
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__OperatorAssignment_0"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // InternalAnn.g:3771:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumberTypes ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3775:1: ( ( ruleNumberTypes ) )
            // InternalAnn.g:3776:2: ( ruleNumberTypes )
            {
            // InternalAnn.g:3776:2: ( ruleNumberTypes )
            // InternalAnn.g:3777:3: ruleNumberTypes
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"


    // $ANTLR start "rule__Letter__OperatorAssignment_0"
    // InternalAnn.g:3786:1: rule__Letter__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__Letter__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3790:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3791:2: ( rulePartOperator )
            {
            // InternalAnn.g:3791:2: ( rulePartOperator )
            // InternalAnn.g:3792:3: rulePartOperator
            {
             before(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__OperatorAssignment_0"


    // $ANTLR start "rule__Letter__ValueAssignment_1"
    // InternalAnn.g:3801:1: rule__Letter__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__Letter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3805:1: ( ( RULE_ID ) )
            // InternalAnn.g:3806:2: ( RULE_ID )
            {
            // InternalAnn.g:3806:2: ( RULE_ID )
            // InternalAnn.g:3807:3: RULE_ID
            {
             before(grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001940020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001900002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000C000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F84001830L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001830L});

}