
public class TestEtudiant {

	public static void main(String[] args) {
		

	// 1. Création et initialisation du tableau de records

		 Etudiant[] tab = {
		    new Etudiant(1, "Ali", 14.5),
		    new Etudiant(2, "Sami", 8.0),
		    new Etudiant(3, "Amira", 16.0),
		    new Etudiant(4, "Mariem", 9.5),
		    new Etudiant(5, "Youssef", 12.0)
		        };

		    double somme = 0;
		    int nbAdmis = 0;

		        // 2. Afficher tous les étudiants
		     System.out.println("=== Liste des étudiants ===");

		        for (Etudiant e : tab) {
		            System.out.println(e);
		            somme += e.moyenne();

		            if (e.estAdmis()) {
		                nbAdmis++;
		            }
		        }

		        // 3. Afficher les étudiants admis
		        System.out.println("\n=== Étudiants admis ===");

		        for (Etudiant e : tab) {
		            if (e.estAdmis()) {
		                System.out.println(e.nom());
		            }
		        }

		        // 4. Calculer la moyenne générale de la classe
		        double moyenneClasse = somme / tab.length;

		        System.out.println("\nMoyenne de la classe : " + moyenneClasse);

		        // 5. Rechercher un étudiant par son identifiant
		        int idRecherche = 3;
		        boolean trouve = false;

		        for (Etudiant e : tab) {
		            if (e.id() == idRecherche) {
		                System.out.println("\nÉtudiant recherché : " + e);
		                trouve = true;
		                break;
		            }
		        }

		        if (!trouve) {
		            System.out.println("\nÉtudiant introuvable.");
		        }

		        // 6. Afficher le nombre d'étudiants admis
		        System.out.println("\nNombre d'étudiants admis : " + nbAdmis);
		    }
		}

	
	


