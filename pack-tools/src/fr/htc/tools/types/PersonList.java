package fr.htc.tools.types;

import java.util.ArrayList;
import java.util.List;

import fr.htc.tools.data.Person;

public class PersonList implements Operation {

	@Override
	public void process(String title) {
		System.out.println("Je suis dans le choix : " + title);
		System.out.print("Entrer le nombre de personnes : ");
		int nbPerson = scanner.nextInt();

		List<Person> personList = new ArrayList<Person>();
		for (int i = 0; i < nbPerson; i++) {
			System.out.println("\nSaisie de la person N° " + i + 1);
			Person p = catchPersonFromInputUser();
			personList.add(p);

		}

		printAllPersons(personList);

	}

	private void printAllPersons(List<Person> personList) {
		for (Person person : personList) {
			person.print();
		}

	}

	/**
	 * 
	 * @return
	 */
	private Person catchPersonFromInputUser() {
		Person input = new Person();

		System.out.print("Nom : ");
		input.setNom(scanner.next());

		System.out.print("Prenom : ");
		input.setPrenom(scanner.next());

		System.out.print("Age : ");
		input.setAge(scanner.nextInt());

		return input;
	}

}
