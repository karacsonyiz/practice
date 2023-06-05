package exceptions.faults;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaultList {

    public List<String> processLines(List<String> faultList) {
        if (faultList == null) {
            throw new IllegalArgumentException();
        }
        List<String> faults = new ArrayList<>();
        for (String text : faultList) {
            String result = scanLine(text);
            if(!result.equals("NO_ERROR") && !result.equals("COMMENT")) {
                faults.add(result);
            }
        }
        return faults;
    }

    private String scanLine(String text) {
        boolean doubleParseError = false;
        boolean dateParseError = false;
        String result;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd.");
        List<String> sections = new ArrayList<>(Arrays.asList(text.split(",")));
        if(sections.size() != 3) {
            result = sections.get(0) + "," + ProcessingResult.WORD_COUNT_ERROR.getCode();
            return result;
        }
        try {
            Integer.parseInt(sections.get(0));
        } catch (NumberFormatException e) {
            result = "COMMENT";
            return result;
        }
        try {
            Double.parseDouble(sections.get(1));
        } catch (NumberFormatException e) {
            doubleParseError = true;
        }
        try {
            formatter.parse(sections.get(2));
        } catch (ParseException e) {
            dateParseError = true;
        }
        result = parseExceptionHandler(dateParseError,doubleParseError,sections.get(0));
        return result;
    }

    private String parseExceptionHandler(boolean dateParseError, boolean doubleParseError,String lineNum) {
        String result = "NO_ERROR";
        if(doubleParseError && dateParseError) {
            result = lineNum + "," + ProcessingResult.VALUE_AND_DATE_ERROR.getCode();
            return result;
        }
        if(doubleParseError ) {
            result = lineNum + "," + ProcessingResult.VALUE_ERROR.getCode();
        }
        if(dateParseError) {
            result = lineNum + "," + ProcessingResult.DATE_ERROR.getCode();
        }
        return result;
    }
}


