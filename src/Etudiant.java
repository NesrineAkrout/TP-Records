
public record Etudiant(int id, String nom, double moyenne) {

    public boolean estAdmis() {
        return moyenne >= 10;
    }
}