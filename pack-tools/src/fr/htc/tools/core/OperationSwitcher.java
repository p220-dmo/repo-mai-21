package fr.htc.tools.core;

import fr.htc.tools.types.EquationSecondDegree;
import fr.htc.tools.types.Factoriel;
import fr.htc.tools.types.MoyenneEcartType;
import fr.htc.tools.types.Operation;
import fr.htc.tools.types.PGCD;
import fr.htc.tools.types.PersonList;
import fr.htc.tools.types.Quitter;
import fr.htc.tools.types.ValeurMax;
import fr.htc.tools.types.enums.OperationType;

public class OperationSwitcher {

	public static void switchTo(int choice) {
		 OperationType opType = OperationType.valueOf(choice);
		Operation op = null;
		switch (opType) {
		case EQUATION_SECOND_DEGRE:
			op = new EquationSecondDegree();
			break;
		case FACTORIEL:
			op = new Factoriel();
			break;
		case PGCD:
			op = new PGCD();
			break;
		case MAX_TABLEAU:
			op = new ValeurMax();
			break;
		case MOYENNE_ECART_TYPE:
			op = new MoyenneEcartType();
			break;
		case PERSON_LIST:
			op = new PersonList();
			break;
		case QUITTER:
			op = new Quitter();
			break;
		default:
			System.out.println("Valeur incorrect");
			return;
		}

		op.process(opType.getTitle());
	}

}
