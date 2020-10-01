import java.util.LinkedList;

public class Polynomial {

    class Term{ //Term class, coef and exponent data fields as requested - inner class
        public int coef;
        public int exponent;

        public Term(int coef, int exponent){ //Term constructor
            this.coef = coef;
            this.exponent = exponent;
        }

        public String toString(){ //Works without @Override tag - toString w/format
            if (exponent == 0){
                return coef + "";
            } else if (exponent == 1){
                return coef + "x";
            } else {
                return coef + "x^" + exponent;
            }
        }
    }

    public String toString(){ //Wording in prompt unclear, 2 toStrings developed intentionally
        String s = "";

        for(Term t: terms){ //Iterates through terms, appending message string 's'
            if(!s.isEmpty()){
                s = s + " + ";
            }
            s += t.toString();
        }

        return s;
    }

    private LinkedList<Term> terms = new LinkedList<>(); //LinkedList 'terms' with Term list objects

    void addPoly(Polynomial other){ //addPoly method, based on insert, read further
        for(Term t: other.terms){
            insert(t.coef, t.exponent); //Addition actually happens in insert method, not addPoly
        }
    }

    void readPoly(String s) { //reads in Term/s to terms list for Polynomial object
        String tokens[] = s.split("\\+"); //split function isolates terms into new entries by specific char

        for (String term : tokens) {

            String termTokens[] = term.split("x");
            int coef = 1;
            int exponent = 0;

            if(term.contains("x")) { //gets exponent value of '1' if there is no number following '^' character
                exponent = 1;
            }

            termTokens[0] = termTokens[0].replace(" ", "").trim();
            if (!termTokens[0].isEmpty()) {
                coef = Integer.parseInt(termTokens[0]); //parseInt returns int from String
            }

            if (termTokens.length == 2){
                termTokens[1] = termTokens[1].replace(" ", "").replace("^", "").trim();

                if(!termTokens[1].isEmpty())
                    exponent = Integer.parseInt(termTokens[1]); //stores int
                }

                insert(coef, exponent);
            }
}

    private void insert(int coef, int exponent) {
        if (terms.isEmpty()) { //fills terms with passed arguments if terms empty
            terms.add(new Term(coef, exponent));
        } else { //if terms not empty
            int i = 0;
            while (i < terms.size()){ //loops through terms list

                if (terms.get(i).exponent < exponent) { //checks if passed value is larger than exponent in terms
                    terms.add(i, new Term(coef, exponent)); //adds term to list without math
                    return;
                }
                if (terms.get(i).exponent == exponent) { //if == exponent, adds coefficients
                    terms.get(i).coef += coef;
                    return;
                }
                i++;
            }

            terms.add(new Term(coef, exponent)); //appends terms list with new Term on root object
        }
    }
    
    Polynomial multiply(Polynomial other){ //This was difficult!
        int i = 0;
        int j = 0;
        int newCoef;
        int newExponent;
        Polynomial p_row[] = new Polynomial[20];
        
        
        for(Term t: other.terms){ //terms of polynomial passed as argument
            p_row[j] = new Polynomial();
            for(Term u: terms) { //terms of root polynomial object
                newCoef = t.coef * u.coef; //Performs operations on each pair of terms
                newExponent = t.exponent + u.exponent;
                p_row[j].terms.add(new Term(newCoef, newExponent)); //Adds new Polynomial "row" for each new terms list
                i++;                                                //To be added at the end for a final, simplified Polynomial
            }
            if(j > 0){
                p_row[0].addPoly(p_row[j]);
            }
            j++;
        }
        return p_row[0];
    }
        
public static void main(String args[]) {
    //Output from Project 2
    Polynomial p1 = new Polynomial();
    p1.readPoly("3x + 3x^4 + 2x^2 + 7");

    Polynomial p2 = new Polynomial();
    p2.readPoly("2x^3 + -5x + 5");

    System.out.println("+++POLYNOMIAL ADDITION+++\n");
    System.out.println("        " + p1);
    System.out.println("+             " + p2);
    System.out.println("____________________________\n");
                
    p1.addPoly(p2);
    System.out.println(p1 + "\n");
    
    //Output from Project 3
    Polynomial p3 = new Polynomial();
    p3.readPoly("3x + 3x^4 + 2x^2 + 7");

    Polynomial p4 = new Polynomial();
    p4.readPoly("2x^3 + -5x + 5");
    
    System.out.println("===POLYNOMIAL MULTIPLICATION===\n");
    System.out.println("        " + p3);
    System.out.println("X             " + p4);
    System.out.println("____________________________\n");
    
    Polynomial multiResult = p3.multiply(p4);
    System.out.println(multiResult);
    }
}