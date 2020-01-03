package chuka.nwobi.socialmultiplication.service;

import chuka.nwobi.socialmultiplication.domain.Multiplication;
import chuka.nwobi.socialmultiplication.domain.MultiplicationResultAttempt;
import chuka.nwobi.socialmultiplication.service.MultiplicationService;
import chuka.nwobi.socialmultiplication.service.RandomGeneratorService;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGeneratorService randomGeneratorService;


    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();

        return new Multiplication(factorA,factorB);

    }

    @Override
    public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
        return resultAttempt.getResultAttempt() == resultAttempt.getMultiplication()
                .getFactorA() * resultAttempt.getMultiplication().getFactorB();
    }
}
