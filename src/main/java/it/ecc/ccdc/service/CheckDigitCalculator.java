package it.ecc.ccdc.service;


public interface CheckDigitCalculator {
	
	int CalculateCheckDigit(String containerNr);

	boolean isCorrect(int checkDigitCalculated, String containerNr);

	int calculateCheckDigitAIR(String containerNr);


	
}
