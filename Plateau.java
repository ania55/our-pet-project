import java.util.*;

public class Plateau {
    int hauteur;
    int largeur;
    // si cases false la case est vide; remplie sinon
    boolean[][] cases;
    // dans etats 0 = vide, 1 = couleur; 2 = animal
    int[][] etats;
    // int [][] couleurs indique les etats
    int[][] couleurs;
    // valeurs pour les shapes (carre - 1, L - 2, T - 3, I horizontal/vertical - 4)
    int[][] valeurs;

    public Plateau(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.cases = new boolean[hauteur][largeur];
        this.etats = new int[hauteur][largeur];
        this.couleurs = new int[hauteur][largeur];
        this.valeurs = new int[hauteur][largeur];
    }

    public boolean placeSquare() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        Carre carre = new Carre(this, x0, y0);

        if (carre.notOutOfBoundsLeft(x0, y0) && carre.notOutOfBoundsRight(this, x0, y0)
                && carre.notOutOfBoundsUp(x0, y0) && carre.notOutOfBoundsDown(this, x0, y0)) {
            if
            (this.cases[x0][y0] == false &&
                    this.cases[x0][y0 + 1] == false &&
                    this.cases[x0 + 1][y0] == false &&
                    this.cases[x0 + 1][y0 + 1] == false) {
                this.valeurs[x0][y0] = 1;
                this.valeurs[x0][y0 + 1] = 1;
                this.valeurs[x0 + 1][y0] = 1;
                this.valeurs[x0 + 1][y0 + 1] = 1;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0][y0 + 1] = color;
                this.couleurs[x0 + 1][y0] = color;
                this.couleurs[x0 + 1][y0 + 1] = color;

                this.cases[x0][y0] = true;
                this.cases[x0][y0 + 1] = true;
                this.cases[x0 + 1][y0] = true;
                this.cases[x0 + 1][y0 + 1] = true;

                res = true;
            }
        }
        return res;
    }

    public boolean placeLetterL1() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        LetterL letterL = new LetterL(this, x0, y0);

        if (letterL.notOutOfBoundsLeft(x0, y0) && letterL.notOutOfBoundsRight(this, x0, y0)
                && letterL.notOutOfBoundsUp(x0, y0) && letterL.notOutOfBoundsDown(this, x0, y0)) {
            if (
                    this.cases[x0][y0] == false &&
                            this.cases[x0 + 1][y0] == false &&
                            this.cases[x0 + 1][y0 + 1] == false
            ) {
                this.valeurs[x0][y0] = 2;
                this.valeurs[x0 + 1][y0] = 2;
                this.valeurs[x0 + 1][y0 + 1] = 2;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0 + 1][y0] = color;
                this.couleurs[x0 + 1][y0 + 1] = color;

                this.cases[x0][y0] = true;
                this.cases[x0 + 1][y0] = true;
                this.cases[x0 + 1][y0 + 1] = true;

                res = true;
            }
        }
        return res;
    }

    public boolean placeLetterL2() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        LetterL letterL = new LetterL(this, x0, y0);

        if (letterL.notOutOfBoundsLeft(x0, y0) && letterL.notOutOfBoundsRight(this, x0, y0)
                && letterL.notOutOfBoundsUp(x0, y0) && letterL.notOutOfBoundsDown(this, x0, y0)) {
            if (
                    this.cases[x0][y0] == false &&
                            this.cases[x0 + 1][y0] == false &&
                            this.cases[x0][y0 + 1] == false
            ) {
                this.valeurs[x0][y0] = 2;
                this.valeurs[x0][y0 + 1] = 2;
                this.valeurs[x0 + 1][y0] = 2;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0][y0 + 1] = color;
                this.couleurs[x0 + 1][y0] = color;

                this.cases[x0][y0] = true;
                this.cases[x0 + 1][y0] = true;
                this.cases[x0][y0 + 1] = true;

                res = true;
            }
        }
        return res;
    }

    public boolean placeLetterIHorizontal() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        LetterIHorizontal letterIH = new LetterIHorizontal(this, x0, y0);

        if (letterIH.notOutOfBoundsLeft(x0, y0) && letterIH.notOutOfBoundsRight(this, x0, y0)
                && letterIH.notOutOfBoundsUp(x0, y0) && letterIH.notOutOfBoundsDown(this, x0, y0)) {
            if (
                    this.cases[x0][y0] == false &&
                            this.cases[x0][y0 + 1] == false &&
                            this.cases[x0][y0 + 2] == false &&
                            this.cases[x0][y0 + 3] == false
            ) {
                this.valeurs[x0][y0] = 4;
                this.valeurs[x0][y0 + 1] = 4;
                this.valeurs[x0][y0 + 2] = 4;
                this.valeurs[x0][y0 + 3] = 4;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0][y0 + 1] = color;
                this.couleurs[x0][y0 + 2] = color;
                this.couleurs[x0][y0 + 3] = color;

                this.cases[x0][y0] = true;
                this.cases[x0][y0 + 1] = true;
                this.cases[x0][y0 + 2] = true;
                this.cases[x0][y0 + 3] = true;

                res = true;
            }
        }
        return res;
    }

    public boolean placeLetterIVertical() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        LetterIVertical letterIV = new LetterIVertical(this, x0, y0);

        if (letterIV.notOutOfBoundsLeft(x0, y0) && letterIV.notOutOfBoundsRight(this, x0, y0)
                && letterIV.notOutOfBoundsUp(x0, y0) && letterIV.notOutOfBoundsDown(this, x0, y0)) {
            if (
                    this.cases[x0][y0] == false &&
                            this.cases[x0 + 1][y0] == false &&
                            this.cases[x0 + 2][y0] == false &&
                            this.cases[x0 + 3][y0] == false
            ) {
                this.valeurs[x0][y0] = 4;
                this.valeurs[x0 + 1][y0] = 4;
                this.valeurs[x0 + 2][y0] = 4;
                this.valeurs[x0 + 3][y0] = 4;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0 + 1][y0] = color;
                this.couleurs[x0 + 2][y0] = color;
                this.couleurs[x0 + 3][y0] = color;

                this.cases[x0][y0] = true;
                this.cases[x0 + 1][y0] = true;
                this.cases[x0 + 2][y0] = true;
                this.cases[x0 + 3][y0] = true;

                res = true;
            }
        }
        return res;
    }

    public boolean placeLetterTHorizontal() {
        boolean res = false;

        Random r = new Random();
        int x0 = r.nextInt(this.largeur - 1);
        int y0 = r.nextInt(this.hauteur - 1);
        int color = r.nextInt(3) + 1;

        LetterTHorizontal letterTHorizontal = new LetterTHorizontal(this, x0, y0);

        if (letterTHorizontal.notOutOfBoundsLeft(x0, y0) && letterTHorizontal.notOutOfBoundsRight(this, x0, y0)
                && letterTHorizontal.notOutOfBoundsUp(x0, y0) && letterTHorizontal.notOutOfBoundsDown(this, x0, y0)) {
            if (
                    this.cases[x0][y0] == false &&
                            this.cases[x0][y0 + 1] == false &&
                            this.cases[x0][y0 + 2] == false &&
                            this.cases[x0 + 1][y0 + 1] == false
            ) {
                this.valeurs[x0][y0] = 3;
                this.valeurs[x0][y0 + 1] = 3;
                this.valeurs[x0][y0 + 2] = 3;
                this.valeurs[x0 + 1][y0 + 1] = 3;

                this.couleurs[x0][y0] = color;
                this.couleurs[x0][y0 + 1] = color;
                this.couleurs[x0][y0 + 2] = color;
                this.couleurs[x0 + 1][y0 + 1] = color;

                this.cases[x0][y0] = true;
                this.cases[x0][y0 + 1] = true;
                this.cases[x0][y0 + 2] = true;
                this.cases[x0 + 1][y0 + 1] = true;

                res = true;
            }
        }
        return res;
    }

    public void placeShapes() {
        int all = 0;
        Random r = new Random();

        while (all < 12) {
            int choice = r.nextInt(6);

            if (choice == 0) {
                if (placeSquare()) {
                    all++;
                }
            } else if (choice == 1) {
                if (placeLetterL1()) {
                    all++;
                }
            } else if (choice == 2) {
                if (placeLetterL2()) {
                    all++;
                }
            } else if (choice == 3) {
                if (placeLetterIHorizontal()) {
                    all++;
                }
            } else if (choice == 4) {
                if (placeLetterIVertical()) {
                    all++;
                }
            } else if (choice == 5) {
                if (placeLetterTHorizontal()) {
                    all++;
                }
            }
        }

        while (existsEmptyCell()) {
            int color = r.nextInt(3) + 1;
            for (int i = 0; i < this.largeur; i++) {
                for (int j = 0; j < this.hauteur; j++) {
                    if (this.cases[i][j] == false) {
                        valeurs[i][j] = r.nextInt(4);
                        couleurs[i][j] = color;
                        cases[i][j] = true;
                    }
                }
            }
        }
    }

    public boolean existsEmptyCell() {
        boolean res = false;

        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                if (this.cases[i][j] == false) {
                    res = true;
                }
            }
        }
        return res;
    }

    public void fillRandom() {
        Random r = new Random();

        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                int z = r.nextInt(4);
                if (!cases[i][j]) {
                    etats[i][j] = z;
                    cases[i][j] = true;
                }
            }
        }
    }


    public void display() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (cases[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public void displayColors() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print(couleurs[i][j]);
            }
            System.out.println();
        }
    }

    public void afficherEtats() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print(etats[i][j]);
            }
            System.out.println();
        }
    }

    public void displayValues() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print(valeurs[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Plateau p = new Plateau(8, 8);
        System.out.println("START");
        p.placeShapes();
        p.displayValues();
        System.out.println(" ");
        p.displayColors();
    }
}
    

