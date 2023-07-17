package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {

    public Map<String, List<Entry>> parseLog(String log){
        Map<String, List<Entry>> entries = new HashMap<>();
        String[] logs = log.split("\n");
        for(String line : logs) {
            String ip = line.split(":")[0];
            Entry entry = createAndValidateEntry(line);
            fillEntries(entries,ip,entry);
        }
        return entries;
    }

    private Entry createAndValidateEntry(String line){
        if(line.split(":").length != 3) {
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }
        String ip = line.split(":")[0];
        LocalDate entryDate;
        try {
            entryDate = LocalDate.parse(line.split(":")[1]);
        } catch (DateTimeParseException e){
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
        String login = line.split(":")[2];
        return new Entry(ip,entryDate,login);
    }

    private void fillEntries(Map<String, List<Entry>> entries, String ip, Entry entry){
        if(entries.containsKey(ip)){
            List<Entry> list = entries.get(ip);
            list.add(entry);
            entries.put(ip,list);
        } else {
            List<Entry> entryList = new ArrayList<>();
            entryList.add(entry);
            entries.put(ip,entryList);
        }
    }
}
