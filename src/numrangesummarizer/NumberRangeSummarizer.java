package numrangesummarizer;

import java.util.Collection;

/**
 *
 * @author Lyle
 */
public interface NumberRangeSummarizer {

    String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";

    //collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);
}
