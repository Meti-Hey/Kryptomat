public class Polybius extends Kryptomat {

    private int alphabetQuadratInt [][];
    private String alphabetQuadrat [][];

    public Polybius(){

}
private void bfmS(){

}

public void verschluesseln(){
        this.alphabetQuadratInt = new int[5][5];
        alphabetQuadrat = new String[5][5];
        alphabetQuadrat[1][1]="A";
        alphabetQuadrat[2][1]="B";
        alphabetQuadrat[3][1]="C";
        alphabetQuadrat[4][1]="D";
        alphabetQuadrat[5][1]="E";

        alphabetQuadrat[1][2]="F";
        alphabetQuadrat[2][2]="G";
        alphabetQuadrat[3][2]="H";
        alphabetQuadrat[4][2]="I";
        alphabetQuadrat[5][2]="K";

        alphabetQuadrat[1][3]="L";
        alphabetQuadrat[2][3]="M";
        alphabetQuadrat[3][3]="N";
        alphabetQuadrat[4][3]="O";
        alphabetQuadrat[5][3]="P";

        alphabetQuadrat[1][4]="Q";
        alphabetQuadrat[2][4]="R";
        alphabetQuadrat[3][4]="S";
        alphabetQuadrat[4][4]="T";
        alphabetQuadrat[5][4]="U";

        alphabetQuadrat[1][5]="V";
        alphabetQuadrat[2][5]="W";
        alphabetQuadrat[3][5]="X";
        alphabetQuadrat[4][5]="Y";
        alphabetQuadrat[5][5]="Z";
        int h = 65;
        for(int i = 0;i < alphabetQuadrat.length();i++){
            for (int j = 0; j <alphabetQuadrat.length[i] ; i++){
                this.alphabetQuadratInt[i][j]=h;
                h++;
                System.out.println(alphabetQuadrat.length[i][j]);
            }

        }
        System.out.println();
    }



public void entschluesseln(){

}


}
