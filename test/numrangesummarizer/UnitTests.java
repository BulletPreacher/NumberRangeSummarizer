package numrangesummarizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

public class UnitTests {

    String s1 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
    String ExpectedResult = "1, 3, 6-8, 12-15, 21-24, 31";
    String s3 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
    List<Integer> ListBefore = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));

    @Test
    public void test1() {
        NumRangeSummarizer collectMethod = new NumRangeSummarizer();
        Collection<Integer> result = collectMethod.collect(s1);
        Assert.assertEquals(result, collectMethod.collect(s3));
    }

    @Test
    public void test2() {
        NumRangeSummarizer summarizeMethod = new NumRangeSummarizer();
        String result = summarizeMethod.summarizeCollection(ListBefore);
        Assert.assertEquals(result, ExpectedResult);
    }
}
