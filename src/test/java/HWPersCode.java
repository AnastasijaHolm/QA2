import org.junit.jupiter.api.Test;


public class HWPersCode {
    @Test

    public void PersonalCodeTest() {
        String persCode = "251191 - 10989";
        String day = DayConvertion(persCode.substring(0, 2));
        String month = MonthConvertion(persCode.substring(2, 4));
        int yearInt = Integer.valueOf(persCode.substring(4, 6));
        String yearStr = persCode.substring(4, 6);
        String year = YearConvertion(yearInt, yearStr);
        System.out.println("Your birth date is: " + day + " of " + month + " " +  year + " Year");
    }

    public String DayConvertion(String day) {
        if(day.equals("01")) return "1st";
        else if(day.equals("02")) return "2nd";
        else if(day.equals("03")) return "3rd";
        else if(day.equals("04")) return "4th";
        else if(day.equals("05")) return "5th";
        else if(day.equals("06")) return "6th";
        else if(day.equals("07")) return "7th";
        else if(day.equals("08")) return "8th";
        else if(day.equals("09")) return "9th";
        else if(day.equals("10")) return "10th";
        else if(day.equals("11")) return "11th";
        else if(day.equals("12")) return "12th";
        else if(day.equals("13")) return "13th";
        else if(day.equals("14")) return "14th";
        else if(day.equals("15")) return "15th";
        else if(day.equals("16")) return "16th";
        else if(day.equals("17")) return "17th";
        else if(day.equals("18")) return "18th";
        else if(day.equals("19")) return "19th";
        else if(day.equals("20")) return "20th";
        else if(day.equals("21")) return "21st";
        else if(day.equals("22")) return "22nd";
        else if(day.equals("23")) return "23rd";
        else if(day.equals("24")) return "24th";
        else if(day.equals("25")) return "25th";
        else if(day.equals("26")) return "26th";
        else if(day.equals("27")) return "27th";
        else if(day.equals("28")) return "28th";
        else if(day.equals("29")) return "29th";
        else if(day.equals("30")) return "30th";
        else if(day.equals("31")) return "31st";
        else return "Something went wrong, day was entered incorrectly";
    }

    public String MonthConvertion(String month) {
        if(month.equals("01")) return "January";
        else if(month.equals("02")) return "February";
        else if(month.equals("03")) return "March";
        else if(month.equals("04")) return "April";
        else if(month.equals("05")) return "May";
        else if(month.equals("06")) return "June";
        else if(month.equals("07")) return "July";
        else if(month.equals("08")) return "August";
        else if(month.equals("09")) return "September";
        else if(month.equals("10")) return "October";
        else if(month.equals("11")) return "November";
        else if(month.equals("12")) return "December";
        else return "Something went wrong, the month was entered incorrectly";
        }

    public String YearConvertion(int yearInt, String yearString)
    {
        if (yearInt > 20 )
        {
            String year = "19" + yearString;
            return year;
        }
        else
        {
            String year = "20" + yearString;
            return year;
        }
    }
}