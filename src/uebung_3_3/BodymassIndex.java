package uebung_3_3;

public class BodymassIndex {

	public static void main(String[] args) {
	double gewicht = 100;
	double groesse = 1.90;
	double alter = 45;
	boolean maennlich = true;
	
	double bmi = gewicht/(groesse*groesse);
	
	if (bmi < 20 && maennlich && alter < 25)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 25 && maennlich && alter < 25)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 19 && !maennlich && alter < 25)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 24 && !maennlich && alter < 25)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 21 && maennlich && alter < 35)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 26 && maennlich && alter < 35)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 20 && !maennlich && alter < 35)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 25 && !maennlich && alter < 35)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 22 && maennlich && alter < 45)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 27 && maennlich && alter < 45)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 21 && !maennlich && alter < 45)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 26 && !maennlich && alter < 45)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 23 && maennlich && alter < 55)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 28 && maennlich && alter < 55)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 22 && !maennlich && alter < 55)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 27 && !maennlich && alter < 55)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 24 && maennlich && alter < 65)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 29 && maennlich && alter < 65)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 23 && !maennlich && alter < 65)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 28 && !maennlich && alter < 65)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 25 && maennlich && alter > 64)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 30 && maennlich && alter > 64)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 24 && !maennlich && alter > 64)
	{System.out.println("Du bist zu d�nn!");}
	else {if (bmi > 29 && !maennlich && alter > 64)
	{System.out.println("Du bist zu dick!");}
	else {System.out.println("Dein BMI ist im normalen Bereich");}}}}}}}}}}}}}}}}}}}}}}}}
	
	System.out.println("Dein BMI betr�gt " + bmi + ".");

	}

}
