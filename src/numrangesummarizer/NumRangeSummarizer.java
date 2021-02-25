package numrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Lyle
 */
public class NumRangeSummarizer implements NumberRangeSummarizer {

    public static void main(String[] args) {
        NumRangeSummarizer InterfaceObj = new NumRangeSummarizer();
        Collection<Integer> list = new ArrayList<>();
        list = InterfaceObj.collect(input);
        String sample = list.toString();
        System.out.println("Sample Input: " + sample.substring(1, sample.length() - 1));
        System.out.println("Result: " + InterfaceObj.summarizeCollection(list));
    }

    @Override
    public Collection<Integer> collect(String input) {
        String str[] = input.split(",");
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < str.length; i++) {
            intList.add(Integer.parseInt(str[i]));
        }
        return intList;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        ArrayList<Integer> newList = new ArrayList<>(input);
        StringBuilder sb = new StringBuilder();
        int previous = newList.get(0), start = previous;
        for (int next : newList.subList(1, newList.size())) {
            if (previous + 1 != next) {
                appendRange(sb, start, previous).append(", ");
                start = next;
            }
            previous = next;
        }
        String result = appendRange(sb, start, previous).toString();
        return result;
    }

    private static StringBuilder appendRange(StringBuilder sb, int start, int previous) {
        sb.append(start);
        if (start != previous) {
            sb.append(previous - start > 1 ? "-" : ", ").append(previous);
        }
        return sb;
    }

}
