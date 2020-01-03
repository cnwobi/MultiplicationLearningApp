package chuka.nwobi.socialmultiplication.domain;

import lombok.*;

/**
 * Identifies the attempt from a {@link User} to solve
 * a {@link Multiplication}*/
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class MultiplicationResultAttempt {

    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    MultiplicationResultAttempt(){
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }
}
