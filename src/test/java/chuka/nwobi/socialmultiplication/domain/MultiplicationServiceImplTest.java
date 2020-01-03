package chuka.nwobi.socialmultiplication.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {
private MultiplicationServiceImpl multiplicationService ;
@Mock
private RandomGeneratorService randomGeneratorService;

private User user;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        multiplicationService = new MultiplicationServiceImpl(randomGeneratorService);
         user = new User("john_doe");
    }



    @Test
    public void checkWrongAttemptTest() {
        //given
        Multiplication multiplication = new Multiplication(50,60);

        MultiplicationResultAttempt attempt =
                new MultiplicationResultAttempt(user,multiplication,3010);
        //when
        boolean attemptResult = multiplicationService.checkAttempt(attempt);

        //assert
        assertThat(attemptResult).isFalse();
    }

    @Test
    public void checkCorrectAttemptTest() {

        //given including user
        Multiplication multiplication = new Multiplication(50,60);
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user,multiplication,3000);
        //when
        boolean attemptResult = multiplicationService.checkAttempt(attempt);

        //assert
        assertThat(attemptResult).isTrue();
    }
}