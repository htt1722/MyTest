import org.junit.Test;

public class PrimeTest {
    @Test
    public void sum(){
        long startTime = System.currentTimeMillis();
        System.out.println("===sumPrimeForComputationSpeed===:" + new Prime().sumPrimeForComputationSpeed(200000));
        System.out.println("=======sumPrimeForComputationSpeed spend time========:" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("===sumPrimeForReducingLoopingCount===:" + new Prime().sumPrimeForReducingLoopingCount(200000));
        System.out.println("=======sumPrimeForReducingLoopingCount spend time========:" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("===sumPrimeSimply===:" + new Prime().sumPrimeSimply(200000));
        System.out.println("=======sumPrimeSimply spend time========:" + (System.currentTimeMillis() - startTime));
    }
}
