package maplexo.leetcode.journey;
class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int numberOfStates = minutesToTest / minutesToDie + 1;
        int numberOfPigs = 0;
        while (Math.pow(numberOfStates, numberOfPigs) < buckets) {
            numberOfPigs++;
        }
        return numberOfPigs;
    }
}

// question 458 poor pigs
//q-bit problem