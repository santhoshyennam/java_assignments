import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
public class CSVPart2 {
    
    static CSVRecord coldestHourInFile(CSVParser cp)
    {
        CSVRecord coldest=null;
        for(CSVRecord cr : cp)
        {
            if(coldest==null)
            coldest = cr;
            else
            {
                Double currentTemp = Double.parseDouble(cr.get("TemperatureF"));
                Double coldTemp =Double.parseDouble(coldest.get("TemperatureF"));
                if(currentTemp<coldTemp)
                coldest = cr;

            }
        }
        return coldest;
    }
    static void testColdestHourInFile() 
    {
        FileResource f = new FileResource();
        CSVParser cp = f.getCSVParser();
        CSVRecord record=coldestHourInFile(cp);
        System.out.println(record.get("TemperatureF")+" at"+record.get("TimeEST"));
    }

    static CSVRecord fileWithColdestTemperature()
    {
        CSVRecord mintemp = null;
        DirectoryResource dr = new DirectoryResource();
        for(File f:dr.selectedFiles())
        {
            FileResource file = new FileResource(f);
            CSVRecord coldTempRecord = coldestHourInFile(file.getCSVParser());
            if(mintemp==null)
            mintemp = coldTempRecord;
            else
            {
               
                Double currentTemp = Double.parseDouble(coldTempRecord.get("TemperatureF"));
                Double coldTemp =Double.parseDouble(mintemp.get("TemperatureF"));
                if(currentTemp<coldTemp)
                mintemp = coldTempRecord;

            }

        }
        return mintemp;
    }

    static CSVRecord lowestHumidityInFile(CSVParser parser)
    {
        CSVRecord low_humidity=null;
        for(CSVRecord cr : parser)
        {
            if(low_humidity==null)
            low_humidity = cr;
            else
            {
                Integer currentHumidity = Integer.parseInt(cr.get("Humidity"));
                Integer lowHumidity =Integer.parseInt(low_humidity.get("Humidity"));
                if(currentHumidity<lowHumidity)
                low_humidity = cr;

            }
        }
        return low_humidity;

    }
    static CSVRecord lowestHumidityInManyFiles()
    {
        CSVRecord min_humidity = null;
        DirectoryResource dr = new DirectoryResource();
        for(File f:dr.selectedFiles())
        {
            FileResource file = new FileResource(f);
            CSVRecord humidityRecord = lowestHumidityInFile(file.getCSVParser());
            if(min_humidity==null)
            min_humidity = humidityRecord;
            else
            {
               
                Double currentTemp = Double.parseDouble(humidityRecord.get("Humidity"));
                Double coldTemp =Double.parseDouble(min_humidity.get("Humidity"));
                if(currentTemp<coldTemp)
                min_humidity = humidityRecord;

            }

        }
        return min_humidity;

    }
    public static void main(String[] args) {
       // testColdestHourInFile();
       //CSVRecord record=fileWithColdestTemperature();
       CSVRecord record=lowestHumidityInManyFiles();
       System.out.println(record.get("Humidity")+" on "+record.get("DateUTC"));
    }
}
