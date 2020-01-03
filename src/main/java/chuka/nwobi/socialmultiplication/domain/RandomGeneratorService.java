package chuka.nwobi.socialmultiplication.domain;

public interface RandomGeneratorService {

    /**
     * @return a randomly-generate factor, Always a number between 11 and 99*/

    int generateRandomFactor();
}
