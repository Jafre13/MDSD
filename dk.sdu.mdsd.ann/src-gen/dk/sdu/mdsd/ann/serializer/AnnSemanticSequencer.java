/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.serializer;

import com.google.inject.Inject;
import dk.sdu.mdsd.ann.ann.ANNModel;
import dk.sdu.mdsd.ann.ann.AnnPackage;
import dk.sdu.mdsd.ann.ann.Cos;
import dk.sdu.mdsd.ann.ann.Custom;
import dk.sdu.mdsd.ann.ann.Euler;
import dk.sdu.mdsd.ann.ann.External;
import dk.sdu.mdsd.ann.ann.Fac;
import dk.sdu.mdsd.ann.ann.Hidden;
import dk.sdu.mdsd.ann.ann.Input;
import dk.sdu.mdsd.ann.ann.LearningRule;
import dk.sdu.mdsd.ann.ann.Letter;
import dk.sdu.mdsd.ann.ann.NLog;
import dk.sdu.mdsd.ann.ann.NumberLiteral;
import dk.sdu.mdsd.ann.ann.Output;
import dk.sdu.mdsd.ann.ann.Part;
import dk.sdu.mdsd.ann.ann.Power;
import dk.sdu.mdsd.ann.ann.Sin;
import dk.sdu.mdsd.ann.ann.Sqrt;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AnnSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnnGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AnnPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AnnPackage.ANN_MODEL:
				sequence_ANNModel(context, (ANNModel) semanticObject); 
				return; 
			case AnnPackage.COS:
				sequence_Cos(context, (Cos) semanticObject); 
				return; 
			case AnnPackage.CUSTOM:
				sequence_Custom(context, (Custom) semanticObject); 
				return; 
			case AnnPackage.EULER:
				sequence_Euler(context, (Euler) semanticObject); 
				return; 
			case AnnPackage.EXTERNAL:
				sequence_External(context, (External) semanticObject); 
				return; 
			case AnnPackage.FAC:
				sequence_Factor(context, (Fac) semanticObject); 
				return; 
			case AnnPackage.HIDDEN:
				sequence_Hidden(context, (Hidden) semanticObject); 
				return; 
			case AnnPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case AnnPackage.LEARNING_RULE:
				sequence_LearningRule(context, (LearningRule) semanticObject); 
				return; 
			case AnnPackage.LETTER:
				sequence_Letter(context, (Letter) semanticObject); 
				return; 
			case AnnPackage.NLOG:
				sequence_NLog(context, (NLog) semanticObject); 
				return; 
			case AnnPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case AnnPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case AnnPackage.PART:
				sequence_Expression(context, (Part) semanticObject); 
				return; 
			case AnnPackage.POWER:
				sequence_Power(context, (Power) semanticObject); 
				return; 
			case AnnPackage.SIN:
				sequence_Sin(context, (Sin) semanticObject); 
				return; 
			case AnnPackage.SQRT:
				sequence_Sqrt(context, (Sqrt) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ANNModel returns ANNModel
	 *
	 * Constraint:
	 *     (name=ID alpha=DECIMAL epochs=INT Activation+=Activation* Layer+=Layer*)
	 */
	protected void sequence_ANNModel(ISerializationContext context, ANNModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Cos
	 *     Expression.Part_1_0 returns Cos
	 *     Factor returns Cos
	 *     Factor.Fac_1_0 returns Cos
	 *     Primary returns Cos
	 *     Math returns Cos
	 *     Cos returns Cos
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Cos(ISerializationContext context, Cos semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.COS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.COS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Activation returns Custom
	 *     Custom returns Custom
	 *
	 * Constraint:
	 *     (name=ID input=Letter exp=Expression der=Expression)
	 */
	protected void sequence_Custom(ISerializationContext context, Custom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.ACTIVATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.ACTIVATION__NAME));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.CUSTOM__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.CUSTOM__INPUT));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.CUSTOM__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.CUSTOM__EXP));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.CUSTOM__DER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.CUSTOM__DER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomAccess().getInputLetterParserRuleCall_2_0(), semanticObject.getInput());
		feeder.accept(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_7_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_10_0(), semanticObject.getDer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Euler
	 *     Expression.Part_1_0 returns Euler
	 *     Factor returns Euler
	 *     Factor.Fac_1_0 returns Euler
	 *     Primary returns Euler
	 *     Math returns Euler
	 *     Euler returns Euler
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Euler(ISerializationContext context, Euler semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.EULER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.EULER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Part
	 *     Expression.Part_1_0 returns Part
	 *     Factor returns Part
	 *     Factor.Fac_1_0 returns Part
	 *     Primary returns Part
	 *
	 * Constraint:
	 *     (left=Expression_Part_1_0 operator=PartOperator right=Factor)
	 */
	protected void sequence_Expression(ISerializationContext context, Part semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.PART__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.PART__LEFT));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.PART__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.PART__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.PART__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.PART__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getPartLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Activation returns External
	 *     External returns External
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_External(ISerializationContext context, External semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.ACTIVATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.ACTIVATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Fac
	 *     Expression.Part_1_0 returns Fac
	 *     Factor returns Fac
	 *     Factor.Fac_1_0 returns Fac
	 *     Primary returns Fac
	 *
	 * Constraint:
	 *     (left=Factor_Fac_1_0 operator=FactorOperator right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Fac semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.FAC__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.FAC__LEFT));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.FAC__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.FAC__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.FAC__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.FAC__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getFacLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Layer returns Hidden
	 *     Hidden returns Hidden
	 *
	 * Constraint:
	 *     (size=INT l_rule=LearningRule)
	 */
	protected void sequence_Hidden(ISerializationContext context, Hidden semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.LAYER__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.LAYER__SIZE));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.HIDDEN__LRULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.HIDDEN__LRULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0(), semanticObject.getL_rule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Layer returns Input
	 *     Input returns Input
	 *
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.LAYER__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.LAYER__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LearningRule returns LearningRule
	 *
	 * Constraint:
	 *     (Sigmoid?='sigmoid' | Tansig?='tansig' | namedFunction=[Activation|ID])
	 */
	protected void sequence_LearningRule(ISerializationContext context, LearningRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Letter
	 *     Expression.Part_1_0 returns Letter
	 *     Factor returns Letter
	 *     Factor.Fac_1_0 returns Letter
	 *     Primary returns Letter
	 *     Operand returns Letter
	 *     Letter returns Letter
	 *
	 * Constraint:
	 *     (operator=PartOperator? value=ID)
	 */
	protected void sequence_Letter(ISerializationContext context, Letter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NLog
	 *     Expression.Part_1_0 returns NLog
	 *     Factor returns NLog
	 *     Factor.Fac_1_0 returns NLog
	 *     Primary returns NLog
	 *     Math returns NLog
	 *     NLog returns NLog
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_NLog(ISerializationContext context, NLog semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.NLOG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.NLOG__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NumberLiteral
	 *     Expression.Part_1_0 returns NumberLiteral
	 *     Factor returns NumberLiteral
	 *     Factor.Fac_1_0 returns NumberLiteral
	 *     Primary returns NumberLiteral
	 *     NumberLiteral returns NumberLiteral
	 *     Operand returns NumberLiteral
	 *
	 * Constraint:
	 *     (operator=PartOperator? value=NumberTypes)
	 */
	protected void sequence_NumberLiteral(ISerializationContext context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layer returns Output
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (size=INT l_rule=LearningRule)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.LAYER__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.LAYER__SIZE));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.OUTPUT__LRULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.OUTPUT__LRULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0(), semanticObject.getL_rule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Power
	 *     Expression.Part_1_0 returns Power
	 *     Factor returns Power
	 *     Factor.Fac_1_0 returns Power
	 *     Primary returns Power
	 *     Math returns Power
	 *     Power returns Power
	 *
	 * Constraint:
	 *     (base=Expression exponent=Expression)
	 */
	protected void sequence_Power(ISerializationContext context, Power semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.POWER__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.POWER__BASE));
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.POWER__EXPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.POWER__EXPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_2_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_4_0(), semanticObject.getExponent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Sin
	 *     Expression.Part_1_0 returns Sin
	 *     Factor returns Sin
	 *     Factor.Fac_1_0 returns Sin
	 *     Primary returns Sin
	 *     Math returns Sin
	 *     Sin returns Sin
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Sin(ISerializationContext context, Sin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.SIN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.SIN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Sqrt
	 *     Expression.Part_1_0 returns Sqrt
	 *     Factor returns Sqrt
	 *     Factor.Fac_1_0 returns Sqrt
	 *     Primary returns Sqrt
	 *     Math returns Sqrt
	 *     Sqrt returns Sqrt
	 *
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Sqrt(ISerializationContext context, Sqrt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnPackage.Literals.SQRT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnPackage.Literals.SQRT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
