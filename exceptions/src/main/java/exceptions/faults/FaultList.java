package exceptions.faults;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaultList {


    public List<String> processLines(List<String> faultList) {
        List<String> faults = new ArrayList<>();
        boolean isValueError = false;
        boolean isDateError = false;
        if(faultList == null) {
            throw new IllegalArgumentException();
        }
        for(String text: faultList) {
            List<String> sections = new ArrayList<>(Arrays.asList(text.split(",")));
            if(sections.size() != 3){
                faults.add(sections.get(0));
                faults.add(ProcessingResult.WORD_COUNT_ERROR.getCode());
                continue;
            }
            try {
                Double.parseDouble(sections.get(1));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                faults.add(sections.get(0));
                faults.add(ProcessingResult.VALUE_ERROR.getCode());
                continue;
            }
            try {
                LocalDate.parse(sections.get(2));
            } catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
                faults.add(sections.get(0));
                faults.add(ProcessingResult.DATE_ERROR.getCode());
                continue;
            }
            if(isValueError && isDateError) {
                faults.add(ProcessingResult.VALUE_AND_DATE_ERROR.getCode());
            }
        }
        return faults;
    }


}
