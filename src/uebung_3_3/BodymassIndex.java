package uebung_3_3;

public class BodymassIndex {

	public static void main(String[] args) {
	double gewicht = 100;
	double groesse = 1.90;
	double alter = 45;
	boolean maennlich = true;
	
	double bmi = gewicht/(groesse*groesse);
	
	if (bmi < 20 && maennlich == true && alter < 25)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 25 && maennlich == true && alter < 25)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 19 && maennlich == false && alter < 25)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 24 && maennlich == false && alter < 25)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 21 && maennlich == true && alter < 35)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 26 && maennlich == true && alter < 35)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 20 && maennlich == false && alter < 35)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 25 && maennlich == false && alter < 35)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 22 && maennlich == true && alter < 45)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 27 && maennlich == true && alter < 45)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 21 && maennlich == false && alter < 45)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 26 && maennlich == false && alter < 45)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 23 && maennlich == true && alter < 55)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 28 && maennlich == true && alter < 55)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 22 && maennlich == false && alter < 55)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 27 && maennlich == false && alter < 55)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 24 && maennlich == true && alter < 65)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 29 && maennlich == true && alter < 65)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 23 && maennlich == false && alter < 65)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 28 && maennlich == false && alter < 65)
	{System.out.println("Du bist zu dick!");}
	
	else {if (bmi < 25 && maennlich == true && alter > 64)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 30 && maennlich == true && alter > 64)
	{System.out.println("Du bist zu dick!");}
	else {if (bmi < 24 && maennlich == false && alter > 64)
	{System.out.println("Du bist zu dünn!");}
	else {if (bmi > 29 && maennlich == false && alter > 64)
	{System.out.println("Du bist zu dick!");}
	else {System.out.println("Dein BMI ist im normalen Bereich");}}}}}}}}}}}}}}}}}}}}}}}}
	
	System.out.println("Dein BMI beträgt " + bmi + ".");

	}

}
