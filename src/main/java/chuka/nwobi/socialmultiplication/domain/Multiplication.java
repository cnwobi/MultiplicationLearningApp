package chuka.nwobi.socialmultiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public final class Multiplication {
    /*
    * This class represents a multiplication in our application*/

    private final int factorA;
    private final int factorB;



    Multiplication(){
        this(0,0);
    }


    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;

    }




}
