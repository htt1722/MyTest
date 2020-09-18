public class Prime {
    public int sumPrimeForComputationSpeed(int number){
        int sum = 2;
        // skip all even numbers
        for(int i = 3; i <= number; i += 2){
            boolean flag = true;
            for(int j = 3; j <= Math.sqrt(i); j += 2){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
            }
        }
        return sum;
    }

    public int sumPrimeForReducingLoopingCount(int number){
        int sum = 2 + 3 + 5;
        // eliminate even Numbers, so the length is less than half
        int[] arr = new int[number / 2];
        int count = 0;
        // eliminate numbers that are divisible by 2/3/5
        for(int i = 6; i <= number; i++){
            boolean flag = true;
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                flag = false;
            }
            if(flag){
                arr[count] = i;
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            boolean flag = true;
            for (int j = 7; j <= Math.sqrt(arr[i]); j += 2) {
                if (0 == (arr[i]) % j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public int sumPrimeSimply(int number){
        int sum = 0;
        for(int i = 2; i <= number; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
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
