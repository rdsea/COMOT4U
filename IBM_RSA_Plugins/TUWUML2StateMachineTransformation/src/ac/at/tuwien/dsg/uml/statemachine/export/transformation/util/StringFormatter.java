package ac.at.tuwien.dsg.uml.statemachine.export.transformation.util;

public class StringFormatter {
	
	/**
	 * As it seems we use this conversion a lot in TransitionCorrectnessTest, I moved it to a separate method
	 * @param text
	 * @return
	 */
	public static String convertMathSymbolsToText(String text){
		String textNew = text;
		textNew = textNew.replace("!=", "_NotEq_");
		textNew = textNew.replace("==", "_Eq_");
		textNew = textNew.replace(">", "_GreaterThan_");
		textNew = textNew.replace("<", "_LessThan_");
		textNew = textNew.replace(">=", "_GreaterOrEqThan_");
		textNew = textNew.replace("<=", "_LessOrEqThan_");
		return textNew;
	}
	
	
	public static String convertNonAlphanumericalSymbolsToUnderscore(String text){
		return text.replaceAll("\\W", "_");
	}
	
	
}
