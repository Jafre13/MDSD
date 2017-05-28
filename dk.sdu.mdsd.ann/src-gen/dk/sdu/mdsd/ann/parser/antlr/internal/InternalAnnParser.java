package dk.sdu.mdsd.ann.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'out'", "'sigmoid'", "'tansig'", "'external'", "'('", "')'", "'function'", "'='", "'derivative'", "'e'", "'nlog'", "'sin'", "'cos'", "'sqrt'", "'pow'", "','", "'+'", "'-'", "'*'", "'/'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

        public InternalAnnParser(TokenStream input, AnnGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ANNModel";
       	}

       	@Override
       	protected AnnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleANNModel"
    // InternalAnn.g:64:1: entryRuleANNModel returns [EObject current=null] : iv_ruleANNModel= ruleANNModel EOF ;
    public final EObject entryRuleANNModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANNModel = null;


        try {
            // InternalAnn.g:64:49: (iv_ruleANNModel= ruleANNModel EOF )
            // InternalAnn.g:65:2: iv_ruleANNModel= ruleANNModel EOF
            {
             newCompositeNode(grammarAccess.getANNModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANNModel=ruleANNModel();

            state._fsp--;

             current =iv_ruleANNModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANNModel"


    // $ANTLR start "ruleANNModel"
    // InternalAnn.g:71:1: ruleANNModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' ) ;
    public final EObject ruleANNModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_epochs_5_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_alpha_3_0 = null;

        EObject lv_Activation_6_0 = null;

        EObject lv_Layer_7_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' ) )
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' )
            {
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' )
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}'
            {
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:80:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:80:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:81:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANNModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getANNModelAccess().getAlphaKeyword_2());
            		
            // InternalAnn.g:105:3: ( (lv_alpha_3_0= ruleDECIMAL ) )
            // InternalAnn.g:106:4: (lv_alpha_3_0= ruleDECIMAL )
            {
            // InternalAnn.g:106:4: (lv_alpha_3_0= ruleDECIMAL )
            // InternalAnn.g:107:5: lv_alpha_3_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_alpha_3_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANNModelRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_3_0,
            						"dk.sdu.mdsd.ann.Ann.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getANNModelAccess().getEpochsKeyword_4());
            		
            // InternalAnn.g:128:3: ( (lv_epochs_5_0= RULE_INT ) )
            // InternalAnn.g:129:4: (lv_epochs_5_0= RULE_INT )
            {
            // InternalAnn.g:129:4: (lv_epochs_5_0= RULE_INT )
            // InternalAnn.g:130:5: lv_epochs_5_0= RULE_INT
            {
            lv_epochs_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_epochs_5_0, grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANNModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"epochs",
            						lv_epochs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAnn.g:146:3: ( (lv_Activation_6_0= ruleActivation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnn.g:147:4: (lv_Activation_6_0= ruleActivation )
            	    {
            	    // InternalAnn.g:147:4: (lv_Activation_6_0= ruleActivation )
            	    // InternalAnn.g:148:5: lv_Activation_6_0= ruleActivation
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_Activation_6_0=ruleActivation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Activation",
            	    						lv_Activation_6_0,
            	    						"dk.sdu.mdsd.ann.Ann.Activation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAnn.g:165:3: ( (lv_Layer_7_0= ruleLayer ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnn.g:166:4: (lv_Layer_7_0= ruleLayer )
            	    {
            	    // InternalAnn.g:166:4: (lv_Layer_7_0= ruleLayer )
            	    // InternalAnn.g:167:5: lv_Layer_7_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Layer_7_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Layer",
            	    						lv_Layer_7_0,
            	    						"dk.sdu.mdsd.ann.Ann.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANNModel"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalAnn.g:192:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalAnn.g:192:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalAnn.g:193:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalAnn.g:199:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAnn.g:205:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalAnn.g:206:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAnn.g:206:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalAnn.g:207:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,15,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleLayer"
    // InternalAnn.g:230:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalAnn.g:230:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalAnn.g:231:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalAnn.g:237:1: ruleLayer returns [EObject current=null] : (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject this_Hidden_0 = null;

        EObject this_Input_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:243:2: ( (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) )
            // InternalAnn.g:244:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            {
            // InternalAnn.g:244:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnn.g:245:3: this_Hidden_0= ruleHidden
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hidden_0=ruleHidden();

                    state._fsp--;


                    			current = this_Hidden_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:254:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:263:3: this_Output_2= ruleOutput
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getOutputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    			current = this_Output_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleHidden"
    // InternalAnn.g:275:1: entryRuleHidden returns [EObject current=null] : iv_ruleHidden= ruleHidden EOF ;
    public final EObject entryRuleHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHidden = null;


        try {
            // InternalAnn.g:275:47: (iv_ruleHidden= ruleHidden EOF )
            // InternalAnn.g:276:2: iv_ruleHidden= ruleHidden EOF
            {
             newCompositeNode(grammarAccess.getHiddenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHidden=ruleHidden();

            state._fsp--;

             current =iv_ruleHidden; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHidden"


    // $ANTLR start "ruleHidden"
    // InternalAnn.g:282:1: ruleHidden returns [EObject current=null] : (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleHidden() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_l_rule_5_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:288:2: ( (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) )
            // InternalAnn.g:289:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:289:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            // InternalAnn.g:290:3: otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHiddenAccess().getHiddenKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHiddenAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:302:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:303:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:303:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:304:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_size_3_0, grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHiddenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getHiddenAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:324:3: ( (lv_l_rule_5_0= ruleLearningRule ) )
            // InternalAnn.g:325:4: (lv_l_rule_5_0= ruleLearningRule )
            {
            // InternalAnn.g:325:4: (lv_l_rule_5_0= ruleLearningRule )
            // InternalAnn.g:326:5: lv_l_rule_5_0= ruleLearningRule
            {

            					newCompositeNode(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_l_rule_5_0=ruleLearningRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHiddenRule());
            					}
            					set(
            						current,
            						"l_rule",
            						lv_l_rule_5_0,
            						"dk.sdu.mdsd.ann.Ann.LearningRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHidden"


    // $ANTLR start "entryRuleInput"
    // InternalAnn.g:351:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalAnn.g:351:46: (iv_ruleInput= ruleInput EOF )
            // InternalAnn.g:352:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalAnn.g:358:1: ruleInput returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAnn.g:364:2: ( (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalAnn.g:365:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalAnn.g:365:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalAnn.g:366:3: otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:378:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:379:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:379:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:380:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_size_3_0, grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:404:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAnn.g:404:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAnn.g:405:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnn.g:411:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_l_rule_5_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:417:2: ( (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) )
            // InternalAnn.g:418:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:418:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            // InternalAnn.g:419:3: otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:431:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:432:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:432:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:433:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_size_3_0, grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:453:3: ( (lv_l_rule_5_0= ruleLearningRule ) )
            // InternalAnn.g:454:4: (lv_l_rule_5_0= ruleLearningRule )
            {
            // InternalAnn.g:454:4: (lv_l_rule_5_0= ruleLearningRule )
            // InternalAnn.g:455:5: lv_l_rule_5_0= ruleLearningRule
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_l_rule_5_0=ruleLearningRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"l_rule",
            						lv_l_rule_5_0,
            						"dk.sdu.mdsd.ann.Ann.LearningRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleLearningRule"
    // InternalAnn.g:480:1: entryRuleLearningRule returns [EObject current=null] : iv_ruleLearningRule= ruleLearningRule EOF ;
    public final EObject entryRuleLearningRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLearningRule = null;


        try {
            // InternalAnn.g:480:53: (iv_ruleLearningRule= ruleLearningRule EOF )
            // InternalAnn.g:481:2: iv_ruleLearningRule= ruleLearningRule EOF
            {
             newCompositeNode(grammarAccess.getLearningRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLearningRule=ruleLearningRule();

            state._fsp--;

             current =iv_ruleLearningRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLearningRule"


    // $ANTLR start "ruleLearningRule"
    // InternalAnn.g:487:1: ruleLearningRule returns [EObject current=null] : ( ( (lv_Sigmoid_0_0= 'sigmoid' ) ) | ( (lv_Tansig_1_0= 'tansig' ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLearningRule() throws RecognitionException {
        EObject current = null;

        Token lv_Sigmoid_0_0=null;
        Token lv_Tansig_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAnn.g:493:2: ( ( ( (lv_Sigmoid_0_0= 'sigmoid' ) ) | ( (lv_Tansig_1_0= 'tansig' ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalAnn.g:494:2: ( ( (lv_Sigmoid_0_0= 'sigmoid' ) ) | ( (lv_Tansig_1_0= 'tansig' ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalAnn.g:494:2: ( ( (lv_Sigmoid_0_0= 'sigmoid' ) ) | ( (lv_Tansig_1_0= 'tansig' ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
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
                    // InternalAnn.g:495:3: ( (lv_Sigmoid_0_0= 'sigmoid' ) )
                    {
                    // InternalAnn.g:495:3: ( (lv_Sigmoid_0_0= 'sigmoid' ) )
                    // InternalAnn.g:496:4: (lv_Sigmoid_0_0= 'sigmoid' )
                    {
                    // InternalAnn.g:496:4: (lv_Sigmoid_0_0= 'sigmoid' )
                    // InternalAnn.g:497:5: lv_Sigmoid_0_0= 'sigmoid'
                    {
                    lv_Sigmoid_0_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_Sigmoid_0_0, grammarAccess.getLearningRuleAccess().getSigmoidSigmoidKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLearningRuleRule());
                    					}
                    					setWithLastConsumed(current, "Sigmoid", true, "sigmoid");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:510:3: ( (lv_Tansig_1_0= 'tansig' ) )
                    {
                    // InternalAnn.g:510:3: ( (lv_Tansig_1_0= 'tansig' ) )
                    // InternalAnn.g:511:4: (lv_Tansig_1_0= 'tansig' )
                    {
                    // InternalAnn.g:511:4: (lv_Tansig_1_0= 'tansig' )
                    // InternalAnn.g:512:5: lv_Tansig_1_0= 'tansig'
                    {
                    lv_Tansig_1_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_Tansig_1_0, grammarAccess.getLearningRuleAccess().getTansigTansigKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLearningRuleRule());
                    					}
                    					setWithLastConsumed(current, "Tansig", true, "tansig");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:525:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalAnn.g:525:3: ( (otherlv_2= RULE_ID ) )
                    // InternalAnn.g:526:4: (otherlv_2= RULE_ID )
                    {
                    // InternalAnn.g:526:4: (otherlv_2= RULE_ID )
                    // InternalAnn.g:527:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLearningRuleRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getLearningRuleAccess().getNamedFunctionActivationCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLearningRule"


    // $ANTLR start "entryRuleActivation"
    // InternalAnn.g:542:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // InternalAnn.g:542:51: (iv_ruleActivation= ruleActivation EOF )
            // InternalAnn.g:543:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // InternalAnn.g:549:1: ruleActivation returns [EObject current=null] : (this_External_0= ruleExternal | this_Custom_1= ruleCustom ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        EObject this_External_0 = null;

        EObject this_Custom_1 = null;



        	enterRule();

        try {
            // InternalAnn.g:555:2: ( (this_External_0= ruleExternal | this_Custom_1= ruleCustom ) )
            // InternalAnn.g:556:2: (this_External_0= ruleExternal | this_Custom_1= ruleCustom )
            {
            // InternalAnn.g:556:2: (this_External_0= ruleExternal | this_Custom_1= ruleCustom )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==24) ) {
                    alt5=2;
                }
                else if ( (LA5_1==23) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnn.g:557:3: this_External_0= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getExternalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_0=ruleExternal();

                    state._fsp--;


                    			current = this_External_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:566:3: this_Custom_1= ruleCustom
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getCustomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Custom_1=ruleCustom();

                    state._fsp--;


                    			current = this_Custom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:578:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalAnn.g:578:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalAnn.g:579:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalAnn.g:585:1: ruleExternal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnn.g:591:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) )
            // InternalAnn.g:592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            {
            // InternalAnn.g:592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            // InternalAnn.g:593:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external'
            {
            // InternalAnn.g:593:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:594:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:594:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:595:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getExternalKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:619:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalAnn.g:619:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalAnn.g:620:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalAnn.g:626:1: ruleCustom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_input_2_0= ruleLetter ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'function' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) otherlv_8= 'derivative' otherlv_9= '=' ( (lv_der_10_0= ruleExpression ) ) otherlv_11= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_input_2_0 = null;

        EObject lv_exp_7_0 = null;

        EObject lv_der_10_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:632:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_input_2_0= ruleLetter ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'function' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) otherlv_8= 'derivative' otherlv_9= '=' ( (lv_der_10_0= ruleExpression ) ) otherlv_11= '}' ) )
            // InternalAnn.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_input_2_0= ruleLetter ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'function' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) otherlv_8= 'derivative' otherlv_9= '=' ( (lv_der_10_0= ruleExpression ) ) otherlv_11= '}' )
            {
            // InternalAnn.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_input_2_0= ruleLetter ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'function' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) otherlv_8= 'derivative' otherlv_9= '=' ( (lv_der_10_0= ruleExpression ) ) otherlv_11= '}' )
            // InternalAnn.g:634:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_input_2_0= ruleLetter ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'function' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) otherlv_8= 'derivative' otherlv_9= '=' ( (lv_der_10_0= ruleExpression ) ) otherlv_11= '}'
            {
            // InternalAnn.g:634:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:635:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:635:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:636:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:656:3: ( (lv_input_2_0= ruleLetter ) )
            // InternalAnn.g:657:4: (lv_input_2_0= ruleLetter )
            {
            // InternalAnn.g:657:4: (lv_input_2_0= ruleLetter )
            // InternalAnn.g:658:5: lv_input_2_0= ruleLetter
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getInputLetterParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_input_2_0=ruleLetter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_2_0,
            						"dk.sdu.mdsd.ann.Ann.Letter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomAccess().getFunctionKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getEqualsSignKeyword_6());
            		
            // InternalAnn.g:691:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalAnn.g:692:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalAnn.g:692:4: (lv_exp_7_0= ruleExpression )
            // InternalAnn.g:693:5: lv_exp_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_exp_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_7_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getCustomAccess().getDerivativeKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomAccess().getEqualsSignKeyword_9());
            		
            // InternalAnn.g:718:3: ( (lv_der_10_0= ruleExpression ) )
            // InternalAnn.g:719:4: (lv_der_10_0= ruleExpression )
            {
            // InternalAnn.g:719:4: (lv_der_10_0= ruleExpression )
            // InternalAnn.g:720:5: lv_der_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_der_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_10_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleExpression"
    // InternalAnn.g:745:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAnn.g:745:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAnn.g:746:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAnn.g:752:1: ruleExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:758:2: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalAnn.g:759:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalAnn.g:759:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalAnn.g:760:3: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:768:3: ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=36 && LA6_0<=37)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnn.g:769:4: () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalAnn.g:769:4: ()
            	    // InternalAnn.g:770:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getPartLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAnn.g:776:4: ( (lv_operator_2_0= rulePartOperator ) )
            	    // InternalAnn.g:777:5: (lv_operator_2_0= rulePartOperator )
            	    {
            	    // InternalAnn.g:777:5: (lv_operator_2_0= rulePartOperator )
            	    // InternalAnn.g:778:6: lv_operator_2_0= rulePartOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=rulePartOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ann.Ann.PartOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAnn.g:795:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalAnn.g:796:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalAnn.g:796:5: (lv_right_3_0= ruleFactor )
            	    // InternalAnn.g:797:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalAnn.g:819:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalAnn.g:819:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalAnn.g:820:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalAnn.g:826:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:832:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAnn.g:833:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAnn.g:833:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAnn.g:834:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:842:3: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=38 && LA7_0<=39)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:843:4: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAnn.g:843:4: ()
            	    // InternalAnn.g:844:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getFacLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAnn.g:850:4: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // InternalAnn.g:851:5: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // InternalAnn.g:851:5: (lv_operator_2_0= ruleFactorOperator )
            	    // InternalAnn.g:852:6: lv_operator_2_0= ruleFactorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleFactorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ann.Ann.FactorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAnn.g:869:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAnn.g:870:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAnn.g:870:5: (lv_right_3_0= rulePrimary )
            	    // InternalAnn.g:871:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:893:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAnn.g:893:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAnn.g:894:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAnn.g:900:1: rulePrimary returns [EObject current=null] : (this_Operand_0= ruleOperand | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_Math_4= ruleMath ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Operand_0 = null;

        EObject this_Expression_2 = null;

        EObject this_Math_4 = null;



        	enterRule();

        try {
            // InternalAnn.g:906:2: ( (this_Operand_0= ruleOperand | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_Math_4= ruleMath ) )
            // InternalAnn.g:907:2: (this_Operand_0= ruleOperand | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_Math_4= ruleMath )
            {
            // InternalAnn.g:907:2: (this_Operand_0= ruleOperand | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_Math_4= ruleMath )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 36:
            case 37:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAnn.g:908:3: this_Operand_0= ruleOperand
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getOperandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operand_0=ruleOperand();

                    state._fsp--;


                    			current = this_Operand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:917:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalAnn.g:917:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalAnn.g:918:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:936:3: this_Math_4= ruleMath
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getMathParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Math_4=ruleMath();

                    state._fsp--;


                    			current = this_Math_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMath"
    // InternalAnn.g:948:1: entryRuleMath returns [EObject current=null] : iv_ruleMath= ruleMath EOF ;
    public final EObject entryRuleMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath = null;


        try {
            // InternalAnn.g:948:45: (iv_ruleMath= ruleMath EOF )
            // InternalAnn.g:949:2: iv_ruleMath= ruleMath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath=ruleMath();

            state._fsp--;

             current =iv_ruleMath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalAnn.g:955:1: ruleMath returns [EObject current=null] : (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower ) ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        EObject this_Euler_0 = null;

        EObject this_NLog_1 = null;

        EObject this_Sin_2 = null;

        EObject this_Cos_3 = null;

        EObject this_Sqrt_4 = null;

        EObject this_Power_5 = null;



        	enterRule();

        try {
            // InternalAnn.g:961:2: ( (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower ) )
            // InternalAnn.g:962:2: (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower )
            {
            // InternalAnn.g:962:2: (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            case 34:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAnn.g:963:3: this_Euler_0= ruleEuler
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getEulerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Euler_0=ruleEuler();

                    state._fsp--;


                    			current = this_Euler_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:972:3: this_NLog_1= ruleNLog
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getNLogParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NLog_1=ruleNLog();

                    state._fsp--;


                    			current = this_NLog_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:981:3: this_Sin_2= ruleSin
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getSinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sin_2=ruleSin();

                    state._fsp--;


                    			current = this_Sin_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnn.g:990:3: this_Cos_3= ruleCos
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getCosParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cos_3=ruleCos();

                    state._fsp--;


                    			current = this_Cos_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnn.g:999:3: this_Sqrt_4= ruleSqrt
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getSqrtParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sqrt_4=ruleSqrt();

                    state._fsp--;


                    			current = this_Sqrt_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAnn.g:1008:3: this_Power_5= rulePower
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getPowerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Power_5=rulePower();

                    state._fsp--;


                    			current = this_Power_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleEuler"
    // InternalAnn.g:1020:1: entryRuleEuler returns [EObject current=null] : iv_ruleEuler= ruleEuler EOF ;
    public final EObject entryRuleEuler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEuler = null;


        try {
            // InternalAnn.g:1020:46: (iv_ruleEuler= ruleEuler EOF )
            // InternalAnn.g:1021:2: iv_ruleEuler= ruleEuler EOF
            {
             newCompositeNode(grammarAccess.getEulerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEuler=ruleEuler();

            state._fsp--;

             current =iv_ruleEuler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEuler"


    // $ANTLR start "ruleEuler"
    // InternalAnn.g:1027:1: ruleEuler returns [EObject current=null] : (otherlv_0= 'e' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEuler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1033:2: ( (otherlv_0= 'e' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalAnn.g:1034:2: (otherlv_0= 'e' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalAnn.g:1034:2: (otherlv_0= 'e' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalAnn.g:1035:3: otherlv_0= 'e' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEulerAccess().getEKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEulerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1043:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalAnn.g:1044:4: (lv_value_2_0= ruleExpression )
            {
            // InternalAnn.g:1044:4: (lv_value_2_0= ruleExpression )
            // InternalAnn.g:1045:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEulerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEulerAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEuler"


    // $ANTLR start "entryRuleNLog"
    // InternalAnn.g:1070:1: entryRuleNLog returns [EObject current=null] : iv_ruleNLog= ruleNLog EOF ;
    public final EObject entryRuleNLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLog = null;


        try {
            // InternalAnn.g:1070:45: (iv_ruleNLog= ruleNLog EOF )
            // InternalAnn.g:1071:2: iv_ruleNLog= ruleNLog EOF
            {
             newCompositeNode(grammarAccess.getNLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNLog=ruleNLog();

            state._fsp--;

             current =iv_ruleNLog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNLog"


    // $ANTLR start "ruleNLog"
    // InternalAnn.g:1077:1: ruleNLog returns [EObject current=null] : (otherlv_0= 'nlog' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1083:2: ( (otherlv_0= 'nlog' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalAnn.g:1084:2: (otherlv_0= 'nlog' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalAnn.g:1084:2: (otherlv_0= 'nlog' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalAnn.g:1085:3: otherlv_0= 'nlog' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNLogAccess().getNlogKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getNLogAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1093:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalAnn.g:1094:4: (lv_value_2_0= ruleExpression )
            {
            // InternalAnn.g:1094:4: (lv_value_2_0= ruleExpression )
            // InternalAnn.g:1095:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNLogRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNLogAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNLog"


    // $ANTLR start "entryRuleSin"
    // InternalAnn.g:1120:1: entryRuleSin returns [EObject current=null] : iv_ruleSin= ruleSin EOF ;
    public final EObject entryRuleSin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSin = null;


        try {
            // InternalAnn.g:1120:44: (iv_ruleSin= ruleSin EOF )
            // InternalAnn.g:1121:2: iv_ruleSin= ruleSin EOF
            {
             newCompositeNode(grammarAccess.getSinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSin=ruleSin();

            state._fsp--;

             current =iv_ruleSin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalAnn.g:1127:1: ruleSin returns [EObject current=null] : (otherlv_0= 'sin' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1133:2: ( (otherlv_0= 'sin' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalAnn.g:1134:2: (otherlv_0= 'sin' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalAnn.g:1134:2: (otherlv_0= 'sin' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalAnn.g:1135:3: otherlv_0= 'sin' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSinAccess().getSinKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSinAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1143:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalAnn.g:1144:4: (lv_value_2_0= ruleExpression )
            {
            // InternalAnn.g:1144:4: (lv_value_2_0= ruleExpression )
            // InternalAnn.g:1145:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSinAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalAnn.g:1170:1: entryRuleCos returns [EObject current=null] : iv_ruleCos= ruleCos EOF ;
    public final EObject entryRuleCos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCos = null;


        try {
            // InternalAnn.g:1170:44: (iv_ruleCos= ruleCos EOF )
            // InternalAnn.g:1171:2: iv_ruleCos= ruleCos EOF
            {
             newCompositeNode(grammarAccess.getCosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCos=ruleCos();

            state._fsp--;

             current =iv_ruleCos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalAnn.g:1177:1: ruleCos returns [EObject current=null] : (otherlv_0= 'cos' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1183:2: ( (otherlv_0= 'cos' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalAnn.g:1184:2: (otherlv_0= 'cos' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalAnn.g:1184:2: (otherlv_0= 'cos' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalAnn.g:1185:3: otherlv_0= 'cos' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCosAccess().getCosKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCosAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1193:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalAnn.g:1194:4: (lv_value_2_0= ruleExpression )
            {
            // InternalAnn.g:1194:4: (lv_value_2_0= ruleExpression )
            // InternalAnn.g:1195:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCosRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCosAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalAnn.g:1220:1: entryRuleSqrt returns [EObject current=null] : iv_ruleSqrt= ruleSqrt EOF ;
    public final EObject entryRuleSqrt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrt = null;


        try {
            // InternalAnn.g:1220:45: (iv_ruleSqrt= ruleSqrt EOF )
            // InternalAnn.g:1221:2: iv_ruleSqrt= ruleSqrt EOF
            {
             newCompositeNode(grammarAccess.getSqrtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrt=ruleSqrt();

            state._fsp--;

             current =iv_ruleSqrt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalAnn.g:1227:1: ruleSqrt returns [EObject current=null] : (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSqrt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1233:2: ( (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalAnn.g:1234:2: (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalAnn.g:1234:2: (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalAnn.g:1235:3: otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSqrtAccess().getSqrtKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSqrtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1243:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalAnn.g:1244:4: (lv_value_2_0= ruleExpression )
            {
            // InternalAnn.g:1244:4: (lv_value_2_0= ruleExpression )
            // InternalAnn.g:1245:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSqrtAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRulePower"
    // InternalAnn.g:1270:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalAnn.g:1270:46: (iv_rulePower= rulePower EOF )
            // InternalAnn.g:1271:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalAnn.g:1277:1: rulePower returns [EObject current=null] : (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_base_2_0 = null;

        EObject lv_exponent_4_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1283:2: ( (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalAnn.g:1284:2: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalAnn.g:1284:2: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalAnn.g:1285:3: otherlv_0= 'pow' otherlv_1= '(' ( (lv_base_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerAccess().getPowKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPowerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnn.g:1293:3: ( (lv_base_2_0= ruleExpression ) )
            // InternalAnn.g:1294:4: (lv_base_2_0= ruleExpression )
            {
            // InternalAnn.g:1294:4: (lv_base_2_0= ruleExpression )
            // InternalAnn.g:1295:5: lv_base_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_base_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"base",
            						lv_base_2_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerAccess().getCommaKeyword_3());
            		
            // InternalAnn.g:1316:3: ( (lv_exponent_4_0= ruleExpression ) )
            // InternalAnn.g:1317:4: (lv_exponent_4_0= ruleExpression )
            {
            // InternalAnn.g:1317:4: (lv_exponent_4_0= ruleExpression )
            // InternalAnn.g:1318:5: lv_exponent_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_exponent_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"exponent",
            						lv_exponent_4_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePartOperator"
    // InternalAnn.g:1343:1: entryRulePartOperator returns [String current=null] : iv_rulePartOperator= rulePartOperator EOF ;
    public final String entryRulePartOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePartOperator = null;


        try {
            // InternalAnn.g:1343:52: (iv_rulePartOperator= rulePartOperator EOF )
            // InternalAnn.g:1344:2: iv_rulePartOperator= rulePartOperator EOF
            {
             newCompositeNode(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartOperator=rulePartOperator();

            state._fsp--;

             current =iv_rulePartOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalAnn.g:1350:1: rulePartOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePartOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnn.g:1356:2: ( (kw= '+' | kw= '-' ) )
            // InternalAnn.g:1357:2: (kw= '+' | kw= '-' )
            {
            // InternalAnn.g:1357:2: (kw= '+' | kw= '-' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnn.g:1358:3: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1364:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalAnn.g:1373:1: entryRuleFactorOperator returns [String current=null] : iv_ruleFactorOperator= ruleFactorOperator EOF ;
    public final String entryRuleFactorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactorOperator = null;


        try {
            // InternalAnn.g:1373:54: (iv_ruleFactorOperator= ruleFactorOperator EOF )
            // InternalAnn.g:1374:2: iv_ruleFactorOperator= ruleFactorOperator EOF
            {
             newCompositeNode(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorOperator=ruleFactorOperator();

            state._fsp--;

             current =iv_ruleFactorOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalAnn.g:1380:1: ruleFactorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFactorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnn.g:1386:2: ( (kw= '*' | kw= '/' ) )
            // InternalAnn.g:1387:2: (kw= '*' | kw= '/' )
            {
            // InternalAnn.g:1387:2: (kw= '*' | kw= '/' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAnn.g:1388:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1394:3: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:1403:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalAnn.g:1403:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalAnn.g:1404:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAnn.g:1410:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1416:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) )
            // InternalAnn.g:1417:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            {
            // InternalAnn.g:1417:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            // InternalAnn.g:1418:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) )
            {
            // InternalAnn.g:1418:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=36 && LA12_0<=37)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnn.g:1419:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalAnn.g:1419:4: (lv_operator_0_0= rulePartOperator )
                    // InternalAnn.g:1420:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.sdu.mdsd.ann.Ann.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnn.g:1437:3: ( (lv_value_1_0= ruleNumberTypes ) )
            // InternalAnn.g:1438:4: (lv_value_1_0= ruleNumberTypes )
            {
            // InternalAnn.g:1438:4: (lv_value_1_0= ruleNumberTypes )
            // InternalAnn.g:1439:5: lv_value_1_0= ruleNumberTypes
            {

            					newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumberTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.NumberTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleOperand"
    // InternalAnn.g:1460:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalAnn.g:1460:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalAnn.g:1461:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalAnn.g:1467:1: ruleOperand returns [EObject current=null] : (this_Letter_0= ruleLetter | this_NumberLiteral_1= ruleNumberLiteral ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Letter_0 = null;

        EObject this_NumberLiteral_1 = null;



        	enterRule();

        try {
            // InternalAnn.g:1473:2: ( (this_Letter_0= ruleLetter | this_NumberLiteral_1= ruleNumberLiteral ) )
            // InternalAnn.g:1474:2: (this_Letter_0= ruleLetter | this_NumberLiteral_1= ruleNumberLiteral )
            {
            // InternalAnn.g:1474:2: (this_Letter_0= ruleLetter | this_NumberLiteral_1= ruleNumberLiteral )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_INT) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==RULE_ID) ) {
                    alt13=1;
                }
                else if ( (LA13_2==RULE_INT) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAnn.g:1475:3: this_Letter_0= ruleLetter
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getLetterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Letter_0=ruleLetter();

                    state._fsp--;


                    			current = this_Letter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1484:3: this_NumberLiteral_1= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getNumberLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_1=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleNumberTypes"
    // InternalAnn.g:1496:1: entryRuleNumberTypes returns [String current=null] : iv_ruleNumberTypes= ruleNumberTypes EOF ;
    public final String entryRuleNumberTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberTypes = null;


        try {
            // InternalAnn.g:1496:51: (iv_ruleNumberTypes= ruleNumberTypes EOF )
            // InternalAnn.g:1497:2: iv_ruleNumberTypes= ruleNumberTypes EOF
            {
             newCompositeNode(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberTypes=ruleNumberTypes();

            state._fsp--;

             current =iv_ruleNumberTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalAnn.g:1503:1: ruleNumberTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumberTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DECIMAL_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1509:2: ( (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) )
            // InternalAnn.g:1510:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            {
            // InternalAnn.g:1510:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==14||LA14_1==25||LA14_1==28||(LA14_1>=35 && LA14_1<=39)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==15) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnn.g:1511:3: this_DECIMAL_0= ruleDECIMAL
                    {

                    			newCompositeNode(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECIMAL_0=ruleDECIMAL();

                    state._fsp--;


                    			current.merge(this_DECIMAL_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1522:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberTypes"


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:1533:1: entryRuleLetter returns [EObject current=null] : iv_ruleLetter= ruleLetter EOF ;
    public final EObject entryRuleLetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetter = null;


        try {
            // InternalAnn.g:1533:47: (iv_ruleLetter= ruleLetter EOF )
            // InternalAnn.g:1534:2: iv_ruleLetter= ruleLetter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetter=ruleLetter();

            state._fsp--;

             current =iv_ruleLetter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalAnn.g:1540:1: ruleLetter returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLetter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1546:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalAnn.g:1547:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalAnn.g:1547:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) )
            // InternalAnn.g:1548:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalAnn.g:1548:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=36 && LA15_0<=37)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnn.g:1549:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalAnn.g:1549:4: (lv_operator_0_0= rulePartOperator )
                    // InternalAnn.g:1550:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLetterRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.sdu.mdsd.ann.Ann.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnn.g:1567:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalAnn.g:1568:4: (lv_value_1_0= RULE_ID )
            {
            // InternalAnn.g:1568:4: (lv_value_1_0= RULE_ID )
            // InternalAnn.g:1569:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000194010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000194000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000037E1000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});

}