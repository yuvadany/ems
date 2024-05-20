package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        OddorEven();
        removeDuplicate();
        frequencyOfCharacters();
        frequencyOfEachElement();
        decimalsReverseOrder();
        prefixSuffix();
        numbersMultiple5();
        maxMin();
        mergingArray();
        mergingArrayOhneDuplicate();
        maximum3Maximum();
        anagramsText();
        sumOfAllDigits();
        LargestNumberOfIntArray();
        sortStrings();
        sumAverage();
        commonElements();
        reverseJavaString();
        sumOf10Naturals();
        reverseAnIntegerArray();
        printFirst10EvenNumbers();
        mostRepeatedElement();
        palindrome();
        stringWithNumber();
        duplicateElement();
        duplicateCharacter();
        firstRepeatedCharacter();
        firstNonRepeatedCharacter();
        fibonacciSeries();
        first10OddNumbers();
        lastElementOfArray();
        ageOfApersonInYears();
    }

    public static void OddorEven() {
        System.out.println("1 -- OddorEven --  ");
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();

        for (Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("--------------");

            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list) {
                System.out.println(i);
            }

        }
    }

    public static void removeDuplicate() {
        System.out.println("2 -- removeDuplicate --  ");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.print("-- Input String --  ");
        System.out.print(listOfStrings);
        System.out.println("");
        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.print("2 -- output String --  ");
        System.out.print(uniqueStrngs);
    }

    public static void frequencyOfCharacters() {
        System.out.println("3 -- frequency of Each Charactetr --  ");
        String inputString = "Java Concept Of The Day";
        System.out.print("-- Input String --  ");
        System.out.println(inputString);
        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }

    public static void frequencyOfEachElement() {
        System.out.println("4 -- frequencyOfEachElement --  ");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        System.out.print(" -- Input String --  ");
        System.out.println(stationeryList);
        Map<String, Long> stationeryCountMap =
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationeryCountMap);
    }

    public static void decimalsReverseOrder() {
        System.out.println("5 -- decimalsReverseOrder --  ");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        System.out.print(" -- Input String --  ");
        System.out.println(decimalList);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();
        decimalList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public static void prefixSuffix() {
        System.out.println("6 -- join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter? --  ");
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.print(" -- Input String --  ");
        listOfStrings.stream().forEach(System.out::println);
        System.out.print(" -- Output String --  ");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);
    }

    public static void numbersMultiple5() {
        System.out.println("7 -- numbersMultiple5 --  ");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 125);
        System.out.print(" -- Input String --  ");
        listOfIntegers.stream().forEach(System.out::println);
        System.out.println(" --  ");
        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
    }

    public static void maxMin() {
        System.out.println("8 -- maxMin Of number list --  ");
        List<Integer> listOfIntegers = Arrays.asList(45, 7, 12, 56, 67, 15, 24, 75, 31, 89, 256);
        System.out.print(" -- Input String --  ");
        listOfIntegers.stream().forEach(System.out::println);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : " + max);
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Element : " + min);
    }

    public static void mergingArray() {
        System.out.println("9 -- Merging Array --  ");
        int[] a = new int[]{4, 2, 3, 7, 9, 1, 786};
        int[] b = new int[]{8, 3, 89, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

    public static void mergingArrayOhneDuplicate() {
        System.out.println("10 -- Merging Array --  ");
        int[] a = new int[]{4, 2, 3, 9, 7, 1, 786};
        int[] b = new int[]{8, 3, 89, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));
    }

    public static void maximum3Maximum() {
        System.out.println("11 -- maximum3Maximum --  ");
        List<Integer> listOfIntegers = Arrays.asList(2, 7, 908, 45, 12, 56, 1, 15, 24, 75, 31, 89);
        //3 minimum Numbers
        System.out.println("-----------------");
        System.out.println("Minimum 3 Numbers");
        System.out.println("-----------------");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        //3 Maximum Numbers
        System.out.println("-----------------");
        System.out.println("Maximum 3 Numbers");
        System.out.println("-----------------");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }

    public static void anagramsText() {
        System.out.println("12 -- Anagrams Text --  ");
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }

    public static void sumOfAllDigits() {
        System.out.println("13 -- sumOfAllDigits--  ");
        int i = 15623;
        System.out.println("input " + i);
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);
    }


    public static void LargestNumberOfIntArray() {
        System.out.println("14 -- LargestNumberOfIntArray --  ");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("input ");
        listOfIntegers.stream().forEach(System.out::println);
        Integer secondLargestNumber = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondLargestNumber is ");
        System.out.println(secondLargestNumber);
    }


    public static void sortStrings() {
        System.out.println("15 -- Given a list of strings, sort them according to increasing order of their length --  ");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println("input ");
        System.out.println(listOfStrings);
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    public static void sumAverage() {
        System.out.println("16 --Given an integer array, find sum and average of all elements --  ");
        int[] a = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println("input ");
        Arrays.stream(a).forEach(System.out::println);
        int sum = Arrays.stream(a).sum();
        System.out.println(" Sum = " + sum);
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average = " + average);
    }

    public static void commonElements() {
        System.out.println("17 --Given an integer array, find sum and average of all elements --  ");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 89, 56, 28);
        System.out.println(" input-1 ");
        list1.stream().forEach(System.out::println);
        System.out.println(" input-2 ");
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 89, 34);
        list2.stream().forEach(System.out::println);
        System.out.println(" Result of common elements");
        list1.stream().filter(list2::contains).forEach(System.out::println);
    }

    public static void reverseJavaString() {
        System.out.println("18 --reverse Java String --  ");
        String str = "Java Concept Of The Day";
        System.out.println(" input-1 " + str);
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reversedStr);
    }

    public static void sumOf10Naturals() {
        System.out.println("19 -- sum of first 10 natural numbers --  ");
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }

    public static void reverseAnIntegerArray() {
        System.out.println("20 -- reverseAnInteger --  ");
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void printFirst10EvenNumbers() {
        System.out.println("21 -- printFirst10EvenNumbers --  ");
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }

    public static void mostRepeatedElement() {
        System.out.println("22 -- most repeated element in an array --  ");
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        System.out.println("input = " + listOfStrings);
        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most Frequent Element : " + mostFrequentElement.getKey());
        System.out.println("Count : " + mostFrequentElement.getValue());
    }


    public static void palindrome() {
        System.out.println("23 -- Palindrome --  ");
        String str = "ROTATOR";

        boolean isItPalindrome = IntStream.range(0, str.length() / 2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (isItPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static void stringWithNumber() {
        System.out.println("24 -- Given a list of strings, find out those strings which start with a number --  ");
        List<String> listOfStrings = Arrays.asList("One", "wo", "hree", "3Four", "five", "5Six");
        System.out.println("Input = " + listOfStrings);
        listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }

    public static void duplicateElement() {
        System.out.println("25 --  extract duplicate elements from an array --  ");
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 1111, 555, 333, 777, 222);
        System.out.println("Input = " + listOfIntegers);
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = listOfIntegers.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }


    public static void duplicateCharacter() {
        System.out.println("26 -- duplicate characters in a string --  ");
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(" input = " + inputString);
        Set<String> uniqueChars = new HashSet<>();
        Set<String> duplicateChars =
                Arrays.stream(inputString.split(""))
                        .filter(ch -> !uniqueChars.add(ch))
                        .collect(Collectors.toSet());
        System.out.println(duplicateChars);
    }

    public static void firstRepeatedCharacter() {
        System.out.println("27 --  Find first repeated character in a string --  ");
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(" input = " + inputString);
        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(firstRepeatedChar);
    }


    public static void firstNonRepeatedCharacter() {
        System.out.println("28 --  Find first non-repeated character in a string --  ");
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(" input = " + inputString);
        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstNonRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(firstNonRepeatedChar);
    }

    public static void fibonacciSeries() {
        System.out.println("29 -- FibonacciSeries max 5 elements --  ");
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(5)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }


    public static void first10OddNumbers() {
        System.out.println("\n (30) -- first 10 Odd Numbers --  ");
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }


    public static void lastElementOfArray() {
        System.out.println("\n (32) -- last Element Of an Array --  ");
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six","null");
        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);
    }

    public static void ageOfApersonInYears() {
        System.out.println("\n (32) -- Find the age of a person in years if the birthday has given -- ");
        LocalDate birthDay = LocalDate.of(1987, 10, 26);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }


}

