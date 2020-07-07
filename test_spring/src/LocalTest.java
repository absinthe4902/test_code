import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created By Seungmin lee
 * User: dnx
 * Date: 2020-03-31
 * Description:
 */
public class LocalTest {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"status\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"city\": \"Tol'yatti\",\n" +
                "        \"state\": \"Samara\",\n" +
                "        \"country\": \"Russia\",\n" +
                "        \"location\": {\n" +
                "            \"type\": \"Point\",\n" +
                "            \"coordinates\": [\n" +
                "                49.3461,\n" +
                "                53.5303\n" +
                "            ]\n" +
                "        },\n" +
                "        \"current\": {\n" +
                "            \"weather\": {\n" +
                "                \"ts\": \"2020-04-02T08:00:00.000Z\",\n" +
                "                \"tp\": 6,\n" +
                "                \"pr\": 1008,\n" +
                "                \"hu\": 38,\n" +
                "                \"ws\": 9,\n" +
                "                \"wd\": 240,\n" +
                "                \"ic\": \"02d\"\n" +
                "            },\n" +
                "            \"pollution\": {\n" +
                "                \"ts\": \"2020-04-02T08:00:00.000Z\",\n" +
                "                \"aqius\": 37,\n" +
                "                \"mainus\": \"p2\",\n" +
                "                \"aqicn\": 13,\n" +
                "                \"maincn\": \"p2\"\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}
