import java.io.IOException;

import com.squareup.okhttp.*;

public class APICall {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .header("Authorization", "MTE1NjA0MTEzMDY5ODM1MDY1Mg.GJ2gYm.cIcxjR9HRgaTqOHeyYy9h801CZ5H9QVYpY7jU4")
                .url("https://discord.com/api/v10/oauth2/applications/@me")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
