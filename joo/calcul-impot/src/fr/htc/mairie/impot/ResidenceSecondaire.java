package fr.htc.mairie.impot;

public class ResidenceSecondaire extends HabitationIndividuelle {

	public ResidenceSecondaire(String owner, String address, double area, int roomCount, boolean haveSwimingPool) {
		super(owner, address, area, roomCount, haveSwimingPool);
	}

	private static final double TAXE_HABITATION_SEC = 10000;

	@Override
	public double impot() {
		return super.impot() + TAXE_HABITATION_SEC;
	}

}
