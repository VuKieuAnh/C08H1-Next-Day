import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Month1Year2021(){
        //chuẩn bị dữ liệu
        int dayTest =1;
        int monthTest =1;
        int yearTest =2021;
        String expected = "2/1/2021";
        //thực thi phương thức
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        //so sánh kết quả mong muốn với kết quả chạy đc
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Month1Year2021(){
        int dayTest =31;
        int monthTest =1;
        int yearTest =2021;
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        String expected = "1/2/2021";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 30/4/2021")
    void testDay30Month4Year2021(){
        int dayTest =30;
        int monthTest =4;
        int yearTest =2021;
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        String expected = "1/5/2021";
        assertEquals(expected, result);
    }

}