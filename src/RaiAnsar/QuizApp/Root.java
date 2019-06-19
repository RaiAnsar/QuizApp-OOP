package RaiAnsar.QuizApp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Root {

    @SerializedName("resxponse_code")
    @Expose
    private Integer resxponseCode;
    @SerializedName("results")
    @Expose
    private List<Results> results = null;

    public Integer getResxponseCode() {
        return resxponseCode;
    }

    public void setResxponseCode(Integer resxponseCode) {
        this.resxponseCode = resxponseCode;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

}