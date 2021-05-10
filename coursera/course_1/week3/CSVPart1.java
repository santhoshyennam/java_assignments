import edu.duke.*;
import org.apache.commons.csv.*;
class CSVPart1
{

    static void tester()
    {
        FileResource f = new FileResource();
        CSVParser cp = f.getCSVParser();
        //countryInfo(cp, "India");
        //cp = f.getCSVParser();
        //listExportersTwoProducts(cp, "vehicles", "chemicals");
        //cp = f.getCSVParser();
        //System.out.println(numberOfExporters(cp,"vehicles"));
        bigExporters(cp, "$10,000");

    }

    static void listExportersTwoProducts(CSVParser cv,String e1,String e2)
    {
        for(CSVRecord cr : cv)
        {
            String exports = cr.get("Exports");
            if(exports.contains(e1) && exports.contains(e2))
            {
                System.out.println(cr.get("Country")+" : "+cr.get("Exports")+" : "+cr.get("Value")); 
            }
        }

    }

    static  int numberOfExporters(CSVParser cp,String exportItem){
        int count=0;
        for(CSVRecord record:cp){
            String exports = record.get("Exports");
            if(exports.contains(exportItem)){
                count+=1;
            }
        }
        return count;
    }


    static void bigExporters(CSVParser cp, String amount){
        String rowAmount;
        String ans;
        int count=0;
        for (CSVRecord record:cp) {
            rowAmount = record.get("Value");
            if(rowAmount.length() > amount.length()){
                ans = record.get("Country")+":"+record.get("Value");
                System.out.println("Exporter: "+ans);
            }
        }
    }

    static void countryInfo(CSVParser cp,String country)
    {
        for(CSVRecord cr : cp)
        {
            String x = cr.get("Country");
            if(x.toLowerCase().equals(country.toLowerCase()))
            {
                System.out.println(x+" : "+cr.get("Exports")+" : "+cr.get("Value"));
            }
        }
    }
    public static void main(String[] args) {
       
        tester();
       
    }
}