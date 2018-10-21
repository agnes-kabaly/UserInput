public class Main {

    public static void main(String[] args) {

        ReadingUserInput readingUserInput = new ReadingUserInput();
        //readingUserInput.sumTenNumber();

        MinAndMaxInput minAndMaxInput = new MinAndMaxInput();
        //minAndMaxInput.minAndMaxInputChallenge();

        SortIntegers sortIntegers = new SortIntegers();
        int[] userInputArray = sortIntegers.getIntegers(5);
        int[] sortedArray = sortIntegers.sortArray(userInputArray);
        sortIntegers.printArray(sortedArray);

    }

}
