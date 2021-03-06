package apiGoogle;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;



import com.sun.net.ssl.HttpsURLConnection;

@SuppressWarnings("deprecation")
public class API {
	private void sendPost(String wavString) throws Exception {
	    String USER_AGENT = "Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/535.2 (KHTML, like Gecko) Chrome/15.0.874.121 Safari/535.2",
	    url = "https://www.google.com/speech-api/v2/recognize?output=json&lang=fr-FR&key=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw&client=chromium&maxresults=1&pfilter=2";

	    URL obj = new URL(url);
	    FlacEncoder flacEncoder = new FlacEncoder();
        File flacFile = new File("data/flac.flac");
        File waveFile = new File(wavString);
        flacEncoder.convertWaveToFlac(waveFile, flacFile);
        
      //  GoogleResponse googleResponse = getRecognizedDataForFlac(flacFile, maxResults, 44100);
        
        //Delete converted FLAC data
        //flacFile.delete();
	    @SuppressWarnings("deprecation")
	    URLConnection con =  (URLConnection) obj.openConnection();

	    // add reuqest header
	    ((HttpURLConnection) con).setRequestMethod("POST");
	    con.setRequestProperty("User-Agent", USER_AGENT);
	    //con.setRequestProperty("Content-Type", "audio/l16; rate=16000");
	    con.setRequestProperty("Content-Type", "audio/x-flac; rate=44100");
	    //con.setRequestProperty("Content-Type", "audio/x-wav; rate=16000");

	    con.setRequestProperty("AcceptEncoding", "gzip,deflate,sdch");

	    // Send post request "Content-Type", "audio/x-flac; rate=44100"
	    con.setDoOutput(true);
	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	    wr.write(Files.readAllBytes(Paths
	            .get("data/flac.flac")));
	    wr.flush();
	    wr.close();

	    int responseCode = ((HttpURLConnection) con).getResponseCode();
	    System.out.println("\nSending 'POST' request to URL : " + url);
	    System.out.println("Response Code : " + responseCode);

	    BufferedReader in = new BufferedReader(new InputStreamReader(
	            con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    // print result
	    System.out.println(response.toString());
	    String responseGoogle = response.toString();

	}
	public static void main(String[] args) throws Exception{
		API t = new API();
		t.sendPost("lctdata/0a.wav");
	}
}
