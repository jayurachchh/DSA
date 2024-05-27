import java.util.*;

class Record {
    int number;
    String name;
    String address;
    Date birthDate;

    public Record(int number, String name, String address, Date birthDate) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }
}

class BirthDateComparator implements Comparator<Record> {
    @Override
    public int compare(Record r1, Record r2) {
        return r1.birthDate.compareTo(r2.birthDate);
    }
}

public class Data {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();

        // Add records to the list
        records.add(new Record(1, "કક્કડ લવનગી", "જનાર્દનભાઈ શિવાજી પાર્ક-વિમાનગર પાછળ, રાજકોટ-મો-૯૪૨૮૪-૭૭૬૭૭", new Date(1990, 11, 1)));
        records.add(new Record(2, "ઠકરાર કૃપા કલ્પક સંજય", "મેઈન રોડ,વિશાલ ડેરીની બાજુમાં,રાજયોગ એપાર્ટમેન્ટ ની નજીક, રાજકોટ.મો-૯૯૨૫૨-૦૬૯૮૯", new Date(1993, 10, 4)));
        records.add(new Record(3, "પાબારી પૂજા ભરતભાઈ", "શાંતિ નિકેતન-પાર્ક-૨,બ્લોક-ન-૩,૧૫૦ ફૂટ રીંગ,રામાપીર ચોક પાસે, ધરમનગર ની બાજુમાં,રાજકોટ મો-૯૬૩૮૯-૧૭૧૨૩", new Date(1992, 5, 8)));
        records.add(new Record(4, "અમલાણી અમી કિરીટકુમાર રિધ્ધિ-સિધ્ધિ", "સિંગલ સિનેમા પાસે,પોરબંદરમો-૯૪૨૮૦-૮૭૯૦૦ ", new Date(1999, 9, 25)));
        records.add(new Record(5, "પોપટ નેહલ પ્રવીણભાઈ અરીહંત", "સોસાયટી-GIDC-સામે,શનાળા રોડ.મોરબી-મો-૯૯૭૮૬-૭૨૪૬૭", new Date(1991, 7, 19)));
        records.add(new Record(6, "રાજા દિશા વિજયભાઈ રામકૃષ્ણ", "જેંક્શન પ્લોટ-જૈન ઉપાશ્રય સામે,બ્લોક-ન-બી-૧૦૨, રાજકોટ.મો-૭૪૦૫૦-૬૦૦૫૦", new Date(1998, 10, 29)));
        records.add(new Record(7, "ડો.ગણાત્રા હિરલ અશોકભાઈ શિવમ", "પ્રગતી સોસાયટી-રૈયા રોડ,રાજકોટ મો-૯૮૭૯૭-૩૯૬૯૦", new Date(1987, 8, 18)));
        records.add(new Record(8, "અમલાણી કૃપા દિલીપભાઈ ગોપાલપરા", "મેં.રોડ,,રાણાવાવ,જીલ્લો-પોરબંદર  સિંગલ સિનેમા પાસે,પોરબંદરમો-૯૪૨૮૦-૮૭૯૦૦ ", new Date(1996, 5, 15)));
        records.add(new Record(9, "પોપટ જાનકી હર્ષવર્ધન", "વાસણા રોડ,વડોદરા,મો-૬૩૫૨૦-૯૩૦૪૬", new Date(1993, 11, 17)));

        // Sort records based on birth date
        Collections.sort(records, new BirthDateComparator());

        // Print sorted records
        for (Record record : records) {
            System.out.println(record.number + "\t" + record.name + "\t" + record.address + "\t" + record.birthDate);
        }
    }
}
