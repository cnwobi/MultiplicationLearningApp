package chuka.nwobi.socialmultiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Stores information to identify the user*/

@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public final class User {


    private final String alias;

    protected User(){
        alias = null;
    }
}
