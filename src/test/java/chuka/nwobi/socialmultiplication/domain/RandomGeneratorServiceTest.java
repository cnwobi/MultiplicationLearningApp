package chuka.nwobi.socialmultiplication.domain;

import chuka.nwobi.socialmultiplication.service.RandomGeneratorService;
import chuka.nwobi.socialmultiplication.service.RandomGeneratorServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;



public class RandomGeneratorServiceTest {
    @Autowired
private RandomGeneratorService randomGeneratorService;
    @Before
    public void setUp() throws Exception {
randomGeneratorService = new RandomGeneratorServiceImpl();
    }

@Test
    public void generateRandomFactorIsBetweenExpectedLimits() throws Exception{
        List<Integer> randomFactors = IntStream.range(0,1000)
                .map(i -> randomGeneratorService.generateRandomFactor())
                .boxed().collect(Collectors.toList());
        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11,100)
        .boxed().collect(Collectors.toList()));
            }


}